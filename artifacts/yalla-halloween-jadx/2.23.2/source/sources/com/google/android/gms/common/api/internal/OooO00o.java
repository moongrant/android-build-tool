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
import p256o00ooOO0.o0O000Oo;
import p256o00ooOO0.o0O000o0;
import p256o00ooOO0.o0OoOoOo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements zaca {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Map<Api.AnyClientKey<?>, zabi> f14295OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f14296OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Looper f14297OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final zabe f14298OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final zabi f14299OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final zabi f14300OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Api.Client f14302OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public Bundle f14303OooOO0o;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final Lock f14307OooOOOo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Set<SignInConnectionListener> f14301OooOO0 = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public ConnectionResult f14305OooOOO0 = null;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public ConnectionResult f14304OooOOO = null;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f14306OooOOOO = false;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f14308OooOOo0 = 0;

    public OooO00o(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailability googleApiAvailability, p190o00o0O.OooO oooO, p190o00o0O.OooO oooO2, ClientSettings clientSettings, Api.AbstractClientBuilder abstractClientBuilder, @Nullable Api.Client client, ArrayList arrayList, ArrayList arrayList2, p190o00o0O.OooO oooO3, p190o00o0O.OooO oooO4) {
        this.f14296OooO0Oo = context;
        this.f14298OooO0o0 = zabeVar;
        this.f14307OooOOOo = lock;
        this.f14297OooO0o = looper;
        this.f14302OooOO0O = client;
        this.f14299OooO0oO = new zabi(context, zabeVar, lock, looper, googleApiAvailability, oooO2, null, oooO4, null, arrayList2, new o0O000Oo(this));
        this.f14300OooO0oo = new zabi(context, zabeVar, lock, looper, googleApiAvailability, oooO, clientSettings, oooO3, abstractClientBuilder, arrayList, new o0O000o0(this));
        p190o00o0O.OooO oooO5 = new p190o00o0O.OooO();
        Iterator it = ((o00o0O.OooO.OooO0OO) oooO2.keySet()).iterator();
        while (it.hasNext()) {
            oooO5.put((Api.AnyClientKey) it.next(), this.f14299OooO0oO);
        }
        Iterator it2 = ((o00o0O.OooO.OooO0OO) oooO.keySet()).iterator();
        while (it2.hasNext()) {
            oooO5.put((Api.AnyClientKey) it2.next(), this.f14300OooO0oo);
        }
        this.f14295OooO = Collections.unmodifiableMap(oooO5);
    }

    public static void OooO0Oo(OooO00o oooO00o) {
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2 = oooO00o.f14305OooOOO0;
        boolean z = connectionResult2 != null && connectionResult2.isSuccess();
        zabi zabiVar = oooO00o.f14299OooO0oO;
        if (!z) {
            ConnectionResult connectionResult3 = oooO00o.f14305OooOOO0;
            zabi zabiVar2 = oooO00o.f14300OooO0oo;
            if (connectionResult3 != null) {
                ConnectionResult connectionResult4 = oooO00o.f14304OooOOO;
                if (connectionResult4 != null && connectionResult4.isSuccess()) {
                    zabiVar2.zar();
                    oooO00o.OooO00o((ConnectionResult) Preconditions.checkNotNull(oooO00o.f14305OooOOO0));
                    return;
                }
            }
            ConnectionResult connectionResult5 = oooO00o.f14305OooOOO0;
            if (connectionResult5 == null || (connectionResult = oooO00o.f14304OooOOO) == null) {
                return;
            }
            if (zabiVar2.f14400OooOOOo < zabiVar.f14400OooOOOo) {
                connectionResult5 = connectionResult;
            }
            oooO00o.OooO00o(connectionResult5);
            return;
        }
        ConnectionResult connectionResult6 = oooO00o.f14304OooOOO;
        if ((connectionResult6 != null && connectionResult6.isSuccess()) || oooO00o.OooO0OO()) {
            int i = oooO00o.f14308OooOOo0;
            if (i == 1) {
                oooO00o.OooO0O0();
            } else if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            } else {
                ((zabe) Preconditions.checkNotNull(oooO00o.f14298OooO0o0)).zab(oooO00o.f14303OooOO0o);
                oooO00o.OooO0O0();
            }
            oooO00o.f14308OooOOo0 = 0;
            return;
        }
        ConnectionResult connectionResult7 = oooO00o.f14304OooOOO;
        if (connectionResult7 != null) {
            if (oooO00o.f14308OooOOo0 == 1) {
                oooO00o.OooO0O0();
            } else {
                oooO00o.OooO00o(connectionResult7);
                zabiVar.zar();
            }
        }
    }

    @GuardedBy("mLock")
    public final void OooO00o(ConnectionResult connectionResult) {
        int i = this.f14308OooOOo0;
        if (i == 1) {
            OooO0O0();
        } else if (i != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f14298OooO0o0.zaa(connectionResult);
            OooO0O0();
        }
        this.f14308OooOOo0 = 0;
    }

    @GuardedBy("mLock")
    public final void OooO0O0() {
        Set<SignInConnectionListener> set = this.f14301OooOO0;
        Iterator<SignInConnectionListener> it = set.iterator();
        while (it.hasNext()) {
            it.next().onComplete();
        }
        set.clear();
    }

    @GuardedBy("mLock")
    public final boolean OooO0OO() {
        ConnectionResult connectionResult = this.f14304OooOOO;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    @Nullable
    public final PendingIntent OooO0o0() {
        Api.Client client = this.f14302OooOO0O;
        if (client == null) {
            return null;
        }
        return com.google.android.gms.internal.base.zal.zaa(this.f14296OooO0Oo, System.identityHashCode(this.f14298OooO0o0), client.getSignInIntent(), com.google.android.gms.internal.base.zal.zaa | 134217728);
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
        zabi zabiVar = this.f14295OooO.get(api.zab());
        zabi zabiVar2 = this.f14300OooO0oo;
        if (Objects.equal(zabiVar, zabiVar2)) {
            return OooO0OO() ? new ConnectionResult(4, OooO0o0()) : zabiVar2.zad(api);
        }
        return this.f14299OooO0oO.zad(api);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zae(@NonNull T t) {
        zabi zabiVar = this.f14295OooO.get(t.getClientKey());
        Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        zabi zabiVar2 = this.f14300OooO0oo;
        if (!zabiVar.equals(zabiVar2)) {
            this.f14299OooO0oO.zae(t);
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
        zabi zabiVar = this.f14295OooO.get(t.getClientKey());
        Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        zabi zabiVar2 = this.f14300OooO0oo;
        if (!zabiVar.equals(zabiVar2)) {
            return (T) this.f14299OooO0oO.zaf(t);
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
        this.f14308OooOOo0 = 2;
        this.f14306OooOOOO = false;
        this.f14304OooOOO = null;
        this.f14305OooOOO0 = null;
        this.f14299OooO0oO.zaq();
        this.f14300OooO0oo.zaq();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zar() {
        this.f14304OooOOO = null;
        this.f14305OooOOO0 = null;
        this.f14308OooOOo0 = 0;
        this.f14299OooO0oO.zar();
        this.f14300OooO0oo.zar();
        OooO0O0();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(CertificateUtil.DELIMITER);
        this.f14300OooO0oo.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(CertificateUtil.DELIMITER);
        this.f14299OooO0oO.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zat() {
        this.f14299OooO0oO.zat();
        this.f14300OooO0oo.zat();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        Lock lock = this.f14307OooOOOo;
        lock.lock();
        try {
            boolean zZax = zax();
            this.f14300OooO0oo.zar();
            this.f14304OooOOO = new ConnectionResult(4);
            if (zZax) {
                new zaq(this.f14297OooO0o).post(new o0OoOoOo(this));
            } else {
                OooO0O0();
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        Lock lock = this.f14307OooOOOo;
        lock.lock();
        try {
            boolean z = false;
            if (this.f14299OooO0oO.zaw() && (this.f14300OooO0oo.zaw() || OooO0OO() || this.f14308OooOOo0 == 1)) {
                z = true;
            }
            return z;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        Lock lock = this.f14307OooOOOo;
        lock.lock();
        try {
            return this.f14308OooOOo0 == 2;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        zabi zabiVar = this.f14300OooO0oo;
        Lock lock = this.f14307OooOOOo;
        lock.lock();
        try {
            if ((!zax() && !zaw()) || zabiVar.zaw()) {
                return false;
            }
            this.f14301OooOO0.add(signInConnectionListener);
            if (this.f14308OooOOo0 == 0) {
                this.f14308OooOOo0 = 1;
            }
            this.f14304OooOOO = null;
            zabiVar.zaq();
            return true;
        } finally {
            lock.unlock();
        }
    }
}
