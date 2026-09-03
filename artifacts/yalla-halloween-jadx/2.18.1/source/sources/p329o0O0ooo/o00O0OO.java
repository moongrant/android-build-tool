package p329o0O0ooo;

import android.os.Looper;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0OO<R extends Result> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final R f37045OooOOOo;

    public o00O0OO(R r) {
        super(Looper.getMainLooper());
        this.f37045OooOOOo = r;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        if (status.getStatusCode() == this.f37045OooOOOo.getStatus().getStatusCode()) {
            return this.f37045OooOOOo;
        }
        throw new UnsupportedOperationException("Creating failed results is not supported");
    }
}
