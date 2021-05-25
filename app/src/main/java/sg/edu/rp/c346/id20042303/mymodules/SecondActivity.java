package sg.edu.rp.c346.id20042303.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView codeTxt;
    TextView nameTxt;
    TextView yearTxt;
    TextView semesterTxt;
    TextView creditTxt;
    TextView venueTxt;
    Button backBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        codeTxt = findViewById(R.id.textView);
        nameTxt = findViewById(R.id.textView2);
        yearTxt = findViewById(R.id.textView3);
        semesterTxt = findViewById(R.id.textView4);
        creditTxt = findViewById(R.id.textView5);
        venueTxt = findViewById(R.id.textView6);
        backBtn = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String mCode = intentReceived.getStringExtra("code");
        String mName = intentReceived.getStringExtra("name");
        int mYear = intentReceived.getIntExtra("year",0);
        int mSemester = intentReceived.getIntExtra("semester",0);
        int mCredit = intentReceived.getIntExtra("credit",0);
        String mVenue = intentReceived.getStringExtra("venue");

        codeTxt.setText("Module Code: " + mCode);
        nameTxt.setText("Module Name: " + mName);
        yearTxt.setText("Academic Year: " + mYear);
        semesterTxt.setText("Semester: " + mSemester);
        creditTxt.setText("Module Credit: " + mCredit);
        venueTxt.setText("Venue: " + mVenue);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}