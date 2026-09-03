package p256o00ooOo0;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.service.zaa;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00O0o extends zaa {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final BaseImplementation.ResultHolder<Status> f41045OooO0Oo;

    public o0O00O0o(BaseImplementation.ResultHolder<Status> resultHolder) {
        this.f41045OooO0Oo = resultHolder;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zak
    public final void zab(int i) throws RemoteException {
        this.f41045OooO0Oo.setResult(new Status(i));
    }
}
