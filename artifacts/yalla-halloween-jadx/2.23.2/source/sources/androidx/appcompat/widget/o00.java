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
public final class o00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f3184OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final View f3185OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TextView f3186OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WindowManager.LayoutParams f3187OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int[] f3188OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Rect f3189OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f3190OooO0oO;

    public o00(@NonNull Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f3187OooO0Oo = layoutParams;
        this.f3189OooO0o0 = new Rect();
        this.f3188OooO0o = new int[2];
        this.f3190OooO0oO = new int[2];
        this.f3184OooO00o = context;
        View viewInflate = LayoutInflater.from(context).inflate(p012OooOo0O.Oooo0.abc_tooltip, (ViewGroup) null);
        this.f3185OooO0O0 = viewInflate;
        this.f3186OooO0OO = (TextView) viewInflate.findViewById(p012OooOo0O.Oooo000.message);
        layoutParams.setTitle(o00.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = p012OooOo0O.o0OoOo0.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}
