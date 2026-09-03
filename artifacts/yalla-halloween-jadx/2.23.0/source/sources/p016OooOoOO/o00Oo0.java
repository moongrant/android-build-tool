package p016OooOoOO;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.StyleRes;
import p012OooOo0O.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 extends ContextWrapper {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static Configuration f288OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f289OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Resources.Theme f290OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public LayoutInflater f291OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Configuration f292OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Resources f293OooO0o0;

    @RequiresApi(17)
    public static class OooO00o {
        @DoNotInline
        public static Context OooO00o(o00Oo0 o00oo1, Configuration configuration) {
            return o00oo1.createConfigurationContext(configuration);
        }
    }

    public o00Oo0() {
        super(null);
    }

    public final void OooO00o(Configuration configuration) {
        if (this.f293OooO0o0 != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f292OooO0Oo != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f292OooO0Oo = new Configuration(configuration);
    }

    public final void OooO0O0() {
        if (this.f290OooO0O0 == null) {
            this.f290OooO0O0 = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f290OooO0O0.setTo(theme);
            }
        }
        this.f290OooO0O0.applyStyle(this.f289OooO00o, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f293OooO0o0 == null) {
            Configuration configuration = this.f292OooO0Oo;
            if (configuration == null) {
                this.f293OooO0o0 = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f288OooO0o == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f288OooO0o = configuration2;
                    }
                    if (configuration.equals(f288OooO0o)) {
                        this.f293OooO0o0 = super.getResources();
                    }
                }
                this.f293OooO0o0 = OooO00o.OooO00o(this, this.f292OooO0Oo).getResources();
            }
        }
        return this.f293OooO0o0;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f291OooO0OO == null) {
            this.f291OooO0OO = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f291OooO0OO;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f290OooO0O0;
        if (theme != null) {
            return theme;
        }
        if (this.f289OooO00o == 0) {
            this.f289OooO00o = o0OoOo0.Theme_AppCompat_Light;
        }
        OooO0O0();
        return this.f290OooO0O0;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f289OooO00o != i) {
            this.f289OooO00o = i;
            OooO0O0();
        }
    }

    public o00Oo0(Context context, @StyleRes int i) {
        super(context);
        this.f289OooO00o = i;
    }

    public o00Oo0(Context context, Resources.Theme theme) {
        super(context);
        this.f290OooO0O0 = theme;
    }
}
