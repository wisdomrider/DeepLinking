package wisdomrider.deeplinking;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/*
Created By WIsdomrider
ON
1 : 08 PM
August 9 2018
(Birtamode)
*/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();
        if (data != null) {
            ((TextView) findViewById(R.id.deep)).setText("Welcome Back From DeepLink !");
        }
    }

    public void go(View v) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://wisdomrider.github.io/deeplinking.html"));
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            finishAffinity();
        } else {
            finish();
        }
        startActivity(browserIntent);
    }
}

