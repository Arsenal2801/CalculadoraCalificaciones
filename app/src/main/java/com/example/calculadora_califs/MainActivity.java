package com.example.calculadora_califs;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText califM1p1,califM1p2,califM1p3,
            califM2p1,califM2p2,califM2p3,
            califM3p1,califM3p2,califM3p3,
            califM4p1,califM4p2,califM4p3,
            califM5p1,califM5p2,califM5p3,
            califM6p1,califM6p2,califM6p3,
            califM7p1,califM7p2,califM7p3,
            califM8p1,califM8p2,califM8p3,
            califM9p1,califM9p2,califM9p3,
            califM10p1,califM10p2,califM10p3;

    public TextView pMat1,pMat2,pMat3,pMat4,pMat5,pMat6,pMat7,pMat8,pMat9,pMat10,pPar1,pPar2,pPar3,pG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        califM1p1= (EditText)findViewById(R.id.txtMat1P1);
        califM1p2= (EditText)findViewById(R.id.txtMat1P2);
        califM1p3= (EditText)findViewById(R.id.txtMat1P3);
        califM2p1= (EditText)findViewById(R.id.txtMat2P1);
        califM2p2= (EditText)findViewById(R.id.txtMat2P2);
        califM2p3= (EditText)findViewById(R.id.txtMat2P3);
        califM3p1= (EditText)findViewById(R.id.txtMat3P1);
        califM3p2= (EditText)findViewById(R.id.txtMat3P2);
        califM3p3= (EditText)findViewById(R.id.txtMat3P3);
        califM4p1= (EditText)findViewById(R.id.txtMat4P1);
        califM4p2= (EditText)findViewById(R.id.txtMat4P2);
        califM4p3= (EditText)findViewById(R.id.txtMat4P3);
        califM5p1= (EditText)findViewById(R.id.txtMat5P1);
        califM5p2= (EditText)findViewById(R.id.txtMat5P2);
        califM5p3= (EditText)findViewById(R.id.txtMat5P3);
        califM6p1= (EditText)findViewById(R.id.txtMat6P1);
        califM6p2= (EditText)findViewById(R.id.txtMat6P2);
        califM6p3= (EditText)findViewById(R.id.txtMat6P3);
        califM7p1= (EditText)findViewById(R.id.txtMat7P1);
        califM7p2= (EditText) findViewById(R.id.txtMat7P2);
        califM7p3= (EditText) findViewById(R.id.txtMat7P3);
        califM8p1= (EditText) findViewById(R.id.txtMat8P1);
        califM8p2= (EditText) findViewById(R.id.txtMat8P2);
        califM8p3= (EditText) findViewById(R.id.txtMat8P3);
        califM9p1= (EditText) findViewById(R.id.txtMat9P1);
        califM9p2= (EditText) findViewById(R.id.txtMat9P2);
        califM9p3= (EditText) findViewById(R.id.txtMat9P3);
        califM10p1= (EditText) findViewById(R.id.txtMat10P1);
        califM10p2= (EditText) findViewById(R.id.txtMat10P2);
        califM10p3= (EditText) findViewById(R.id.txtMat10P3);
        pMat1= (TextView)findViewById(R.id.pMat1);
        pMat2= (TextView)findViewById(R.id.pMat2);
        pMat3= (TextView)findViewById(R.id.pMat3);
        pMat4= (TextView)findViewById(R.id.pMat4);
        pMat5= (TextView)findViewById(R.id.pMat5);
        pMat6= (TextView)findViewById(R.id.pMat6);
        pMat7= (TextView)findViewById(R.id.pMat7);
        pMat8= (TextView)findViewById(R.id.pMat8);
        pMat9= (TextView)findViewById(R.id.pMat9);
        pMat10= (TextView) findViewById(R.id.pMat10);
        pPar1= (TextView) findViewById(R.id.pP1);
        pPar2= (TextView) findViewById(R.id.pP2);
        pPar3= (TextView) findViewById(R.id.pP3);
        pG = (TextView) findViewById(R.id.pG);

        Button calcular = (Button) findViewById(R.id.btnCalcular);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calcular();
            }
        });


    }

    public void Calcular(){
        double califM1p1d,califM1p2d,califM1p3d,
                califM2p1d,califM2p2d,califM2p3d,
                califM3p1d,califM3p2d,califM3p3d,
                califM4p1d,califM4p2d,califM4p3d,
                califM5p1d,califM5p2d,califM5p3d,
                califM6p1d,califM6p2d,califM6p3d,
                califM7p1d,califM7p2d,califM7p3d,
                califM8p1d,califM8p2d,califM8p3d,
                califM9p1d,califM9p2d,califM9p3d,
                califM10p1d,califM10p2d,califM10p3d,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10, p1,p2,p3, pg;

        califM1p1d=Double.parseDouble(califM1p1.getText().toString());
        califM1p2d=Double.parseDouble(califM1p2.getText().toString());
        califM1p3d=Double.parseDouble(califM1p3.getText().toString());
        califM2p1d=Double.parseDouble(califM2p1.getText().toString());
        califM2p2d=Double.parseDouble(califM2p2.getText().toString());
        califM2p3d=Double.parseDouble(califM2p3.getText().toString());
        califM3p1d=Double.parseDouble(califM3p1.getText().toString());
        califM3p2d=Double.parseDouble(califM3p2.getText().toString());
        califM3p3d=Double.parseDouble(califM3p3.getText().toString());
        califM4p1d=Double.parseDouble(califM4p1.getText().toString());
        califM4p2d=Double.parseDouble(califM4p2.getText().toString());
        califM4p3d=Double.parseDouble(califM4p3.getText().toString());
        califM5p1d=Double.parseDouble(califM5p1.getText().toString());
        califM5p2d=Double.parseDouble(califM5p2.getText().toString());
        califM5p3d=Double.parseDouble(califM5p3.getText().toString());
        califM6p1d=Double.parseDouble(califM6p1.getText().toString());
        califM6p2d=Double.parseDouble(califM6p2.getText().toString());
        califM6p3d=Double.parseDouble(califM6p3.getText().toString());
        califM7p1d=Double.parseDouble(califM7p1.getText().toString());
        califM7p2d=Double.parseDouble(califM7p2.getText().toString());
        califM7p3d=Double.parseDouble(califM7p3.getText().toString());
        califM8p1d=Double.parseDouble(califM8p1.getText().toString());
        califM8p2d=Double.parseDouble(califM8p2.getText().toString());
        califM8p3d=Double.parseDouble(califM8p3.getText().toString());
        califM9p1d=Double.parseDouble(califM9p1.getText().toString());
        califM9p2d=Double.parseDouble(califM9p2.getText().toString());
        califM9p3d=Double.parseDouble(califM9p3.getText().toString());
        califM10p1d=Double.parseDouble(califM10p1.getText().toString());
        califM10p2d=Double.parseDouble(califM10p2.getText().toString());
        califM10p3d=Double.parseDouble(califM10p3.getText().toString());

        p1 = (califM1p1d+califM2p1d+califM3p1d+califM4p1d+califM5p1d+califM6p1d+califM7p1d+califM8p1d+califM9p1d+califM10p1d)/10;
        p2 = (califM1p2d+califM2p2d+califM3p2d+califM4p2d+califM5p2d+califM6p2d+califM7p2d+califM8p2d+califM9p2d+califM10p2d)/10;
        p3 = (califM1p3d+califM2p3d+califM3p3d+califM4p3d+califM5p3d+califM6p3d+califM7p3d+califM8p3d+califM9p3d+califM10p3d)/10;

        r1 = (califM1p1d+califM1p2d+califM1p3d)/3;
        r2 = (califM2p1d+califM2p2d+califM2p3d)/3;
        r3 = (califM3p1d+califM3p2d+califM3p3d)/3;
        r4 = (califM4p1d+califM4p2d+califM4p3d)/3;
        r5 = (califM5p1d+califM5p2d+califM5p3d)/3;
        r6 = (califM6p1d+califM6p2d+califM6p3d)/3;
        r7 = (califM7p1d+califM7p2d+califM7p3d)/3;
        r8 = (califM8p1d+califM8p2d+califM8p3d)/3;
        r9 = (califM9p1d+califM9p2d+califM9p3d)/3;
        r10 = (califM10p1d+califM10p2d+califM10p3d)/3;

        pg = (p1+p2+p3)/3;

        pMat1.setText(String.valueOf(r1));
        pMat2.setText(String.valueOf(r2));
        pMat3.setText(String.valueOf(r3));
        pMat4.setText(String.valueOf(r4));
        pMat5.setText(String.valueOf(r5));
        pMat6.setText(String.valueOf(r6));
        pMat7.setText(String.valueOf(r7));
        pMat8.setText(String.valueOf(r8));
        pMat9.setText(String.valueOf(r9));
        pMat10.setText(String.valueOf(r10));
        pG.setText(String.valueOf(pg));
        pPar1.setText(String.valueOf(p1));
        pPar2.setText(String.valueOf(p2));
        pPar3.setText(String.valueOf(p3));

        if(r1<59.9){
            pMat1.setTextColor(Color.parseColor("#FF0000"));
        }if(r2<59.9){
            pMat2.setTextColor(Color.parseColor("#FF0000"));
        }if(r3<59.9){
            pMat3.setTextColor(Color.parseColor("#FF0000"));
        }if(r4<59.9){
            pMat4.setTextColor(Color.parseColor("#FF0000"));
        }if(r5<59.9){
            pMat5.setTextColor(Color.parseColor("#FF0000"));
        }if(r6<59.9){
            pMat6.setTextColor(Color.parseColor("#FF0000"));
        }if(r7<59.9){
            pMat7.setTextColor(Color.parseColor("#FF0000"));
        }if(r8<59.9){
            pMat8.setTextColor(Color.parseColor("#FF0000"));
        }if(r9<59.9){
            pMat9.setTextColor(Color.parseColor("#FF0000"));
        }if(r10<59.9){
            pMat10.setTextColor(Color.parseColor("#FF0000"));
        }if(p1<59.9){
            pPar1.setTextColor(Color.parseColor("#FF0000"));
        }if(p2<59.9){
            pPar2.setTextColor(Color.parseColor("#FF0000"));
        }if(p3<59.9){
            pPar3.setTextColor(Color.parseColor("#FF0000"));
        }



    }

}