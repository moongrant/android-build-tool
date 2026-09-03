package com.app.selectPicture.activity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import p193o00o0O00.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public class BaseFixOrientationActivity extends AppCompatActivity {
    public final boolean OooOOOO() {
        Exception e;
        boolean zBooleanValue;
        try {
            TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes((int[]) Class.forName("com.android.internal.R$styleable").getField("Window").get(null));
            Method method = ActivityInfo.class.getMethod("isTranslucentOrFloating", TypedArray.class);
            method.setAccessible(true);
            zBooleanValue = ((Boolean) method.invoke(null, typedArrayObtainStyledAttributes)).booleanValue();
            try {
                method.setAccessible(false);
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (Exception e3) {
            e = e3;
            zBooleanValue = false;
        }
        return zBooleanValue;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        try {
            Locale locale = new Locale(TextUtils.isEmpty(Oooo000.f33132OooO00o) ? Oooo000.OooO00o().getLanguage() : Oooo000.f33132OooO00o, Oooo000.OooO00o().getCountry(), Oooo000.OooO00o().getVariant());
            Configuration configuration = context.getResources().getConfiguration();
            configuration.setLocale(locale);
            context = context.createConfigurationContext(configuration);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Locale locale2 = new Locale(TextUtils.isEmpty(Oooo000.f33132OooO00o) ? Oooo000.OooO00o().getLanguage() : Oooo000.f33132OooO00o, Oooo000.OooO00o().getCountry(), Oooo000.OooO00o().getVariant());
            Resources resources = context.getResources();
            Configuration configuration2 = resources.getConfiguration();
            configuration2.setLocale(locale2);
            resources.updateConfiguration(configuration2, resources.getDisplayMetrics());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        super.attachBaseContext(context);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        if (Build.VERSION.SDK_INT == 26 && OooOOOO()) {
            try {
                Field declaredField = Activity.class.getDeclaredField("mActivityInfo");
                declaredField.setAccessible(true);
                ((ActivityInfo) declaredField.get(this)).screenOrientation = -1;
                declaredField.setAccessible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    public final void setRequestedOrientation(int i) {
        if (Build.VERSION.SDK_INT == 26 && OooOOOO()) {
            return;
        }
        super.setRequestedOrientation(i);
    }
}
