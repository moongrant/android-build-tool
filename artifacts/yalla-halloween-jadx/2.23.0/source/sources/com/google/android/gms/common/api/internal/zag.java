package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import p254o00ooOO0.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
public final class zag<ResultT> extends zac {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final TaskApiCall<Api.AnyClient, ResultT> f14919OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TaskCompletionSource<ResultT> f14920OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final StatusExceptionMapper f14921OooO0OO;

    public zag(int i, TaskApiCall<Api.AnyClient, ResultT> taskApiCall, TaskCompletionSource<ResultT> taskCompletionSource, StatusExceptionMapper statusExceptionMapper) {
        super(i);
        this.f14920OooO0O0 = taskCompletionSource;
        this.f14919OooO00o = taskApiCall;
        this.f14921OooO0OO = statusExceptionMapper;
        if (i == 2 && taskApiCall.shouldAutoResolveMissingFeatures()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(zabq<?> zabqVar) {
        return this.f14919OooO00o.shouldAutoResolveMissingFeatures();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @Nullable
    public final Feature[] zab(zabq<?> zabqVar) {
        return this.f14919OooO00o.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(@NonNull Status status) {
        this.f14920OooO0O0.trySetException(this.f14921OooO0OO.getException(status));
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(@NonNull Exception exc) {
        this.f14920OooO0O0.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(zabq<?> zabqVar) throws DeadObjectException {
        TaskCompletionSource<ResultT> taskCompletionSource = this.f14920OooO0O0;
        try {
            this.f14919OooO00o.OooO00o(zabqVar.zaf(), taskCompletionSource);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            zad(zai.OooO00o(e2));
        } catch (RuntimeException e3) {
            taskCompletionSource.trySetException(e3);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(@NonNull zaad zaadVar, boolean z) {
        Map<TaskCompletionSource<?>, Boolean> map = zaadVar.f14811OooO0O0;
        Boolean boolValueOf = Boolean.valueOf(z);
        TaskCompletionSource<ResultT> taskCompletionSource = this.f14920OooO0O0;
        map.put((TaskCompletionSource<?>) taskCompletionSource, boolValueOf);
        taskCompletionSource.getTask().addOnCompleteListener(new o00O0000(zaadVar, taskCompletionSource));
    }
}
