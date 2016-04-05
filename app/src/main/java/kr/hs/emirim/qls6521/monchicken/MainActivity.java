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

        mName = (EditText) findViewById(R.id.name);//find값으로 찾아주세요!, 타입이 안맞다! 타입캐스팅을 해줘야함
        mButton = (Button) findViewById(R.id.btn_show_me_the_chicken);
        mButton.setOnClickListener(this);//익명클래스 널 클릭했을때 일어나는 일은 mainActivity에서 알아서 해줄거야!

    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText("");
    }

    /**
     * Called when a view has been clicked
     */
    @Override//애노테이션...?
    public void onClick(View v) {
        Toast.makeText(this, "배고파요!", Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this, ResultActivity.class);
        startActivity(intent);

    }


}
