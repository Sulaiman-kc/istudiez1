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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.HorizontalScrollView;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public class EeeActivity extends AppCompatActivity {
	
	
	private LinearLayout linear25;
	private LinearLayout linear24;
	private ScrollView vscroll2;
	private TextView textview97;
	private LinearLayout linear2;
	private LinearLayout linear12;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private TextView textview14;
	private TextView textview15;
	private TextView textview16;
	private TextView textview17;
	private TextView textview18;
	private TextView textview19;
	private TextView textview20;
	private HorizontalScrollView hscroll14;
	private HorizontalScrollView hscroll15;
	private HorizontalScrollView hscroll16;
	private HorizontalScrollView hscroll17;
	private HorizontalScrollView hscroll18;
	private HorizontalScrollView hscroll19;
	private HorizontalScrollView hscroll20;
	private LinearLayout linear17;
	private TextView textview59;
	private TextView textview114;
	private TextView textview57;
	private TextView textview58;
	private TextView textview56;
	private TextView textview60;
	private TextView textview118;
	private TextView textview117;
	private TextView textview116;
	private TextView textview115;
	private TextView textview55;
	private TextView textview119;
	private TextView textview113;
	private LinearLayout linear18;
	private TextView textview66;
	private TextView textview65;
	private TextView textview64;
	private TextView textview63;
	private TextView textview62;
	private TextView textview61;
	private LinearLayout linear19;
	private TextView textview72;
	private TextView textview71;
	private TextView textview70;
	private TextView textview69;
	private TextView textview68;
	private TextView textview67;
	private LinearLayout linear20;
	private TextView textview78;
	private TextView textview77;
	private TextView textview76;
	private TextView textview75;
	private TextView textview74;
	private TextView textview112;
	private TextView textview111;
	private TextView textview110;
	private TextView textview109;
	private TextView textview73;
	private LinearLayout linear21;
	private TextView textview84;
	private TextView textview83;
	private TextView textview82;
	private TextView textview81;
	private TextView textview80;
	private TextView textview108;
	private TextView textview107;
	private TextView textview106;
	private TextView textview105;
	private TextView textview79;
	private LinearLayout linear22;
	private TextView textview90;
	private TextView textview89;
	private TextView textview88;
	private TextView textview87;
	private TextView textview86;
	private TextView textview104;
	private TextView textview103;
	private TextView textview102;
	private TextView textview101;
	private TextView textview85;
	private LinearLayout linear23;
	private TextView textview96;
	private TextView textview95;
	private TextView textview94;
	private TextView textview93;
	private TextView textview92;
	private TextView textview120;
	private TextView textview100;
	private TextView textview91;
	
	private Intent home = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.eee);
		initialize();
		initializeLogic();
	}
	
	private void initialize() {
		
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		textview97 = (TextView) findViewById(R.id.textview97);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview16 = (TextView) findViewById(R.id.textview16);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview18 = (TextView) findViewById(R.id.textview18);
		textview19 = (TextView) findViewById(R.id.textview19);
		textview20 = (TextView) findViewById(R.id.textview20);
		hscroll14 = (HorizontalScrollView) findViewById(R.id.hscroll14);
		hscroll15 = (HorizontalScrollView) findViewById(R.id.hscroll15);
		hscroll16 = (HorizontalScrollView) findViewById(R.id.hscroll16);
		hscroll17 = (HorizontalScrollView) findViewById(R.id.hscroll17);
		hscroll18 = (HorizontalScrollView) findViewById(R.id.hscroll18);
		hscroll19 = (HorizontalScrollView) findViewById(R.id.hscroll19);
		hscroll20 = (HorizontalScrollView) findViewById(R.id.hscroll20);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		textview59 = (TextView) findViewById(R.id.textview59);
		textview114 = (TextView) findViewById(R.id.textview114);
		textview57 = (TextView) findViewById(R.id.textview57);
		textview58 = (TextView) findViewById(R.id.textview58);
		textview56 = (TextView) findViewById(R.id.textview56);
		textview60 = (TextView) findViewById(R.id.textview60);
		textview118 = (TextView) findViewById(R.id.textview118);
		textview117 = (TextView) findViewById(R.id.textview117);
		textview116 = (TextView) findViewById(R.id.textview116);
		textview115 = (TextView) findViewById(R.id.textview115);
		textview55 = (TextView) findViewById(R.id.textview55);
		textview119 = (TextView) findViewById(R.id.textview119);
		textview113 = (TextView) findViewById(R.id.textview113);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		textview66 = (TextView) findViewById(R.id.textview66);
		textview65 = (TextView) findViewById(R.id.textview65);
		textview64 = (TextView) findViewById(R.id.textview64);
		textview63 = (TextView) findViewById(R.id.textview63);
		textview62 = (TextView) findViewById(R.id.textview62);
		textview61 = (TextView) findViewById(R.id.textview61);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		textview72 = (TextView) findViewById(R.id.textview72);
		textview71 = (TextView) findViewById(R.id.textview71);
		textview70 = (TextView) findViewById(R.id.textview70);
		textview69 = (TextView) findViewById(R.id.textview69);
		textview68 = (TextView) findViewById(R.id.textview68);
		textview67 = (TextView) findViewById(R.id.textview67);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		textview78 = (TextView) findViewById(R.id.textview78);
		textview77 = (TextView) findViewById(R.id.textview77);
		textview76 = (TextView) findViewById(R.id.textview76);
		textview75 = (TextView) findViewById(R.id.textview75);
		textview74 = (TextView) findViewById(R.id.textview74);
		textview112 = (TextView) findViewById(R.id.textview112);
		textview111 = (TextView) findViewById(R.id.textview111);
		textview110 = (TextView) findViewById(R.id.textview110);
		textview109 = (TextView) findViewById(R.id.textview109);
		textview73 = (TextView) findViewById(R.id.textview73);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		textview84 = (TextView) findViewById(R.id.textview84);
		textview83 = (TextView) findViewById(R.id.textview83);
		textview82 = (TextView) findViewById(R.id.textview82);
		textview81 = (TextView) findViewById(R.id.textview81);
		textview80 = (TextView) findViewById(R.id.textview80);
		textview108 = (TextView) findViewById(R.id.textview108);
		textview107 = (TextView) findViewById(R.id.textview107);
		textview106 = (TextView) findViewById(R.id.textview106);
		textview105 = (TextView) findViewById(R.id.textview105);
		textview79 = (TextView) findViewById(R.id.textview79);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		textview90 = (TextView) findViewById(R.id.textview90);
		textview89 = (TextView) findViewById(R.id.textview89);
		textview88 = (TextView) findViewById(R.id.textview88);
		textview87 = (TextView) findViewById(R.id.textview87);
		textview86 = (TextView) findViewById(R.id.textview86);
		textview104 = (TextView) findViewById(R.id.textview104);
		textview103 = (TextView) findViewById(R.id.textview103);
		textview102 = (TextView) findViewById(R.id.textview102);
		textview101 = (TextView) findViewById(R.id.textview101);
		textview85 = (TextView) findViewById(R.id.textview85);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		textview96 = (TextView) findViewById(R.id.textview96);
		textview95 = (TextView) findViewById(R.id.textview95);
		textview94 = (TextView) findViewById(R.id.textview94);
		textview93 = (TextView) findViewById(R.id.textview93);
		textview92 = (TextView) findViewById(R.id.textview92);
		textview120 = (TextView) findViewById(R.id.textview120);
		textview100 = (TextView) findViewById(R.id.textview100);
		textview91 = (TextView) findViewById(R.id.textview91);
		
		textview59.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ma101Activity.class);
				startActivity(home);
			}
		});
		
		textview114.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ma102Activity.class);
				startActivity(home);
			}
		});
		
		textview57.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Cy100Activity.class);
				startActivity(home);
			}
		});
		
		textview58.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ph100Activity.class);
				startActivity(home);
			}
		});
		
		textview56.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Be110Activity.class);
				startActivity(home);
			}
		});
		
		textview60.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Be100Activity.class);
				startActivity(home);
			}
		});
		
		textview118.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ce100Activity.class);
				startActivity(home);
			}
		});
		
		textview117.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Me100Activity.class);
				startActivity(home);
			}
		});
		
		textview116.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee100Activity.class);
				startActivity(home);
			}
		});
		
		textview115.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ec100Activity.class);
				startActivity(home);
			}
		});
		
		textview55.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Be101_03Activity.class);
				startActivity(home);
			}
		});
		
		textview119.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Be103Activity.class);
				startActivity(home);
			}
		});
		
		textview113.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Be102Activity.class);
				startActivity(home);
			}
		});
		
		textview66.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ma201Activity.class);
				startActivity(home);
				finish();
			}
		});
		
		textview65.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee201Activity.class);
				startActivity(home);
				finish();
			}
		});
		
		textview64.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee203Activity.class);
				startActivity(home);
				finish();
			}
		});
		
		textview63.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee205Activity.class);
				startActivity(home);
				finish();
			}
		});
		
		textview62.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee207Activity.class);
				startActivity(home);
				finish();
			}
		});
		
		textview61.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Hs210Activity.class);
				startActivity(home);
			}
		});
		
		textview72.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ma202Activity.class);
				startActivity(home);
			}
		});
		
		textview71.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee202Activity.class);
				startActivity(home);
			}
		});
		
		textview70.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee204Activity.class);
				startActivity(home);
			}
		});
		
		textview69.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ce206Activity.class);
				startActivity(home);
			}
		});
		
		textview68.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee208Activity.class);
				startActivity(home);
			}
		});
		
		textview67.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Hs200Activity.class);
				startActivity(home);
			}
		});
		
		textview78.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee301Activity.class);
				startActivity(home);
			}
		});
		
		textview77.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ce303Activity.class);
				startActivity(home);
			}
		});
		
		textview76.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee305Activity.class);
				startActivity(home);
			}
		});
		
		textview75.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee307Activity.class);
				startActivity(home);
			}
		});
		
		textview74.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee309Activity.class);
				startActivity(home);
			}
		});
		
		textview112.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee361Activity.class);
				startActivity(home);
			}
		});
		
		textview111.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee363Activity.class);
				startActivity(home);
			}
		});
		
		textview110.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee365Activity.class);
				startActivity(home);
			}
		});
		
		textview109.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee367Activity.class);
				startActivity(home);
			}
		});
		
		textview73.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee369Activity.class);
				startActivity(home);
			}
		});
		
		textview84.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee302Activity.class);
				startActivity(home);
			}
		});
		
		textview83.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee304Activity.class);
				startActivity(home);
			}
		});
		
		textview82.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee306Activity.class);
				startActivity(home);
			}
		});
		
		textview81.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee308Activity.class);
				startActivity(home);
			}
		});
		
		textview80.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Hs300Activity.class);
				startActivity(home);
			}
		});
		
		textview108.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee362Activity.class);
				startActivity(home);
			}
		});
		
		textview107.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee364Activity.class);
				startActivity(home);
			}
		});
		
		textview106.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee366Activity.class);
				startActivity(home);
			}
		});
		
		textview105.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee368Activity.class);
				startActivity(home);
			}
		});
		
		textview79.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee372Activity.class);
				startActivity(home);
			}
		});
		
		textview90.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee401Activity.class);
				startActivity(home);
			}
		});
		
		textview89.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee403Activity.class);
				startActivity(home);
			}
		});
		
		textview88.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee405Activity.class);
				startActivity(home);
			}
		});
		
		textview87.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee407Activity.class);
				startActivity(home);
			}
		});
		
		textview86.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee409Activity.class);
				startActivity(home);
			}
		});
		
		textview104.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee461Activity.class);
				startActivity(home);
			}
		});
		
		textview103.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee463Activity.class);
				startActivity(home);
			}
		});
		
		textview102.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee465Activity.class);
				startActivity(home);
			}
		});
		
		textview101.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee467Activity.class);
				startActivity(home);
			}
		});
		
		textview85.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee469Activity.class);
				startActivity(home);
			}
		});
		
		textview96.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee402Activity.class);
				startActivity(home);
			}
		});
		
		textview95.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee404Activity.class);
				startActivity(home);
			}
		});
		
		textview94.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee462Activity.class);
				startActivity(home);
			}
		});
		
		textview93.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee464Activity.class);
				startActivity(home);
			}
		});
		
		textview92.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee466Activity.class);
				startActivity(home);
			}
		});
		
		textview120.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee468Activity.class);
				startActivity(home);
			}
		});
		
		textview100.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee472Activity.class);
				startActivity(home);
			}
		});
		
		textview91.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				home.setClass(getApplicationContext(), Ee474Activity.class);
				startActivity(home);
			}
		});
	}
	private void initializeLogic() {
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
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