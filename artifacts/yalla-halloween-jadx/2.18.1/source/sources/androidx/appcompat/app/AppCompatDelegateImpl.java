package androidx.appcompat.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.OooO0O0.OooO00o;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.o0000O0;
import androidx.appcompat.widget.o000O00;
import androidx.appcompat.widget.o000O00O;
import androidx.appcompat.widget.o000OOo;
import androidx.core.content.PermissionChecker;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.uc.crashsdk.export.LogType;
import com.umeng.analytics.pro.bz;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o000O0O0.o0000Ooo;
import p021OooOooo.o00oO0o;
import p069o0000oo0.o000OO0O;
import p070o0000ooO.o0O0O00;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AppCompatDelegateImpl extends AppCompatDelegate implements androidx.appcompat.view.menu.OooO0o.OooO00o, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Context f4423Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Object f4424Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public ActionBar f4425OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public OooOO0O f4426OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Window f4427OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final androidx.appcompat.app.OooOO0O f4428OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public p016OooOoO0.OooOo f4429OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public androidx.appcompat.widget.oo000o f4430OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public OooO0OO f4431OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public OooOo f4432OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public p016OooOoO0.OooOO0 f4433OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public ActionBarContextView f4434OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public PopupWindow f4435Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public androidx.appcompat.app.OooOOOO f4436Ooooo0o;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f4438OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public ViewGroup f4439OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public View f4440Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public TextView f4441Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f4442OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public boolean f4443Ooooooo;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    public boolean f4444o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    public boolean f4445o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    public int f4446o000000O;

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public Rect f4448o00000O;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    public Rect f4449o00000O0;

    /* JADX INFO: renamed from: o00000OO, reason: collision with root package name */
    public o000oOoO f4450o00000OO;

    /* JADX INFO: renamed from: o000OOo, reason: collision with root package name */
    public OooOOO0 f4451o000OOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public CharSequence f4452o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public boolean f4453o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f4454o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public boolean f4455o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public boolean f4456o00o0O;

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    public boolean f4457o00oO0O;

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    public boolean f4458o00oO0o;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    public PanelFeatureState[] f4459o00ooo;

    /* JADX INFO: renamed from: o0O0O00, reason: collision with root package name */
    public OooOOOO f4460o0O0O00;

    /* JADX INFO: renamed from: o0OO00O, reason: collision with root package name */
    public boolean f4461o0OO00O;

    /* JADX INFO: renamed from: o0OOO0o, reason: collision with root package name */
    public int f4462o0OOO0o;

    /* JADX INFO: renamed from: o0Oo0oo, reason: collision with root package name */
    public int f4463o0Oo0oo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public boolean f4464o0OoOo0;

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    public boolean f4465o0ooOO0;

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    public boolean f4466o0ooOOo;

    /* JADX INFO: renamed from: o0ooOoO, reason: collision with root package name */
    public Configuration f4467o0ooOoO;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public PanelFeatureState f4468oo000o;

    /* JADX INFO: renamed from: oo0o0Oo, reason: collision with root package name */
    public boolean f4469oo0o0Oo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public boolean f4470ooOO;

    /* JADX INFO: renamed from: o00000Oo, reason: collision with root package name */
    public static final o00oO0o<String, Integer> f4419o00000Oo = new o00oO0o<>();

    /* JADX INFO: renamed from: o00000o0, reason: collision with root package name */
    public static final int[] f4420o00000o0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: o0000Ooo, reason: collision with root package name */
    public static final boolean f4422o0000Ooo = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: o00000oO, reason: collision with root package name */
    public static final boolean f4421o00000oO = true;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public o00000O f4437OooooO0 = null;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    public final OooO00o f4447o000000o = new OooO00o();

    @RequiresApi(24)
    public static class OooO {
        public static void OooO00o(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f4446o000000O & 1) != 0) {
                appCompatDelegateImpl.Oooo00O(0);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl2.f4446o000000O & 4096) != 0) {
                appCompatDelegateImpl2.Oooo00O(108);
            }
            AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl3.f4445o000000 = false;
            appCompatDelegateImpl3.f4446o000000O = 0;
        }
    }

    public interface OooO0O0 {
    }

    public final class OooO0OO implements androidx.appcompat.view.menu.OooOOO0.OooO00o {
        public OooO0OO() {
        }

        @Override // androidx.appcompat.view.menu.OooOOO0.OooO00o
        public final void OooO0OO(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o, boolean z) {
            AppCompatDelegateImpl.this.OooOoo(oooO0o);
        }

        @Override // androidx.appcompat.view.menu.OooOOO0.OooO00o
        public final boolean OooO0Oo(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o) {
            Window.Callback callbackOooo0oO = AppCompatDelegateImpl.this.Oooo0oO();
            if (callbackOooo0oO == null) {
                return true;
            }
            callbackOooo0oO.onMenuOpened(108, oooO0o);
            return true;
        }
    }

    public class OooO0o implements OooOoO0.OooOO0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooOoO0.OooOO0.OooO00o f4473OooO00o;

        public class OooO00o extends o0000Ooo {
            public OooO00o() {
            }

            @Override // o000O0O0.o00000OO
            public final void OooO00o() {
                AppCompatDelegateImpl.this.f4434OoooOoo.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f4435Ooooo00;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f4434OoooOoo.getParent() instanceof View) {
                    View view = (View) AppCompatDelegateImpl.this.f4434OoooOoo.getParent();
                    WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    ViewCompat.OooOOO0.OooO0OO(view);
                }
                AppCompatDelegateImpl.this.f4434OoooOoo.OooO0oo();
                AppCompatDelegateImpl.this.f4437OooooO0.OooO0Oo(null);
                AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
                appCompatDelegateImpl2.f4437OooooO0 = null;
                ViewGroup viewGroup = appCompatDelegateImpl2.f4439OooooOo;
                WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                ViewCompat.OooOOO0.OooO0OO(viewGroup);
            }
        }

        public OooO0o(OooOoO0.OooOO0.OooO00o oooO00o) {
            this.f4473OooO00o = oooO00o;
        }

        @Override // OooOoO0.OooOO0.OooO00o
        public final boolean OooO00o(p016OooOoO0.OooOO0 oooOO1, Menu menu) {
            ViewGroup viewGroup = AppCompatDelegateImpl.this.f4439OooooOo;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOOO0.OooO0OO(viewGroup);
            return this.f4473OooO00o.OooO00o(oooOO1, menu);
        }

        @Override // OooOoO0.OooOO0.OooO00o
        public final boolean OooO0O0(p016OooOoO0.OooOO0 oooOO1, Menu menu) {
            return this.f4473OooO00o.OooO0O0(oooOO1, menu);
        }

        @Override // OooOoO0.OooOO0.OooO00o
        public final void OooO0OO(p016OooOoO0.OooOO0 oooOO1) {
            this.f4473OooO00o.OooO0OO(oooOO1);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f4435Ooooo00 != null) {
                appCompatDelegateImpl.f4427OoooO00.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.f4436Ooooo0o);
            }
            AppCompatDelegateImpl appCompatDelegateImpl2 = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl2.f4434OoooOoo != null) {
                appCompatDelegateImpl2.Oooo00o();
                AppCompatDelegateImpl appCompatDelegateImpl3 = AppCompatDelegateImpl.this;
                o00000O o00000oOooO0O0 = ViewCompat.OooO0O0(appCompatDelegateImpl3.f4434OoooOoo);
                o00000oOooO0O0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                appCompatDelegateImpl3.f4437OooooO0 = o00000oOooO0O0;
                AppCompatDelegateImpl.this.f4437OooooO0.OooO0Oo(new OooO00o());
            }
            androidx.appcompat.app.OooOO0O oooOO0O = AppCompatDelegateImpl.this.f4428OoooO0O;
            if (oooOO0O != null) {
                oooOO0O.OooO0OO();
            }
            AppCompatDelegateImpl appCompatDelegateImpl4 = AppCompatDelegateImpl.this;
            appCompatDelegateImpl4.f4433OoooOoO = null;
            ViewGroup viewGroup = appCompatDelegateImpl4.f4439OooooOo;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOOO0.OooO0OO(viewGroup);
        }

        @Override // OooOoO0.OooOO0.OooO00o
        public final boolean OooO0Oo(p016OooOoO0.OooOO0 oooOO1, MenuItem menuItem) {
            return this.f4473OooO00o.OooO0Oo(oooOO1, menuItem);
        }
    }

    @RequiresApi(26)
    public static class OooOO0 {
        public static void OooO00o(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode & 3;
            if (i != i2) {
                configuration3.colorMode |= i2;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode & 12;
            if (i3 != i4) {
                configuration3.colorMode |= i4;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public abstract class OooOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO00o f4481OooO00o;

        public class OooO00o extends BroadcastReceiver {
            public OooO00o() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                OooOOO.this.OooO0Oo();
            }
        }

        public OooOOO() {
        }

        public final void OooO00o() {
            OooO00o oooO00o = this.f4481OooO00o;
            if (oooO00o != null) {
                try {
                    AppCompatDelegateImpl.this.f4423Oooo.unregisterReceiver(oooO00o);
                } catch (IllegalArgumentException unused) {
                }
                this.f4481OooO00o = null;
            }
        }

        @Nullable
        public abstract IntentFilter OooO0O0();

        public abstract int OooO0OO();

        public abstract void OooO0Oo();

        public final void OooO0o0() {
            OooO00o();
            IntentFilter intentFilterOooO0O0 = OooO0O0();
            if (intentFilterOooO0O0 == null || intentFilterOooO0O0.countActions() == 0) {
                return;
            }
            if (this.f4481OooO00o == null) {
                this.f4481OooO00o = new OooO00o();
            }
            AppCompatDelegateImpl.this.f4423Oooo.registerReceiver(this.f4481OooO00o, intentFilterOooO0O0);
        }
    }

    public class OooOOO0 extends OooOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final PowerManager f4484OooO0OO;

        public OooOOO0(Context context) {
            super();
            this.f4484OooO0OO = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOOO
        public final IntentFilter OooO0O0() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOOO
        public final int OooO0OO() {
            return this.f4484OooO0OO.isPowerSaveMode() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOOO
        public final void OooO0Oo() {
            AppCompatDelegateImpl.this.OooOoO0();
        }
    }

    public class OooOOOO extends OooOOO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00Ooo f4486OooO0OO;

        public OooOOOO(o00Ooo o00ooo2) {
            super();
            this.f4486OooO0OO = o00ooo2;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOOO
        public final IntentFilter OooO0O0() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOOO
        public final int OooO0OO() {
            boolean z;
            long j;
            long j2;
            o00Ooo o00ooo2 = this.f4486OooO0OO;
            o00Ooo.OooO00o oooO00o = o00ooo2.f4563OooO0OO;
            if (oooO00o.f4565OooO0O0 > System.currentTimeMillis()) {
                z = oooO00o.f4564OooO00o;
            } else {
                Location locationOooO00o = PermissionChecker.OooO00o(o00ooo2.f4561OooO00o, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? o00ooo2.OooO00o("network") : null;
                Location locationOooO00o2 = PermissionChecker.OooO00o(o00ooo2.f4561OooO00o, "android.permission.ACCESS_FINE_LOCATION") == 0 ? o00ooo2.OooO00o("gps") : null;
                if (locationOooO00o2 == null || locationOooO00o == null ? locationOooO00o2 != null : locationOooO00o2.getTime() > locationOooO00o.getTime()) {
                    locationOooO00o = locationOooO00o2;
                }
                if (locationOooO00o != null) {
                    o00Ooo.OooO00o oooO00o2 = o00ooo2.f4563OooO0OO;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (o00Oo0.f4556OooO0Oo == null) {
                        o00Oo0.f4556OooO0Oo = new o00Oo0();
                    }
                    o00Oo0 o00oo1 = o00Oo0.f4556OooO0Oo;
                    o00oo1.OooO00o(jCurrentTimeMillis - 86400000, locationOooO00o.getLatitude(), locationOooO00o.getLongitude());
                    o00oo1.OooO00o(jCurrentTimeMillis, locationOooO00o.getLatitude(), locationOooO00o.getLongitude());
                    boolean z2 = o00oo1.f4559OooO0OO == 1;
                    long j3 = o00oo1.f4558OooO0O0;
                    long j4 = o00oo1.f4557OooO00o;
                    o00oo1.OooO00o(jCurrentTimeMillis + 86400000, locationOooO00o.getLatitude(), locationOooO00o.getLongitude());
                    long j5 = o00oo1.f4558OooO0O0;
                    if (j3 == -1 || j4 == -1) {
                        j = 43200000 + jCurrentTimeMillis;
                    } else {
                        if (jCurrentTimeMillis > j4) {
                            j2 = j5 + 0;
                        } else {
                            j2 = jCurrentTimeMillis > j3 ? j4 + 0 : j3 + 0;
                        }
                        j = j2 + 60000;
                    }
                    oooO00o2.f4564OooO00o = z2;
                    oooO00o2.f4565OooO0O0 = j;
                    z = oooO00o.f4564OooO00o;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    z = i < 6 || i >= 22;
                }
            }
            return z ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOOO
        public final void OooO0Oo() {
            AppCompatDelegateImpl.this.OooOoO0();
        }
    }

    public final class OooOo implements androidx.appcompat.view.menu.OooOOO0.OooO00o {
        public OooOo() {
        }

        @Override // androidx.appcompat.view.menu.OooOOO0.OooO00o
        public final void OooO0OO(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o, boolean z) {
            androidx.appcompat.view.menu.OooO0o oooO0oOooOO0o = oooO0o.OooOO0o();
            boolean z2 = oooO0oOooOO0o != oooO0o;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (z2) {
                oooO0o = oooO0oOooOO0o;
            }
            PanelFeatureState panelFeatureStateOooo0OO = appCompatDelegateImpl.Oooo0OO(oooO0o);
            if (panelFeatureStateOooo0OO != null) {
                if (!z2) {
                    AppCompatDelegateImpl.this.OooOooO(panelFeatureStateOooo0OO, z);
                } else {
                    AppCompatDelegateImpl.this.OooOoo0(panelFeatureStateOooo0OO.f4491OooO00o, panelFeatureStateOooo0OO, oooO0oOooOO0o);
                    AppCompatDelegateImpl.this.OooOooO(panelFeatureStateOooo0OO, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.OooOOO0.OooO00o
        public final boolean OooO0Oo(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o) {
            Window.Callback callbackOooo0oO;
            if (oooO0o != oooO0o.OooOO0o()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f4464o0OoOo0 || (callbackOooo0oO = appCompatDelegateImpl.Oooo0oO()) == null || AppCompatDelegateImpl.this.f4466o0ooOOo) {
                return true;
            }
            callbackOooo0oO.onMenuOpened(108, oooO0o);
            return true;
        }
    }

    public class OooOo00 extends ContentFrameLayout {
        public OooOo00(Context context) {
            super(context);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.Oooo000(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.OooOooO(appCompatDelegateImpl.Oooo0o(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(p012OooOo0.OooOO0O.OooO0O0(getContext(), i));
        }
    }

    public static final class PanelFeatureState {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooO0O0 f4490OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f4491OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f4492OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f4493OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f4494OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public View f4495OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooOo00 f4496OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public View f4497OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooO0o f4498OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public p016OooOoO0.OooOOO0 f4499OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f4500OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f4501OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f4502OooOOO = false;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f4503OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f4504OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public Bundle f4505OooOOOo;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f4506Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public boolean f4507Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public Bundle f4508Oooo0oo;

            public class OooO00o implements Parcelable.ClassLoaderCreator<SavedState> {
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return SavedState.OooO00o(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SavedState[i];
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    return SavedState.OooO00o(parcel, null);
                }
            }

            public static SavedState OooO00o(Parcel parcel, ClassLoader classLoader) {
                SavedState savedState = new SavedState();
                savedState.f4506Oooo0o = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                savedState.f4507Oooo0oO = z;
                if (z) {
                    savedState.f4508Oooo0oo = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f4506Oooo0o);
                parcel.writeInt(this.f4507Oooo0oO ? 1 : 0);
                if (this.f4507Oooo0oO) {
                    parcel.writeBundle(this.f4508Oooo0oo);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.f4491OooO00o = i;
        }

        public final void OooO00o(androidx.appcompat.view.menu.OooO0o oooO0o) {
            androidx.appcompat.view.menu.OooO0O0 oooO0O0;
            androidx.appcompat.view.menu.OooO0o oooO0o2 = this.f4498OooO0oo;
            if (oooO0o == oooO0o2) {
                return;
            }
            if (oooO0o2 != null) {
                oooO0o2.OooOo0O(this.f4490OooO);
            }
            this.f4498OooO0oo = oooO0o;
            if (oooO0o == null || (oooO0O0 = this.f4490OooO) == null) {
                return;
            }
            oooO0o.OooO0O0(oooO0O0);
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.OooOO0O oooOO0O, Object obj) {
        o00oO0o<String, Integer> o00oo0o2;
        Integer orDefault;
        AppCompatActivity appCompatActivity;
        this.f4462o0OOO0o = -100;
        this.f4423Oooo = context;
        this.f4428OoooO0O = oooOO0O;
        this.f4424Oooo0oo = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof AppCompatActivity) {
                        appCompatActivity = (AppCompatActivity) context;
                        break;
                    } else if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                appCompatActivity = null;
                break;
            }
            if (appCompatActivity != null) {
                this.f4462o0OOO0o = appCompatActivity.OooOO0O().OooO0o();
            }
        }
        if (this.f4462o0OOO0o == -100 && (orDefault = (o00oo0o2 = f4419o00000Oo).getOrDefault(this.f4424Oooo0oo.getClass().getName(), null)) != null) {
            this.f4462o0OOO0o = orDefault.intValue();
            o00oo0o2.remove(this.f4424Oooo0oo.getClass().getName());
        }
        if (window != null) {
            OooOoOO(window);
        }
        androidx.appcompat.widget.OooOO0O.OooO0o0();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooO() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f4423Oooo);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.view.menu.OooO0o.OooO00o
    public final boolean OooO00o(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o, @NonNull MenuItem menuItem) {
        PanelFeatureState panelFeatureStateOooo0OO;
        Window.Callback callbackOooo0oO = Oooo0oO();
        if (callbackOooo0oO == null || this.f4466o0ooOOo || (panelFeatureStateOooo0OO = Oooo0OO(oooO0o.OooOO0o())) == null) {
            return false;
        }
        return callbackOooo0oO.onMenuItemSelected(panelFeatureStateOooo0OO.f4491OooO00o, menuItem);
    }

    @Override // androidx.appcompat.view.menu.OooO0o.OooO00o
    public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o) {
        androidx.appcompat.widget.oo000o oo000oVar = this.f4430OoooOOO;
        if (oo000oVar == null || !oo000oVar.OooO0Oo() || (ViewConfiguration.get(this.f4423Oooo).hasPermanentMenuKey() && !this.f4430OoooOOO.OooO0o0())) {
            PanelFeatureState panelFeatureStateOooo0o = Oooo0o(0);
            panelFeatureStateOooo0o.f4502OooOOO = true;
            OooOooO(panelFeatureStateOooo0o, false);
            OoooO0(panelFeatureStateOooo0o, null);
            return;
        }
        Window.Callback callbackOooo0oO = Oooo0oO();
        if (this.f4430OoooOOO.OooO0O0()) {
            this.f4430OoooOOO.OooO0o();
            if (this.f4466o0ooOOo) {
                return;
            }
            callbackOooo0oO.onPanelClosed(108, Oooo0o(0).f4498OooO0oo);
            return;
        }
        if (callbackOooo0oO == null || this.f4466o0ooOOo) {
            return;
        }
        if (this.f4445o000000 && (1 & this.f4446o000000O) != 0) {
            this.f4427OoooO00.getDecorView().removeCallbacks(this.f4447o000000o);
            this.f4447o000000o.run();
        }
        PanelFeatureState panelFeatureStateOooo0o2 = Oooo0o(0);
        androidx.appcompat.view.menu.OooO0o oooO0o2 = panelFeatureStateOooo0o2.f4498OooO0oo;
        if (oooO0o2 == null || panelFeatureStateOooo0o2.f4504OooOOOO || !callbackOooo0oO.onPreparePanel(0, panelFeatureStateOooo0o2.f4497OooO0oO, oooO0o2)) {
            return;
        }
        callbackOooo0oO.onMenuOpened(108, panelFeatureStateOooo0o2.f4498OooO0oo);
        this.f4430OoooOOO.OooO0oO();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooO0OO(View view, ViewGroup.LayoutParams layoutParams) {
        Oooo0();
        ((ViewGroup) this.f4439OooooOo.findViewById(R.id.content)).addView(view, layoutParams);
        this.f4426OoooO0.OooO00o(this.f4427OoooO00.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @NonNull
    @CallSuper
    public final Context OooO0Oo(@NonNull Context context) {
        Configuration configuration;
        boolean z;
        this.f4457o00oO0O = true;
        int i = this.f4462o0OOO0o;
        if (i == -100) {
            i = -100;
        }
        int iOoooO00 = OoooO00(context, i);
        if (f4421o00000oO && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(OooOooo(context, iOoooO00, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof p016OooOoO0.OooOOO0) {
            try {
                ((p016OooOoO0.OooOOO0) context).OooO00o(OooOooo(context, iOoooO00, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f4422o0000Ooo) {
            return context;
        }
        int i2 = Build.VERSION.SDK_INT;
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (configuration3.equals(configuration4)) {
            configuration = null;
        } else {
            configuration = new Configuration();
            configuration.fontScale = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i3 = configuration3.mcc;
                int i4 = configuration4.mcc;
                if (i3 != i4) {
                    configuration.mcc = i4;
                }
                int i5 = configuration3.mnc;
                int i6 = configuration4.mnc;
                if (i5 != i6) {
                    configuration.mnc = i6;
                }
                if (i2 >= 24) {
                    OooO.OooO00o(configuration3, configuration4, configuration);
                } else if (!o000OO0O.OooO0OO.OooO00o(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i7 = configuration3.touchscreen;
                int i8 = configuration4.touchscreen;
                if (i7 != i8) {
                    configuration.touchscreen = i8;
                }
                int i9 = configuration3.keyboard;
                int i10 = configuration4.keyboard;
                if (i9 != i10) {
                    configuration.keyboard = i10;
                }
                int i11 = configuration3.keyboardHidden;
                int i12 = configuration4.keyboardHidden;
                if (i11 != i12) {
                    configuration.keyboardHidden = i12;
                }
                int i13 = configuration3.navigation;
                int i14 = configuration4.navigation;
                if (i13 != i14) {
                    configuration.navigation = i14;
                }
                int i15 = configuration3.navigationHidden;
                int i16 = configuration4.navigationHidden;
                if (i15 != i16) {
                    configuration.navigationHidden = i16;
                }
                int i17 = configuration3.orientation;
                int i18 = configuration4.orientation;
                if (i17 != i18) {
                    configuration.orientation = i18;
                }
                int i19 = configuration3.screenLayout & 15;
                int i20 = configuration4.screenLayout & 15;
                if (i19 != i20) {
                    configuration.screenLayout |= i20;
                }
                int i21 = configuration3.screenLayout & 192;
                int i22 = configuration4.screenLayout & 192;
                if (i21 != i22) {
                    configuration.screenLayout |= i22;
                }
                int i23 = configuration3.screenLayout & 48;
                int i24 = configuration4.screenLayout & 48;
                if (i23 != i24) {
                    configuration.screenLayout |= i24;
                }
                int i25 = configuration3.screenLayout & LogType.UNEXP_OTHER;
                int i26 = configuration4.screenLayout & LogType.UNEXP_OTHER;
                if (i25 != i26) {
                    configuration.screenLayout |= i26;
                }
                if (i2 >= 26) {
                    OooOO0.OooO00o(configuration3, configuration4, configuration);
                }
                int i27 = configuration3.uiMode & 15;
                int i28 = configuration4.uiMode & 15;
                if (i27 != i28) {
                    configuration.uiMode |= i28;
                }
                int i29 = configuration3.uiMode & 48;
                int i30 = configuration4.uiMode & 48;
                if (i29 != i30) {
                    configuration.uiMode |= i30;
                }
                int i31 = configuration3.screenWidthDp;
                int i32 = configuration4.screenWidthDp;
                if (i31 != i32) {
                    configuration.screenWidthDp = i32;
                }
                int i33 = configuration3.screenHeightDp;
                int i34 = configuration4.screenHeightDp;
                if (i33 != i34) {
                    configuration.screenHeightDp = i34;
                }
                int i35 = configuration3.smallestScreenWidthDp;
                int i36 = configuration4.smallestScreenWidthDp;
                if (i35 != i36) {
                    configuration.smallestScreenWidthDp = i36;
                }
                int i37 = configuration3.densityDpi;
                int i38 = configuration4.densityDpi;
                if (i37 != i38) {
                    configuration.densityDpi = i38;
                }
            }
        }
        Configuration configurationOooOooo = OooOooo(context, iOoooO00, configuration, true);
        p016OooOoO0.OooOOO0 oooOOO0 = new p016OooOoO0.OooOOO0(context, OooOo00.OooOOO.Theme_AppCompat_Empty);
        oooOOO0.OooO00o(configurationOooOooo);
        try {
            z = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z) {
            Resources.Theme theme = oooOOO0.getTheme();
            int i39 = Build.VERSION.SDK_INT;
            if (i39 >= 29) {
                p081o000OoO.oo000o.OooO00o(theme);
            } else if (i39 >= 23) {
                synchronized (p081o000OoO.o00Ooo.f28342OooO00o) {
                    if (!p081o000OoO.o00Ooo.f28344OooO0OO) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            p081o000OoO.o00Ooo.f28343OooO0O0 = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        p081o000OoO.o00Ooo.f28344OooO0OO = true;
                    }
                    Method method = p081o000OoO.o00Ooo.f28343OooO0O0;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            p081o000OoO.o00Ooo.f28343OooO0O0 = null;
                        }
                    }
                }
            }
        }
        return oooOOO0;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final int OooO0o() {
        return this.f4462o0OOO0o;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @Nullable
    public final <T extends View> T OooO0o0(@IdRes int i) {
        Oooo0();
        return (T) this.f4427OoooO00.findViewById(i);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final MenuInflater OooO0oO() {
        if (this.f4429OoooOO0 == null) {
            Oooo0oo();
            ActionBar actionBar = this.f4425OoooO;
            this.f4429OoooOO0 = new p016OooOoO0.OooOo(actionBar != null ? actionBar.OooO0o0() : this.f4423Oooo);
        }
        return this.f4429OoooOO0;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBar OooO0oo() {
        Oooo0oo();
        return this.f4425OoooO;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOO0() {
        if (this.f4425OoooO != null) {
            Oooo0oo();
            if (this.f4425OoooO.OooO0o()) {
                return;
            }
            Oooo(0);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOO0O(Configuration configuration) {
        if (this.f4464o0OoOo0 && this.f4438OooooOO) {
            Oooo0oo();
            ActionBar actionBar = this.f4425OoooO;
            if (actionBar != null) {
                actionBar.OooO0oO();
            }
        }
        androidx.appcompat.widget.OooOO0O oooOO0OOooO00o = androidx.appcompat.widget.OooOO0O.OooO00o();
        Context context = this.f4423Oooo;
        synchronized (oooOO0OOooO00o) {
            o000OOo o000ooo2 = oooOO0OOooO00o.f5088OooO00o;
            synchronized (o000ooo2) {
                p021OooOooo.o00Ooo<WeakReference<Drawable.ConstantState>> o00ooo2 = o000ooo2.f5399OooO0Oo.get(context);
                if (o00ooo2 != null) {
                    o00ooo2.OooO0Oo();
                }
            }
        }
        this.f4467o0ooOoO = new Configuration(this.f4423Oooo.getResources().getConfiguration());
        OooOoO(false);
        configuration.updateFrom(this.f4423Oooo.getResources().getConfiguration());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOO0o() {
        this.f4457o00oO0O = true;
        OooOoO(false);
        Oooo0O0();
        Object obj = this.f4424Oooo0oo;
        if (obj instanceof Activity) {
            String strOooO0OO = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    strOooO0OO = o0O0O00.OooO0OO(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (strOooO0OO != null) {
                ActionBar actionBar = this.f4425OoooO;
                if (actionBar == null) {
                    this.f4444o00000 = true;
                } else {
                    actionBar.OooOO0o(true);
                }
            }
            synchronized (AppCompatDelegate.f4418Oooo0oO) {
                AppCompatDelegate.OooOOo0(this);
                AppCompatDelegate.f4417Oooo0o.add(new WeakReference<>(this));
            }
        }
        this.f4467o0ooOoO = new Configuration(this.f4423Oooo.getResources().getConfiguration());
        this.f4465o0ooOO0 = true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOOO() {
        Oooo0oo();
        ActionBar actionBar = this.f4425OoooO;
        if (actionBar != null) {
            actionBar.OooOOO(true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOOO0() {
        if (this.f4424Oooo0oo instanceof Activity) {
            synchronized (AppCompatDelegate.f4418Oooo0oO) {
                AppCompatDelegate.OooOOo0(this);
            }
        }
        if (this.f4445o000000) {
            this.f4427OoooO00.getDecorView().removeCallbacks(this.f4447o000000o);
        }
        this.f4466o0ooOOo = true;
        if (this.f4462o0OOO0o != -100) {
            Object obj = this.f4424Oooo0oo;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f4419o00000Oo.put(this.f4424Oooo0oo.getClass().getName(), Integer.valueOf(this.f4462o0OOO0o));
            } else {
                f4419o00000Oo.remove(this.f4424Oooo0oo.getClass().getName());
            }
        } else {
            f4419o00000Oo.remove(this.f4424Oooo0oo.getClass().getName());
        }
        ActionBar actionBar = this.f4425OoooO;
        if (actionBar != null) {
            actionBar.OooO0oo();
        }
        OooOOOO oooOOOO = this.f4460o0O0O00;
        if (oooOOOO != null) {
            oooOOOO.OooO00o();
        }
        OooOOO0 oooOOO0 = this.f4451o000OOo;
        if (oooOOO0 != null) {
            oooOOO0.OooO00o();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOOOO() {
        OooOoO0();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOOOo() {
        Oooo0oo();
        ActionBar actionBar = this.f4425OoooO;
        if (actionBar != null) {
            actionBar.OooOOO(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean OooOOo(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f4455o00Ooo && i == 108) {
            return false;
        }
        if (this.f4464o0OoOo0 && i == 1) {
            this.f4464o0OoOo0 = false;
        }
        if (i == 1) {
            OoooOO0();
            this.f4455o00Ooo = true;
            return true;
        }
        if (i == 2) {
            OoooOO0();
            this.f4442OoooooO = true;
            return true;
        }
        if (i == 5) {
            OoooOO0();
            this.f4443Ooooooo = true;
            return true;
        }
        if (i == 10) {
            OoooOO0();
            this.f4453o00O0O = true;
            return true;
        }
        if (i == 108) {
            OoooOO0();
            this.f4464o0OoOo0 = true;
            return true;
        }
        if (i != 109) {
            return this.f4427OoooO00.requestFeature(i);
        }
        OoooOO0();
        this.f4470ooOO = true;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOOoo(int i) {
        Oooo0();
        ViewGroup viewGroup = (ViewGroup) this.f4439OooooOo.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f4423Oooo).inflate(i, viewGroup);
        this.f4426OoooO0.OooO00o(this.f4427OoooO00.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOo(CharSequence charSequence) {
        this.f4452o000oOoO = charSequence;
        androidx.appcompat.widget.oo000o oo000oVar = this.f4430OoooOOO;
        if (oo000oVar != null) {
            oo000oVar.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.f4425OoooO;
        if (actionBar != null) {
            actionBar.OooOOOO(charSequence);
            return;
        }
        TextView textView = this.f4441Oooooo0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOo0(View view, ViewGroup.LayoutParams layoutParams) {
        Oooo0();
        ViewGroup viewGroup = (ViewGroup) this.f4439OooooOo.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f4426OoooO0.OooO00o(this.f4427OoooO00.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOo00(View view) {
        Oooo0();
        ViewGroup viewGroup = (ViewGroup) this.f4439OooooOo.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f4426OoooO0.OooO00o(this.f4427OoooO00.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOo0O(Toolbar toolbar) {
        if (this.f4424Oooo0oo instanceof Activity) {
            Oooo0oo();
            ActionBar actionBar = this.f4425OoooO;
            if (actionBar instanceof oo000o) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f4429OoooOO0 = null;
            if (actionBar != null) {
                actionBar.OooO0oo();
            }
            this.f4425OoooO = null;
            if (toolbar != null) {
                Object obj = this.f4424Oooo0oo;
                o00O0O o00o0o2 = new o00O0O(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f4452o000oOoO, this.f4426OoooO0);
                this.f4425OoooO = o00o0o2;
                this.f4426OoooO0.f4477Oooo0oO = o00o0o2.f4544OooO0OO;
            } else {
                this.f4426OoooO0.f4477Oooo0oO = null;
            }
            OooOO0();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOo0o(@StyleRes int i) {
        this.f4463o0Oo0oo = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooOoO(boolean z) {
        boolean z2;
        Object obj;
        int i;
        int i2 = 0;
        if (this.f4466o0ooOOo) {
            return false;
        }
        int i3 = this.f4462o0OOO0o;
        if (i3 == -100) {
            i3 = -100;
        }
        Map map = null;
        obj = null;
        obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Configuration configurationOooOooo = OooOooo(this.f4423Oooo, OoooO00(this.f4423Oooo, i3), null, false);
        Context context = this.f4423Oooo;
        boolean z3 = 1;
        z3 = 1;
        z3 = 1;
        z3 = 1;
        z3 = 1;
        z3 = 1;
        z3 = 1;
        if (this.f4469oo0o0Oo || !(this.f4424Oooo0oo instanceof Activity)) {
            this.f4469oo0o0Oo = true;
            z2 = this.f4461o0OO00O;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                z2 = false;
            } else {
                try {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 29) {
                        i = 269221888;
                    } else {
                        i = i4 >= 24 ? 786432 : 0;
                    }
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f4424Oooo0oo.getClass()), i);
                    this.f4461o0OO00O = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.f4461o0OO00O = false;
                }
                this.f4469oo0o0Oo = true;
                z2 = this.f4461o0OO00O;
            }
        }
        Configuration configuration = this.f4467o0ooOoO;
        if (configuration == null) {
            configuration = this.f4423Oooo.getResources().getConfiguration();
        }
        int i5 = configuration.uiMode & 48;
        int i6 = configurationOooOooo.uiMode & 48;
        if (i5 != i6 && z && !z2 && this.f4457o00oO0O && (f4422o0000Ooo || this.f4465o0ooOO0)) {
            Object obj4 = this.f4424Oooo0oo;
            if ((obj4 instanceof Activity) && !((Activity) obj4).isChild()) {
                Activity activity = (Activity) this.f4424Oooo0oo;
                int i7 = p070o0000ooO.o00Oo0.f28002OooO0OO;
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new p070o0000ooO.o00O0O(activity, i2));
                }
                i2 = 1;
            }
        }
        if (i2 != 0 || i5 == i6) {
            z3 = i2;
        } else {
            Resources resources = this.f4423Oooo.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = i6 | (resources.getConfiguration().uiMode & (-49));
            resources.updateConfiguration(configuration2, null);
            int i8 = Build.VERSION.SDK_INT;
            if (i8 < 26 && i8 < 28) {
                if (i8 >= 24) {
                    if (!o0OoOo0.f4573OooO0oo) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            o0OoOo0.f4572OooO0oO = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e2) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
                        }
                        o0OoOo0.f4573OooO0oo = true;
                    }
                    Field field = o0OoOo0.f4572OooO0oO;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException e3) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                            obj = null;
                        }
                        if (obj != null) {
                            if (!o0OoOo0.f4567OooO0O0) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    o0OoOo0.f4566OooO00o = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e4) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                                }
                                o0OoOo0.f4567OooO0O0 = true;
                            }
                            Field field2 = o0OoOo0.f4566OooO00o;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException e5) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                                }
                            }
                            if (obj2 != null) {
                                o0OoOo0.OooO00o(obj2);
                            }
                        }
                    }
                } else if (i8 >= 23) {
                    if (!o0OoOo0.f4567OooO0O0) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            o0OoOo0.f4566OooO00o = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e6) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e6);
                        }
                        o0OoOo0.f4567OooO0O0 = true;
                    }
                    Field field3 = o0OoOo0.f4566OooO00o;
                    if (field3 != null) {
                        try {
                            obj3 = field3.get(resources);
                        } catch (IllegalAccessException e7) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e7);
                        }
                    }
                    if (obj3 != null) {
                        o0OoOo0.OooO00o(obj3);
                    }
                } else {
                    if (!o0OoOo0.f4567OooO0O0) {
                        try {
                            Field declaredField4 = Resources.class.getDeclaredField("mDrawableCache");
                            o0OoOo0.f4566OooO00o = declaredField4;
                            declaredField4.setAccessible(true);
                        } catch (NoSuchFieldException e8) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e8);
                        }
                        o0OoOo0.f4567OooO0O0 = true;
                    }
                    Field field4 = o0OoOo0.f4566OooO00o;
                    if (field4 != null) {
                        try {
                            map = (Map) field4.get(resources);
                        } catch (IllegalAccessException e9) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e9);
                        }
                        if (map != null) {
                            map.clear();
                        }
                    }
                }
            }
            int i9 = this.f4463o0Oo0oo;
            if (i9 != 0) {
                this.f4423Oooo.setTheme(i9);
                if (Build.VERSION.SDK_INT >= 23) {
                    this.f4423Oooo.getTheme().applyStyle(this.f4463o0Oo0oo, true);
                }
            }
            if (z2) {
                Object obj5 = this.f4424Oooo0oo;
                if (obj5 instanceof Activity) {
                    Activity activity2 = (Activity) obj5;
                    if (activity2 instanceof LifecycleOwner) {
                        if (((LifecycleOwner) activity2).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                            activity2.onConfigurationChanged(configuration2);
                        }
                    } else if (this.f4465o0ooOO0 && !this.f4466o0ooOOo) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                }
            }
        }
        if (z3 != 0) {
            Object obj6 = this.f4424Oooo0oo;
            if (obj6 instanceof AppCompatActivity) {
                Objects.requireNonNull((AppCompatActivity) obj6);
            }
        }
        if (i3 == 0) {
            Oooo0o0(this.f4423Oooo).OooO0o0();
        } else {
            OooOOOO oooOOOO = this.f4460o0O0O00;
            if (oooOOOO != null) {
                oooOOOO.OooO00o();
            }
        }
        if (i3 == 3) {
            Context context2 = this.f4423Oooo;
            if (this.f4451o000OOo == null) {
                this.f4451o000OOo = new OooOOO0(context2);
            }
            this.f4451o000OOo.OooO0o0();
        } else {
            OooOOO0 oooOOO0 = this.f4451o000OOo;
            if (oooOOO0 != null) {
                oooOOO0.OooO00o();
            }
        }
        return z3;
    }

    public final boolean OooOoO0() {
        return OooOoO(true);
    }

    public final void OooOoOO(@NonNull Window window) {
        if (this.f4427OoooO00 != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof OooOO0O) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        OooOO0O oooOO0O = new OooOO0O(callback);
        this.f4426OoooO0 = oooOO0O;
        window.setCallback(oooOO0O);
        o0000O0 o0000o0OooOOo0 = o0000O0.OooOOo0(this.f4423Oooo, null, f4420o00000o0);
        Drawable drawableOooO0oo = o0000o0OooOOo0.OooO0oo(0);
        if (drawableOooO0oo != null) {
            window.setBackgroundDrawable(drawableOooO0oo);
        }
        o0000o0OooOOo0.OooOOoo();
        this.f4427OoooO00 = window;
    }

    public final void OooOoo(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o) {
        if (this.f4456o00o0O) {
            return;
        }
        this.f4456o00o0O = true;
        this.f4430OoooOOO.OooO();
        Window.Callback callbackOooo0oO = Oooo0oO();
        if (callbackOooo0oO != null && !this.f4466o0ooOOo) {
            callbackOooo0oO.onPanelClosed(108, oooO0o);
        }
        this.f4456o00o0O = false;
    }

    public final void OooOoo0(int i, PanelFeatureState panelFeatureState, Menu menu) {
        if (menu == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f4459o00ooo;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                menu = panelFeatureState.f4498OooO0oo;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f4503OooOOO0) && !this.f4466o0ooOOo) {
            OooOO0O oooOO0O = this.f4426OoooO0;
            Window.Callback callback = this.f4427OoooO00.getCallback();
            Objects.requireNonNull(oooOO0O);
            try {
                oooOO0O.f4480OoooO00 = true;
                callback.onPanelClosed(i, menu);
            } finally {
                oooOO0O.f4480OoooO00 = false;
            }
        }
    }

    public final void OooOooO(PanelFeatureState panelFeatureState, boolean z) {
        OooOo00 oooOo00;
        androidx.appcompat.widget.oo000o oo000oVar;
        if (z && panelFeatureState.f4491OooO00o == 0 && (oo000oVar = this.f4430OoooOOO) != null && oo000oVar.OooO0O0()) {
            OooOoo(panelFeatureState.f4498OooO0oo);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f4423Oooo.getSystemService("window");
        if (windowManager != null && panelFeatureState.f4503OooOOO0 && (oooOo00 = panelFeatureState.f4496OooO0o0) != null) {
            windowManager.removeView(oooOo00);
            if (z) {
                OooOoo0(panelFeatureState.f4491OooO00o, panelFeatureState, null);
            }
        }
        panelFeatureState.f4500OooOO0O = false;
        panelFeatureState.f4501OooOO0o = false;
        panelFeatureState.f4503OooOOO0 = false;
        panelFeatureState.f4495OooO0o = null;
        panelFeatureState.f4502OooOOO = true;
        if (this.f4468oo000o == panelFeatureState) {
            this.f4468oo000o = null;
        }
    }

    @NonNull
    public final Configuration OooOooo(@NonNull Context context, int i, @Nullable Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    public final void Oooo(int i) {
        this.f4446o000000O = (1 << i) | this.f4446o000000O;
        if (this.f4445o000000) {
            return;
        }
        View decorView = this.f4427OoooO00.getDecorView();
        OooO00o oooO00o = this.f4447o000000o;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooO0o.OooOOO0(decorView, oooO00o);
        this.f4445o000000 = true;
    }

    public final void Oooo0() {
        ViewGroup viewGroup;
        if (this.f4438OooooOO) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = this.f4423Oooo.obtainStyledAttributes(OooOo00.OooOOOO.AppCompatTheme);
        int i = OooOo00.OooOOOO.AppCompatTheme_windowActionBar;
        if (!typedArrayObtainStyledAttributes.hasValue(i)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(OooOo00.OooOOOO.AppCompatTheme_windowNoTitle, false)) {
            OooOOo(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i, false)) {
            OooOOo(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(OooOo00.OooOOOO.AppCompatTheme_windowActionBarOverlay, false)) {
            OooOOo(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(OooOo00.OooOOOO.AppCompatTheme_windowActionModeOverlay, false)) {
            OooOOo(10);
        }
        this.f4454o00Oo0 = typedArrayObtainStyledAttributes.getBoolean(OooOo00.OooOOOO.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        Oooo0O0();
        this.f4427OoooO00.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f4423Oooo);
        if (this.f4455o00Ooo) {
            viewGroup = this.f4453o00O0O ? (ViewGroup) layoutInflaterFrom.inflate(OooOo00.OooOO0O.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(OooOo00.OooOO0O.abc_screen_simple, (ViewGroup) null);
        } else if (this.f4454o00Oo0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(OooOo00.OooOO0O.abc_dialog_title_material, (ViewGroup) null);
            this.f4470ooOO = false;
            this.f4464o0OoOo0 = false;
        } else if (this.f4464o0OoOo0) {
            TypedValue typedValue = new TypedValue();
            this.f4423Oooo.getTheme().resolveAttribute(OooOo00.OooO00o.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new p016OooOoO0.OooOOO0(this.f4423Oooo, typedValue.resourceId) : this.f4423Oooo).inflate(OooOo00.OooOO0O.abc_screen_toolbar, (ViewGroup) null);
            androidx.appcompat.widget.oo000o oo000oVar = (androidx.appcompat.widget.oo000o) viewGroup.findViewById(OooOo00.OooOO0.decor_content_parent);
            this.f4430OoooOOO = oo000oVar;
            oo000oVar.setWindowCallback(Oooo0oO());
            if (this.f4470ooOO) {
                this.f4430OoooOOO.OooO0oo(109);
            }
            if (this.f4442OoooooO) {
                this.f4430OoooOOO.OooO0oo(2);
            }
            if (this.f4443Ooooooo) {
                this.f4430OoooOOO.OooO0oo(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("AppCompat does not support the current theme features: { windowActionBar: ");
            sbOooO0o0.append(this.f4464o0OoOo0);
            sbOooO0o0.append(", windowActionBarOverlay: ");
            sbOooO0o0.append(this.f4470ooOO);
            sbOooO0o0.append(", android:windowIsFloating: ");
            sbOooO0o0.append(this.f4454o00Oo0);
            sbOooO0o0.append(", windowActionModeOverlay: ");
            sbOooO0o0.append(this.f4453o00O0O);
            sbOooO0o0.append(", windowNoTitle: ");
            sbOooO0o0.append(this.f4455o00Ooo);
            sbOooO0o0.append(" }");
            throw new IllegalArgumentException(sbOooO0o0.toString());
        }
        androidx.appcompat.app.OooOOO0 oooOOO0 = new androidx.appcompat.app.OooOOO0(this);
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOOO.OooOo0(viewGroup, oooOOO0);
        if (this.f4430OoooOOO == null) {
            this.f4441Oooooo0 = (TextView) viewGroup.findViewById(OooOo00.OooOO0.title);
        }
        Method method = o000O00O.f5378OooO00o;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(OooOo00.OooOO0.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f4427OoooO00.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f4427OoooO00.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new androidx.appcompat.app.OooOOO(this));
        this.f4439OooooOo = viewGroup;
        Object obj = this.f4424Oooo0oo;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f4452o000oOoO;
        if (!TextUtils.isEmpty(title)) {
            androidx.appcompat.widget.oo000o oo000oVar2 = this.f4430OoooOOO;
            if (oo000oVar2 != null) {
                oo000oVar2.setWindowTitle(title);
            } else {
                ActionBar actionBar = this.f4425OoooO;
                if (actionBar != null) {
                    actionBar.OooOOOO(title);
                } else {
                    TextView textView = this.f4441Oooooo0;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f4439OooooOo.findViewById(R.id.content);
        View decorView = this.f4427OoooO00.getDecorView();
        contentFrameLayout2.f4999OoooO0O.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
        if (ViewCompat.OooOO0O.OooO0OO(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = this.f4423Oooo.obtainStyledAttributes(OooOo00.OooOOOO.AppCompatTheme);
        typedArrayObtainStyledAttributes2.getValue(OooOo00.OooOOOO.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(OooOo00.OooOOOO.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        int i2 = OooOo00.OooOOOO.AppCompatTheme_windowFixedWidthMajor;
        if (typedArrayObtainStyledAttributes2.hasValue(i2)) {
            typedArrayObtainStyledAttributes2.getValue(i2, contentFrameLayout2.getFixedWidthMajor());
        }
        int i3 = OooOo00.OooOOOO.AppCompatTheme_windowFixedWidthMinor;
        if (typedArrayObtainStyledAttributes2.hasValue(i3)) {
            typedArrayObtainStyledAttributes2.getValue(i3, contentFrameLayout2.getFixedWidthMinor());
        }
        int i4 = OooOo00.OooOOOO.AppCompatTheme_windowFixedHeightMajor;
        if (typedArrayObtainStyledAttributes2.hasValue(i4)) {
            typedArrayObtainStyledAttributes2.getValue(i4, contentFrameLayout2.getFixedHeightMajor());
        }
        int i5 = OooOo00.OooOOOO.AppCompatTheme_windowFixedHeightMinor;
        if (typedArrayObtainStyledAttributes2.hasValue(i5)) {
            typedArrayObtainStyledAttributes2.getValue(i5, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f4438OooooOO = true;
        PanelFeatureState panelFeatureStateOooo0o = Oooo0o(0);
        if (this.f4466o0ooOOo || panelFeatureStateOooo0o.f4498OooO0oo != null) {
            return;
        }
        Oooo(108);
    }

    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    public final boolean Oooo000(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean zOooO0o;
        boolean zOoooO;
        Object obj = this.f4424Oooo0oo;
        if (((obj instanceof o000O0O0.OooO.OooO00o) || (obj instanceof Oooo000)) && (decorView = this.f4427OoooO00.getDecorView()) != null && o000O0O0.OooO.OooO00o(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            OooOO0O oooOO0O = this.f4426OoooO0;
            Window.Callback callback = this.f4427OoooO00.getCallback();
            Objects.requireNonNull(oooOO0O);
            try {
                oooOO0O.f4476Oooo = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                oooOO0O.f4476Oooo = false;
                if (zDispatchKeyEvent) {
                    return true;
                }
            } catch (Throwable th) {
                oooOO0O.f4476Oooo = false;
                throw th;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f4458o00oO0o = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                PanelFeatureState panelFeatureStateOooo0o = Oooo0o(0);
                if (panelFeatureStateOooo0o.f4503OooOOO0) {
                    return true;
                }
                OoooO(panelFeatureStateOooo0o, keyEvent);
                return true;
            }
        } else if (keyCode == 4) {
            boolean z2 = this.f4458o00oO0o;
            this.f4458o00oO0o = false;
            PanelFeatureState panelFeatureStateOooo0o2 = Oooo0o(0);
            if (panelFeatureStateOooo0o2.f4503OooOOO0) {
                if (z2) {
                    return true;
                }
                OooOooO(panelFeatureStateOooo0o2, true);
                return true;
            }
            p016OooOoO0.OooOO0 oooOO1 = this.f4433OoooOoO;
            if (oooOO1 != null) {
                oooOO1.OooO0OO();
            } else {
                Oooo0oo();
                ActionBar actionBar = this.f4425OoooO;
                z = actionBar != null && actionBar.OooO0O0();
                if (z) {
                    return true;
                }
            }
            if (z) {
                return true;
            }
        } else if (keyCode == 82) {
            if (this.f4433OoooOoO != null) {
                return true;
            }
            PanelFeatureState panelFeatureStateOooo0o3 = Oooo0o(0);
            androidx.appcompat.widget.oo000o oo000oVar = this.f4430OoooOOO;
            if (oo000oVar == null || !oo000oVar.OooO0Oo() || ViewConfiguration.get(this.f4423Oooo).hasPermanentMenuKey()) {
                boolean z3 = panelFeatureStateOooo0o3.f4503OooOOO0;
                if (z3 || panelFeatureStateOooo0o3.f4501OooOO0o) {
                    OooOooO(panelFeatureStateOooo0o3, true);
                    zOooO0o = z3;
                } else if (panelFeatureStateOooo0o3.f4500OooOO0O) {
                    if (panelFeatureStateOooo0o3.f4504OooOOOO) {
                        panelFeatureStateOooo0o3.f4500OooOO0O = false;
                        zOoooO = OoooO(panelFeatureStateOooo0o3, keyEvent);
                    } else {
                        zOoooO = true;
                    }
                    if (zOoooO) {
                        OoooO0(panelFeatureStateOooo0o3, keyEvent);
                        zOooO0o = true;
                    } else {
                        zOooO0o = false;
                    }
                } else {
                    zOooO0o = false;
                }
            } else if (this.f4430OoooOOO.OooO0O0()) {
                zOooO0o = this.f4430OoooOOO.OooO0o();
            } else if (this.f4466o0ooOOo || !OoooO(panelFeatureStateOooo0o3, keyEvent)) {
                zOooO0o = false;
            } else {
                zOooO0o = this.f4430OoooOOO.OooO0oO();
            }
            if (!zOooO0o) {
                return true;
            }
            AudioManager audioManager = (AudioManager) this.f4423Oooo.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return true;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
            return true;
        }
        return false;
    }

    public final void Oooo00O(int i) {
        PanelFeatureState panelFeatureStateOooo0o = Oooo0o(i);
        if (panelFeatureStateOooo0o.f4498OooO0oo != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateOooo0o.f4498OooO0oo.OooOoO0(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateOooo0o.f4505OooOOOo = bundle;
            }
            panelFeatureStateOooo0o.f4498OooO0oo.OooOooO();
            panelFeatureStateOooo0o.f4498OooO0oo.clear();
        }
        panelFeatureStateOooo0o.f4504OooOOOO = true;
        panelFeatureStateOooo0o.f4502OooOOO = true;
        if ((i == 108 || i == 0) && this.f4430OoooOOO != null) {
            PanelFeatureState panelFeatureStateOooo0o2 = Oooo0o(0);
            panelFeatureStateOooo0o2.f4500OooOO0O = false;
            OoooO(panelFeatureStateOooo0o2, null);
        }
    }

    public final void Oooo00o() {
        o00000O o00000o = this.f4437OooooO0;
        if (o00000o != null) {
            o00000o.OooO0O0();
        }
    }

    public final void Oooo0O0() {
        if (this.f4427OoooO00 == null) {
            Object obj = this.f4424Oooo0oo;
            if (obj instanceof Activity) {
                OooOoOO(((Activity) obj).getWindow());
            }
        }
        if (this.f4427OoooO00 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final PanelFeatureState Oooo0OO(Menu menu) {
        PanelFeatureState[] panelFeatureStateArr = this.f4459o00ooo;
        int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
        for (int i = 0; i < length; i++) {
            PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
            if (panelFeatureState != null && panelFeatureState.f4498OooO0oo == menu) {
                return panelFeatureState;
            }
        }
        return null;
    }

    public final PanelFeatureState Oooo0o(int i) {
        PanelFeatureState[] panelFeatureStateArr = this.f4459o00ooo;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f4459o00ooo = panelFeatureStateArr2;
            panelFeatureStateArr = panelFeatureStateArr2;
        }
        PanelFeatureState panelFeatureState = panelFeatureStateArr[i];
        if (panelFeatureState != null) {
            return panelFeatureState;
        }
        PanelFeatureState panelFeatureState2 = new PanelFeatureState(i);
        panelFeatureStateArr[i] = panelFeatureState2;
        return panelFeatureState2;
    }

    public final OooOOO Oooo0o0(@NonNull Context context) {
        if (this.f4460o0O0O00 == null) {
            if (o00Ooo.f4560OooO0Oo == null) {
                Context applicationContext = context.getApplicationContext();
                o00Ooo.f4560OooO0Oo = new o00Ooo(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f4460o0O0O00 = new OooOOOO(o00Ooo.f4560OooO0Oo);
        }
        return this.f4460o0O0O00;
    }

    public final Window.Callback Oooo0oO() {
        return this.f4427OoooO00.getCallback();
    }

    public final void Oooo0oo() {
        Oooo0();
        if (this.f4464o0OoOo0 && this.f4425OoooO == null) {
            Object obj = this.f4424Oooo0oo;
            if (obj instanceof Activity) {
                this.f4425OoooO = new oo000o((Activity) this.f4424Oooo0oo, this.f4470ooOO);
            } else if (obj instanceof Dialog) {
                this.f4425OoooO = new oo000o((Dialog) this.f4424Oooo0oo);
            }
            ActionBar actionBar = this.f4425OoooO;
            if (actionBar != null) {
                actionBar.OooOO0o(this.f4444o00000);
            }
        }
    }

    public final boolean OoooO(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        androidx.appcompat.widget.oo000o oo000oVar;
        androidx.appcompat.widget.oo000o oo000oVar2;
        Resources.Theme themeNewTheme;
        androidx.appcompat.widget.oo000o oo000oVar3;
        androidx.appcompat.widget.oo000o oo000oVar4;
        if (this.f4466o0ooOOo) {
            return false;
        }
        if (panelFeatureState.f4500OooOO0O) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f4468oo000o;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            OooOooO(panelFeatureState2, false);
        }
        Window.Callback callbackOooo0oO = Oooo0oO();
        if (callbackOooo0oO != null) {
            panelFeatureState.f4497OooO0oO = callbackOooo0oO.onCreatePanelView(panelFeatureState.f4491OooO00o);
        }
        int i = panelFeatureState.f4491OooO00o;
        boolean z = i == 0 || i == 108;
        if (z && (oo000oVar4 = this.f4430OoooOOO) != null) {
            oo000oVar4.OooO0OO();
        }
        if (panelFeatureState.f4497OooO0oO == null && (!z || !(this.f4425OoooO instanceof o00O0O))) {
            androidx.appcompat.view.menu.OooO0o oooO0o = panelFeatureState.f4498OooO0oo;
            if (oooO0o == null || panelFeatureState.f4504OooOOOO) {
                if (oooO0o == null) {
                    Context context = this.f4423Oooo;
                    int i2 = panelFeatureState.f4491OooO00o;
                    if ((i2 == 0 || i2 == 108) && this.f4430OoooOOO != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(OooOo00.OooO00o.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(OooOo00.OooO00o.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(OooOo00.OooO00o.actionBarWidgetTheme, typedValue, true);
                            themeNewTheme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (themeNewTheme == null) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                            }
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                        }
                        if (themeNewTheme != null) {
                            p016OooOoO0.OooOOO0 oooOOO0 = new p016OooOoO0.OooOOO0(context, 0);
                            oooOOO0.getTheme().setTo(themeNewTheme);
                            context = oooOOO0;
                        }
                    }
                    androidx.appcompat.view.menu.OooO0o oooO0o2 = new androidx.appcompat.view.menu.OooO0o(context);
                    oooO0o2.f4711OooO0o0 = this;
                    panelFeatureState.OooO00o(oooO0o2);
                    if (panelFeatureState.f4498OooO0oo == null) {
                        return false;
                    }
                }
                if (z && (oo000oVar2 = this.f4430OoooOOO) != null) {
                    if (this.f4431OoooOOo == null) {
                        this.f4431OoooOOo = new OooO0OO();
                    }
                    oo000oVar2.OooO00o(panelFeatureState.f4498OooO0oo, this.f4431OoooOOo);
                }
                panelFeatureState.f4498OooO0oo.OooOooO();
                if (!callbackOooo0oO.onCreatePanelMenu(panelFeatureState.f4491OooO00o, panelFeatureState.f4498OooO0oo)) {
                    panelFeatureState.OooO00o(null);
                    if (z && (oo000oVar = this.f4430OoooOOO) != null) {
                        oo000oVar.OooO00o(null, this.f4431OoooOOo);
                    }
                    return false;
                }
                panelFeatureState.f4504OooOOOO = false;
            }
            panelFeatureState.f4498OooO0oo.OooOooO();
            Bundle bundle = panelFeatureState.f4505OooOOOo;
            if (bundle != null) {
                panelFeatureState.f4498OooO0oo.OooOo0o(bundle);
                panelFeatureState.f4505OooOOOo = null;
            }
            if (!callbackOooo0oO.onPreparePanel(0, panelFeatureState.f4497OooO0oO, panelFeatureState.f4498OooO0oo)) {
                if (z && (oo000oVar3 = this.f4430OoooOOO) != null) {
                    oo000oVar3.OooO00o(null, this.f4431OoooOOo);
                }
                panelFeatureState.f4498OooO0oo.OooOoo();
                return false;
            }
            panelFeatureState.f4498OooO0oo.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            panelFeatureState.f4498OooO0oo.OooOoo();
        }
        panelFeatureState.f4500OooOO0O = true;
        panelFeatureState.f4501OooOO0o = false;
        this.f4468oo000o = panelFeatureState;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x0159  */
    /* JADX WARN: Code duplicated, block: B:85:0x015e  */
    /* JADX WARN: Code duplicated, block: B:91:0x0173  */
    /* JADX WARN: Code duplicated, block: B:94:0x0177  */
    /* JADX WARN: Code duplicated, block: B:96:0x017f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0195  */
    public final void OoooO0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        ViewGroup.LayoutParams layoutParams;
        ViewParent parent;
        int i;
        ViewGroup.LayoutParams layoutParams2;
        if (panelFeatureState.f4503OooOOO0 || this.f4466o0ooOOo) {
            return;
        }
        if (panelFeatureState.f4491OooO00o == 0) {
            if ((this.f4423Oooo.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackOooo0oO = Oooo0oO();
        if (callbackOooo0oO != null && !callbackOooo0oO.onMenuOpened(panelFeatureState.f4491OooO00o, panelFeatureState.f4498OooO0oo)) {
            OooOooO(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f4423Oooo.getSystemService("window");
        if (windowManager != null && OoooO(panelFeatureState, keyEvent)) {
            OooOo00 oooOo00 = panelFeatureState.f4496OooO0o0;
            if (oooOo00 != null && !panelFeatureState.f4502OooOOO) {
                View view = panelFeatureState.f4497OooO0oO;
                if (view != null && (layoutParams2 = view.getLayoutParams()) != null && layoutParams2.width == -1) {
                    i = -1;
                }
                panelFeatureState.f4501OooOO0o = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams3.gravity = panelFeatureState.f4493OooO0OO;
                layoutParams3.windowAnimations = panelFeatureState.f4494OooO0Oo;
                windowManager.addView(panelFeatureState.f4496OooO0o0, layoutParams3);
                panelFeatureState.f4503OooOOO0 = true;
            }
            if (oooOo00 == null) {
                Oooo0oo();
                ActionBar actionBar = this.f4425OoooO;
                Context contextOooO0o0 = actionBar != null ? actionBar.OooO0o0() : null;
                if (contextOooO0o0 == null) {
                    contextOooO0o0 = this.f4423Oooo;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = contextOooO0o0.getResources().newTheme();
                themeNewTheme.setTo(contextOooO0o0.getTheme());
                themeNewTheme.resolveAttribute(OooOo00.OooO00o.actionBarPopupTheme, typedValue, true);
                int i2 = typedValue.resourceId;
                if (i2 != 0) {
                    themeNewTheme.applyStyle(i2, true);
                }
                themeNewTheme.resolveAttribute(OooOo00.OooO00o.panelMenuListTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                } else {
                    themeNewTheme.applyStyle(OooOo00.OooOOO.Theme_AppCompat_CompactMenu, true);
                }
                p016OooOoO0.OooOOO0 oooOOO0 = new p016OooOoO0.OooOOO0(contextOooO0o0, 0);
                oooOOO0.getTheme().setTo(themeNewTheme);
                panelFeatureState.f4499OooOO0 = oooOOO0;
                TypedArray typedArrayObtainStyledAttributes = oooOOO0.obtainStyledAttributes(OooOo00.OooOOOO.AppCompatTheme);
                panelFeatureState.f4492OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(OooOo00.OooOOOO.AppCompatTheme_panelBackground, 0);
                panelFeatureState.f4494OooO0Oo = typedArrayObtainStyledAttributes.getResourceId(OooOo00.OooOOOO.AppCompatTheme_android_windowAnimationStyle, 0);
                typedArrayObtainStyledAttributes.recycle();
                panelFeatureState.f4496OooO0o0 = new OooOo00(panelFeatureState.f4499OooOO0);
                panelFeatureState.f4493OooO0OO = 81;
            } else if (panelFeatureState.f4502OooOOO && oooOo00.getChildCount() > 0) {
                panelFeatureState.f4496OooO0o0.removeAllViews();
            }
            View view2 = panelFeatureState.f4497OooO0oO;
            if (view2 == null) {
                if (panelFeatureState.f4498OooO0oo != null) {
                    if (this.f4432OoooOo0 == null) {
                        this.f4432OoooOo0 = new OooOo();
                    }
                    OooOo oooOo = this.f4432OoooOo0;
                    if (panelFeatureState.f4490OooO == null) {
                        androidx.appcompat.view.menu.OooO0O0 oooO0O0 = new androidx.appcompat.view.menu.OooO0O0(panelFeatureState.f4499OooOO0, OooOo00.OooOO0O.abc_list_menu_item_layout);
                        panelFeatureState.f4490OooO = oooO0O0;
                        oooO0O0.f4693OoooO0 = oooOo;
                        panelFeatureState.f4498OooO0oo.OooO0O0(oooO0O0);
                    }
                    androidx.appcompat.view.menu.OooO0O0 oooO0O1 = panelFeatureState.f4490OooO;
                    OooOo00 oooOo01 = panelFeatureState.f4496OooO0o0;
                    if (oooO0O1.f4689Oooo == null) {
                        oooO0O1.f4689Oooo = (ExpandedMenuView) oooO0O1.f4691Oooo0oO.inflate(OooOo00.OooOO0O.abc_expanded_menu_layout, (ViewGroup) oooOo01, false);
                        if (oooO0O1.f4695OoooO0O == null) {
                            oooO0O1.f4695OoooO0O = oooO0O1.new OooO00o();
                        }
                        oooO0O1.f4689Oooo.setAdapter((ListAdapter) oooO0O1.f4695OoooO0O);
                        oooO0O1.f4689Oooo.setOnItemClickListener(oooO0O1);
                    }
                    ExpandedMenuView expandedMenuView = oooO0O1.f4689Oooo;
                    panelFeatureState.f4495OooO0o = expandedMenuView;
                    if (expandedMenuView != null) {
                    }
                    if (z) {
                        if (panelFeatureState.f4495OooO0o == null && (panelFeatureState.f4497OooO0oO != null || ((androidx.appcompat.view.menu.OooO0O0.OooO00o) panelFeatureState.f4490OooO.OooO00o()).getCount() > 0)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            layoutParams = panelFeatureState.f4495OooO0o.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new ViewGroup.LayoutParams(-2, -2);
                            }
                            panelFeatureState.f4496OooO0o0.setBackgroundResource(panelFeatureState.f4492OooO0O0);
                            parent = panelFeatureState.f4495OooO0o.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(panelFeatureState.f4495OooO0o);
                            }
                            panelFeatureState.f4496OooO0o0.addView(panelFeatureState.f4495OooO0o, layoutParams);
                            if (!panelFeatureState.f4495OooO0o.hasFocus()) {
                                panelFeatureState.f4495OooO0o.requestFocus();
                            }
                        }
                    }
                    panelFeatureState.f4502OooOOO = true;
                    return;
                }
                z = false;
                if (z) {
                    if (panelFeatureState.f4495OooO0o == null) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        layoutParams = panelFeatureState.f4495OooO0o.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams = new ViewGroup.LayoutParams(-2, -2);
                        }
                        panelFeatureState.f4496OooO0o0.setBackgroundResource(panelFeatureState.f4492OooO0O0);
                        parent = panelFeatureState.f4495OooO0o.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(panelFeatureState.f4495OooO0o);
                        }
                        panelFeatureState.f4496OooO0o0.addView(panelFeatureState.f4495OooO0o, layoutParams);
                        if (!panelFeatureState.f4495OooO0o.hasFocus()) {
                            panelFeatureState.f4495OooO0o.requestFocus();
                        }
                    }
                }
                panelFeatureState.f4502OooOOO = true;
                return;
            }
            panelFeatureState.f4495OooO0o = view2;
            z = true;
            if (z) {
                if (panelFeatureState.f4495OooO0o == null) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    layoutParams = panelFeatureState.f4495OooO0o.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.LayoutParams(-2, -2);
                    }
                    panelFeatureState.f4496OooO0o0.setBackgroundResource(panelFeatureState.f4492OooO0O0);
                    parent = panelFeatureState.f4495OooO0o.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(panelFeatureState.f4495OooO0o);
                    }
                    panelFeatureState.f4496OooO0o0.addView(panelFeatureState.f4495OooO0o, layoutParams);
                    if (!panelFeatureState.f4495OooO0o.hasFocus()) {
                        panelFeatureState.f4495OooO0o.requestFocus();
                    }
                }
            }
            panelFeatureState.f4502OooOOO = true;
            return;
            i = -2;
            panelFeatureState.f4501OooOO0o = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = panelFeatureState.f4493OooO0OO;
            layoutParams4.windowAnimations = panelFeatureState.f4494OooO0Oo;
            windowManager.addView(panelFeatureState.f4496OooO0o0, layoutParams4);
            panelFeatureState.f4503OooOOO0 = true;
        }
    }

    public final int OoooO00(@NonNull Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return Oooo0o0(context).OooO0OO();
                }
                return -1;
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f4451o000OOo == null) {
                    this.f4451o000OOo = new OooOOO0(context);
                }
                return this.f4451o000OOo.f4484OooO0OO.isPowerSaveMode() ? 2 : 1;
            }
        }
        return i;
    }

    public final boolean OoooO0O(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.OooO0o oooO0o;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f4500OooOO0O || OoooO(panelFeatureState, keyEvent)) && (oooO0o = panelFeatureState.f4498OooO0oo) != null) {
            return oooO0o.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final void OoooOO0() {
        if (this.f4438OooooOO) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int o000oOoO(@Nullable WindowInsetsCompat windowInsetsCompat) {
        boolean z;
        boolean z2;
        int iOooO = windowInsetsCompat.OooO();
        ActionBarContextView actionBarContextView = this.f4434OoooOoo;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4434OoooOoo.getLayoutParams();
            boolean z3 = true;
            if (this.f4434OoooOoo.isShown()) {
                if (this.f4449o00000O0 == null) {
                    this.f4449o00000O0 = new Rect();
                    this.f4448o00000O = new Rect();
                }
                Rect rect = this.f4449o00000O0;
                Rect rect2 = this.f4448o00000O;
                rect.set(windowInsetsCompat.OooO0oO(), windowInsetsCompat.OooO(), windowInsetsCompat.OooO0oo(), windowInsetsCompat.OooO0o());
                o000O00O.OooO00o(this.f4439OooooOo, rect, rect2);
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                WindowInsetsCompat windowInsetsCompatOooOOO0 = ViewCompat.OooOOO0(this.f4439OooooOo);
                int iOooO0oO = windowInsetsCompatOooOOO0 == null ? 0 : windowInsetsCompatOooOOO0.OooO0oO();
                int iOooO0oo = windowInsetsCompatOooOOO0 == null ? 0 : windowInsetsCompatOooOOO0.OooO0oo();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                if (i <= 0 || this.f4440Oooooo != null) {
                    View view = this.f4440Oooooo;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iOooO0oO || marginLayoutParams2.rightMargin != iOooO0oo) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iOooO0oO;
                            marginLayoutParams2.rightMargin = iOooO0oo;
                            this.f4440Oooooo.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f4423Oooo);
                    this.f4440Oooooo = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iOooO0oO;
                    layoutParams.rightMargin = iOooO0oo;
                    this.f4439OooooOo.addView(this.f4440Oooooo, -1, layoutParams);
                }
                View view3 = this.f4440Oooooo;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.f4440Oooooo;
                    WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                    view4.setBackgroundColor((ViewCompat.OooO0o.OooO0oO(view4) & 8192) != 0 ? o000O000.OooO00o.OooO0O0(this.f4423Oooo, OooOo00.OooO0OO.abc_decor_view_status_guard_light) : o000O000.OooO00o.OooO0O0(this.f4423Oooo, OooOo00.OooO0OO.abc_decor_view_status_guard));
                }
                if (!this.f4453o00O0O && z) {
                    iOooO = 0;
                }
                z3 = z2;
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                } else {
                    z3 = false;
                }
                z = false;
            }
            if (z3) {
                this.f4434OoooOoo.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.f4440Oooooo;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return iOooO;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:81:0x0149  */
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        byte b;
        View appCompatRatingBar;
        if (this.f4450o00000OO == null) {
            String string = this.f4423Oooo.obtainStyledAttributes(OooOo00.OooOOOO.AppCompatTheme).getString(OooOo00.OooOOOO.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.f4450o00000OO = new o000oOoO();
            } else {
                try {
                    this.f4450o00000OO = (o000oOoO) this.f4423Oooo.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f4450o00000OO = new o000oOoO();
                }
            }
        }
        o000oOoO o000oooo2 = this.f4450o00000OO;
        int i = o000O00.f5375OooO00o;
        Objects.requireNonNull(o000oooo2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooOo00.OooOOOO.View, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(OooOo00.OooOOOO.View_theme, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        Context oooOOO0 = (resourceId == 0 || ((context instanceof p016OooOoO0.OooOOO0) && ((p016OooOoO0.OooOOO0) context).f307OooO00o == resourceId)) ? context : new p016OooOoO0.OooOOO0(context, resourceId);
        Objects.requireNonNull(str);
        switch (str) {
            case "RatingBar":
                b = 0;
                break;
            case "CheckedTextView":
                b = 1;
                break;
            case "MultiAutoCompleteTextView":
                b = 2;
                break;
            case "TextView":
                b = 3;
                break;
            case "ImageButton":
                b = 4;
                break;
            case "SeekBar":
                b = 5;
                break;
            case "Spinner":
                b = 6;
                break;
            case "RadioButton":
                b = 7;
                break;
            case "ToggleButton":
                b = 8;
                break;
            case "ImageView":
                b = 9;
                break;
            case "AutoCompleteTextView":
                b = 10;
                break;
            case "CheckBox":
                b = 11;
                break;
            case "EditText":
                b = 12;
                break;
            case "Button":
                b = bz.k;
                break;
            default:
                b = -1;
                break;
        }
        View view2 = null;
        switch (b) {
            case 0:
                appCompatRatingBar = new AppCompatRatingBar(oooOOO0, attributeSet);
                break;
            case 1:
                appCompatRatingBar = new AppCompatCheckedTextView(oooOOO0, attributeSet);
                break;
            case 2:
                appCompatRatingBar = new AppCompatMultiAutoCompleteTextView(oooOOO0, attributeSet);
                break;
            case 3:
                appCompatRatingBar = o000oooo2.OooO0o0(oooOOO0, attributeSet);
                o000oooo2.OooO0oO(appCompatRatingBar, str);
                break;
            case 4:
                appCompatRatingBar = new AppCompatImageButton(oooOOO0, attributeSet);
                break;
            case 5:
                appCompatRatingBar = new AppCompatSeekBar(oooOOO0, attributeSet);
                break;
            case 6:
                appCompatRatingBar = new AppCompatSpinner(oooOOO0, attributeSet);
                break;
            case 7:
                appCompatRatingBar = o000oooo2.OooO0Oo(oooOOO0, attributeSet);
                o000oooo2.OooO0oO(appCompatRatingBar, str);
                break;
            case 8:
                appCompatRatingBar = new AppCompatToggleButton(oooOOO0, attributeSet);
                break;
            case 9:
                appCompatRatingBar = new AppCompatImageView(oooOOO0, attributeSet);
                break;
            case 10:
                appCompatRatingBar = o000oooo2.OooO00o(oooOOO0, attributeSet);
                o000oooo2.OooO0oO(appCompatRatingBar, str);
                break;
            case 11:
                appCompatRatingBar = o000oooo2.OooO0OO(oooOOO0, attributeSet);
                o000oooo2.OooO0oO(appCompatRatingBar, str);
                break;
            case 12:
                appCompatRatingBar = new AppCompatEditText(oooOOO0, attributeSet);
                break;
            case 13:
                appCompatRatingBar = o000oooo2.OooO0O0(oooOOO0, attributeSet);
                o000oooo2.OooO0oO(appCompatRatingBar, str);
                break;
            default:
                appCompatRatingBar = null;
                break;
        }
        if (appCompatRatingBar == null && context != oooOOO0) {
            if (str.equals(ViewHierarchyConstants.VIEW_KEY)) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                Object[] objArr = o000oooo2.f4536OooO00o;
                objArr[0] = oooOOO0;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = o000oOoO.f4534OooO0oO;
                        if (i2 < 3) {
                            View viewOooO0o = o000oooo2.OooO0o(oooOOO0, str, strArr[i2]);
                            if (viewOooO0o != null) {
                                Object[] objArr2 = o000oooo2.f4536OooO00o;
                                objArr2[0] = null;
                                objArr2[1] = null;
                                view2 = viewOooO0o;
                            } else {
                                i2++;
                            }
                        } else {
                            Object[] objArr3 = o000oooo2.f4536OooO00o;
                            objArr3[0] = null;
                            objArr3[1] = null;
                        }
                    }
                } else {
                    View viewOooO0o2 = o000oooo2.OooO0o(oooOOO0, str, null);
                    Object[] objArr4 = o000oooo2.f4536OooO00o;
                    objArr4[0] = null;
                    objArr4[1] = null;
                    view2 = viewOooO0o2;
                }
            } catch (Exception unused) {
                Object[] objArr5 = o000oooo2.f4536OooO00o;
                objArr5[0] = null;
                objArr5[1] = null;
            } catch (Throwable th2) {
                Object[] objArr6 = o000oooo2.f4536OooO00o;
                objArr6[0] = null;
                objArr6[1] = null;
                throw th2;
            }
            appCompatRatingBar = view2;
        }
        if (appCompatRatingBar != null) {
            Context context2 = appCompatRatingBar.getContext();
            if (context2 instanceof ContextWrapper) {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                if (ViewCompat.OooO0OO.OooO00o(appCompatRatingBar)) {
                    TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, o000oOoO.f4530OooO0OO);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        appCompatRatingBar.setOnClickListener(new o000oOoO.OooO00o(appCompatRatingBar, string2));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = oooOOO0.obtainStyledAttributes(attributeSet, o000oOoO.f4531OooO0Oo);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                    new androidx.core.view.OooO(o000OO0O.tag_accessibility_heading).OooO0o0(appCompatRatingBar, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = oooOOO0.obtainStyledAttributes(attributeSet, o000oOoO.f4533OooO0o0);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    ViewCompat.OooOo(appCompatRatingBar, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = oooOOO0.obtainStyledAttributes(attributeSet, o000oOoO.f4532OooO0o);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap<View, o00000O> weakHashMap3 = ViewCompat.f7870OooO00o;
                    new androidx.core.view.OooO0O0(o000OO0O.tag_screen_reader_focusable).OooO0o0(appCompatRatingBar, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return appCompatRatingBar;
    }

    public class OooOO0O extends p016OooOoO0.Oooo0 {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public boolean f4476Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public OooO0O0 f4477Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public boolean f4478Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public boolean f4480OoooO00;

        public OooOO0O(Window.Callback callback) {
            super(callback);
        }

        public final void OooO00o(Window.Callback callback) {
            try {
                this.f4478Oooo0oo = true;
                callback.onContentChanged();
            } finally {
                this.f4478Oooo0oo = false;
            }
        }

        /* JADX WARN: Code duplicated, block: B:51:0x013e  */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final ActionMode OooO0O0(ActionMode.Callback callback) {
            androidx.appcompat.app.OooOO0O oooOO0O;
            boolean z;
            ViewGroup viewGroup;
            Context oooOOO0;
            androidx.appcompat.app.OooOO0O oooOO0O2;
            OooOoO0.OooOOOO.OooO00o oooO00o = new OooOoO0.OooOOOO.OooO00o(AppCompatDelegateImpl.this.f4423Oooo, callback);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            Objects.requireNonNull(appCompatDelegateImpl);
            p016OooOoO0.OooOO0 oooOO1 = appCompatDelegateImpl.f4433OoooOoO;
            if (oooOO1 != null) {
                oooOO1.OooO0OO();
            }
            OooO0o oooO0o = appCompatDelegateImpl.new OooO0o(oooO00o);
            appCompatDelegateImpl.Oooo0oo();
            ActionBar actionBar = appCompatDelegateImpl.f4425OoooO;
            if (actionBar != null) {
                p016OooOoO0.OooOO0 oooOO0OooOOOo = actionBar.OooOOOo(oooO0o);
                appCompatDelegateImpl.f4433OoooOoO = oooOO0OooOOOo;
                if (oooOO0OooOOOo != null && (oooOO0O2 = appCompatDelegateImpl.f4428OoooO0O) != null) {
                    oooOO0O2.OooO0Oo();
                }
            }
            if (appCompatDelegateImpl.f4433OoooOoO == null) {
                appCompatDelegateImpl.Oooo00o();
                p016OooOoO0.OooOO0 oooOO2 = appCompatDelegateImpl.f4433OoooOoO;
                if (oooOO2 != null) {
                    oooOO2.OooO0OO();
                }
                androidx.appcompat.app.OooOO0O oooOO0O3 = appCompatDelegateImpl.f4428OoooO0O;
                if (oooOO0O3 != null && !appCompatDelegateImpl.f4466o0ooOOo) {
                    try {
                        oooOO0O3.OooO00o();
                    } catch (AbstractMethodError unused) {
                    }
                }
                if (appCompatDelegateImpl.f4434OoooOoo == null) {
                    if (appCompatDelegateImpl.f4454o00Oo0) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = appCompatDelegateImpl.f4423Oooo.getTheme();
                        theme.resolveAttribute(OooOo00.OooO00o.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = appCompatDelegateImpl.f4423Oooo.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            oooOOO0 = new p016OooOoO0.OooOOO0(appCompatDelegateImpl.f4423Oooo, 0);
                            oooOOO0.getTheme().setTo(themeNewTheme);
                        } else {
                            oooOOO0 = appCompatDelegateImpl.f4423Oooo;
                        }
                        appCompatDelegateImpl.f4434OoooOoo = new ActionBarContextView(oooOOO0);
                        PopupWindow popupWindow = new PopupWindow(oooOOO0, (AttributeSet) null, OooOo00.OooO00o.actionModePopupWindowStyle);
                        appCompatDelegateImpl.f4435Ooooo00 = popupWindow;
                        androidx.core.widget.OooOOOO.OooO0O0(popupWindow, 2);
                        appCompatDelegateImpl.f4435Ooooo00.setContentView(appCompatDelegateImpl.f4434OoooOoo);
                        appCompatDelegateImpl.f4435Ooooo00.setWidth(-1);
                        oooOOO0.getTheme().resolveAttribute(OooOo00.OooO00o.actionBarSize, typedValue, true);
                        appCompatDelegateImpl.f4434OoooOoo.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, oooOOO0.getResources().getDisplayMetrics()));
                        appCompatDelegateImpl.f4435Ooooo00.setHeight(-2);
                        appCompatDelegateImpl.f4436Ooooo0o = new androidx.appcompat.app.OooOOOO(appCompatDelegateImpl);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) appCompatDelegateImpl.f4439OooooOo.findViewById(OooOo00.OooOO0.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            appCompatDelegateImpl.Oooo0oo();
                            ActionBar actionBar2 = appCompatDelegateImpl.f4425OoooO;
                            Context contextOooO0o0 = actionBar2 != null ? actionBar2.OooO0o0() : null;
                            if (contextOooO0o0 == null) {
                                contextOooO0o0 = appCompatDelegateImpl.f4423Oooo;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(contextOooO0o0));
                            appCompatDelegateImpl.f4434OoooOoo = (ActionBarContextView) viewStubCompat.OooO00o();
                        }
                    }
                }
                if (appCompatDelegateImpl.f4434OoooOoo != null) {
                    appCompatDelegateImpl.Oooo00o();
                    appCompatDelegateImpl.f4434OoooOoo.OooO0oo();
                    p016OooOoO0.OooOOO oooOOO = new p016OooOoO0.OooOOO(appCompatDelegateImpl.f4434OoooOoo.getContext(), appCompatDelegateImpl.f4434OoooOoo, oooO0o);
                    if (oooO0o.OooO0O0(oooOOO, oooOOO.f302OoooO)) {
                        oooOOO.OooO();
                        appCompatDelegateImpl.f4434OoooOoo.OooO0o(oooOOO);
                        appCompatDelegateImpl.f4433OoooOoO = oooOOO;
                        if (appCompatDelegateImpl.f4438OooooOO && (viewGroup = appCompatDelegateImpl.f4439OooooOo) != null) {
                            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                            z = ViewCompat.OooOO0O.OooO0OO(viewGroup);
                        }
                        if (z) {
                            appCompatDelegateImpl.f4434OoooOoo.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                            o00000O o00000oOooO0O0 = ViewCompat.OooO0O0(appCompatDelegateImpl.f4434OoooOoo);
                            o00000oOooO0O0.OooO00o(1.0f);
                            appCompatDelegateImpl.f4437OooooO0 = o00000oOooO0O0;
                            o00000oOooO0O0.OooO0Oo(new androidx.appcompat.app.OooOo00(appCompatDelegateImpl));
                        } else {
                            appCompatDelegateImpl.f4434OoooOoo.setAlpha(1.0f);
                            appCompatDelegateImpl.f4434OoooOoo.setVisibility(0);
                            if (appCompatDelegateImpl.f4434OoooOoo.getParent() instanceof View) {
                                View view = (View) appCompatDelegateImpl.f4434OoooOoo.getParent();
                                WeakHashMap<View, o00000O> weakHashMap2 = ViewCompat.f7870OooO00o;
                                ViewCompat.OooOOO0.OooO0OO(view);
                            }
                        }
                        if (appCompatDelegateImpl.f4435Ooooo00 != null) {
                            appCompatDelegateImpl.f4427OoooO00.getDecorView().post(appCompatDelegateImpl.f4436Ooooo0o);
                        }
                    } else {
                        appCompatDelegateImpl.f4433OoooOoO = null;
                    }
                }
                if (appCompatDelegateImpl.f4433OoooOoO != null && (oooOO0O = appCompatDelegateImpl.f4428OoooO0O) != null) {
                    oooOO0O.OooO0Oo();
                }
                appCompatDelegateImpl.f4433OoooOoO = appCompatDelegateImpl.f4433OoooOoO;
            }
            p016OooOoO0.OooOO0 oooOO3 = appCompatDelegateImpl.f4433OoooOoO;
            if (oooOO3 != null) {
                return oooO00o.OooO0o0(oooOO3);
            }
            return null;
        }

        @Override // p016OooOoO0.Oooo0, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f4476Oooo) {
                return this.f358Oooo0o.dispatchKeyEvent(keyEvent);
            }
            return AppCompatDelegateImpl.this.Oooo000(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p016OooOoO0.Oooo0, android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            boolean z;
            if (!super.dispatchKeyShortcutEvent(keyEvent)) {
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                int keyCode = keyEvent.getKeyCode();
                appCompatDelegateImpl.Oooo0oo();
                ActionBar actionBar = appCompatDelegateImpl.f4425OoooO;
                if (actionBar == null || !actionBar.OooO(keyCode, keyEvent)) {
                    PanelFeatureState panelFeatureState = appCompatDelegateImpl.f4468oo000o;
                    if (panelFeatureState == null || !appCompatDelegateImpl.OoooO0O(panelFeatureState, keyEvent.getKeyCode(), keyEvent)) {
                        if (appCompatDelegateImpl.f4468oo000o == null) {
                            PanelFeatureState panelFeatureStateOooo0o = appCompatDelegateImpl.Oooo0o(0);
                            appCompatDelegateImpl.OoooO(panelFeatureStateOooo0o, keyEvent);
                            boolean zOoooO0O = appCompatDelegateImpl.OoooO0O(panelFeatureStateOooo0o, keyEvent.getKeyCode(), keyEvent);
                            panelFeatureStateOooo0o.f4500OooOO0O = false;
                            if (zOoooO0O) {
                            }
                        }
                        z = false;
                    } else {
                        PanelFeatureState panelFeatureState2 = appCompatDelegateImpl.f4468oo000o;
                        if (panelFeatureState2 != null) {
                            panelFeatureState2.f4501OooOO0o = true;
                        }
                    }
                    z = true;
                } else {
                    z = true;
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f4478Oooo0oo) {
                this.f358Oooo0o.onContentChanged();
            }
        }

        @Override // p016OooOoO0.Oooo0, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.OooO0o)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p016OooOoO0.Oooo0, android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            OooO0O0 oooO0O0 = this.f4477Oooo0oO;
            if (oooO0O0 != null) {
                View view = i == 0 ? new View(o00O0O.this.f4542OooO00o.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i);
        }

        @Override // p016OooOoO0.Oooo0, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            Objects.requireNonNull(appCompatDelegateImpl);
            if (i == 108) {
                appCompatDelegateImpl.Oooo0oo();
                ActionBar actionBar = appCompatDelegateImpl.f4425OoooO;
                if (actionBar != null) {
                    actionBar.OooO0OO(true);
                }
            }
            return true;
        }

        @Override // p016OooOoO0.Oooo0, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) {
            if (this.f4480OoooO00) {
                this.f358Oooo0o.onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            Objects.requireNonNull(appCompatDelegateImpl);
            if (i == 108) {
                appCompatDelegateImpl.Oooo0oo();
                ActionBar actionBar = appCompatDelegateImpl.f4425OoooO;
                if (actionBar != null) {
                    actionBar.OooO0OO(false);
                    return;
                }
                return;
            }
            if (i == 0) {
                PanelFeatureState panelFeatureStateOooo0o = appCompatDelegateImpl.Oooo0o(i);
                if (panelFeatureStateOooo0o.f4503OooOOO0) {
                    appCompatDelegateImpl.OooOooO(panelFeatureStateOooo0o, false);
                }
            }
        }

        @Override // p016OooOoO0.Oooo0, android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.OooO0o oooO0o = menu instanceof androidx.appcompat.view.menu.OooO0o ? (androidx.appcompat.view.menu.OooO0o) menu : null;
            if (i == 0 && oooO0o == null) {
                return false;
            }
            if (oooO0o != null) {
                oooO0o.f4724OooOo = true;
            }
            OooO0O0 oooO0O0 = this.f4477Oooo0oO;
            if (oooO0O0 != null) {
                o00O0O.OooO oooO = (o00O0O.OooO) oooO0O0;
                if (i == 0) {
                    o00O0O o00o0o2 = o00O0O.this;
                    if (!o00o0o2.f4545OooO0Oo) {
                        o00o0o2.f4542OooO00o.f5360OooOOO0 = true;
                        o00o0o2.f4545OooO0Oo = true;
                    }
                }
            }
            boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
            if (oooO0o != null) {
                oooO0o.f4724OooOo = false;
            }
            return zOnPreparePanel;
        }

        @Override // p016OooOoO0.Oooo0, android.view.Window.Callback
        @RequiresApi(24)
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.OooO0o oooO0o = AppCompatDelegateImpl.this.Oooo0o(0).f4498OooO0oo;
            if (oooO0o != null) {
                super.onProvideKeyboardShortcuts(list, oooO0o, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            Objects.requireNonNull(AppCompatDelegateImpl.this);
            return OooO0O0(callback);
        }

        @Override // p016OooOoO0.Oooo0, android.view.Window.Callback
        @RequiresApi(23)
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            Objects.requireNonNull(AppCompatDelegateImpl.this);
            if (i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            return OooO0O0(callback);
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
