package e.vatsalkesarwani.recyler;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mrecyclerView;
    private RecyclerView.LayoutManager mLayoutmanager;
    private exampleAdapter madapter;

    private Button delete_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<exmpleItem> example = new ArrayList<>();
        example.add(new exmpleItem(R.drawable.ic_android,"Line 1","Line 2"));
        example.add(new exmpleItem(R.drawable.ic_radio,"Line 3","Line 4"));
        example.add(new exmpleItem(R.drawable.ic_sun,"Line 5","Lime 6"));
        example.add(new exmpleItem(R.drawable.ic_android, "Line 7", "Line 8"));
        example.add(new exmpleItem(R.drawable.ic_radio, "Line 9", "Line 10"));
        example.add(new exmpleItem(R.drawable.ic_sun, "Line 11", "Lime 12"));
        example.add(new exmpleItem(R.drawable.ic_android, "Line 13", "Line 14"));
        example.add(new exmpleItem(R.drawable.ic_radio, "Line 15", "Line 16"));
        example.add(new exmpleItem(R.drawable.ic_sun, "Line 17", "Lime 18"));
        example.add(new exmpleItem(R.drawable.ic_android, "Line 19", "Line 20"));
        example.add(new exmpleItem(R.drawable.ic_radio, "Line 21", "Line 22"));
        example.add(new exmpleItem(R.drawable.ic_sun, "Line 23", "Lime 24"));


        mrecyclerView=findViewById(R.id.recycler);
        mrecyclerView.setHasFixedSize(true);

        mLayoutmanager=new LinearLayoutManager(this);

        madapter=new exampleAdapter(example);

        mrecyclerView.setLayoutManager(mLayoutmanager);
        mrecyclerView.setAdapter(madapter);

        madapter.SetOnItemClickListener(new exampleAdapter.OnItemClickListener() {
            @Override
            public void OnItemClick(int position) {
                example.get(position).changeText1("Clicked");
                madapter.notifyItemChanged(position);
            }

            @Override
            public void OnDeleteItem(int position) {
                example.remove(position);
                madapter.notifyItemRemoved(position);
            }
        });
    }

}
