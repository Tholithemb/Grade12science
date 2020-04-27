package grade12science.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class physics_ne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_ne);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/3995_fdoc.pdf");
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/LXES_Gr12PSci_Vertical%20Projectile%20Motion%20%28Live%29_08Apr2015.pdf");
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/LXES_Gr12PSci_Organic%20Molecules%20%28Live%29_10Apr2015.pdf");
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/4000_fdoc.pdf");
            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/LXL_Gr12PhysicalSciences_09_Polymers_08April2014.pdf");
            }
        });
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/LXL_Gr12PSci_02_Work-Energy%20Theorem%20%28Live%29_21Apr2015.pdf");
            }
        });
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/4050_fdoc.pdf");
            }
        });
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/LXL_Gr12PSci_04_Rates%20of%20Reactions%20%28Live%29_05May2015.pdf");
            }
        });
        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/4007_fdoc.pdf");
            }
        });
        findViewById(R.id.button10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/LXER_Gr12PhysicalSciences_Acids%20and%20Bases_Nov2014.pdf");
            }
        });
        findViewById(R.id.button11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/4009_fdoc.pdf");
            }
        });
        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/4010_fdoc.pdf");
            }
        });
        findViewById(R.id.button13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/LXL_Gr12PhysicalSciences_25_Photoelectric%20Effect_19Aug2014.pdf");
            }
        });
        findViewById(R.id.button14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("hhttps://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/4008_fdoc.pdf");
            }
        });
        findViewById(R.id.button15).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/4011_fdoc.pdf");
            }
        });
    }
    public void clicked_btn(String url){
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
