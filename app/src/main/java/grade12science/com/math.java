package grade12science.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class math extends AppCompatActivity {
    private Button button;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        mAdView = findViewById(R.id.adView);
        AdRequest avRequest = new AdRequest.Builder().build();
        mAdView.loadAd(avRequest);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_pp();
            }
        });
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_pbc();
            }
        });
        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_ne();
            }
        });
        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                math_on();
            }
        });
    }
    public void math_pp(){

        Intent intent= new Intent(this,math_pp.class);
        startActivity(intent);
    }
    public void math_pbc(){

        Intent intent= new Intent(this,math_pbc.class);
        startActivity(intent);
    }
    public void math_ne(){

        Intent intent= new Intent(this,math_ne.class);
        startActivity(intent);
    }
    public void math_on(){

        Intent intent= new Intent(this,math_on.class);
        startActivity(intent);
    }
}
