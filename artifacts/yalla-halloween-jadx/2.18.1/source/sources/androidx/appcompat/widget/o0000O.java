package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Toolbar.OooO0o;
import androidx.core.view.ViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0000O implements o00oO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public CharSequence f5347OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Toolbar f5348OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f5349OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public ScrollingTabContainerView f5350OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public View f5351OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Drawable f5352OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Drawable f5353OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Drawable f5354OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f5355OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public CharSequence f5356OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public CharSequence f5357OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Window.Callback f5358OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ActionMenuPresenter f5359OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f5360OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f5361OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Drawable f5362OooOOOo;

    public class OooO00o extends o000O0O0.o0000Ooo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public boolean f5363OooO00o = false;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ int f5364OooO0O0;

        public OooO00o(int i) {
            this.f5364OooO0O0 = i;
        }

        @Override // o000O0O0.o00000OO
        public final void OooO00o() {
            if (this.f5363OooO00o) {
                return;
            }
            o0000O.this.f5348OooO00o.setVisibility(this.f5364OooO0O0);
        }

        @Override // o000O0O0.o0000Ooo, o000O0O0.o00000OO
        public final void OooO0O0() {
            o0000O.this.f5348OooO00o.setVisibility(0);
        }

        @Override // o000O0O0.o0000Ooo, o000O0O0.o00000OO
        public final void OooO0OO(View view) {
            this.f5363OooO00o = true;
        }
    }

    public o0000O(Toolbar toolbar, boolean z) {
        int i;
        Drawable drawable;
        int i2 = OooOo00.OooOOO0.abc_action_bar_up_description;
        this.f5361OooOOOO = 0;
        this.f5348OooO00o = toolbar;
        this.f5347OooO = toolbar.getTitle();
        this.f5356OooOO0 = toolbar.getSubtitle();
        this.f5355OooO0oo = this.f5347OooO != null;
        this.f5354OooO0oO = toolbar.getNavigationIcon();
        o0000O0 o0000o0OooOOo = o0000O0.OooOOo(toolbar.getContext(), null, OooOo00.OooOOOO.ActionBar, OooOo00.OooO00o.actionBarStyle);
        this.f5362OooOOOo = o0000o0OooOOo.OooO0oO(OooOo00.OooOOOO.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence charSequenceOooOOOO = o0000o0OooOOo.OooOOOO(OooOo00.OooOOOO.ActionBar_title);
            if (!TextUtils.isEmpty(charSequenceOooOOOO)) {
                this.f5355OooO0oo = true;
                OooOo00(charSequenceOooOOOO);
            }
            CharSequence charSequenceOooOOOO2 = o0000o0OooOOo.OooOOOO(OooOo00.OooOOOO.ActionBar_subtitle);
            if (!TextUtils.isEmpty(charSequenceOooOOOO2)) {
                this.f5356OooOO0 = charSequenceOooOOOO2;
                if ((this.f5349OooO0O0 & 8) != 0) {
                    this.f5348OooO00o.setSubtitle(charSequenceOooOOOO2);
                }
            }
            Drawable drawableOooO0oO = o0000o0OooOOo.OooO0oO(OooOo00.OooOOOO.ActionBar_logo);
            if (drawableOooO0oO != null) {
                this.f5352OooO0o = drawableOooO0oO;
                OooOo0o();
            }
            Drawable drawableOooO0oO2 = o0000o0OooOOo.OooO0oO(OooOo00.OooOOOO.ActionBar_icon);
            if (drawableOooO0oO2 != null) {
                setIcon(drawableOooO0oO2);
            }
            if (this.f5354OooO0oO == null && (drawable = this.f5362OooOOOo) != null) {
                this.f5354OooO0oO = drawable;
                OooOo0O();
            }
            OooOO0O(o0000o0OooOOo.OooOO0(OooOo00.OooOOOO.ActionBar_displayOptions, 0));
            int iOooOOO0 = o0000o0OooOOo.OooOOO0(OooOo00.OooOOOO.ActionBar_customNavigationLayout, 0);
            if (iOooOOO0 != 0) {
                View viewInflate = LayoutInflater.from(this.f5348OooO00o.getContext()).inflate(iOooOOO0, (ViewGroup) this.f5348OooO00o, false);
                View view = this.f5351OooO0Oo;
                if (view != null && (this.f5349OooO0O0 & 16) != 0) {
                    this.f5348OooO00o.removeView(view);
                }
                this.f5351OooO0Oo = viewInflate;
                if (viewInflate != null && (this.f5349OooO0O0 & 16) != 0) {
                    this.f5348OooO00o.addView(viewInflate);
                }
                OooOO0O(this.f5349OooO0O0 | 16);
            }
            int iOooOO0o = o0000o0OooOOo.OooOO0o(OooOo00.OooOOOO.ActionBar_height, 0);
            if (iOooOO0o > 0) {
                ViewGroup.LayoutParams layoutParams = this.f5348OooO00o.getLayoutParams();
                layoutParams.height = iOooOO0o;
                this.f5348OooO00o.setLayoutParams(layoutParams);
            }
            int iOooO0o0 = o0000o0OooOOo.OooO0o0(OooOo00.OooOOOO.ActionBar_contentInsetStart, -1);
            int iOooO0o1 = o0000o0OooOOo.OooO0o0(OooOo00.OooOOOO.ActionBar_contentInsetEnd, -1);
            if (iOooO0o0 >= 0 || iOooO0o1 >= 0) {
                Toolbar toolbar2 = this.f5348OooO00o;
                int iMax = Math.max(iOooO0o0, 0);
                int iMax2 = Math.max(iOooO0o1, 0);
                toolbar2.OooO0Oo();
                toolbar2.f5269OooooOo.OooO00o(iMax, iMax2);
            }
            int iOooOOO1 = o0000o0OooOOo.OooOOO0(OooOo00.OooOOOO.ActionBar_titleTextStyle, 0);
            if (iOooOOO1 != 0) {
                Toolbar toolbar3 = this.f5348OooO00o;
                toolbar3.OooOo0O(toolbar3.getContext(), iOooOOO1);
            }
            int iOooOOO2 = o0000o0OooOOo.OooOOO0(OooOo00.OooOOOO.ActionBar_subtitleTextStyle, 0);
            if (iOooOOO2 != 0) {
                Toolbar toolbar4 = this.f5348OooO00o;
                Context context = toolbar4.getContext();
                toolbar4.f5262OoooOo0 = iOooOOO2;
                AppCompatTextView appCompatTextView = toolbar4.f5254Oooo0oo;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, iOooOOO2);
                }
            }
            int iOooOOO3 = o0000o0OooOOo.OooOOO0(OooOo00.OooOOOO.ActionBar_popupTheme, 0);
            if (iOooOOO3 != 0) {
                this.f5348OooO00o.setPopupTheme(iOooOOO3);
            }
        } else {
            if (this.f5348OooO00o.getNavigationIcon() != null) {
                i = 15;
                this.f5362OooOOOo = this.f5348OooO00o.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f5349OooO0O0 = i;
        }
        o0000o0OooOOo.OooOOoo();
        if (i2 != this.f5361OooOOOO) {
            this.f5361OooOOOO = i2;
            if (TextUtils.isEmpty(this.f5348OooO00o.getNavigationContentDescription())) {
                int i3 = this.f5361OooOOOO;
                this.f5357OooOO0O = i3 != 0 ? getContext().getString(i3) : null;
                OooOo0();
            }
        }
        this.f5357OooOO0O = this.f5348OooO00o.getNavigationContentDescription();
        this.f5348OooO00o.setNavigationOnClickListener(new o000OO(this));
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void OooO() {
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void OooO00o(Menu menu, androidx.appcompat.view.menu.OooOOO0.OooO00o oooO00o) {
        androidx.appcompat.view.menu.OooOO0 oooOO1;
        if (this.f5359OooOOO == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f5348OooO00o.getContext());
            this.f5359OooOOO = actionMenuPresenter;
            actionMenuPresenter.f4688OoooOO0 = OooOo00.OooOO0.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter2 = this.f5359OooOOO;
        actionMenuPresenter2.f4686OoooO00 = oooO00o;
        Toolbar toolbar = this.f5348OooO00o;
        androidx.appcompat.view.menu.OooO0o oooO0o = (androidx.appcompat.view.menu.OooO0o) menu;
        if (oooO0o == null && toolbar.f5252Oooo0o == null) {
            return;
        }
        toolbar.OooO0o();
        androidx.appcompat.view.menu.OooO0o oooO0o2 = toolbar.f5252Oooo0o.f4876Ooooo00;
        if (oooO0o2 == oooO0o) {
            return;
        }
        if (oooO0o2 != null) {
            oooO0o2.OooOo0O(toolbar.f5285o0OOO0o);
            oooO0o2.OooOo0O(toolbar.f5286o0Oo0oo);
        }
        if (toolbar.f5286o0Oo0oo == null) {
            toolbar.f5286o0Oo0oo = toolbar.new OooO0o();
        }
        actionMenuPresenter2.f4858OooooO0 = true;
        if (oooO0o != null) {
            oooO0o.OooO0OO(actionMenuPresenter2, toolbar.f5275o000oOoO);
            oooO0o.OooO0OO(toolbar.f5286o0Oo0oo, toolbar.f5275o000oOoO);
        } else {
            actionMenuPresenter2.OooO0oo(toolbar.f5275o000oOoO, null);
            Toolbar.OooO0o oooO0o3 = toolbar.f5286o0Oo0oo;
            androidx.appcompat.view.menu.OooO0o oooO0o4 = oooO0o3.f5298Oooo0o;
            if (oooO0o4 != null && (oooOO1 = oooO0o3.f5299Oooo0oO) != null) {
                oooO0o4.OooO0o0(oooOO1);
            }
            oooO0o3.f5298Oooo0o = null;
            actionMenuPresenter2.OooO0Oo(true);
            toolbar.f5286o0Oo0oo.OooO0Oo(true);
        }
        toolbar.f5252Oooo0o.setPopupTheme(toolbar.f5260OoooOOO);
        toolbar.f5252Oooo0o.setPresenter(actionMenuPresenter2);
        toolbar.f5285o0OOO0o = actionMenuPresenter2;
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final boolean OooO0O0() {
        return this.f5348OooO00o.OooOOo0();
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void OooO0OO() {
        this.f5360OooOOO0 = true;
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final boolean OooO0Oo() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f5348OooO00o;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f5252Oooo0o) != null && actionMenuView.f4879OooooOO;
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final boolean OooO0o() {
        ActionMenuView actionMenuView = this.f5348OooO00o.f5252Oooo0o;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f4880OooooOo;
        return actionMenuPresenter != null && actionMenuPresenter.OooOO0();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001e  */
    @Override // androidx.appcompat.widget.o00oO0o
    public final boolean OooO0o0() {
        boolean z;
        ActionMenuView actionMenuView = this.f5348OooO00o.f5252Oooo0o;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f4880OooooOo;
        if (actionMenuPresenter == null) {
            z = false;
        } else {
            if (actionMenuPresenter.f4861Oooooo != null || actionMenuPresenter.OooOOO()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final boolean OooO0oO() {
        return this.f5348OooO00o.OooOo();
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void OooO0oo() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f5348OooO00o.f5252Oooo0o;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.f4880OooooOo) == null) {
            return;
        }
        actionMenuPresenter.OooO00o();
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final boolean OooOO0() {
        Toolbar.OooO0o oooO0o = this.f5348OooO00o.f5286o0Oo0oo;
        return (oooO0o == null || oooO0o.f5299Oooo0oO == null) ? false : true;
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void OooOO0O(int i) {
        View view;
        int i2 = this.f5349OooO0O0 ^ i;
        this.f5349OooO0O0 = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    OooOo0();
                }
                OooOo0O();
            }
            if ((i2 & 3) != 0) {
                OooOo0o();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f5348OooO00o.setTitle(this.f5347OooO);
                    this.f5348OooO00o.setSubtitle(this.f5356OooOO0);
                } else {
                    this.f5348OooO00o.setTitle((CharSequence) null);
                    this.f5348OooO00o.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f5351OooO0Oo) == null) {
                return;
            }
            if ((i & 16) != 0) {
                this.f5348OooO00o.addView(view);
            } else {
                this.f5348OooO00o.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void OooOO0o() {
        ScrollingTabContainerView scrollingTabContainerView = this.f5350OooO0OO;
        if (scrollingTabContainerView != null) {
            ViewParent parent = scrollingTabContainerView.getParent();
            Toolbar toolbar = this.f5348OooO00o;
            if (parent == toolbar) {
                toolbar.removeView(this.f5350OooO0OO);
            }
        }
        this.f5350OooO0OO = null;
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void OooOOO() {
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void OooOOO0(int i) {
        this.f5352OooO0o = i != 0 ? p012OooOo0.OooOO0O.OooO0O0(getContext(), i) : null;
        OooOo0o();
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final o000O0O0.o00000O OooOOOO(int i, long j) {
        o000O0O0.o00000O o00000oOooO0O0 = ViewCompat.OooO0O0(this.f5348OooO00o);
        o00000oOooO0O0.OooO00o(i == 0 ? 1.0f : ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        o00000oOooO0O0.OooO0OO(j);
        o00000oOooO0O0.OooO0Oo(new OooO00o(i));
        return o00000oOooO0O0;
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final int OooOOOo() {
        return this.f5349OooO0O0;
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void OooOOo() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void OooOOo0() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void OooOOoo(boolean z) {
        this.f5348OooO00o.setCollapsible(z);
    }

    public final void OooOo0() {
        if ((this.f5349OooO0O0 & 4) != 0) {
            if (TextUtils.isEmpty(this.f5357OooOO0O)) {
                this.f5348OooO00o.setNavigationContentDescription(this.f5361OooOOOO);
            } else {
                this.f5348OooO00o.setNavigationContentDescription(this.f5357OooOO0O);
            }
        }
    }

    public final void OooOo00(CharSequence charSequence) {
        this.f5347OooO = charSequence;
        if ((this.f5349OooO0O0 & 8) != 0) {
            this.f5348OooO00o.setTitle(charSequence);
            if (this.f5355OooO0oo) {
                ViewCompat.OooOo(this.f5348OooO00o.getRootView(), charSequence);
            }
        }
    }

    public final void OooOo0O() {
        if ((this.f5349OooO0O0 & 4) == 0) {
            this.f5348OooO00o.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f5348OooO00o;
        Drawable drawable = this.f5354OooO0oO;
        if (drawable == null) {
            drawable = this.f5362OooOOOo;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void OooOo0o() {
        Drawable drawable;
        int i = this.f5349OooO0O0;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f5352OooO0o) == null) {
            drawable = this.f5353OooO0o0;
        }
        this.f5348OooO00o.setLogo(drawable);
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void collapseActionView() {
        Toolbar.OooO0o oooO0o = this.f5348OooO00o.f5286o0Oo0oo;
        androidx.appcompat.view.menu.OooOO0 oooOO1 = oooO0o == null ? null : oooO0o.f5299Oooo0oO;
        if (oooOO1 != null) {
            oooOO1.collapseActionView();
        }
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final Context getContext() {
        return this.f5348OooO00o.getContext();
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final CharSequence getTitle() {
        return this.f5348OooO00o.getTitle();
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void setIcon(int i) {
        setIcon(i != 0 ? p012OooOo0.OooOO0O.OooO0O0(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void setVisibility(int i) {
        this.f5348OooO00o.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void setWindowCallback(Window.Callback callback) {
        this.f5358OooOO0o = callback;
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.f5355OooO0oo) {
            return;
        }
        OooOo00(charSequence);
    }

    @Override // androidx.appcompat.widget.o00oO0o
    public final void setIcon(Drawable drawable) {
        this.f5353OooO0o0 = drawable;
        OooOo0o();
    }
}
