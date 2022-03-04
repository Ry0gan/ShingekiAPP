package com.ryogan.shingekiapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ryogan.shingekiapp.R;
import com.ryogan.shingekiapp.model.ItemList;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {

    private List<ItemList> items;

    public RecyclerAdapter(List<ItemList> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_view, parent, false);
        return new RecyclerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {
        ItemList item = items.get(position);
        holder.imagen.setImageResource(item.getImagen());
        holder.nombre.setText(item.getNombre());
        holder.descripcion.setText(item.getDescripcion());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder{
        private ImageView imagen;
        private TextView nombre;
        private TextView descripcion;

        public RecyclerHolder(@NonNull View itemView){
            super(itemView);
            imagen = itemView.findViewById(R.id.image);
            nombre = itemView.findViewById(R.id.txtNombre);
            descripcion = itemView.findViewById(R.id.txtDescripcion);
        }
    }

}
