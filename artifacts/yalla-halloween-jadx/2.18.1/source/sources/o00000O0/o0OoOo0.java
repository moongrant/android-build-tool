package o00000O0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 extends Lambda implements Function1<o0OO00O, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f26959Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(String str) {
        super(1);
        this.f26959Oooo0o = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0OO00O o0oo00o2) {
        o0OO00O fakeSemanticsNode = o0oo00o2;
        Intrinsics.checkNotNullParameter(fakeSemanticsNode, "$this$fakeSemanticsNode");
        o0ooOOo.OooO0oO(fakeSemanticsNode, this.f26959Oooo0o);
        return Unit.INSTANCE;
    }
}
