package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class Batch extends BasePendingResult<BatchResult> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f15149OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f15150OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f15151OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final PendingResult<?>[] f15152OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final Object f15153OooOo00;

    public static final class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public List<PendingResult<?>> f15154OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public GoogleApiClient f15155OooO0O0;

        public Builder(@NonNull GoogleApiClient googleApiClient) {
            this.f15155OooO0O0 = googleApiClient;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NonNull
        public <R extends Result> BatchResultToken<R> add(@NonNull PendingResult<R> pendingResult) {
            BatchResultToken<R> batchResultToken = new BatchResultToken<>(this.f15154OooO00o.size());
            this.f15154OooO00o.add((PendingResult<?>) pendingResult);
            return batchResultToken;
        }

        @NonNull
        public Batch build() {
            return new Batch(this.f15154OooO00o, this.f15155OooO0O0);
        }
    }

    public /* synthetic */ Batch(List list, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.f15153OooOo00 = new Object();
        int size = list.size();
        this.f15149OooOOOo = size;
        PendingResult<?>[] pendingResultArr = new PendingResult[size];
        this.f15152OooOOoo = pendingResultArr;
        if (list.isEmpty()) {
            setResult(new BatchResult(Status.RESULT_SUCCESS, pendingResultArr));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            PendingResult<?> pendingResult = (PendingResult) list.get(i);
            this.f15152OooOOoo[i] = pendingResult;
            pendingResult.addStatusListener(new OooO00o(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public void cancel() {
        super.cancel();
        for (PendingResult<?> pendingResult : this.f15152OooOOoo) {
            pendingResult.cancel();
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @NonNull
    public BatchResult createFailedResult(@NonNull Status status) {
        return new BatchResult(status, this.f15152OooOOoo);
    }
}
