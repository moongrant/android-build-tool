package p650o0ooo;

import android.view.LayoutInflater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.o0O00O;

/* JADX INFO: loaded from: classes4.dex */
public final class v1 extends Lambda implements Function0<o0O00O> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w1 f59180OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(w1 w1Var) {
        super(0);
        this.f59180OooO0Oo = w1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o0O00O invoke() {
        w1 w1Var = this.f59180OooO0Oo;
        o0O00O o0o00oInflate = o0O00O.inflate(LayoutInflater.from(w1Var.f38487OooO00o), w1Var.f38489OooO0OO, false);
        Intrinsics.checkNotNullExpressionValue(o0o00oInflate, "inflate(...)");
        return o0o00oInflate;
    }
}
