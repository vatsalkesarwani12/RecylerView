package e.vatsalkesarwani.recyler;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class exampleAdapter extends RecyclerView.Adapter<exampleAdapter.ExampleViewHolder> {

    private ArrayList<exmpleItem> mexampleList;

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item,parent,false);
        ExampleViewHolder evh =new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
        exmpleItem currentItem=mexampleList.get(position);

        holder.mImageView.setImageResource(currentItem.getmImageResourse());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
    }

    @Override
    public int getItemCount() {
        return mexampleList.size();
    }

    public exampleAdapter(ArrayList<exmpleItem> exampleList)
    {
        mexampleList=exampleList;
    }

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {

        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView=itemView.findViewById(R.id.image);
            mTextView1=itemView.findViewById(R.id.tt1);
            mTextView2=itemView.findViewById(R.id.tt2);
        }
    }

}
