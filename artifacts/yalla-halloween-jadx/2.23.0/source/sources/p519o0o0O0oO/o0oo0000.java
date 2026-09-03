package p519o0o0O0oO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p579o0oOoo.oOo0o00;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oo0000 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o f52780OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oo0000(o oVar) {
        super(1);
        this.f52780OooO0Oo = oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        if (!(it == null || StringsKt.isBlank(it))) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            this.f52780OooO0Oo.OooOO0().f58873OooO0Oo.loadUrl(oOo0o00.OooO0OO(oOo0o00.OooO00o(it), null));
        }
        return Unit.INSTANCE;
    }
}
