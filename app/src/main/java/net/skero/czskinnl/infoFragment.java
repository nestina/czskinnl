package net.skero.czskinnl;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import android.webkit.WebView;

public class infoFragment extends Fragment
{

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		//View view = inflater.inflate(R.layout.info, container, false);
		//return view;
		
		
		WebView w = new WebView(getActivity());

        //super.onCreate(savedInstanceState);
        //setContentView(w);

		//w.loadUrl("http://www.skero.net/");
		w.loadUrl("file/://android_res/raw/about.htm");
		return w;
		
	}


}
