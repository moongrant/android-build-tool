package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import p331o0O0oooO.o0O000O;

/* JADX INFO: loaded from: classes2.dex */
public final class zaaj implements zabf {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zabi f15316OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f15317OooO0O0 = false;

    public zaaj(zabi zabiVar) {
        this.f15316OooO00o = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        zab(t);
        return t;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult>] */
    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t) {
        try {
            zadc zadcVar = this.f15316OooO00o.f15378OooOOO.f15360OooOo;
            zadcVar.f15418OooO00o.add(t);
            t.zan(zadcVar.f15419OooO0O0);
            zabe zabeVar = this.f15316OooO00o.f15378OooOOO;
            Api.Client client = zabeVar.f15355OooOOOO.get(t.getClientKey());
            Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (client.isConnected() || !this.f15316OooO00o.f15373OooO0oO.containsKey(t.getClientKey())) {
                t.run(client);
            } else {
                t.setFailedResult(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.f15316OooO00o.OooO0O0(new OooO0O0(this, this));
        }
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
        if (this.f15317OooO0O0) {
            this.f15317OooO0O0 = false;
            this.f15316OooO00o.OooO0O0(new o0O000O(this, this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zag(@Nullable Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zah(ConnectionResult connectionResult, Api<?> api, boolean z) {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zai(int i) {
        this.f15316OooO00o.OooO00o(null);
        this.f15316OooO00o.f15380OooOOOO.zac(i, this.f15317OooO0O0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.internal.zada>] */
    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        if (this.f15317OooO0O0) {
            return false;
        }
        ?? r0 = this.f15316OooO00o.f15378OooOOO.f15364OooOo0o;
        if (r0 == 0 || r0.isEmpty()) {
            this.f15316OooO00o.OooO00o(null);
            return true;
        }
        this.f15317OooO0O0 = true;
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            ((zada) it.next()).f15412OooO0OO = null;
        }
        return false;
    }
}
