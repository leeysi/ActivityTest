package yeseul.kr.hs.emirim.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butMain = (Button)findViewById(R.id.but_main);
        butMain.setOnClickListener(butMainHandler);
    }
    View.OnClickListener butMainHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent Intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(Intent);
        }
    }; //익명클래스 객체이기 때문에 끝에 ;을 붙임
}
