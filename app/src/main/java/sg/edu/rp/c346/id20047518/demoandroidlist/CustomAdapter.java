package sg.edu.rp.c346.id20047518.demoandroidlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context context;
    int layout_id;
    ArrayList<AndroidVersion> versionList;

    public CustomAdapter(Context context, int resource, ArrayList<AndroidVersion> objects) {
        super( context, resource, objects );
        this.context = context;
        this.layout_id = resource;
        versionList = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View rowView = inflater.inflate( layout_id, parent, false );
        TextView tvName = rowView.findViewById( R.id.tvName );
        TextView tvVersion = rowView.findViewById( R.id.tvVersion );

        AndroidVersion currentVersion = versionList.get(position);
        tvName.setText( currentVersion.getName() );
        tvVersion.setText( currentVersion.getVersion() );

        return  rowView;
    }

}
