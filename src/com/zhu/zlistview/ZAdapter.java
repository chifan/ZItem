package com.zhu.zlistview;

import java.util.List;

import org.w3c.dom.Text;

import com.zhu.zlistview.ZItem.ZItemListener;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ZAdapter extends BaseAdapter{
	Context context;
	List<String> list;
	public ZAdapter(Context context, List<String> list) {
		super();
		this.context = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(final int position, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		View v = LayoutInflater.from(context).inflate(R.layout.zitem, null);
		final ZItem xitem = (ZItem) v.findViewById(R.id.textView1);
		
		xitem.setZItemListener(new ZItemListener() {
			
			@Override
			public void onRight() {
				// TODO Auto-generated method stub
				xitem.removeAllViews();
				View v = LayoutInflater.from(context).inflate(R.layout.item1, null);
				xitem.addView(v);
			}
			
			@Override
			public void onLeft() {
				// TODO Auto-generated method stub
				xitem.removeAllViews();
				View v = LayoutInflater.from(context).inflate(R.layout.item2, null);
				v.findViewById(R.id.button1).setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						list.remove(position);
						notifyDataSetChanged();
					}
				});
				xitem.addView(v);
			}
		});
		
		return v;
	}

}
