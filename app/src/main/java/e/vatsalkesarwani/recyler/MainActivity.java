package e.vatsalkesarwani.recyler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mrecyclerView;
    private RecyclerView.LayoutManager mLayoutmanager;
    private RecyclerView.Adapter madapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<exmpleItem> example=new ArrayList<>();
        example.add(new exmpleItem(R.drawable.ic_android,"Line 1","Line 2"));
        example.add(new exmpleItem(R.drawable.ic_radio,"Line 3","Line 4"));
        example.add(new exmpleItem(R.drawable.ic_sun,"Line 5","Lime 6"));

        mrecyclerView=findViewById(R.id.recycler);
        mrecyclerView.setHasFixedSize(true);
        mLayoutmanager=new LinearLayoutManager(this);
        madapter=new exampleAdapter(example);

        mrecyclerView.setLayoutManager(mLayoutmanager);
        mrecyclerView.setAdapter(madapter);
    }

}
