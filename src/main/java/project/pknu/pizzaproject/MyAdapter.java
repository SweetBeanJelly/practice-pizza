package project.pknu.pizzaproject;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private ArrayList<ListViewData> data;
    private int layout;
    Context context;
    int intR = 0;
    ListViewData listviewitem;
    TextView txtResult;

    public MyAdapter(Context context, int layout, ArrayList<ListViewData> data, TextView txt){
        this.inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data=data;
        this.layout=layout;
        this.txtResult=txt;
    }

    @Override
    public int getCount(){return data.size();}

    @Override
    public String getItem(int position){return data.get(position).getName();}

    @Override
    public long getItemId(int position){return position;}

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView==null){
            convertView=inflater.inflate(layout,parent,false);
        }

        context = convertView.getContext();
        listviewitem = data.get(position);

        txtResult.setText("0");

        ImageView image = (ImageView)convertView.findViewById(R.id.PizzaImage);
        image.setImageResource(listviewitem.getIcon());

        final TextView name = (TextView)convertView.findViewById(R.id.pizzaName);
        name.setText(listviewitem.getName());

        final CheckBox chM = (CheckBox)convertView.findViewById(R.id.radioM);
        chM.setText(""+listviewitem.getSizeM());
        final CheckBox chL = (CheckBox)convertView.findViewById(R.id.radioL);
        chL.setText(""+listviewitem.getSizeL());

        Button btn = (Button)convertView.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(chM.isChecked()==false && chL.isChecked()==false) {
                    Toast.makeText(context, "사이즈를 선택하세요.", Toast.LENGTH_SHORT).show();
                }
                if(chM.isChecked()) {
                    intR = intR + listviewitem.getSizeM();
                    Toast.makeText(context, name.getText().toString()+" M 주문 완료.", Toast.LENGTH_SHORT).show();
                    txtResult.setText(""+intR);
                }
                if(chL.isChecked()) {
                    intR = intR + listviewitem.getSizeL();
                    Toast.makeText(context, name.getText().toString()+" L 주문 완료.", Toast.LENGTH_SHORT).show();
                    txtResult.setText(""+intR);
                }
            }
        });

        return convertView;
    }
}
