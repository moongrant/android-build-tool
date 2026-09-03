package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import java.util.Collections;
import java.util.Iterator;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* JADX INFO: loaded from: classes2.dex */
public final class zaax implements zabf {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotOnlyInitialized
    public final zabi f15339OooO00o;

    public zaax(zabi zabiVar) {
        this.f15339OooO00o = zabiVar;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        this.f15339OooO00o.f15378OooOOO.f15349OooO0oo.add((BaseImplementation.ApiMethodImpl<?, ?>) t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
        Iterator<Api.Client> it = this.f15339OooO00o.f15371OooO0o.values().iterator();
        while (it.hasNext()) {
            it.next().disconnect();
        }
        this.f15339OooO00o.f15378OooOOO.f15356OooOOOo = Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
        zabi zabiVar = this.f15339OooO00o;
        zabiVar.f15367OooO00o.lock();
        try {
            zabiVar.f15376OooOO0O = new zaaw(zabiVar, zabiVar.f15374OooO0oo, zabiVar.f15366OooO, zabiVar.f15370OooO0Oo, zabiVar.f15375OooOO0, zabiVar.f15367OooO00o, zabiVar.f15369OooO0OO);
            zabiVar.f15376OooOO0O.zad();
            zabiVar.f15368OooO0O0.signalAll();
        } finally {
            zabiVar.f15367OooO00o.unlock();
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
