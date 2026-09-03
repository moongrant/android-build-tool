package com.yy.yyeva.view;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.SurfaceView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p612o0oo0OoO.r5;
import p618o0oo0o0o.o0oOo0O0;
import p619o0oo0oO.oOo0o0oO;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/yy/yyeva/view/InnerSurfaceView;", "Landroid/view/SurfaceView;", "", "OooO0Oo", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Lo0oo0OoO/r5;", "OooO0o0", "Lo0oo0OoO/r5;", "getPlayerEva", "()Lo0oo0OoO/r5;", "setPlayerEva", "(Lo0oo0OoO/r5;)V", "playerEva", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "yyevac_release"}, k = 1, mv = {1, 8, 0})
public final class InnerSurfaceView extends SurfaceView {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String TAG;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public r5 playerEva;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerSurfaceView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        oOo0o0oO ooo0o0oo;
        r5 r5Var;
        o0oOo0O0 o0ooo0o1;
        r5 r5Var2 = this.playerEva;
        boolean z = false;
        boolean z2 = r5Var2 != null && r5Var2.OooO0O0();
        if (motionEvent != null && (r5Var = this.playerEva) != null && (o0ooo0o1 = r5Var.f57478OooOo) != null) {
            o0ooo0o1.OooO0O0(motionEvent);
        }
        r5 r5Var3 = this.playerEva;
        if (r5Var3 != null && (ooo0o0oo = r5Var3.f57460OooO00o) != null && ooo0o0oo.hasBgImage()) {
            z = true;
        }
        String msg = "isRunning playerEva isRunning：" + z2 + ", isDispatch : false, hasBg: " + z;
        String tag = this.TAG;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (!z2 || z) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public final r5 getPlayerEva() {
        return this.playerEva;
    }

    @NotNull
    public final String getTAG() {
        return this.TAG;
    }

    public final void setPlayerEva(@Nullable r5 r5Var) {
        this.playerEva = r5Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerSurfaceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ InnerSurfaceView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public InnerSurfaceView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.TAG = "InnerSurfaceView";
        setBackgroundResource(R.color.transparent);
        setZOrderOnTop(true);
        getHolder().setFormat(-3);
    }
}
