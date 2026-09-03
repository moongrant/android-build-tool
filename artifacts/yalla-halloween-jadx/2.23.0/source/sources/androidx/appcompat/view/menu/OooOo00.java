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
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.o000000O;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.WeakHashMap;
import p012OooOo0O.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends p018OooOoo0.OooOo00 implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final int f2671OooOoO0 = Oooo0.abc_popup_menu_item_layout;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f2672OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO f2673OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Context f2674OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0o f2675OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f2676OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f2677OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f2678OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final MenuPopupWindow f2679OooOO0o;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2682OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public View f2683OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public OooOOO.OooO00o f2684OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public View f2685OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public ViewTreeObserver f2686OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f2687OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f2688OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f2689OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f2690OooOo0O;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final OooO00o f2681OooOOO0 = new OooO00o();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final OooO0O0 f2680OooOOO = new OooO0O0();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f2691OooOo0o = 0;

    public class OooO00o implements ViewTreeObserver.OnGlobalLayoutListener {
        public OooO00o() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            OooOo00 oooOo00 = OooOo00.this;
            if (!oooOo00.OooO00o() || oooOo00.f2679OooOO0o.f2937OooOoo0) {
                return;
            }
            View view = oooOo00.f2685OooOOo0;
            if (view == null || !view.isShown()) {
                oooOo00.dismiss();
            } else {
                oooOo00.f2679OooOO0o.show();
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
            OooOo00 oooOo00 = OooOo00.this;
            ViewTreeObserver viewTreeObserver = oooOo00.f2686OooOOoo;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    oooOo00.f2686OooOOoo = view.getViewTreeObserver();
                }
                oooOo00.f2686OooOOoo.removeGlobalOnLayoutListener(oooOo00.f2681OooOOO0);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public OooOo00(int i, int i2, Context context, View view, OooO oooO, boolean z) {
        this.f2674OooO0o0 = context;
        this.f2673OooO0o = oooO;
        this.f2676OooO0oo = z;
        this.f2675OooO0oO = new OooO0o(oooO, LayoutInflater.from(context), z, f2671OooOoO0);
        this.f2677OooOO0 = i;
        this.f2678OooOO0O = i2;
        Resources resources = context.getResources();
        this.f2672OooO = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p012OooOo0O.OooOo00.abc_config_prefDialogWidth));
        this.f2683OooOOOo = view;
        this.f2679OooOO0o = new MenuPopupWindow(context, i, i2);
        oooO.OooO0O0(this, context);
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO(boolean z) {
        this.f2688OooOo0 = false;
        OooO0o oooO0o = this.f2675OooO0oO;
        if (oooO0o != null) {
            oooO0o.notifyDataSetChanged();
        }
    }

    @Override // p018OooOoo0.Oooo000
    public final boolean OooO00o() {
        return !this.f2689OooOo00 && this.f2679OooOO0o.OooO00o();
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0O0(OooO oooO, boolean z) {
        if (oooO != this.f2673OooO0o) {
            return;
        }
        dismiss();
        OooOOO.OooO00o oooO00o = this.f2684OooOOo;
        if (oooO00o != null) {
            oooO00o.OooO0O0(oooO, z);
        }
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0OO(OooOOO.OooO00o oooO00o) {
        this.f2684OooOOo = oooO00o;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooO0o(OooOo oooOo) {
        boolean z;
        if (oooOo.hasVisibleItems()) {
            OooOOO0 oooOOO0 = new OooOOO0(this.f2677OooOO0, this.f2678OooOO0O, this.f2674OooO0o0, this.f2685OooOOo0, oooOo, this.f2676OooO0oo);
            OooOOO.OooO00o oooO00o = this.f2684OooOOo;
            oooOOO0.f2656OooO = oooO00o;
            p018OooOoo0.OooOo00 oooOo00 = oooOOO0.f2665OooOO0;
            if (oooOo00 != null) {
                oooOo00.OooO0OO(oooO00o);
            }
            boolean zOooOo0O = p018OooOoo0.OooOo00.OooOo0O(oooOo);
            oooOOO0.f2664OooO0oo = zOooOo0O;
            p018OooOoo0.OooOo00 oooOo01 = oooOOO0.f2665OooOO0;
            if (oooOo01 != null) {
                oooOo01.OooOOOo(zOooOo0O);
            }
            oooOOO0.f2666OooOO0O = this.f2682OooOOOO;
            this.f2682OooOOOO = null;
            this.f2673OooO0o.OooO0OO(false);
            MenuPopupWindow menuPopupWindow = this.f2679OooOO0o;
            int width = menuPopupWindow.f2912OooO;
            int iOooOO0O = menuPopupWindow.OooOO0O();
            int i = this.f2691OooOo0o;
            View view = this.f2683OooOOOo;
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if ((Gravity.getAbsoluteGravity(i, ViewCompat.OooO.OooO0Oo(view)) & 7) == 5) {
                width += this.f2683OooOOOo.getWidth();
            }
            if (oooOOO0.OooO0O0()) {
                z = true;
            } else if (oooOOO0.f2661OooO0o == null) {
                z = false;
            } else {
                oooOOO0.OooO0Oo(width, iOooOO0O, true, true);
                z = true;
            }
            if (z) {
                OooOOO.OooO00o oooO00o2 = this.f2684OooOOo;
                if (oooO00o2 != null) {
                    oooO00o2.OooO0OO(oooOo);
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final void OooO0o0(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final Parcelable OooO0oO() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.OooOOO
    public final boolean OooOO0() {
        return false;
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOO0o(OooO oooO) {
    }

    @Override // p018OooOoo0.Oooo000
    public final o000000O OooOOO() {
        return this.f2679OooOO0o.f2914OooO0o;
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOOOO(View view) {
        this.f2683OooOOOo = view;
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOOOo(boolean z) {
        this.f2675OooO0oO.f2619OooO0o = z;
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOOo(int i) {
        this.f2679OooOO0o.f2912OooO = i;
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOOo0(int i) {
        this.f2691OooOo0o = i;
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOOoo(PopupWindow.OnDismissListener onDismissListener) {
        this.f2682OooOOOO = onDismissListener;
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOo0(int i) {
        this.f2679OooOO0o.OooO0oo(i);
    }

    @Override // p018OooOoo0.OooOo00
    public final void OooOo00(boolean z) {
        this.f2687OooOo = z;
    }

    @Override // p018OooOoo0.Oooo000
    public final void dismiss() {
        if (OooO00o()) {
            this.f2679OooOO0o.dismiss();
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2689OooOo00 = true;
        this.f2673OooO0o.OooO0OO(true);
        ViewTreeObserver viewTreeObserver = this.f2686OooOOoo;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2686OooOOoo = this.f2685OooOOo0.getViewTreeObserver();
            }
            this.f2686OooOOoo.removeGlobalOnLayoutListener(this.f2681OooOOO0);
            this.f2686OooOOoo = null;
        }
        this.f2685OooOOo0.removeOnAttachStateChangeListener(this.f2680OooOOO);
        PopupWindow.OnDismissListener onDismissListener = this.f2682OooOOOO;
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p018OooOoo0.Oooo000
    public final void show() {
        View view;
        boolean z = true;
        if (!OooO00o()) {
            if (this.f2689OooOo00 || (view = this.f2683OooOOOo) == null) {
                z = false;
            } else {
                this.f2685OooOOo0 = view;
                MenuPopupWindow menuPopupWindow = this.f2679OooOO0o;
                menuPopupWindow.f2936OooOoo.setOnDismissListener(this);
                menuPopupWindow.f2927OooOOoo = this;
                menuPopupWindow.f2937OooOoo0 = true;
                PopupWindow popupWindow = menuPopupWindow.f2936OooOoo;
                popupWindow.setFocusable(true);
                View view2 = this.f2685OooOOo0;
                boolean z2 = this.f2686OooOOoo == null;
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.f2686OooOOoo = viewTreeObserver;
                if (z2) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f2681OooOOO0);
                }
                view2.addOnAttachStateChangeListener(this.f2680OooOOO);
                menuPopupWindow.f2925OooOOo = view2;
                menuPopupWindow.f2923OooOOOO = this.f2691OooOo0o;
                boolean z3 = this.f2688OooOo0;
                Context context = this.f2674OooO0o0;
                OooO0o oooO0o = this.f2675OooO0oO;
                if (!z3) {
                    this.f2690OooOo0O = p018OooOoo0.OooOo00.OooOOO0(oooO0o, context, this.f2672OooO);
                    this.f2688OooOo0 = true;
                }
                menuPopupWindow.OooOOo0(this.f2690OooOo0O);
                popupWindow.setInputMethodMode(2);
                Rect rect = this.f388OooO0Oo;
                menuPopupWindow.f2935OooOoOO = rect != null ? new Rect(rect) : null;
                menuPopupWindow.show();
                o000000O o000000o2 = menuPopupWindow.f2914OooO0o;
                o000000o2.setOnKeyListener(this);
                if (this.f2687OooOo) {
                    OooO oooO = this.f2673OooO0o;
                    if (oooO.f2584OooOOO0 != null) {
                        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(Oooo0.abc_popup_menu_header_item_layout, (ViewGroup) o000000o2, false);
                        TextView textView = (TextView) frameLayout.findViewById(R.id.title);
                        if (textView != null) {
                            textView.setText(oooO.f2584OooOOO0);
                        }
                        frameLayout.setEnabled(false);
                        o000000o2.addHeaderView(frameLayout, null, false);
                    }
                }
                menuPopupWindow.OooOO0o(oooO0o);
                menuPopupWindow.show();
            }
        }
        if (!z) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }
}
