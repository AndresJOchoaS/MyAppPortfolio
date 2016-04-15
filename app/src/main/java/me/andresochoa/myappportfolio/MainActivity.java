package me.andresochoa.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeButtons();
    }

    private void initializeButtons() {
        final String[] APPS = {
                "Popular Movies",
                "Stock Hawk",
                "Build it Bigger",
                "Go Ubiquitous",
                "Capstone"
        };

        Button buttonPopularMovies = (Button) findViewById(R.id.buttonPopularMovies);
        assert buttonPopularMovies != null;
        buttonPopularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my " + APPS[0] + " app!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button buttonStockHawk = (Button) findViewById(R.id.buttonStockHawk);
        assert buttonStockHawk != null;
        buttonStockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my " + APPS[1] + " app!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button buttonBuildItBigger = (Button) findViewById(R.id.buttonBuildItBigger);
        assert buttonBuildItBigger != null;
        buttonBuildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my " + APPS[2] + " app!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button buttonGoUbiquitous = (Button) findViewById(R.id.buttonGoUbiquitous);
        assert buttonGoUbiquitous != null;
        buttonGoUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my " + APPS[3] + " app!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button buttonCapstone = (Button) findViewById(R.id.buttonCapstone);
        assert buttonCapstone != null;
        buttonCapstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my " + APPS[4] + " app!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
    }
}
