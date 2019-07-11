package com.ruguethedeveloper.alcphase1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {
    //Initialize the WebView
    WebView aboutALCWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        //Reference to the WebView
        aboutALCWebView = findViewById(R.id.about_alc_webview);

        //create an instance of the new WebViewClient for the WebView
        aboutALCWebView.setWebViewClient(new WebViewClient(){

            //Overrides onReceivedSslError which helps Ignore SSL certificate errors
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });
        //loads the page
        aboutALCWebView.loadUrl("https://andela.com/alc/");
    }

}
