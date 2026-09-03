package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.SignInOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p331o0O0oooO.o0O000Oo;
import p331o0O0oooO.o0O00O0o;
import p331o0O0oooO.o0O00OOO;
import p331o0O0oooO.o0OoO00O;
import p331o0O0oooO.o0OoOoOo;

/* JADX INFO: loaded from: classes2.dex */
public final class zaaw implements zabf {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zabi f15319OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Lock f15320OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f15321OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final GoogleApiAvailabilityLight f15322OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f15323OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public ConnectionResult f15324OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f15326OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public com.google.android.gms.signin.zae f15328OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f15329OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f15330OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f15331OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public IAccountAccessor f15332OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f15333OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final ClientSettings f15334OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f15335OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Map<Api<?>, Boolean> f15336OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f15338OooOo00;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f15325OooO0oO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Bundle f15318OooO = new Bundle();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Set<Api.AnyClientKey> f15327OooOO0 = new HashSet();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final ArrayList<Future<?>> f15337OooOo0 = new ArrayList<>();

    public zaaw(zabi zabiVar, @Nullable ClientSettings clientSettings, Map<Api<?>, Boolean> map, GoogleApiAvailabilityLight googleApiAvailabilityLight, @Nullable Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, Lock lock, Context context) {
        this.f15319OooO00o = zabiVar;
        this.f15334OooOOo = clientSettings;
        this.f15336OooOOoo = map;
        this.f15322OooO0Oo = googleApiAvailabilityLight;
        this.f15338OooOo00 = abstractClientBuilder;
        this.f15320OooO0O0 = lock;
        this.f15321OooO0OO = context;
    }

    public final void OooO() {
        ArrayList<Future<?>> arrayList = this.f15337OooOo0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).cancel(true);
        }
        this.f15337OooOo0.clear();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @GuardedBy("mLock")
    public final void OooO00o() {
        this.f15331OooOOO0 = false;
        this.f15319OooO00o.f15378OooOOO.f15356OooOOOo = Collections.emptySet();
        for (Api.AnyClientKey anyClientKey : this.f15327OooOO0) {
            if (!this.f15319OooO00o.f15373OooO0oO.containsKey(anyClientKey)) {
                this.f15319OooO00o.f15373OooO0oO.put((Api.AnyClientKey<?>) anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    @GuardedBy("mLock")
    public final void OooO0O0(boolean z) {
        com.google.android.gms.signin.zae zaeVar = this.f15328OooOO0O;
        if (zaeVar != null) {
            if (zaeVar.isConnected() && z) {
                zaeVar.zaa();
            }
            zaeVar.disconnect();
            this.f15332OooOOOO = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult>] */
    @GuardedBy("mLock")
    public final void OooO0OO() {
        zabi zabiVar = this.f15319OooO00o;
        zabiVar.f15367OooO00o.lock();
        try {
            zabiVar.f15378OooOOO.OooO0Oo();
            zabiVar.f15376OooOO0O = new zaaj(zabiVar);
            zabiVar.f15376OooOO0O.zad();
            zabiVar.f15368OooO0O0.signalAll();
            zabiVar.f15367OooO00o.unlock();
            zabj.zaa().execute(new o0OoOoOo(this));
            com.google.android.gms.signin.zae zaeVar = this.f15328OooOO0O;
            if (zaeVar != null) {
                if (this.f15333OooOOOo) {
                    zaeVar.zac((IAccountAccessor) Preconditions.checkNotNull(this.f15332OooOOOO), this.f15335OooOOo0);
                }
                OooO0O0(false);
            }
            Iterator it = this.f15319OooO00o.f15373OooO0oO.keySet().iterator();
            while (it.hasNext()) {
                ((Api.Client) Preconditions.checkNotNull(this.f15319OooO00o.f15371OooO0o.get((Api.AnyClientKey) it.next()))).disconnect();
            }
            this.f15319OooO00o.f15380OooOOOO.zab(this.f15318OooO.isEmpty() ? null : this.f15318OooO);
        } catch (Throwable th) {
            zabiVar.f15367OooO00o.unlock();
            throw th;
        }
    }

    @GuardedBy("mLock")
    public final void OooO0Oo(ConnectionResult connectionResult) {
        OooO();
        OooO0O0(!connectionResult.hasResolution());
        this.f15319OooO00o.OooO00o(connectionResult);
        this.f15319OooO00o.f15380OooOOOO.zaa(connectionResult);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult>] */
    @GuardedBy("mLock")
    public final void OooO0o() {
        if (this.f15326OooO0oo != 0) {
            return;
        }
        if (!this.f15331OooOOO0 || this.f15330OooOOO) {
            ArrayList arrayList = new ArrayList();
            this.f15325OooO0oO = 1;
            this.f15326OooO0oo = this.f15319OooO00o.f15371OooO0o.size();
            for (Api.AnyClientKey<?> anyClientKey : this.f15319OooO00o.f15371OooO0o.keySet()) {
                if (!this.f15319OooO00o.f15373OooO0oO.containsKey(anyClientKey)) {
                    arrayList.add(this.f15319OooO00o.f15371OooO0o.get(anyClientKey));
                } else if (OooO0oo()) {
                    OooO0OO();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f15337OooOo0.add(zabj.zaa().submit(new o0O00O0o(this, arrayList)));
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.api.Api$AnyClientKey<?>, com.google.android.gms.common.ConnectionResult>] */
    @GuardedBy("mLock")
    public final void OooO0o0(ConnectionResult connectionResult, Api<?> api, boolean z) {
        int priority = api.zac().getPriority();
        if ((!z || connectionResult.hasResolution() || this.f15322OooO0Oo.getErrorResolutionIntent(connectionResult.getErrorCode()) != null) && (this.f15324OooO0o0 == null || priority < this.f15323OooO0o)) {
            this.f15324OooO0o0 = connectionResult;
            this.f15323OooO0o = priority;
        }
        this.f15319OooO00o.f15373OooO0oO.put(api.zab(), connectionResult);
    }

    @GuardedBy("mLock")
    public final boolean OooO0oO(int i) {
        if (this.f15325OooO0oO == i) {
            return true;
        }
        Log.w("GACConnecting", this.f15319OooO00o.f15378OooOOO.OooO00o());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        o00O00O.OooO0OO.OooO0O0(33, "mRemainingConnections=", this.f15326OooO0oo, "GACConnecting");
        String str = this.f15325OooO0oO != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i == 0 ? "STEP_SERVICE_BINDINGS_AND_SIGN_IN" : "STEP_GETTING_REMOTE_SERVICE";
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 70);
        sb.append("GoogleApiClient connecting is in step ");
        sb.append(str);
        sb.append(" but received callback for step ");
        sb.append(str2);
        Log.e("GACConnecting", sb.toString(), new Exception());
        OooO0Oo(new ConnectionResult(8, null));
        return false;
    }

    @GuardedBy("mLock")
    public final boolean OooO0oo() {
        int i = this.f15326OooO0oo - 1;
        this.f15326OooO0oo = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.f15319OooO00o.f15378OooOOO.OooO00o());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            OooO0Oo(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f15324OooO0o0;
        if (connectionResult == null) {
            return true;
        }
        this.f15319OooO00o.f15379OooOOO0 = this.f15323OooO0o;
        OooO0Oo(connectionResult);
        return false;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        this.f15319OooO00o.f15378OooOOO.f15349OooO0oo.add((BaseImplementation.ApiMethodImpl<?, ?>) t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final void zad() {
        this.f15319OooO00o.f15373OooO0oO.clear();
        this.f15331OooOOO0 = false;
        this.f15324OooO0o0 = null;
        this.f15325OooO0oO = 0;
        this.f15329OooOO0o = true;
        this.f15330OooOOO = false;
        this.f15333OooOOOo = false;
        HashMap map = new HashMap();
        boolean z = false;
        for (Api<?> api : this.f15336OooOOoo.keySet()) {
            Api.Client client = (Api.Client) Preconditions.checkNotNull(this.f15319OooO00o.f15371OooO0o.get(api.zab()));
            z |= api.zac().getPriority() == 1;
            boolean zBooleanValue = this.f15336OooOOoo.get(api).booleanValue();
            if (client.requiresSignIn()) {
                this.f15331OooOOO0 = true;
                if (zBooleanValue) {
                    this.f15327OooOO0.add(api.zab());
                } else {
                    this.f15329OooOO0o = false;
                }
            }
            map.put(client, new o0O000Oo(this, api, zBooleanValue));
        }
        if (z) {
            this.f15331OooOOO0 = false;
        }
        if (this.f15331OooOOO0) {
            Preconditions.checkNotNull(this.f15334OooOOo);
            Preconditions.checkNotNull(this.f15338OooOo00);
            this.f15334OooOOo.zae(Integer.valueOf(System.identityHashCode(this.f15319OooO00o.f15378OooOOO)));
            o0O00OOO o0o00ooo2 = new o0O00OOO(this);
            Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = this.f15338OooOo00;
            Context context = this.f15321OooO0OO;
            Looper looper = this.f15319OooO00o.f15378OooOOO.getLooper();
            ClientSettings clientSettings = this.f15334OooOOo;
            this.f15328OooOO0O = abstractClientBuilder.buildClient(context, looper, clientSettings, clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) o0o00ooo2, (GoogleApiClient.OnConnectionFailedListener) o0o00ooo2);
        }
        this.f15326OooO0oo = this.f15319OooO00o.f15371OooO0o.size();
        this.f15337OooOo0.add(zabj.zaa().submit(new o0OoO00O(this, map)));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final void zag(@Nullable Bundle bundle) {
        if (OooO0oO(1)) {
            if (bundle != null) {
                this.f15318OooO.putAll(bundle);
            }
            if (OooO0oo()) {
                OooO0OO();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final void zah(ConnectionResult connectionResult, Api<?> api, boolean z) {
        if (OooO0oO(1)) {
            OooO0o0(connectionResult, api, z);
            if (OooO0oo()) {
                OooO0OO();
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final void zai(int i) {
        OooO0Oo(new ConnectionResult(8, null));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final boolean zaj() {
        OooO();
        OooO0O0(true);
        this.f15319OooO00o.OooO00o(null);
        return true;
    }
}
