package net.skero.czskinnl;

import android.app.*;
import android.os.*;
import android.view.View;
import android.content.Intent;

//import android.support.v4.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.*;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.widget.Button;


public class MainActivity extends AppCompatActivity 
{
	Fragment f_start = new startFragment();
	Fragment f_settings = new settingsFragment();
	Fragment f_info = new infoFragment();
	Fragment f_about = new aboutFragment();
	
	FragmentManager f_manager;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		f_manager = getFragmentManager();
		
		/*
		FragmentTransaction ft = f_manager.beginTransaction();
		ft.replace(R.id.content_frame, f_start);
		ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
		ft.addToBackStack(null);
		//ft.setTransitionStyle(ft.TRANSIT_FRAGMENT_FADE);
		ft.commit();
		*/
		setFragment(f_start);
		
		//Fragment f = new startFragment();
		
		
		Toolbar t = (Toolbar) findViewById(R.id.toolbar);
	
		setSupportActionBar(t);
		
		
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
			case R.id.main_menu_start:
				setFragment(f_start);
				//f_manager.beginTransaction().replace(R.id.content_frame, f_start).commit();
				return true;
				
			case R.id.main_menu_info:
				setFragment(f_info);
				//f_manager.beginTransaction().replace(R.id.content_frame, f_info).commit();
				return true;
				
			case R.id.main_menu_settings:
					setFragment(f_settings);
				
					//FragmentManager fm = getFragmentManager();

					//f_manager.beginTransaction().replace(R.id.content_frame, f_settings).commit();
					return true;
				
			case R.id.main_menu_about:
				{
					setFragment(f_about);
					//Intent i = new Intent(this, aboutActivity.class);
					//startActivity(i);

					return true;
				}


		}
		// TODO: Implement this method
		return super.onOptionsItemSelected(item);
	}







	public void on_btn_start(View v)
	{
		setFragment(f_start);
	}


	public void onWebPages(View v)
	{

		//Toast.makeText(this,"Button",Toast.LENGTH_LONG).show();
		//this.startActivity(Intent.ACTION_MAIN);

		//super.startActivity(new aboutActivity());

		Intent i = new Intent(this, webpagesActivity.class);
		startActivity(i);
	}


	public void onForum(View v)
	{
		Intent i = new Intent(this, forumActivity.class);
		startActivity(i);
	}


	public void onAbout(View v)
	{
		Intent i = new Intent(this, aboutActivity.class);
		startActivity(i);
	}

	public void onMainButton(View v)
	{
		Button b = (Button)v;
		switch(b.getId())
		{
			case R.id.main_button_start:
				setFragment(f_start);
				break;
				
			case R.id.main_button_info:
				setFragment(f_info);
				break;
				
			case R.id.main_button_forum:
				setFragment(f_about);
				break;
				
		}
		
	}
	
	public void setFragment(Fragment f)
	{
		//return;
		//FragmentTransaction ft = f_manager.beginTransaction();
		//ft.replace(R.id.content_frame, f);
		//ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
		//ft.addToBackStack(null);
		//ft.setTransitionStyle(ft.TRANSIT_FRAGMENT_FADE);
		//ft.commit();
		
		f_manager.beginTransaction().replace(R.id.content_frame, f).commit();
		
		
	}

}
