package p524o0o0OO0o;

import android.view.LayoutInflater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p641o0ooOOOO.k5;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OO extends Lambda implements Function0<k5> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00 f53497OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OO(o0O00 o0o01) {
        super(0);
        this.f53497OooO0Oo = o0o01;
    }

    @Override // kotlin.jvm.functions.Function0
    public final k5 invoke() {
        o0O00 o0o01 = this.f53497OooO0Oo;
        k5 k5VarInflate = k5.inflate(LayoutInflater.from(o0o01.f52532OooO0Oo), o0o01.f52533OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(k5VarInflate, "inflate(LayoutInflater.f…t), getRootView(), false)");
        return k5VarInflate;
    }
}
