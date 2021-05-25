package sg.edu.rp.c346.id20042303.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtC206;
    TextView txtC235;
    TextView txtC203;
    TextView txtC346;
    TextView txtC218;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtC206 = findViewById(R.id.txtC206);
        txtC235 = findViewById(R.id.txtC235);
        txtC203 = findViewById(R.id.txtC203);
        txtC346 = findViewById(R.id.txtC346);
        txtC218 = findViewById(R.id.txtC218);

        txtC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("code","C206");
                intent.putExtra("name","Software Development Process");
                intent.putExtra("year",2021);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W67N");
                startActivity(intent);
            }
        });
        txtC235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("code","C235");
                intent.putExtra("name","IT Security and Management");
                intent.putExtra("year",2021);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W67N");
                startActivity(intent);
            }
        });
        txtC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("code","C203");
                intent.putExtra("name","Web Appln Development in php");
                intent.putExtra("year",2021);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W67N");
                startActivity(intent);
            }
        });
        txtC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("code","C346");
                intent.putExtra("name","Mobile App Development");
                intent.putExtra("year",2021);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","E62E");
                startActivity(intent);
            }
        });
        txtC218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("code","C218");
                intent.putExtra("name","UI/UX Design for Apps");
                intent.putExtra("year",2021);
                intent.putExtra("semester",1);
                intent.putExtra("credit",4);
                intent.putExtra("venue","W64G");
                startActivity(intent);
            }
        });

    }
}