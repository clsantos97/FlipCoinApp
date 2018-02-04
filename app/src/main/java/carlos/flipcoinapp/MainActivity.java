package carlos.flipcoinapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnFlipAction(View view){
        startActivity(new Intent(MainActivity.this, FlipActivity.class));
    }

    public void btnStatsAction(View view){
        startActivity(new Intent(MainActivity.this, StatsActivity.class));
    }

    public void btnExitAction(View view){
        finish();
        System.exit(0);
    }
}
