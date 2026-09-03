package p032OoooO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ p034OoooO0O.o0000oo f3030Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f3031Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f3032Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(p034OoooO0O.o0000oo o0000ooVar, boolean z, int i) {
        super(2);
        this.f3030Oooo0o = o0000ooVar;
        this.f3031Oooo0oO = z;
        this.f3032Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        o00oO0o.OooO0Oo(this.f3030Oooo0o, this.f3031Oooo0oO, ooo00o, this.f3032Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
