package ph.edu.ust.npsalba.myfirsttime;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //v3 Test

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playMeButton = (Button) findViewById(R.id.playMeButton);
        playMeButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final EditText inputEditText1 = (EditText) findViewById(R.id.inputEditText1);
                EditText inputEditText2 = (EditText) findViewById(R.id.inputEditText2);
                final TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int fNo = Integer.parseInt(inputEditText1.getText().toString());
                int sNo = Integer.parseInt(inputEditText2.getText().toString());
                int result = fNo + sNo;

                resultTextView.setText(result + "");
            }
        });
    }
}
