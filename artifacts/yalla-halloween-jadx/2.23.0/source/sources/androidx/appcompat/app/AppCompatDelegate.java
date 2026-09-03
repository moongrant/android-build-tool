package androidx.appcompat.app;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatDelegate {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o000000O.OooO00o f2289OooO0Oo = new o000000O.OooO00o(new o000000O.OooO0O0());

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static int f2291OooO0o0 = -100;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static androidx.core.os.OooO00o f2290OooO0o = null;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static androidx.core.os.OooO00o f2292OooO0oO = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static Boolean f2293OooO0oo = null;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static boolean f2288OooO = false;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final p188o00o0O.OooOOO0<WeakReference<AppCompatDelegate>> f2294OooOO0 = new p188o00o0O.OooOOO0<>();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final Object f2295OooOO0O = new Object();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final Object f2296OooOO0o = new Object();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface NightMode {
    }

    @RequiresApi(24)
    public static class OooO00o {
        @DoNotInline
        public static LocaleList OooO00o(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    @RequiresApi(33)
    public static class OooO0O0 {
        @DoNotInline
        public static LocaleList OooO00o(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        @DoNotInline
        public static void OooO0O0(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static boolean OooOOO0(Context context) {
        if (f2293OooO0oo == null) {
            try {
                int i = AppLocalesMetadataHolderService.f2390OooO0Oo;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), Build.VERSION.SDK_INT >= 24 ? AppLocalesMetadataHolderService.OooO00o.OooO00o() | 128 : 640).metaData;
                if (bundle != null) {
                    f2293OooO0oo = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f2293OooO0oo = Boolean.FALSE;
            }
        }
        return f2293OooO0oo.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooOo00(@NonNull AppCompatDelegate appCompatDelegate) {
        synchronized (f2295OooOO0O) {
            p188o00o0O.OooOOO0<WeakReference<AppCompatDelegate>> oooOOO0 = f2294OooOO0;
            oooOOO0.getClass();
            o00o0O.OooOOO0.OooO00o oooO00o = new o00o0O.OooOOO0.OooO00o();
            while (oooO00o.hasNext()) {
                AppCompatDelegate appCompatDelegate2 = (AppCompatDelegate) ((WeakReference) oooO00o.next()).get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    oooO00o.remove();
                }
            }
        }
    }

    public abstract MenuInflater OooO();

    public abstract void OooO0OO(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean OooO0Oo();

    @Nullable
    public abstract <T extends View> T OooO0o(@IdRes int i);

    @NonNull
    @CallSuper
    public Context OooO0o0(@NonNull Context context) {
        return context;
    }

    @Nullable
    public Context OooO0oO() {
        return null;
    }

    public int OooO0oo() {
        return -100;
    }

    @Nullable
    public abstract ActionBar OooOO0();

    public abstract void OooOO0O();

    public abstract void OooOO0o();

    public abstract void OooOOO(Configuration configuration);

    public abstract void OooOOOO();

    public abstract void OooOOOo();

    public abstract void OooOOo();

    public abstract void OooOOo0();

    public abstract void OooOOoo();

    public abstract void OooOo(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean OooOo0(int i);

    public abstract void OooOo0O(@LayoutRes int i);

    public abstract void OooOo0o(View view);

    public abstract void OooOoO(@Nullable Toolbar toolbar);

    @RequiresApi(17)
    public abstract void OooOoO0(int i);

    public void OooOoOO(@StyleRes int i) {
    }

    public abstract void OooOoo0(@Nullable CharSequence charSequence);
}
