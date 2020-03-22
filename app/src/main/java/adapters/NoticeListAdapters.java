package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demo420adapter.R;

import java.util.List;

import model.Notice;

public class NoticeListAdapters extends BaseAdapter {

    private List<Notice> noticeList;
    private LayoutInflater inflater;

    public NoticeListAdapters(List<Notice> noticeList, Context context) {
        this.noticeList = noticeList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return noticeList != null ? noticeList.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return noticeList != null ? noticeList.get(position) : null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final View currentView;

        if (convertView != null) {
            currentView = convertView;
        }else {
            currentView = inflater.inflate(R.layout.notice_list_item, parent, false);
        }

        Notice notice = (Notice) getItem(position);

        if (notice != null) {
            TextView titleView = currentView.findViewById(R.id.title_view);
            TextView addressView = currentView.findViewById(R.id.address_view);
            TextView coastView = currentView.findViewById(R.id.coat_view);
            TextView descriptionView = currentView.findViewById(R.id.description_view);
            ImageView imageView = currentView.findViewById(R.id.cartoon_view);

            titleView.setText(notice.getTitle());
            addressView.setText(notice.getAddress());
            coastView.setText(notice.getCoast().toString());
            descriptionView.setText(notice.getDescription());
            imageView.setBackgroundResource(R.drawable.ic_launcher_background);

        }

        return convertView;
    }
}
