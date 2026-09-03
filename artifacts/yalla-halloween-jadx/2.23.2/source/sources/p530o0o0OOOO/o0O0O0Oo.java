package p530o0o0OOOO;

import android.view.LayoutInflater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.oO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0Oo extends Lambda implements Function0<oO0O0> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f53427OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0Oo(o0O00oO0 o0o00oo1) {
        super(0);
        this.f53427OooO0Oo = o0o00oo1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final oO0O0 invoke() {
        o0O00oO0 o0o00oo1 = this.f53427OooO0Oo;
        oO0O0 oo0o0Inflate = oO0O0.inflate(LayoutInflater.from(o0o00oo1.f58507OooO0Oo), o0o00oo1.f58508OooO0o, false);
        Intrinsics.checkNotNullExpressionValue(oo0o0Inflate, "inflate(...)");
        return oo0o0Inflate;
    }
}
