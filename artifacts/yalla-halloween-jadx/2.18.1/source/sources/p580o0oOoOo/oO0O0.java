package p580o0oOoOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO0O00o0 f46559Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f46560Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f46561Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0(oO0O00o0 oo0o00o0, o0O00OO<Boolean> o0o00oo2, int i) {
        super(2);
        this.f46559Oooo0o = oo0o00o0;
        this.f46560Oooo0oO = o0o00oo2;
        this.f46561Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oO0O00o0.OooO0oO(this.f46559Oooo0o, this.f46560Oooo0oO, ooo00o, this.f46561Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
