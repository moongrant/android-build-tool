package p491o0o00O0o;

import com.yalla.yalla.ui.activity.account.ProtectionDetailActivity;
import com.yalla.yalla.ui.vm.account.ProtectionDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ProtectionDetailActivity f49012OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f49013OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OOO(ProtectionDetailActivity protectionDetailActivity, long j) {
        super(0);
        this.f49012OooO0Oo = protectionDetailActivity;
        this.f49013OooO0o0 = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = ProtectionDetailActivity.f24825OooOo0;
        ((ProtectionDetailVM) this.f49012OooO0Oo.f24826OooOOoo.getValue()).deleteUserTrustDevice(this.f49013OooO0o0);
        return Unit.INSTANCE;
    }
}
