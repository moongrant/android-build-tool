package p139o00OOOo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p054o00000oo.oo0oOO0;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOooO0;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f31742Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<oo0oOO0> f31743Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f31744Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f31745Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(o0O00OO<oo0oOO0> o0o00oo2, int i, int i2, int i3) {
        super(2);
        this.f31743Oooo0o = o0o00oo2;
        this.f31744Oooo0oO = i;
        this.f31745Oooo0oo = i2;
        this.f31742Oooo = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        o0OOooO0.OooO00o(this.f31743Oooo0o, this.f31744Oooo0oO, this.f31745Oooo0oo, ooo00o, this.f31742Oooo | 1);
        return Unit.INSTANCE;
    }
}
