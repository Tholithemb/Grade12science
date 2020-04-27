package grade12science.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class list extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        textView= findViewById(R.id.txt);
        String cStory= getIntent().getStringExtra("Essays");
        textView.setText(cStory);
    }
}
