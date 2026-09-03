package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import p331o0O0oooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class zag<ResultT> extends zac {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TaskApiCall<Api.AnyClient, ResultT> f15421OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TaskCompletionSource<ResultT> f15422OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final StatusExceptionMapper f15423OooO0OO;

    public zag(int i, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.f15422OooO0O0 = taskCompletionSource;
        this.f15421OooO00o = taskApiCall;
        this.f15423OooO0OO = statusExceptionMapper;
        if (i == 2 && taskApiCall.shouldAutoResolveMissingFeatures()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(zabq<?> zabqVar) {
        return this.f15421OooO00o.shouldAutoResolveMissingFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @Nullable
    public final Feature[] zab(zabq<?> zabqVar) {
        return this.f15421OooO00o.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@NonNull Status status) {
        this.f15422OooO0O0.trySetException(this.f15423OooO0OO.getException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@NonNull Exception exc) {
        this.f15422OooO0O0.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq<?> zabqVar) throws DeadObjectException {
        try {
            this.f15421OooO00o.OooO00o(zabqVar.zaf(), this.f15422OooO0O0);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            zad(zai.OooO00o(e2));
        } catch (RuntimeException e3) {
            this.f15422OooO0O0.trySetException(e3);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(@NonNull zaad zaadVar, boolean z) {
        TaskCompletionSource<ResultT> taskCompletionSource = this.f15422OooO0O0;
        zaadVar.f15312OooO0O0.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.getTask().addOnCompleteListener(new o0O0000O(zaadVar, taskCompletionSource));
    }
}
