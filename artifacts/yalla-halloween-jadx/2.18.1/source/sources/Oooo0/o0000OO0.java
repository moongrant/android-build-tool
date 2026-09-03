package Oooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0000OO0 extends Lambda implements Function1<o00000O0.o0OO00O, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f559Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ p710ooOO.o0000Ooo f560Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(o0O00OO<Boolean> o0o00oo2, p710ooOO.o0000Ooo o0000ooo) {
        super(1);
        this.f559Oooo0o = o0o00oo2;
        this.f560Oooo0oO = o0000ooo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00000O0.o0OO00O o0oo00o2) {
        o00000O0.o0OO00O semantics = o0oo00o2;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        boolean zOooO00o = o000O00O.OooO00o(this.f559Oooo0o);
        KProperty<Object>[] kPropertyArr = o00000O0.o0ooOOo.f26961OooO00o;
        Intrinsics.checkNotNullParameter(semantics, "<this>");
        o00000O0.o0ooOOo.f26963OooO0OO.OooO00o(semantics, o00000O0.o0ooOOo.f26961OooO00o[4], Boolean.valueOf(zOooO00o));
        o0000O o0000o2 = new o0000O(this.f560Oooo0oO, this.f559Oooo0o);
        Intrinsics.checkNotNullParameter(semantics, "<this>");
        o00000O0.OooOOO oooOOO = o00000O0.OooOOO.f26915OooO00o;
        semantics.OooO00o(o00000O0.OooOOO.f26929OooOOOo, new o00000O0.OooO00o(null, o0000o2));
        return Unit.INSTANCE;
    }
}
