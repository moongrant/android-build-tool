package com.yalla.yalla.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.application.App;
import com.weieyu.yalla.R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import me.jessyan.autosize.AutoSizeCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.oo000o;
import p617o0oo0o.o00000O0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/BaseAppCompatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public class BaseAppCompatActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Function3<? super Integer, ? super Integer, ? super Intent, Unit> f21687Oooo0oO;

    public void OooOOOO() {
        overridePendingTransition(R.anim.anim_activity_close_enter, R.anim.anim_activity_close_exit);
    }

    public void OooOOOo() {
        overridePendingTransition(R.anim.anim_activity_open_enter, R.anim.anim_activity_open_exit);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@Nullable Context context) {
        oo000o.OooO0o(App.f11458Oooo0oO);
        try {
            Locale locale = new Locale(oo000o.OooO00o(), o00000O0.OooO00o().getCountry(), o00000O0.OooO00o().getVariant());
            Resources resources = context.getResources();
            Configuration configuration = resources.getConfiguration();
            configuration.setLocale(locale);
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        } catch (Exception e) {
            e.printStackTrace();
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        OooOOOO();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            AutoSizeCompat.autoConvertDensityOfGlobal(super.getResources());
        }
        Resources resources = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "super.getResources()");
        return resources;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        Function3<? super Integer, ? super Integer, ? super Intent, Unit> function3 = this.f21687Oooo0oO;
        if (function3 != null) {
            Intrinsics.checkNotNull(function3);
            function3.invoke(Integer.valueOf(i), Integer.valueOf(i2), intent);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        oo000o.OooO0o(App.f11458Oooo0oO);
        oo000o.OooO0o(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        oo000o.OooO0o(App.f11458Oooo0oO);
        oo000o.OooO0o(this);
        super.onCreate(bundle);
        OooOOOo();
    }
}
