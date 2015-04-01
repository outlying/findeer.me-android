package com.antyzero.findeerme;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.webkit.WebView;


public class MainActivity extends ActionBarActivity {

    private WebView webView;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        webView = (WebView) findViewById( R.id.webView );

        webView.loadUrl( "http://findeer.me/" );
    }
}
