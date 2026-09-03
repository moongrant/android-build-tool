package o0OO000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.service.zaa;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends zaa {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final BaseImplementation.ResultHolder<Status> f37203OooO00o;

    public OooO0OO(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f37203OooO00o = resultHolder;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zak
    public final void zab(int i) throws RemoteException {
        this.f37203OooO00o.setResult(new Status(i));
    }
}
