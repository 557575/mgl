package com.rizky.pemula;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.Objects;

public class ListMagelangAdapter extends RecyclerView.Adapter<ListMagelangAdapter.ListViewHolder>  {
    private ArrayList<Magelang> listMagelang;
    public ListMagelangAdapter(ArrayList<Magelang> list) {
        this.listMagelang = list; }

        private OnItemClickCallback onItemClickCallBack;

    public void setOnItemClickCallBack() {
            setOnItemClickCallBack();
        }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_magelang, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder listViewHolder, int position) {
        Magelang magelang = listMagelang.get(position);
        Glide.with(listViewHolder.itemView.getContext())
                .load(magelang.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(listViewHolder.imgPhoto);
        listViewHolder.tvName.setText(magelang.getName());
        listViewHolder.tvDetail.setText(magelang.getDetail());
        listViewHolder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                onItemClickCallBack.onItemClicked(listMagelang.get(Objects.requireNonNull(listViewHolder).getAdapterPosition()));
            }
    });
    }

    public void setOnItemClickCallBack(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallBack = onItemClickCallBack;
    }

    public interface OnItemClickCallback {
        void onItemClicked(Magelang data);
    }

    @Override
    public int getItemCount() {
        return listMagelang.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
