package cz.pef.mendelu.busitweek5.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import cz.pef.mendelu.busitweek5.R;


public class GridAdapter extends BaseAdapter {
    private Context context;
    private final int[] images;

    public GridAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView == null) {

            gridView = new View(context);

            gridView = inflater.inflate(R.layout.row_grid, null);

            ImageView imageView = gridView.findViewById(R.id.grid_item_image);

            int resourceID = images[position];
            imageView.setImageResource(resourceID);
        } else {
            gridView = convertView;
        }
        return gridView;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }
}