package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;
import p254o00ooOO0.o0oOO;

/* JADX INFO: loaded from: classes3.dex */
public final class zah extends o0oOO<Boolean> {
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
    @Override // p254o00ooOO0.o0oOO
    public final void zac(zabq<?> zabqVar) throws RemoteException {
        zaci zaciVarRemove = zabqVar.zah().remove(this.zab);
        TaskCompletionSource<T> taskCompletionSource = this.f41007OooO00o;
        if (zaciVarRemove == null) {
            taskCompletionSource.trySetResult((T) Boolean.FALSE);
        } else {
            zaciVarRemove.zab.OooO00o(zabqVar.zaf(), taskCompletionSource);
            zaciVarRemove.zaa.clearListener();
        }
    }

    @Override // p254o00ooOO0.o0oOO, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(@NonNull zaad zaadVar, boolean z) {
    }
}
