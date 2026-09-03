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
import androidx.core.view.o000OOo0;
import androidx.core.view.o00O0000;
import androidx.core.view.o0O0ooO;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0000Ooo extends ActionBar implements ActionBarOverlayLayout.OooO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final AccelerateInterpolator f2441OooOoO = new AccelerateInterpolator();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final DecelerateInterpolator f2442OooOoOO = new DecelerateInterpolator();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO0o f2443OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f2444OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Context f2445OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ActionBarOverlayLayout f2446OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ActionBarContainer f2447OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ActionBarContextView f2448OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public androidx.appcompat.widget.o0Oo0oo f2449OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final View f2450OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f2451OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO0o f2452OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooOoOO.o0OoOo0.OooO00o f2453OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f2454OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f2455OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ArrayList<ActionBar.OooO00o> f2456OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f2457OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f2458OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f2459OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f2460OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f2461OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0O0 f2462OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f2463OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public p016OooOoOO.o0ooOOo f2464OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f2465OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o f2466OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0OO f2467OooOoO0;

    public class OooO00o extends o00O0000 {
        public OooO00o() {
        }

        @Override // androidx.core.view.o00
        public final void OooO00o() {
            View view;
            o0000Ooo o0000ooo = o0000Ooo.this;
            if (o0000ooo.f2458OooOOOo && (view = o0000ooo.f2450OooO0oO) != null) {
                view.setTranslationY(0.0f);
                o0000ooo.f2447OooO0Oo.setTranslationY(0.0f);
            }
            o0000ooo.f2447OooO0Oo.setVisibility(8);
            o0000ooo.f2447OooO0Oo.setTransitioning(false);
            o0000ooo.f2464OooOo00 = null;
            OooOoOO.o0OoOo0.OooO00o oooO00o = o0000ooo.f2453OooOO0O;
            if (oooO00o != null) {
                oooO00o.OooO0O0(o0000ooo.f2452OooOO0);
                o0000ooo.f2452OooOO0 = null;
                o0000ooo.f2453OooOO0O = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = o0000ooo.f2446OooO0OO;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                ViewCompat.OooOOO0.OooO0OO(actionBarOverlayLayout);
            }
        }
    }

    public class OooO0O0 extends o00O0000 {
        public OooO0O0() {
        }

        @Override // androidx.core.view.o00
        public final void OooO00o() {
            o0000Ooo o0000ooo = o0000Ooo.this;
            o0000ooo.f2464OooOo00 = null;
            o0000ooo.f2447OooO0Oo.requestLayout();
        }
    }

    public class OooO0OO implements o0O0ooO {
        public OooO0OO() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class OooO0o extends p016OooOoOO.o0OoOo0 implements androidx.appcompat.view.menu.OooO.OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public WeakReference<View> f2471OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final Context f2472OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final androidx.appcompat.view.menu.OooO f2473OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public OooOoOO.o0OoOo0.OooO00o f2474OooO0oo;

        public OooO0o(Context context, AppCompatDelegateImpl.OooO0o oooO0o) {
            this.f2472OooO0o = context;
            this.f2474OooO0oo = oooO0o;
            androidx.appcompat.view.menu.OooO oooO = new androidx.appcompat.view.menu.OooO(context);
            oooO.f2580OooOO0o = 1;
            this.f2473OooO0oO = oooO;
            oooO.f2575OooO0o0 = this;
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooO() {
            if (o0000Ooo.this.f2443OooO != this) {
                return;
            }
            androidx.appcompat.view.menu.OooO oooO = this.f2473OooO0oO;
            oooO.OooOoO0();
            try {
                this.f2474OooO0oo.OooO00o(this, oooO);
            } finally {
                oooO.OooOo();
            }
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final boolean OooO00o(@NonNull androidx.appcompat.view.menu.OooO oooO, @NonNull MenuItem menuItem) {
            OooOoOO.o0OoOo0.OooO00o oooO00o = this.f2474OooO0oo;
            if (oooO00o != null) {
                return oooO00o.OooO0OO(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO oooO) {
            if (this.f2474OooO0oo == null) {
                return;
            }
            OooO();
            ActionMenuPresenter actionMenuPresenter = o0000Ooo.this.f2448OooO0o.f2957OooO0oO;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.OooOOOO();
            }
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooO0OO() {
            o0000Ooo o0000ooo = o0000Ooo.this;
            if (o0000ooo.f2443OooO != this) {
                return;
            }
            if (!o0000ooo.f2460OooOOo0) {
                this.f2474OooO0oo.OooO0O0(this);
            } else {
                o0000ooo.f2452OooOO0 = this;
                o0000ooo.f2453OooOO0O = this.f2474OooO0oo;
            }
            this.f2474OooO0oo = null;
            o0000ooo.OooOOo0(false);
            ActionBarContextView actionBarContextView = o0000ooo.f2448OooO0o;
            if (actionBarContextView.f2703OooOOO == null) {
                actionBarContextView.OooO0oo();
            }
            o0000ooo.f2446OooO0OO.setHideOnContentScrollEnabled(o0000ooo.f2465OooOo0O);
            o0000ooo.f2443OooO = null;
        }

        @Override // p016OooOoOO.o0OoOo0
        public final View OooO0Oo() {
            WeakReference<View> weakReference = this.f2471OooO;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p016OooOoOO.o0OoOo0
        public final MenuInflater OooO0o() {
            return new p016OooOoOO.o00oO0o(this.f2472OooO0o);
        }

        @Override // p016OooOoOO.o0OoOo0
        public final androidx.appcompat.view.menu.OooO OooO0o0() {
            return this.f2473OooO0oO;
        }

        @Override // p016OooOoOO.o0OoOo0
        public final CharSequence OooO0oO() {
            return o0000Ooo.this.f2448OooO0o.getSubtitle();
        }

        @Override // p016OooOoOO.o0OoOo0
        public final CharSequence OooO0oo() {
            return o0000Ooo.this.f2448OooO0o.getTitle();
        }

        @Override // p016OooOoOO.o0OoOo0
        public final boolean OooOO0() {
            return o0000Ooo.this.f2448OooO0o.f2712OooOo0O;
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooOO0O(View view) {
            o0000Ooo.this.f2448OooO0o.setCustomView(view);
            this.f2471OooO = new WeakReference<>(view);
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooOO0o(int i) {
            OooOOO0(o0000Ooo.this.f2444OooO00o.getResources().getString(i));
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooOOO(int i) {
            OooOOOO(o0000Ooo.this.f2444OooO00o.getResources().getString(i));
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooOOO0(CharSequence charSequence) {
            o0000Ooo.this.f2448OooO0o.setSubtitle(charSequence);
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooOOOO(CharSequence charSequence) {
            o0000Ooo.this.f2448OooO0o.setTitle(charSequence);
        }

        @Override // p016OooOoOO.o0OoOo0
        public final void OooOOOo(boolean z) {
            this.f341OooO0o0 = z;
            o0000Ooo.this.f2448OooO0o.setTitleOptional(z);
        }
    }

    public o0000Ooo(Activity activity, boolean z) {
        new ArrayList();
        this.f2456OooOOO0 = new ArrayList<>();
        this.f2457OooOOOO = 0;
        this.f2458OooOOOo = true;
        this.f2461OooOOoo = true;
        this.f2466OooOo0o = new OooO00o();
        this.f2462OooOo = new OooO0O0();
        this.f2467OooOoO0 = new OooO0OO();
        View decorView = activity.getWindow().getDecorView();
        OooOOo(decorView);
        if (z) {
            return;
        }
        this.f2450OooO0oO = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooO(int i, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.OooO oooO;
        OooO0o oooO0o = this.f2443OooO;
        if (oooO0o == null || (oooO = oooO0o.f2473OooO0oO) == null) {
            return false;
        }
        oooO.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return oooO.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooO0O0() {
        androidx.appcompat.widget.o0Oo0oo o0oo0oo2 = this.f2449OooO0o0;
        if (o0oo0oo2 == null || !o0oo0oo2.OooO0oo()) {
            return false;
        }
        this.f2449OooO0o0.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooO0OO(boolean z) {
        if (z == this.f2454OooOO0o) {
            return;
        }
        this.f2454OooOO0o = z;
        ArrayList<ActionBar.OooO00o> arrayList = this.f2456OooOOO0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).OooO00o();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int OooO0Oo() {
        return this.f2449OooO0o0.OooOOo();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context OooO0o0() {
        if (this.f2445OooO0O0 == null) {
            TypedValue typedValue = new TypedValue();
            this.f2444OooO00o.getTheme().resolveAttribute(p012OooOo0O.OooOOO0.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f2445OooO0O0 = new ContextThemeWrapper(this.f2444OooO00o, i);
            } else {
                this.f2445OooO0O0 = this.f2444OooO00o;
            }
        }
        return this.f2445OooO0O0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooO0oO() {
        OooOOoo(this.f2444OooO00o.getResources().getBoolean(p012OooOo0O.OooOOO.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOO0o(boolean z) {
        if (this.f2451OooO0oo) {
            return;
        }
        OooOOO0(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOO(boolean z) {
        p016OooOoOO.o0ooOOo o0ooooo;
        this.f2463OooOo0 = z;
        if (z || (o0ooooo = this.f2464OooOo00) == null) {
            return;
        }
        o0ooooo.OooO00o();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOO0(boolean z) {
        int i = z ? 4 : 0;
        int iOooOOo = this.f2449OooO0o0.OooOOo();
        this.f2451OooO0oo = true;
        this.f2449OooO0o0.OooO((i & 4) | ((-5) & iOooOOo));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOOO(CharSequence charSequence) {
        this.f2449OooO0o0.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final p016OooOoOO.o0OoOo0 OooOOOo(AppCompatDelegateImpl.OooO0o oooO0o) {
        OooO0o oooO0o2 = this.f2443OooO;
        if (oooO0o2 != null) {
            oooO0o2.OooO0OO();
        }
        this.f2446OooO0OO.setHideOnContentScrollEnabled(false);
        this.f2448OooO0o.OooO0oo();
        OooO0o oooO0o3 = new OooO0o(this.f2448OooO0o.getContext(), oooO0o);
        androidx.appcompat.view.menu.OooO oooO = oooO0o3.f2473OooO0oO;
        oooO.OooOoO0();
        try {
            boolean zOooO0Oo = oooO0o3.f2474OooO0oo.OooO0Oo(oooO0o3, oooO);
            oooO.OooOo();
            if (!zOooO0Oo) {
                return null;
            }
            this.f2443OooO = oooO0o3;
            oooO0o3.OooO();
            this.f2448OooO0o.OooO0o(oooO0o3);
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
        this.f2446OooO0OO = actionBarOverlayLayout;
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
        this.f2449OooO0o0 = wrapper;
        this.f2448OooO0o = (ActionBarContextView) view.findViewById(p012OooOo0O.Oooo000.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(p012OooOo0O.Oooo000.action_bar_container);
        this.f2447OooO0Oo = actionBarContainer;
        androidx.appcompat.widget.o0Oo0oo o0oo0oo2 = this.f2449OooO0o0;
        if (o0oo0oo2 == null || this.f2448OooO0o == null || actionBarContainer == null) {
            throw new IllegalStateException(o0000Ooo.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        this.f2444OooO00o = o0oo0oo2.getContext();
        if ((this.f2449OooO0o0.OooOOo() & 4) != 0) {
            this.f2451OooO0oo = true;
        }
        Context context = this.f2444OooO00o;
        if (context.getApplicationInfo().targetSdkVersion < 14) {
        }
        this.f2449OooO0o0.OooOOOO();
        OooOOoo(context.getResources().getBoolean(p012OooOo0O.OooOOO.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f2444OooO00o.obtainStyledAttributes(null, p012OooOo0O.o00O0O.ActionBar, p012OooOo0O.OooOOO0.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(p012OooOo0O.o00O0O.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2446OooO0OO;
            if (!actionBarOverlayLayout2.f2723OooOO0O) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f2465OooOo0O = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(p012OooOo0O.o00O0O.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f2447OooO0Oo;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooOOO.OooOOoo(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OooOOo0(boolean z) {
        o000OOo0 o000ooo0OooOO0O;
        o000OOo0 o000ooo0OooO0o0;
        if (z) {
            if (!this.f2459OooOOo) {
                this.f2459OooOOo = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2446OooO0OO;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                OooOo00(false);
            }
        } else if (this.f2459OooOOo) {
            this.f2459OooOOo = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2446OooO0OO;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            OooOo00(false);
        }
        ActionBarContainer actionBarContainer = this.f2447OooO0Oo;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (!ViewCompat.OooOO0O.OooO0OO(actionBarContainer)) {
            if (z) {
                this.f2449OooO0o0.setVisibility(4);
                this.f2448OooO0o.setVisibility(0);
                return;
            } else {
                this.f2449OooO0o0.setVisibility(0);
                this.f2448OooO0o.setVisibility(8);
                return;
            }
        }
        if (z) {
            o000ooo0OooO0o0 = this.f2449OooO0o0.OooOO0O(4, 100L);
            o000ooo0OooOO0O = this.f2448OooO0o.OooO0o0(0, 200L);
        } else {
            o000ooo0OooOO0O = this.f2449OooO0o0.OooOO0O(0, 200L);
            o000ooo0OooO0o0 = this.f2448OooO0o.OooO0o0(8, 100L);
        }
        p016OooOoOO.o0ooOOo o0ooooo = new p016OooOoOO.o0ooOOo();
        ArrayList<o000OOo0> arrayList = o0ooooo.f342OooO00o;
        arrayList.add(o000ooo0OooO0o0);
        View view = o000ooo0OooO0o0.f5454OooO00o.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = o000ooo0OooOO0O.f5454OooO00o.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(o000ooo0OooOO0O);
        o0ooooo.OooO0O0();
    }

    public final void OooOOoo(boolean z) {
        this.f2455OooOOO = z;
        if (z) {
            this.f2447OooO0Oo.setTabContainer(null);
            this.f2449OooO0o0.OooOOOo();
        } else {
            this.f2449OooO0o0.OooOOOo();
            this.f2447OooO0Oo.setTabContainer(null);
        }
        this.f2449OooO0o0.OooOO0();
        androidx.appcompat.widget.o0Oo0oo o0oo0oo2 = this.f2449OooO0o0;
        boolean z2 = this.f2455OooOOO;
        o0oo0oo2.OooOOO0(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2446OooO0OO;
        boolean z3 = this.f2455OooOOO;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void OooOo00(boolean z) {
        boolean z2 = this.f2459OooOOo || !this.f2460OooOOo0;
        View view = this.f2450OooO0oO;
        final OooO0OO oooO0OO = this.f2467OooOoO0;
        if (!z2) {
            if (this.f2461OooOOoo) {
                this.f2461OooOOoo = false;
                p016OooOoOO.o0ooOOo o0ooooo = this.f2464OooOo00;
                if (o0ooooo != null) {
                    o0ooooo.OooO00o();
                }
                int i = this.f2457OooOOOO;
                OooO00o oooO00o = this.f2466OooOo0o;
                if (i != 0 || (!this.f2463OooOo0 && !z)) {
                    oooO00o.OooO00o();
                    return;
                }
                this.f2447OooO0Oo.setAlpha(1.0f);
                this.f2447OooO0Oo.setTransitioning(true);
                p016OooOoOO.o0ooOOo o0ooooo2 = new p016OooOoOO.o0ooOOo();
                float f = -this.f2447OooO0Oo.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.f2447OooO0Oo.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                o000OOo0 o000ooo0OooO00o = ViewCompat.OooO00o(this.f2447OooO0Oo);
                o000ooo0OooO00o.OooO0o0(f);
                final View view2 = o000ooo0OooO00o.f5454OooO00o.get();
                if (view2 != null) {
                    o000OOo0.OooO00o.OooO00o(view2.animate(), oooO0OO != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.o000O
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) androidx.appcompat.app.o0000Ooo.this.f2447OooO0Oo.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z3 = o0ooooo2.f347OooO0o0;
                ArrayList<o000OOo0> arrayList = o0ooooo2.f342OooO00o;
                if (!z3) {
                    arrayList.add(o000ooo0OooO00o);
                }
                if (this.f2458OooOOOo && view != null) {
                    o000OOo0 o000ooo0OooO00o2 = ViewCompat.OooO00o(view);
                    o000ooo0OooO00o2.OooO0o0(f);
                    if (!o0ooooo2.f347OooO0o0) {
                        arrayList.add(o000ooo0OooO00o2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f2441OooOoO;
                boolean z4 = o0ooooo2.f347OooO0o0;
                if (!z4) {
                    o0ooooo2.f344OooO0OO = accelerateInterpolator;
                }
                if (!z4) {
                    o0ooooo2.f343OooO0O0 = 250L;
                }
                if (!z4) {
                    o0ooooo2.f345OooO0Oo = oooO00o;
                }
                this.f2464OooOo00 = o0ooooo2;
                o0ooooo2.OooO0O0();
                return;
            }
            return;
        }
        if (this.f2461OooOOoo) {
            return;
        }
        this.f2461OooOOoo = true;
        p016OooOoOO.o0ooOOo o0ooooo3 = this.f2464OooOo00;
        if (o0ooooo3 != null) {
            o0ooooo3.OooO00o();
        }
        this.f2447OooO0Oo.setVisibility(0);
        int i2 = this.f2457OooOOOO;
        OooO0O0 oooO0O0 = this.f2462OooOo;
        if (i2 == 0 && (this.f2463OooOo0 || z)) {
            this.f2447OooO0Oo.setTranslationY(0.0f);
            float f2 = -this.f2447OooO0Oo.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.f2447OooO0Oo.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.f2447OooO0Oo.setTranslationY(f2);
            p016OooOoOO.o0ooOOo o0ooooo4 = new p016OooOoOO.o0ooOOo();
            o000OOo0 o000ooo0OooO00o3 = ViewCompat.OooO00o(this.f2447OooO0Oo);
            o000ooo0OooO00o3.OooO0o0(0.0f);
            final View view3 = o000ooo0OooO00o3.f5454OooO00o.get();
            if (view3 != null) {
                o000OOo0.OooO00o.OooO00o(view3.animate(), oooO0OO != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.o000O
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) androidx.appcompat.app.o0000Ooo.this.f2447OooO0Oo.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z5 = o0ooooo4.f347OooO0o0;
            ArrayList<o000OOo0> arrayList2 = o0ooooo4.f342OooO00o;
            if (!z5) {
                arrayList2.add(o000ooo0OooO00o3);
            }
            if (this.f2458OooOOOo && view != null) {
                view.setTranslationY(f2);
                o000OOo0 o000ooo0OooO00o4 = ViewCompat.OooO00o(view);
                o000ooo0OooO00o4.OooO0o0(0.0f);
                if (!o0ooooo4.f347OooO0o0) {
                    arrayList2.add(o000ooo0OooO00o4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f2442OooOoOO;
            boolean z6 = o0ooooo4.f347OooO0o0;
            if (!z6) {
                o0ooooo4.f344OooO0OO = decelerateInterpolator;
            }
            if (!z6) {
                o0ooooo4.f343OooO0O0 = 250L;
            }
            if (!z6) {
                o0ooooo4.f345OooO0Oo = oooO0O0;
            }
            this.f2464OooOo00 = o0ooooo4;
            o0ooooo4.OooO0O0();
        } else {
            this.f2447OooO0Oo.setAlpha(1.0f);
            this.f2447OooO0Oo.setTranslationY(0.0f);
            if (this.f2458OooOOOo && view != null) {
                view.setTranslationY(0.0f);
            }
            oooO0O0.OooO00o();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2446OooO0OO;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            ViewCompat.OooOOO0.OooO0OO(actionBarOverlayLayout);
        }
    }

    public o0000Ooo(Dialog dialog) {
        new ArrayList();
        this.f2456OooOOO0 = new ArrayList<>();
        this.f2457OooOOOO = 0;
        this.f2458OooOOOo = true;
        this.f2461OooOOoo = true;
        this.f2466OooOo0o = new OooO00o();
        this.f2462OooOo = new OooO0O0();
        this.f2467OooOoO0 = new OooO0OO();
        OooOOo(dialog.getWindow().getDecorView());
    }
}
