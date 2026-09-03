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
import p254o00ooOO0.o00O0OOO;
import p254o00ooOO0.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class zabi implements zaca, zau {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Map<Api.AnyClientKey<?>, Api.Client> f14864OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Lock f14865OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f14866OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Condition f14867OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final GoogleApiAvailabilityLight f14868OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final oo0oOO0 f14869OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final ClientSettings f14871OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Map<Api<?>, Boolean> f14872OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotOnlyInitialized
    public volatile zabf f14873OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f14874OooOOO0;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f14876OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final zabz f14877OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final zabe f14878OooOOo0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final HashMap f14870OooOO0 = new HashMap();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public ConnectionResult f14875OooOOOO = null;

    public zabi(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, @Nullable ClientSettings clientSettings, Map<Api<?>, Boolean> map2, @Nullable Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, ArrayList<zat> arrayList, zabz zabzVar) {
        this.f14866OooO0o = context;
        this.f14865OooO0Oo = lock;
        this.f14868OooO0oO = googleApiAvailabilityLight;
        this.f14864OooO = map;
        this.f14871OooOO0O = clientSettings;
        this.f14872OooOO0o = map2;
        this.f14874OooOOO0 = abstractClientBuilder;
        this.f14878OooOOo0 = zabeVar;
        this.f14877OooOOo = zabzVar;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).zaa(this);
        }
        this.f14869OooO0oo = new oo0oOO0(this, looper);
        this.f14867OooO0o0 = lock.newCondition();
        this.f14873OooOOO = new zaax(this);
    }

    public final void OooO00o(@Nullable ConnectionResult connectionResult) {
        this.f14865OooO0Oo.lock();
        try {
            this.f14875OooOOOO = connectionResult;
            this.f14873OooOOO = new zaax(this);
            this.f14873OooOOO.zad();
            this.f14867OooO0o0.signalAll();
        } finally {
            this.f14865OooO0Oo.unlock();
        }
    }

    public final void OooO0O0(o00O0OOO o00o0ooo2) {
        oo0oOO0 oo0ooo0 = this.f14869OooO0oo;
        oo0ooo0.sendMessage(oo0ooo0.obtainMessage(1, o00o0ooo2));
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        this.f14865OooO0Oo.lock();
        try {
            this.f14873OooOOO.zag(bundle);
        } finally {
            this.f14865OooO0Oo.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.f14865OooO0Oo.lock();
        try {
            this.f14873OooOOO.zai(i);
        } finally {
            this.f14865OooO0Oo.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(@NonNull ConnectionResult connectionResult, @NonNull Api<?> api, boolean z) {
        this.f14865OooO0Oo.lock();
        try {
            this.f14873OooOOO.zah(connectionResult, api, z);
        } finally {
            this.f14865OooO0Oo.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final ConnectionResult zab() {
        zaq();
        while (this.f14873OooOOO instanceof zaaw) {
            try {
                this.f14867OooO0o0.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if (this.f14873OooOOO instanceof zaaj) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.f14875OooOOOO;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final ConnectionResult zac(long j, TimeUnit timeUnit) {
        zaq();
        long nanos = timeUnit.toNanos(j);
        while (this.f14873OooOOO instanceof zaaw) {
            if (nanos <= 0) {
                zar();
                return new ConnectionResult(14, null);
            }
            try {
                nanos = this.f14867OooO0o0.awaitNanos(nanos);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
            Thread.currentThread().interrupt();
            return new ConnectionResult(15, null);
        }
        if (this.f14873OooOOO instanceof zaaj) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult = this.f14875OooOOOO;
        return connectionResult != null ? connectionResult : new ConnectionResult(13, null);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @Nullable
    @GuardedBy("mLock")
    public final ConnectionResult zad(@NonNull Api<?> api) {
        Api.AnyClientKey<?> anyClientKeyZab = api.zab();
        Map<Api.AnyClientKey<?>, Api.Client> map = this.f14864OooO;
        if (!map.containsKey(anyClientKeyZab)) {
            return null;
        }
        if (map.get(anyClientKeyZab).isConnected()) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        HashMap map2 = this.f14870OooOO0;
        if (map2.containsKey(anyClientKeyZab)) {
            return (ConnectionResult) map2.get(anyClientKeyZab);
        }
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zae(@NonNull T t) {
        t.zak();
        this.f14873OooOOO.zaa(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zaf(@NonNull T t) {
        t.zak();
        return (T) this.f14873OooOOO.zab(t);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zaq() {
        this.f14873OooOOO.zae();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zar() {
        if (this.f14873OooOOO.zaj()) {
            this.f14870OooOO0.clear();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        String strConcat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f14873OooOOO);
        for (Api<?> api : this.f14872OooOO0o.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) api.zad()).println(CertificateUtil.DELIMITER);
            ((Api.Client) Preconditions.checkNotNull(this.f14864OooO.get(api.zab()))).dump(strConcat, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zat() {
        if (this.f14873OooOOO instanceof zaaj) {
            zaaj zaajVar = (zaaj) this.f14873OooOOO;
            if (zaajVar.f14816OooO0O0) {
                zaajVar.f14816OooO0O0 = false;
                zaajVar.f14815OooO00o.f14878OooOOo0.f14859OooOo.zab();
                zaajVar.zaj();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        return this.f14873OooOOO instanceof zaaj;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        return this.f14873OooOOO instanceof zaaw;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        return false;
    }
}
