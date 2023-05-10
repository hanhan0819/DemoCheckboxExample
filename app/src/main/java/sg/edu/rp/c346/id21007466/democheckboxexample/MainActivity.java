package sg.edu.rp.c346.id21007466.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("MyActivity", "Inside onClick()");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cbEnabled=findViewById(R.id.checkBoxDicount);
        btnCheck=findViewById(R.id.buttonCheck);
        tvShow=findViewById(R.id.textView);



        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isChecked = cbEnabled.isChecked();

                if (isChecked) {
                    tvShow.setText("The discount is given");
                } else {
                    tvShow.setText("The discount is not given");

                }
                Toast.makeText(MainActivity.this, "Button Click", Toast.LENGTH_LONG).show();
                }

        });
    }
}