package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.o0OOO0o;
import androidx.core.view.ViewCompat;
import java.util.Objects;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p015OooOoO.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends o0OoOo0 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final int f4772Oooooo = OooOo00.OooOO0O.abc_popup_menu_item_layout;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final OooO0OO f4773Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Context f4774Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final OooO0o f4775Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final int f4776OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f4777OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final boolean f4778OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int f4779OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final MenuPopupWindow f4780OoooOO0;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4782OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public View f4783OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public View f4784OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public OooOOO0.OooO00o f4785OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public ViewTreeObserver f4786Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public boolean f4787Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public boolean f4788OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f4789OooooOO;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public boolean f4791Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final OooO00o f4792o000oOoO = new OooO00o();

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final OooO0O0 f4781OoooOOO = new OooO0O0();

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f4790OooooOo = 0;

    public class OooO00o implements ViewTreeObserver.OnGlobalLayoutListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (OooOOOO.this.OooO0O0()) {
                OooOOOO oooOOOO = OooOOOO.this;
                if (oooOOOO.f4780OoooOO0.f5042Ooooooo) {
                    return;
                }
                View view = oooOOOO.f4784OoooOoO;
                if (view == null || !view.isShown()) {
                    OooOOOO.this.dismiss();
                } else {
                    OooOOOO.this.f4780OoooOO0.OooO00o();
                }
            }
        }
    }

    public class OooO0O0 implements View.OnAttachStateChangeListener {
        public OooO0O0() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = OooOOOO.this.f4786Ooooo00;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    OooOOOO.this.f4786Ooooo00 = view.getViewTreeObserver();
                }
                OooOOOO oooOOOO = OooOOOO.this;
                oooOOOO.f4786Ooooo00.removeGlobalOnLayoutListener(oooOOOO.f4792o000oOoO);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public OooOOOO(Context context, OooO0o oooO0o, View view, int i, int i2, boolean z) {
        this.f4774Oooo0oO = context;
        this.f4775Oooo0oo = oooO0o;
        this.f4778OoooO00 = z;
        this.f4773Oooo = new OooO0OO(oooO0o, LayoutInflater.from(context), z, f4772Oooooo);
        this.f4779OoooO0O = i;
        this.f4776OoooO = i2;
        Resources resources = context.getResources();
        this.f4777OoooO0 = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(OooOo00.OooO0o.abc_config_prefDialogWidth));
        this.f4783OoooOo0 = view;
        this.f4780OoooOO0 = new MenuPopupWindow(context, i, i2);
        oooO0o.OooO0OO(this, context);
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO(Parcelable parcelable) {
    }

    @Override // p015OooOoO.o00Oo0
    public final void OooO00o() {
        View view;
        boolean z = false;
        if (OooO0O0()) {
            z = true;
        } else if (!this.f4787Ooooo0o && (view = this.f4783OoooOo0) != null) {
            this.f4784OoooOoO = view;
            this.f4780OoooOO0.OooOo0(this);
            MenuPopupWindow menuPopupWindow = this.f4780OoooOO0;
            menuPopupWindow.f5034Ooooo00 = this;
            menuPopupWindow.OooOo00();
            View view2 = this.f4784OoooOoO;
            boolean z2 = this.f4786Ooooo00 == null;
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            this.f4786Ooooo00 = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4792o000oOoO);
            }
            view2.addOnAttachStateChangeListener(this.f4781OoooOOO);
            MenuPopupWindow menuPopupWindow2 = this.f4780OoooOO0;
            menuPopupWindow2.f5033OoooOoo = view2;
            menuPopupWindow2.f5030OoooOOo = this.f4790OooooOo;
            if (!this.f4788OooooO0) {
                this.f4789OooooOO = o0OoOo0.OooOOOO(this.f4773Oooo, this.f4774Oooo0oO, this.f4777OoooO0);
                this.f4788OooooO0 = true;
            }
            this.f4780OoooOO0.OooOOo(this.f4789OooooOO);
            this.f4780OoooOO0.OooOOoo();
            MenuPopupWindow menuPopupWindow3 = this.f4780OoooOO0;
            Rect rect = this.f297Oooo0o;
            Objects.requireNonNull(menuPopupWindow3);
            menuPopupWindow3.f5041OoooooO = rect != null ? new Rect(rect) : null;
            this.f4780OoooOO0.OooO00o();
            o0OOO0o o0ooo0o2 = this.f4780OoooOO0.f5023Oooo0oo;
            o0ooo0o2.setOnKeyListener(this);
            if (this.f4791Oooooo0 && this.f4775Oooo0oo.f4718OooOOO0 != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f4774Oooo0oO).inflate(OooOo00.OooOO0O.abc_popup_menu_header_item_layout, (ViewGroup) o0ooo0o2, false);
                TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                if (textView != null) {
                    textView.setText(this.f4775Oooo0oo.f4718OooOOO0);
                }
                frameLayout.setEnabled(false);
                o0ooo0o2.addHeaderView(frameLayout, null, false);
            }
            this.f4780OoooOO0.OooOOOo(this.f4773Oooo);
            this.f4780OoooOO0.OooO00o();
            z = true;
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // p015OooOoO.o00Oo0
    public final boolean OooO0O0() {
        return !this.f4787Ooooo0o && this.f4780OoooOO0.OooO0O0();
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0OO(OooO0o oooO0o, boolean z) {
        if (oooO0o != this.f4775Oooo0oo) {
            return;
        }
        dismiss();
        OooOOO0.OooO00o oooO00o = this.f4785OoooOoo;
        if (oooO00o != null) {
            oooO00o.OooO0OO(oooO0o, z);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0Oo(boolean z) {
        this.f4788OooooO0 = false;
        OooO0OO oooO0OO = this.f4773Oooo;
        if (oooO0OO != null) {
            oooO0OO.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final void OooO0o(OooOOO0.OooO00o oooO00o) {
        this.f4785OoooOoo = oooO00o;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooO0o0() {
        return false;
    }

    @Override // p015OooOoO.o00Oo0
    public final ListView OooOO0() {
        return this.f4780OoooOO0.f5023Oooo0oo;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final boolean OooOO0O(OooOo00 oooOo00) {
        boolean z;
        if (oooOo00.hasVisibleItems()) {
            OooOO0O oooOO0O = new OooOO0O(this.f4774Oooo0oO, oooOo00, this.f4784OoooOoO, this.f4778OoooO00, this.f4779OoooO0O, this.f4776OoooO);
            oooOO0O.OooO0Oo(this.f4785OoooOoo);
            boolean zOooOo0o = o0OoOo0.OooOo0o(oooOo00);
            oooOO0O.f4767OooO0oo = zOooOo0o;
            o0OoOo0 o0oooo1 = oooOO0O.f4768OooOO0;
            if (o0oooo1 != null) {
                o0oooo1.OooOOo0(zOooOo0o);
            }
            oooOO0O.f4769OooOO0O = this.f4782OoooOOo;
            this.f4782OoooOOo = null;
            this.f4775Oooo0oo.OooO0Oo(false);
            MenuPopupWindow menuPopupWindow = this.f4780OoooOO0;
            int width = menuPopupWindow.f5025OoooO0;
            int i = !menuPopupWindow.f5028OoooOO0 ? 0 : menuPopupWindow.f5027OoooO0O;
            int i2 = this.f4790OooooOo;
            View view = this.f4783OoooOo0;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if ((Gravity.getAbsoluteGravity(i2, ViewCompat.OooO.OooO0Oo(view)) & 7) == 5) {
                width += this.f4783OoooOo0.getWidth();
            }
            if (oooOO0O.OooO0O0()) {
                z = true;
            } else if (oooOO0O.f4764OooO0o == null) {
                z = false;
            } else {
                oooOO0O.OooO0o0(width, i, true, true);
                z = true;
            }
            if (z) {
                OooOOO0.OooO00o oooO00o = this.f4785OoooOoo;
                if (oooO00o != null) {
                    oooO00o.OooO0Oo(oooOo00);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO0
    public final Parcelable OooOO0o() {
        return null;
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOOO(OooO0o oooO0o) {
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOOOo(View view) {
        this.f4783OoooOo0 = view;
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOOo(int i) {
        this.f4790OooooOo = i;
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOOo0(boolean z) {
        this.f4773Oooo.f4701Oooo0oo = z;
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOOoo(int i) {
        this.f4780OoooOO0.f5025OoooO0 = i;
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOo0(boolean z) {
        this.f4791Oooooo0 = z;
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOo00(PopupWindow.OnDismissListener onDismissListener) {
        this.f4782OoooOOo = onDismissListener;
    }

    @Override // p015OooOoO.o0OoOo0
    public final void OooOo0O(int i) {
        this.f4780OoooOO0.OooOO0o(i);
    }

    @Override // p015OooOoO.o00Oo0
    public final void dismiss() {
        if (OooO0O0()) {
            this.f4780OoooOO0.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4787Ooooo0o = true;
        this.f4775Oooo0oo.OooO0Oo(true);
        ViewTreeObserver viewTreeObserver = this.f4786Ooooo00;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4786Ooooo00 = this.f4784OoooOoO.getViewTreeObserver();
            }
            this.f4786Ooooo00.removeGlobalOnLayoutListener(this.f4792o000oOoO);
            this.f4786Ooooo00 = null;
        }
        this.f4784OoooOoO.removeOnAttachStateChangeListener(this.f4781OoooOOO);
        PopupWindow.OnDismissListener onDismissListener = this.f4782OoooOOo;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }
}
