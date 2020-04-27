package grade12science.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class agric extends AppCompatActivity {
private Button button;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_agric);
        mAdView = findViewById(R.id.adView);
        AdRequest avRequest = new AdRequest.Builder().build();
        mAdView.loadAd(avRequest);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agric_pp();
            }
        });
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agric_pbc();
            }
        });
        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               agric_ne();
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://viaafrika.com/wp-content/uploads/2019/07/Agric_Sc_G12_Study_Guide_Reprint_May_2014.pdf");
            }
        });
    }
    public void agric_pp(){
        Intent intent= new Intent(this,agric_pp.class);
        startActivity(intent);
    }
    public void agric_pbc(){
        Intent intent= new Intent(this,agric_pbc.class);
        startActivity(intent);
    }
    public void agric_ne(){
        Intent intent= new Intent(this,agric_ne.class);
        startActivity(intent);
    }
    public void clicked_btn(String url){

        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}