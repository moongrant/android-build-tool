package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p021OooOooo.Oooo0;
import p331o0O0oooO.o0O0OOO0;
import p331o0O0oooO.o0O0OOOo;
import p331o0O0oooO.o0O0o000;
import p331o0O0oooO.o0O0o00O;
import p331o0O0oooO.o0oOo0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class zabq<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f15382OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotOnlyInitialized
    public final Api.Client f15384OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final ApiKey<O> f15385OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final zaad f15386OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f15389OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final zact f15390OooO0oo;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f15394OooOOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Queue<zai> f15383OooO00o = new LinkedList();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Set<zal> f15388OooO0o0 = new HashSet();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<ListenerHolder.ListenerKey<?>, zaci> f15387OooO0o = new HashMap();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final List<o0O0o00O> f15391OooOO0 = new ArrayList();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public ConnectionResult f15392OooOO0O = null;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f15393OooOO0o = 0;

    @WorkerThread
    public zabq(GoogleApiManager googleApiManager, GoogleApi<O> googleApi) {
        this.f15394OooOOO0 = googleApiManager;
        Api.Client clientZab = googleApi.zab(googleApiManager.f15244OoooOoO.getLooper(), this);
        this.f15384OooO0O0 = clientZab;
        this.f15385OooO0OO = googleApi.getApiKey();
        this.f15386OooO0Oo = new zaad();
        this.f15389OooO0oO = googleApi.zaa();
        if (clientZab.requiresSignIn()) {
            this.f15390OooO0oo = googleApi.zac(googleApiManager.f15238OoooO00, googleApiManager.f15244OoooOoO);
        } else {
            this.f15390OooO0oo = null;
        }
    }

    @WorkerThread
    public final void OooO(zai zaiVar) {
        zaiVar.zag(this.f15386OooO0Oo, zaz());
        try {
            zaiVar.zaf(this);
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            this.f15384OooO0O0.disconnect("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    @WorkerThread
    public final Feature OooO00o(@Nullable Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.f15384OooO0O0.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            Oooo0 oooo0 = new Oooo0(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                oooo0.put(feature.getName(), Long.valueOf(feature.getVersion()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) oooo0.getOrDefault(feature2.getName(), null);
                if (l == null || l.longValue() < feature2.getVersion()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.internal.zal>] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.internal.zal>] */
    @WorkerThread
    public final void OooO0O0(ConnectionResult connectionResult) {
        Iterator it = this.f15388OooO0o0.iterator();
        while (it.hasNext()) {
            ((zal) it.next()).zac(this.f15385OooO0OO, connectionResult, Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS) ? this.f15384OooO0O0.getEndpointPackageName() : null);
        }
        this.f15388OooO0o0.clear();
    }

    @WorkerThread
    public final void OooO0OO(Status status) {
        Preconditions.checkHandlerThread(this.f15394OooOOO0.f15244OoooOoO);
        OooO0Oo(status, null, false);
    }

    @WorkerThread
    public final void OooO0Oo(@Nullable Status status, @Nullable Exception exc, boolean z) {
        Preconditions.checkHandlerThread(this.f15394OooOOO0.f15244OoooOoO);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator<zai> it = this.f15383OooO00o.iterator();
        while (it.hasNext()) {
            zai next = it.next();
            if (!z || next.zac == 2) {
                if (status != null) {
                    next.zad(status);
                } else {
                    next.zae(exc);
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<?>, com.google.android.gms.common.api.internal.zaci>] */
    @WorkerThread
    public final void OooO0o() {
        zan();
        OooO0O0(ConnectionResult.RESULT_SUCCESS);
        OooOO0();
        Iterator it = this.f15387OooO0o.values().iterator();
        while (it.hasNext()) {
            zaci zaciVar = (zaci) it.next();
            if (OooO00o(zaciVar.zaa.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    zaciVar.zaa.OooO00o(this.f15384OooO0O0, new TaskCompletionSource<>());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    this.f15384OooO0O0.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        OooO0o0();
        OooO0oo();
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.LinkedList, java.util.Queue<com.google.android.gms.common.api.internal.zai>] */
    @WorkerThread
    public final void OooO0o0() {
        ArrayList arrayList = new ArrayList(this.f15383OooO00o);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zai zaiVar = (zai) arrayList.get(i);
            if (!this.f15384OooO0O0.isConnected()) {
                return;
            }
            if (OooOO0O(zaiVar)) {
                this.f15383OooO00o.remove(zaiVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<?>, com.google.android.gms.common.api.internal.zaci>] */
    @WorkerThread
    public final void OooO0oO(int i) {
        zan();
        this.f15382OooO = true;
        zaad zaadVar = this.f15386OooO0Oo;
        String lastDisconnectMessage = this.f15384OooO0O0.getLastDisconnectMessage();
        java.util.Objects.requireNonNull(zaadVar);
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        zaadVar.OooO00o(true, new Status(20, sb.toString()));
        zaq zaqVar = this.f15394OooOOO0.f15244OoooOoO;
        Message messageObtain = Message.obtain(zaqVar, 9, this.f15385OooO0OO);
        java.util.Objects.requireNonNull(this.f15394OooOOO0);
        zaqVar.sendMessageDelayed(messageObtain, 5000L);
        zaq zaqVar2 = this.f15394OooOOO0.f15244OoooOoO;
        Message messageObtain2 = Message.obtain(zaqVar2, 11, this.f15385OooO0OO);
        java.util.Objects.requireNonNull(this.f15394OooOOO0);
        zaqVar2.sendMessageDelayed(messageObtain2, 120000L);
        this.f15394OooOOO0.f15239OoooO0O.zac();
        Iterator it = this.f15387OooO0o.values().iterator();
        while (it.hasNext()) {
            ((zaci) it.next()).zac.run();
        }
    }

    public final void OooO0oo() {
        this.f15394OooOOO0.f15244OoooOoO.removeMessages(12, this.f15385OooO0OO);
        zaq zaqVar = this.f15394OooOOO0.f15244OoooOoO;
        zaqVar.sendMessageDelayed(zaqVar.obtainMessage(12, this.f15385OooO0OO), this.f15394OooOOO0.f15233Oooo0o);
    }

    @WorkerThread
    public final void OooOO0() {
        if (this.f15382OooO) {
            this.f15394OooOOO0.f15244OoooOoO.removeMessages(11, this.f15385OooO0OO);
            this.f15394OooOOO0.f15244OoooOoO.removeMessages(9, this.f15385OooO0OO);
            this.f15382OooO = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<o0O0oooO.o0O0o00O>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<o0O0oooO.o0O0o00O>] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.util.ArrayList, java.util.List<o0O0oooO.o0O0o00O>] */
    @WorkerThread
    public final boolean OooOO0O(zai zaiVar) {
        if (!(zaiVar instanceof zac)) {
            OooO(zaiVar);
            return true;
        }
        zac zacVar = (zac) zaiVar;
        Feature featureOooO00o = OooO00o(zacVar.zab(this));
        if (featureOooO00o == null) {
            OooO(zaiVar);
            return true;
        }
        String name = this.f15384OooO0O0.getClass().getName();
        String name2 = featureOooO00o.getName();
        long version = featureOooO00o.getVersion();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(name2).length());
        OooO0O0.OooO0O0.OooO00o(sb, name, " could not execute call because it requires feature (", name2, ", ");
        sb.append(version);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f15394OooOOO0.f15245OoooOoo || !zacVar.zaa(this)) {
            zacVar.zae(new UnsupportedApiCallException(featureOooO00o));
            return true;
        }
        o0O0o00O o0o0o00o = new o0O0o00O(this.f15385OooO0OO, featureOooO00o);
        int iIndexOf = this.f15391OooOO0.indexOf(o0o0o00o);
        if (iIndexOf >= 0) {
            o0O0o00O o0o0o00o2 = (o0O0o00O) this.f15391OooOO0.get(iIndexOf);
            this.f15394OooOOO0.f15244OoooOoO.removeMessages(15, o0o0o00o2);
            zaq zaqVar = this.f15394OooOOO0.f15244OoooOoO;
            Message messageObtain = Message.obtain(zaqVar, 15, o0o0o00o2);
            java.util.Objects.requireNonNull(this.f15394OooOOO0);
            zaqVar.sendMessageDelayed(messageObtain, 5000L);
            return false;
        }
        this.f15391OooOO0.add(o0o0o00o);
        zaq zaqVar2 = this.f15394OooOOO0.f15244OoooOoO;
        Message messageObtain2 = Message.obtain(zaqVar2, 15, o0o0o00o);
        java.util.Objects.requireNonNull(this.f15394OooOOO0);
        zaqVar2.sendMessageDelayed(messageObtain2, 5000L);
        zaq zaqVar3 = this.f15394OooOOO0.f15244OoooOoO;
        Message messageObtain3 = Message.obtain(zaqVar3, 16, o0o0o00o);
        java.util.Objects.requireNonNull(this.f15394OooOOO0);
        zaqVar3.sendMessageDelayed(messageObtain3, 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (OooOO0o(connectionResult)) {
            return false;
        }
        this.f15394OooOOO0.OooO0O0(connectionResult, this.f15389OooO0oO);
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [OooOooo.o0OoOo0, java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>>] */
    @WorkerThread
    public final boolean OooOO0o(@NonNull ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.f15230Ooooo0o) {
            GoogleApiManager googleApiManager = this.f15394OooOOO0;
            if (googleApiManager.f15241OoooOOO == null || !googleApiManager.f15242OoooOOo.contains(this.f15385OooO0OO)) {
                return false;
            }
            this.f15394OooOOO0.f15241OoooOOO.zah(connectionResult, this.f15389OooO0oO);
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<?>, com.google.android.gms.common.api.internal.zaci>] */
    @WorkerThread
    public final boolean OooOOO0(boolean z) {
        Preconditions.checkHandlerThread(this.f15394OooOOO0.f15244OoooOoO);
        if (!this.f15384OooO0O0.isConnected() || this.f15387OooO0o.size() != 0) {
            return false;
        }
        zaad zaadVar = this.f15386OooO0Oo;
        if (!((zaadVar.f15311OooO00o.isEmpty() && zaadVar.f15312OooO0O0.isEmpty()) ? false : true)) {
            this.f15384OooO0O0.disconnect("Timing out service connection.");
            return true;
        }
        if (z) {
            OooO0oo();
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        if (Looper.myLooper() == this.f15394OooOOO0.f15244OoooOoO.getLooper()) {
            OooO0o();
        } else {
            this.f15394OooOOO0.f15244OoooOoO.post(new o0O0OOO0(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zar(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        if (Looper.myLooper() == this.f15394OooOOO0.f15244OoooOoO.getLooper()) {
            OooO0oO(i);
        } else {
            this.f15394OooOOO0.f15244OoooOoO.post(new o0O0OOOo(this, i));
        }
    }

    @WorkerThread
    public final boolean zaA() {
        return OooOOO0(true);
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
        throw null;
    }

    public final int zab() {
        return this.f15389OooO0oO;
    }

    @Nullable
    @WorkerThread
    public final ConnectionResult zad() {
        Preconditions.checkHandlerThread(this.f15394OooOOO0.f15244OoooOoO);
        return this.f15392OooOO0O;
    }

    public final Api.Client zaf() {
        return this.f15384OooO0O0;
    }

    public final Map<ListenerHolder.ListenerKey<?>, zaci> zah() {
        return this.f15387OooO0o;
    }

    @WorkerThread
    public final void zan() {
        Preconditions.checkHandlerThread(this.f15394OooOOO0.f15244OoooOoO);
        this.f15392OooOO0O = null;
    }

    @WorkerThread
    public final void zao() {
        Preconditions.checkHandlerThread(this.f15394OooOOO0.f15244OoooOoO);
        if (this.f15384OooO0O0.isConnected() || this.f15384OooO0O0.isConnecting()) {
            return;
        }
        try {
            GoogleApiManager googleApiManager = this.f15394OooOOO0;
            int iZab = googleApiManager.f15239OoooO0O.zab(googleApiManager.f15238OoooO00, this.f15384OooO0O0);
            if (iZab == 0) {
                GoogleApiManager googleApiManager2 = this.f15394OooOOO0;
                Api.Client client = this.f15384OooO0O0;
                o0oOo0O0 o0ooo0o1 = new o0oOo0O0(googleApiManager2, client, this.f15385OooO0OO);
                if (client.requiresSignIn()) {
                    ((zact) Preconditions.checkNotNull(this.f15390OooO0oo)).zae(o0ooo0o1);
                }
                try {
                    this.f15384OooO0O0.connect(o0ooo0o1);
                    return;
                } catch (SecurityException e) {
                    zar(new ConnectionResult(10), e);
                    return;
                }
            }
            ConnectionResult connectionResult = new ConnectionResult(iZab, null);
            String name = this.f15384OooO0O0.getClass().getName();
            String string = connectionResult.toString();
            StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
            sb.append("The service for ");
            sb.append(name);
            sb.append(" is not available: ");
            sb.append(string);
            Log.w("GoogleApiManager", sb.toString());
            zar(connectionResult, null);
        } catch (IllegalStateException e2) {
            zar(new ConnectionResult(10), e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedList, java.util.Queue<com.google.android.gms.common.api.internal.zai>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.LinkedList, java.util.Queue<com.google.android.gms.common.api.internal.zai>] */
    @WorkerThread
    public final void zap(zai zaiVar) {
        Preconditions.checkHandlerThread(this.f15394OooOOO0.f15244OoooOoO);
        if (this.f15384OooO0O0.isConnected()) {
            if (OooOO0O(zaiVar)) {
                OooO0oo();
                return;
            } else {
                this.f15383OooO00o.add(zaiVar);
                return;
            }
        }
        this.f15383OooO00o.add(zaiVar);
        ConnectionResult connectionResult = this.f15392OooOO0O;
        if (connectionResult == null || !connectionResult.hasResolution()) {
            zao();
        } else {
            zar(this.f15392OooOO0O, null);
        }
    }

    @WorkerThread
    public final void zar(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
        Preconditions.checkHandlerThread(this.f15394OooOOO0.f15244OoooOoO);
        zact zactVar = this.f15390OooO0oo;
        if (zactVar != null) {
            zactVar.zaf();
        }
        zan();
        this.f15394OooOOO0.f15239OoooO0O.zac();
        OooO0O0(connectionResult);
        if ((this.f15384OooO0O0 instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.getErrorCode() != 24) {
            GoogleApiManager googleApiManager = this.f15394OooOOO0;
            googleApiManager.f15234Oooo0oO = true;
            zaq zaqVar = googleApiManager.f15244OoooOoO;
            zaqVar.sendMessageDelayed(zaqVar.obtainMessage(19), 300000L);
        }
        if (connectionResult.getErrorCode() == 4) {
            OooO0OO(GoogleApiManager.f15229Ooooo00);
            return;
        }
        if (this.f15383OooO00o.isEmpty()) {
            this.f15392OooOO0O = connectionResult;
            return;
        }
        if (exc != null) {
            Preconditions.checkHandlerThread(this.f15394OooOOO0.f15244OoooOoO);
            OooO0Oo(null, exc, false);
            return;
        }
        if (!this.f15394OooOOO0.f15245OoooOoo) {
            OooO0OO(GoogleApiManager.OooO0OO(this.f15385OooO0OO, connectionResult));
            return;
        }
        OooO0Oo(GoogleApiManager.OooO0OO(this.f15385OooO0OO, connectionResult), null, true);
        if (this.f15383OooO00o.isEmpty() || OooOO0o(connectionResult) || this.f15394OooOOO0.OooO0O0(connectionResult, this.f15389OooO0oO)) {
            return;
        }
        if (connectionResult.getErrorCode() == 18) {
            this.f15382OooO = true;
        }
        if (!this.f15382OooO) {
            OooO0OO(GoogleApiManager.OooO0OO(this.f15385OooO0OO, connectionResult));
            return;
        }
        zaq zaqVar2 = this.f15394OooOOO0.f15244OoooOoO;
        Message messageObtain = Message.obtain(zaqVar2, 9, this.f15385OooO0OO);
        java.util.Objects.requireNonNull(this.f15394OooOOO0);
        zaqVar2.sendMessageDelayed(messageObtain, 5000L);
    }

    @WorkerThread
    public final void zas(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(this.f15394OooOOO0.f15244OoooOoO);
        Api.Client client = this.f15384OooO0O0;
        String name = client.getClass().getName();
        String strValueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(name.length() + 25 + strValueOf.length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(strValueOf);
        client.disconnect(sb.toString());
        zar(connectionResult, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashSet, java.util.Set<com.google.android.gms.common.api.internal.zal>] */
    @WorkerThread
    public final void zat(zal zalVar) {
        Preconditions.checkHandlerThread(this.f15394OooOOO0.f15244OoooOoO);
        this.f15388OooO0o0.add(zalVar);
    }

    @WorkerThread
    public final void zau() {
        Preconditions.checkHandlerThread(this.f15394OooOOO0.f15244OoooOoO);
        if (this.f15382OooO) {
            zao();
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.HashMap, java.util.Map<com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey<?>, com.google.android.gms.common.api.internal.zaci>] */
    @WorkerThread
    public final void zav() {
        Preconditions.checkHandlerThread(this.f15394OooOOO0.f15244OoooOoO);
        OooO0OO(GoogleApiManager.zaa);
        this.f15386OooO0Oo.zaf();
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.f15387OooO0o.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            zap(new zah(listenerKey, new TaskCompletionSource()));
        }
        OooO0O0(new ConnectionResult(4));
        if (this.f15384OooO0O0.isConnected()) {
            this.f15384OooO0O0.onUserSignOut(new o0O0o000(this));
        }
    }

    @WorkerThread
    public final void zaw() {
        Preconditions.checkHandlerThread(this.f15394OooOOO0.f15244OoooOoO);
        if (this.f15382OooO) {
            OooOO0();
            GoogleApiManager googleApiManager = this.f15394OooOOO0;
            OooO0OO(googleApiManager.f15237OoooO0.isGooglePlayServicesAvailable(googleApiManager.f15238OoooO00) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f15384OooO0O0.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean zaz() {
        return this.f15384OooO0O0.requiresSignIn();
    }
}
