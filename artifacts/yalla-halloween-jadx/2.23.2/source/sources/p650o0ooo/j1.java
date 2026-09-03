package p650o0ooo;

import android.view.LayoutInflater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.o0O00O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class j1 extends Lambda implements Function0<o0O00O0o> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ k1 f58311OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var) {
        super(0);
        this.f58311OooO0Oo = k1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o0O00O0o invoke() {
        k1 k1Var = this.f58311OooO0Oo;
        o0O00O0o o0o00o0oInflate = o0O00O0o.inflate(LayoutInflater.from(k1Var.f58507OooO0Oo), k1Var.f58508OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(o0o00o0oInflate, "inflate(...)");
        return o0o00o0oInflate;
    }
}
