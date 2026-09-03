package p256o00ooOO0;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.internal.BaseGmsClient;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO00O extends o00O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient.ConnectionProgressReportCallbacks f40343OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00O(zaaw zaawVar, BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks) {
        super(zaawVar);
        this.f40343OooO0O0 = connectionProgressReportCallbacks;
    }

    @Override // p256o00ooOO0.o00O
    @GuardedBy("mLock")
    public final void OooO00o() {
        this.f40343OooO0O0.onReportServiceBinding(new ConnectionResult(16, null));
    }
}
