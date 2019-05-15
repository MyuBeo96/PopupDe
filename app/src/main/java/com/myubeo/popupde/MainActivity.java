package com.myubeo.popupde;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Test {

    public EditText edt_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_test = findViewById(R.id.edt_test);
        edt_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAlertDialog();
            }
        });

//        edt_test.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                return false;
//            }
//        });
    }

    private void showAlertDialog() {
        PopUpCustom dialog = new PopUpCustom(MainActivity.this);
        dialog.show();
    }

    @Override
    public void Save(String response) {
        Toast.makeText(this, response, Toast.LENGTH_LONG).show();
//        edt_test.setText(response);
    }
}
