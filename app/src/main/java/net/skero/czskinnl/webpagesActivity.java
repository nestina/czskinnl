package net.skero.czskinnl;

import android.app.*;
import android.os.*;
import android.webkit.WebView;

public class webpagesActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		WebView w = new WebView(this);
		
        super.onCreate(savedInstanceState);
        setContentView(w);
		
		w.loadUrl("http://www.skero.net/");
    }


	


}
