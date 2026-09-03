package p027Oooo0o;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.oO0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o000000 extends Lambda implements Function0<o000000O> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Function1<o000, Unit>> f1791Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<IntRange> f1792Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000000(oO0Oo<? extends Function1<? super o000, Unit>> oo0oo, o0O00OO<IntRange> o0o00oo2) {
        super(0);
        this.f1791Oooo0o = oo0oo;
        this.f1792Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o000000O invoke() {
        o000O000 o000o001 = new o000O000();
        this.f1791Oooo0o.getValue().invoke(o000o001);
        return new o000000O(o000o001.f1860OooO0O0, CollectionsKt.emptyList(), this.f1792Oooo0oO.getValue());
    }
}
