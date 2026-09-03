package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class OooOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooOOO.OooO00o f2654OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f2655OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO f2656OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f2657OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f2658OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public View f2659OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f2660OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f2661OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f2662OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public p018OooOoo0.OooOo00 f2663OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2664OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO00o f2665OooOO0o;

    public class OooO00o implements PopupWindow.OnDismissListener {
        public OooO00o() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            OooOOO0.this.OooO0OO();
        }
    }

    @RequiresApi(17)
    public static class OooO0O0 {
        @DoNotInline
        public static void OooO00o(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public OooOOO0(@NonNull Context context, @NonNull OooO oooO, @NonNull View view, boolean z, @AttrRes int i) {
        this(i, 0, context, view, oooO, z);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final p018OooOoo0.OooOo00 OooO00o() {
        p018OooOoo0.OooOo00 oooOo00;
        if (this.f2663OooOO0 == null) {
            Context context = this.f2655OooO00o;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            OooO0O0.OooO00o(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(p012OooOo0O.OooOo00.abc_cascading_menus_min_smallest_width)) {
                oooOo00 = new CascadingMenuPopup(this.f2658OooO0Oo, this.f2660OooO0o0, this.f2655OooO00o, this.f2659OooO0o, this.f2657OooO0OO);
            } else {
                oooOo00 = new OooOo00(this.f2658OooO0Oo, this.f2660OooO0o0, this.f2655OooO00o, this.f2659OooO0o, this.f2656OooO0O0, this.f2657OooO0OO);
            }
            oooOo00.OooOO0o(this.f2656OooO0O0);
            oooOo00.OooOOoo(this.f2665OooOO0o);
            oooOo00.OooOOOO(this.f2659OooO0o);
            oooOo00.OooO0OO(this.f2654OooO);
            oooOo00.OooOOOo(this.f2662OooO0oo);
            oooOo00.OooOOo0(this.f2661OooO0oO);
            this.f2663OooOO0 = oooOo00;
        }
        return this.f2663OooOO0;
    }

    public final boolean OooO0O0() {
        p018OooOoo0.OooOo00 oooOo00 = this.f2663OooOO0;
        return oooOo00 != null && oooOo00.OooO00o();
    }

    public void OooO0OO() {
        this.f2663OooOO0 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2664OooOO0O;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void OooO0Oo(int i, int i2, boolean z, boolean z2) {
        p018OooOoo0.OooOo00 oooOo00OooO00o = OooO00o();
        oooOo00OooO00o.OooOo00(z2);
        if (z) {
            int i3 = this.f2661OooO0oO;
            View view = this.f2659OooO0o;
            WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
            if ((Gravity.getAbsoluteGravity(i3, ViewCompat.OooO.OooO0Oo(view)) & 7) == 5) {
                i -= this.f2659OooO0o.getWidth();
            }
            oooOo00OooO00o.OooOOo(i);
            oooOo00OooO00o.OooOo0(i2);
            int i4 = (int) ((this.f2655OooO00o.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            oooOo00OooO00o.f387OooO0Oo = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        oooOo00OooO00o.show();
    }

    public OooOOO0(@AttrRes int i, @StyleRes int i2, @NonNull Context context, @NonNull View view, @NonNull OooO oooO, boolean z) {
        this.f2661OooO0oO = 8388611;
        this.f2665OooOO0o = new OooO00o();
        this.f2655OooO00o = context;
        this.f2656OooO0O0 = oooO;
        this.f2659OooO0o = view;
        this.f2657OooO0OO = z;
        this.f2658OooO0Oo = i;
        this.f2660OooO0o0 = i2;
    }
}
