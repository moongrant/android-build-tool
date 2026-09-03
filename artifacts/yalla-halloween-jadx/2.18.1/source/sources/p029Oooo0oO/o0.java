package p029Oooo0oO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import o00000O0.OooO0O0;
import o00000O0.OooOOO0;
import o00000O0.o0OO00O;
import o00000O0.o0ooOOo;
import o00000O0.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class o0 extends Lambda implements Function1<o0OO00O, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function2<Float, Float, Boolean> f2241Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Function1<Object, Integer> f2242Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f2243Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f2244Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0 f2245OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Function1<Integer, Boolean> f2246OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(Function1<Object, Integer> function1, boolean z, OooOOO0 oooOOO0, Function2<? super Float, ? super Float, Boolean> function2, Function1<? super Integer, Boolean> function3, OooO0O0 oooO0O0) {
        super(1);
        this.f2242Oooo0o = function1;
        this.f2243Oooo0oO = z;
        this.f2244Oooo0oo = oooOOO0;
        this.f2241Oooo = function2;
        this.f2246OoooO00 = function3;
        this.f2245OoooO0 = oooO0O0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0OO00O o0oo00o2) {
        o0OO00O semantics = o0oo00o2;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        Function1<Object, Integer> mapping = this.f2242Oooo0o;
        KProperty<Object>[] kPropertyArr = o0ooOOo.f26961OooO00o;
        Intrinsics.checkNotNullParameter(semantics, "<this>");
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        oo000o oo000oVar = oo000o.f26973OooO00o;
        semantics.OooO00o(oo000o.f26999OooOoo0, mapping);
        if (this.f2243Oooo0oO) {
            o0ooOOo.OooOO0O(semantics, this.f2244Oooo0oo);
        } else {
            o0ooOOo.OooO0oo(semantics, this.f2244Oooo0oo);
        }
        Function2<Float, Float, Boolean> function2 = this.f2241Oooo;
        if (function2 != null) {
            o0ooOOo.OooO0Oo(semantics, function2);
        }
        Function1<Integer, Boolean> function1 = this.f2246OoooO00;
        if (function1 != null) {
            o0ooOOo.OooO0o0(semantics, function1);
        }
        o0ooOOo.OooO0o(semantics, this.f2245OoooO0);
        return Unit.INSTANCE;
    }
}
