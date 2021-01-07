package com.example.pt_elements;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;
import android.widget.ViewSwitcher;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class h extends AppCompatActivity {
    private ImageSwitcher switcher;
    private int IMAGES[] = {R. drawable . hydrogen, R. drawable. helium,R. drawable . lithium, R. drawable. beryllium,R. drawable . boron, R. drawable. carbon,R. drawable . nitrogen, R. drawable. oxygen,R. drawable . fluorine, R. drawable. neon,R. drawable . ssodium, R. drawable. magnesium,R. drawable . al1, R. drawable. ssilicon,R. drawable . phosphorus, R. drawable. ssulfur,R. drawable . chlorine, R. drawable. ar1,R. drawable . potassium, R. drawable. calcium,R. drawable . sscandium, R. drawable. ttitanium,R. drawable . vvanadium, R. drawable. chromium,R. drawable . manganese, R. drawable. iron,R. drawable . cobalt, R. drawable. nickel,R. drawable . copper, R. drawable. zzinc,R. drawable . hydrogen, R. drawable. germanium,R. drawable . as1, R. drawable. sselenium,R. drawable . bromine, R. drawable. krypton,R. drawable . rrubidium, R. drawable. sstrontium,R. drawable . yyttrium, R. drawable. zzirconium,R. drawable . niobium, R. drawable. molybdenum,R. drawable . ttechnetium, R. drawable. rruthenium,R. drawable . rrhodium, R. drawable. palladium,R. drawable . ssilver, R. drawable. cadmium,R. drawable . indium, R. drawable. ttin
                           ,R. drawable . antimony, R. drawable. ttellurium,R. drawable . iodine, R. drawable. xxenon,R. drawable . cesium, R. drawable. barium,R. drawable . lanthanum, R. drawable. cerium,R. drawable . praseodymium, R. drawable. neodymium,R. drawable . promethium, R. drawable. ssamarium,R. drawable . europium, R. drawable. gadolinium,R. drawable . tterbium, R. drawable. helium,R. drawable . holmium
            ,R. drawable . erbium, R. drawable. tthulium,R. drawable . yytterbium, R. drawable. lutetium,R. drawable . hafnium, R. drawable. ttantalum,R. drawable . ttungsten, R. drawable. rrhenium,R. drawable . osmium, R. drawable. iridium,R. drawable . hydrogen, R. drawable. gold,R. drawable . mercury, R. drawable. tthallium,R. drawable . lead, R. drawable. bismuth,R. drawable . polonium, R. drawable. astatine,R. drawable . radon, R. drawable. francium,R. drawable . rradium,R. drawable . ac1,R. drawable . tthorium, R. drawable. protactinium,R. drawable . uuranium, R. drawable. neptunium,R. drawable . plutonium, R. drawable. am1,R. drawable . curium, R. drawable. berkelium,R. drawable . uuranium, R. drawable. einsteinium,R. drawable . fermium, R. drawable. mendelevium,R. drawable . nobelium, R. drawable. lawrencium, R. drawable. rrutherfordium,R. drawable . dubnium, R. drawable. sseaborgium,R. drawable . bohrium, R. drawable. hassium,R. drawable . meitnerium, R. drawable. darmstadtium,R. drawable . rroentgenium, R. drawable. copernicium,R. drawable . nihonium, R. drawable. flerovium,R. drawable . moscovium, R. drawable. livermorium,R. drawable . tennessine, R. drawable. oganesson};
    private int imagelenght = IMAGES.length;
    private int mPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_h);
        String position = getIntent().getExtras().getString("count");
        mPosition = Integer.parseInt(position);
        switcher = findViewById(R. id. idImageSwitcher);
        switcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setLayoutParams(new ImageSwitcher.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT,ActionBar.LayoutParams.WRAP_CONTENT));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setImageResource(IMAGES[mPosition]);
                return imageView;
            }
        });
        BottomNavigationView bottomNavigationView=findViewById(R. id. navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_item3:
                    if(mPosition<IMAGES.length-1){
                        mPosition = mPosition +1;
                        switcher.setImageResource(IMAGES[mPosition]);
                    }
                    break;
                    case R.id.action_item1:
                        if(mPosition>0){
                            mPosition = mPosition -1;
                            switcher.setImageResource(IMAGES[mPosition]);
                        }
                        break;
                    case R.id.action_item2:
                        Intent intent = new Intent(getApplicationContext(), Elements.class);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        });
        }
}

