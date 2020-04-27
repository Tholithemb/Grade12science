package grade12science.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class math_ne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_ne);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/LXES_Gr12Mat_Patterns%2C%20Sequences%20and%20Series%20%28Live%29_07Apr2015.pdf");
            }
        });
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/2905_fdoc.pdf");
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/2894_fdoc.pdf");
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("hhttps://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/LXES_Gr12Mat_Finance%2C%20Growth%20and%20Decay%20%28Live%29_08Apr2015.pdf");
            }
        });
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-topic-overview-asset/Maths%2012-1%20A%20Guide%20to%20Advanced%20Trigonometry.pdf");
            }
        });
        findViewById(R.id.button6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/2853_fdoc.pdf");
            }
        });
        findViewById(R.id.button7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/2917_fdoc.pdf");
            }
        });
        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/2918_fdoc.pdf");
            }
        });

        findViewById(R.id.button10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-topic-overview-asset/Maths%2012-2%20A%20Guide%20to%20Differential%20Calculus.pdf");
            }
        });
        findViewById(R.id.button11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/LXL_Gr12Maths_07_Circles%20and%20Tangents%20%28Live%29_01Jun2015.pdf");
            }
        });
        findViewById(R.id.button12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/LXL_Gr12Maths_23_Similarity_04Aug2014.pdf");
            }
        });
        findViewById(R.id.button9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/LXL_Gr12Maths_22_Circle%20Geometry_28July2014.pdf");
            }
        });
        findViewById(R.id.button13).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-topic-overview-asset/Maths%2012-3%20A%20Guide%20to%20Advanced%20Statistics.pdf");
            }
        });
        findViewById(R.id.button14).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://learn.mindset.africa/sites/default/files/resourcelib/emshare-show-note-asset/LXL_Gr12Maths_25_Probability%20and%20Counting_18Aug2014.pdf");
            }
        });

    }
    public void clicked_btn(String url){

        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
