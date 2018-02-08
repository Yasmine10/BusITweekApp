package cz.pef.mendelu.busitweek5.adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cz.pef.mendelu.busitweek5.R;
import cz.pef.mendelu.busitweek5.activity.AboutUsActivity;
import cz.pef.mendelu.busitweek5.activity.SettingsActivity;
import cz.pef.mendelu.busitweek5.utils.SharedPrefUtil;


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
        viewHolder.title.setText(settingsList.get(position));

        switch (position) {
            case 0:
                viewHolder.icon.setImageResource(R.drawable.ic_info_white_24dp);
                break;
            case 1:
                viewHolder.icon.setImageResource(R.drawable.ic_settings_backup_restore_white_24dp);
                break;
            case 2:
                viewHolder.icon.setImageResource(R.drawable.ic_people_white_24dp);
                break;
        }

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (holder.getAdapterPosition()) {
                    case 0:
                        SharedPrefUtil.setTutorialStatus(context.getApplicationContext(), true);
                        ((SettingsActivity) context).tutorialDialog();
                        break;
                    case 1:
                        SharedPrefUtil.setGameStatus(context.getApplicationContext(), true);
                        ((SettingsActivity) context).resetGameDialog();
                        break;
                    case 2:
                        context.startActivity(new Intent(context, AboutUsActivity.class));
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