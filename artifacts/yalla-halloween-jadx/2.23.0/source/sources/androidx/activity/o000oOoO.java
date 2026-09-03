package androidx.activity;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO extends Oooo000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Oooo000, Unit> f2197OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000oOoO(boolean z, Function1<? super Oooo000, Unit> function1) {
        super(z);
        this.f2197OooO0Oo = function1;
    }

    @Override // androidx.activity.Oooo000
    public final void OooO00o() {
        this.f2197OooO0Oo.invoke(this);
    }
}
