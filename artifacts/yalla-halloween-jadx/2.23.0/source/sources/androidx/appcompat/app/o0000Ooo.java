package androidx.appcompat.app;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O;
import androidx.core.view.o000O0O0;
import androidx.core.view.o000O0Oo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0000Ooo extends ActionBar implements ActionBarOverlayLayout.OooO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final AccelerateInterpolator f2443OooOoO = new AccelerateInterpolator();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final DecelerateInterpolator f2444OooOoOO = new DecelerateInterpolator();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO0o f2445OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f2446OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Context f2447OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ActionBarOverlayLayout f2448OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ActionBarContainer f2449OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ActionBarContextView f2450OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public androidx.appcompat.widget.o0Oo0oo f2451OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final View f2452OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f2453OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO0o f2454OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooOoOO.o0OoOo0.OooO00o f2455OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f2456OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f2457OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ArrayList<ActionBar.OooO00o> f2458OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f2459OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f2460OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f2461OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f2462OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f2463OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0O0 f2464OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f2465OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public p016OooOoOO.o0ooOOo f2466OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f2467OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o f2468OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0OO f2469OooOoO0;

    public class OooO00o extends o000O0O0 {
        public OooO00o() {
        }

        @Override // androidx.core.view.o000OO0O
        public final void OooO00o() {
            View view;
            o0000Ooo o0000ooo = o0000Ooo.this;
            if (o0000ooo.f2460OooOOOo && (view = o0000ooo.f2452OooO0oO) != null) {
                view.setTranslationY(0.0f);
                o0000ooo.f2449OooO0Oo.setTranslationY(0.0f);
            }
            o0000ooo.f2449OooO0Oo.setVisibility(8);
            o0000ooo.f2449OooO0Oo.setTransitioning(false);
            o0000ooo.f2466OooOo00 = null;
            OooOoOO.o0OoOo0.OooO00o oooO00o = o0000ooo.f2455OooOO0O;
            if (oooO00o != null) {
                oooO00o.OooO0O0(o0000ooo.f2454OooOO0);
                o0000ooo.f2454OooOO0 = null;
                o0000ooo.f2455OooOO0O = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = o0000ooo.f2448OooO0OO;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                ViewCompat.OooOOO0.OooO0OO(actionBarOverlayLayout);
            }
        }
    }

    public class OooO0O0 extends o000O0O0 {
        public OooO0O0() {
        }

        @Override // androidx.core.view.o000OO0O
        public final void OooO00o() {
            o0000Ooo o0000ooo = o0000Ooo.this;
            o0000ooo.f2466OooOo00 = null;
            o0000ooo.f2449OooO0Oo.requestLayout();
        }
    }

    public class OooO0OO implements o000O {
        public OooO0OO() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class OooO0o extends p016OooOoOO.o0OoOo0 implements androidx.appcompat.view.menu.OooO.OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public WeakReference<View> f2473OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Context f2474OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final androidx.appcompat.view.menu.OooO f2475OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public OooOoOO.o0OoOo0.OooO00o f2476OooO0oo;

        public OooO0o(Context context, AppCompatDelegateImpl.OooO0o oooO0o) {
            this.f2474OooO0o = context;
            this.f2476OooO0oo = oooO0o;
            androidx.appcompat.view.menu.OooO oooO = new androidx.appcompat.view.menu.OooO(context);
            oooO.f2582OooOO0o = 1;
            this.f2475OooO0oO = oooO;
            oooO.f2577OooO0o0 = this;
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooO() {
            if (o0000Ooo.this.f2445OooO != this) {
                return;
            }
            androidx.appcompat.view.menu.OooO oooO = this.f2475OooO0oO;
            oooO.OooOoO0();
            try {
                this.f2476OooO0oo.OooO00o(this, oooO);
            } finally {
                oooO.OooOo();
            }
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final boolean OooO00o(@NonNull androidx.appcompat.view.menu.OooO oooO, @NonNull MenuItem menuItem) {
            OooOoOO.o0OoOo0.OooO00o oooO00o = this.f2476OooO0oo;
            if (oooO00o != null) {
                return oooO00o.OooO0OO(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO oooO) {
            if (this.f2476OooO0oo == null) {
                return;
            }
            OooO();
            ActionMenuPresenter actionMenuPresenter = o0000Ooo.this.f2450OooO0o.f2959OooO0oO;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.OooOOOO();
            }
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooO0OO() {
            o0000Ooo o0000ooo = o0000Ooo.this;
            if (o0000ooo.f2445OooO != this) {
                return;
            }
            if (!o0000ooo.f2462OooOOo0) {
                this.f2476OooO0oo.OooO0O0(this);
            } else {
                o0000ooo.f2454OooOO0 = this;
                o0000ooo.f2455OooOO0O = this.f2476OooO0oo;
            }
            this.f2476OooO0oo = null;
            o0000ooo.OooOOo0(false);
            ActionBarContextView actionBarContextView = o0000ooo.f2450OooO0o;
            if (actionBarContextView.f2705OooOOO == null) {
                actionBarContextView.OooO0oo();
            }
            o0000ooo.f2448OooO0OO.setHideOnContentScrollEnabled(o0000ooo.f2467OooOo0O);
            o0000ooo.f2445OooO = null;
        }

        @Override // p016OooOoOO.o0OoOo0
        public final View OooO0Oo() {
            WeakReference<View> weakReference = this.f2473OooO;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p016OooOoOO.o0OoOo0
        public final MenuInflater OooO0o() {
            return new p016OooOoOO.o00oO0o(this.f2474OooO0o);
        }

        @Override // p016OooOoOO.o0OoOo0
        public final androidx.appcompat.view.menu.OooO OooO0o0() {
            return this.f2475OooO0oO;
        }

        @Override // p016OooOoOO.o0OoOo0
        public final CharSequence OooO0oO() {
            return o0000Ooo.this.f2450OooO0o.getSubtitle();
        }

        @Override // p016OooOoOO.o0OoOo0
        public final CharSequence OooO0oo() {
            return o0000Ooo.this.f2450OooO0o.getTitle();
        }

        @Override // p016OooOoOO.o0OoOo0
        public final boolean OooOO0() {
            return o0000Ooo.this.f2450OooO0o.f2714OooOo0O;
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooOO0O(View view) {
            o0000Ooo.this.f2450OooO0o.setCustomView(view);
            this.f2473OooO = new WeakReference<>(view);
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooOO0o(int i) {
            OooOOO0(o0000Ooo.this.f2446OooO00o.getResources().getString(i));
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooOOO(int i) {
            OooOOOO(o0000Ooo.this.f2446OooO00o.getResources().getString(i));
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooOOO0(CharSequence charSequence) {
            o0000Ooo.this.f2450OooO0o.setSubtitle(charSequence);
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooOOOO(CharSequence charSequence) {
            o0000Ooo.this.f2450OooO0o.setTitle(charSequence);
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooOOOo(boolean z) {
            this.f342OooO0o0 = z;
            o0000Ooo.this.f2450OooO0o.setTitleOptional(z);
        }
    }

    public o0000Ooo(Activity activity, boolean z) {
        new ArrayList();
        this.f2458OooOOO0 = new ArrayList<>();
        this.f2459OooOOOO = 0;
        this.f2460OooOOOo = true;
        this.f2463OooOOoo = true;
        this.f2468OooOo0o = new OooO00o();
        this.f2464OooOo = new OooO0O0();
        this.f2469OooOoO0 = new OooO0OO();
        View decorView = activity.getWindow().getDecorView();
        OooOOo(decorView);
        if (z) {
            return;
        }
        this.f2452OooO0oO = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooO(int i, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.OooO oooO;
        OooO0o oooO0o = this.f2445OooO;
        if (oooO0o == null || (oooO = oooO0o.f2475OooO0oO) == null) {
            return false;
        }
        oooO.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return oooO.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooO0O0() {
        androidx.appcompat.widget.o0Oo0oo o0oo0oo2 = this.f2451OooO0o0;
        if (o0oo0oo2 == null || !o0oo0oo2.OooO0oo()) {
            return false;
        }
        this.f2451OooO0o0.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooO0OO(boolean z) {
        if (z == this.f2456OooOO0o) {
            return;
        }
        this.f2456OooOO0o = z;
        ArrayList<ActionBar.OooO00o> arrayList = this.f2458OooOOO0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).OooO00o();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int OooO0Oo() {
        return this.f2451OooO0o0.OooOOo();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context OooO0o0() {
        if (this.f2447OooO0O0 == null) {
            TypedValue typedValue = new TypedValue();
            this.f2446OooO00o.getTheme().resolveAttribute(p012OooOo0O.OooOOO0.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2447OooO0O0 = new ContextThemeWrapper(this.f2446OooO00o, i);
            } else {
                this.f2447OooO0O0 = this.f2446OooO00o;
            }
        }
        return this.f2447OooO0O0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooO0oO() {
        OooOOoo(this.f2446OooO00o.getResources().getBoolean(p012OooOo0O.OooOOO.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOO0o(boolean z) {
        if (this.f2453OooO0oo) {
            return;
        }
        OooOOO0(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOO(boolean z) {
        p016OooOoOO.o0ooOOo o0ooooo;
        this.f2465OooOo0 = z;
        if (z || (o0ooooo = this.f2466OooOo00) == null) {
            return;
        }
        o0ooooo.OooO00o();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOO0(boolean z) {
        int i = z ? 4 : 0;
        int iOooOOo = this.f2451OooO0o0.OooOOo();
        this.f2453OooO0oo = true;
        this.f2451OooO0o0.OooO((i & 4) | ((-5) & iOooOOo));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOOO(CharSequence charSequence) {
        this.f2451OooO0o0.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final p016OooOoOO.o0OoOo0 OooOOOo(AppCompatDelegateImpl.OooO0o oooO0o) {
        OooO0o oooO0o2 = this.f2445OooO;
        if (oooO0o2 != null) {
            oooO0o2.OooO0OO();
        }
        this.f2448OooO0OO.setHideOnContentScrollEnabled(false);
        this.f2450OooO0o.OooO0oo();
        OooO0o oooO0o3 = new OooO0o(this.f2450OooO0o.getContext(), oooO0o);
        androidx.appcompat.view.menu.OooO oooO = oooO0o3.f2475OooO0oO;
        oooO.OooOoO0();
        try {
            boolean zOooO0Oo = oooO0o3.f2476OooO0oo.OooO0Oo(oooO0o3, oooO);
            oooO.OooOo();
            if (!zOooO0Oo) {
                return null;
            }
            this.f2445OooO = oooO0o3;
            oooO0o3.OooO();
            this.f2450OooO0o.OooO0o(oooO0o3);
            OooOOo0(true);
            return oooO0o3;
        } catch (Throwable th) {
            oooO.OooOo();
            throw th;
        }
    }

    public final void OooOOo(View view) {
        androidx.appcompat.widget.o0Oo0oo wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(p012OooOo0O.Oooo000.decor_content_parent);
        this.f2448OooO0OO = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(p012OooOo0O.Oooo000.action_bar);
        if (callbackFindViewById instanceof androidx.appcompat.widget.o0Oo0oo) {
            wrapper = (androidx.appcompat.widget.o0Oo0oo) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f2451OooO0o0 = wrapper;
        this.f2450OooO0o = (ActionBarContextView) view.findViewById(p012OooOo0O.Oooo000.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(p012OooOo0O.Oooo000.action_bar_container);
        this.f2449OooO0Oo = actionBarContainer;
        androidx.appcompat.widget.o0Oo0oo o0oo0oo2 = this.f2451OooO0o0;
        if (o0oo0oo2 == null || this.f2450OooO0o == null || actionBarContainer == null) {
            throw new IllegalStateException(o0000Ooo.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f2446OooO00o = o0oo0oo2.getContext();
        if ((this.f2451OooO0o0.OooOOo() & 4) != 0) {
            this.f2453OooO0oo = true;
        }
        Context context = this.f2446OooO00o;
        if (context.getApplicationInfo().targetSdkVersion < 14) {
        }
        this.f2451OooO0o0.OooOOOO();
        OooOOoo(context.getResources().getBoolean(p012OooOo0O.OooOOO.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f2446OooO00o.obtainStyledAttributes(null, p012OooOo0O.o00O0O.ActionBar, p012OooOo0O.OooOOO0.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(p012OooOo0O.o00O0O.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2448OooO0OO;
            if (!actionBarOverlayLayout2.f2725OooOO0O) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2467OooOo0O = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p012OooOo0O.o00O0O.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2449OooO0Oo;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooOOO.OooOOoo(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OooOOo0(boolean z) {
        o000O0Oo o000o0ooOooOO0O;
        o000O0Oo o000o0ooOooO0o0;
        if (z) {
            if (!this.f2461OooOOo) {
                this.f2461OooOOo = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2448OooO0OO;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                OooOo00(false);
            }
        } else if (this.f2461OooOOo) {
            this.f2461OooOOo = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2448OooO0OO;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            OooOo00(false);
        }
        ActionBarContainer actionBarContainer = this.f2449OooO0Oo;
        WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
        if (!ViewCompat.OooOO0O.OooO0OO(actionBarContainer)) {
            if (z) {
                this.f2451OooO0o0.setVisibility(4);
                this.f2450OooO0o.setVisibility(0);
                return;
            } else {
                this.f2451OooO0o0.setVisibility(0);
                this.f2450OooO0o.setVisibility(8);
                return;
            }
        }
        if (z) {
            o000o0ooOooO0o0 = this.f2451OooO0o0.OooOO0O(4, 100L);
            o000o0ooOooOO0O = this.f2450OooO0o.OooO0o0(0, 200L);
        } else {
            o000o0ooOooOO0O = this.f2451OooO0o0.OooOO0O(0, 200L);
            o000o0ooOooO0o0 = this.f2450OooO0o.OooO0o0(8, 100L);
        }
        p016OooOoOO.o0ooOOo o0ooooo = new p016OooOoOO.o0ooOOo();
        ArrayList<o000O0Oo> arrayList = o0ooooo.f343OooO00o;
        arrayList.add(o000o0ooOooO0o0);
        View view = o000o0ooOooO0o0.f5432OooO00o.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = o000o0ooOooOO0O.f5432OooO00o.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(o000o0ooOooOO0O);
        o0ooooo.OooO0O0();
    }

    public final void OooOOoo(boolean z) {
        this.f2457OooOOO = z;
        if (z) {
            this.f2449OooO0Oo.setTabContainer(null);
            this.f2451OooO0o0.OooOOOo();
        } else {
            this.f2451OooO0o0.OooOOOo();
            this.f2449OooO0Oo.setTabContainer(null);
        }
        this.f2451OooO0o0.OooOO0();
        androidx.appcompat.widget.o0Oo0oo o0oo0oo2 = this.f2451OooO0o0;
        boolean z2 = this.f2457OooOOO;
        o0oo0oo2.OooOOO0(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2448OooO0OO;
        boolean z3 = this.f2457OooOOO;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void OooOo00(boolean z) {
        boolean z2 = this.f2461OooOOo || !this.f2462OooOOo0;
        View view = this.f2452OooO0oO;
        final OooO0OO oooO0OO = this.f2469OooOoO0;
        if (!z2) {
            if (this.f2463OooOOoo) {
                this.f2463OooOOoo = false;
                p016OooOoOO.o0ooOOo o0ooooo = this.f2466OooOo00;
                if (o0ooooo != null) {
                    o0ooooo.OooO00o();
                }
                int i = this.f2459OooOOOO;
                OooO00o oooO00o = this.f2468OooOo0o;
                if (i != 0 || (!this.f2465OooOo0 && !z)) {
                    oooO00o.OooO00o();
                    return;
                }
                this.f2449OooO0Oo.setAlpha(1.0f);
                this.f2449OooO0Oo.setTransitioning(true);
                p016OooOoOO.o0ooOOo o0ooooo2 = new p016OooOoOO.o0ooOOo();
                float f = -this.f2449OooO0Oo.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.f2449OooO0Oo.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                o000O0Oo o000o0ooOooO00o = ViewCompat.OooO00o(this.f2449OooO0Oo);
                o000o0ooOooO00o.OooO0o0(f);
                final View view2 = o000o0ooOooO00o.f5432OooO00o.get();
                if (view2 != null) {
                    o000O0Oo.OooO00o.OooO00o(view2.animate(), oooO0OO != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.o000O00O
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) androidx.appcompat.app.o0000Ooo.this.f2449OooO0Oo.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z3 = o0ooooo2.f348OooO0o0;
                ArrayList<o000O0Oo> arrayList = o0ooooo2.f343OooO00o;
                if (!z3) {
                    arrayList.add(o000o0ooOooO00o);
                }
                if (this.f2460OooOOOo && view != null) {
                    o000O0Oo o000o0ooOooO00o2 = ViewCompat.OooO00o(view);
                    o000o0ooOooO00o2.OooO0o0(f);
                    if (!o0ooooo2.f348OooO0o0) {
                        arrayList.add(o000o0ooOooO00o2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2443OooOoO;
                boolean z4 = o0ooooo2.f348OooO0o0;
                if (!z4) {
                    o0ooooo2.f345OooO0OO = accelerateInterpolator;
                }
                if (!z4) {
                    o0ooooo2.f344OooO0O0 = 250L;
                }
                if (!z4) {
                    o0ooooo2.f346OooO0Oo = oooO00o;
                }
                this.f2466OooOo00 = o0ooooo2;
                o0ooooo2.OooO0O0();
                return;
            }
            return;
        }
        if (this.f2463OooOOoo) {
            return;
        }
        this.f2463OooOOoo = true;
        p016OooOoOO.o0ooOOo o0ooooo3 = this.f2466OooOo00;
        if (o0ooooo3 != null) {
            o0ooooo3.OooO00o();
        }
        this.f2449OooO0Oo.setVisibility(0);
        int i2 = this.f2459OooOOOO;
        OooO0O0 oooO0O0 = this.f2464OooOo;
        if (i2 == 0 && (this.f2465OooOo0 || z)) {
            this.f2449OooO0Oo.setTranslationY(0.0f);
            float f2 = -this.f2449OooO0Oo.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.f2449OooO0Oo.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.f2449OooO0Oo.setTranslationY(f2);
            p016OooOoOO.o0ooOOo o0ooooo4 = new p016OooOoOO.o0ooOOo();
            o000O0Oo o000o0ooOooO00o3 = ViewCompat.OooO00o(this.f2449OooO0Oo);
            o000o0ooOooO00o3.OooO0o0(0.0f);
            final View view3 = o000o0ooOooO00o3.f5432OooO00o.get();
            if (view3 != null) {
                o000O0Oo.OooO00o.OooO00o(view3.animate(), oooO0OO != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.o000O00O
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) androidx.appcompat.app.o0000Ooo.this.f2449OooO0Oo.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z5 = o0ooooo4.f348OooO0o0;
            ArrayList<o000O0Oo> arrayList2 = o0ooooo4.f343OooO00o;
            if (!z5) {
                arrayList2.add(o000o0ooOooO00o3);
            }
            if (this.f2460OooOOOo && view != null) {
                view.setTranslationY(f2);
                o000O0Oo o000o0ooOooO00o4 = ViewCompat.OooO00o(view);
                o000o0ooOooO00o4.OooO0o0(0.0f);
                if (!o0ooooo4.f348OooO0o0) {
                    arrayList2.add(o000o0ooOooO00o4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2444OooOoOO;
            boolean z6 = o0ooooo4.f348OooO0o0;
            if (!z6) {
                o0ooooo4.f345OooO0OO = decelerateInterpolator;
            }
            if (!z6) {
                o0ooooo4.f344OooO0O0 = 250L;
            }
            if (!z6) {
                o0ooooo4.f346OooO0Oo = oooO0O0;
            }
            this.f2466OooOo00 = o0ooooo4;
            o0ooooo4.OooO0O0();
        } else {
            this.f2449OooO0Oo.setAlpha(1.0f);
            this.f2449OooO0Oo.setTranslationY(0.0f);
            if (this.f2460OooOOOo && view != null) {
                view.setTranslationY(0.0f);
            }
            oooO0O0.OooO00o();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2448OooO0OO;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooOOO0.OooO0OO(actionBarOverlayLayout);
        }
    }

    public o0000Ooo(Dialog dialog) {
        new ArrayList();
        this.f2458OooOOO0 = new ArrayList<>();
        this.f2459OooOOOO = 0;
        this.f2460OooOOOo = true;
        this.f2463OooOOoo = true;
        this.f2468OooOo0o = new OooO00o();
        this.f2464OooOo = new OooO0O0();
        this.f2469OooOoO0 = new OooO0OO();
        OooOOo(dialog.getWindow().getDecorView());
    }
}
