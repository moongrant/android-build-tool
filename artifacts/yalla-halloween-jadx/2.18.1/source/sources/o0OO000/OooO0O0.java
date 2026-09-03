package o0OO000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.service.zah;
import com.google.android.gms.common.internal.service.zal;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends OooO0o {
    public OooO0O0(GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* bridge */ /* synthetic */ void OooO0OO(Api.AnyClient anyClient) throws RemoteException {
        ((zal) ((zah) anyClient).getService()).zae(new OooO0OO(this));
    }
}
