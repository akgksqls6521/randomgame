package kr.hs.emirim.qls6521.monchicken;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.*;

import java.util.Random;

/**
 * Created by appcreator12 on 2016. 3. 28..
 */
public class ResultActivity extends ActionBarActivity {
    static String TAG="먼치킨:ResultActivity";//일반적으로 앱이름+액티비티이름
    TextView mResult;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작!");

        mResult=(TextView) findViewById(R.id.result);
        mImageView=(ImageView) findViewById(R.id.imageView);
        Log.d(TAG,"텍스트뷰 연결 성공!");

        Random r=new Random();
        int result=r.nextInt(5);
        Log.d(TAG,"랜덤값 생성 ! :"+ result);
        mImageView.setImageResource(R.drawable.chick1+result);

        /*if
        if(result==0){
            mImageView.setImageResource(R.drawable.chick1);
        }else if(result ==1){
            mImageView.setImageResource(R.drawable.chick2);
        }else if(result==2){
            mImageView.setImageResource(R.drawable.chick3);
        }else if(result==3){
            mImageView.setImageResource(R.drawable.chick4);
        }else if(result==4){
            mImageView.setImageResource(R.drawable.chick5);
        }
        else{
            Toast.makeText(this,"잘못되었습니다",Toast.LENGTH_LONG).show();
        }*/

        /*switch
        switch(result){
            case 0:
                mImageView.setImageResource(R.drawable.chick1);
                break;
            case 1:
                mImageView.setImageResource(R.drawable.chick2);
                break;
            case 2:
                mImageView.setImageResource(R.drawable.chick3);
                break;
            case 3:
                mImageView.setImageResource(R.drawable.chick4);
                break;
            case 4:
                mImageView.setImageResource(R.drawable.chick5);
                break;
            default:
                break;
        }*/



        Intent intent = getIntent();
        String name=intent.getStringExtra("name");
        Log.d(TAG,"인텐트값 읽기<name> :"+name);

        int age=intent.getIntExtra("age", -1);
        Log.d(TAG,"인텐트값 읽기(age) :"+age);



        mResult.setText(name + "님 다이어트 해야해요 ㅠㅠ");
    }
}

