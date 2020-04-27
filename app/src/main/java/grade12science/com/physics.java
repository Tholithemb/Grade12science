package grade12science.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class physics extends AppCompatActivity {
    private Button button;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);
        button = (Button) findViewById(R.id.button);
        mAdView = findViewById(R.id.adView);
        AdRequest avRequest = new AdRequest.Builder().build();
        mAdView.loadAd(avRequest);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                physics_pp();
            }
        });
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                physics_pbc();
            }
        });
        button = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                physics_ne();
            }
        });
        button = (Button) findViewById(R.id.button4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                physics_on();
            }
        });
        button = (Button) findViewById(R.id.button5);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                physics_prac();
            }
        });
    }
    public void physics_pp(){

        Intent intent= new Intent(this,physics_pp.class);
        startActivity(intent);
    }
    public void physics_pbc(){

        Intent intent= new Intent(this,physics_pbc.class);
        startActivity(intent);
    }
    public void physics_ne(){

        Intent intent= new Intent(this,physics_ne.class);
        startActivity(intent);
    }
    public void physics_on(){

        Intent intent= new Intent(this,physics_on.class);
        startActivity(intent);
    }
    public void physics_prac(){

        Intent intent= new Intent(this,physics_prac.class);
        startActivity(intent);
    }
}



