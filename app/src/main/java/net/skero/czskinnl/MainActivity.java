package net.skero.czskinnl;

import android.app.*;
import android.os.*;
import android.view.View;
import android.content.Intent;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
	
	
	
	public void onWebPages(View v){

		//Toast.makeText(this,"Button",Toast.LENGTH_LONG).show();
		//this.startActivity(Intent.ACTION_MAIN);

		//super.startActivity(new aboutActivity());

		Intent i = new Intent(this,webpagesActivity.class);
		startActivity(i);

	}
	
	

	public void onAbout(View v){
		
		Intent i = new Intent(this,aboutActivity.class);
		startActivity(i);

	}
	
	
}
