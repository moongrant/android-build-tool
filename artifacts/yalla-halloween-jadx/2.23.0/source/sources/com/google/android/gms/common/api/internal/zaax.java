package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import java.util.Collections;
import java.util.Iterator;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes3.dex */
public final class zaax implements zabf {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotOnlyInitialized
    public final zabi f14838OooO00o;

    public zaax(zabi zabiVar) {
        this.f14838OooO00o = zabiVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        this.f14838OooO00o.f14878OooOOo0.f14848OooO0oo.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
        zabi zabiVar = this.f14838OooO00o;
        Iterator<Api.Client> it = zabiVar.f14864OooO.values().iterator();
        while (it.hasNext()) {
            it.next().disconnect();
        }
        zabiVar.f14878OooOOo0.f14855OooOOOo = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
        zabi zabiVar = this.f14838OooO00o;
        zabiVar.f14865OooO0Oo.lock();
        try {
            zabiVar.f14873OooOOO = new zaaw(zabiVar, zabiVar.f14871OooOO0O, zabiVar.f14872OooOO0o, zabiVar.f14868OooO0oO, zabiVar.f14874OooOOO0, zabiVar.f14865OooO0Oo, zabiVar.f14866OooO0o);
            zabiVar.f14873OooOOO.zad();
            zabiVar.f14867OooO0o0.signalAll();
        } finally {
            zabiVar.f14865OooO0Oo.unlock();
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
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        return true;
    }
}
