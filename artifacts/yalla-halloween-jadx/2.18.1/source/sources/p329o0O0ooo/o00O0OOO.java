package p329o0O0ooo;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OOO<R extends Result> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final R f37046OooOOOo;

    public o00O0OOO(GoogleApiClient googleApiClient, R r) {
        super(googleApiClient);
        this.f37046OooOOOo = r;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return this.f37046OooOOOo;
    }
}
