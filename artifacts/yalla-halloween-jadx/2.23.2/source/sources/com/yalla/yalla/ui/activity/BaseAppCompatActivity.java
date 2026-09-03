package com.yalla.yalla.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.app.application.App;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import me.jessyan.autosize.AutoSizeCompat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.oo000o;
import p590o0oOooo0.oOOo0O00;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/BaseAppCompatActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public class BaseAppCompatActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Function3<? super Integer, ? super Integer, ? super Intent, Unit> f24677OooO0o0;

    public void OooOOO() {
        overridePendingTransition(oo000o.anim_activity_open_enter, oo000o.anim_activity_open_exit);
    }

    public void OooOOO0() {
        overridePendingTransition(oo000o.anim_activity_close_enter, oo000o.anim_activity_close_exit);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@Nullable Context context) {
        App app = App.f22232OooO0o;
        Intrinsics.checkNotNullExpressionValue(app, "getContext(...)");
        OooOo00.OooO0o(app);
        if (context != null) {
            try {
                Locale locale = new Locale(OooOo00.OooO0O0(), oOOo0O00.OooO00o().getCountry(), oOOo0O00.OooO00o().getVariant());
                Resources resources = context.getResources();
                Configuration configuration = resources.getConfiguration();
                configuration.setLocale(locale);
                resources.updateConfiguration(configuration, resources.getDisplayMetrics());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        OooOOO0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            AutoSizeCompat.autoConvertDensityOfGlobal(super.getResources());
        }
        Resources resources = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return resources;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        Function3<? super Integer, ? super Integer, ? super Intent, Unit> function3 = this.f24677OooO0o0;
        if (function3 != null) {
            Intrinsics.checkNotNull(function3);
            function3.invoke(Integer.valueOf(i), Integer.valueOf(i2), intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (isDestroyed() || isFinishing()) {
            return;
        }
        try {
            super.onBackPressed();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        App app = App.f22232OooO0o;
        Intrinsics.checkNotNullExpressionValue(app, "getContext(...)");
        OooOo00.OooO0o(app);
        OooOo00.OooO0o(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        App app = App.f22232OooO0o;
        Intrinsics.checkNotNullExpressionValue(app, "getContext(...)");
        OooOo00.OooO0o(app);
        OooOo00.OooO0o(this);
        super.onCreate(bundle);
        OooOOO();
    }
}
