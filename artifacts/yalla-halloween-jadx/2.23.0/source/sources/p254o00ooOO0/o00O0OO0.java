package p254o00ooOO0;

import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.api.internal.zabe;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0OO0 implements ResultCallback<Status> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ StatusPendingResult f40959OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f40960OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ GoogleApiClient f40961OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ zabe f40962OooO0Oo;

    public o00O0OO0(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, zabe zabeVar, boolean z) {
        this.f40962OooO0Oo = zabeVar;
        this.f40959OooO00o = statusPendingResult;
        this.f40960OooO0O0 = z;
        this.f40961OooO0OO = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void onResult(@NonNull Result result) {
        Status status = (Status) result;
        zabe zabeVar = this.f40962OooO0Oo;
        Storage.getInstance(zabeVar.f14845OooO0o).zac();
        if (status.isSuccess() && zabeVar.isConnected()) {
            zabeVar.disconnect();
            zabeVar.connect();
        }
        this.f40959OooO00o.setResult(status);
        if (this.f40960OooO0O0) {
            this.f40961OooO0OO.disconnect();
        }
    }
}
