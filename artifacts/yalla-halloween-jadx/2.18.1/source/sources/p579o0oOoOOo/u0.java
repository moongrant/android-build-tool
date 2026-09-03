package p579o0oOoOOo;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f46328Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ s0 f46329Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f46330Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f46331Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ int f46332OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f46333OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(s0 s0Var, int i, String str, boolean z, Function0<Unit> function0, int i2) {
        super(2);
        this.f46329Oooo0o = s0Var;
        this.f46330Oooo0oO = i;
        this.f46331Oooo0oo = str;
        this.f46328Oooo = z;
        this.f46333OoooO00 = function0;
        this.f46332OoooO0 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        s0.OooO0O0(this.f46329Oooo0o, this.f46330Oooo0oO, this.f46331Oooo0oo, this.f46328Oooo, this.f46333OoooO00, ooo00o, this.f46332OoooO0 | 1);
        return Unit.INSTANCE;
    }
}
