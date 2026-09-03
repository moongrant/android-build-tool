package com.code.android.util;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p543o0o0OoO0.o0O0o;
import p543o0o0OoO0.oo00oO;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000OO0O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f13442OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f13443OooO0o0;

    public /* synthetic */ o000OO0O(Object obj, int i) {
        this.f13442OooO0Oo = i;
        this.f13443OooO0o0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f13442OooO0Oo;
        Object obj = this.f13443OooO0o0;
        switch (i) {
            case 0:
                Function1 listener = (Function1) obj;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (Math.abs(jCurrentTimeMillis - o000O0Oo.f13434OooO00o) > 500) {
                    o000O0Oo.f13434OooO00o = jCurrentTimeMillis;
                    Intrinsics.checkNotNull(view);
                    listener.invoke(view);
                }
                break;
            default:
                oo00oO.OooO00o this$0 = (oo00oO.OooO00o) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ConstraintLayout layoutBg = this$0.OooOO0().f44462OooO0OO;
                Intrinsics.checkNotNullExpressionValue(layoutBg, "layoutBg");
                com.yalla.yalla.util.permission.OooO00o.OooO0OO(this$0.f54916OooOO0O, PermissionGroupReveal.f32346OooO0o0, null, new o0O0o(this$0, layoutBg));
                break;
        }
    }
}
