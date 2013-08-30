package com.lyj.cn;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class main extends Activity {
    
	private EditText  et;
	private Button    btn;
	private SharedPreferences sp;
	
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        et=(EditText) findViewById(R.id.EditText01);
	    btn=(Button) findViewById(R.id.Button01);
        
        //����һ��SharedPreferences��ʵ����MODE_APPEND��ʾ�µ����ݻ������ԭ�����ݵĺ���
	    sp=this.getSharedPreferences("demo_01", MODE_PRIVATE);
        //����һ����ť�ĵ���¼�
	    btn.setOnClickListener(new Button.OnClickListener(){

			public void onClick(View v) {
	    //����һ��SharedPreferences.Editor���ʵ������
				SharedPreferences.Editor editor=sp.edit();
		//ȡ��������׻�������		
				String flowername=et.getText().toString();
		//���׻������ƷŽ�ȥ		
				editor.putString("name", flowername);
		//��ʽ�ύ��������Ч
				editor.commit();
		//�����ύ�ɹ�����ʾ		
		        Toast.makeText(main.this, "��ϲ���׻��ɹ���", Toast.LENGTH_LONG).show();
			}
	    	
	    });
        
        
        
	}
}