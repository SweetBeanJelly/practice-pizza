package project.pknu.pizzaproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SubActivity extends Activity {

    ListView listView;
    int sizeM1 = 17940, sizeL1 = 21540;
    int sizeM2 = 16740, sizeL2 = 20340;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        listView = (ListView)findViewById(R.id.listView);
        ArrayList<ListViewData> data = new ArrayList<>();
        ListViewData pizza1 = new ListViewData("갈릭 마블 스테이크",sizeM1,sizeL1,R.drawable.pizza1);
        ListViewData pizza2 = new ListViewData("더블 퐁듀 비프킹",sizeM1,sizeL1,R.drawable.pizza2);
        ListViewData pizza3 = new ListViewData("갈릭 버터 쉬림프",sizeM1,sizeL1,R.drawable.pizza3);
        ListViewData pizza4 = new ListViewData("더블 퐁듀 반반",sizeM1,sizeL1,R.drawable.pizza4);
        ListViewData pizza5 = new ListViewData("더블 퐁듀 쉬림프",sizeM1,sizeL1,R.drawable.pizza5);
        ListViewData pizza6 = new ListViewData("큐브 스테이크",sizeM1,sizeL1,R.drawable.pizza6);
        ListViewData pizza7 = new ListViewData("토핑킹",sizeM1,sizeL1,R.drawable.pizza7);
        ListViewData pizza8 = new ListViewData("치즈킹",sizeM1,sizeL1,R.drawable.pizza8);
        ListViewData pizza9 = new ListViewData("치즈 스테이크",sizeM1,sizeL1,R.drawable.pizza9);
        ListViewData pizza10 = new ListViewData("직화 불고기",sizeM1,sizeL1,R.drawable.pizza10);
        ListViewData pizza11 = new ListViewData("베이컨 포테이토",sizeM2,sizeL2,R.drawable.pizza11);
        ListViewData pizza12 = new ListViewData("수퍼 슈프림",sizeM2,sizeL2,R.drawable.pizza12);

        data.add(pizza1); data.add(pizza2);  data.add(pizza3);
        data.add(pizza4); data.add(pizza5);  data.add(pizza6);
        data.add(pizza7); data.add(pizza8);  data.add(pizza9);
        data.add(pizza10); data.add(pizza11);  data.add(pizza12);

        TextView textView = (TextView)findViewById(R.id.textResult);

        MyAdapter adapter=new MyAdapter(this,R.layout.activity_listview_item,data,textView);
        listView.setAdapter(adapter);
    }
}
