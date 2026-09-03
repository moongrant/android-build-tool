package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zaq;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p254o00ooOO0.o0O000;
import p254o00ooOO0.o0O000O;
import p254o00ooOO0.o0OoOoOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements zaca {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Map<Api.AnyClientKey<?>, zabi> f14771OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f14772OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Looper f14773OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final zabe f14774OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final zabi f14775OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final zabi f14776OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Api.Client f14778OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Bundle f14779OooOO0o;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final Lock f14783OooOOOo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Set<SignInConnectionListener> f14777OooOO0 = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public ConnectionResult f14781OooOOO0 = null;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public ConnectionResult f14780OooOOO = null;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f14782OooOOOO = false;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f14784OooOOo0 = 0;

    public OooO00o(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailability googleApiAvailability, p188o00o0O.OooOO0 oooOO1, p188o00o0O.OooOO0 oooOO2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, @Nullable Api.Client client, ArrayList arrayList, ArrayList arrayList2, p188o00o0O.OooOO0 oooOO3, p188o00o0O.OooOO0 oooOO4) {
        this.f14772OooO0Oo = context;
        this.f14774OooO0o0 = zabeVar;
        this.f14783OooOOOo = lock;
        this.f14773OooO0o = looper;
        this.f14778OooOO0O = client;
        this.f14775OooO0oO = new zabi(context, zabeVar, lock, looper, googleApiAvailability, oooOO2, null, oooOO4, null, arrayList2, new o0O000O(this));
        this.f14776OooO0oo = new zabi(context, zabeVar, lock, looper, googleApiAvailability, oooOO1, clientSettings, oooOO3, abstractClientBuilder, arrayList, new o0OoOoOo(this));
        p188o00o0O.OooOO0 oooOO5 = new p188o00o0O.OooOO0();
        Iterator it = ((o00o0O.OooOO0.OooO0OO) oooOO2.keySet()).iterator();
        while (it.hasNext()) {
            oooOO5.put((Api.AnyClientKey) it.next(), this.f14775OooO0oO);
        }
        Iterator it2 = ((o00o0O.OooOO0.OooO0OO) oooOO1.keySet()).iterator();
        while (it2.hasNext()) {
            oooOO5.put((Api.AnyClientKey) it2.next(), this.f14776OooO0oo);
        }
        this.f14771OooO = Collections.unmodifiableMap(oooOO5);
    }

    public static void OooO0Oo(OooO00o oooO00o) {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2 = oooO00o.f14781OooOOO0;
        boolean z = connectionResult2 != null && connectionResult2.isSuccess();
        zabi zabiVar = oooO00o.f14775OooO0oO;
        if (!z) {
            ConnectionResult connectionResult3 = oooO00o.f14781OooOOO0;
            zabi zabiVar2 = oooO00o.f14776OooO0oo;
            if (connectionResult3 != null) {
                ConnectionResult connectionResult4 = oooO00o.f14780OooOOO;
                if (connectionResult4 != null && connectionResult4.isSuccess()) {
                    zabiVar2.zar();
                    oooO00o.OooO00o((ConnectionResult) Preconditions.checkNotNull(oooO00o.f14781OooOOO0));
                    return;
                }
            }
            ConnectionResult connectionResult5 = oooO00o.f14781OooOOO0;
            if (connectionResult5 == null || (connectionResult = oooO00o.f14780OooOOO) == null) {
                return;
            }
            if (zabiVar2.f14876OooOOOo < zabiVar.f14876OooOOOo) {
                connectionResult5 = connectionResult;
            }
            oooO00o.OooO00o(connectionResult5);
            return;
        }
        ConnectionResult connectionResult6 = oooO00o.f14780OooOOO;
        if ((connectionResult6 != null && connectionResult6.isSuccess()) || oooO00o.OooO0OO()) {
            int i = oooO00o.f14784OooOOo0;
            if (i == 1) {
                oooO00o.OooO0O0();
            } else if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            } else {
                ((zabe) Preconditions.checkNotNull(oooO00o.f14774OooO0o0)).zab(oooO00o.f14779OooOO0o);
                oooO00o.OooO0O0();
            }
            oooO00o.f14784OooOOo0 = 0;
            return;
        }
        ConnectionResult connectionResult7 = oooO00o.f14780OooOOO;
        if (connectionResult7 != null) {
            if (oooO00o.f14784OooOOo0 == 1) {
                oooO00o.OooO0O0();
            } else {
                oooO00o.OooO00o(connectionResult7);
                zabiVar.zar();
            }
        }
    }

    @GuardedBy("mLock")
    public final void OooO00o(ConnectionResult connectionResult) {
        int i = this.f14784OooOOo0;
        if (i == 1) {
            OooO0O0();
        } else if (i != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f14774OooO0o0.zaa(connectionResult);
            OooO0O0();
        }
        this.f14784OooOOo0 = 0;
    }

    @GuardedBy("mLock")
    public final void OooO0O0() {
        Set<SignInConnectionListener> set = this.f14777OooOO0;
        Iterator<SignInConnectionListener> it = set.iterator();
        while (it.hasNext()) {
            it.next().onComplete();
        }
        set.clear();
    }

    @GuardedBy("mLock")
    public final boolean OooO0OO() {
        ConnectionResult connectionResult = this.f14780OooOOO;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    @Nullable
    public final PendingIntent OooO0o0() {
        Api.Client client = this.f14778OooOO0O;
        if (client == null) {
            return null;
        }
        return com.google.android.gms.internal.base.zal.zaa(this.f14772OooO0Oo, System.identityHashCode(this.f14774OooO0o0), client.getSignInIntent(), com.google.android.gms.internal.base.zal.zaa | 134217728);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final ConnectionResult zab() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final ConnectionResult zac(long j, @NonNull TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @Nullable
    @GuardedBy("mLock")
    public final ConnectionResult zad(@NonNull Api<?> api) {
        zabi zabiVar = this.f14771OooO.get(api.zab());
        zabi zabiVar2 = this.f14776OooO0oo;
        if (Objects.equal(zabiVar, zabiVar2)) {
            return OooO0OO() ? new ConnectionResult(4, OooO0o0()) : zabiVar2.zad(api);
        }
        return this.f14775OooO0oO.zad(api);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zae(@NonNull T t) {
        zabi zabiVar = this.f14771OooO.get(t.getClientKey());
        Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        zabi zabiVar2 = this.f14776OooO0oo;
        if (!zabiVar.equals(zabiVar2)) {
            this.f14775OooO0oO.zae(t);
            return t;
        }
        if (OooO0OO()) {
            t.setFailedResult(new Status(4, (String) null, OooO0o0()));
            return t;
        }
        zabiVar2.zae(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zaf(@NonNull T t) {
        zabi zabiVar = this.f14771OooO.get(t.getClientKey());
        Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        zabi zabiVar2 = this.f14776OooO0oo;
        if (!zabiVar.equals(zabiVar2)) {
            return (T) this.f14775OooO0oO.zaf(t);
        }
        if (!OooO0OO()) {
            return (T) zabiVar2.zaf(t);
        }
        t.setFailedResult(new Status(4, (String) null, OooO0o0()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zaq() {
        this.f14784OooOOo0 = 2;
        this.f14782OooOOOO = false;
        this.f14780OooOOO = null;
        this.f14781OooOOO0 = null;
        this.f14775OooO0oO.zaq();
        this.f14776OooO0oo.zaq();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zar() {
        this.f14780OooOOO = null;
        this.f14781OooOOO0 = null;
        this.f14784OooOOo0 = 0;
        this.f14775OooO0oO.zar();
        this.f14776OooO0oo.zar();
        OooO0O0();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(CertificateUtil.DELIMITER);
        this.f14776OooO0oo.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(CertificateUtil.DELIMITER);
        this.f14775OooO0oO.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zat() {
        this.f14775OooO0oO.zat();
        this.f14776OooO0oo.zat();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        Lock lock = this.f14783OooOOOo;
        lock.lock();
        try {
            boolean zZax = zax();
            this.f14776OooO0oo.zar();
            this.f14780OooOOO = new ConnectionResult(4);
            if (zZax) {
                new zaq(this.f14773OooO0o).post(new o0O000(this));
            } else {
                OooO0O0();
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        Lock lock = this.f14783OooOOOo;
        lock.lock();
        try {
            boolean z = false;
            if (this.f14775OooO0oO.zaw() && (this.f14776OooO0oo.zaw() || OooO0OO() || this.f14784OooOOo0 == 1)) {
                z = true;
            }
            return z;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        Lock lock = this.f14783OooOOOo;
        lock.lock();
        try {
            return this.f14784OooOOo0 == 2;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        zabi zabiVar = this.f14776OooO0oo;
        Lock lock = this.f14783OooOOOo;
        lock.lock();
        try {
            if ((!zax() && !zaw()) || zabiVar.zaw()) {
                return false;
            }
            this.f14777OooOO0.add(signInConnectionListener);
            if (this.f14784OooOOo0 == 0) {
                this.f14784OooOOo0 = 1;
            }
            this.f14780OooOOO = null;
            zabiVar.zaq();
            return true;
        } finally {
            lock.unlock();
        }
    }
}
