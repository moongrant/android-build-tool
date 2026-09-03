package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;
import p256o00ooOO0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class zah extends oo00oO<Boolean> {
    public final ListenerHolder.ListenerKey<?> zab;

    public zah(ListenerHolder.ListenerKey<?> listenerKey, TaskCompletionSource<Boolean> taskCompletionSource) {
        super(4, taskCompletionSource);
        this.zab = listenerKey;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(zabq<?> zabqVar) {
        zaci zaciVar = zabqVar.zah().get(this.zab);
        return zaciVar != null && zaciVar.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @Nullable
    public final Feature[] zab(zabq<?> zabqVar) {
        zaci zaciVar = zabqVar.zah().get(this.zab);
        if (zaciVar == null) {
            return null;
        }
        return zaciVar.zaa.getRequiredFeatures();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p256o00ooOO0.oo00oO
    public final void zac(zabq<?> zabqVar) throws RemoteException {
        zaci zaciVarRemove = zabqVar.zah().remove(this.zab);
        TaskCompletionSource<T> taskCompletionSource = this.f40346OooO00o;
        if (zaciVarRemove == null) {
            taskCompletionSource.trySetResult((T) Boolean.FALSE);
        } else {
            zaciVarRemove.zab.OooO00o(zabqVar.zaf(), taskCompletionSource);
            zaciVarRemove.zaa.clearListener();
        }
    }

    @Override // p256o00ooOO0.oo00oO, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(@NonNull zaad zaadVar, boolean z) {
    }
}
