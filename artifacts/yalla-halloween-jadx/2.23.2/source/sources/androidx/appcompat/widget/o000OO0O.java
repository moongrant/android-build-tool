package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.Toolbar.OooOO0;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o000OO0O implements o0Oo0oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public CharSequence f3292OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Toolbar f3293OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f3294OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ScrollingTabContainerView f3295OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public View f3296OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Drawable f3297OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Drawable f3298OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Drawable f3299OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f3300OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public CharSequence f3301OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public CharSequence f3302OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Window.Callback f3303OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ActionMenuPresenter f3304OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f3305OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f3306OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Drawable f3307OooOOOo;

    public class OooO00o extends androidx.core.view.o00O0000 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f3308OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ int f3309OooO0O0;

        public OooO00o(int i) {
            this.f3309OooO0O0 = i;
        }

        @Override // androidx.core.view.o00
        public final void OooO00o() {
            if (this.f3308OooO00o) {
                return;
            }
            o000OO0O.this.f3293OooO00o.setVisibility(this.f3309OooO0O0);
        }

        @Override // androidx.core.view.o00O0000, androidx.core.view.o00
        public final void OooO0O0() {
            o000OO0O.this.f3293OooO00o.setVisibility(0);
        }

        @Override // androidx.core.view.o00O0000, androidx.core.view.o00
        public final void OooO0OO(View view) {
            this.f3308OooO00o = true;
        }
    }

    public o000OO0O(Toolbar toolbar, boolean z) {
        int i;
        Drawable drawable;
        int i2 = p012OooOo0O.o000oOoO.abc_action_bar_up_description;
        this.f3306OooOOOO = 0;
        this.f3293OooO00o = toolbar;
        this.f3292OooO = toolbar.getTitle();
        this.f3301OooOO0 = toolbar.getSubtitle();
        this.f3300OooO0oo = this.f3292OooO != null;
        this.f3299OooO0oO = toolbar.getNavigationIcon();
        o000Oo0 o000oo0OooOOO0 = o000Oo0.OooOOO0(toolbar.getContext(), null, p012OooOo0O.o00O0O.ActionBar, p012OooOo0O.OooOOO0.actionBarStyle);
        this.f3307OooOOOo = o000oo0OooOOO0.OooO0o0(p012OooOo0O.o00O0O.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence charSequenceOooOO0O = o000oo0OooOOO0.OooOO0O(p012OooOo0O.o00O0O.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceOooOO0O)) {
                this.f3300OooO0oo = true;
                this.f3292OooO = charSequenceOooOO0O;
                if ((this.f3294OooO0O0 & 8) != 0) {
                    toolbar.setTitle(charSequenceOooOO0O);
                    if (this.f3300OooO0oo) {
                        ViewCompat.OooOOOo(toolbar.getRootView(), charSequenceOooOO0O);
                    }
                }
            }
            CharSequence charSequenceOooOO0O2 = o000oo0OooOOO0.OooOO0O(p012OooOo0O.o00O0O.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceOooOO0O2)) {
                this.f3301OooOO0 = charSequenceOooOO0O2;
                if ((this.f3294OooO0O0 & 8) != 0) {
                    toolbar.setSubtitle(charSequenceOooOO0O2);
                }
            }
            Drawable drawableOooO0o0 = o000oo0OooOOO0.OooO0o0(p012OooOo0O.o00O0O.ActionBar_logo);
            if (drawableOooO0o0 != null) {
                this.f3297OooO0o = drawableOooO0o0;
                OooOo00();
            }
            Drawable drawableOooO0o1 = o000oo0OooOOO0.OooO0o0(p012OooOo0O.o00O0O.ActionBar_icon);
            if (drawableOooO0o1 != null) {
                setIcon(drawableOooO0o1);
            }
            if (this.f3299OooO0oO == null && (drawable = this.f3307OooOOOo) != null) {
                this.f3299OooO0oO = drawable;
                if ((this.f3294OooO0O0 & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            OooO(o000oo0OooOOO0.OooO0oo(p012OooOo0O.o00O0O.ActionBar_displayOptions, 0));
            int iOooO = o000oo0OooOOO0.OooO(p012OooOo0O.o00O0O.ActionBar_customNavigationLayout, 0);
            if (iOooO != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(iOooO, (ViewGroup) toolbar, false);
                View view = this.f3296OooO0Oo;
                if (view != null && (this.f3294OooO0O0 & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f3296OooO0Oo = viewInflate;
                if (viewInflate != null && (this.f3294OooO0O0 & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                OooO(this.f3294OooO0O0 | 16);
            }
            int layoutDimension = o000oo0OooOOO0.f3324OooO0O0.getLayoutDimension(p012OooOo0O.o00O0O.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int iOooO0OO = o000oo0OooOOO0.OooO0OO(p012OooOo0O.o00O0O.ActionBar_contentInsetStart, -1);
            int iOooO0OO2 = o000oo0OooOOO0.OooO0OO(p012OooOo0O.o00O0O.ActionBar_contentInsetEnd, -1);
            if (iOooO0OO >= 0 || iOooO0OO2 >= 0) {
                int iMax = Math.max(iOooO0OO, 0);
                int iMax2 = Math.max(iOooO0OO2, 0);
                if (toolbar.f3144OooOo0o == null) {
                    toolbar.f3144OooOo0o = new o0000O00();
                }
                toolbar.f3144OooOo0o.OooO00o(iMax, iMax2);
            }
            int iOooO2 = o000oo0OooOOO0.OooO(p012OooOo0O.o00O0O.ActionBar_titleTextStyle, 0);
            if (iOooO2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f3135OooOOOO = iOooO2;
                AppCompatTextView appCompatTextView = toolbar.f3127OooO0o0;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, iOooO2);
                }
            }
            int iOooO3 = o000oo0OooOOO0.OooO(p012OooOo0O.o00O0O.ActionBar_subtitleTextStyle, 0);
            if (iOooO3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f3136OooOOOo = iOooO3;
                AppCompatTextView appCompatTextView2 = toolbar.f3126OooO0o;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, iOooO3);
                }
            }
            int iOooO4 = o000oo0OooOOO0.OooO(p012OooOo0O.o00O0O.ActionBar_popupTheme, 0);
            if (iOooO4 != 0) {
                toolbar.setPopupTheme(iOooO4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.f3307OooOOOo = toolbar.getNavigationIcon();
                i = 15;
            } else {
                i = 11;
            }
            this.f3294OooO0O0 = i;
        }
        o000oo0OooOOO0.OooOOO();
        if (i2 != this.f3306OooOOOO) {
            this.f3306OooOOOO = i2;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i3 = this.f3306OooOOOO;
                String string = i3 != 0 ? getContext().getString(i3) : null;
                this.f3302OooOO0O = string;
                if ((this.f3294OooO0O0 & 4) != 0) {
                    if (TextUtils.isEmpty(string)) {
                        toolbar.setNavigationContentDescription(this.f3306OooOOOO);
                    } else {
                        toolbar.setNavigationContentDescription(this.f3302OooOO0O);
                    }
                }
            }
        }
        this.f3302OooOO0O = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new o000O0Oo(this));
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void OooO(int i) {
        View view;
        int i2 = this.f3294OooO0O0 ^ i;
        this.f3294OooO0O0 = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.f3293OooO00o;
            if (i3 != 0) {
                if ((i & 4) != 0 && (i & 4) != 0) {
                    if (TextUtils.isEmpty(this.f3302OooOO0O)) {
                        toolbar.setNavigationContentDescription(this.f3306OooOOOO);
                    } else {
                        toolbar.setNavigationContentDescription(this.f3302OooOO0O);
                    }
                }
                if ((this.f3294OooO0O0 & 4) != 0) {
                    Drawable drawable = this.f3299OooO0oO;
                    if (drawable == null) {
                        drawable = this.f3307OooOOOo;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                OooOo00();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.f3292OooO);
                    toolbar.setSubtitle(this.f3301OooOO0);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f3296OooO0Oo) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final boolean OooO00o() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f3293OooO00o;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f3125OooO0Oo) != null && actionMenuView.f2775OooOo0O;
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void OooO0O0(androidx.appcompat.view.menu.OooO oooO, AppCompatDelegateImpl.OooO0OO oooO0OO) {
        ActionMenuPresenter actionMenuPresenter = this.f3304OooOOO;
        Toolbar toolbar = this.f3293OooO00o;
        if (actionMenuPresenter == null) {
            ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(toolbar.getContext());
            this.f3304OooOOO = actionMenuPresenter2;
            actionMenuPresenter2.f2601OooOO0o = p012OooOo0O.Oooo000.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter3 = this.f3304OooOOO;
        actionMenuPresenter3.f2598OooO0oo = oooO0OO;
        if (oooO == null && toolbar.f3125OooO0Oo == null) {
            return;
        }
        toolbar.OooO0o0();
        androidx.appcompat.view.menu.OooO oooO2 = toolbar.f3125OooO0Oo.f2771OooOOoo;
        if (oooO2 == oooO) {
            return;
        }
        if (oooO2 != null) {
            oooO2.OooOOo(toolbar.f3162Oooo0oo);
            oooO2.OooOOo(toolbar.f3152Oooo);
        }
        if (toolbar.f3152Oooo == null) {
            toolbar.f3152Oooo = toolbar.new OooOO0();
        }
        actionMenuPresenter3.f2754OooOo0 = true;
        if (oooO != null) {
            oooO.OooO0O0(actionMenuPresenter3, toolbar.f3134OooOOO0);
            oooO.OooO0O0(toolbar.f3152Oooo, toolbar.f3134OooOOO0);
        } else {
            actionMenuPresenter3.OooOO0O(toolbar.f3134OooOOO0, null);
            toolbar.f3152Oooo.OooOO0O(toolbar.f3134OooOOO0, null);
            actionMenuPresenter3.OooO(true);
            toolbar.f3152Oooo.OooO(true);
        }
        toolbar.f3125OooO0Oo.setPopupTheme(toolbar.f3133OooOOO);
        toolbar.f3125OooO0Oo.setPresenter(actionMenuPresenter3);
        toolbar.f3162Oooo0oo = actionMenuPresenter3;
        toolbar.OooOOoo();
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final boolean OooO0OO() {
        ActionMenuView actionMenuView = this.f3293OooO00o.f3125OooO0Oo;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f2776OooOo0o;
        return actionMenuPresenter != null && actionMenuPresenter.OooOO0o();
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final boolean OooO0Oo() {
        ActionMenuView actionMenuView = this.f3293OooO00o.f3125OooO0Oo;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f2776OooOo0o;
        return actionMenuPresenter != null && actionMenuPresenter.OooOOOO();
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void OooO0o() {
        this.f3305OooOOO0 = true;
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final boolean OooO0o0() {
        ActionMenuView actionMenuView = this.f3293OooO00o.f3125OooO0Oo;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f2776OooOo0o;
        return actionMenuPresenter != null && actionMenuPresenter.OooOOO0();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001e  */
    @Override // androidx.appcompat.widget.o0Oo0oo
    public final boolean OooO0oO() {
        boolean z;
        ActionMenuView actionMenuView = this.f3293OooO00o.f3125OooO0Oo;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f2776OooOo0o;
        if (actionMenuPresenter == null) {
            z = false;
        } else {
            if (actionMenuPresenter.f2759OooOoO0 != null || actionMenuPresenter.OooOOO0()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final boolean OooO0oo() {
        Toolbar.OooOO0 oooOO1 = this.f3293OooO00o.f3152Oooo;
        return (oooOO1 == null || oooOO1.f3177OooO0o0 == null) ? false : true;
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void OooOO0() {
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final androidx.core.view.o000OOo0 OooOO0O(int i, long j) {
        androidx.core.view.o000OOo0 o000ooo0OooO00o = ViewCompat.OooO00o(this.f3293OooO00o);
        o000ooo0OooO00o.OooO00o(i == 0 ? 1.0f : 0.0f);
        o000ooo0OooO00o.OooO0OO(j);
        o000ooo0OooO00o.OooO0Oo(new OooO00o(i));
        return o000ooo0OooO00o;
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void OooOO0o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void OooOOO() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f3293OooO00o.f3125OooO0Oo;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f2776OooOo0o) == null) {
            return;
        }
        actionMenuPresenter.OooOO0o();
        ActionMenuPresenter.OooO00o oooO00o = actionMenuPresenter.f2753OooOo;
        if (oooO00o == null || !oooO00o.OooO0O0()) {
            return;
        }
        oooO00o.f2663OooOO0.dismiss();
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void OooOOO0(boolean z) {
        this.f3293OooO00o.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void OooOOOO() {
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void OooOOOo() {
        ScrollingTabContainerView scrollingTabContainerView = this.f3295OooO0OO;
        if (scrollingTabContainerView != null) {
            ViewParent parent = scrollingTabContainerView.getParent();
            Toolbar toolbar = this.f3293OooO00o;
            if (parent == toolbar) {
                toolbar.removeView(this.f3295OooO0OO);
            }
        }
        this.f3295OooO0OO = null;
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final int OooOOo() {
        return this.f3294OooO0O0;
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void OooOOo0(int i) {
        this.f3297OooO0o = i != 0 ? p013OooOo0o.o00Oo0.OooO00o(getContext(), i) : null;
        OooOo00();
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void OooOOoo() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void OooOo00() {
        Drawable drawable;
        int i = this.f3294OooO0O0;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f3297OooO0o) == null) {
            drawable = this.f3298OooO0o0;
        }
        this.f3293OooO00o.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void collapseActionView() {
        Toolbar.OooOO0 oooOO1 = this.f3293OooO00o.f3152Oooo;
        androidx.appcompat.view.menu.OooOO0O oooOO0O = oooOO1 == null ? null : oooOO1.f3177OooO0o0;
        if (oooOO0O != null) {
            oooOO0O.collapseActionView();
        }
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final Context getContext() {
        return this.f3293OooO00o.getContext();
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final CharSequence getTitle() {
        return this.f3293OooO00o.getTitle();
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void setIcon(int i) {
        setIcon(i != 0 ? p013OooOo0o.o00Oo0.OooO00o(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void setVisibility(int i) {
        this.f3293OooO00o.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void setWindowCallback(Window.Callback callback) {
        this.f3303OooOO0o = callback;
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f3300OooO0oo) {
            return;
        }
        this.f3292OooO = charSequence;
        if ((this.f3294OooO0O0 & 8) != 0) {
            Toolbar toolbar = this.f3293OooO00o;
            toolbar.setTitle(charSequence);
            if (this.f3300OooO0oo) {
                ViewCompat.OooOOOo(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // androidx.appcompat.widget.o0Oo0oo
    public final void setIcon(Drawable drawable) {
        this.f3298OooO0o0 = drawable;
        OooOo00();
    }
}
