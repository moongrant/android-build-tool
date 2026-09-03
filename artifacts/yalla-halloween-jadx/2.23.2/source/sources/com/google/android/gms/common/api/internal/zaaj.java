package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;
import java.util.Iterator;
import p256o00ooOO0.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
public final class zaaj implements zabf {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zabi f14339OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f14340OooO0O0 = false;

    public zaaj(zabi zabiVar) {
        this.f14339OooO00o = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        zab(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t) {
        zabi zabiVar = this.f14339OooO00o;
        try {
            zadc zadcVar = zabiVar.f14402OooOOo0.f14383OooOo;
            zadcVar.f14440OooO00o.add(t);
            t.zan(zadcVar.f14441OooO0O0);
            zabe zabeVar = zabiVar.f14402OooOOo0;
            Api.Client client = zabeVar.f14378OooOOOO.get(t.getClientKey());
            Preconditions.checkNotNull(client, "Appropriate Api was not requested.");
            if (client.isConnected() || !zabiVar.f14394OooOO0.containsKey(t.getClientKey())) {
                t.run(client);
            } else {
                t.setFailedResult(new Status(17));
            }
        } catch (DeadObjectException unused) {
            zabiVar.OooO0O0(new OooO0O0(this, this));
        }
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
        if (this.f14340OooO0O0) {
            this.f14340OooO0O0 = false;
            this.f14339OooO00o.OooO0O0(new o00O000o(this, this));
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
        zabi zabiVar = this.f14339OooO00o;
        zabiVar.OooO00o(null);
        zabiVar.f14401OooOOo.zac(i, this.f14340OooO0O0);
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        if (this.f14340OooO0O0) {
            return false;
        }
        HashSet hashSet = this.f14339OooO00o.f14402OooOOo0.f14387OooOo0o;
        if (hashSet == null || hashSet.isEmpty()) {
            this.f14339OooO00o.OooO00o(null);
            return true;
        }
        this.f14340OooO0O0 = true;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((zada) it.next()).f14434OooO0OO = null;
        }
        return false;
    }
}
