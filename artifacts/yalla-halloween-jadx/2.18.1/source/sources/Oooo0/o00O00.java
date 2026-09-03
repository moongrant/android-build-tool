package Oooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00 extends Lambda implements Function1<o0O0O00.Oooo000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<o00O0O.OooO> f615Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(o0O00OO<o00O0O.OooO> o0o00oo2) {
        super(1);
        this.f615Oooo0o = o0o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0O0O00.Oooo000 oooo000) {
        o0O0O00.Oooo000 it = oooo000;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f615Oooo0o.setValue(new o00O0O.OooO(o0O0O00.Oooo0.OooO0o0(it)));
        return Unit.INSTANCE;
    }
}
