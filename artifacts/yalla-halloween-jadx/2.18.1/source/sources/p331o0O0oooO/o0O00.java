package p331o0O0oooO;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zabf;
import com.google.android.gms.common.internal.BaseGmsClient;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O00 extends o0O0O0o0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f37074OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(zabf zabfVar, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zabfVar);
        this.f37074OooO0O0 = connectionProgressReportCallbacks;
    }

    @Override // p331o0O0oooO.o0O0O0o0
    @GuardedBy("mLock")
    public final void OooO00o() {
        this.f37074OooO0O0.onReportServiceBinding(new ConnectionResult(16, null));
    }
}
