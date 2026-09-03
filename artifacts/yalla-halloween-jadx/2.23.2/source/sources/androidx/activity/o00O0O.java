package androidx.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<o000oOoO, Unit> f2194OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00O0O(boolean z, Function1<? super o000oOoO, Unit> function1) {
        super(z);
        this.f2194OooO0Oo = function1;
    }

    @Override // androidx.activity.o000oOoO
    public final void OooO00o() {
        this.f2194OooO0Oo.invoke(this);
    }
}
