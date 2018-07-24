package com.tasm.istudiez;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.graphics.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.text.*;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.WebViewClient;

public class NotificationActivity extends AppCompatActivity {
	
	
	private Toolbar _toolbar;
	private DrawerLayout _drawer;
	private String a = "";
	private String b = "";
	private String c = "";
	
	private ScrollView vscroll1;
	private WebView webview1;
	private LinearLayout _drawer_linear1;
	private TextView _drawer_textview1;
	private TextView _drawer_textview2;
	private TextView _drawer_textview3;
	private TextView _drawer_textview4;
	private TextView _drawer_textview5;
	
	private Intent home = new Intent();
	private Intent noti = new Intent();
	private Intent about = new Intent();
	private Intent webw = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.notification);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = (DrawerLayout) findViewById(R.id._drawer);ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(NotificationActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		webview1 = (WebView) findViewById(R.id.webview1);
		webview1.getSettings().setJavaScriptEnabled(true);
		webview1.getSettings().setSupportZoom(true);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		_drawer_textview2 = (TextView) _nav_view.findViewById(R.id.textview2);
		_drawer_textview3 = (TextView) _nav_view.findViewById(R.id.textview3);
		_drawer_textview4 = (TextView) _nav_view.findViewById(R.id.textview4);
		_drawer_textview5 = (TextView) _nav_view.findViewById(R.id.textview5);
		
		webview1.setWebViewClient(new WebViewClient() {
			@Override
			public void onPageStarted(WebView _param1, String _param2, Bitmap _param3) {
				final String _url = _param2;
				a = webview1.getUrl();
				b = _url;
				super.onPageStarted(_param1, _param2, _param3);
			}
			
			@Override
			public void onPageFinished(WebView _param1, String _param2) {
				final String _url = _param2;
				c = webview1.getUrl();
				if (a.equals(c) && !b.equals(c)) {
					webw.setAction(Intent.ACTION_VIEW);
					webw.setData(Uri.parse(b));
					finish();
				}
				super.onPageFinished(_param1, _param2);
			}
		});
		
		_drawer_textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), MainActivity.class);
				startActivity(home);
				finish();
			}
		});
		
		_drawer_textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				noti.setClass(getApplicationContext(), NotificationActivity.class);
				startActivity(noti);
				finish();
			}
		});
		
		_drawer_textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				about.setClass(getApplicationContext(), AboutActivity.class);
				startActivity(about);
				finish();
			}
		});
		
		_drawer_textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				
			}
		});
	}
	private void initializeLogic() {
		webview1.loadUrl("https://ktu.edu.in/eu/core/announcements.htm");
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		}
		else {
			super.onBackPressed();
		}
	}
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}
