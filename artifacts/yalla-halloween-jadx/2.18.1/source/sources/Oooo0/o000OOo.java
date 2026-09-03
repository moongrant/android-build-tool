package Oooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes.dex */
public final class o000OOo extends Lambda implements Function1<o00000O0.o0OO00O, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ String f594Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00000O0.OooOO0O f595Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ String f596Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f597Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f598OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ boolean f599OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OOo(o00000O0.OooOO0O oooOO0O, String str, Function0<Unit> function0, String str2, boolean z, Function0<Unit> function1) {
        super(1);
        this.f595Oooo0o = oooOO0O;
        this.f596Oooo0oO = str;
        this.f597Oooo0oo = function0;
        this.f594Oooo = str2;
        this.f599OoooO00 = z;
        this.f598OoooO0 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00000O0.o0OO00O o0oo00o2) {
        o00000O0.o0OO00O semantics = o0oo00o2;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        o00000O0.OooOO0O oooOO0O = this.f595Oooo0o;
        if (oooOO0O != null) {
            o00000O0.o0ooOOo.OooOO0(semantics, oooOO0O.f26913OooO00o);
        }
        String str = this.f596Oooo0oO;
        oo0o0Oo oo0o0oo = new oo0o0Oo(this.f598OoooO0);
        KProperty<Object>[] kPropertyArr = o00000O0.o0ooOOo.f26961OooO00o;
        Intrinsics.checkNotNullParameter(semantics, "<this>");
        o00000O0.OooOOO oooOOO = o00000O0.OooOOO.f26915OooO00o;
        semantics.OooO00o(o00000O0.OooOOO.f26917OooO0OO, new o00000O0.OooO00o(str, oo0o0oo));
        Function0<Unit> function0 = this.f597Oooo0oo;
        if (function0 != null) {
            String str2 = this.f594Oooo;
            o0O0O00 o0o0o00 = new o0O0O00(function0);
            Intrinsics.checkNotNullParameter(semantics, "<this>");
            semantics.OooO00o(o00000O0.OooOOO.f26918OooO0Oo, new o00000O0.OooO00o(str2, o0o0o00));
        }
        if (!this.f599OoooO00) {
            o00000O0.o0ooOOo.OooO00o(semantics);
        }
        return Unit.INSTANCE;
    }
}
