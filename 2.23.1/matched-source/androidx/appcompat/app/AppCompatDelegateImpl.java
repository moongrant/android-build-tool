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
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.CallSuper;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.OooO0OO.OooO00o;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.o0O0ooO;
import androidx.core.content.PermissionChecker;
import androidx.core.os.BuildCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.o0000OO0;
import androidx.core.view.o000O0o;
import androidx.core.view.o000OOo0;
import androidx.core.view.o00O0000;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.io.ConstantsKt;
import kotlin.time.DurationKt;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class AppCompatDelegateImpl extends AppCompatDelegate implements androidx.appcompat.view.menu.OooO.OooO00o, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Context f2302OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Object f2303OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Window f2304OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public OooOOO f2305OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ActionBar f2306OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final androidx.appcompat.app.OooO f2307OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public p016OooOoOO.o00oO0o f2308OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public p016OooOoOO.o0OoOo0 f2309OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public androidx.appcompat.widget.o0OOO0o f2310OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public CharSequence f2311OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public OooO0OO f2312OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Oooo0 f2313OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public PopupWindow f2314OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ActionBarContextView f2315OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public androidx.appcompat.app.OooOOO f2316OooOoOO;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f2319OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public ViewGroup f2320OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public PanelFeatureState[] f2321Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public boolean f2322Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f2323Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f2324Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f2325Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f2326Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public boolean f2327Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public boolean f2328Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public boolean f2329Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f2330Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f2331Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f2332OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f2333OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public PanelFeatureState f2334OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f2335OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f2336OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public int f2337OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f2338OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f2339OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f2340OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public OooOo f2341OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public OooOOOO f2342Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f2343Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f2344OooooO0;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f2346OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public Rect f2347Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public Rect f2348Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public o000OOo f2349OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public OnBackInvokedDispatcher f2350Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Configuration f2351o000oOoO;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public OnBackInvokedCallback f2352o0OoOo0;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public static final p190o00o0O.OooOo<String, Integer> f2301ooOO = new p190o00o0O.OooOo<>();

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public static final int[] f2298o00O0O = {R.attr.windowBackground};

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public static final boolean f2299o00Oo0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public static final boolean f2300o00Ooo = true;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public o000OOo0 f2318OooOoo0 = null;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final boolean f2317OooOoo = true;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final OooO00o f2345OooooOO = new OooO00o();

    @RequiresApi(17)
    public static class OooO {
        @DoNotInline
        public static void OooO00o(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        @DoNotInline
        public static void OooO0O0(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if ((appCompatDelegateImpl.f2344OooooO0 & 1) != 0) {
                appCompatDelegateImpl.Oooo0OO(0);
            }
            if ((appCompatDelegateImpl.f2344OooooO0 & 4096) != 0) {
                appCompatDelegateImpl.Oooo0OO(108);
            }
            appCompatDelegateImpl.f2343Ooooo0o = false;
            appCompatDelegateImpl.f2344OooooO0 = 0;
        }
    }

    public interface OooO0O0 {
    }

    public final class OooO0OO implements androidx.appcompat.view.menu.OooOOO.OooO00o {
        public OooO0OO() {
        }

        @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO oooO, boolean z) {
            AppCompatDelegateImpl.this.Oooo00O(oooO);
        }

        @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
        public final boolean OooO0OO(@NonNull androidx.appcompat.view.menu.OooO oooO) {
            Window.Callback callbackOoooO00 = AppCompatDelegateImpl.this.OoooO00();
            if (callbackOoooO00 == null) {
                return true;
            }
            callbackOoooO00.onMenuOpened(108, oooO);
            return true;
        }
    }

    public class OooO0o implements OooOoOO.o0OoOo0.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOoOO.o0OoOo0.OooO00o f2355OooO00o;

        public class OooO00o extends o00O0000 {
            public OooO00o() {
            }

            @Override // androidx.core.view.o00
            public final void OooO00o() {
                OooO0o oooO0o = OooO0o.this;
                AppCompatDelegateImpl.this.f2315OooOoO0.setVisibility(8);
                AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                PopupWindow popupWindow = appCompatDelegateImpl.f2314OooOoO;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (appCompatDelegateImpl.f2315OooOoO0.getParent() instanceof View) {
                    View view = (View) appCompatDelegateImpl.f2315OooOoO0.getParent();
                    WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
                    ViewCompat.OooOOO0.OooO0OO(view);
                }
                appCompatDelegateImpl.f2315OooOoO0.OooO0oo();
                appCompatDelegateImpl.f2318OooOoo0.OooO0Oo(null);
                appCompatDelegateImpl.f2318OooOoo0 = null;
                ViewGroup viewGroup = appCompatDelegateImpl.f2320OooOooo;
                WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5344OooO00o;
                ViewCompat.OooOOO0.OooO0OO(viewGroup);
            }
        }

        public OooO0o(OooOoOO.oo000o.OooO00o oooO00o) {
            this.f2355OooO00o = oooO00o;
        }

        @Override // OooOoOO.o0OoOo0.OooO00o
        public final boolean OooO00o(p016OooOoOO.o0OoOo0 o0oooo1, androidx.appcompat.view.menu.OooO oooO) {
            ViewGroup viewGroup = AppCompatDelegateImpl.this.f2320OooOooo;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
            ViewCompat.OooOOO0.OooO0OO(viewGroup);
            return this.f2355OooO00o.OooO00o(o0oooo1, oooO);
        }

        @Override // OooOoOO.o0OoOo0.OooO00o
        public final void OooO0O0(p016OooOoOO.o0OoOo0 o0oooo1) {
            this.f2355OooO00o.OooO0O0(o0oooo1);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (appCompatDelegateImpl.f2314OooOoO != null) {
                appCompatDelegateImpl.f2304OooOOOO.getDecorView().removeCallbacks(appCompatDelegateImpl.f2316OooOoOO);
            }
            if (appCompatDelegateImpl.f2315OooOoO0 != null) {
                o000OOo0 o000ooo1 = appCompatDelegateImpl.f2318OooOoo0;
                if (o000ooo1 != null) {
                    o000ooo1.OooO0O0();
                }
                o000OOo0 o000ooo0OooO00o = ViewCompat.OooO00o(appCompatDelegateImpl.f2315OooOoO0);
                o000ooo0OooO00o.OooO00o(0.0f);
                appCompatDelegateImpl.f2318OooOoo0 = o000ooo0OooO00o;
                o000ooo0OooO00o.OooO0Oo(new OooO00o());
            }
            androidx.appcompat.app.OooO oooO = appCompatDelegateImpl.f2307OooOOo0;
            if (oooO != null) {
                oooO.OooO0O0();
            }
            appCompatDelegateImpl.f2309OooOo = null;
            ViewGroup viewGroup = appCompatDelegateImpl.f2320OooOooo;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
            ViewCompat.OooOOO0.OooO0OO(viewGroup);
            appCompatDelegateImpl.OoooOo0();
        }

        @Override // OooOoOO.o0OoOo0.OooO00o
        public final boolean OooO0OO(p016OooOoOO.o0OoOo0 o0oooo1, MenuItem menuItem) {
            return this.f2355OooO00o.OooO0OO(o0oooo1, menuItem);
        }

        @Override // OooOoOO.o0OoOo0.OooO00o
        public final boolean OooO0Oo(p016OooOoOO.o0OoOo0 o0oooo1, androidx.appcompat.view.menu.OooO oooO) {
            return this.f2355OooO00o.OooO0Oo(o0oooo1, oooO);
        }
    }

    @RequiresApi(21)
    public static class OooOO0 {
        @DoNotInline
        public static String OooO00o(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    @RequiresApi(24)
    public static class OooOO0O {
        @DoNotInline
        public static void OooO00o(@NonNull Configuration configuration, @NonNull Configuration configuration2, @NonNull Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        @DoNotInline
        public static p063o0000oO.o00oO0o OooO0O0(Configuration configuration) {
            return p063o0000oO.o00oO0o.OooO0O0(configuration.getLocales().toLanguageTags());
        }

        @DoNotInline
        public static void OooO0OO(p063o0000oO.o00oO0o o00oo0o2) {
            LocaleList.setDefault(LocaleList.forLanguageTags(o00oo0o2.f33777OooO00o.OooO00o()));
        }

        @DoNotInline
        public static void OooO0Oo(Configuration configuration, p063o0000oO.o00oO0o o00oo0o2) {
            configuration.setLocales(LocaleList.forLanguageTags(o00oo0o2.f33777OooO00o.OooO00o()));
        }
    }

    public class OooOOO extends p016OooOoOO.o0OOO0o {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public boolean f2359OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public OooO0O0 f2360OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public boolean f2361OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f2362OooO0oo;

        public OooOOO(Window.Callback callback) {
            super(callback);
        }

        public final void OooO00o(Window.Callback callback) {
            try {
                this.f2359OooO0o = true;
                callback.onContentChanged();
            } finally {
                this.f2359OooO0o = false;
            }
        }

        @Override // p016OooOoOO.o0OOO0o, android.view.Window.Callback
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f2361OooO0oO) {
                return this.f339OooO0Oo.dispatchKeyEvent(keyEvent);
            }
            return AppCompatDelegateImpl.this.Oooo0O0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p016OooOoOO.o0OOO0o, android.view.Window.Callback
        public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            boolean z;
            if (super.dispatchKeyShortcutEvent(keyEvent)) {
                return true;
            }
            int keyCode = keyEvent.getKeyCode();
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            appCompatDelegateImpl.OoooO0();
            ActionBar actionBar = appCompatDelegateImpl.f2306OooOOo;
            if (actionBar == null || !actionBar.OooO(keyCode, keyEvent)) {
                PanelFeatureState panelFeatureState = appCompatDelegateImpl.f2334OoooO00;
                if (panelFeatureState == null || !appCompatDelegateImpl.o000oOoO(panelFeatureState, keyEvent.getKeyCode(), keyEvent)) {
                    if (appCompatDelegateImpl.f2334OoooO00 == null) {
                        PanelFeatureState panelFeatureStateOooo = appCompatDelegateImpl.Oooo(0);
                        appCompatDelegateImpl.OoooOOO(panelFeatureStateOooo, keyEvent);
                        boolean zO000oOoO = appCompatDelegateImpl.o000oOoO(panelFeatureStateOooo, keyEvent.getKeyCode(), keyEvent);
                        panelFeatureStateOooo.f2382OooOO0O = false;
                        if (zO000oOoO) {
                        }
                    }
                    z = false;
                } else {
                    PanelFeatureState panelFeatureState2 = appCompatDelegateImpl.f2334OoooO00;
                    if (panelFeatureState2 != null) {
                        panelFeatureState2.f2383OooOO0o = true;
                    }
                }
                z = true;
            } else {
                z = true;
            }
            return z;
        }

        @Override // android.view.Window.Callback
        public final void onContentChanged() {
            if (this.f2359OooO0o) {
                this.f339OooO0Oo.onContentChanged();
            }
        }

        @Override // p016OooOoOO.o0OOO0o, android.view.Window.Callback
        public final boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.OooO)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // p016OooOoOO.o0OOO0o, android.view.Window.Callback
        public final View onCreatePanelView(int i) {
            OooO0O0 oooO0O0 = this.f2360OooO0o0;
            if (oooO0O0 != null) {
                View view = i == 0 ? new View(o00000O0.this.f2424OooO00o.getContext()) : null;
                if (view != null) {
                    return view;
                }
            }
            return super.onCreatePanelView(i);
        }

        @Override // p016OooOoOO.o0OOO0o, android.view.Window.Callback
        public final boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i == 108) {
                appCompatDelegateImpl.OoooO0();
                ActionBar actionBar = appCompatDelegateImpl.f2306OooOOo;
                if (actionBar != null) {
                    actionBar.OooO0OO(true);
                }
            } else {
                appCompatDelegateImpl.getClass();
            }
            return true;
        }

        @Override // p016OooOoOO.o0OOO0o, android.view.Window.Callback
        public final void onPanelClosed(int i, Menu menu) {
            if (this.f2362OooO0oo) {
                this.f339OooO0Oo.onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (i == 108) {
                appCompatDelegateImpl.OoooO0();
                ActionBar actionBar = appCompatDelegateImpl.f2306OooOOo;
                if (actionBar != null) {
                    actionBar.OooO0OO(false);
                    return;
                }
                return;
            }
            if (i != 0) {
                appCompatDelegateImpl.getClass();
                return;
            }
            PanelFeatureState panelFeatureStateOooo = appCompatDelegateImpl.Oooo(i);
            if (panelFeatureStateOooo.f2385OooOOO0) {
                appCompatDelegateImpl.Oooo00o(panelFeatureStateOooo, false);
            }
        }

        @Override // p016OooOoOO.o0OOO0o, android.view.Window.Callback
        public final boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.OooO oooO = menu instanceof androidx.appcompat.view.menu.OooO ? (androidx.appcompat.view.menu.OooO) menu : null;
            if (i == 0 && oooO == null) {
                return false;
            }
            if (oooO != null) {
                oooO.f2591OooOo = true;
            }
            OooO0O0 oooO0O0 = this.f2360OooO0o0;
            if (oooO0O0 != null) {
                o00000O0.OooO oooO2 = (o00000O0.OooO) oooO0O0;
                if (i == 0) {
                    o00000O0 o00000o1 = o00000O0.this;
                    if (!o00000o1.f2427OooO0Oo) {
                        o00000o1.f2424OooO00o.f3308OooOOO0 = true;
                        o00000o1.f2427OooO0Oo = true;
                    }
                }
            }
            boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
            if (oooO != null) {
                oooO.f2591OooOo = false;
            }
            return zOnPreparePanel;
        }

        @Override // p016OooOoOO.o0OOO0o, android.view.Window.Callback
        @RequiresApi(24)
        public final void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.OooO oooO = AppCompatDelegateImpl.this.Oooo(0).f2380OooO0oo;
            if (oooO != null) {
                super.onProvideKeyboardShortcuts(list, oooO, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // android.view.Window.Callback
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:59:0x0141  */
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
        @Override // p016OooOoOO.o0OOO0o, android.view.Window.Callback
        @RequiresApi(23)
        public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            boolean z;
            ViewGroup viewGroup;
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f2317OooOoo || i != 0) {
                return super.onWindowStartingActionMode(callback, i);
            }
            OooOoOO.oo000o.OooO00o oooO00o = new OooOoOO.oo000o.OooO00o(appCompatDelegateImpl.f2302OooOOO, callback);
            p016OooOoOO.o0OoOo0 o0oooo1 = appCompatDelegateImpl.f2309OooOo;
            if (o0oooo1 != null) {
                o0oooo1.OooO0OO();
            }
            OooO0o oooO0o = appCompatDelegateImpl.new OooO0o(oooO00o);
            appCompatDelegateImpl.OoooO0();
            ActionBar actionBar = appCompatDelegateImpl.f2306OooOOo;
            androidx.appcompat.app.OooO oooO = appCompatDelegateImpl.f2307OooOOo0;
            if (actionBar != null) {
                p016OooOoOO.o0OoOo0 o0oooo0OooOOOo = actionBar.OooOOOo(oooO0o);
                appCompatDelegateImpl.f2309OooOo = o0oooo0OooOOOo;
                if (o0oooo0OooOOOo != null && oooO != null) {
                    oooO.OooO0OO();
                }
            }
            if (appCompatDelegateImpl.f2309OooOo == null) {
                o000OOo0 o000ooo1 = appCompatDelegateImpl.f2318OooOoo0;
                if (o000ooo1 != null) {
                    o000ooo1.OooO0O0();
                }
                p016OooOoOO.o0OoOo0 o0oooo2 = appCompatDelegateImpl.f2309OooOo;
                if (o0oooo2 != null) {
                    o0oooo2.OooO0OO();
                }
                if (oooO != null && !appCompatDelegateImpl.f2336OoooOO0) {
                    try {
                        oooO.OooO00o();
                    } catch (AbstractMethodError unused) {
                    }
                }
                if (appCompatDelegateImpl.f2315OooOoO0 == null) {
                    boolean z2 = appCompatDelegateImpl.f2328Oooo0o;
                    Context context = appCompatDelegateImpl.f2302OooOOO;
                    if (z2) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(p012OooOo0O.OooOOO0.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            Resources.Theme themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            p016OooOoOO.o00Oo0 o00oo1 = new p016OooOoOO.o00Oo0(context, 0);
                            o00oo1.getTheme().setTo(themeNewTheme);
                            context = o00oo1;
                        }
                        appCompatDelegateImpl.f2315OooOoO0 = new ActionBarContextView(context);
                        PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, p012OooOo0O.OooOOO0.actionModePopupWindowStyle);
                        appCompatDelegateImpl.f2314OooOoO = popupWindow;
                        androidx.core.widget.OooOOOO.OooO0Oo(popupWindow, 2);
                        appCompatDelegateImpl.f2314OooOoO.setContentView(appCompatDelegateImpl.f2315OooOoO0);
                        appCompatDelegateImpl.f2314OooOoO.setWidth(-1);
                        context.getTheme().resolveAttribute(p012OooOo0O.OooOOO0.actionBarSize, typedValue, true);
                        appCompatDelegateImpl.f2315OooOoO0.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                        appCompatDelegateImpl.f2314OooOoO.setHeight(-2);
                        appCompatDelegateImpl.f2316OooOoOO = new androidx.appcompat.app.OooOOO(appCompatDelegateImpl);
                    } else {
                        ViewStubCompat viewStubCompat = (ViewStubCompat) appCompatDelegateImpl.f2320OooOooo.findViewById(p012OooOo0O.Oooo000.action_mode_bar_stub);
                        if (viewStubCompat != null) {
                            appCompatDelegateImpl.OoooO0();
                            ActionBar actionBar2 = appCompatDelegateImpl.f2306OooOOo;
                            Context contextOooO0o0 = actionBar2 != null ? actionBar2.OooO0o0() : null;
                            if (contextOooO0o0 != null) {
                                context = contextOooO0o0;
                            }
                            viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                            appCompatDelegateImpl.f2315OooOoO0 = (ActionBarContextView) viewStubCompat.OooO00o();
                        }
                    }
                }
                if (appCompatDelegateImpl.f2315OooOoO0 != null) {
                    o000OOo0 o000ooo2 = appCompatDelegateImpl.f2318OooOoo0;
                    if (o000ooo2 != null) {
                        o000ooo2.OooO0O0();
                    }
                    appCompatDelegateImpl.f2315OooOoO0.OooO0oo();
                    p016OooOoOO.o00Ooo o00ooo2 = new p016OooOoOO.o00Ooo(appCompatDelegateImpl.f2315OooOoO0.getContext(), appCompatDelegateImpl.f2315OooOoO0, oooO0o);
                    if (oooO0o.OooO0Oo(o00ooo2, o00ooo2.f298OooOO0O)) {
                        o00ooo2.OooO();
                        appCompatDelegateImpl.f2315OooOoO0.OooO0o(o00ooo2);
                        appCompatDelegateImpl.f2309OooOo = o00ooo2;
                        if (appCompatDelegateImpl.f2319OooOooO && (viewGroup = appCompatDelegateImpl.f2320OooOooo) != null) {
                            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
                            z = ViewCompat.OooOO0O.OooO0OO(viewGroup);
                        }
                        if (z) {
                            appCompatDelegateImpl.f2315OooOoO0.setAlpha(0.0f);
                            o000OOo0 o000ooo0OooO00o = ViewCompat.OooO00o(appCompatDelegateImpl.f2315OooOoO0);
                            o000ooo0OooO00o.OooO00o(1.0f);
                            appCompatDelegateImpl.f2318OooOoo0 = o000ooo0OooO00o;
                            o000ooo0OooO00o.OooO0Oo(new androidx.appcompat.app.OooOOOO(appCompatDelegateImpl));
                        } else {
                            appCompatDelegateImpl.f2315OooOoO0.setAlpha(1.0f);
                            appCompatDelegateImpl.f2315OooOoO0.setVisibility(0);
                            if (appCompatDelegateImpl.f2315OooOoO0.getParent() instanceof View) {
                                View view = (View) appCompatDelegateImpl.f2315OooOoO0.getParent();
                                WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5344OooO00o;
                                ViewCompat.OooOOO0.OooO0OO(view);
                            }
                        }
                        if (appCompatDelegateImpl.f2314OooOoO != null) {
                            appCompatDelegateImpl.f2304OooOOOO.getDecorView().post(appCompatDelegateImpl.f2316OooOoOO);
                        }
                    } else {
                        appCompatDelegateImpl.f2309OooOo = null;
                    }
                }
                if (appCompatDelegateImpl.f2309OooOo != null && oooO != null) {
                    oooO.OooO0OO();
                }
                appCompatDelegateImpl.OoooOo0();
                appCompatDelegateImpl.f2309OooOo = appCompatDelegateImpl.f2309OooOo;
            }
            appCompatDelegateImpl.OoooOo0();
            p016OooOoOO.o0OoOo0 o0oooo3 = appCompatDelegateImpl.f2309OooOo;
            if (o0oooo3 != null) {
                return oooO00o.OooO0o0(o0oooo3);
            }
            return null;
        }
    }

    @RequiresApi(33)
    public static class OooOOO0 {
        @DoNotInline
        public static OnBackInvokedDispatcher OooO00o(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, androidx.appcompat.app.o0Oo0oo] */
        @DoNotInline
        public static OnBackInvokedCallback OooO0O0(Object obj, final AppCompatDelegateImpl appCompatDelegateImpl) {
            Objects.requireNonNull(appCompatDelegateImpl);
            ?? r0 = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.o0Oo0oo
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    appCompatDelegateImpl.OoooO();
                }
            };
            o00oO0o.OooO00o(obj).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, r0);
            return r0;
        }

        @DoNotInline
        public static void OooO0OO(Object obj, Object obj2) {
            o00oO0o.OooO00o(obj).unregisterOnBackInvokedCallback(oo000o.OooO00o(obj2));
        }
    }

    public class OooOOOO extends OooOo00 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final PowerManager f2363OooO0OO;

        public OooOOOO(Context context) {
            super();
            this.f2363OooO0OO = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOo00
        public final IntentFilter OooO0O0() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOo00
        public final int OooO0OO() {
            return this.f2363OooO0OO.isPowerSaveMode() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOo00
        public final void OooO0Oo() {
            AppCompatDelegateImpl.this.OooO0Oo();
        }
    }

    public class OooOo extends OooOo00 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00000OO f2365OooO0OO;

        public OooOo(o00000OO o00000oo2) {
            super();
            this.f2365OooO0OO = o00000oo2;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOo00
        public final IntentFilter OooO0O0() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOo00
        public final int OooO0OO() {
            Location location;
            boolean z;
            long j;
            long j2;
            Location lastKnownLocation;
            o00000OO o00000oo2 = this.f2365OooO0OO;
            o00000OO.OooO00o oooO00o = o00000oo2.f2441OooO0OO;
            boolean z2 = false;
            if (oooO00o.f2443OooO0O0 > System.currentTimeMillis()) {
                z = oooO00o.f2442OooO00o;
            } else {
                Context context = o00000oo2.f2439OooO00o;
                int iOooO00o = PermissionChecker.OooO00o(context, "android.permission.ACCESS_COARSE_LOCATION");
                Location lastKnownLocation2 = null;
                LocationManager locationManager = o00000oo2.f2440OooO0O0;
                if (iOooO00o == 0) {
                    try {
                        lastKnownLocation = locationManager.isProviderEnabled("network") ? locationManager.getLastKnownLocation("network") : null;
                    } catch (Exception e) {
                        Log.d("TwilightManager", "Failed to get last known location", e);
                    }
                    location = lastKnownLocation;
                } else {
                    location = null;
                }
                if (PermissionChecker.OooO00o(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    try {
                        if (locationManager.isProviderEnabled("gps")) {
                            lastKnownLocation2 = locationManager.getLastKnownLocation("gps");
                        }
                    } catch (Exception e2) {
                        Log.d("TwilightManager", "Failed to get last known location", e2);
                    }
                }
                if (lastKnownLocation2 == null || location == null ? lastKnownLocation2 != null : lastKnownLocation2.getTime() > location.getTime()) {
                    location = lastKnownLocation2;
                }
                if (location != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (o00000O.f2420OooO0Oo == null) {
                        o00000O.f2420OooO0Oo = new o00000O();
                    }
                    o00000O o00000o = o00000O.f2420OooO0Oo;
                    o00000o.OooO00o(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis - 86400000);
                    o00000o.OooO00o(location.getLatitude(), location.getLongitude(), jCurrentTimeMillis);
                    z2 = o00000o.f2423OooO0OO == 1;
                    long j3 = o00000o.f2422OooO0O0;
                    long j4 = o00000o.f2421OooO00o;
                    o00000o.OooO00o(location.getLatitude(), location.getLongitude(), 86400000 + jCurrentTimeMillis);
                    long j5 = o00000o.f2422OooO0O0;
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
                    oooO00o.f2442OooO00o = z2;
                    oooO00o.f2443OooO0O0 = j;
                } else {
                    Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
                    int i = Calendar.getInstance().get(11);
                    if (i < 6 || i >= 22) {
                        z2 = true;
                    }
                }
                z = z2;
            }
            return z ? 2 : 1;
        }

        @Override // androidx.appcompat.app.AppCompatDelegateImpl.OooOo00
        public final void OooO0Oo() {
            AppCompatDelegateImpl.this.OooO0Oo();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public abstract class OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public OooO00o f2367OooO00o;

        public class OooO00o extends BroadcastReceiver {
            public OooO00o() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                OooOo00.this.OooO0Oo();
            }
        }

        public OooOo00() {
        }

        public final void OooO00o() {
            OooO00o oooO00o = this.f2367OooO00o;
            if (oooO00o != null) {
                try {
                    AppCompatDelegateImpl.this.f2302OooOOO.unregisterReceiver(oooO00o);
                } catch (IllegalArgumentException unused) {
                }
                this.f2367OooO00o = null;
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
            if (this.f2367OooO00o == null) {
                this.f2367OooO00o = new OooO00o();
            }
            AppCompatDelegateImpl.this.f2302OooOOO.registerReceiver(this.f2367OooO00o, intentFilterOooO0O0);
        }
    }

    public final class Oooo0 implements androidx.appcompat.view.menu.OooOOO.OooO00o {
        public Oooo0() {
        }

        @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO oooO, boolean z) {
            PanelFeatureState panelFeatureState;
            androidx.appcompat.view.menu.OooO oooOOooOO0O = oooO.OooOO0O();
            int i = 0;
            boolean z2 = oooOOooOO0O != oooO;
            if (z2) {
                oooO = oooOOooOO0O;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            PanelFeatureState[] panelFeatureStateArr = appCompatDelegateImpl.f2321Oooo;
            int length = panelFeatureStateArr != null ? panelFeatureStateArr.length : 0;
            while (true) {
                if (i < length) {
                    panelFeatureState = panelFeatureStateArr[i];
                    if (panelFeatureState != null && panelFeatureState.f2380OooO0oo == oooO) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    panelFeatureState = null;
                    break;
                }
            }
            if (panelFeatureState != null) {
                if (!z2) {
                    appCompatDelegateImpl.Oooo00o(panelFeatureState, z);
                } else {
                    appCompatDelegateImpl.Oooo000(panelFeatureState.f2373OooO00o, panelFeatureState, oooOOooOO0O);
                    appCompatDelegateImpl.Oooo00o(panelFeatureState, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.OooOOO.OooO00o
        public final boolean OooO0OO(@NonNull androidx.appcompat.view.menu.OooO oooO) {
            Window.Callback callbackOoooO00;
            if (oooO != oooO.OooOO0O()) {
                return true;
            }
            AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
            if (!appCompatDelegateImpl.f2326Oooo0O0 || (callbackOoooO00 = appCompatDelegateImpl.OoooO00()) == null || appCompatDelegateImpl.f2336OoooOO0) {
                return true;
            }
            callbackOoooO00.onMenuOpened(108, oooO);
            return true;
        }
    }

    public class Oooo000 extends ContentFrameLayout {
        public Oooo000(p016OooOoOO.o00Oo0 o00oo1) {
            super(o00oo1);
        }

        @Override // android.view.ViewGroup, android.view.View
        public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return AppCompatDelegateImpl.this.Oooo0O0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                    AppCompatDelegateImpl appCompatDelegateImpl = AppCompatDelegateImpl.this;
                    appCompatDelegateImpl.Oooo00o(appCompatDelegateImpl.Oooo(0), true);
                    return true;
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public final void setBackgroundResource(int i) {
            setBackgroundDrawable(p013OooOo0o.o00Oo0.OooO00o(getContext(), i));
        }
    }

    public static final class PanelFeatureState {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooO0OO f2372OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f2373OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f2374OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f2375OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f2376OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public View f2377OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Oooo000 f2378OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public View f2379OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public androidx.appcompat.view.menu.OooO f2380OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public p016OooOoOO.o00Oo0 f2381OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f2382OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f2383OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f2384OooOOO = false;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f2385OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public boolean f2386OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public Bundle f2387OooOOOo;

        @SuppressLint({"BanParcelableUsage"})
        public static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new OooO00o();

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public int f2388OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public Bundle f2389OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public boolean f2390OooO0o0;

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
                savedState.f2388OooO0Oo = parcel.readInt();
                boolean z = parcel.readInt() == 1;
                savedState.f2390OooO0o0 = z;
                if (z) {
                    savedState.f2389OooO0o = parcel.readBundle(classLoader);
                }
                return savedState;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2388OooO0Oo);
                parcel.writeInt(this.f2390OooO0o0 ? 1 : 0);
                if (this.f2390OooO0o0) {
                    parcel.writeBundle(this.f2389OooO0o);
                }
            }
        }

        public PanelFeatureState(int i) {
            this.f2373OooO00o = i;
        }
    }

    public AppCompatDelegateImpl(Context context, Window window, androidx.appcompat.app.OooO oooO, Object obj) {
        p190o00o0O.OooOo<String, Integer> oooOo;
        Integer orDefault;
        AppCompatActivity appCompatActivity;
        this.f2337OoooOOO = -100;
        this.f2302OooOOO = context;
        this.f2307OooOOo0 = oooO;
        this.f2303OooOOO0 = obj;
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
                this.f2337OoooOOO = appCompatActivity.OooOO0o().OooO0oo();
            }
        }
        if (this.f2337OoooOOO == -100 && (orDefault = (oooOo = f2301ooOO).getOrDefault(this.f2303OooOOO0.getClass().getName(), null)) != null) {
            this.f2337OoooOOO = orDefault.intValue();
            oooOo.remove(this.f2303OooOOO0.getClass().getName());
        }
        if (window != null) {
            OooOooO(window);
        }
        androidx.appcompat.widget.OooOOO0.OooO0Oo();
    }

    @Nullable
    public static p063o0000oO.o00oO0o OooOooo(@NonNull Context context) {
        p063o0000oO.o00oO0o o00oo0o2;
        p063o0000oO.o00oO0o o00oo0oOooO0O0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (o00oo0o2 = AppCompatDelegate.f2291OooO0o) == null) {
            return null;
        }
        p063o0000oO.o00oO0o o00oo0oOooo0oo = Oooo0oo(context.getApplicationContext().getResources().getConfiguration());
        int i2 = 0;
        if (i < 24) {
            o00oo0oOooO0O0 = o00oo0o2.OooO0Oo() ? p063o0000oO.o00oO0o.f33776OooO0O0 : p063o0000oO.o00oO0o.OooO0O0(o00oo0o2.OooO0OO(0).toString());
        } else if (o00oo0o2.OooO0Oo()) {
            o00oo0oOooO0O0 = p063o0000oO.o00oO0o.f33776OooO0O0;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (true) {
                p063o0000oO.o0OOO0o o0ooo0o2 = o00oo0o2.f33777OooO00o;
                if (i2 >= o00oo0oOooo0oo.f33777OooO00o.size() + o0ooo0o2.size()) {
                    break;
                }
                Locale localeOooO0OO = i2 < o0ooo0o2.size() ? o00oo0o2.OooO0OO(i2) : o00oo0oOooo0oo.OooO0OO(i2 - o0ooo0o2.size());
                if (localeOooO0OO != null) {
                    linkedHashSet.add(localeOooO0OO);
                }
                i2++;
            }
            o00oo0oOooO0O0 = p063o0000oO.o00oO0o.OooO00o((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return o00oo0oOooO0O0.OooO0Oo() ? o00oo0oOooo0oo : o00oo0oOooO0O0;
    }

    @NonNull
    public static Configuration Oooo0(@NonNull Context context, int i, @Nullable p063o0000oO.o00oO0o o00oo0o2, @Nullable Configuration configuration, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i != 2) {
            i2 = z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i2 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (o00oo0o2 != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                OooOO0O.OooO0Oo(configuration2, o00oo0o2);
            } else {
                OooO.OooO0O0(configuration2, o00oo0o2.OooO0OO(0));
                OooO.OooO00o(configuration2, o00oo0o2.OooO0OO(0));
            }
        }
        return configuration2;
    }

    public static p063o0000oO.o00oO0o Oooo0oo(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? OooOO0O.OooO0O0(configuration) : p063o0000oO.o00oO0o.OooO0O0(OooOO0.OooO00o(configuration.locale));
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final MenuInflater OooO() {
        if (this.f2308OooOOoo == null) {
            OoooO0();
            ActionBar actionBar = this.f2306OooOOo;
            this.f2308OooOOoo = new p016OooOoOO.o00oO0o(actionBar != null ? actionBar.OooO0o0() : this.f2302OooOOO);
        }
        return this.f2308OooOOoo;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0029  */
    @Override // androidx.appcompat.view.menu.OooO.OooO00o
    public final boolean OooO00o(@NonNull androidx.appcompat.view.menu.OooO oooO, @NonNull MenuItem menuItem) {
        int length;
        int i;
        PanelFeatureState panelFeatureState;
        Window.Callback callbackOoooO00 = OoooO00();
        if (callbackOoooO00 != null && !this.f2336OoooOO0) {
            androidx.appcompat.view.menu.OooO oooOOooOO0O = oooO.OooOO0O();
            PanelFeatureState[] panelFeatureStateArr = this.f2321Oooo;
            if (panelFeatureStateArr != null) {
                length = panelFeatureStateArr.length;
                i = 0;
            } else {
                length = 0;
                i = 0;
            }
            while (i < length) {
                panelFeatureState = panelFeatureStateArr[i];
                if (panelFeatureState == null || panelFeatureState.f2380OooO0oo != oooOOooOO0O) {
                    i++;
                } else if (panelFeatureState != null) {
                    return callbackOoooO00.onMenuItemSelected(panelFeatureState.f2373OooO00o, menuItem);
                }
            }
            panelFeatureState = null;
            if (panelFeatureState != null) {
                return callbackOoooO00.onMenuItemSelected(panelFeatureState.f2373OooO00o, menuItem);
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooO.OooO00o
    public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO oooO) {
        androidx.appcompat.widget.o0OOO0o o0ooo0o2 = this.f2310OooOo0;
        if (o0ooo0o2 == null || !o0ooo0o2.OooO00o() || (ViewConfiguration.get(this.f2302OooOOO).hasPermanentMenuKey() && !this.f2310OooOo0.OooO0oO())) {
            PanelFeatureState panelFeatureStateOooo = Oooo(0);
            panelFeatureStateOooo.f2384OooOOO = true;
            Oooo00o(panelFeatureStateOooo, false);
            OoooOO0(panelFeatureStateOooo, null);
            return;
        }
        Window.Callback callbackOoooO00 = OoooO00();
        if (this.f2310OooOo0.OooO0o0()) {
            this.f2310OooOo0.OooO0OO();
            if (this.f2336OoooOO0) {
                return;
            }
            callbackOoooO00.onPanelClosed(108, Oooo(0).f2380OooO0oo);
            return;
        }
        if (callbackOoooO00 == null || this.f2336OoooOO0) {
            return;
        }
        if (this.f2343Ooooo0o && (1 & this.f2344OooooO0) != 0) {
            View decorView = this.f2304OooOOOO.getDecorView();
            OooO00o oooO00o = this.f2345OooooOO;
            decorView.removeCallbacks(oooO00o);
            oooO00o.run();
        }
        PanelFeatureState panelFeatureStateOooo2 = Oooo(0);
        androidx.appcompat.view.menu.OooO oooO2 = panelFeatureStateOooo2.f2380OooO0oo;
        if (oooO2 == null || panelFeatureStateOooo2.f2386OooOOOO || !callbackOoooO00.onPreparePanel(0, panelFeatureStateOooo2.f2379OooO0oO, oooO2)) {
            return;
        }
        callbackOoooO00.onMenuOpened(108, panelFeatureStateOooo2.f2380OooO0oo);
        this.f2310OooOo0.OooO0Oo();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooO0OO(View view, ViewGroup.LayoutParams layoutParams) {
        Oooo0o0();
        ((ViewGroup) this.f2320OooOooo.findViewById(R.id.content)).addView(view, layoutParams);
        this.f2305OooOOOo.OooO00o(this.f2304OooOOOO.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean OooO0Oo() {
        return OooOoo(true, true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @Nullable
    public final <T extends View> T OooO0o(@IdRes int i) {
        Oooo0o0();
        return (T) this.f2304OooOOOO.findViewById(i);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @NonNull
    @CallSuper
    public final Context OooO0o0(@NonNull Context context) {
        this.f2335OoooO0O = true;
        int i = this.f2337OoooOOO;
        if (i == -100) {
            i = AppCompatDelegate.f2292OooO0o0;
        }
        int iOoooO0O = OoooO0O(i, context);
        int i2 = 0;
        if (AppCompatDelegate.OooOOO0(context) && AppCompatDelegate.OooOOO0(context)) {
            if (!BuildCompat.OooO0O0()) {
                synchronized (AppCompatDelegate.f2297OooOO0o) {
                    p063o0000oO.o00oO0o o00oo0o2 = AppCompatDelegate.f2291OooO0o;
                    if (o00oo0o2 == null) {
                        if (AppCompatDelegate.f2293OooO0oO == null) {
                            AppCompatDelegate.f2293OooO0oO = p063o0000oO.o00oO0o.OooO0O0(o000000O.OooO0O0(context));
                        }
                        if (!AppCompatDelegate.f2293OooO0oO.OooO0Oo()) {
                            AppCompatDelegate.f2291OooO0o = AppCompatDelegate.f2293OooO0oO;
                        }
                    } else if (!o00oo0o2.equals(AppCompatDelegate.f2293OooO0oO)) {
                        p063o0000oO.o00oO0o o00oo0o3 = AppCompatDelegate.f2291OooO0o;
                        AppCompatDelegate.f2293OooO0oO = o00oo0o3;
                        o000000O.OooO00o(context, o00oo0o3.f33777OooO00o.OooO00o());
                    }
                }
            } else if (!AppCompatDelegate.f2289OooO) {
                AppCompatDelegate.f2290OooO0Oo.execute(new androidx.appcompat.app.OooOO0(context, i2));
            }
        }
        p063o0000oO.o00oO0o o00oo0oOooOooo = OooOooo(context);
        Configuration configuration = null;
        if (f2300o00Ooo && (context instanceof ContextThemeWrapper)) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(Oooo0(context, iOoooO0O, o00oo0oOooOooo, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof p016OooOoOO.o00Oo0) {
            try {
                ((p016OooOoOO.o00Oo0) context).OooO00o(Oooo0(context, iOoooO0O, o00oo0oOooOooo, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f2299o00Oo0) {
            return context;
        }
        int i3 = Build.VERSION.SDK_INT;
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i4 = configuration3.mcc;
                int i5 = configuration4.mcc;
                if (i4 != i5) {
                    configuration.mcc = i5;
                }
                int i6 = configuration3.mnc;
                int i7 = configuration4.mnc;
                if (i6 != i7) {
                    configuration.mnc = i7;
                }
                if (i3 >= 24) {
                    OooOO0O.OooO00o(configuration3, configuration4, configuration);
                } else if (!o000OO.OooO0OO.OooO00o(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i8 = configuration3.touchscreen;
                int i9 = configuration4.touchscreen;
                if (i8 != i9) {
                    configuration.touchscreen = i9;
                }
                int i10 = configuration3.keyboard;
                int i11 = configuration4.keyboard;
                if (i10 != i11) {
                    configuration.keyboard = i11;
                }
                int i12 = configuration3.keyboardHidden;
                int i13 = configuration4.keyboardHidden;
                if (i12 != i13) {
                    configuration.keyboardHidden = i13;
                }
                int i14 = configuration3.navigation;
                int i15 = configuration4.navigation;
                if (i14 != i15) {
                    configuration.navigation = i15;
                }
                int i16 = configuration3.navigationHidden;
                int i17 = configuration4.navigationHidden;
                if (i16 != i17) {
                    configuration.navigationHidden = i17;
                }
                int i18 = configuration3.orientation;
                int i19 = configuration4.orientation;
                if (i18 != i19) {
                    configuration.orientation = i19;
                }
                int i20 = configuration3.screenLayout & 15;
                int i21 = configuration4.screenLayout & 15;
                if (i20 != i21) {
                    configuration.screenLayout |= i21;
                }
                int i22 = configuration3.screenLayout & 192;
                int i23 = configuration4.screenLayout & 192;
                if (i22 != i23) {
                    configuration.screenLayout |= i23;
                }
                int i24 = configuration3.screenLayout & 48;
                int i25 = configuration4.screenLayout & 48;
                if (i24 != i25) {
                    configuration.screenLayout |= i25;
                }
                int i26 = configuration3.screenLayout & 768;
                int i27 = configuration4.screenLayout & 768;
                if (i26 != i27) {
                    configuration.screenLayout |= i27;
                }
                if (i3 >= 26) {
                    if ((configuration3.colorMode & 3) != (configuration4.colorMode & 3)) {
                        configuration.colorMode |= configuration4.colorMode & 3;
                    }
                    if ((configuration3.colorMode & 12) != (configuration4.colorMode & 12)) {
                        configuration.colorMode |= configuration4.colorMode & 12;
                    }
                }
                int i28 = configuration3.uiMode & 15;
                int i29 = configuration4.uiMode & 15;
                if (i28 != i29) {
                    configuration.uiMode |= i29;
                }
                int i30 = configuration3.uiMode & 48;
                int i31 = configuration4.uiMode & 48;
                if (i30 != i31) {
                    configuration.uiMode |= i31;
                }
                int i32 = configuration3.screenWidthDp;
                int i33 = configuration4.screenWidthDp;
                if (i32 != i33) {
                    configuration.screenWidthDp = i33;
                }
                int i34 = configuration3.screenHeightDp;
                int i35 = configuration4.screenHeightDp;
                if (i34 != i35) {
                    configuration.screenHeightDp = i35;
                }
                int i36 = configuration3.smallestScreenWidthDp;
                int i37 = configuration4.smallestScreenWidthDp;
                if (i36 != i37) {
                    configuration.smallestScreenWidthDp = i37;
                }
                int i38 = configuration3.densityDpi;
                int i39 = configuration4.densityDpi;
                if (i38 != i39) {
                    configuration.densityDpi = i39;
                }
            }
        }
        Configuration configurationOooo0 = Oooo0(context, iOoooO0O, o00oo0oOooOooo, configuration, true);
        p016OooOoOO.o00Oo0 o00oo1 = new p016OooOoOO.o00Oo0(context, p012OooOo0O.o0OoOo0.Theme_AppCompat_Empty);
        o00oo1.OooO00o(configurationOooo0);
        try {
            i2 = context.getTheme() == null ? 0 : 1;
        } catch (NullPointerException unused3) {
        }
        if (i2 != 0) {
            androidx.core.content.res.OooO00o.OooOO0.OooO00o(o00oo1.getTheme());
        }
        return o00oo1;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final Context OooO0oO() {
        return this.f2302OooOOO;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final int OooO0oo() {
        return this.f2337OoooOOO;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final ActionBar OooOO0() {
        OoooO0();
        return this.f2306OooOOo;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOO0O() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f2302OooOOO);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof AppCompatDelegateImpl) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOO0o() {
        if (this.f2306OooOOo != null) {
            OoooO0();
            if (this.f2306OooOOo.OooO0o()) {
                return;
            }
            this.f2344OooooO0 |= 1;
            if (this.f2343Ooooo0o) {
                return;
            }
            View decorView = this.f2304OooOOOO.getDecorView();
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
            ViewCompat.OooO0o.OooOOO0(decorView, this.f2345OooooOO);
            this.f2343Ooooo0o = true;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOOO(Configuration configuration) throws IllegalAccessException {
        if (this.f2326Oooo0O0 && this.f2319OooOooO) {
            OoooO0();
            ActionBar actionBar = this.f2306OooOOo;
            if (actionBar != null) {
                actionBar.OooO0oO();
            }
        }
        androidx.appcompat.widget.OooOOO0 oooOOO0OooO00o = androidx.appcompat.widget.OooOOO0.OooO00o();
        Context context = this.f2302OooOOO;
        synchronized (oooOOO0OooO00o) {
            oooOOO0OooO00o.f2984OooO00o.OooOO0O(context);
        }
        this.f2351o000oOoO = new Configuration(this.f2302OooOOO.getResources().getConfiguration());
        OooOoo(false, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOOOO() throws IllegalAccessException {
        String strOooO0OO;
        this.f2335OoooO0O = true;
        OooOoo(false, true);
        Oooo0o();
        Object obj = this.f2303OooOOO0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strOooO0OO = o00000O.Oooo0.OooO0OO(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strOooO0OO = null;
            }
            if (strOooO0OO != null) {
                ActionBar actionBar = this.f2306OooOOo;
                if (actionBar == null) {
                    this.f2346OooooOo = true;
                } else {
                    actionBar.OooOO0o(true);
                }
            }
            synchronized (AppCompatDelegate.f2296OooOO0O) {
                AppCompatDelegate.OooOo00(this);
                AppCompatDelegate.f2295OooOO0.add(new WeakReference<>(this));
            }
        }
        this.f2351o000oOoO = new Configuration(this.f2302OooOOO.getResources().getConfiguration());
        this.f2332OoooO = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOOOo() {
        if (this.f2303OooOOO0 instanceof Activity) {
            synchronized (AppCompatDelegate.f2296OooOO0O) {
                AppCompatDelegate.OooOo00(this);
            }
        }
        if (this.f2343Ooooo0o) {
            this.f2304OooOOOO.getDecorView().removeCallbacks(this.f2345OooooOO);
        }
        this.f2336OoooOO0 = true;
        if (this.f2337OoooOOO != -100) {
            Object obj = this.f2303OooOOO0;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f2301ooOO.put(this.f2303OooOOO0.getClass().getName(), Integer.valueOf(this.f2337OoooOOO));
            } else {
                f2301ooOO.remove(this.f2303OooOOO0.getClass().getName());
            }
        } else {
            f2301ooOO.remove(this.f2303OooOOO0.getClass().getName());
        }
        ActionBar actionBar = this.f2306OooOOo;
        if (actionBar != null) {
            actionBar.OooO0oo();
        }
        OooOo oooOo = this.f2341OoooOoo;
        if (oooOo != null) {
            oooOo.OooO00o();
        }
        OooOOOO oooOOOO = this.f2342Ooooo00;
        if (oooOOOO != null) {
            oooOOOO.OooO00o();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOOo() throws IllegalAccessException {
        OooOoo(true, false);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOOo0() {
        OoooO0();
        ActionBar actionBar = this.f2306OooOOo;
        if (actionBar != null) {
            actionBar.OooOOO(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOOoo() {
        OoooO0();
        ActionBar actionBar = this.f2306OooOOo;
        if (actionBar != null) {
            actionBar.OooOOO(false);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOo(View view, ViewGroup.LayoutParams layoutParams) {
        Oooo0o0();
        ViewGroup viewGroup = (ViewGroup) this.f2320OooOooo.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f2305OooOOOo.OooO00o(this.f2304OooOOOO.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final boolean OooOo0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f2330Oooo0oO && i == 108) {
            return false;
        }
        if (this.f2326Oooo0O0 && i == 1) {
            this.f2326Oooo0O0 = false;
        }
        if (i == 1) {
            OoooOOo();
            this.f2330Oooo0oO = true;
            return true;
        }
        if (i == 2) {
            OoooOOo();
            this.f2325Oooo00o = true;
            return true;
        }
        if (i == 5) {
            OoooOOo();
            this.f2322Oooo0 = true;
            return true;
        }
        if (i == 10) {
            OoooOOo();
            this.f2329Oooo0o0 = true;
            return true;
        }
        if (i == 108) {
            OoooOOo();
            this.f2326Oooo0O0 = true;
            return true;
        }
        if (i != 109) {
            return this.f2304OooOOOO.requestFeature(i);
        }
        OoooOOo();
        this.f2327Oooo0OO = true;
        return true;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOo0O(int i) {
        Oooo0o0();
        ViewGroup viewGroup = (ViewGroup) this.f2320OooOooo.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f2302OooOOO).inflate(i, viewGroup);
        this.f2305OooOOOo.OooO00o(this.f2304OooOOOO.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOo0o(View view) {
        Oooo0o0();
        ViewGroup viewGroup = (ViewGroup) this.f2320OooOooo.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f2305OooOOOo.OooO00o(this.f2304OooOOOO.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOoO(Toolbar toolbar) {
        Object obj = this.f2303OooOOO0;
        if (obj instanceof Activity) {
            OoooO0();
            ActionBar actionBar = this.f2306OooOOo;
            if (actionBar instanceof o0000Ooo) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f2308OooOOoo = null;
            if (actionBar != null) {
                actionBar.OooO0oo();
            }
            this.f2306OooOOo = null;
            if (toolbar != null) {
                o00000O0 o00000o1 = new o00000O0(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2311OooOo00, this.f2305OooOOOo);
                this.f2306OooOOo = o00000o1;
                this.f2305OooOOOo.f2360OooO0o0 = o00000o1.f2426OooO0OO;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f2305OooOOOo.f2360OooO0o0 = null;
            }
            OooOO0o();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    @RequiresApi(17)
    public final void OooOoO0(int i) {
        if (this.f2337OoooOOO != i) {
            this.f2337OoooOOO = i;
            if (this.f2335OoooO0O) {
                OooO0Oo();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOoOO(@StyleRes int i) {
        this.f2338OoooOOo = i;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00ed  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooOoo(boolean z, boolean z2) throws IllegalAccessException {
        int i;
        boolean z3;
        Object obj;
        Object obj2;
        Object obj3;
        int i2;
        int i3 = 0;
        if (this.f2336OoooOO0) {
            return false;
        }
        int i4 = this.f2337OoooOOO;
        if (i4 == -100) {
            i4 = AppCompatDelegate.f2292OooO0o0;
        }
        int i5 = i4;
        Context context = this.f2302OooOOO;
        int iOoooO0O = OoooO0O(i5, context);
        int i6 = Build.VERSION.SDK_INT;
        p063o0000oO.o00oO0o o00oo0oOooOooo = i6 < 33 ? OooOooo(context) : null;
        if (!z2 && o00oo0oOooOooo != null) {
            o00oo0oOooOooo = Oooo0oo(context.getResources().getConfiguration());
        }
        Configuration configurationOooo0 = Oooo0(context, iOoooO0O, o00oo0oOooOooo, null, false);
        boolean z4 = this.f2340OoooOoO;
        boolean z5 = true;
        Object obj4 = this.f2303OooOOO0;
        if (z4 || !(obj4 instanceof Activity)) {
            this.f2340OoooOoO = true;
            i = this.f2339OoooOo0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
            } else {
                if (i6 >= 29) {
                    i2 = 269221888;
                } else {
                    i2 = i6 >= 24 ? 786432 : 0;
                }
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj4.getClass()), i2);
                    if (activityInfo != null) {
                        this.f2339OoooOo0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                    this.f2339OoooOo0 = 0;
                }
                this.f2340OoooOoO = true;
                i = this.f2339OoooOo0;
            }
        }
        Configuration configuration = this.f2351o000oOoO;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i7 = configuration.uiMode & 48;
        int i8 = configurationOooo0.uiMode & 48;
        p063o0000oO.o00oO0o o00oo0oOooo0oo = Oooo0oo(configuration);
        p063o0000oO.o00oO0o o00oo0oOooo0oo2 = o00oo0oOooOooo == null ? null : Oooo0oo(configurationOooo0);
        int i9 = i7 != i8 ? ConstantsKt.MINIMUM_BLOCK_SIZE : 0;
        if (o00oo0oOooo0oo2 != null && !o00oo0oOooo0oo.equals(o00oo0oOooo0oo2)) {
            i9 = i9 | 4 | 8192;
        }
        if (((~i) & i9) != 0 && z && this.f2335OoooO0O && ((f2299o00Oo0 || this.f2332OoooO) && (obj4 instanceof Activity))) {
            Activity activity = (Activity) obj4;
            if (activity.isChild()) {
                z3 = false;
            } else {
                int i10 = o00000O.OooO0O0.f33402OooO0OO;
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new o00000O.OooO00o(activity, i3));
                }
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3 || i9 == 0) {
            z5 = z3;
        } else {
            boolean z6 = (i & i9) == i9;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i8;
            if (o00oo0oOooo0oo2 != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    OooOO0O.OooO0Oo(configuration2, o00oo0oOooo0oo2);
                } else {
                    OooO.OooO0O0(configuration2, o00oo0oOooo0oo2.OooO0OO(0));
                    OooO.OooO00o(configuration2, o00oo0oOooo0oo2.OooO0OO(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i11 = Build.VERSION.SDK_INT;
            if (i11 < 26 && i11 < 28) {
                if (i11 >= 24) {
                    if (!o00000.f2413OooO0oo) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            o00000.f2412OooO0oO = declaredField;
                            declaredField.setAccessible(true);
                        } catch (NoSuchFieldException e2) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e2);
                        }
                        o00000.f2413OooO0oo = true;
                    }
                    Field field = o00000.f2412OooO0oO;
                    if (field != null) {
                        try {
                            obj2 = field.get(resources);
                        } catch (IllegalAccessException e3) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e3);
                            obj2 = null;
                        }
                        if (obj2 != null) {
                            if (!o00000.f2407OooO0O0) {
                                try {
                                    Field declaredField2 = obj2.getClass().getDeclaredField("mDrawableCache");
                                    o00000.f2406OooO00o = declaredField2;
                                    declaredField2.setAccessible(true);
                                } catch (NoSuchFieldException e4) {
                                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e4);
                                }
                                o00000.f2407OooO0O0 = true;
                            }
                            Field field2 = o00000.f2406OooO00o;
                            if (field2 != null) {
                                try {
                                    obj3 = field2.get(obj2);
                                } catch (IllegalAccessException e5) {
                                    Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e5);
                                    obj3 = null;
                                }
                            } else {
                                obj3 = null;
                            }
                            if (obj3 != null) {
                                o00000.OooO00o(obj3);
                            }
                        }
                    }
                } else {
                    if (!o00000.f2407OooO0O0) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            o00000.f2406OooO00o = declaredField3;
                            declaredField3.setAccessible(true);
                        } catch (NoSuchFieldException e6) {
                            Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e6);
                        }
                        o00000.f2407OooO0O0 = true;
                    }
                    Field field3 = o00000.f2406OooO00o;
                    if (field3 != null) {
                        try {
                            obj = field3.get(resources);
                        } catch (IllegalAccessException e7) {
                            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e7);
                            obj = null;
                        }
                    } else {
                        obj = null;
                    }
                    if (obj != null) {
                        o00000.OooO00o(obj);
                    }
                }
            }
            int i12 = this.f2338OoooOOo;
            if (i12 != 0) {
                context.setTheme(i12);
                context.getTheme().applyStyle(this.f2338OoooOOo, true);
            }
            if (z6 && (obj4 instanceof Activity)) {
                Activity activity2 = (Activity) obj4;
                if (activity2 instanceof LifecycleOwner) {
                    if (((LifecycleOwner) activity2).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f2332OoooO && !this.f2336OoooOO0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
        }
        if (z5 && (obj4 instanceof AppCompatActivity)) {
            if ((i9 & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0) {
                ((AppCompatActivity) obj4).getClass();
            }
            if ((i9 & 4) != 0) {
                ((AppCompatActivity) obj4).getClass();
            }
        }
        if (z5 && o00oo0oOooo0oo2 != null) {
            p063o0000oO.o00oO0o o00oo0oOooo0oo3 = Oooo0oo(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                OooOO0O.OooO0OO(o00oo0oOooo0oo3);
            } else {
                Locale.setDefault(o00oo0oOooo0oo3.OooO0OO(0));
            }
        }
        if (i5 == 0) {
            Oooo0oO(context).OooO0o0();
        } else {
            OooOo oooOo = this.f2341OoooOoo;
            if (oooOo != null) {
                oooOo.OooO00o();
            }
        }
        if (i5 == 3) {
            if (this.f2342Ooooo00 == null) {
                this.f2342Ooooo00 = new OooOOOO(context);
            }
            this.f2342Ooooo00.OooO0o0();
        } else {
            OooOOOO oooOOOO = this.f2342Ooooo00;
            if (oooOOOO != null) {
                oooOOOO.OooO00o();
            }
        }
        return z5;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    public final void OooOoo0(CharSequence charSequence) {
        this.f2311OooOo00 = charSequence;
        androidx.appcompat.widget.o0OOO0o o0ooo0o2 = this.f2310OooOo0;
        if (o0ooo0o2 != null) {
            o0ooo0o2.setWindowTitle(charSequence);
            return;
        }
        ActionBar actionBar = this.f2306OooOOo;
        if (actionBar != null) {
            actionBar.OooOOOO(charSequence);
            return;
        }
        TextView textView = this.f2323Oooo000;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0074  */
    public final void OooOooO(@NonNull Window window) {
        Drawable drawableOooO0oO;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f2304OooOOOO != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof OooOOO) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        OooOOO oooOOO = new OooOOO(callback);
        this.f2305OooOOOo = oooOOO;
        window.setCallback(oooOOO);
        Context context = this.f2302OooOOO;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, f2298o00O0O);
        if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawableOooO0oO = null;
        } else {
            androidx.appcompat.widget.OooOOO0 oooOOO0OooO00o = androidx.appcompat.widget.OooOOO0.OooO00o();
            synchronized (oooOOO0OooO00o) {
                drawableOooO0oO = oooOOO0OooO00o.f2984OooO00o.OooO0oO(context, resourceId, true);
            }
        }
        if (drawableOooO0oO != null) {
            window.setBackgroundDrawable(drawableOooO0oO);
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f2304OooOOOO = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f2350Ooooooo) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f2352o0OoOo0) != null) {
            OooOOO0.OooO0OO(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f2352o0OoOo0 = null;
        }
        Object obj = this.f2303OooOOO0;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f2350Ooooooo = OooOOO0.OooO00o(activity);
            } else {
                this.f2350Ooooooo = null;
            }
        } else {
            this.f2350Ooooooo = null;
        }
        OoooOo0();
    }

    public final PanelFeatureState Oooo(int i) {
        PanelFeatureState[] panelFeatureStateArr = this.f2321Oooo;
        if (panelFeatureStateArr == null || panelFeatureStateArr.length <= i) {
            PanelFeatureState[] panelFeatureStateArr2 = new PanelFeatureState[i + 1];
            if (panelFeatureStateArr != null) {
                System.arraycopy(panelFeatureStateArr, 0, panelFeatureStateArr2, 0, panelFeatureStateArr.length);
            }
            this.f2321Oooo = panelFeatureStateArr2;
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

    public final void Oooo000(int i, PanelFeatureState panelFeatureState, androidx.appcompat.view.menu.OooO oooO) {
        if (oooO == null) {
            if (panelFeatureState == null && i >= 0) {
                PanelFeatureState[] panelFeatureStateArr = this.f2321Oooo;
                if (i < panelFeatureStateArr.length) {
                    panelFeatureState = panelFeatureStateArr[i];
                }
            }
            if (panelFeatureState != null) {
                oooO = panelFeatureState.f2380OooO0oo;
            }
        }
        if ((panelFeatureState == null || panelFeatureState.f2385OooOOO0) && !this.f2336OoooOO0) {
            OooOOO oooOOO = this.f2305OooOOOo;
            Window.Callback callback = this.f2304OooOOOO.getCallback();
            oooOOO.getClass();
            try {
                oooOOO.f2362OooO0oo = true;
                callback.onPanelClosed(i, oooO);
            } finally {
                oooOOO.f2362OooO0oo = false;
            }
        }
    }

    public final void Oooo00O(@NonNull androidx.appcompat.view.menu.OooO oooO) {
        if (this.f2331Oooo0oo) {
            return;
        }
        this.f2331Oooo0oo = true;
        this.f2310OooOo0.OooO();
        Window.Callback callbackOoooO00 = OoooO00();
        if (callbackOoooO00 != null && !this.f2336OoooOO0) {
            callbackOoooO00.onPanelClosed(108, oooO);
        }
        this.f2331Oooo0oo = false;
    }

    public final void Oooo00o(PanelFeatureState panelFeatureState, boolean z) {
        Oooo000 oooo000;
        androidx.appcompat.widget.o0OOO0o o0ooo0o2;
        if (z && panelFeatureState.f2373OooO00o == 0 && (o0ooo0o2 = this.f2310OooOo0) != null && o0ooo0o2.OooO0o0()) {
            Oooo00O(panelFeatureState.f2380OooO0oo);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f2302OooOOO.getSystemService("window");
        if (windowManager != null && panelFeatureState.f2385OooOOO0 && (oooo000 = panelFeatureState.f2378OooO0o0) != null) {
            windowManager.removeView(oooo000);
            if (z) {
                Oooo000(panelFeatureState.f2373OooO00o, panelFeatureState, null);
            }
        }
        panelFeatureState.f2382OooOO0O = false;
        panelFeatureState.f2383OooOO0o = false;
        panelFeatureState.f2385OooOOO0 = false;
        panelFeatureState.f2377OooO0o = null;
        panelFeatureState.f2384OooOOO = true;
        if (this.f2334OoooO00 == panelFeatureState) {
            this.f2334OoooO00 = null;
        }
        if (panelFeatureState.f2373OooO00o == 0) {
            OoooOo0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    public final boolean Oooo0O0(KeyEvent keyEvent) {
        View decorView;
        boolean zOooO0OO;
        boolean zOoooOOO;
        Object obj = this.f2303OooOOO0;
        if (((obj instanceof androidx.core.view.o0OoOo0.OooO00o) || (obj instanceof oo0o0Oo)) && (decorView = this.f2304OooOOOO.getDecorView()) != null && androidx.core.view.o0OoOo0.OooO00o(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            OooOOO oooOOO = this.f2305OooOOOo;
            Window.Callback callback = this.f2304OooOOOO.getCallback();
            oooOOO.getClass();
            try {
                oooOOO.f2361OooO0oO = true;
                boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                oooOOO.f2361OooO0oO = false;
                if (zDispatchKeyEvent) {
                    return true;
                }
            } catch (Throwable th) {
                oooOOO.f2361OooO0oO = false;
                throw th;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f2333OoooO0 = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                PanelFeatureState panelFeatureStateOooo = Oooo(0);
                if (panelFeatureStateOooo.f2385OooOOO0) {
                    return true;
                }
                OoooOOO(panelFeatureStateOooo, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f2309OooOo != null) {
                    return true;
                }
                PanelFeatureState panelFeatureStateOooo2 = Oooo(0);
                androidx.appcompat.widget.o0OOO0o o0ooo0o2 = this.f2310OooOo0;
                Context context = this.f2302OooOOO;
                if (o0ooo0o2 == null || !o0ooo0o2.OooO00o() || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                    boolean z = panelFeatureStateOooo2.f2385OooOOO0;
                    if (z || panelFeatureStateOooo2.f2383OooOO0o) {
                        Oooo00o(panelFeatureStateOooo2, true);
                        zOooO0OO = z;
                    } else if (panelFeatureStateOooo2.f2382OooOO0O) {
                        if (panelFeatureStateOooo2.f2386OooOOOO) {
                            panelFeatureStateOooo2.f2382OooOO0O = false;
                            zOoooOOO = OoooOOO(panelFeatureStateOooo2, keyEvent);
                        } else {
                            zOoooOOO = true;
                        }
                        if (zOoooOOO) {
                            OoooOO0(panelFeatureStateOooo2, keyEvent);
                            zOooO0OO = true;
                        } else {
                            zOooO0OO = false;
                        }
                    } else {
                        zOooO0OO = false;
                    }
                } else if (this.f2310OooOo0.OooO0o0()) {
                    zOooO0OO = this.f2310OooOo0.OooO0OO();
                } else if (this.f2336OoooOO0 || !OoooOOO(panelFeatureStateOooo2, keyEvent)) {
                    zOooO0OO = false;
                } else {
                    zOooO0OO = this.f2310OooOo0.OooO0Oo();
                }
                if (!zOooO0OO) {
                    return true;
                }
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                if (audioManager != null) {
                    audioManager.playSoundEffect(0);
                    return true;
                }
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                return true;
            }
        } else if (OoooO()) {
            return true;
        }
        return false;
    }

    public final void Oooo0OO(int i) {
        PanelFeatureState panelFeatureStateOooo = Oooo(i);
        if (panelFeatureStateOooo.f2380OooO0oo != null) {
            Bundle bundle = new Bundle();
            panelFeatureStateOooo.f2380OooO0oo.OooOo0(bundle);
            if (bundle.size() > 0) {
                panelFeatureStateOooo.f2387OooOOOo = bundle;
            }
            panelFeatureStateOooo.f2380OooO0oo.OooOoO0();
            panelFeatureStateOooo.f2380OooO0oo.clear();
        }
        panelFeatureStateOooo.f2386OooOOOO = true;
        panelFeatureStateOooo.f2384OooOOO = true;
        if ((i == 108 || i == 0) && this.f2310OooOo0 != null) {
            PanelFeatureState panelFeatureStateOooo2 = Oooo(0);
            panelFeatureStateOooo2.f2382OooOO0O = false;
            OoooOOO(panelFeatureStateOooo2, null);
        }
    }

    public final void Oooo0o() {
        if (this.f2304OooOOOO == null) {
            Object obj = this.f2303OooOOO0;
            if (obj instanceof Activity) {
                OooOooO(((Activity) obj).getWindow());
            }
        }
        if (this.f2304OooOOOO == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final void Oooo0o0() {
        ViewGroup viewGroup;
        if (this.f2319OooOooO) {
            return;
        }
        int[] iArr = p012OooOo0O.o00O0O.AppCompatTheme;
        Context context = this.f2302OooOOO;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int i = p012OooOo0O.o00O0O.AppCompatTheme_windowActionBar;
        if (!typedArrayObtainStyledAttributes.hasValue(i)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p012OooOo0O.o00O0O.AppCompatTheme_windowNoTitle, false)) {
            OooOo0(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i, false)) {
            OooOo0(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p012OooOo0O.o00O0O.AppCompatTheme_windowActionBarOverlay, false)) {
            OooOo0(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p012OooOo0O.o00O0O.AppCompatTheme_windowActionModeOverlay, false)) {
            OooOo0(10);
        }
        this.f2328Oooo0o = typedArrayObtainStyledAttributes.getBoolean(p012OooOo0O.o00O0O.AppCompatTheme_android_windowIsFloating, false);
        typedArrayObtainStyledAttributes.recycle();
        Oooo0o();
        this.f2304OooOOOO.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f2330Oooo0oO) {
            viewGroup = this.f2329Oooo0o0 ? (ViewGroup) layoutInflaterFrom.inflate(p012OooOo0O.Oooo0.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(p012OooOo0O.Oooo0.abc_screen_simple, (ViewGroup) null);
        } else if (this.f2328Oooo0o) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(p012OooOo0O.Oooo0.abc_dialog_title_material, (ViewGroup) null);
            this.f2327Oooo0OO = false;
            this.f2326Oooo0O0 = false;
        } else if (this.f2326Oooo0O0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(p012OooOo0O.OooOOO0.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new p016OooOoOO.o00Oo0(context, typedValue.resourceId) : context).inflate(p012OooOo0O.Oooo0.abc_screen_toolbar, (ViewGroup) null);
            androidx.appcompat.widget.o0OOO0o o0ooo0o2 = (androidx.appcompat.widget.o0OOO0o) viewGroup.findViewById(p012OooOo0O.Oooo000.decor_content_parent);
            this.f2310OooOo0 = o0ooo0o2;
            o0ooo0o2.setWindowCallback(OoooO00());
            if (this.f2327Oooo0OO) {
                this.f2310OooOo0.OooO0oo(109);
            }
            if (this.f2325Oooo00o) {
                this.f2310OooOo0.OooO0oo(2);
            }
            if (this.f2322Oooo0) {
                this.f2310OooOo0.OooO0oo(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f2326Oooo0O0 + ", windowActionBarOverlay: " + this.f2327Oooo0OO + ", android:windowIsFloating: " + this.f2328Oooo0o + ", windowActionModeOverlay: " + this.f2329Oooo0o0 + ", windowNoTitle: " + this.f2330Oooo0oO + " }");
        }
        androidx.appcompat.app.OooOO0O oooOO0O = new androidx.appcompat.app.OooOO0O(this);
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
        ViewCompat.OooOOO.OooOo0(viewGroup, oooOO0O);
        if (this.f2310OooOo0 == null) {
            this.f2323Oooo000 = (TextView) viewGroup.findViewById(p012OooOo0O.Oooo000.title);
        }
        Method method = o0O0ooO.f3358OooO00o;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(p012OooOo0O.Oooo000.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f2304OooOOOO.findViewById(R.id.content);
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
        this.f2304OooOOOO.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new androidx.appcompat.app.OooOOO0(this));
        this.f2320OooOooo = viewGroup;
        Object obj = this.f2303OooOOO0;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f2311OooOo00;
        if (!TextUtils.isEmpty(title)) {
            androidx.appcompat.widget.o0OOO0o o0ooo0o3 = this.f2310OooOo0;
            if (o0ooo0o3 != null) {
                o0ooo0o3.setWindowTitle(title);
            } else {
                ActionBar actionBar = this.f2306OooOOo;
                if (actionBar != null) {
                    actionBar.OooOOOO(title);
                } else {
                    TextView textView = this.f2323Oooo000;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f2320OooOooo.findViewById(R.id.content);
        View decorView = this.f2304OooOOOO.getDecorView();
        contentFrameLayout2.f2893OooOO0.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5344OooO00o;
        if (ViewCompat.OooOO0O.OooO0OO(contentFrameLayout2)) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(p012OooOo0O.o00O0O.AppCompatTheme);
        typedArrayObtainStyledAttributes2.getValue(p012OooOo0O.o00O0O.AppCompatTheme_windowMinWidthMajor, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(p012OooOo0O.o00O0O.AppCompatTheme_windowMinWidthMinor, contentFrameLayout2.getMinWidthMinor());
        int i2 = p012OooOo0O.o00O0O.AppCompatTheme_windowFixedWidthMajor;
        if (typedArrayObtainStyledAttributes2.hasValue(i2)) {
            typedArrayObtainStyledAttributes2.getValue(i2, contentFrameLayout2.getFixedWidthMajor());
        }
        int i3 = p012OooOo0O.o00O0O.AppCompatTheme_windowFixedWidthMinor;
        if (typedArrayObtainStyledAttributes2.hasValue(i3)) {
            typedArrayObtainStyledAttributes2.getValue(i3, contentFrameLayout2.getFixedWidthMinor());
        }
        int i4 = p012OooOo0O.o00O0O.AppCompatTheme_windowFixedHeightMajor;
        if (typedArrayObtainStyledAttributes2.hasValue(i4)) {
            typedArrayObtainStyledAttributes2.getValue(i4, contentFrameLayout2.getFixedHeightMajor());
        }
        int i5 = p012OooOo0O.o00O0O.AppCompatTheme_windowFixedHeightMinor;
        if (typedArrayObtainStyledAttributes2.hasValue(i5)) {
            typedArrayObtainStyledAttributes2.getValue(i5, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f2319OooOooO = true;
        PanelFeatureState panelFeatureStateOooo = Oooo(0);
        if (this.f2336OoooOO0 || panelFeatureStateOooo.f2380OooO0oo != null) {
            return;
        }
        this.f2344OooooO0 |= 4096;
        if (this.f2343Ooooo0o) {
            return;
        }
        ViewCompat.OooO0o.OooOOO0(this.f2304OooOOOO.getDecorView(), this.f2345OooooOO);
        this.f2343Ooooo0o = true;
    }

    public final OooOo00 Oooo0oO(@NonNull Context context) {
        if (this.f2341OoooOoo == null) {
            if (o00000OO.f2438OooO0Oo == null) {
                Context applicationContext = context.getApplicationContext();
                o00000OO.f2438OooO0Oo = new o00000OO(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f2341OoooOoo = new OooOo(o00000OO.f2438OooO0Oo);
        }
        return this.f2341OoooOoo;
    }

    public final boolean OoooO() {
        boolean z = this.f2333OoooO0;
        this.f2333OoooO0 = false;
        PanelFeatureState panelFeatureStateOooo = Oooo(0);
        if (panelFeatureStateOooo.f2385OooOOO0) {
            if (!z) {
                Oooo00o(panelFeatureStateOooo, true);
            }
            return true;
        }
        p016OooOoOO.o0OoOo0 o0oooo1 = this.f2309OooOo;
        if (o0oooo1 != null) {
            o0oooo1.OooO0OO();
            return true;
        }
        OoooO0();
        ActionBar actionBar = this.f2306OooOOo;
        return actionBar != null && actionBar.OooO0O0();
    }

    public final void OoooO0() {
        Oooo0o0();
        if (this.f2326Oooo0O0 && this.f2306OooOOo == null) {
            Object obj = this.f2303OooOOO0;
            if (obj instanceof Activity) {
                this.f2306OooOOo = new o0000Ooo((Activity) obj, this.f2327Oooo0OO);
            } else if (obj instanceof Dialog) {
                this.f2306OooOOo = new o0000Ooo((Dialog) obj);
            }
            ActionBar actionBar = this.f2306OooOOo;
            if (actionBar != null) {
                actionBar.OooOO0o(this.f2346OooooOo);
            }
        }
    }

    public final Window.Callback OoooO00() {
        return this.f2304OooOOOO.getCallback();
    }

    public final int OoooO0O(int i, @NonNull Context context) {
        if (i == -100) {
            return -1;
        }
        if (i == -1) {
            return i;
        }
        if (i == 0) {
            if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            }
            return Oooo0oO(context).OooO0OO();
        }
        if (i == 1 || i == 2) {
            return i;
        }
        if (i != 3) {
            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
        }
        if (this.f2342Ooooo00 == null) {
            this.f2342Ooooo00 = new OooOOOO(context);
        }
        return this.f2342Ooooo00.OooO0OO();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0189  */
    /* JADX WARN: Code duplicated, block: B:103:0x019f  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:110:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x015c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0161  */
    /* JADX WARN: Code duplicated, block: B:89:0x0166  */
    /* JADX WARN: Code duplicated, block: B:91:0x016c  */
    /* JADX WARN: Code duplicated, block: B:95:0x017d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0181  */
    public final void OoooOO0(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        ViewGroup.LayoutParams layoutParams;
        ViewParent parent;
        androidx.appcompat.view.menu.OooO0OO oooO0OO;
        int i;
        ViewGroup.LayoutParams layoutParams2;
        if (panelFeatureState.f2385OooOOO0 || this.f2336OoooOO0) {
            return;
        }
        Context context = this.f2302OooOOO;
        int i2 = panelFeatureState.f2373OooO00o;
        if (i2 == 0) {
            if ((context.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackOoooO00 = OoooO00();
        if (callbackOoooO00 != null && !callbackOoooO00.onMenuOpened(i2, panelFeatureState.f2380OooO0oo)) {
            Oooo00o(panelFeatureState, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null && OoooOOO(panelFeatureState, keyEvent)) {
            Oooo000 oooo000 = panelFeatureState.f2378OooO0o0;
            if (oooo000 != null && !panelFeatureState.f2384OooOOO) {
                View view = panelFeatureState.f2379OooO0oO;
                if (view != null && (layoutParams2 = view.getLayoutParams()) != null && layoutParams2.width == -1) {
                    i = -1;
                }
                panelFeatureState.f2383OooOO0o = false;
                WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
                layoutParams3.gravity = panelFeatureState.f2375OooO0OO;
                layoutParams3.windowAnimations = panelFeatureState.f2376OooO0Oo;
                windowManager.addView(panelFeatureState.f2378OooO0o0, layoutParams3);
                panelFeatureState.f2385OooOOO0 = true;
                if (i2 == 0) {
                    OoooOo0();
                }
            }
            if (oooo000 == null) {
                OoooO0();
                ActionBar actionBar = this.f2306OooOOo;
                Context contextOooO0o0 = actionBar != null ? actionBar.OooO0o0() : null;
                if (contextOooO0o0 != null) {
                    context = contextOooO0o0;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(context.getTheme());
                themeNewTheme.resolveAttribute(p012OooOo0O.OooOOO0.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    themeNewTheme.applyStyle(i3, true);
                }
                themeNewTheme.resolveAttribute(p012OooOo0O.OooOOO0.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    themeNewTheme.applyStyle(i4, true);
                } else {
                    themeNewTheme.applyStyle(p012OooOo0O.o0OoOo0.Theme_AppCompat_CompactMenu, true);
                }
                p016OooOoOO.o00Oo0 o00oo1 = new p016OooOoOO.o00Oo0(context, 0);
                o00oo1.getTheme().setTo(themeNewTheme);
                panelFeatureState.f2381OooOO0 = o00oo1;
                TypedArray typedArrayObtainStyledAttributes = o00oo1.obtainStyledAttributes(p012OooOo0O.o00O0O.AppCompatTheme);
                panelFeatureState.f2374OooO0O0 = typedArrayObtainStyledAttributes.getResourceId(p012OooOo0O.o00O0O.AppCompatTheme_panelBackground, 0);
                panelFeatureState.f2376OooO0Oo = typedArrayObtainStyledAttributes.getResourceId(p012OooOo0O.o00O0O.AppCompatTheme_android_windowAnimationStyle, 0);
                typedArrayObtainStyledAttributes.recycle();
                panelFeatureState.f2378OooO0o0 = new Oooo000(panelFeatureState.f2381OooOO0);
                panelFeatureState.f2375OooO0OO = 81;
            } else if (panelFeatureState.f2384OooOOO && oooo000.getChildCount() > 0) {
                panelFeatureState.f2378OooO0o0.removeAllViews();
            }
            View view2 = panelFeatureState.f2379OooO0oO;
            if (view2 == null) {
                if (panelFeatureState.f2380OooO0oo != null) {
                    if (this.f2313OooOo0o == null) {
                        this.f2313OooOo0o = new Oooo0();
                    }
                    Oooo0 oooo0 = this.f2313OooOo0o;
                    if (panelFeatureState.f2372OooO == null) {
                        androidx.appcompat.view.menu.OooO0OO oooO0OO2 = new androidx.appcompat.view.menu.OooO0OO(panelFeatureState.f2381OooOO0, p012OooOo0O.Oooo0.abc_list_menu_item_layout);
                        panelFeatureState.f2372OooO = oooO0OO2;
                        oooO0OO2.f2609OooO = oooo0;
                        androidx.appcompat.view.menu.OooO oooO = panelFeatureState.f2380OooO0oo;
                        oooO.OooO0O0(oooO0OO2, oooO.f2573OooO00o);
                    }
                    androidx.appcompat.view.menu.OooO0OO oooO0OO3 = panelFeatureState.f2372OooO;
                    Oooo000 oooo001 = panelFeatureState.f2378OooO0o0;
                    if (oooO0OO3.f2613OooO0oO == null) {
                        oooO0OO3.f2613OooO0oO = (ExpandedMenuView) oooO0OO3.f2612OooO0o0.inflate(p012OooOo0O.Oooo0.abc_expanded_menu_layout, (ViewGroup) oooo001, false);
                        if (oooO0OO3.f2615OooOO0 == null) {
                            oooO0OO3.f2615OooOO0 = oooO0OO3.new OooO00o();
                        }
                        oooO0OO3.f2613OooO0oO.setAdapter((ListAdapter) oooO0OO3.f2615OooOO0);
                        oooO0OO3.f2613OooO0oO.setOnItemClickListener(oooO0OO3);
                    }
                    ExpandedMenuView expandedMenuView = oooO0OO3.f2613OooO0oO;
                    panelFeatureState.f2377OooO0o = expandedMenuView;
                    if (expandedMenuView != null) {
                    }
                    if (z) {
                        if (panelFeatureState.f2377OooO0o != null) {
                            if (panelFeatureState.f2379OooO0oO == null) {
                                oooO0OO = panelFeatureState.f2372OooO;
                                if (oooO0OO.f2615OooOO0 == null) {
                                    oooO0OO.f2615OooOO0 = oooO0OO.new OooO00o();
                                }
                                if (oooO0OO.f2615OooOO0.getCount() <= 0) {
                                    z2 = false;
                                }
                            }
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            layoutParams = panelFeatureState.f2377OooO0o.getLayoutParams();
                            if (layoutParams == null) {
                                layoutParams = new ViewGroup.LayoutParams(-2, -2);
                            }
                            panelFeatureState.f2378OooO0o0.setBackgroundResource(panelFeatureState.f2374OooO0O0);
                            parent = panelFeatureState.f2377OooO0o.getParent();
                            if (parent instanceof ViewGroup) {
                                ((ViewGroup) parent).removeView(panelFeatureState.f2377OooO0o);
                            }
                            panelFeatureState.f2378OooO0o0.addView(panelFeatureState.f2377OooO0o, layoutParams);
                            if (!panelFeatureState.f2377OooO0o.hasFocus()) {
                                panelFeatureState.f2377OooO0o.requestFocus();
                            }
                        }
                    }
                    panelFeatureState.f2384OooOOO = true;
                    return;
                }
                z = false;
                if (z) {
                    if (panelFeatureState.f2377OooO0o != null) {
                        if (panelFeatureState.f2379OooO0oO == null) {
                            oooO0OO = panelFeatureState.f2372OooO;
                            if (oooO0OO.f2615OooOO0 == null) {
                                oooO0OO.f2615OooOO0 = oooO0OO.new OooO00o();
                            }
                            if (oooO0OO.f2615OooOO0.getCount() <= 0) {
                                z2 = false;
                            }
                        }
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        layoutParams = panelFeatureState.f2377OooO0o.getLayoutParams();
                        if (layoutParams == null) {
                            layoutParams = new ViewGroup.LayoutParams(-2, -2);
                        }
                        panelFeatureState.f2378OooO0o0.setBackgroundResource(panelFeatureState.f2374OooO0O0);
                        parent = panelFeatureState.f2377OooO0o.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(panelFeatureState.f2377OooO0o);
                        }
                        panelFeatureState.f2378OooO0o0.addView(panelFeatureState.f2377OooO0o, layoutParams);
                        if (!panelFeatureState.f2377OooO0o.hasFocus()) {
                            panelFeatureState.f2377OooO0o.requestFocus();
                        }
                    }
                }
                panelFeatureState.f2384OooOOO = true;
                return;
            }
            panelFeatureState.f2377OooO0o = view2;
            z = true;
            if (z) {
                if (panelFeatureState.f2377OooO0o != null) {
                    if (panelFeatureState.f2379OooO0oO == null) {
                        oooO0OO = panelFeatureState.f2372OooO;
                        if (oooO0OO.f2615OooOO0 == null) {
                            oooO0OO.f2615OooOO0 = oooO0OO.new OooO00o();
                        }
                        if (oooO0OO.f2615OooOO0.getCount() <= 0) {
                            z2 = false;
                        }
                    }
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    layoutParams = panelFeatureState.f2377OooO0o.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.LayoutParams(-2, -2);
                    }
                    panelFeatureState.f2378OooO0o0.setBackgroundResource(panelFeatureState.f2374OooO0O0);
                    parent = panelFeatureState.f2377OooO0o.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(panelFeatureState.f2377OooO0o);
                    }
                    panelFeatureState.f2378OooO0o0.addView(panelFeatureState.f2377OooO0o, layoutParams);
                    if (!panelFeatureState.f2377OooO0o.hasFocus()) {
                        panelFeatureState.f2377OooO0o.requestFocus();
                    }
                }
            }
            panelFeatureState.f2384OooOOO = true;
            return;
            i = -2;
            panelFeatureState.f2383OooOO0o = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams4.gravity = panelFeatureState.f2375OooO0OO;
            layoutParams4.windowAnimations = panelFeatureState.f2376OooO0Oo;
            windowManager.addView(panelFeatureState.f2378OooO0o0, layoutParams4);
            panelFeatureState.f2385OooOOO0 = true;
            if (i2 == 0) {
                OoooOo0();
            }
        }
    }

    public final boolean OoooOOO(PanelFeatureState panelFeatureState, KeyEvent keyEvent) {
        androidx.appcompat.widget.o0OOO0o o0ooo0o2;
        androidx.appcompat.widget.o0OOO0o o0ooo0o3;
        Resources.Theme themeNewTheme;
        androidx.appcompat.widget.o0OOO0o o0ooo0o4;
        androidx.appcompat.widget.o0OOO0o o0ooo0o5;
        if (this.f2336OoooOO0) {
            return false;
        }
        if (panelFeatureState.f2382OooOO0O) {
            return true;
        }
        PanelFeatureState panelFeatureState2 = this.f2334OoooO00;
        if (panelFeatureState2 != null && panelFeatureState2 != panelFeatureState) {
            Oooo00o(panelFeatureState2, false);
        }
        Window.Callback callbackOoooO00 = OoooO00();
        int i = panelFeatureState.f2373OooO00o;
        if (callbackOoooO00 != null) {
            panelFeatureState.f2379OooO0oO = callbackOoooO00.onCreatePanelView(i);
        }
        boolean z = i == 0 || i == 108;
        if (z && (o0ooo0o5 = this.f2310OooOo0) != null) {
            o0ooo0o5.OooO0o();
        }
        if (panelFeatureState.f2379OooO0oO == null && (!z || !(this.f2306OooOOo instanceof o00000O0))) {
            androidx.appcompat.view.menu.OooO oooO = panelFeatureState.f2380OooO0oo;
            if (oooO == null || panelFeatureState.f2386OooOOOO) {
                if (oooO == null) {
                    Context context = this.f2302OooOOO;
                    if ((i == 0 || i == 108) && this.f2310OooOo0 != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme = context.getTheme();
                        theme.resolveAttribute(p012OooOo0O.OooOOO0.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            themeNewTheme = context.getResources().newTheme();
                            themeNewTheme.setTo(theme);
                            themeNewTheme.applyStyle(typedValue.resourceId, true);
                            themeNewTheme.resolveAttribute(p012OooOo0O.OooOOO0.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme.resolveAttribute(p012OooOo0O.OooOOO0.actionBarWidgetTheme, typedValue, true);
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
                            p016OooOoOO.o00Oo0 o00oo1 = new p016OooOoOO.o00Oo0(context, 0);
                            o00oo1.getTheme().setTo(themeNewTheme);
                            context = o00oo1;
                        }
                    }
                    androidx.appcompat.view.menu.OooO oooO2 = new androidx.appcompat.view.menu.OooO(context);
                    oooO2.f2578OooO0o0 = this;
                    androidx.appcompat.view.menu.OooO oooO3 = panelFeatureState.f2380OooO0oo;
                    if (oooO2 != oooO3) {
                        if (oooO3 != null) {
                            oooO3.OooOOo(panelFeatureState.f2372OooO);
                        }
                        panelFeatureState.f2380OooO0oo = oooO2;
                        androidx.appcompat.view.menu.OooO0OO oooO0OO = panelFeatureState.f2372OooO;
                        if (oooO0OO != null) {
                            oooO2.OooO0O0(oooO0OO, oooO2.f2573OooO00o);
                        }
                    }
                    if (panelFeatureState.f2380OooO0oo == null) {
                        return false;
                    }
                }
                if (z && (o0ooo0o3 = this.f2310OooOo0) != null) {
                    if (this.f2312OooOo0O == null) {
                        this.f2312OooOo0O = new OooO0OO();
                    }
                    o0ooo0o3.OooO0O0(panelFeatureState.f2380OooO0oo, this.f2312OooOo0O);
                }
                panelFeatureState.f2380OooO0oo.OooOoO0();
                if (!callbackOoooO00.onCreatePanelMenu(i, panelFeatureState.f2380OooO0oo)) {
                    androidx.appcompat.view.menu.OooO oooO4 = panelFeatureState.f2380OooO0oo;
                    if (oooO4 != null) {
                        if (oooO4 != null) {
                            oooO4.OooOOo(panelFeatureState.f2372OooO);
                        }
                        panelFeatureState.f2380OooO0oo = null;
                    }
                    if (z && (o0ooo0o2 = this.f2310OooOo0) != null) {
                        o0ooo0o2.OooO0O0(null, this.f2312OooOo0O);
                    }
                    return false;
                }
                panelFeatureState.f2386OooOOOO = false;
            }
            panelFeatureState.f2380OooO0oo.OooOoO0();
            Bundle bundle = panelFeatureState.f2387OooOOOo;
            if (bundle != null) {
                panelFeatureState.f2380OooO0oo.OooOOoo(bundle);
                panelFeatureState.f2387OooOOOo = null;
            }
            if (!callbackOoooO00.onPreparePanel(0, panelFeatureState.f2379OooO0oO, panelFeatureState.f2380OooO0oo)) {
                if (z && (o0ooo0o4 = this.f2310OooOo0) != null) {
                    o0ooo0o4.OooO0O0(null, this.f2312OooOo0O);
                }
                panelFeatureState.f2380OooO0oo.OooOo();
                return false;
            }
            panelFeatureState.f2380OooO0oo.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            panelFeatureState.f2380OooO0oo.OooOo();
        }
        panelFeatureState.f2382OooOO0O = true;
        panelFeatureState.f2383OooOO0o = false;
        this.f2334OoooO00 = panelFeatureState;
        return true;
    }

    public final void OoooOOo() {
        if (this.f2319OooOooO) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void OoooOo0() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.f2350Ooooooo != null && (Oooo(0).f2385OooOOO0 || this.f2309OooOo != null)) {
                z = true;
            }
            if (z && this.f2352o0OoOo0 == null) {
                this.f2352o0OoOo0 = OooOOO0.OooO0O0(this.f2350Ooooooo, this);
            } else {
                if (z || (onBackInvokedCallback = this.f2352o0OoOo0) == null) {
                    return;
                }
                OooOOO0.OooO0OO(this.f2350Ooooooo, onBackInvokedCallback);
            }
        }
    }

    public final boolean o000oOoO(PanelFeatureState panelFeatureState, int i, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.OooO oooO;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((panelFeatureState.f2382OooOO0O || OoooOOO(panelFeatureState, keyEvent)) && (oooO = panelFeatureState.f2380OooO0oo) != null) {
            return oooO.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

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
    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        byte b;
        View appCompatRatingBar;
        if (this.f2349OoooooO == null) {
            int[] iArr = p012OooOo0O.o00O0O.AppCompatTheme;
            Context context2 = this.f2302OooOOO;
            String string = context2.obtainStyledAttributes(iArr).getString(p012OooOo0O.o00O0O.AppCompatTheme_viewInflaterClass);
            if (string == null) {
                this.f2349OoooooO = new o000OOo();
            } else {
                try {
                    this.f2349OoooooO = (o000OOo) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f2349OoooooO = new o000OOo();
                }
            }
        }
        o000OOo o000ooo2 = this.f2349OoooooO;
        int i = androidx.appcompat.widget.o00O0000.f3335OooO00o;
        o000ooo2.getClass();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p012OooOo0O.o00O0O.View, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(p012OooOo0O.o00O0O.View_theme, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes.recycle();
        Context o00oo1 = (resourceId == 0 || ((context instanceof p016OooOoOO.o00Oo0) && ((p016OooOoOO.o00Oo0) context).f288OooO00o == resourceId)) ? context : new p016OooOoOO.o00Oo0(context, resourceId);
        str.getClass();
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
                b = 13;
                break;
            default:
                b = -1;
                break;
        }
        View view2 = null;
        switch (b) {
            case 0:
                appCompatRatingBar = new AppCompatRatingBar(o00oo1, attributeSet);
                break;
            case 1:
                appCompatRatingBar = new AppCompatCheckedTextView(o00oo1, attributeSet);
                break;
            case 2:
                appCompatRatingBar = new AppCompatMultiAutoCompleteTextView(o00oo1, attributeSet);
                break;
            case 3:
                AppCompatTextView appCompatTextViewOooO0o0 = o000ooo2.OooO0o0(o00oo1, attributeSet);
                o000ooo2.OooO0oO(appCompatTextViewOooO0o0, str);
                appCompatRatingBar = appCompatTextViewOooO0o0;
                break;
            case 4:
                appCompatRatingBar = new AppCompatImageButton(o00oo1, attributeSet);
                break;
            case 5:
                appCompatRatingBar = new AppCompatSeekBar(o00oo1, attributeSet);
                break;
            case 6:
                appCompatRatingBar = new AppCompatSpinner(o00oo1, attributeSet);
                break;
            case 7:
                AppCompatRadioButton appCompatRadioButtonOooO0Oo = o000ooo2.OooO0Oo(o00oo1, attributeSet);
                o000ooo2.OooO0oO(appCompatRadioButtonOooO0Oo, str);
                appCompatRatingBar = appCompatRadioButtonOooO0Oo;
                break;
            case 8:
                appCompatRatingBar = new AppCompatToggleButton(o00oo1, attributeSet);
                break;
            case 9:
                appCompatRatingBar = new AppCompatImageView(o00oo1, attributeSet);
                break;
            case 10:
                AppCompatAutoCompleteTextView appCompatAutoCompleteTextViewOooO00o = o000ooo2.OooO00o(o00oo1, attributeSet);
                o000ooo2.OooO0oO(appCompatAutoCompleteTextViewOooO00o, str);
                appCompatRatingBar = appCompatAutoCompleteTextViewOooO00o;
                break;
            case 11:
                AppCompatCheckBox appCompatCheckBoxOooO0OO = o000ooo2.OooO0OO(o00oo1, attributeSet);
                o000ooo2.OooO0oO(appCompatCheckBoxOooO0OO, str);
                appCompatRatingBar = appCompatCheckBoxOooO0OO;
                break;
            case 12:
                appCompatRatingBar = new AppCompatEditText(o00oo1, attributeSet);
                break;
            case 13:
                AppCompatButton appCompatButtonOooO0O0 = o000ooo2.OooO0O0(o00oo1, attributeSet);
                o000ooo2.OooO0oO(appCompatButtonOooO0O0, str);
                appCompatRatingBar = appCompatButtonOooO0O0;
                break;
            default:
                appCompatRatingBar = null;
                break;
        }
        if (appCompatRatingBar == null && context != o00oo1) {
            Object[] objArr = o000ooo2.f2486OooO00o;
            if (str.equals(ViewHierarchyConstants.VIEW_KEY)) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = o00oo1;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = o000OOo.f2484OooO0oO;
                        if (i2 < 3) {
                            View viewOooO0o = o000ooo2.OooO0o(o00oo1, str, strArr[i2]);
                            if (viewOooO0o != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewOooO0o;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewOooO0o2 = o000ooo2.OooO0o(o00oo1, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewOooO0o2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            appCompatRatingBar = view2;
        }
        if (appCompatRatingBar != null) {
            Context context3 = appCompatRatingBar.getContext();
            if (context3 instanceof ContextWrapper) {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5344OooO00o;
                if (ViewCompat.OooO0OO.OooO00o(appCompatRatingBar)) {
                    TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, o000OOo.f2480OooO0OO);
                    String string2 = typedArrayObtainStyledAttributes2.getString(0);
                    if (string2 != null) {
                        appCompatRatingBar.setOnClickListener(new o000OOo.OooO00o(appCompatRatingBar, string2));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                }
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = o00oo1.obtainStyledAttributes(attributeSet, o000OOo.f2481OooO0Oo);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    boolean z = typedArrayObtainStyledAttributes3.getBoolean(0, false);
                    WeakHashMap<View, o000OOo0> weakHashMap2 = ViewCompat.f5344OooO00o;
                    new o000O0o(o00000O0.OooO.tag_accessibility_heading).OooO0o0(appCompatRatingBar, Boolean.valueOf(z));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = o00oo1.obtainStyledAttributes(attributeSet, o000OOo.f2483OooO0o0);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    ViewCompat.OooOOOo(appCompatRatingBar, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = o00oo1.obtainStyledAttributes(attributeSet, o000OOo.f2482OooO0o);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    boolean z2 = typedArrayObtainStyledAttributes5.getBoolean(0, false);
                    WeakHashMap<View, o000OOo0> weakHashMap3 = ViewCompat.f5344OooO00o;
                    new o0000OO0(o00000O0.OooO.tag_screen_reader_focusable).OooO0o0(appCompatRatingBar, Boolean.valueOf(z2));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return appCompatRatingBar;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
