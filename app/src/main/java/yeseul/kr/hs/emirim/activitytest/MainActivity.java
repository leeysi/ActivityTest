package yeseul.kr.hs.emirim.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editName, editTel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butMain = (Button)findViewById(R.id.but_main);
        butMain.setOnClickListener(butMainHandler);
        editName = (EditText)findViewById(R.id.edit_name);
        editTel = (EditText)findViewById(R.id.edit_tel);
    }
    View.OnClickListener butMainHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent Intent = new Intent(MainActivity.this, SecondActivity.class);
            String name = editName.getText().toString();
            String tel = editTel.getText().toString();
            Intent.putExtra("name", name); //두번째가 실제 값을 저장할 변수(값) 첫번째는 이름
            Intent.putExtra("tel", tel);
            startActivity(Intent);
        }
    }; //익명클래스 객체이기 때문에 끝에 ;을 붙임
}
