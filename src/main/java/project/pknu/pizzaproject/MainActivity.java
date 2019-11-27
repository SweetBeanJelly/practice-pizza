package project.pknu.pizzaproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String pizzaSizeM1="17,940", pizzaSizeL1="21,540";
    String pizzaSizeM2="16,740", pizzaSizeL2="20,340";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnResult).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SubActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newAlertDialog("갈릭 마블 스테이크",pizzaSizeM1,pizzaSizeL1);
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newAlertDialog("더블 퐁듀 비프킹",pizzaSizeM1,pizzaSizeL1);
            }
        });
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newAlertDialog("갈릭 버터 쉬림프",pizzaSizeM1,pizzaSizeL1);
            }
        });
        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newAlertDialog("더블 퐁듀 반반",pizzaSizeM1,pizzaSizeL1);
            }
        });
        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newAlertDialog("더블 퐁듀 쉬림프",pizzaSizeM1,pizzaSizeL1);
            }
        });
        findViewById(R.id.btn6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newAlertDialog("큐브 스테이크",pizzaSizeM1,pizzaSizeL1);
            }
        });
        findViewById(R.id.btn7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newAlertDialog("토핑킹",pizzaSizeM1,pizzaSizeL1);
            }
        });
        findViewById(R.id.btn8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newAlertDialog("치즈킹",pizzaSizeM1,pizzaSizeL1);
            }
        });
        findViewById(R.id.btn9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newAlertDialog("치즈 스테이크",pizzaSizeM1,pizzaSizeL1);
            }
        });
        findViewById(R.id.btn10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newAlertDialog("직화 불고기",pizzaSizeM1,pizzaSizeL1);
            }
        });
        findViewById(R.id.btn11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newAlertDialog("베이컨 포테이토",pizzaSizeM2,pizzaSizeL2);
            }
        });
        findViewById(R.id.btn12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                newAlertDialog("수퍼 슈프림",pizzaSizeM2,pizzaSizeL2);
            }
        });
    }

    public void newAlertDialog(String title, String size1, String size2) {
        LayoutInflater inflater = (LayoutInflater)getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_alert, null);
        Button btnM = (Button) view.findViewById(R.id.Abutton1);
        Button btnL = (Button) view.findViewById(R.id.Abutton2);
        TextView txtM = (TextView)view.findViewById(R.id.Atxt1);
        TextView txtL = (TextView)view.findViewById(R.id.Atxt2);
        txtM.setText(size1);
        txtL.setText(size2);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setView(view);
        builder.setTitle(title);
        builder.setPositiveButton("닫기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
