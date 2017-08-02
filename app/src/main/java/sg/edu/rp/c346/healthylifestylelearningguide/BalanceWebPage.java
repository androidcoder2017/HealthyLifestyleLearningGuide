package sg.edu.rp.c346.healthylifestylelearningguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class BalanceWebPage extends AppCompatActivity {
    WebView wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_web_page);
        getSupportActionBar().hide();
        wv = (WebView)findViewById(R.id.webView2);

        Intent intentReceived = getIntent();
        String url = intentReceived.getStringExtra("website2");
        wv.setWebViewClient(new WebViewClient());

        WebSettings webSettings = wv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setUseWideViewPort(true);
        wv.loadUrl(url);
    }
}
