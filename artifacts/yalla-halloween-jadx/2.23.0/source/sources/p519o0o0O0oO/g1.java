package p519o0o0O0oO;

import android.view.LayoutInflater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p641o0ooOOOO.s1;

/* JADX INFO: loaded from: classes4.dex */
public final class g1 extends Lambda implements Function0<s1> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ h1 f52267OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var) {
        super(0);
        this.f52267OooO0Oo = h1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final s1 invoke() {
        h1 h1Var = this.f52267OooO0Oo;
        s1 s1VarInflate = s1.inflate(LayoutInflater.from(h1Var.f52532OooO0Oo), h1Var.f52533OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(s1VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
        return s1VarInflate;
    }
}
