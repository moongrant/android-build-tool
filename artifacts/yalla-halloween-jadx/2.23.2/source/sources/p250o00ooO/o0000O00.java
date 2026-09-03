package p250o00ooO;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O00<R extends Result> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final R f40221OooOOOo;

    /* JADX WARN: Multi-variable type inference failed */
    public o0000O00(Result result, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.f40221OooOOOo = result;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return this.f40221OooOOOo;
    }
}
