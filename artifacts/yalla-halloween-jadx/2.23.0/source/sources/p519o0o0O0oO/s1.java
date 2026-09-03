package p519o0o0O0oO;

import android.view.LayoutInflater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p641o0ooOOOO.t1;

/* JADX INFO: loaded from: classes4.dex */
public final class s1 extends Lambda implements Function0<t1> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ t1 f53135OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(t1 t1Var) {
        super(0);
        this.f53135OooO0Oo = t1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final t1 invoke() {
        t1 t1Var = this.f53135OooO0Oo;
        t1 t1VarInflate = t1.inflate(LayoutInflater.from(t1Var.f10133OooO00o), t1Var.f10135OooO0OO, false);
        Intrinsics.checkNotNullExpressionValue(t1VarInflate, "inflate(LayoutInflater.f…ontext), rootView, false)");
        return t1VarInflate;
    }
}
