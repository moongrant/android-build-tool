package p519o0o0O0oO;

import android.view.LayoutInflater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p641o0ooOOOO.i1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOo0O0 extends Lambda implements Function0<i1> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0o0 f52779OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOo0O0(o0O0o0 o0o0o0) {
        super(0);
        this.f52779OooO0Oo = o0o0o0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final i1 invoke() {
        o0O0o0 o0o0o0 = this.f52779OooO0Oo;
        i1 i1VarInflate = i1.inflate(LayoutInflater.from(o0o0o0.f52672OooOO0O), o0o0o0.f52533OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(i1VarInflate, "inflate(LayoutInflater.f…ty), getRootView(), true)");
        return i1VarInflate;
    }
}
