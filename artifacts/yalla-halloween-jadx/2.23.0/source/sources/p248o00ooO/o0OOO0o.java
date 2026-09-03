package p248o00ooO;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o<R extends Result> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final R f40892OooOOOo;

    public o0OOO0o(R r) {
        super(Looper.getMainLooper());
        this.f40892OooOOOo = r;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        int statusCode = status.getStatusCode();
        R r = this.f40892OooOOOo;
        if (statusCode == r.getStatus().getStatusCode()) {
            return r;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
