package p022Oooo;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import o00000O0.o0OO00O;
import o00000O0.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends Lambda implements Function1<o0OO00O, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f448Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(boolean z) {
        super(1);
        this.f448Oooo0o = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0OO00O o0oo00o2) {
        o0OO00O semantics = o0oo00o2;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        boolean z = this.f448Oooo0o;
        KProperty<Object>[] kPropertyArr = o0ooOOo.f26961OooO00o;
        Intrinsics.checkNotNullParameter(semantics, "<this>");
        o0ooOOo.f26969OooOO0.OooO00o(semantics, o0ooOOo.f26961OooO00o[12], Boolean.valueOf(z));
        return Unit.INSTANCE;
    }
}
