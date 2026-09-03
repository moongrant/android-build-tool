package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o000OOo0;
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
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p254o00ooOO0.o00O000;
import p254o00ooOO0.o00O00O;
import p254o00ooOO0.oOO00O;
import p254o00ooOO0.oo00o;

/* JADX INFO: loaded from: classes3.dex */
public final class zaaw implements zabf {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zabi f14818OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Lock f14819OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f14820OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final GoogleApiAvailabilityLight f14821OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14822OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public ConnectionResult f14823OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f14825OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public com.google.android.gms.signin.zae f14827OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f14828OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f14829OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f14830OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public IAccountAccessor f14831OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f14832OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final ClientSettings f14833OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f14834OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Map<Api<?>, Boolean> f14835OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f14837OooOo00;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f14824OooO0oO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Bundle f14817OooO = new Bundle();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final HashSet f14826OooOO0 = new HashSet();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final ArrayList<Future<?>> f14836OooOo0 = new ArrayList<>();

    public zaaw(zabi zabiVar, @Nullable ClientSettings clientSettings, Map<Api<?>, Boolean> map, GoogleApiAvailabilityLight googleApiAvailabilityLight, @Nullable Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, Lock lock, Context context) {
        this.f14818OooO00o = zabiVar;
        this.f14833OooOOo = clientSettings;
        this.f14835OooOOoo = map;
        this.f14821OooO0Oo = googleApiAvailabilityLight;
        this.f14837OooOo00 = abstractClientBuilder;
        this.f14819OooO0O0 = lock;
        this.f14820OooO0OO = context;
    }

    @GuardedBy("mLock")
    public final void OooO00o() {
        this.f14830OooOOO0 = false;
        zabi zabiVar = this.f14818OooO00o;
        zabiVar.f14878OooOOo0.f14855OooOOOo = Collections.emptySet();
        for (Api.AnyClientKey anyClientKey : this.f14826OooOO0) {
            HashMap map = zabiVar.f14870OooOO0;
            if (!map.containsKey(anyClientKey)) {
                map.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    @GuardedBy("mLock")
    public final void OooO0O0(boolean z) {
        com.google.android.gms.signin.zae zaeVar = this.f14827OooOO0O;
        if (zaeVar != null) {
            if (zaeVar.isConnected() && z) {
                zaeVar.zaa();
            }
            zaeVar.disconnect();
            this.f14831OooOOOO = null;
        }
    }

    @GuardedBy("mLock")
    public final void OooO0OO() {
        zabi zabiVar = this.f14818OooO00o;
        zabiVar.f14865OooO0Oo.lock();
        try {
            zabiVar.f14878OooOOo0.OooO0O0();
            zabiVar.f14873OooOOO = new zaaj(zabiVar);
            zabiVar.f14873OooOOO.zad();
            zabiVar.f14867OooO0o0.signalAll();
            zabiVar.f14865OooO0Oo.unlock();
            zabj.zaa().execute(new o000OOo0(this, 1));
            com.google.android.gms.signin.zae zaeVar = this.f14827OooOO0O;
            if (zaeVar != null) {
                if (this.f14832OooOOOo) {
                    zaeVar.zac((IAccountAccessor) Preconditions.checkNotNull(this.f14831OooOOOO), this.f14834OooOOo0);
                }
                OooO0O0(false);
            }
            Iterator it = this.f14818OooO00o.f14870OooOO0.keySet().iterator();
            while (it.hasNext()) {
                ((Api.Client) Preconditions.checkNotNull(this.f14818OooO00o.f14864OooO.get((Api.AnyClientKey) it.next()))).disconnect();
            }
            this.f14818OooO00o.f14877OooOOo.zab(this.f14817OooO.isEmpty() ? null : this.f14817OooO);
        } catch (Throwable th) {
            zabiVar.f14865OooO0Oo.unlock();
            throw th;
        }
    }

    @GuardedBy("mLock")
    public final void OooO0Oo(ConnectionResult connectionResult) {
        ArrayList<Future<?>> arrayList = this.f14836OooOo0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).cancel(true);
        }
        arrayList.clear();
        OooO0O0(!connectionResult.hasResolution());
        zabi zabiVar = this.f14818OooO00o;
        zabiVar.OooO00o(connectionResult);
        zabiVar.f14877OooOOo.zaa(connectionResult);
    }

    @GuardedBy("mLock")
    public final void OooO0o() {
        if (this.f14825OooO0oo != 0) {
            return;
        }
        if (!this.f14830OooOOO0 || this.f14829OooOOO) {
            ArrayList arrayList = new ArrayList();
            this.f14824OooO0oO = 1;
            zabi zabiVar = this.f14818OooO00o;
            this.f14825OooO0oo = zabiVar.f14864OooO.size();
            Map<Api.AnyClientKey<?>, Api.Client> map = zabiVar.f14864OooO;
            for (Api.AnyClientKey<?> anyClientKey : map.keySet()) {
                if (!zabiVar.f14870OooOO0.containsKey(anyClientKey)) {
                    arrayList.add(map.get(anyClientKey));
                } else if (OooO0oo()) {
                    OooO0OO();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f14836OooOo0.add(zabj.zaa().submit(new oOO00O(this, arrayList)));
        }
    }

    @GuardedBy("mLock")
    public final void OooO0o0(ConnectionResult connectionResult, Api<?> api, boolean z) {
        int priority = api.zac().getPriority();
        if ((!z || connectionResult.hasResolution() || this.f14821OooO0Oo.getErrorResolutionIntent(connectionResult.getErrorCode()) != null) && (this.f14823OooO0o0 == null || priority < this.f14822OooO0o)) {
            this.f14823OooO0o0 = connectionResult;
            this.f14822OooO0o = priority;
        }
        this.f14818OooO00o.f14870OooOO0.put(api.zab(), connectionResult);
    }

    @GuardedBy("mLock")
    public final boolean OooO0oO(int i) {
        if (this.f14824OooO0oO == i) {
            return true;
        }
        Log.w("GACConnecting", this.f14818OooO00o.f14878OooOOo0.OooO00o());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i2 = this.f14825OooO0oo;
        StringBuilder sb = new StringBuilder(33);
        sb.append("mRemainingConnections=");
        sb.append(i2);
        Log.w("GACConnecting", sb.toString());
        String str = this.f14824OooO0oO != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        String str2 = i == 0 ? "STEP_SERVICE_BINDINGS_AND_SIGN_IN" : "STEP_GETTING_REMOTE_SERVICE";
        StringBuilder sb2 = new StringBuilder(str2.length() + str.length() + 70);
        sb2.append("GoogleApiClient connecting is in step ");
        sb2.append(str);
        sb2.append(" but received callback for step ");
        sb2.append(str2);
        Log.e("GACConnecting", sb2.toString(), new Exception());
        OooO0Oo(new ConnectionResult(8, null));
        return false;
    }

    @GuardedBy("mLock")
    public final boolean OooO0oo() {
        int i = this.f14825OooO0oo - 1;
        this.f14825OooO0oo = i;
        if (i > 0) {
            return false;
        }
        zabi zabiVar = this.f14818OooO00o;
        if (i < 0) {
            Log.w("GACConnecting", zabiVar.f14878OooOOo0.OooO00o());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            OooO0Oo(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f14823OooO0o0;
        if (connectionResult == null) {
            return true;
        }
        zabiVar.f14876OooOOOo = this.f14822OooO0o;
        OooO0Oo(connectionResult);
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        this.f14818OooO00o.f14878OooOOo0.f14848OooO0oo.add(t);
        return t;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T zab(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.common.api.Api$Client, com.google.android.gms.signin.zae] */
    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final void zad() {
        Map<Api.AnyClientKey<?>, Api.Client> map;
        zabi zabiVar = this.f14818OooO00o;
        zabiVar.f14870OooOO0.clear();
        this.f14830OooOOO0 = false;
        this.f14823OooO0o0 = null;
        this.f14824OooO0oO = 0;
        this.f14828OooOO0o = true;
        this.f14829OooOOO = false;
        this.f14832OooOOOo = false;
        HashMap map2 = new HashMap();
        Map<Api<?>, Boolean> map3 = this.f14835OooOOoo;
        Iterator<Api<?>> it = map3.keySet().iterator();
        boolean z = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            map = zabiVar.f14864OooO;
            if (!zHasNext) {
                break;
            }
            Api<?> next = it.next();
            Api.Client client = (Api.Client) Preconditions.checkNotNull(map.get(next.zab()));
            z |= next.zac().getPriority() == 1;
            boolean zBooleanValue = map3.get(next).booleanValue();
            if (client.requiresSignIn()) {
                this.f14830OooOOO0 = true;
                if (zBooleanValue) {
                    this.f14826OooOO0.add(next.zab());
                } else {
                    this.f14828OooOO0o = false;
                }
            }
            map2.put(client, new o00O000(this, next, zBooleanValue));
        }
        if (z) {
            this.f14830OooOOO0 = false;
        }
        if (this.f14830OooOOO0) {
            ClientSettings clientSettings = this.f14833OooOOo;
            Preconditions.checkNotNull(clientSettings);
            Preconditions.checkNotNull(this.f14837OooOo00);
            zabe zabeVar = zabiVar.f14878OooOOo0;
            clientSettings.zae(Integer.valueOf(System.identityHashCode(zabeVar)));
            oo00o oo00oVar = new oo00o(this);
            this.f14827OooOO0O = this.f14837OooOo00.buildClient(this.f14820OooO0OO, zabeVar.getLooper(), clientSettings, clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) oo00oVar, (GoogleApiClient.OnConnectionFailedListener) oo00oVar);
        }
        this.f14825OooO0oo = map.size();
        this.f14836OooOo0.add(zabj.zaa().submit(new o00O00O(this, map2)));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final void zag(@Nullable Bundle bundle) {
        if (OooO0oO(1)) {
            if (bundle != null) {
                this.f14817OooO.putAll(bundle);
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
        ArrayList<Future<?>> arrayList = this.f14836OooOo0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).cancel(true);
        }
        arrayList.clear();
        OooO0O0(true);
        this.f14818OooO00o.OooO00o(null);
        return true;
    }
}
