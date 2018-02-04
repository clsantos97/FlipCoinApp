package carlos.flipcoinapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

public class FlipActivity extends AppCompatActivity {

    private static final int FRAME_W = 32;
    private static final int FRAME_H = 32;
    private static final int NB_FRAMES = 61;
    private static final int COUNT_X = 61;
    private static final int COUNT_Y = 1;
    private static final int FRAME_DURATION = 100; // in ms !
    private static final int SCALE_FACTOR = 1;
    private Bitmap coinBmp;
    GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip);
        gameView = new GameView(this);

        this.addContentView(gameView, new ConstraintLayout.LayoutParams(400, 400));
        //coinBmp= BitmapFactory.decodeResource(getResources(),R.drawable.coin32);

        gameView.run();

    }

    // This method executes when the player starts the game
    @Override
    protected void onResume() {
        super.onResume();

        // Tell the gameView resume method to execute
        gameView.resume();
    }

    // This method executes when the player quits the game
    @Override
    protected void onPause() {
        super.onPause();

        // Tell the gameView pause method to execute
        gameView.pause();
    }






}
