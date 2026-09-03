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
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.signin.SignInOptions;
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
import p021OooOooo.Oooo0;
import p331o0O0oooO.o0OOO0;
import p331o0O0oooO.o0OOO00;
import p331o0O0oooO.o0OOO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements zaca {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public Bundle f15272OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f15273OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final zabe f15274OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Looper f15275OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zabi f15276OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<Api.AnyClientKey<?>, zabi> f15277OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final zabi f15278OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final Api.Client f15280OooO0oo;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Lock f15285OooOOO0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Set<SignInConnectionListener> f15279OooO0oO = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ConnectionResult f15281OooOO0 = null;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public ConnectionResult f15282OooOO0O = null;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f15283OooOO0o = false;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f15284OooOOO = 0;

    public OooO00o(Context context, zabe zabeVar, Lock lock, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, Map<Api.AnyClientKey<?>, Api.Client> map, Map<Api.AnyClientKey<?>, Api.Client> map2, ClientSettings clientSettings, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, @Nullable Api.Client client, ArrayList<zat> arrayList, ArrayList<zat> arrayList2, Map<Api<?>, Boolean> map3, Map<Api<?>, Boolean> map4) {
        this.f15273OooO00o = context;
        this.f15274OooO0O0 = zabeVar;
        this.f15285OooOOO0 = lock;
        this.f15275OooO0OO = looper;
        this.f15280OooO0oo = client;
        this.f15276OooO0Oo = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map2, null, map4, null, arrayList2, new o0OOO0(this));
        this.f15278OooO0o0 = new zabi(context, zabeVar, lock, looper, googleApiAvailabilityLight, map, clientSettings, map3, abstractClientBuilder, arrayList, new o0OOO0OO(this));
        Oooo0 oooo0 = new Oooo0();
        Iterator<Api.AnyClientKey<?>> it = map2.keySet().iterator();
        while (it.hasNext()) {
            oooo0.put(it.next(), this.f15276OooO0Oo);
        }
        Iterator<Api.AnyClientKey<?>> it2 = map.keySet().iterator();
        while (it2.hasNext()) {
            oooo0.put(it2.next(), this.f15278OooO0o0);
        }
        this.f15277OooO0o = Collections.unmodifiableMap(oooo0);
    }

    public static /* bridge */ /* synthetic */ void OooO0o(OooO00o oooO00o) {
        ConnectionResult connectionResult;
        if (!OooO0o0(oooO00o.f15281OooOO0)) {
            if (oooO00o.f15281OooOO0 != null && OooO0o0(oooO00o.f15282OooOO0O)) {
                oooO00o.f15278OooO0o0.zar();
                oooO00o.OooO00o((ConnectionResult) Preconditions.checkNotNull(oooO00o.f15281OooOO0));
                return;
            }
            ConnectionResult connectionResult2 = oooO00o.f15281OooOO0;
            if (connectionResult2 == null || (connectionResult = oooO00o.f15282OooOO0O) == null) {
                return;
            }
            if (oooO00o.f15278OooO0o0.f15379OooOOO0 < oooO00o.f15276OooO0Oo.f15379OooOOO0) {
                connectionResult2 = connectionResult;
            }
            oooO00o.OooO00o(connectionResult2);
            return;
        }
        if (OooO0o0(oooO00o.f15282OooOO0O) || oooO00o.OooO0OO()) {
            int i = oooO00o.f15284OooOOO;
            if (i == 1) {
                oooO00o.OooO0O0();
            } else if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
            } else {
                ((zabe) Preconditions.checkNotNull(oooO00o.f15274OooO0O0)).zab(oooO00o.f15272OooO);
                oooO00o.OooO0O0();
            }
            oooO00o.f15284OooOOO = 0;
            return;
        }
        ConnectionResult connectionResult3 = oooO00o.f15282OooOO0O;
        if (connectionResult3 != null) {
            if (oooO00o.f15284OooOOO == 1) {
                oooO00o.OooO0O0();
            } else {
                oooO00o.OooO00o(connectionResult3);
                oooO00o.f15276OooO0Oo.zar();
            }
        }
    }

    public static boolean OooO0o0(@Nullable ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.isSuccess();
    }

    @GuardedBy("mLock")
    public final void OooO00o(ConnectionResult connectionResult) {
        int i = this.f15284OooOOO;
        if (i == 1) {
            OooO0O0();
        } else if (i != 2) {
            Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
        } else {
            this.f15274OooO0O0.zaa(connectionResult);
            OooO0O0();
        }
        this.f15284OooOOO = 0;
    }

    @GuardedBy("mLock")
    public final void OooO0O0() {
        Iterator<SignInConnectionListener> it = this.f15279OooO0oO.iterator();
        while (it.hasNext()) {
            it.next().onComplete();
        }
        this.f15279OooO0oO.clear();
    }

    @GuardedBy("mLock")
    public final boolean OooO0OO() {
        ConnectionResult connectionResult = this.f15282OooOO0O;
        return connectionResult != null && connectionResult.getErrorCode() == 4;
    }

    public final boolean OooO0Oo(BaseImplementation.ApiMethodImpl<? extends Result, ? extends Api.AnyClient> apiMethodImpl) {
        zabi zabiVar = this.f15277OooO0o.get(apiMethodImpl.getClientKey());
        Preconditions.checkNotNull(zabiVar, "GoogleApiClient is not configured to use the API required for this call.");
        return zabiVar.equals(this.f15278OooO0o0);
    }

    @Nullable
    public final PendingIntent OooO0oO() {
        if (this.f15280OooO0oo == null) {
            return null;
        }
        return com.google.android.gms.internal.base.zal.zaa(this.f15273OooO00o, System.identityHashCode(this.f15274OooO0O0), this.f15280OooO0oo.getSignInIntent(), com.google.android.gms.internal.base.zal.zaa | 134217728);
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
        if (Objects.equal(this.f15277OooO0o.get(api.zab()), this.f15278OooO0o0)) {
            return OooO0OO() ? new ConnectionResult(4, OooO0oO()) : this.f15278OooO0o0.zad(api);
        }
        return this.f15276OooO0Oo.zad(api);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zae(@NonNull T t) {
        if (!OooO0Oo(t)) {
            this.f15276OooO0Oo.zae(t);
            return t;
        }
        if (OooO0OO()) {
            t.setFailedResult(new Status(4, (String) null, OooO0oO()));
            return t;
        }
        this.f15278OooO0o0.zae(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zaf(@NonNull T t) {
        if (!OooO0Oo(t)) {
            return (T) this.f15276OooO0Oo.zaf(t);
        }
        if (!OooO0OO()) {
            return (T) this.f15278OooO0o0.zaf(t);
        }
        t.setFailedResult(new Status(4, (String) null, OooO0oO()));
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zaq() {
        this.f15284OooOOO = 2;
        this.f15283OooOO0o = false;
        this.f15282OooOO0O = null;
        this.f15281OooOO0 = null;
        this.f15276OooO0Oo.zaq();
        this.f15278OooO0o0.zaq();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zar() {
        this.f15282OooOO0O = null;
        this.f15281OooOO0 = null;
        this.f15284OooOOO = 0;
        this.f15276OooO0Oo.zar();
        this.f15278OooO0o0.zar();
        OooO0O0();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zas(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("authClient").println(CertificateUtil.DELIMITER);
        this.f15278OooO0o0.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append((CharSequence) str).append("anonClient").println(CertificateUtil.DELIMITER);
        this.f15276OooO0Oo.zas(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("mLock")
    public final void zat() {
        this.f15276OooO0Oo.zat();
        this.f15278OooO0o0.zat();
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        this.f15285OooOOO0.lock();
        try {
            boolean zZax = zax();
            this.f15278OooO0o0.zar();
            this.f15282OooOO0O = new ConnectionResult(4);
            if (zZax) {
                new zaq(this.f15275OooO0OO).post(new o0OOO00(this));
            } else {
                OooO0O0();
            }
        } finally {
            this.f15285OooOOO0.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        this.f15285OooOOO0.lock();
        try {
            boolean z = false;
            if (this.f15276OooO0Oo.zaw() && (this.f15278OooO0o0.zaw() || OooO0OO() || this.f15284OooOOO == 1)) {
                z = true;
            }
            return z;
        } finally {
            this.f15285OooOOO0.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        this.f15285OooOOO0.lock();
        try {
            return this.f15284OooOOO == 2;
        } finally {
            this.f15285OooOOO0.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener) {
        this.f15285OooOOO0.lock();
        try {
            if ((!zax() && !zaw()) || this.f15278OooO0o0.zaw()) {
                return false;
            }
            this.f15279OooO0oO.add(signInConnectionListener);
            if (this.f15284OooOOO == 0) {
                this.f15284OooOOO = 1;
            }
            this.f15282OooOO0O = null;
            this.f15278OooO0o0.zaq();
            return true;
        } finally {
            this.f15285OooOOO0.unlock();
        }
    }
}
