package sg.edu.rp.c346.healthylifestylelearningguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class strengthWebPage extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strength_web_page);
        wv = (WebView)findViewById(R.id.webView);


        Intent intentReceived = getIntent();
        String url = intentReceived.getStringExtra("website");
        wv.setWebViewClient(new WebViewClient());

        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        wv.loadUrl(url);

    }
}
