左右滑动调用
![image](https://github.com/chifan/ZItem/raw/master/info.png)
使用方法：
编写布局文件

    <com.zhu.zlistview.ZItem
        android:id="@+id/textView1"
        android:layout_width="fill_parent"
        android:layout_height="50dp"
        android:layout_centerHorizontal="true"
        android:layout_centerVertical="true"
        android:text="TextView" >
    </com.zhu.zlistview.ZItem>
    
在代码中
	ZItem zitem = (ZItem) findViewById(R.id.textView1);
  	
	zitem.setZItemListener(new ZItemListener() {
			
		@Override
		public void onRight() {
			// TODO Auto-generated method stub

		}
			
		@Override
		public void onLeft() {
			// TODO Auto-generated method stub
		}
	});
