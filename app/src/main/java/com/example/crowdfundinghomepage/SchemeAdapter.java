package com.example.crowdfundinghomepage;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class SchemeAdapter extends RecyclerView.Adapter<SchemeAdapter.ExampleViewHolder> {
    private ArrayList<SchemeEachItemClass> schemeList;

    public static class ExampleViewHolder extends RecyclerView.ViewHolder {
        public ImageView schemeImageView;
        public TextView schemeNameText;
        public TextView schemeDescText;

        public ExampleViewHolder(View itemView) {
            super(itemView);
            schemeImageView = itemView.findViewById(R.id.imageView);
            schemeNameText = itemView.findViewById(R.id.textViewSchemeName);
            schemeDescText = itemView.findViewById(R.id.textViewSchemeDesc);
        }
    }

    public SchemeAdapter(ArrayList<SchemeEachItemClass> exampleList) {
        schemeList = exampleList;
    }

    @Override
    public ExampleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.schemeitem, parent, false);
        ExampleViewHolder evh = new ExampleViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(ExampleViewHolder holder, int position) {
        SchemeEachItemClass currentItem = schemeList.get(position);

        holder.schemeImageView.setImageResource(currentItem.getImageResource());
        holder.schemeNameText.setText(currentItem.getText1());
        holder.schemeDescText.setText(currentItem.getText2());
    }

    @Override
    public int getItemCount() {
        return schemeList.size();
    }
}