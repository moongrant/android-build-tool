package p534o0o0OOo0;

import com.yalla.yalla.ui.activity.account.ProtectionDetailActivity;
import com.yalla.yalla.ui.vm.account.ProtectionDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0oO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ProtectionDetailActivity f43580Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f43581Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0oO0(ProtectionDetailActivity protectionDetailActivity, long j) {
        super(0);
        this.f43580Oooo0o = protectionDetailActivity;
        this.f43581Oooo0oO = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((ProtectionDetailVM) this.f43580Oooo0o.f21829OoooOoo.getValue()).deleteUserTrustDevice(this.f43581Oooo0oO);
        return Unit.INSTANCE;
    }
}
