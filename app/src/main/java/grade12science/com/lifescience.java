package grade12science.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class lifescience extends AppCompatActivity {
    private Button button;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifescience);
        mAdView = findViewById(R.id.adView);
        AdRequest avRequest = new AdRequest.Builder().build();
        mAdView.loadAd(avRequest);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lfsc_pp();
            }
        });
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lfsc_pbc();
            }
        });
        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lfsc_ne();
            }
        });
        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lfsc_on();
            }
        });
        button = (Button) findViewById(R.id.button6);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                biology();
            }
        });
    }
    public void lfsc_pp() {
        Intent intent = new Intent(this, lfsc_pp.class);
        startActivity(intent);
    }

    public void lfsc_pbc() {

        Intent intent = new Intent(this, lfsc_pbc.class);
        startActivity(intent);
    }

    public void lfsc_ne() {

        Intent intent = new Intent(this, lfsc_ne.class);
        startActivity(intent);
    }

    public void lfsc_on() {

        Intent intent = new Intent(this, lfsc_on.class);
        startActivity(intent);
    }
    public void biology() {

        Intent intent = new Intent(this, biology.class);
        startActivity(intent);
    }
}