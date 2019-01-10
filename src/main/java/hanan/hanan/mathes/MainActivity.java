package hanan.hanan.mathes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout mysquare_btn;
    LinearLayout mycircle_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mysquare_btn=(LinearLayout) findViewById(R.id.myquare_btn);
        mysquare_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(MainActivity.this ,SquareActivity.class);
                startActivity(n);

            }
        });
        mycircle_btn=(LinearLayout) findViewById(R.id.mycircle_btn);
        mycircle_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(MainActivity.this ,CircleActivity.class);
                startActivity(n);


            }
        });

    }
}
