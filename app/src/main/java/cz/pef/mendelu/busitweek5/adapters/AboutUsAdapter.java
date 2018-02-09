package cz.pef.mendelu.busitweek5.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cz.pef.mendelu.busitweek5.R;

public class AboutUsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<String> nameList;

    public AboutUsAdapter(Context context, List<String> nameList) {
        this.context = context;
        this.nameList = nameList;
    }

    private class AboutUsViewHolder extends RecyclerView.ViewHolder {

        ImageView flag;
        TextView name;

        AboutUsViewHolder(View itemView) {
            super(itemView);
            flag = itemView.findViewById(R.id.flag);
            name = itemView.findViewById(R.id.name);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View subjectView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_about_us, parent, false);
        return new AboutUsAdapter.AboutUsViewHolder(subjectView);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        final AboutUsAdapter.AboutUsViewHolder viewHolder = (AboutUsAdapter.AboutUsViewHolder) holder;
        if (position == 3) {
            viewHolder.flag.setImageResource(R.drawable.cz_flag);
        } else {
            viewHolder.flag.setImageResource(R.drawable.bg_flag);
        }
        viewHolder.name.setText(nameList.get(position));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}