package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public abstract class AdaptadorProduto extends RecyclerView.Adapter<AdaptadorProduto.ViewHolder>  {
    private Context nossocontexto;
    private List<Produtos> nossalistaProdutos;

    public AdaptadorProduto(Context nossocontexto) {
        this.nossocontexto = nossocontexto;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(nossocontexto);
        View view = inflater.inflate
                (R.layout.modelo_produtos,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.idtituloproduto.setText(nossalistaProdutos.get(position).getTitulo());
        holder.idmodimagemproduto.setImageResource(nossalistaProdutos.get(position).getImagem());
        holder.cardProduto.setOnClickListener(new );

    }

    @Override
    public int getItemCount() {
        return nossalistaProdutos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CardView cardProduto;

        ImageView idmodimagemproduto;

        TextView idtituloproduto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardProduto = itemView.findViewById(R.id.cardProduto);
            idmodimagemproduto = itemView.findViewById(R.id.idmodimagemproduto);
            idtituloproduto = itemView.findViewById(R.id.idtituloproduto);
        }
    }
}
