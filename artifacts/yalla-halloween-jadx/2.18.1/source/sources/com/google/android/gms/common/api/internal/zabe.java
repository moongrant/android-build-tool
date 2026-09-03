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
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import javax.annotation.concurrent.GuardedBy;
import p021OooOooo.Oooo0;
import p331o0O0oooO.o0O00o00;
import p331o0O0oooO.o0O00oO0;
import p331o0O0oooO.o0O0O0O;
import p331o0O0oooO.o0O0O0Oo;
import p331o0O0oooO.o0O0oo0o;
import p331o0O0oooO.o0oO0O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class zabe extends GoogleApiClient implements zabz {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f15341OooOoO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public volatile boolean f15342OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Lock f15343OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final com.google.android.gms.common.internal.zak f15344OooO0OO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Context f15346OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f15347OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Looper f15348OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f15350OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f15351OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o0O0oo0o f15352OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    @VisibleForTesting
    public zabx f15353OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final GoogleApiAvailability f15354OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Map<Api.AnyClientKey<?>, Api.Client> f15355OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public Set<Scope> f15356OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final Map<Api<?>, Boolean> f15357OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final ClientSettings f15358OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public final Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> f15359OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final zadc f15360OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final ArrayList<zat> f15361OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final ListenerHolders f15362OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public Integer f15363OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public Set<zada> f15364OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final o0O00o00 f15365OooOoO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public zaca f15345OooO0Oo = null;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @VisibleForTesting
    public final Queue<BaseImplementation.ApiMethodImpl<?, ?>> f15349OooO0oo = new LinkedList();

    public zabe(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder, Map<Api<?>, Boolean> map, List<GoogleApiClient.ConnectionCallbacks> list, List<GoogleApiClient.OnConnectionFailedListener> list2, Map<Api.AnyClientKey<?>, Api.Client> map2, int i, int i2, ArrayList<zat> arrayList) {
        this.f15350OooOO0 = true != ClientLibraryUtils.isPackageSide() ? 120000L : 10000L;
        this.f15351OooOO0O = 5000L;
        this.f15356OooOOOo = new HashSet();
        this.f15362OooOo00 = new ListenerHolders();
        this.f15363OooOo0O = null;
        this.f15364OooOo0o = null;
        o0O00o00 o0o00o01 = new o0O00o00(this);
        this.f15365OooOoO0 = o0o00o01;
        this.f15346OooO0o = context;
        this.f15343OooO0O0 = lock;
        this.f15344OooO0OO = new com.google.android.gms.common.internal.zak(looper, o0o00o01);
        this.f15348OooO0oO = looper;
        this.f15352OooOO0o = new o0O0oo0o(this, looper);
        this.f15354OooOOO0 = googleApiAvailability;
        this.f15347OooO0o0 = i;
        if (i >= 0) {
            this.f15363OooOo0O = Integer.valueOf(i2);
        }
        this.f15357OooOOo = map;
        this.f15355OooOOOO = map2;
        this.f15361OooOo0 = arrayList;
        this.f15360OooOo = new zadc();
        Iterator<GoogleApiClient.ConnectionCallbacks> it = list.iterator();
        while (it.hasNext()) {
            this.f15344OooO0OO.zaf(it.next());
        }
        Iterator<GoogleApiClient.OnConnectionFailedListener> it2 = list2.iterator();
        while (it2.hasNext()) {
            this.f15344OooO0OO.zag(it2.next());
        }
        this.f15358OooOOo0 = clientSettings;
        this.f15359OooOOoo = abstractClientBuilder;
    }

    public static String OooO0O0(int i) {
        if (i == 1) {
            return "SIGN_IN_MODE_REQUIRED";
        }
        if (i != 2) {
            return i != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE";
        }
        return "SIGN_IN_MODE_OPTIONAL";
    }

    public static /* bridge */ /* synthetic */ void OooO0OO(zabe zabeVar) {
        zabeVar.f15343OooO0O0.lock();
        try {
            if (zabeVar.f15342OooO) {
                zabeVar.OooO0o();
            }
        } finally {
            zabeVar.f15343OooO0O0.unlock();
        }
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
    public final boolean OooO0Oo() {
        if (!this.f15342OooO) {
            return false;
        }
        this.f15342OooO = false;
        this.f15352OooOO0o.removeMessages(2);
        this.f15352OooOO0o.removeMessages(1);
        zabx zabxVar = this.f15353OooOOO;
        if (zabxVar != null) {
            zabxVar.zab();
            this.f15353OooOOO = null;
        }
        return true;
    }

    @GuardedBy("mLock")
    public final void OooO0o() {
        this.f15344OooO0OO.zab();
        ((zaca) Preconditions.checkNotNull(this.f15345OooO0Oo)).zaq();
    }

    public final void OooO0o0(int i) {
        Integer num = this.f15363OooOo0O;
        if (num == null) {
            this.f15363OooOo0O = Integer.valueOf(i);
        } else if (num.intValue() != i) {
            String strOooO0O0 = OooO0O0(i);
            String strOooO0O1 = OooO0O0(this.f15363OooOo0O.intValue());
            StringBuilder sb = new StringBuilder(strOooO0O1.length() + strOooO0O0.length() + 51);
            sb.append("Cannot use sign-in mode: ");
            sb.append(strOooO0O0);
            sb.append(". Mode was already set to ");
            sb.append(strOooO0O1);
            throw new IllegalStateException(sb.toString());
        }
        if (this.f15345OooO0Oo != null) {
            return;
        }
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        for (Api.Client client : this.f15355OooOOOO.values()) {
            zRequiresSignIn |= client.requiresSignIn();
            zProvidesSignIn |= client.providesSignIn();
        }
        int iIntValue = this.f15363OooOo0O.intValue();
        if (iIntValue != 1) {
            if (iIntValue == 2 && zRequiresSignIn) {
                Context context = this.f15346OooO0o;
                Lock lock = this.f15343OooO0O0;
                Looper looper = this.f15348OooO0oO;
                GoogleApiAvailability googleApiAvailability = this.f15354OooOOO0;
                Map<Api.AnyClientKey<?>, Api.Client> map = this.f15355OooOOOO;
                ClientSettings clientSettings = this.f15358OooOOo0;
                Map<Api<?>, Boolean> map2 = this.f15357OooOOo;
                Api.AbstractClientBuilder<? extends com.google.android.gms.signin.zae, SignInOptions> abstractClientBuilder = this.f15359OooOOoo;
                ArrayList<zat> arrayList = this.f15361OooOo0;
                Oooo0 oooo0 = new Oooo0();
                Oooo0 oooo1 = new Oooo0();
                Iterator<Map.Entry<Api.AnyClientKey<?>, Api.Client>> it = map.entrySet().iterator();
                Api.Client client2 = null;
                while (it.hasNext()) {
                    Map.Entry<Api.AnyClientKey<?>, Api.Client> next = it.next();
                    Api.Client value = next.getValue();
                    Iterator<Map.Entry<Api.AnyClientKey<?>, Api.Client>> it2 = it;
                    if (true == value.providesSignIn()) {
                        client2 = value;
                    }
                    if (value.requiresSignIn()) {
                        oooo0.put(next.getKey(), value);
                    } else {
                        oooo1.put(next.getKey(), value);
                    }
                    it = it2;
                }
                Preconditions.checkState(!oooo0.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                Oooo0 oooo2 = new Oooo0();
                Oooo0 oooo3 = new Oooo0();
                Iterator<Api<?>> it3 = map2.keySet().iterator();
                while (it3.hasNext()) {
                    Api<?> next2 = it3.next();
                    Iterator<Api<?>> it4 = it3;
                    Api.AnyClientKey<?> anyClientKeyZab = next2.zab();
                    if (oooo0.containsKey(anyClientKeyZab)) {
                        oooo2.put(next2, map2.get(next2));
                    } else {
                        if (!oooo1.containsKey(anyClientKeyZab)) {
                            throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                        }
                        oooo3.put(next2, map2.get(next2));
                    }
                    it3 = it4;
                }
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    int i3 = size;
                    zat zatVar = arrayList.get(i2);
                    ArrayList<zat> arrayList4 = arrayList;
                    if (oooo2.containsKey(zatVar.zaa)) {
                        arrayList2.add(zatVar);
                    } else {
                        if (!oooo3.containsKey(zatVar.zaa)) {
                            throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                        }
                        arrayList3.add(zatVar);
                    }
                    i2++;
                    size = i3;
                    arrayList = arrayList4;
                }
                this.f15345OooO0Oo = new OooO00o(context, this, lock, looper, googleApiAvailability, oooo0, oooo1, clientSettings, abstractClientBuilder, client2, arrayList2, arrayList3, oooo2, oooo3);
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
        this.f15345OooO0Oo = new zabi(this.f15346OooO0o, this, this.f15343OooO0O0, this.f15348OooO0oO, this.f15354OooOOO0, this.f15355OooOOOO, this.f15358OooOOo0, this.f15357OooOOo, this.f15359OooOOoo, this.f15361OooOo0, this);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect() {
        boolean z = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.f15343OooO0O0.lock();
        try {
            if (this.f15347OooO0o0 >= 0) {
                if (this.f15363OooOo0O == null) {
                    z = false;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f15363OooOo0O;
                if (num == null) {
                    this.f15363OooOo0O = Integer.valueOf(zad(this.f15355OooOOOO.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            OooO0o0(((Integer) Preconditions.checkNotNull(this.f15363OooOo0O)).intValue());
            this.f15344OooO0OO.zab();
            ConnectionResult connectionResultZab = ((zaca) Preconditions.checkNotNull(this.f15345OooO0Oo)).zab();
            this.f15343OooO0O0.unlock();
            return connectionResultZab;
        } catch (Throwable th) {
            this.f15343OooO0O0.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.f15363OooOo0O;
        Preconditions.checkState(num == null || num.intValue() != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.f15355OooOOOO.containsKey(Common.CLIENT_KEY)) {
            Common.zaa.zaa(this).setResultCallback(new o0oO0O0o(this, statusPendingResult, false, this));
        } else {
            AtomicReference atomicReference = new AtomicReference();
            o0O00oO0 o0o00oo1 = new o0O00oO0(this, atomicReference, statusPendingResult);
            o0O0O0O o0o0o0o = new o0O0O0O(statusPendingResult);
            GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.f15346OooO0o);
            builder.addApi(Common.API);
            builder.addConnectionCallbacks(o0o00oo1);
            builder.addOnConnectionFailedListener(o0o0o0o);
            builder.setHandler(this.f15352OooOO0o);
            GoogleApiClient googleApiClientBuild = builder.build();
            atomicReference.set(googleApiClientBuild);
            googleApiClientBuild.connect();
        }
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        this.f15343OooO0O0.lock();
        try {
            int i = 2;
            boolean z = false;
            if (this.f15347OooO0o0 >= 0) {
                Preconditions.checkState(this.f15363OooOo0O != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.f15363OooOo0O;
                if (num == null) {
                    this.f15363OooOo0O = Integer.valueOf(zad(this.f15355OooOOOO.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int iIntValue = ((Integer) Preconditions.checkNotNull(this.f15363OooOo0O)).intValue();
            this.f15343OooO0O0.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i = iIntValue;
                    }
                    StringBuilder sb = new StringBuilder(33);
                    sb.append("Illegal sign-in mode: ");
                    sb.append(i);
                    Preconditions.checkArgument(z, sb.toString());
                    OooO0o0(i);
                    OooO0o();
                    this.f15343OooO0O0.unlock();
                    return;
                }
                i = iIntValue;
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Illegal sign-in mode: ");
                sb2.append(i);
                Preconditions.checkArgument(z, sb2.toString());
                OooO0o0(i);
                OooO0o();
                this.f15343OooO0O0.unlock();
                return;
            } finally {
                this.f15343OooO0O0.unlock();
            }
            z = true;
        } catch (Throwable th) {
            this.f15343OooO0O0.unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.LinkedList, java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>>] */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        Lock lock;
        this.f15343OooO0O0.lock();
        try {
            this.f15360OooOo.zab();
            zaca zacaVar = this.f15345OooO0Oo;
            if (zacaVar != null) {
                zacaVar.zar();
            }
            this.f15362OooOo00.zab();
            for (BaseImplementation.ApiMethodImpl<?, ?> apiMethodImpl : this.f15349OooO0oo) {
                apiMethodImpl.zan(null);
                apiMethodImpl.cancel();
            }
            this.f15349OooO0oo.clear();
            if (this.f15345OooO0Oo == null) {
                lock = this.f15343OooO0O0;
            } else {
                OooO0Oo();
                this.f15344OooO0OO.zaa();
                lock = this.f15343OooO0O0;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.f15343OooO0O0.unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.LinkedList, java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>>] */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.f15346OooO0o);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.f15342OooO);
        printWriter.append(" mWorkQueue.size()=").print(this.f15349OooO0oo.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f15360OooOo.f15418OooO00o.size());
        zaca zacaVar = this.f15345OooO0Oo;
        if (zacaVar != null) {
            zacaVar.zas(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.LinkedList, java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [T extends com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<R, A>] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(@NonNull T t) {
        Lock lock;
        ?? r5;
        Api<?> api = t.getApi();
        boolean zContainsKey = this.f15355OooOOOO.containsKey(t.getClientKey());
        String strZad = api != null ? api.zad() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(strZad).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(strZad);
        sb.append(" required for this call.");
        Preconditions.checkArgument(zContainsKey, sb.toString());
        this.f15343OooO0O0.lock();
        try {
            zaca zacaVar = this.f15345OooO0Oo;
            if (zacaVar == null) {
                this.f15349OooO0oo.add((BaseImplementation.ApiMethodImpl<?, ?>) t);
                lock = this.f15343OooO0O0;
                r5 = t;
            } else {
                boolean z = (T) zacaVar.zae(t);
                lock = this.f15343OooO0O0;
                r5 = z;
            }
            lock.unlock();
            return (T) r5;
        } catch (Throwable th) {
            this.f15343OooO0O0.unlock();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.LinkedList, java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>>] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.LinkedList, java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>>] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(@NonNull T t) {
        Lock lock;
        Api<?> api = t.getApi();
        boolean zContainsKey = this.f15355OooOOOO.containsKey(t.getClientKey());
        String strZad = api != null ? api.zad() : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(strZad).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(strZad);
        sb.append(" required for this call.");
        Preconditions.checkArgument(zContainsKey, sb.toString());
        this.f15343OooO0O0.lock();
        try {
            zaca zacaVar = this.f15345OooO0Oo;
            if (zacaVar == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f15342OooO) {
                this.f15349OooO0oo.add(t);
                while (!this.f15349OooO0oo.isEmpty()) {
                    BaseImplementation.ApiMethodImpl apiMethodImpl = (BaseImplementation.ApiMethodImpl) this.f15349OooO0oo.remove();
                    zadc zadcVar = this.f15360OooOo;
                    zadcVar.f15418OooO00o.add(apiMethodImpl);
                    apiMethodImpl.zan(zadcVar.f15419OooO0O0);
                    apiMethodImpl.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                }
                lock = this.f15343OooO0O0;
            } else {
                t = (T) zacaVar.zaf(t);
                lock = this.f15343OooO0O0;
            }
            lock.unlock();
            return t;
        } catch (Throwable th) {
            this.f15343OooO0O0.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final <C extends Api.Client> C getClient(@NonNull Api.AnyClientKey<C> anyClientKey) {
        C c = (C) this.f15355OooOOOO.get(anyClientKey);
        Preconditions.checkNotNull(c, "Appropriate Api was not requested.");
        return c;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @NonNull
    public final ConnectionResult getConnectionResult(@NonNull Api<?> api) {
        ConnectionResult connectionResult;
        Lock lock;
        this.f15343OooO0O0.lock();
        try {
            if (!isConnected() && !this.f15342OooO) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.f15355OooOOOO.containsKey(api.zab())) {
                throw new IllegalArgumentException(String.valueOf(api.zad()).concat(" was never registered with GoogleApiClient"));
            }
            ConnectionResult connectionResultZad = ((zaca) Preconditions.checkNotNull(this.f15345OooO0Oo)).zad(api);
            if (connectionResultZad != null) {
                this.f15343OooO0O0.unlock();
                return connectionResultZad;
            }
            if (this.f15342OooO) {
                connectionResult = ConnectionResult.RESULT_SUCCESS;
                lock = this.f15343OooO0O0;
            } else {
                Log.w("GoogleApiClientImpl", OooO00o());
                Log.wtf("GoogleApiClientImpl", String.valueOf(api.zad()).concat(" requested in getConnectionResult is not connected but is not present in the failed  connections map"), new Exception());
                connectionResult = new ConnectionResult(8, null);
                lock = this.f15343OooO0O0;
            }
            lock.unlock();
            return connectionResult;
        } catch (Throwable th) {
            this.f15343OooO0O0.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.f15346OooO0o;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.f15348OooO0oO;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(@NonNull Api<?> api) {
        return this.f15355OooOOOO.containsKey(api.zab());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(@NonNull Api<?> api) {
        Api.Client client;
        return isConnected() && (client = this.f15355OooOOOO.get(api.zab())) != null && client.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        zaca zacaVar = this.f15345OooO0Oo;
        return zacaVar != null && zacaVar.zaw();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        zaca zacaVar = this.f15345OooO0Oo;
        return zacaVar != null && zacaVar.zax();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.f15344OooO0OO.zaj(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.f15344OooO0OO.zak(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        zaca zacaVar = this.f15345OooO0Oo;
        return zacaVar != null && zacaVar.zay(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        zaca zacaVar = this.f15345OooO0Oo;
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
        this.f15344OooO0OO.zaf(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f15344OooO0OO.zag(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> ListenerHolder<L> registerListener(@NonNull L l) {
        this.f15343OooO0O0.lock();
        try {
            return this.f15362OooOo00.zaa(l, this.f15348OooO0oO, "NO_TYPE");
        } finally {
            this.f15343OooO0O0.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(@NonNull FragmentActivity fragmentActivity) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
        if (this.f15347OooO0o0 < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        zak.zaa(lifecycleActivity).zae(this.f15347OooO0o0);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(@NonNull GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f15344OooO0OO.zah(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(@NonNull GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f15344OooO0OO.zai(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("mLock")
    public final void zaa(ConnectionResult connectionResult) {
        if (!this.f15354OooOOO0.isPlayServicesPossiblyUpdating(this.f15346OooO0o, connectionResult.getErrorCode())) {
            OooO0Oo();
        }
        if (this.f15342OooO) {
            return;
        }
        this.f15344OooO0OO.zac(connectionResult);
        this.f15344OooO0OO.zaa();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.LinkedList, java.util.Queue<com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl<?, ?>>] */
    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("mLock")
    public final void zab(@Nullable Bundle bundle) {
        while (!this.f15349OooO0oo.isEmpty()) {
            execute((BaseImplementation.ApiMethodImpl) this.f15349OooO0oo.remove());
        }
        this.f15344OooO0OO.zad(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("mLock")
    public final void zac(int i, boolean z) {
        if (i == 1) {
            if (!z && !this.f15342OooO) {
                this.f15342OooO = true;
                if (this.f15353OooOOO == null && !ClientLibraryUtils.isPackageSide()) {
                    try {
                        this.f15353OooOOO = this.f15354OooOOO0.zac(this.f15346OooO0o.getApplicationContext(), new o0O0O0Oo(this));
                    } catch (SecurityException unused) {
                    }
                }
                o0O0oo0o o0o0oo0o = this.f15352OooOO0o;
                o0o0oo0o.sendMessageDelayed(o0o0oo0o.obtainMessage(1), this.f15350OooOO0);
                o0O0oo0o o0o0oo0o2 = this.f15352OooOO0o;
                o0o0oo0o2.sendMessageDelayed(o0o0oo0o2.obtainMessage(2), this.f15351OooOO0O);
            }
            i = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f15360OooOo.f15418OooO00o.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(zadc.zaa);
        }
        this.f15344OooO0OO.zae(i);
        this.f15344OooO0OO.zaa();
        if (i == 2) {
            OooO0o();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.internal.zada>] */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(zada zadaVar) {
        this.f15343OooO0O0.lock();
        try {
            if (this.f15364OooOo0o == null) {
                this.f15364OooOo0o = new HashSet();
            }
            this.f15364OooOo0o.add(zadaVar);
        } finally {
            this.f15343OooO0O0.unlock();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.internal.zada>] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.internal.zada>] */
    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(zada zadaVar) {
        this.f15343OooO0O0.lock();
        try {
            ?? r0 = this.f15364OooOo0o;
            if (r0 == 0) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            } else if (r0.remove(zadaVar)) {
                this.f15343OooO0O0.lock();
                try {
                    ?? r3 = this.f15364OooOo0o;
                    if (r3 == 0) {
                        this.f15343OooO0O0.unlock();
                    } else {
                        boolean z = !r3.isEmpty();
                        this.f15343OooO0O0.unlock();
                        if (!z) {
                        }
                    }
                    zaca zacaVar = this.f15345OooO0Oo;
                    if (zacaVar != null) {
                        zacaVar.zat();
                    }
                } finally {
                    this.f15343OooO0O0.unlock();
                }
            } else {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            }
        } catch (Throwable th) {
            this.f15343OooO0O0.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long j, @NonNull TimeUnit timeUnit) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.f15343OooO0O0.lock();
        try {
            Integer num = this.f15363OooOo0O;
            if (num == null) {
                this.f15363OooOo0O = Integer.valueOf(zad(this.f15355OooOOOO.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            OooO0o0(((Integer) Preconditions.checkNotNull(this.f15363OooOo0O)).intValue());
            this.f15344OooO0OO.zab();
            ConnectionResult connectionResultZac = ((zaca) Preconditions.checkNotNull(this.f15345OooO0Oo)).zac(j, timeUnit);
            this.f15343OooO0O0.unlock();
            return connectionResultZac;
        } catch (Throwable th) {
            this.f15343OooO0O0.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i) {
        this.f15343OooO0O0.lock();
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
            OooO0o0(i);
            OooO0o();
        } finally {
            this.f15343OooO0O0.unlock();
        }
    }
}
