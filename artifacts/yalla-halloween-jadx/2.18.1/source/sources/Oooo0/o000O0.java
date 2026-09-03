package Oooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 extends Lambda implements Function1<p710ooOO.o00000O0, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ p643o0ooOO0.o00O0 f565Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(p643o0ooOO0.o00O0 o00o1) {
        super(1);
        this.f565Oooo0o = o00o1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p710ooOO.o00000O0 o00000o1) {
        p710ooOO.o00000O0 focusProperties = o00000o1;
        Intrinsics.checkNotNullParameter(focusProperties, "$this$focusProperties");
        focusProperties.OooO00o(!(this.f565Oooo0o.OooO00o() == 1));
        return Unit.INSTANCE;
    }
}
