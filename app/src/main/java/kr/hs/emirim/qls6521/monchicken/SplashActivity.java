package kr.hs.emirim.qls6521.monchicken;


import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Intent;

public class SplashActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();//핸들러 객체생성, 타이머도 사용가능
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0, R.anim.zoom_exit);
                finish();
            }
        }, 3000);

    }
}


