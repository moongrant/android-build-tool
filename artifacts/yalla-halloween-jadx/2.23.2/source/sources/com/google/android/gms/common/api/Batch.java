package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class Batch extends BasePendingResult<BatchResult> {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f14172OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f14173OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f14174OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final PendingResult<?>[] f14175OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final Object f14176OooOo00;

    public static final class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ArrayList f14177OooO00o = new ArrayList();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final GoogleApiClient f14178OooO0O0;

        public Builder(@NonNull GoogleApiClient googleApiClient) {
            this.f14178OooO0O0 = googleApiClient;
        }

        @NonNull
        public <R extends Result> BatchResultToken<R> add(@NonNull PendingResult<R> pendingResult) {
            ArrayList arrayList = this.f14177OooO00o;
            BatchResultToken<R> batchResultToken = new BatchResultToken<>(arrayList.size());
            arrayList.add(pendingResult);
            return batchResultToken;
        }

        @NonNull
        public Batch build() {
            return new Batch(this.f14177OooO00o, this.f14178OooO0O0);
        }
    }

    public /* synthetic */ Batch(ArrayList arrayList, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        this.f14176OooOo00 = new Object();
        int size = arrayList.size();
        this.f14172OooOOOo = size;
        PendingResult<?>[] pendingResultArr = new PendingResult[size];
        this.f14175OooOOoo = pendingResultArr;
        if (arrayList.isEmpty()) {
            setResult(new BatchResult(Status.RESULT_SUCCESS, pendingResultArr));
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            PendingResult<?> pendingResult = (PendingResult) arrayList.get(i);
            this.f14175OooOOoo[i] = pendingResult;
            pendingResult.addStatusListener(new OooO00o(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public void cancel() {
        super.cancel();
        for (PendingResult<?> pendingResult : this.f14175OooOOoo) {
            pendingResult.cancel();
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @NonNull
    public BatchResult createFailedResult(@NonNull Status status) {
        return new BatchResult(status, this.f14175OooOOoo);
    }
}
