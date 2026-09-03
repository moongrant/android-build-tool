package p139o00OOOo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f31765Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function2<String, o00000O0, Unit> f31766Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f31767Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0000oo(o00000O0 o00000o1, Function2<? super String, ? super o00000O0, Unit> function2, int i) {
        super(2);
        this.f31765Oooo0o = o00000o1;
        this.f31766Oooo0oO = function2;
        this.f31767Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        o0000O0.OooO00o(this.f31765Oooo0o, this.f31766Oooo0oO, ooo00o, this.f31767Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
