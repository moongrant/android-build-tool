package p533o0o0OOoO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p386o0OOooO.o0OOO0o;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f53523OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO00(boolean z) {
        super(0);
        this.f53523OooO0Oo = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = this.f53523OooO0Oo ? 2 : 1;
        o00Ooo.OooO0O0().OooOO0O(i);
        o0OOO0o.f43502OooO0Oo.setValue(Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
