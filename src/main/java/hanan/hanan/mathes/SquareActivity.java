package hanan.hanan.mathes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class SquareActivity extends AppCompatActivity {
    EditText x_fild;
    RadioButton area_rb,premiter_rb;
    Button result_btn,newoperation_btn;
    TextView result_txt;
    double result,x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square);

        x_fild=(EditText) findViewById(R.id.x_fild);
        area_rb=(RadioButton) findViewById(R.id.area_rb);
        premiter_rb=(RadioButton) findViewById(R.id.permiter_rb);
        result_btn=(Button) findViewById(R.id.result_btn);
        newoperation_btn=(Button) findViewById(R.id.newoperation_btn);
        result_txt=(TextView) findViewById(R.id.result_txt);

        result_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String crrentx=x_fild.getText().toString().trim();
                if (crrentx.length()==0)
                {
                    Toast.makeText(SquareActivity.this,"please enter x value",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (area_rb.isChecked())
                    {
                        x=Double.parseDouble(crrentx);
                        result=x*x;
                        result_txt.setText( result +"");
                    }else
                    {
                        if (premiter_rb.isChecked())
                        {
                            x=Double.parseDouble(crrentx);
                            result=4*x;
                            result_txt.setText(result +"");
                        }
                        else
                        {
                            Toast.makeText(SquareActivity.this,"choose between area and premiter",Toast.LENGTH_SHORT).show();
                        }
                    }
                }






            }
        });










    }

}
