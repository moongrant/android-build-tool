package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p031OoooO0.o0OoOo0;
import p256o00ooOO0.o00O0O0O;
import p256o00ooOO0.o00O0OO;
import p256o00ooOO0.o00O0OO0;
import p256o00ooOO0.o00O0OOO;
import p256o00ooOO0.oo0o0O0;
import p256o00ooOO0.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class zabe extends GoogleApiClient implements zabz {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f14364OooOoO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile boolean f14365OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Lock f14366OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.google.android.gms.common.internal.zak f14367OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f14369OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f14370OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Looper f14371OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f14373OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f14374OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o00O0OOO f14375OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    public zabx f14376OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final GoogleApiAvailability f14377OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Map<Api.AnyClientKey<?>, Api.Client> f14378OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Set<Scope> f14379OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final Map<Api<?>, Boolean> f14380OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final ClientSettings f14381OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f14382OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final zadc f14383OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final ArrayList<zat> f14384OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final ListenerHolders f14385OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public Integer f14386OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public HashSet f14387OooOo0o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public zaca f14368OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @VisibleForTesting
    public final LinkedList f14372OooO0oo = new LinkedList();

    public zabe(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<Api.AnyClientKey<?>, Api.Client> map2, int i, int i2, ArrayList<zat> arrayList) {
        this.f14373OooOO0 = true != ClientLibraryUtils.isPackageSide() ? 120000L : 10000L;
        this.f14374OooOO0O = 5000L;
        this.f14379OooOOOo = new HashSet();
        this.f14385OooOo00 = new ListenerHolders();
        this.f14386OooOo0O = null;
        this.f14387OooOo0o = null;
        o00O0O0O o00o0o0o2 = new o00O0O0O(this);
        this.f14369OooO0o = context;
        this.f14366OooO0O0 = lock;
        this.f14367OooO0OO = new com.google.android.gms.common.internal.zak(looper, o00o0o0o2);
        this.f14371OooO0oO = looper;
        this.f14375OooOO0o = new o00O0OOO(this, looper);
        this.f14377OooOOO0 = googleApiAvailability;
        this.f14370OooO0o0 = i;
        if (i >= 0) {
            this.f14386OooOo0O = Integer.valueOf(i2);
        }
        this.f14380OooOOo = map;
        this.f14378OooOOOO = map2;
        this.f14384OooOo0 = arrayList;
        this.f14383OooOo = new zadc();
        Iterator<GoogleApiClient.ConnectionCallbacks> it = list.iterator();
        while (it.hasNext()) {
            this.f14367OooO0OO.zaf(it.next());
        }
        Iterator<GoogleApiClient.OnConnectionFailedListener> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f14367OooO0OO.zag(it2.next());
        }
        this.f14381OooOOo0 = clientSettings;
        this.f14382OooOOoo = abstractClientBuilder;
    }

    public static int zad(Iterable<Api.Client> iterable, boolean z) {
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        for (Api.Client client : iterable) {
            zRequiresSignIn |= client.requiresSignIn();
            zProvidesSignIn |= client.providesSignIn();
        }
        if (zRequiresSignIn) {
            return (zProvidesSignIn && z) ? 2 : 1;
        }
        return 3;
    }

    public final String OooO00o() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @GuardedBy("mLock")
    public final boolean OooO0O0() {
        if (!this.f14365OooO) {
            return false;
        }
        this.f14365OooO = false;
        this.f14375OooOO0o.removeMessages(2);
        this.f14375OooOO0o.removeMessages(1);
        zabx zabxVar = this.f14376OooOOO;
        if (zabxVar != null) {
            zabxVar.zab();
            this.f14376OooOOO = null;
        }
        return true;
    }

    public final void OooO0OO(int i) {
        String str;
        Integer num = this.f14386OooOo0O;
        if (num == null) {
            this.f14386OooOo0O = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String str2 = "UNKNOWN";
            if (i == 1) {
                str = "SIGN_IN_MODE_REQUIRED";
            } else if (i != 2) {
                str = i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE";
            } else {
                str = "SIGN_IN_MODE_OPTIONAL";
            }
            int iIntValue = this.f14386OooOo0O.intValue();
            if (iIntValue == 1) {
                str2 = "SIGN_IN_MODE_REQUIRED";
            } else if (iIntValue == 2) {
                str2 = "SIGN_IN_MODE_OPTIONAL";
            } else if (iIntValue == 3) {
                str2 = "SIGN_IN_MODE_NONE";
            }
            throw new IllegalStateException(o0OoOo0.OooO0OO(new StringBuilder(str2.length() + str.length() + 51), "Cannot use sign-in mode: ", str, ". Mode was already set to ", str2));
        }
        if (this.f14368OooO0Oo != null) {
            return;
        }
        Map<Api.AnyClientKey<?>, Api.Client> map = this.f14378OooOOOO;
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        for (Api.Client client : map.values()) {
            zRequiresSignIn |= client.requiresSignIn();
            zProvidesSignIn |= client.providesSignIn();
        }
        int iIntValue2 = this.f14386OooOo0O.intValue();
        if (iIntValue2 != 1) {
            if (iIntValue2 == 2 && zRequiresSignIn) {
                Context context = this.f14369OooO0o;
                Lock lock = this.f14366OooO0O0;
                Looper looper = this.f14371OooO0oO;
                GoogleApiAvailability googleApiAvailability = this.f14377OooOOO0;
                ClientSettings clientSettings = this.f14381OooOOo0;
                Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = this.f14382OooOOoo;
                p190o00o0O.OooO oooO = new p190o00o0O.OooO();
                p190o00o0O.OooO oooO2 = new p190o00o0O.OooO();
                Api.Client client2 = null;
                for (Map.Entry<Api.AnyClientKey<?>, Api.Client> entry : map.entrySet()) {
                    Api.Client value = entry.getValue();
                    if (true == value.providesSignIn()) {
                        client2 = value;
                    }
                    if (value.requiresSignIn()) {
                        oooO.put(entry.getKey(), value);
                    } else {
                        oooO2.put(entry.getKey(), value);
                    }
                }
                Preconditions.checkState(!oooO.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                p190o00o0O.OooO oooO3 = new p190o00o0O.OooO();
                p190o00o0O.OooO oooO4 = new p190o00o0O.OooO();
                Map<Api<?>, Boolean> map2 = this.f14380OooOOo;
                for (Api<?> api : map2.keySet()) {
                    Api.AnyClientKey<?> anyClientKeyZab = api.zab();
                    if (oooO.containsKey(anyClientKeyZab)) {
                        oooO3.put(api, map2.get(api));
                    } else {
                        if (!oooO2.containsKey(anyClientKeyZab)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        oooO4.put(api, map2.get(api));
                    }
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<zat> arrayList3 = this.f14384OooOo0;
                int size = arrayList3.size();
                int i2 = 0;
                while (i2 < size) {
                    ArrayList<zat> arrayList4 = arrayList3;
                    zat zatVar = arrayList3.get(i2);
                    int i3 = size;
                    if (oooO3.containsKey(zatVar.zaa)) {
                        arrayList.add(zatVar);
                    } else {
                        if (!oooO4.containsKey(zatVar.zaa)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList2.add(zatVar);
                    }
                    i2++;
                    arrayList3 = arrayList4;
                    size = i3;
                }
                this.f14368OooO0Oo = new OooO00o(context, this, lock, looper, googleApiAvailability, oooO, oooO2, clientSettings, abstractClientBuilder, client2, arrayList, arrayList2, oooO3, oooO4);
                return;
            }
        } else {
            if (!zRequiresSignIn) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (zProvidesSignIn) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        }
        this.f14368OooO0Oo = new zabi(this.f14369OooO0o, this, this.f14366OooO0O0, this.f14371OooO0oO, this.f14377OooOOO0, this.f14378OooOOOO, this.f14381OooOOo0, this.f14380OooOOo, this.f14382OooOOoo, this.f14384OooOo0, this);
    }

    @GuardedBy("mLock")
    public final void OooO0Oo() {
        this.f14367OooO0OO.zab();
        ((zaca) Preconditions.checkNotNull(this.f14368OooO0Oo)).zaq();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect() {
        boolean z = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Lock lock = this.f14366OooO0O0;
        lock.lock();
        try {
            if (this.f14370OooO0o0 >= 0) {
                if (this.f14386OooOo0O == null) {
                    z = false;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f14386OooOo0O;
                if (num == null) {
                    this.f14386OooOo0O = Integer.valueOf(zad(this.f14378OooOOOO.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            OooO0OO(((Integer) Preconditions.checkNotNull(this.f14386OooOo0O)).intValue());
            this.f14367OooO0OO.zab();
            ConnectionResult connectionResultZab = ((zaca) Preconditions.checkNotNull(this.f14368OooO0Oo)).zab();
            lock.unlock();
            return connectionResultZab;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.f14386OooOo0O;
        Preconditions.checkState(num == null || num.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.f14378OooOOOO.containsKey(Common.CLIENT_KEY)) {
            Common.zaa.zaa(this).setResultCallback(new o00O0OO(this, statusPendingResult, this, false));
        } else {
            AtomicReference atomicReference = new AtomicReference();
            o00O0OO0 o00o0oo1 = new o00O0OO0(this, atomicReference, statusPendingResult);
            oo0o0O0 oo0o0o0 = new oo0o0O0(statusPendingResult);
            GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.f14369OooO0o);
            builder.addApi(Common.API);
            builder.addConnectionCallbacks(o00o0oo1);
            builder.addOnConnectionFailedListener(oo0o0o0);
            builder.setHandler(this.f14375OooOO0o);
            GoogleApiClient googleApiClientBuild = builder.build();
            atomicReference.set(googleApiClientBuild);
            googleApiClientBuild.connect();
        }
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        Lock lock = this.f14366OooO0O0;
        lock.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.f14370OooO0o0 >= 0) {
                Preconditions.checkState(this.f14386OooOo0O != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f14386OooOo0O;
                if (num == null) {
                    this.f14386OooOo0O = Integer.valueOf(zad(this.f14378OooOOOO.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int iIntValue = ((Integer) Preconditions.checkNotNull(this.f14386OooOo0O)).intValue();
            lock.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i = iIntValue;
                    }
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(i);
                    Preconditions.checkArgument(z, sb.toString());
                    OooO0OO(i);
                    OooO0Oo();
                    lock.unlock();
                    return;
                }
                i = iIntValue;
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i);
                Preconditions.checkArgument(z, sb2.toString());
                OooO0OO(i);
                OooO0Oo();
                lock.unlock();
                return;
            } finally {
                lock.unlock();
            }
            z = true;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        Lock lock = this.f14366OooO0O0;
        lock.lock();
        try {
            this.f14383OooOo.zab();
            zaca zacaVar = this.f14368OooO0Oo;
            if (zacaVar != null) {
                zacaVar.zar();
            }
            this.f14385OooOo00.zab();
            LinkedList<BaseImplementation.ApiMethodImpl> linkedList = this.f14372OooO0oo;
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : linkedList) {
                apiMethodImpl.zan(null);
                apiMethodImpl.cancel();
            }
            linkedList.clear();
            if (this.f14368OooO0Oo == null) {
                return;
            }
            OooO0O0();
            this.f14367OooO0OO.zaa();
        } finally {
            lock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f14369OooO0o);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f14365OooO);
        printWriter.append(" mWorkQueue.size()=").print(this.f14372OooO0oo.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f14383OooOo.f14440OooO00o.size());
        zaca zacaVar = this.f14368OooO0Oo;
        if (zacaVar != null) {
            zacaVar.zas(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        Api<?> api = t.getApi();
        boolean zContainsKey = this.f14378OooOOOO.containsKey(t.getClientKey());
        String strZad = api != null ? api.zad() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(strZad).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(strZad);
        sb.append(" required for this call.");
        Preconditions.checkArgument(zContainsKey, sb.toString());
        Lock lock = this.f14366OooO0O0;
        lock.lock();
        try {
            zaca zacaVar = this.f14368OooO0Oo;
            if (zacaVar != null) {
                return (T) zacaVar.zae(t);
            }
            this.f14372OooO0oo.add(t);
            return t;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        Lock lock;
        Api<?> api = t.getApi();
        boolean zContainsKey = this.f14378OooOOOO.containsKey(t.getClientKey());
        String strZad = api != null ? api.zad() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(strZad).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(strZad);
        sb.append(" required for this call.");
        Preconditions.checkArgument(zContainsKey, sb.toString());
        this.f14366OooO0O0.lock();
        try {
            zaca zacaVar = this.f14368OooO0Oo;
            if (zacaVar == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f14365OooO) {
                this.f14372OooO0oo.add(t);
                while (!this.f14372OooO0oo.isEmpty()) {
                    BaseImplementation.ApiMethodImpl apiMethodImpl = (BaseImplementation.ApiMethodImpl) this.f14372OooO0oo.remove();
                    zadc zadcVar = this.f14383OooOo;
                    zadcVar.f14440OooO00o.add(apiMethodImpl);
                    apiMethodImpl.zan(zadcVar.f14441OooO0O0);
                    apiMethodImpl.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                }
                lock = this.f14366OooO0O0;
            } else {
                t = (T) zacaVar.zaf(t);
                lock = this.f14366OooO0O0;
            }
            lock.unlock();
            return t;
        } catch (Throwable th) {
            this.f14366OooO0O0.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        C c = (C) this.f14378OooOOOO.get(anyClientKey);
        Preconditions.checkNotNull(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        ConnectionResult connectionResult;
        Lock lock;
        this.f14366OooO0O0.lock();
        try {
            if (!isConnected() && !this.f14365OooO) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.f14378OooOOOO.containsKey(api.zab())) {
                throw new IllegalArgumentException(String.valueOf(api.zad()).concat(" was never registered with GoogleApiClient"));
            }
            ConnectionResult connectionResultZad = ((zaca) Preconditions.checkNotNull(this.f14368OooO0Oo)).zad(api);
            if (connectionResultZad != null) {
                this.f14366OooO0O0.unlock();
                return connectionResultZad;
            }
            if (this.f14365OooO) {
                connectionResult = ConnectionResult.RESULT_SUCCESS;
                lock = this.f14366OooO0O0;
            } else {
                Log.w("GoogleApiClientImpl", OooO00o());
                Log.wtf("GoogleApiClientImpl", String.valueOf(api.zad()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
                connectionResult = new ConnectionResult(8, null);
                lock = this.f14366OooO0O0;
            }
            lock.unlock();
            return connectionResult;
        } catch (Throwable th) {
            this.f14366OooO0O0.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.f14369OooO0o;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.f14371OooO0oO;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(@NonNull Api<?> api) {
        return this.f14378OooOOOO.containsKey(api.zab());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(@NonNull Api<?> api) {
        Api.Client client;
        return isConnected() && (client = this.f14378OooOOOO.get(api.zab())) != null && client.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        zaca zacaVar = this.f14368OooO0Oo;
        return zacaVar != null && zacaVar.zaw();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        zaca zacaVar = this.f14368OooO0Oo;
        return zacaVar != null && zacaVar.zax();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.f14367OooO0OO.zaj(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.f14367OooO0OO.zak(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        zaca zacaVar = this.f14368OooO0Oo;
        return zacaVar != null && zacaVar.zay(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        zaca zacaVar = this.f14368OooO0Oo;
        if (zacaVar != null) {
            zacaVar.zau();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f14367OooO0OO.zaf(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f14367OooO0OO.zag(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> ListenerHolder<L> registerListener(@NonNull L l) {
        Lock lock = this.f14366OooO0O0;
        lock.lock();
        try {
            return this.f14385OooOo00.zaa(l, this.f14371OooO0oO, "NO_TYPE");
        } finally {
            lock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
        int i = this.f14370OooO0o0;
        if (i < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        zak.zaa(lifecycleActivity).zae(i);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f14367OooO0OO.zah(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f14367OooO0OO.zai(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("mLock")
    public final void zaa(ConnectionResult connectionResult) {
        if (!this.f14377OooOOO0.isPlayServicesPossiblyUpdating(this.f14369OooO0o, connectionResult.getErrorCode())) {
            OooO0O0();
        }
        if (this.f14365OooO) {
            return;
        }
        this.f14367OooO0OO.zac(connectionResult);
        this.f14367OooO0OO.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("mLock")
    public final void zab(@Nullable Bundle bundle) {
        while (true) {
            LinkedList linkedList = this.f14372OooO0oo;
            if (linkedList.isEmpty()) {
                this.f14367OooO0OO.zad(bundle);
                return;
            }
            execute((BaseImplementation.ApiMethodImpl) linkedList.remove());
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("mLock")
    public final void zac(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.f14365OooO) {
                this.f14365OooO = true;
                if (this.f14376OooOOO == null && !ClientLibraryUtils.isPackageSide()) {
                    try {
                        this.f14376OooOOO = this.f14377OooOOO0.zac(this.f14369OooO0o.getApplicationContext(), new oo0oOO0(this));
                    } catch (SecurityException unused) {
                    }
                }
                o00O0OOO o00o0ooo2 = this.f14375OooOO0o;
                o00o0ooo2.sendMessageDelayed(o00o0ooo2.obtainMessage(1), this.f14373OooOO0);
                o00O0OOO o00o0ooo3 = this.f14375OooOO0o;
                o00o0ooo3.sendMessageDelayed(o00o0ooo3.obtainMessage(2), this.f14374OooOO0O);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f14383OooOo.f14440OooO00o.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(zadc.zaa);
        }
        this.f14367OooO0OO.zae(i);
        this.f14367OooO0OO.zaa();
        if (i == 2) {
            OooO0Oo();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(zada zadaVar) {
        Lock lock = this.f14366OooO0O0;
        lock.lock();
        try {
            if (this.f14387OooOo0o == null) {
                this.f14387OooOo0o = new HashSet();
            }
            this.f14387OooOo0o.add(zadaVar);
        } finally {
            lock.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(zada zadaVar) {
        Lock lock = this.f14366OooO0O0;
        lock.lock();
        try {
            HashSet hashSet = this.f14387OooOo0o;
            if (hashSet == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (hashSet.remove(zadaVar)) {
                lock.lock();
                try {
                    HashSet hashSet2 = this.f14387OooOo0o;
                    if (hashSet2 == null) {
                        lock.unlock();
                    } else {
                        boolean z = !hashSet2.isEmpty();
                        lock.unlock();
                        if (!z) {
                        }
                    }
                    zaca zacaVar = this.f14368OooO0Oo;
                    if (zacaVar != null) {
                        zacaVar.zat();
                    }
                } finally {
                    lock.unlock();
                }
            } else {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            }
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        Lock lock = this.f14366OooO0O0;
        lock.lock();
        try {
            Integer num = this.f14386OooOo0O;
            if (num == null) {
                this.f14386OooOo0O = Integer.valueOf(zad(this.f14378OooOOOO.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            OooO0OO(((Integer) Preconditions.checkNotNull(this.f14386OooOo0O)).intValue());
            this.f14367OooO0OO.zab();
            ConnectionResult connectionResultZac = ((zaca) Preconditions.checkNotNull(this.f14368OooO0Oo)).zac(j, timeUnit);
            lock.unlock();
            return connectionResultZac;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i) {
        Lock lock = this.f14366OooO0O0;
        lock.lock();
        boolean z = true;
        if (i != 3 && i != 1) {
            if (i == 2) {
                i = 2;
            } else {
                z = false;
            }
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i);
            Preconditions.checkArgument(z, sb.toString());
            OooO0OO(i);
            OooO0Oo();
        } finally {
            lock.unlock();
        }
    }
}
