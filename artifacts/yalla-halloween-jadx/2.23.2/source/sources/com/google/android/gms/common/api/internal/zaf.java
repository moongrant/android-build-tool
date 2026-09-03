package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.TaskCompletionSource;
import p256o00ooOO0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class zaf extends oo00oO<Void> {
    public final zaci zab;

    public zaf(zaci zaciVar, TaskCompletionSource<Void> taskCompletionSource) {
        super(3, taskCompletionSource);
        this.zab = zaciVar;
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(zabq<?> zabqVar) {
        return this.zab.zaa.zab();
    }

    @Override // com.google.android.gms.common.api.internal.zac
    @Nullable
    public final Feature[] zab(zabq<?> zabqVar) {
        return this.zab.zaa.getRequiredFeatures();
    }

    @Override // p256o00ooOO0.oo00oO
    public final void zac(zabq<?> zabqVar) throws RemoteException {
        this.zab.zaa.OooO00o(zabqVar.zaf(), this.f40346OooO00o);
        ListenerHolder.ListenerKey<?> listenerKey = this.zab.zaa.getListenerKey();
        if (listenerKey != null) {
            zabqVar.zah().put(listenerKey, this.zab);
        }
    }

    @Override // p256o00ooOO0.oo00oO, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(@NonNull zaad zaadVar, boolean z) {
    }
}
