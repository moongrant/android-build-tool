package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p331o0O0oooO.o0O0O0o0;
import p331o0O0oooO.o0O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zabi implements zaca, zau {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Map<Api<?>, Boolean> f15366OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Lock f15367OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Condition f15368OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f15369OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final GoogleApiAvailabilityLight f15370OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<Api.AnyClientKey<?>, Api.Client> f15371OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0O0OO0 f15372OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final ClientSettings f15374OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f15375OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotOnlyInitialized
    public volatile zabf f15376OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final zabe f15378OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f15379OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final zabz f15380OooOOOO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Map<Api.AnyClientKey<?>, ConnectionResult> f15373OooO0oO = new HashMap();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public ConnectionResult f15377OooOO0o = null;

    public zabi(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, @Nullable ClientSettings clientSettings, Map<Api<?>, Boolean> map2, @Nullable Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, ArrayList<zat> arrayList, zabz zabzVar) {
        this.f15369OooO0OO = context;
        this.f15367OooO00o = lock;
        this.f15370OooO0Oo = googleApiAvailabilityLight;
        this.f15371OooO0o = map;
        this.f15374OooO0oo = clientSettings;
        this.f15366OooO = map2;
        this.f15375OooOO0 = abstractClientBuilder;
        this.f15378OooOOO = zabeVar;
        this.f15380OooOOOO = zabzVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).zaa(this);
        }
        this.f15372OooO0o0 = new o0O0OO0(this, looper);
        this.f15368OooO0O0 = lock.newCondition();
        this.f15376OooOO0O = new zaax(this);
    }

    public final void OooO00o(@Nullable ConnectionResult connectionResult) {
        this.f15367OooO00o.lock();
        try {
            this.f15377OooOO0o = connectionResult;
            this.f15376OooOO0O = new zaax(this);
            this.f15376OooOO0O.zad();
            this.f15368OooO0O0.signalAll();
        } finally {
            this.f15367OooO00o.unlock();
        }
    }

    public final void OooO0O0(o0O0O0o0 o0o0o0o0) {
        this.f15372OooO0o0.sendMessage(this.f15372OooO0o0.obtainMessage(1, o0o0o0o0));
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        this.f15367OooO00o.lock();
        try {
            this.f15376OooOO0O.zag(bundle);
        } finally {
            this.f15367OooO00o.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.f15367OooO00o.lock();
        try {
            this.f15376OooOO0O.zai(i);
        } finally {
            this.f15367OooO00o.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(@NonNull ConnectionResult connectionResult, @NonNull Api<?> api, boolean z) {
        this.f15367OooO00o.lock();
        try {
            this.f15376OooOO0O.zah(connectionResult, api, z);
        } finally {
            this.f15367OooO00o.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final ConnectionResult zab() {
        zaq();
        while (this.f15376OooOO0O instanceof zaaw) {
            try {
                this.f15368OooO0O0.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (this.f15376OooOO0O instanceof zaaj) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.f15377OooOO0o;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final ConnectionResult zac(long j, TimeUnit timeUnit) {
        zaq();
        long nanos = timeUnit.toNanos(j);
        while (this.f15376OooOO0O instanceof zaaw) {
            if (nanos <= 0) {
                zar();
                return new ConnectionResult(14, null);
            }
            try {
                nanos = this.f15368OooO0O0.awaitNanos(nanos);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, null);
        }
        if (this.f15376OooOO0O instanceof zaaj) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.f15377OooOO0o;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult>] */
    @Override // com.google.android.gms.common.api.internal.zaca
    @Nullable
    @GuardedBy("mLock")
    public final ConnectionResult zad(@NonNull Api<?> api) {
        Api.AnyClientKey<?> anyClientKeyZab = api.zab();
        if (!this.f15371OooO0o.containsKey(anyClientKeyZab)) {
            return null;
        }
        if (this.f15371OooO0o.get(anyClientKeyZab).isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        if (this.f15373OooO0oO.containsKey(anyClientKeyZab)) {
            return (ConnectionResult) this.f15373OooO0oO.get(anyClientKeyZab);
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zae(@NonNull T t) {
        t.zak();
        this.f15376OooOO0O.zaa(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zaf(@NonNull T t) {
        t.zak();
        return (T) this.f15376OooOO0O.zab(t);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zaq() {
        this.f15376OooOO0O.zae();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult>] */
    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zar() {
        if (this.f15376OooOO0O.zaj()) {
            this.f15373OooO0oO.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        String strConcat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f15376OooOO0O);
        for (Api<?> api : this.f15366OooO.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) api.zad()).println(CertificateUtil.DELIMITER);
            ((Api.Client) Preconditions.checkNotNull(this.f15371OooO0o.get(api.zab()))).dump(strConcat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zat() {
        if (this.f15376OooOO0O instanceof zaaj) {
            zaaj zaajVar = (zaaj) this.f15376OooOO0O;
            if (zaajVar.f15317OooO0O0) {
                zaajVar.f15317OooO0O0 = false;
                zaajVar.f15316OooO00o.f15378OooOOO.f15360OooOo.zab();
                zaajVar.zaj();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        return this.f15376OooOO0O instanceof zaaj;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        return this.f15376OooOO0O instanceof zaaw;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        return false;
    }
}
