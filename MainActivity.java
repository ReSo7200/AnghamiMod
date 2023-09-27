package com.reso.anghamimod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import java.io.DataOutputStream;
import java.util.Objects;
import eu.chainfire.libsuperuser.Shell;

public class MainActivity extends AppCompatActivity {
    String AG_PACKAGE_NAME = "com.anghami";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void replaceBracketText(SpannableString spannableString, CharSequence formattedText, String bracketText, int... colors) {
        int startIndex = 0;
        while (startIndex != -1) {
            startIndex = formattedText.toString().indexOf(bracketText, startIndex);
            if (startIndex != -1) {
                int endIndex = startIndex + bracketText.length();
                for (int color : colors) {
                    spannableString.setSpan(new ForegroundColorSpan(color), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                    if (color == Color.YELLOW) {
                        spannableString.setSpan(new BackgroundColorSpan(Color.BLUE), startIndex, endIndex, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
                    }
                }
                startIndex = endIndex;
            }
        }

        Toast.makeText(this, "Module enabled !", Toast.LENGTH_LONG).show();


    }

    public void killAction() {
        Context context = this;
        try {
            if (Shell.SU.available()) {
                Process su = Runtime.getRuntime().exec("su");
                DataOutputStream os = new DataOutputStream(su.getOutputStream());
                os.writeBytes("adb shell" + "\n");
                os.flush();
                os.writeBytes("am force-stop " + AG_PACKAGE_NAME + "\n");
                os.flush();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ignored) {
                }

                //launch instagram
                Intent LaunchIntent = context.getPackageManager().getLaunchIntentForPackage(AG_PACKAGE_NAME);
                context.startActivity(Objects.requireNonNull(LaunchIntent));
            }
        }catch (Exception exception){
            Toast.makeText(context, "Root not granted !", Toast.LENGTH_SHORT).show();
    }}

    public void killIG(View view) {
        killAction();
    }
}