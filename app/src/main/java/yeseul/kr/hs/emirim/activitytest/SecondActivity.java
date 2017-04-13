package yeseul.kr.hs.emirim.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String name, tel; //익명클래스에서 사용하기 위해서는 전역변수로 선언해줘야함
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button butBack = (Button)findViewById(R.id.but_second);
        butBack.setOnClickListener(butBackHandler);
        Intent Intent = getIntent();
        name = Intent.getStringExtra("name"); //이름이 "name"이라고 붙어있는 값을 가져온다는 의미
        tel = Intent.getStringExtra("tel");
        TextView textResult = (TextView)findViewById(R.id.text_result);
        textResult.setText("* 성명 : " + name + "\n * 전화번호 : " + tel);
    }
    View.OnClickListener butBackHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };
}
