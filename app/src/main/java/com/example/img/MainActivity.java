package com.example.img;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mtaille,mpoids,mage;
    Button  calcule;
    RadioButton genreH,genreF;
    RadioGroup genrew;
    TextView resultat,interpret;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtaille=(EditText) findViewById(R.id.edittaille);
        mpoids=(EditText) findViewById(R.id.editpoids);
        mage=(EditText) findViewById(R.id.editage);
        genreH=(RadioButton)findViewById(R.id.rdbhomme);
        genrew=(RadioGroup) findViewById(R.id.genre);
        genreF=(RadioButton) findViewById(R.id.rdbfemme);
        calcule=(Button) findViewById(R.id.btncalculIMG);
        resultat=(TextView) findViewById(R.id.lblResultat);
        interpret=(TextView) findViewById(R.id.lblInterpretation);
    calcule.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            float number1= Float.parseFloat(mtaille.getText().toString());
            float number2= Float.parseFloat(mpoids.getText().toString());
            int number3= Integer.parseInt(mage.getText().toString());
           /* char genreh= (char) R.id.rdbhomme;
            char genref= (char) R.id.rdbfemme;*/
            int sexe;
            double img;

            img = number2/ Math.pow(1/number2, 2);

            if(number3>=16){
                if(genreH.isSelected()) {


                    sexe=1;
                double img1=(1.20*img)+(0.23*number3)-(10.8*sexe)-5.4;
                    resultat.setText("Votre IMG est "+ String.valueOf(img1)+"%");
                   if(img1<15){
                       String res="trop maigre";
                       interpret.setText("Interpretation: "+String.valueOf(res));
                   } else if (img1>15 && img1<20) {
                       String res="pourcentage normal";
                       interpret.setText("Interpretation: "+String.valueOf(res));
                   } else if (img1>20) {
                       String res="trop de graisse";
                       interpret.setText("Interpretation: "+String.valueOf(res));
                   }

                } else if (genreF.isSelected()) {
                    sexe=0;
                    double img1=(1.20*img)+(0.23*number3)-(10.8*sexe)-5.4;
                    resultat.setText("Votre IMG est "+ String.valueOf(img1)+"%");
                    if(img1<25){
                        String res="trop maigre";
                        interpret.setText("Interpretation: "+String.valueOf(res));
                    } else if (img1>25 && img1<30) {
                        String res="pourcentage normal";
                        interpret.setText("Interpretation: "+String.valueOf(res));
                    } else if (img1>30) {
                        String res="trop de graisse";
                        interpret.setText("Interpretation: "+String.valueOf(res));
                    }
                }

            } else if (number3<=15) {
                if(genreH.isSelected()) {
                    sexe=1;
                    double img1=(1.5*img)+(0.70*number3)-(3.6*sexe)-1.4;
                    resultat.setText("Votre IMG est "+ String.valueOf(img1)+"%");
                    if(img1<15){
                        String res="trop maigre";
                        interpret.setText("Interpretation: "+String.valueOf(res));
                    } else if (img1>15 && img1<20) {
                        String res="pourcentage normal";
                        interpret.setText("Interpretation: "+String.valueOf(res));
                    } else if (img1>20) {
                        String res="trop de graisse";
                        interpret.setText("Interpretation: "+String.valueOf(res));
                    }

                } else if (genreF.isSelected()) {
                    sexe=0;
                    double img1=(1.5*img)+(0.70*number3)-(3.6*sexe)-1.4;
                    resultat.setText("Votre IMG est "+ String.valueOf(img1)+"%");
                    if(img1<25){
                        String res="trop maigre";
                        interpret.setText("Interpretation: "+String.valueOf(res));
                    } else if (img1>25 && img1<30) {
                        String res="pourcentage normal";
                        interpret.setText("Interpretation: "+String.valueOf(res));
                    } else if (img1>30) {
                        String res="trop de graisse";
                        interpret.setText("Interpretation: "+String.valueOf(res));
                    }
                }
                
            }
        }
    });
    }
}