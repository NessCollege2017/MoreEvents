package ness.edu.moreevents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //properties:
    private Button btnNumber;
    private Button btnOperator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNumber = (Button) findViewById(R.id.btnNumber);
        btnOperator = (Button) findViewById(R.id.btnOperator);

        btnNumber.setOnClickListener(new NumberClicked());
        btnOperator.setOnClickListener(new OperatorClicked());

        class MyClass implements View.OnClickListener{
            @Override
            public void onClick(View v) {

            }
        }

        View.OnClickListener listener = new MyClass();

        View.OnClickListener l = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
    }

    @Override
    public void onClick(View v) {

    }
}
