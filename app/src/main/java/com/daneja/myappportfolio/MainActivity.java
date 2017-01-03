package com.daneja.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button moviesButton = (Button) findViewById(R.id.btn_movies);
        final Button stockHawkButton = (Button) findViewById(R.id.btn_stockHawk);
        final Button biggerButton = (Button) findViewById(R.id.btn_bigger);
        final Button materialAppButton = (Button) findViewById(R.id.btn_material_app);
        final Button ubiquitousButton = (Button) findViewById(R.id.btn_ubiquitous);
        final Button capstoneButton = (Button) findViewById(R.id.btn_capstone);

        moviesButton.setOnClickListener(this);
        stockHawkButton.setOnClickListener(this);
        biggerButton.setOnClickListener(this);
        materialAppButton.setOnClickListener(this);
        ubiquitousButton.setOnClickListener(this);
        capstoneButton.setOnClickListener(this);
    }

    /**
     * Respond to click events
     *
     * @param v get the view id to asertain which button is clicked
     */
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_movies:
                displayToastMessage(R.string.movies);
                break;
            case R.id.btn_stockHawk:
                displayToastMessage(R.string.stockHawk);
                break;
            case R.id.btn_bigger:
                displayToastMessage(R.string.bigger);
                break;
            case R.id.btn_material_app:
                displayToastMessage(R.string.materialApp);
                break;
            case R.id.btn_ubiquitous:
                displayToastMessage(R.string.ubiquitous);
                break;
            case R.id.btn_capstone:
                displayToastMessage(R.string.capstone);
                break;
            default:
                throw new IllegalArgumentException("Something strange happened");
        }
    }

    /**
     * Creates a common Toast Message implementation
     *
     * @param i string of the title of the app project
     */
    private void displayToastMessage(int i) {
        Toast.makeText(getApplicationContext(),
                        "This will open " + getResources().getString(i),
                        Toast.LENGTH_LONG).show();
    }
}