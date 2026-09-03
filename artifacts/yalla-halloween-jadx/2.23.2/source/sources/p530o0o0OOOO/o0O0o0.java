package p530o0o0OOOO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p423o0OoO0OO.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53432OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0o0(o0O00oO0 o0o00oo1) {
        super(1);
        this.f53432OooO0Oo = o0o00oo1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        if (o00O00OO.OooO0o(it)) {
            this.f53432OooO0Oo.OooOOOo(it, true);
        }
        return Unit.INSTANCE;
    }
}
