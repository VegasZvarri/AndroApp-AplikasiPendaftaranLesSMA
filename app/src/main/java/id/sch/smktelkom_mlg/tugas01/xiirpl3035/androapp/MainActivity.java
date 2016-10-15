package id.sch.smktelkom_mlg.tugas01.xiirpl3035.androapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvHasil;
    RadioGroup rg;
    CheckBox cb1, cb2, cb3;
    EditText etinput;
    Spinner spumur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHasil = (TextView) findViewById(R.id.textViewHasil);
        rg = (RadioGroup) findViewById(R.id.rgpilihan);
        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        etinput = (EditText) findViewById(R.id.editTextNama);
        spumur = (Spinner) findViewById(R.id.spinnerUmur);

        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
                etinput.setText("");
            }
        });

    }

    private void doClick()
    {
        String hasil = "";
        if (rg.getCheckedRadioButtonId()!=-1){
            RadioButton rB = (RadioButton)
                    findViewById(rg.getCheckedRadioButtonId());
            hasil = rB.getText().toString();
        }

        String hasil2 = " \nKelas :";
        int startlen = hasil2.length();
        if(cb1.isChecked())hasil2+=cb1.getText()+"\n";
        if(cb2.isChecked())hasil2+=cb2.getText()+"\n";
        if(cb3.isChecked())hasil2+=cb3.getText()+"\n";

        String input = etinput.getText().toString();
        tvHasil.setText("Pendaftaran Berhasil\n"+"Data anda : \n" +"Nama : "+ input+"\n" +"Kelamin : "+ hasil + hasil2+"\nUmur : "+
                spumur.getSelectedItem().toString() );


    }

}