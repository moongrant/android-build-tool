package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o000O0o;
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
import p256o00ooOO0.o00O00;
import p256o00ooOO0.o00O00OO;
import p256o00ooOO0.o00O00o0;
import p256o00ooOO0.o00O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class zaaw implements zabf {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final zabi f14342OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Lock f14343OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Context f14344OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final GoogleApiAvailabilityLight f14345OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f14346OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public ConnectionResult f14347OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f14349OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public com.google.android.gms.signin.zae f14351OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f14352OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f14353OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f14354OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @Nullable
    public IAccountAccessor f14355OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f14356OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public final ClientSettings f14357OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f14358OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Map<Api<?>, Boolean> f14359OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f14361OooOo00;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f14348OooO0oO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Bundle f14341OooO = new Bundle();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final HashSet f14350OooOO0 = new HashSet();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final ArrayList<Future<?>> f14360OooOo0 = new ArrayList<>();

    public zaaw(zabi zabiVar, @Nullable ClientSettings clientSettings, Map<Api<?>, Boolean> map, GoogleApiAvailabilityLight googleApiAvailabilityLight, @Nullable Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, Lock lock, Context context) {
        this.f14342OooO00o = zabiVar;
        this.f14357OooOOo = clientSettings;
        this.f14359OooOOoo = map;
        this.f14345OooO0Oo = googleApiAvailabilityLight;
        this.f14361OooOo00 = abstractClientBuilder;
        this.f14343OooO0O0 = lock;
        this.f14344OooO0OO = context;
    }

    @GuardedBy("mLock")
    public final void OooO00o() {
        this.f14354OooOOO0 = false;
        zabi zabiVar = this.f14342OooO00o;
        zabiVar.f14402OooOOo0.f14379OooOOOo = Collections.emptySet();
        for (Api.AnyClientKey anyClientKey : this.f14350OooOO0) {
            HashMap map = zabiVar.f14394OooOO0;
            if (!map.containsKey(anyClientKey)) {
                map.put(anyClientKey, new ConnectionResult(17, null));
            }
        }
    }

    @GuardedBy("mLock")
    public final void OooO0O0(boolean z) {
        com.google.android.gms.signin.zae zaeVar = this.f14351OooOO0O;
        if (zaeVar != null) {
            if (zaeVar.isConnected() && z) {
                zaeVar.zaa();
            }
            zaeVar.disconnect();
            this.f14355OooOOOO = null;
        }
    }

    @GuardedBy("mLock")
    public final void OooO0OO() {
        zabi zabiVar = this.f14342OooO00o;
        zabiVar.f14389OooO0Oo.lock();
        try {
            zabiVar.f14402OooOOo0.OooO0O0();
            zabiVar.f14397OooOOO = new zaaj(zabiVar);
            zabiVar.f14397OooOOO.zad();
            zabiVar.f14391OooO0o0.signalAll();
            zabiVar.f14389OooO0Oo.unlock();
            zabj.zaa().execute(new o000O0o(this, 1));
            com.google.android.gms.signin.zae zaeVar = this.f14351OooOO0O;
            if (zaeVar != null) {
                if (this.f14356OooOOOo) {
                    zaeVar.zac((IAccountAccessor) Preconditions.checkNotNull(this.f14355OooOOOO), this.f14358OooOOo0);
                }
                OooO0O0(false);
            }
            Iterator it = this.f14342OooO00o.f14394OooOO0.keySet().iterator();
            while (it.hasNext()) {
                ((Api.Client) Preconditions.checkNotNull(this.f14342OooO00o.f14388OooO.get((Api.AnyClientKey) it.next()))).disconnect();
            }
            this.f14342OooO00o.f14401OooOOo.zab(this.f14341OooO.isEmpty() ? null : this.f14341OooO);
        } catch (Throwable th) {
            zabiVar.f14389OooO0Oo.unlock();
            throw th;
        }
    }

    @GuardedBy("mLock")
    public final void OooO0Oo(ConnectionResult connectionResult) {
        ArrayList<Future<?>> arrayList = this.f14360OooOo0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).cancel(true);
        }
        arrayList.clear();
        OooO0O0(!connectionResult.hasResolution());
        zabi zabiVar = this.f14342OooO00o;
        zabiVar.OooO00o(connectionResult);
        zabiVar.f14401OooOOo.zaa(connectionResult);
    }

    @GuardedBy("mLock")
    public final void OooO0o() {
        if (this.f14349OooO0oo != 0) {
            return;
        }
        if (!this.f14354OooOOO0 || this.f14353OooOOO) {
            ArrayList arrayList = new ArrayList();
            this.f14348OooO0oO = 1;
            zabi zabiVar = this.f14342OooO00o;
            this.f14349OooO0oo = zabiVar.f14388OooO.size();
            Map<Api.AnyClientKey<?>, Api.Client> map = zabiVar.f14388OooO;
            for (Api.AnyClientKey<?> anyClientKey : map.keySet()) {
                if (!zabiVar.f14394OooOO0.containsKey(anyClientKey)) {
                    arrayList.add(map.get(anyClientKey));
                } else if (OooO0oo()) {
                    OooO0OO();
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.f14360OooOo0.add(zabj.zaa().submit(new o00O00o0(this, arrayList)));
        }
    }

    @GuardedBy("mLock")
    public final void OooO0o0(ConnectionResult connectionResult, Api<?> api, boolean z) {
        int priority = api.zac().getPriority();
        if ((!z || connectionResult.hasResolution() || this.f14345OooO0Oo.getErrorResolutionIntent(connectionResult.getErrorCode()) != null) && (this.f14347OooO0o0 == null || priority < this.f14346OooO0o)) {
            this.f14347OooO0o0 = connectionResult;
            this.f14346OooO0o = priority;
        }
        this.f14342OooO00o.f14394OooOO0.put(api.zab(), connectionResult);
    }

    @GuardedBy("mLock")
    public final boolean OooO0oO(int i) {
        if (this.f14348OooO0oO == i) {
            return true;
        }
        Log.w("GACConnecting", this.f14342OooO00o.f14402OooOOo0.OooO00o());
        Log.w("GACConnecting", "Unexpected callback in ".concat(toString()));
        int i2 = this.f14349OooO0oo;
        StringBuilder sb = new StringBuilder(33);
        sb.append("mRemainingConnections=");
        sb.append(i2);
        Log.w("GACConnecting", sb.toString());
        String str = this.f14348OooO0oO != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
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
        int i = this.f14349OooO0oo - 1;
        this.f14349OooO0oo = i;
        if (i > 0) {
            return false;
        }
        zabi zabiVar = this.f14342OooO00o;
        if (i < 0) {
            Log.w("GACConnecting", zabiVar.f14402OooOOo0.OooO00o());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            OooO0Oo(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.f14347OooO0o0;
        if (connectionResult == null) {
            return true;
        }
        zabiVar.f14400OooOOOo = this.f14346OooO0o;
        OooO0Oo(connectionResult);
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T zaa(T t) {
        this.f14342OooO00o.f14402OooOOo0.f14372OooO0oo.add(t);
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
        zabi zabiVar = this.f14342OooO00o;
        zabiVar.f14394OooOO0.clear();
        this.f14354OooOOO0 = false;
        this.f14347OooO0o0 = null;
        this.f14348OooO0oO = 0;
        this.f14352OooOO0o = true;
        this.f14353OooOOO = false;
        this.f14356OooOOOo = false;
        HashMap map2 = new HashMap();
        Map<Api<?>, Boolean> map3 = this.f14359OooOOoo;
        Iterator<Api<?>> it = map3.keySet().iterator();
        boolean z = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            map = zabiVar.f14388OooO;
            if (!zHasNext) {
                break;
            }
            Api<?> next = it.next();
            Api.Client client = (Api.Client) Preconditions.checkNotNull(map.get(next.zab()));
            z |= next.zac().getPriority() == 1;
            boolean zBooleanValue = map3.get(next).booleanValue();
            if (client.requiresSignIn()) {
                this.f14354OooOOO0 = true;
                if (zBooleanValue) {
                    this.f14350OooOO0.add(next.zab());
                } else {
                    this.f14352OooOO0o = false;
                }
            }
            map2.put(client, new o00O00(this, next, zBooleanValue));
        }
        if (z) {
            this.f14354OooOOO0 = false;
        }
        if (this.f14354OooOOO0) {
            ClientSettings clientSettings = this.f14357OooOOo;
            Preconditions.checkNotNull(clientSettings);
            Preconditions.checkNotNull(this.f14361OooOo00);
            zabe zabeVar = zabiVar.f14402OooOOo0;
            clientSettings.zae(Integer.valueOf(System.identityHashCode(zabeVar)));
            o00O0O00 o00o0o01 = new o00O0O00(this);
            this.f14351OooOO0O = this.f14361OooOo00.buildClient(this.f14344OooO0OO, zabeVar.getLooper(), clientSettings, clientSettings.zaa(), (GoogleApiClient.ConnectionCallbacks) o00o0o01, (GoogleApiClient.OnConnectionFailedListener) o00o0o01);
        }
        this.f14349OooO0oo = map.size();
        this.f14360OooOo0.add(zabj.zaa().submit(new o00O00OO(this, map2)));
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
    }

    @Override // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("mLock")
    public final void zag(@Nullable Bundle bundle) {
        if (OooO0oO(1)) {
            if (bundle != null) {
                this.f14341OooO.putAll(bundle);
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
        ArrayList<Future<?>> arrayList = this.f14360OooOo0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).cancel(true);
        }
        arrayList.clear();
        OooO0O0(true);
        this.f14342OooO00o.OooO00o(null);
        return true;
    }
}
