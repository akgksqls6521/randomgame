package kr.hs.emirim.qls6521.monchicken;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

    EditText mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.name);//find값으로 찾아주세요!, 타입이 안맞다! 타입캐스팅을 해줘야함
    }

    @Override
    protected void onResume(){
        super.onResume();
        mName.setText("");
    }
}
