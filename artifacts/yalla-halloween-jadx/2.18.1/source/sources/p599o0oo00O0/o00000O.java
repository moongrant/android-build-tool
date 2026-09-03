package p599o0oo00O0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000O extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f47925Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000000O f47926Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f47927Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f47928Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O(o000000O o000000o2, long j, int i, int i2) {
        super(2);
        this.f47926Oooo0o = o000000o2;
        this.f47927Oooo0oO = j;
        this.f47928Oooo0oo = i;
        this.f47925Oooo = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        o000000O.OooO0O0(this.f47926Oooo0o, this.f47927Oooo0oO, this.f47928Oooo0oo, ooo00o, this.f47925Oooo | 1);
        return Unit.INSTANCE;
    }
}
