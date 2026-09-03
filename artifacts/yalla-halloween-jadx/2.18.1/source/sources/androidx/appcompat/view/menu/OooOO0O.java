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
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import p015OooOoO.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class OooOO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooOOO0.OooO00o f4759OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f4760OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0o f4761OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f4762OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f4763OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public View f4764OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f4765OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f4767OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public o0OoOo0 f4768OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4769OooOO0O;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f4766OooO0oO = 8388611;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooO00o f4770OooOO0o = new OooO00o();

    public class OooO00o implements PopupWindow.OnDismissListener {
        public OooO00o() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            OooOO0O.this.OooO0OO();
        }
    }

    @RequiresApi(17)
    public static class OooO0O0 {
        @DoNotInline
        public static void OooO00o(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public OooOO0O(@NonNull Context context, @NonNull OooO0o oooO0o, @NonNull View view, boolean z, @AttrRes int i, @StyleRes int i2) {
        this.f4760OooO00o = context;
        this.f4761OooO0O0 = oooO0o;
        this.f4764OooO0o = view;
        this.f4762OooO0OO = z;
        this.f4763OooO0Oo = i;
        this.f4765OooO0o0 = i2;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final o0OoOo0 OooO00o() {
        if (this.f4768OooOO0 == null) {
            Display defaultDisplay = ((WindowManager) this.f4760OooO00o.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            OooO0O0.OooO00o(defaultDisplay, point);
            o0OoOo0 cascadingMenuPopup = Math.min(point.x, point.y) >= this.f4760OooO00o.getResources().getDimensionPixelSize(OooOo00.OooO0o.abc_cascading_menus_min_smallest_width) ? new CascadingMenuPopup(this.f4760OooO00o, this.f4764OooO0o, this.f4763OooO0Oo, this.f4765OooO0o0, this.f4762OooO0OO) : new OooOOOO(this.f4760OooO00o, this.f4761OooO0O0, this.f4764OooO0o, this.f4763OooO0Oo, this.f4765OooO0o0, this.f4762OooO0OO);
            cascadingMenuPopup.OooOOO(this.f4761OooO0O0);
            cascadingMenuPopup.OooOo00(this.f4770OooOO0o);
            cascadingMenuPopup.OooOOOo(this.f4764OooO0o);
            cascadingMenuPopup.OooO0o(this.f4759OooO);
            cascadingMenuPopup.OooOOo0(this.f4767OooO0oo);
            cascadingMenuPopup.OooOOo(this.f4766OooO0oO);
            this.f4768OooOO0 = cascadingMenuPopup;
        }
        return this.f4768OooOO0;
    }

    public final boolean OooO0O0() {
        o0OoOo0 o0oooo1 = this.f4768OooOO0;
        return o0oooo1 != null && o0oooo1.OooO0O0();
    }

    public void OooO0OO() {
        this.f4768OooOO0 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f4769OooOO0O;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void OooO0Oo(@Nullable OooOOO0.OooO00o oooO00o) {
        this.f4759OooO = oooO00o;
        o0OoOo0 o0oooo1 = this.f4768OooOO0;
        if (o0oooo1 != null) {
            o0oooo1.OooO0o(oooO00o);
        }
    }

    public final void OooO0o0(int i, int i2, boolean z, boolean z2) {
        o0OoOo0 o0oooo0OooO00o = OooO00o();
        o0oooo0OooO00o.OooOo0(z2);
        if (z) {
            int i3 = this.f4766OooO0oO;
            View view = this.f4764OooO0o;
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if ((Gravity.getAbsoluteGravity(i3, ViewCompat.OooO.OooO0Oo(view)) & 7) == 5) {
                i -= this.f4764OooO0o.getWidth();
            }
            o0oooo0OooO00o.OooOOoo(i);
            o0oooo0OooO00o.OooOo0O(i2);
            int i4 = (int) ((this.f4760OooO00o.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            o0oooo0OooO00o.f297Oooo0o = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        o0oooo0OooO00o.OooO00o();
    }
}
