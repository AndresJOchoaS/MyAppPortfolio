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
    }

    public void showToast(View view) {
        final String[] APPS = {
                "Popular Movies",
                "Stock Hawk",
                "Build it Bigger",
                "Go Ubiquitous",
                "Capstone"
        };

        int index = 0;

        switch (view.getId()) {
            case R.id.buttonPopularMovies:
                index = 0;
                break;
            case R.id.buttonStockHawk:
                index = 1;
                break;
            case R.id.buttonBuildItBigger:
                index = 2;
                break;
            case R.id.buttonGoUbiquitous:
                index = 3;
                break;
            case R.id.buttonCapstone:
                index = 4;
        }

        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + APPS[index] + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
