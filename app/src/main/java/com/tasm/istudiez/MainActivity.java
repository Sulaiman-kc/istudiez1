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
import android.widget.TextView;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;

public class MainActivity extends AppCompatActivity {
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private DrawerLayout _drawer;
	private double click_exit = 0;
	
	private LinearLayout linear14;
	private LinearLayout linear13;
	private LinearLayout linear2;
	private LinearLayout linear8;
	private ScrollView vscroll2;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private TextView textview3;
	private TextView textview6;
	private TextView textview4;
	private TextView textvie11;
	private TextView textview5;
	private TextView textview12;
	private LinearLayout _drawer_linear1;
	private TextView _drawer_textview1;
	private TextView _drawer_textview7;
	private TextView _drawer_textview8;
	private TextView _drawer_textview9;
	private TextView _drawer_textview10;
	
	private Intent home = new Intent();
	private Intent About = new Intent();
	private Intent noti = new Intent();
	private Intent cse = new Intent();
	private Intent ite = new Intent();
	private Intent cee = new Intent();
	private Intent ece = new Intent();
	private Intent mee = new Intent();
	private Intent eee = new Intent();
	private TimerTask timer;
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.main);
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
		_drawer = (DrawerLayout) findViewById(R.id._drawer);ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(MainActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview4 = (TextView) findViewById(R.id.textview4);
		textvie11 = (TextView) findViewById(R.id.textvie11);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview12 = (TextView) findViewById(R.id.textview12);
		_drawer_linear1 = (LinearLayout) _nav_view.findViewById(R.id.linear1);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		_drawer_textview7 = (TextView) _nav_view.findViewById(R.id.textview7);
		_drawer_textview8 = (TextView) _nav_view.findViewById(R.id.textview8);
		_drawer_textview9 = (TextView) _nav_view.findViewById(R.id.textview9);
		_drawer_textview10 = (TextView) _nav_view.findViewById(R.id.textview10);
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				cse.setClass(getApplicationContext(), CseActivity.class);
				startActivity(cse);
			}
		});
		
		textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				ite.setClass(getApplicationContext(), IteActivity.class);
				startActivity(ite);
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				cee.setClass(getApplicationContext(), CeeActivity.class);
				startActivity(cee);
			}
		});
		
		textvie11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				mee.setClass(getApplicationContext(), MeeActivity.class);
				startActivity(mee);
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				ece.setClass(getApplicationContext(), EceActivity.class);
				startActivity(ece);
			}
		});
		
		textview12.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				eee.setClass(getApplicationContext(), EeeActivity.class);
				startActivity(eee);
			}
		});
		
		_drawer_textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), MainActivity.class);
				startActivity(home);
				finish();
			}
		});
		
		_drawer_textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				noti.setClass(getApplicationContext(), NotificationActivity.class);
				startActivity(noti);
			}
		});
		
		_drawer_textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				About.setClass(getApplicationContext(), AboutActivity.class);
				startActivity(About);
			}
		});
		
		_drawer_textview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				finish();
			}
		});
	}
	private void initializeLogic() {
		click_exit = 0;
		i.setClass(getApplicationContext(), DemoActivity.class);
		startActivity(i);
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
		if (click_exit == 0) {
			SketchwareUtil.showMessage(getApplicationContext(), "Click again to exit ");
			timer = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							click_exit = 1;
						}
					});
				}
			};
			_timer.schedule(timer, (int)(0));
			timer = new TimerTask() {
				@Override
				public void run() {
					runOnUiThread(new Runnable() {
						@Override
						public void run() {
							click_exit = 1;
						}
					});
				}
			};
			_timer.schedule(timer, (int)(1500));
		}
		if (click_exit == 1) {
			finish();
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
