package p533o0o0OOoO;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p386o0OOooO.o0OOO0o;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f53528OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f53529OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0000(boolean z, boolean z2) {
        super(0);
        this.f53528OooO0Oo = z;
        this.f53529OooO0o0 = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i;
        if (this.f53528OooO0Oo) {
            i = this.f53529OooO0o0 ? 2 : 1;
        } else {
            i = 0;
        }
        o00Ooo.OooO0O0().OooOO0O(i);
        o0OOO0o.f43502OooO0Oo.setValue(Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
