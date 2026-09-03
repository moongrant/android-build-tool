package p519o0o0O0oO;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OoOO0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO000O0O f52881OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OoOO0(oO000O0O oo000o0o) {
        super(1);
        this.f52881OooO0Oo = oo000o0o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        oO000O0O oo000o0o = this.f52881OooO0Oo;
        if (!oo000o0o.f52801OooO00o.getValue().booleanValue()) {
            oo000o0o.f52804OooO0Oo.setValue(it);
            oo000o0o.f52803OooO0OO.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
