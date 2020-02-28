package com.example.exrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appnotas.R;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private String [] arrayCaracteres;
    private Context context;
    int contador;
    int[] nota1;
    int[] nota2;
    int[] nota3;


    public RecyclerViewAdapter(Context con, String[] arrN,int no1,int no2,int no3, int contado){
        arrayCaracteres = arrN;
        context = con;
        nota1= no1;
        nota2=no2;
        nota3=no3;
        contador=contado;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_overlay, parent, false);
        ViewHolder holder = new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.etiquetaNom.setText(arrayCaracteres[position]);
        holder.n1.setText(Integer.toString(arrayCaracteres[position]));
        holder.n2.setText(Integer.toString(arrayCaracteres[position]));
        holder.n3.setText(Integer.toString(arrayCaracteres[position]));


    }

    @Override
    public int getItemCount() {
        return arrayCaracteres.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView etiquetaNom;
        TextView n1;
        TextView n2;
        TextView n3;

        ConstraintLayout layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            etiquetaNom = itemView.findViewById(R.id.userName);
            n1 = itemView.findViewById(R.id.n1);
            n2 = itemView.findViewById(R.id.n2);
            n3 = itemView.findViewById(R.id.n3);
            layout = itemView.findViewById(R.id.layout);
        }
    }



}
