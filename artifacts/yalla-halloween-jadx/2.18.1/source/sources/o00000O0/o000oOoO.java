package o00000O0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000oOoO extends Lambda implements Function1<o0OO00O, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f26942Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(OooOO0O oooOO0O) {
        super(1);
        this.f26942Oooo0o = oooOO0O;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0OO00O o0oo00o2) {
        o0OO00O fakeSemanticsNode = o0oo00o2;
        Intrinsics.checkNotNullParameter(fakeSemanticsNode, "$this$fakeSemanticsNode");
        o0ooOOo.OooOO0(fakeSemanticsNode, this.f26942Oooo0o.f26913OooO00o);
        return Unit.INSTANCE;
    }
}
