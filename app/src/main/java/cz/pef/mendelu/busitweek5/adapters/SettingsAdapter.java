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


public class SettingsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private List<String> settingsList;

    public SettingsAdapter(Context context, List<String> settingsList) {
        this.context = context;
        this.settingsList = settingsList;
    }

    private class SettingsViewHolder extends RecyclerView.ViewHolder {

        ImageView icon;
        TextView title;

        SettingsViewHolder(View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.settings_icon);
            title = itemView.findViewById(R.id.settings_title);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View subjectView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_settings, parent, false);
        return new SettingsViewHolder(subjectView);
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder holder, int position) {
        final SettingsViewHolder viewHolder = (SettingsViewHolder) holder;
        viewHolder.icon.setImageResource(R.drawable.ic_explore_white_36dp);
        viewHolder.title.setText(settingsList.get(position));

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (holder.getAdapterPosition()) {
                    case 0:
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return settingsList.size();
    }
}