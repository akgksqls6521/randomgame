package kr.hs.emirim.qls6521.monchicken;


import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;



public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    EditText mName;
    Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.name);//find값으로 찾아주세요!, 타입이 안맞다! 타입캐스팅을 해줘야함
        mButton = (Button) findViewById(R.id.btn_show_me_the_chicken);
        mButton.setOnClickListener(this);//익명클래스 널 클릭했을때 일어나는 일은 mainActivity에서 알아서 해줄거야!
//온클릭리스너? 버튼이 클릭되었는지 감시하는 녀석 ()안에 있는 건 이벤트 핸들러 클래스
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText(null);
    }//액티비티가 다시 시작되었을때 호출

    /**
     * Called when a view has been clicked
     */
    @Override//애노테이션...?
    public void onClick(View v) {
        String name = mName.getText().toString();
//        if (name == null) {
//            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();
//        }
//
//        else {
//            //Toast.makeText(this, "씨, 배고파요!", Toast.LENGTH_LONG).show();
//            //toString은 오버라이딩해서 쓰려고하는 메소드이다 ->object 최상위 클래스에 있다
//            Toast.makeText(this, name + "씨, 배고파요!", Toast.LENGTH_LONG).show();
//            Intent intent = new Intent(this, ResultActivity.class);
//            startActivity(intent);
//        }

        try{

            Toast.makeText(this, name + "씨, 배고파요!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("name",name);
            intent.putExtra("age",10);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);

        } catch(NullPointerException e){//NullPointerException이 실행되면 이 부분이 실행됨

            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();

        } catch(Exception e){//모든 예외의 어머니

            Toast.makeText(this, "뭔지 모르지만 잘 안되네요!", Toast.LENGTH_LONG).show();

        }


    }

}
