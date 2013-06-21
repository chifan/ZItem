左右滑动调用
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
Item xitem = (ZItem) findViewById(R.id.textView1);
  	
xitem.setZItemListener(new ZItemListener() {
			
		@Override
		public void onRight() {
			// TODO Auto-generated method stub

		}
			
		@Override
		public void onLeft() {
			// TODO Auto-generated method stub

    }
);
