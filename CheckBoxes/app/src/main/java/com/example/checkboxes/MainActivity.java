package com.example.checkboxes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String toast=new String();
    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.Choco_check:
                if (checked)
                    // Same day service
                   toast+=" "+ "Chocolate_syrup ";
                break;
            case R.id.Sprinkle_check:
                if (checked)
                    // Next day delivery
                    toast+=" "+"Sprinkles";
                break;
            case R.id.nuts:
                if (checked)
                    // Pick up
                    toast+=" "+"Crushed nuts ";
                break;
            case R.id.Cherries_check:
                if (checked)
                    // Pick up
                    toast+=" "+"Cherries";
                break;
            case R.id.Orio_check:
                if (checked)
                    // Pick up
                    toast+=" "+ "Orio cookie crumbles";
                break;
            default:
                // Do nothing.
                break;
        }
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void ShowToast(View view) {
        displayToast(toast);
        toast="";
    }
}