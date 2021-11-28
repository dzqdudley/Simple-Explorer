package com.dnielfe.manager.debug;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.dnielfe.manager.BrowserActivity;
import com.dnielfe.manager.R;
import com.dnielfe.manager.ThemableActivity;
import com.dnielfe.manager.adapters.BrowserTabsAdapter;
import com.dnielfe.manager.fragments.BrowserFragment;
import com.dnielfe.manager.preview.IconPreview;
import com.dnielfe.manager.ui.DirectoryNavigationView;
import com.dnielfe.manager.ui.PageIndicator;

public class SampleActivity extends ThemableActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
    }
    void proxyRestart() {
        restart();
    }

    public void sendMessage3(View view) {
        this.finish();
        Intent i = new Intent(getBaseContext(), BrowserActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }
}
