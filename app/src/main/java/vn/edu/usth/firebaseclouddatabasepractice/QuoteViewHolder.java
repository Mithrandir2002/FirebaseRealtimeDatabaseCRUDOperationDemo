package vn.edu.usth.firebaseclouddatabasepractice;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class QuoteViewHolder extends RecyclerView.ViewHolder {
    public TextView quotesTv, authorTv;
    public QuoteViewHolder(@NonNull View itemView) {
        super(itemView);
        quotesTv = itemView.findViewById(R.id.quote_tv);
        authorTv = itemView.findViewById(R.id.author_tv);
    }
}
