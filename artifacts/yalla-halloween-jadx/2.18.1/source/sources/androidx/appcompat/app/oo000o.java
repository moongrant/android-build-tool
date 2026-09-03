package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
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
import androidx.appcompat.widget.o00oO0o;
import androidx.core.view.ViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o000O0O0.o0000;
import o000O0O0.o00000O;
import o000O0O0.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class oo000o extends ActionBar implements ActionBarOverlayLayout.OooO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final AccelerateInterpolator f4574OooOoO = new AccelerateInterpolator();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final DecelerateInterpolator f4575OooOoOO = new DecelerateInterpolator();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO0o f4576OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Context f4577OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Context f4578OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ActionBarOverlayLayout f4579OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ActionBarContainer f4580OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ActionBarContextView f4581OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00oO0o f4582OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public View f4583OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f4584OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooO0o f4585OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooOoO0.OooOO0.OooO00o f4586OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f4587OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f4588OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ArrayList<ActionBar.OooO00o> f4589OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f4590OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f4591OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f4592OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f4593OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f4594OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooO0O0 f4595OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f4596OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public p016OooOoO0.Oooo000 f4597OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f4598OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o f4599OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final OooO0OO f4600OooOoO0;

    public class OooO00o extends o0000Ooo {
        public OooO00o() {
        }

        @Override // o000O0O0.o00000OO
        public final void OooO00o() {
            View view;
            oo000o oo000oVar = oo000o.this;
            if (oo000oVar.f4591OooOOOo && (view = oo000oVar.f4583OooO0oO) != null) {
                view.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                oo000o.this.f4580OooO0Oo.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            oo000o.this.f4580OooO0Oo.setVisibility(8);
            oo000o.this.f4580OooO0Oo.setTransitioning(false);
            oo000o oo000oVar2 = oo000o.this;
            oo000oVar2.f4597OooOo00 = null;
            OooOoO0.OooOO0.OooO00o oooO00o = oo000oVar2.f4586OooOO0O;
            if (oooO00o != null) {
                oooO00o.OooO0OO(oo000oVar2.f4585OooOO0);
                oo000oVar2.f4585OooOO0 = null;
                oo000oVar2.f4586OooOO0O = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = oo000o.this.f4579OooO0OO;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
                ViewCompat.OooOOO0.OooO0OO(actionBarOverlayLayout);
            }
        }
    }

    public class OooO0O0 extends o0000Ooo {
        public OooO0O0() {
        }

        @Override // o000O0O0.o00000OO
        public final void OooO00o() {
            oo000o oo000oVar = oo000o.this;
            oo000oVar.f4597OooOo00 = null;
            oo000oVar.f4580OooO0Oo.requestLayout();
        }
    }

    public class OooO0OO implements o0000 {
        public OooO0OO() {
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public class OooO0o extends p016OooOoO0.OooOO0 implements androidx.appcompat.view.menu.OooO0o.OooO00o {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final androidx.appcompat.view.menu.OooO0o f4604Oooo;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final Context f4605Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public WeakReference<View> f4606OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public OooOoO0.OooOO0.OooO00o f4607OoooO00;

        public OooO0o(Context context, OooOoO0.OooOO0.OooO00o oooO00o) {
            this.f4605Oooo0oo = context;
            this.f4607OoooO00 = oooO00o;
            androidx.appcompat.view.menu.OooO0o oooO0o = new androidx.appcompat.view.menu.OooO0o(context);
            oooO0o.f4716OooOO0o = 1;
            this.f4604Oooo = oooO0o;
            oooO0o.f4711OooO0o0 = this;
        }

        @Override // p016OooOoO0.OooOO0
        public final void OooO() {
            if (oo000o.this.f4576OooO != this) {
                return;
            }
            this.f4604Oooo.OooOooO();
            try {
                this.f4607OoooO00.OooO00o(this, this.f4604Oooo);
            } finally {
                this.f4604Oooo.OooOoo();
            }
        }

        @Override // androidx.appcompat.view.menu.OooO0o.OooO00o
        public final boolean OooO00o(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o, @NonNull MenuItem menuItem) {
            OooOoO0.OooOO0.OooO00o oooO00o = this.f4607OoooO00;
            if (oooO00o != null) {
                return oooO00o.OooO0Oo(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooO0o.OooO00o
        public final void OooO0O0(@NonNull androidx.appcompat.view.menu.OooO0o oooO0o) {
            if (this.f4607OoooO00 == null) {
                return;
            }
            OooO();
            ActionMenuPresenter actionMenuPresenter = oo000o.this.f4581OooO0o.f5062Oooo;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.OooOOOO();
            }
        }

        @Override // p016OooOoO0.OooOO0
        public final void OooO0OO() {
            oo000o oo000oVar = oo000o.this;
            if (oo000oVar.f4576OooO != this) {
                return;
            }
            if (!oo000oVar.f4593OooOOo0) {
                this.f4607OoooO00.OooO0OO(this);
            } else {
                oo000oVar.f4585OooOO0 = this;
                oo000oVar.f4586OooOO0O = this.f4607OoooO00;
            }
            this.f4607OoooO00 = null;
            oo000o.this.OooOOo0(false);
            ActionBarContextView actionBarContextView = oo000o.this.f4581OooO0o;
            if (actionBarContextView.f4808OoooOOO == null) {
                actionBarContextView.OooO0oo();
            }
            oo000o oo000oVar2 = oo000o.this;
            oo000oVar2.f4579OooO0OO.setHideOnContentScrollEnabled(oo000oVar2.f4598OooOo0O);
            oo000o.this.f4576OooO = null;
        }

        @Override // p016OooOoO0.OooOO0
        public final View OooO0Oo() {
            WeakReference<View> weakReference = this.f4606OoooO0;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // p016OooOoO0.OooOO0
        public final MenuInflater OooO0o() {
            return new p016OooOoO0.OooOo(this.f4605Oooo0oo);
        }

        @Override // p016OooOoO0.OooOO0
        public final Menu OooO0o0() {
            return this.f4604Oooo;
        }

        @Override // p016OooOoO0.OooOO0
        public final CharSequence OooO0oO() {
            return oo000o.this.f4581OooO0o.getSubtitle();
        }

        @Override // p016OooOoO0.OooOO0
        public final CharSequence OooO0oo() {
            return oo000o.this.f4581OooO0o.getTitle();
        }

        @Override // p016OooOoO0.OooOO0
        public final boolean OooOO0() {
            return oo000o.this.f4581OooO0o.f4816OooooOO;
        }

        @Override // p016OooOoO0.OooOO0
        public final void OooOO0O(View view) {
            oo000o.this.f4581OooO0o.setCustomView(view);
            this.f4606OoooO0 = new WeakReference<>(view);
        }

        @Override // p016OooOoO0.OooOO0
        public final void OooOO0o(int i) {
            oo000o.this.f4581OooO0o.setSubtitle(oo000o.this.f4577OooO00o.getResources().getString(i));
        }

        @Override // p016OooOoO0.OooOO0
        public final void OooOOO(int i) {
            oo000o.this.f4581OooO0o.setTitle(oo000o.this.f4577OooO00o.getResources().getString(i));
        }

        @Override // p016OooOoO0.OooOO0
        public final void OooOOO0(CharSequence charSequence) {
            oo000o.this.f4581OooO0o.setSubtitle(charSequence);
        }

        @Override // p016OooOoO0.OooOO0
        public final void OooOOOO(CharSequence charSequence) {
            oo000o.this.f4581OooO0o.setTitle(charSequence);
        }

        @Override // p016OooOoO0.OooOO0
        public final void OooOOOo(boolean z) {
            this.f299Oooo0oO = z;
            oo000o.this.f4581OooO0o.setTitleOptional(z);
        }
    }

    public oo000o(Activity activity, boolean z) {
        new ArrayList();
        this.f4589OooOOO0 = new ArrayList<>();
        this.f4590OooOOOO = 0;
        this.f4591OooOOOo = true;
        this.f4594OooOOoo = true;
        this.f4599OooOo0o = new OooO00o();
        this.f4595OooOo = new OooO0O0();
        this.f4600OooOoO0 = new OooO0OO();
        View decorView = activity.getWindow().getDecorView();
        OooOOo(decorView);
        if (z) {
            return;
        }
        this.f4583OooO0oO = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooO(int i, KeyEvent keyEvent) {
        androidx.appcompat.view.menu.OooO0o oooO0o;
        OooO0o oooO0o2 = this.f4576OooO;
        if (oooO0o2 == null || (oooO0o = oooO0o2.f4604Oooo) == null) {
            return false;
        }
        oooO0o.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return oooO0o.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean OooO0O0() {
        o00oO0o o00oo0o2 = this.f4582OooO0o0;
        if (o00oo0o2 == null || !o00oo0o2.OooOO0()) {
            return false;
        }
        this.f4582OooO0o0.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooO0OO(boolean z) {
        if (z == this.f4587OooOO0o) {
            return;
        }
        this.f4587OooOO0o = z;
        int size = this.f4589OooOOO0.size();
        for (int i = 0; i < size; i++) {
            this.f4589OooOOO0.get(i).OooO00o();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int OooO0Oo() {
        return this.f4582OooO0o0.OooOOOo();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context OooO0o0() {
        if (this.f4578OooO0O0 == null) {
            TypedValue typedValue = new TypedValue();
            this.f4577OooO00o.getTheme().resolveAttribute(OooOo00.OooO00o.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f4578OooO0O0 = new ContextThemeWrapper(this.f4577OooO00o, i);
            } else {
                this.f4578OooO0O0 = this.f4577OooO00o;
            }
        }
        return this.f4578OooO0O0;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooO0oO() {
        OooOOoo(this.f4577OooO00o.getResources().getBoolean(OooOo00.OooO0O0.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOO0o(boolean z) {
        if (this.f4584OooO0oo) {
            return;
        }
        OooOOO0(z);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOO(boolean z) {
        p016OooOoO0.Oooo000 oooo000;
        this.f4596OooOo0 = z;
        if (z || (oooo000 = this.f4597OooOo00) == null) {
            return;
        }
        oooo000.OooO00o();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOO0(boolean z) {
        int i = z ? 4 : 0;
        int iOooOOOo = this.f4582OooO0o0.OooOOOo();
        this.f4584OooO0oo = true;
        this.f4582OooO0o0.OooOO0O((i & 4) | ((-5) & iOooOOOo));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void OooOOOO(CharSequence charSequence) {
        this.f4582OooO0o0.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final p016OooOoO0.OooOO0 OooOOOo(OooOoO0.OooOO0.OooO00o oooO00o) {
        OooO0o oooO0o = this.f4576OooO;
        if (oooO0o != null) {
            oooO0o.OooO0OO();
        }
        this.f4579OooO0OO.setHideOnContentScrollEnabled(false);
        this.f4581OooO0o.OooO0oo();
        OooO0o oooO0o2 = new OooO0o(this.f4581OooO0o.getContext(), oooO00o);
        oooO0o2.f4604Oooo.OooOooO();
        try {
            boolean zOooO0O0 = oooO0o2.f4607OoooO00.OooO0O0(oooO0o2, oooO0o2.f4604Oooo);
            oooO0o2.f4604Oooo.OooOoo();
            if (!zOooO0O0) {
                return null;
            }
            this.f4576OooO = oooO0o2;
            oooO0o2.OooO();
            this.f4581OooO0o.OooO0o(oooO0o2);
            OooOOo0(true);
            return oooO0o2;
        } catch (Throwable th) {
            oooO0o2.f4604Oooo.OooOoo();
            throw th;
        }
    }

    public final void OooOOo(View view) {
        o00oO0o wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(OooOo00.OooOO0.decor_content_parent);
        this.f4579OooO0OO = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(OooOo00.OooOO0.action_bar);
        if (callbackFindViewById instanceof o00oO0o) {
            wrapper = (o00oO0o) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Can't make a decor toolbar out of ");
                sbOooO0o0.append(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(sbOooO0o0.toString());
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.f4582OooO0o0 = wrapper;
        this.f4581OooO0o = (ActionBarContextView) view.findViewById(OooOo00.OooOO0.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(OooOo00.OooOO0.action_bar_container);
        this.f4580OooO0Oo = actionBarContainer;
        o00oO0o o00oo0o2 = this.f4582OooO0o0;
        if (o00oo0o2 == null || this.f4581OooO0o == null || actionBarContainer == null) {
            throw new IllegalStateException(oo000o.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f4577OooO00o = o00oo0o2.getContext();
        if ((this.f4582OooO0o0.OooOOOo() & 4) != 0) {
            this.f4584OooO0oo = true;
        }
        Context context = this.f4577OooO00o;
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f4582OooO0o0.OooO();
        OooOOoo(context.getResources().getBoolean(OooOo00.OooO0O0.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.f4577OooO00o.obtainStyledAttributes(null, OooOo00.OooOOOO.ActionBar, OooOo00.OooO00o.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(OooOo00.OooOOOO.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4579OooO0OO;
            if (!actionBarOverlayLayout2.f4825OoooO) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f4598OooOo0O = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(OooOo00.OooOOOO.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f4580OooO0Oo;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOOO.OooOOoo(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OooOOo0(boolean z) {
        o00000O o00000oOooOOOO;
        o00000O o00000oOooO0o0;
        if (z) {
            if (!this.f4592OooOOo) {
                this.f4592OooOOo = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4579OooO0OO;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                OooOo00(false);
            }
        } else if (this.f4592OooOOo) {
            this.f4592OooOOo = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4579OooO0OO;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            OooOo00(false);
        }
        ActionBarContainer actionBarContainer = this.f4580OooO0Oo;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        if (!ViewCompat.OooOO0O.OooO0OO(actionBarContainer)) {
            if (z) {
                this.f4582OooO0o0.setVisibility(4);
                this.f4581OooO0o.setVisibility(0);
                return;
            } else {
                this.f4582OooO0o0.setVisibility(0);
                this.f4581OooO0o.setVisibility(8);
                return;
            }
        }
        if (z) {
            o00000oOooO0o0 = this.f4582OooO0o0.OooOOOO(4, 100L);
            o00000oOooOOOO = this.f4581OooO0o.OooO0o0(0, 200L);
        } else {
            o00000oOooOOOO = this.f4582OooO0o0.OooOOOO(0, 200L);
            o00000oOooO0o0 = this.f4581OooO0o.OooO0o0(8, 100L);
        }
        p016OooOoO0.Oooo000 oooo000 = new p016OooOoO0.Oooo000();
        oooo000.f359OooO00o.add(o00000oOooO0o0);
        View view = o00000oOooO0o0.f28117OooO00o.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = o00000oOooOOOO.f28117OooO00o.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        oooo000.f359OooO00o.add(o00000oOooOOOO);
        oooo000.OooO0OO();
    }

    public final void OooOOoo(boolean z) {
        this.f4588OooOOO = z;
        if (z) {
            this.f4580OooO0Oo.setTabContainer(null);
            this.f4582OooO0o0.OooOO0o();
        } else {
            this.f4582OooO0o0.OooOO0o();
            this.f4580OooO0Oo.setTabContainer(null);
        }
        this.f4582OooO0o0.OooOOO();
        o00oO0o o00oo0o2 = this.f4582OooO0o0;
        boolean z2 = this.f4588OooOOO;
        o00oo0o2.OooOOoo(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4579OooO0OO;
        boolean z3 = this.f4588OooOOO;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void OooOo00(boolean z) {
        View view;
        View view2;
        View view3;
        if (!(this.f4592OooOOo || !this.f4593OooOOo0)) {
            if (this.f4594OooOOoo) {
                this.f4594OooOOoo = false;
                p016OooOoO0.Oooo000 oooo000 = this.f4597OooOo00;
                if (oooo000 != null) {
                    oooo000.OooO00o();
                }
                if (this.f4590OooOOOO != 0 || (!this.f4596OooOo0 && !z)) {
                    this.f4599OooOo0o.OooO00o();
                    return;
                }
                this.f4580OooO0Oo.setAlpha(1.0f);
                this.f4580OooO0Oo.setTransitioning(true);
                p016OooOoO0.Oooo000 oooo001 = new p016OooOoO0.Oooo000();
                float f = -this.f4580OooO0Oo.getHeight();
                if (z) {
                    int[] iArr = {0, 0};
                    this.f4580OooO0Oo.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                o00000O o00000oOooO0O0 = ViewCompat.OooO0O0(this.f4580OooO0Oo);
                o00000oOooO0O0.OooO0oO(f);
                o00000oOooO0O0.OooO0o(this.f4600OooOoO0);
                oooo001.OooO0O0(o00000oOooO0O0);
                if (this.f4591OooOOOo && (view = this.f4583OooO0oO) != null) {
                    o00000O o00000oOooO0O1 = ViewCompat.OooO0O0(view);
                    o00000oOooO0O1.OooO0oO(f);
                    oooo001.OooO0O0(o00000oOooO0O1);
                }
                AccelerateInterpolator accelerateInterpolator = f4574OooOoO;
                boolean z2 = oooo001.f364OooO0o0;
                if (!z2) {
                    oooo001.f361OooO0OO = accelerateInterpolator;
                }
                if (!z2) {
                    oooo001.f360OooO0O0 = 250L;
                }
                OooO00o oooO00o = this.f4599OooOo0o;
                if (!z2) {
                    oooo001.f362OooO0Oo = oooO00o;
                }
                this.f4597OooOo00 = oooo001;
                oooo001.OooO0OO();
                return;
            }
            return;
        }
        if (this.f4594OooOOoo) {
            return;
        }
        this.f4594OooOOoo = true;
        p016OooOoO0.Oooo000 oooo002 = this.f4597OooOo00;
        if (oooo002 != null) {
            oooo002.OooO00o();
        }
        this.f4580OooO0Oo.setVisibility(0);
        if (this.f4590OooOOOO == 0 && (this.f4596OooOo0 || z)) {
            this.f4580OooO0Oo.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            float f2 = -this.f4580OooO0Oo.getHeight();
            if (z) {
                int[] iArr2 = {0, 0};
                this.f4580OooO0Oo.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.f4580OooO0Oo.setTranslationY(f2);
            p016OooOoO0.Oooo000 oooo003 = new p016OooOoO0.Oooo000();
            o00000O o00000oOooO0O2 = ViewCompat.OooO0O0(this.f4580OooO0Oo);
            o00000oOooO0O2.OooO0oO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            o00000oOooO0O2.OooO0o(this.f4600OooOoO0);
            oooo003.OooO0O0(o00000oOooO0O2);
            if (this.f4591OooOOOo && (view3 = this.f4583OooO0oO) != null) {
                view3.setTranslationY(f2);
                o00000O o00000oOooO0O3 = ViewCompat.OooO0O0(this.f4583OooO0oO);
                o00000oOooO0O3.OooO0oO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                oooo003.OooO0O0(o00000oOooO0O3);
            }
            DecelerateInterpolator decelerateInterpolator = f4575OooOoOO;
            boolean z3 = oooo003.f364OooO0o0;
            if (!z3) {
                oooo003.f361OooO0OO = decelerateInterpolator;
            }
            if (!z3) {
                oooo003.f360OooO0O0 = 250L;
            }
            OooO0O0 oooO0O0 = this.f4595OooOo;
            if (!z3) {
                oooo003.f362OooO0Oo = oooO0O0;
            }
            this.f4597OooOo00 = oooo003;
            oooo003.OooO0OO();
        } else {
            this.f4580OooO0Oo.setAlpha(1.0f);
            this.f4580OooO0Oo.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            if (this.f4591OooOOOo && (view2 = this.f4583OooO0oO) != null) {
                view2.setTranslationY(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            }
            this.f4595OooOo.OooO00o();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4579OooO0OO;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOOO0.OooO0OO(actionBarOverlayLayout);
        }
    }

    public oo000o(Dialog dialog) {
        new ArrayList();
        this.f4589OooOOO0 = new ArrayList<>();
        this.f4590OooOOOO = 0;
        this.f4591OooOOOo = true;
        this.f4594OooOOoo = true;
        this.f4599OooOo0o = new OooO00o();
        this.f4595OooOo = new OooO0O0();
        this.f4600OooOoO0 = new OooO0OO();
        OooOOo(dialog.getWindow().getDecorView());
    }
}
