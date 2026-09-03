package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f5403OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View f5404OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TextView f5405OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WindowManager.LayoutParams f5406OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int[] f5407OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Rect f5408OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f5409OooO0oO;

    public o000Oo0(@NonNull Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f5406OooO0Oo = layoutParams;
        this.f5408OooO0o0 = new Rect();
        this.f5407OooO0o = new int[2];
        this.f5409OooO0oO = new int[2];
        this.f5403OooO00o = context;
        View viewInflate = LayoutInflater.from(context).inflate(OooOo00.OooOO0O.abc_tooltip, (ViewGroup) null);
        this.f5404OooO0O0 = viewInflate;
        this.f5405OooO0OO = (TextView) viewInflate.findViewById(OooOo00.OooOO0.message);
        layoutParams.setTitle(o000Oo0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = OooOo00.OooOOO.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public final void OooO00o() {
        if (this.f5404OooO0O0.getParent() != null) {
            ((WindowManager) this.f5403OooO00o.getSystemService("window")).removeView(this.f5404OooO0O0);
        }
    }
}
