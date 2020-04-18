package com.example.crowdfundinghomepage;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsUserActivity extends AppCompatActivity {
    TextView textView1,textView2,textView3;
    AlertDialog dialog1,dialog2,dialog3;
    EditText editText1,editText2,editText3;
    private Button editbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_user);
        //To display in actionbar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.kisaanrakshakicon);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        editbutton = (Button) findViewById(R.id.buttonToast);
        editbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(),
                        "Click on respective field to edit", Toast.LENGTH_LONG).show();

            }
        });

        textView1 = (TextView) findViewById(R.id.textViewUserName);
        dialog1 = new AlertDialog.Builder(this).create();
        editText1 = new EditText(this);
        dialog1.setTitle("Edit Name");
        dialog1.setView(editText1);
        dialog1.setButton(DialogInterface.BUTTON_POSITIVE, "Save Changes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    textView1.setText(editText1.getText());
                }
            });
            textView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    editText1.setText(textView1.getText());
                    dialog1.show();
                }
            });

        textView2 = (TextView) findViewById(R.id.textViewUserPhone);
        dialog2 = new AlertDialog.Builder(this).create();
        editText2 = new EditText(this);
        dialog2.setTitle("Edit Contact Number");
        dialog2.setView(editText2);
        dialog2.setButton(DialogInterface.BUTTON_POSITIVE, "Save Changes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                textView2.setText(editText2.getText());
            }
        });
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2.setText(textView2.getText());
                dialog2.show();
            }
        });


        textView3 = (TextView) findViewById(R.id.textViewUserMail);
        dialog3 = new AlertDialog.Builder(this).create();
        editText3 = new EditText(this);
        dialog3.setTitle("Edit Mail Id");
        dialog3.setView(editText3);
        dialog3.setButton(DialogInterface.BUTTON_POSITIVE, "Save Changes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                textView3.setText(editText3.getText());
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText3.setText(textView3.getText());
                dialog3.show();
            }
        });

    }

}
