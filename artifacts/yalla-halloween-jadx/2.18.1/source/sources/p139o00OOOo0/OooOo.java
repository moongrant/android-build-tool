package p139o00OOOo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ boolean f31724Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Long> f31725Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f31726Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f31727Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ int f31728OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(o0O00OO<Long> o0o00oo2, Function0<Unit> function0, Function0<Unit> function1, boolean z, int i) {
        super(2);
        this.f31725Oooo0o = o0o00oo2;
        this.f31726Oooo0oO = function0;
        this.f31727Oooo0oo = function1;
        this.f31724Oooo = z;
        this.f31728OoooO00 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        Oooo000.OooO0O0(this.f31725Oooo0o, this.f31726Oooo0oO, this.f31727Oooo0oo, this.f31724Oooo, ooo00o, this.f31728OoooO00 | 1);
        return Unit.INSTANCE;
    }
}
