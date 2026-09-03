package p032OoooO0;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import o00000O.OooO00o;
import o00000O0.o0OO00O;
import o00000O0.o0ooOOo;
import o00000O0.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00 extends Lambda implements Function1<o0OO00O, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f3118Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00O000 f3119Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00(OooO00o oooO00o, o00O000 o00o001) {
        super(1);
        this.f3118Oooo0o = oooO00o;
        this.f3119Oooo0oO = o00o001;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0OO00O o0oo00o2) {
        o0OO00O semantics = o0oo00o2;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        OooO00o value = this.f3118Oooo0o;
        KProperty<Object>[] kPropertyArr = o0ooOOo.f26961OooO00o;
        Intrinsics.checkNotNullParameter(semantics, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        oo000o oo000oVar = oo000o.f26973OooO00o;
        semantics.OooO00o(oo000o.f26993OooOo00, CollectionsKt.listOf(value));
        o0ooOOo.OooO0O0(semantics, new o00O000o(this.f3119Oooo0oO));
        return Unit.INSTANCE;
    }
}
