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
import java.util.Map;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p031OoooO0.o0OoOo0;
import p256o00ooOO0.o00OO;
import p256o00ooOO0.o00OO00O;
import p256o00ooOO0.o00OO0O0;
import p256o00ooOO0.o00OOO0;
import p256o00ooOO0.oo0O;

/* JADX INFO: loaded from: classes3.dex */
public final class zabq<O extends Api.ApiOptions> implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, zau {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ApiKey<O> f14406OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotOnlyInitialized
    public final Api.Client f14407OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final zaad f14408OooO0oO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f14410OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final zact f14411OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f14412OooOO0o;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final /* synthetic */ GoogleApiManager f14416OooOOOo;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedList f14405OooO0Oo = new LinkedList();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashSet f14409OooO0oo = new HashSet();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final HashMap f14404OooO = new HashMap();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ArrayList f14414OooOOO0 = new ArrayList();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public ConnectionResult f14413OooOOO = null;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f14415OooOOOO = 0;

    @WorkerThread
    public zabq(GoogleApiManager googleApiManager, GoogleApi<O> googleApi) {
        this.f14416OooOOOo = googleApiManager;
        Api.Client clientZab = googleApi.zab(googleApiManager.f14269OooOOo0.getLooper(), this);
        this.f14407OooO0o0 = clientZab;
        this.f14406OooO0o = googleApi.getApiKey();
        this.f14408OooO0oO = new zaad();
        this.f14410OooOO0 = googleApi.zaa();
        if (!clientZab.requiresSignIn()) {
            this.f14411OooOO0O = null;
        } else {
            this.f14411OooOO0O = googleApi.zac(googleApiManager.f14260OooO0oo, googleApiManager.f14269OooOOo0);
        }
    }

    @WorkerThread
    public final boolean OooO(zai zaiVar) {
        if (!(zaiVar instanceof zac)) {
            zaiVar.zag(this.f14408OooO0oO, zaz());
            try {
                zaiVar.zaf(this);
            } catch (DeadObjectException unused) {
                onConnectionSuspended(1);
                this.f14407OooO0o0.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        zac zacVar = (zac) zaiVar;
        Feature featureOooO00o = OooO00o(zacVar.zab(this));
        if (featureOooO00o == null) {
            zaiVar.zag(this.f14408OooO0oO, zaz());
            try {
                zaiVar.zaf(this);
            } catch (DeadObjectException unused2) {
                onConnectionSuspended(1);
                this.f14407OooO0o0.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        String name = this.f14407OooO0o0.getClass().getName();
        String name2 = featureOooO00o.getName();
        long version = featureOooO00o.getVersion();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(name2).length());
        OooO0OO.OooO0O0.OooO00o(sb, name, " could not execute call because it requires feature (", name2, ", ");
        sb.append(version);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f14416OooOOOo.f14268OooOOo || !zacVar.zaa(this)) {
            zacVar.zae(new UnsupportedApiCallException(featureOooO00o));
            return true;
        }
        o00OO o00oo2 = new o00OO(this.f14406OooO0o, featureOooO00o);
        int iIndexOf = this.f14414OooOOO0.indexOf(o00oo2);
        if (iIndexOf >= 0) {
            o00OO o00oo3 = (o00OO) this.f14414OooOOO0.get(iIndexOf);
            this.f14416OooOOOo.f14269OooOOo0.removeMessages(15, o00oo3);
            zaq zaqVar = this.f14416OooOOOo.f14269OooOOo0;
            Message messageObtain = Message.obtain(zaqVar, 15, o00oo3);
            this.f14416OooOOOo.getClass();
            zaqVar.sendMessageDelayed(messageObtain, 5000L);
            return false;
        }
        this.f14414OooOOO0.add(o00oo2);
        zaq zaqVar2 = this.f14416OooOOOo.f14269OooOOo0;
        Message messageObtain2 = Message.obtain(zaqVar2, 15, o00oo2);
        this.f14416OooOOOo.getClass();
        zaqVar2.sendMessageDelayed(messageObtain2, 5000L);
        zaq zaqVar3 = this.f14416OooOOOo.f14269OooOOo0;
        Message messageObtain3 = Message.obtain(zaqVar3, 16, o00oo2);
        this.f14416OooOOOo.getClass();
        zaqVar3.sendMessageDelayed(messageObtain3, 120000L);
        ConnectionResult connectionResult = new ConnectionResult(2, null);
        if (OooOO0(connectionResult)) {
            return false;
        }
        GoogleApiManager googleApiManager = this.f14416OooOOOo;
        googleApiManager.f14255OooO.zah(googleApiManager.f14260OooO0oo, connectionResult, this.f14410OooOO0);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    @WorkerThread
    public final Feature OooO00o(@Nullable Feature[] featureArr) {
        if (featureArr != null && featureArr.length != 0) {
            Feature[] availableFeatures = this.f14407OooO0o0.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            p190o00o0O.OooO oooO = new p190o00o0O.OooO(availableFeatures.length);
            for (Feature feature : availableFeatures) {
                oooO.put(feature.getName(), Long.valueOf(feature.getVersion()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) oooO.getOrDefault(feature2.getName(), null);
                if (l == null || l.longValue() < feature2.getVersion()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    @WorkerThread
    public final void OooO0O0(ConnectionResult connectionResult) {
        HashSet hashSet = this.f14409OooO0oo;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((zal) it.next()).zac(this.f14406OooO0o, connectionResult, Objects.equal(connectionResult, ConnectionResult.RESULT_SUCCESS) ? this.f14407OooO0o0.getEndpointPackageName() : null);
        }
        hashSet.clear();
    }

    @WorkerThread
    public final void OooO0OO(Status status) {
        Preconditions.checkHandlerThread(this.f14416OooOOOo.f14269OooOOo0);
        OooO0Oo(status, null, false);
    }

    @WorkerThread
    public final void OooO0Oo(@Nullable Status status, @Nullable Exception exc, boolean z) {
        Preconditions.checkHandlerThread(this.f14416OooOOOo.f14269OooOOo0);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f14405OooO0Oo.iterator();
        while (it.hasNext()) {
            zai zaiVar = (zai) it.next();
            if (!z || zaiVar.zac == 2) {
                if (status != null) {
                    zaiVar.zad(status);
                } else {
                    zaiVar.zae(exc);
                }
                it.remove();
            }
        }
    }

    @WorkerThread
    public final void OooO0o() {
        Api.Client client = this.f14407OooO0o0;
        zan();
        OooO0O0(ConnectionResult.RESULT_SUCCESS);
        if (this.f14412OooOO0o) {
            GoogleApiManager googleApiManager = this.f14416OooOOOo;
            zaq zaqVar = googleApiManager.f14269OooOOo0;
            ApiKey<O> apiKey = this.f14406OooO0o;
            zaqVar.removeMessages(11, apiKey);
            googleApiManager.f14269OooOOo0.removeMessages(9, apiKey);
            this.f14412OooOO0o = false;
        }
        Iterator it = this.f14404OooO.values().iterator();
        while (it.hasNext()) {
            zaci zaciVar = (zaci) it.next();
            if (OooO00o(zaciVar.zaa.getRequiredFeatures()) != null) {
                it.remove();
            } else {
                try {
                    zaciVar.zaa.OooO00o(client, new TaskCompletionSource());
                } catch (DeadObjectException unused) {
                    onConnectionSuspended(3);
                    client.disconnect("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        OooO0o0();
        OooO0oo();
    }

    @WorkerThread
    public final void OooO0o0() {
        LinkedList linkedList = this.f14405OooO0Oo;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            zai zaiVar = (zai) arrayList.get(i);
            if (!this.f14407OooO0o0.isConnected()) {
                return;
            }
            if (OooO(zaiVar)) {
                linkedList.remove(zaiVar);
            }
        }
    }

    @WorkerThread
    public final void OooO0oO(int i) {
        zan();
        this.f14412OooOO0o = true;
        String lastDisconnectMessage = this.f14407OooO0o0.getLastDisconnectMessage();
        zaad zaadVar = this.f14408OooO0oO;
        zaadVar.getClass();
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
        zaadVar.OooO00o(new Status(20, sb.toString()), true);
        GoogleApiManager googleApiManager = this.f14416OooOOOo;
        zaq zaqVar = googleApiManager.f14269OooOOo0;
        ApiKey<O> apiKey = this.f14406OooO0o;
        zaqVar.sendMessageDelayed(Message.obtain(zaqVar, 9, apiKey), 5000L);
        zaq zaqVar2 = googleApiManager.f14269OooOOo0;
        zaqVar2.sendMessageDelayed(Message.obtain(zaqVar2, 11, apiKey), 120000L);
        googleApiManager.f14261OooOO0.zac();
        Iterator it = this.f14404OooO.values().iterator();
        while (it.hasNext()) {
            ((zaci) it.next()).zac.run();
        }
    }

    public final void OooO0oo() {
        GoogleApiManager googleApiManager = this.f14416OooOOOo;
        zaq zaqVar = googleApiManager.f14269OooOOo0;
        ApiKey<O> apiKey = this.f14406OooO0o;
        zaqVar.removeMessages(12, apiKey);
        zaq zaqVar2 = googleApiManager.f14269OooOOo0;
        zaqVar2.sendMessageDelayed(zaqVar2.obtainMessage(12, apiKey), googleApiManager.f14256OooO0Oo);
    }

    @WorkerThread
    public final boolean OooOO0(@NonNull ConnectionResult connectionResult) {
        synchronized (GoogleApiManager.f14254OooOo00) {
            GoogleApiManager googleApiManager = this.f14416OooOOOo;
            if (googleApiManager.f14264OooOOO == null || !googleApiManager.f14266OooOOOO.contains(this.f14406OooO0o)) {
                return false;
            }
            this.f14416OooOOOo.f14264OooOOO.zah(connectionResult, this.f14410OooOO0);
            return true;
        }
    }

    @WorkerThread
    public final boolean OooOO0O(boolean z) {
        Preconditions.checkHandlerThread(this.f14416OooOOOo.f14269OooOOo0);
        Api.Client client = this.f14407OooO0o0;
        if (!client.isConnected() || this.f14404OooO.size() != 0) {
            return false;
        }
        zaad zaadVar = this.f14408OooO0oO;
        if (!((zaadVar.f14334OooO00o.isEmpty() && zaadVar.f14335OooO0O0.isEmpty()) ? false : true)) {
            client.disconnect("Timing out service connection.");
            return true;
        }
        if (z) {
            OooO0oo();
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        Looper looperMyLooper = Looper.myLooper();
        GoogleApiManager googleApiManager = this.f14416OooOOOo;
        if (looperMyLooper == googleApiManager.f14269OooOOo0.getLooper()) {
            OooO0o();
        } else {
            googleApiManager.f14269OooOOo0.post(new o00OO00O(this));
        }
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    @WorkerThread
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        zar(connectionResult, null);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        Looper looperMyLooper = Looper.myLooper();
        GoogleApiManager googleApiManager = this.f14416OooOOOo;
        if (looperMyLooper == googleApiManager.f14269OooOOo0.getLooper()) {
            OooO0oO(i);
        } else {
            googleApiManager.f14269OooOOo0.post(new o00OO0O0(this, i));
        }
    }

    @WorkerThread
    public final boolean zaA() {
        return OooOO0O(true);
    }

    @Override // com.google.android.gms.common.api.internal.zau
    public final void zaa(ConnectionResult connectionResult, Api<?> api, boolean z) {
        throw null;
    }

    public final int zab() {
        return this.f14410OooOO0;
    }

    @Nullable
    @WorkerThread
    public final ConnectionResult zad() {
        Preconditions.checkHandlerThread(this.f14416OooOOOo.f14269OooOOo0);
        return this.f14413OooOOO;
    }

    public final Api.Client zaf() {
        return this.f14407OooO0o0;
    }

    public final Map<ListenerHolder.ListenerKey<?>, zaci> zah() {
        return this.f14404OooO;
    }

    @WorkerThread
    public final void zan() {
        Preconditions.checkHandlerThread(this.f14416OooOOOo.f14269OooOOo0);
        this.f14413OooOOO = null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @WorkerThread
    public final void zao() {
        GoogleApiManager googleApiManager = this.f14416OooOOOo;
        Preconditions.checkHandlerThread(googleApiManager.f14269OooOOo0);
        Api.Client client = this.f14407OooO0o0;
        if (client.isConnected() || client.isConnecting()) {
            return;
        }
        try {
            int iZab = googleApiManager.f14261OooOO0.zab(googleApiManager.f14260OooO0oo, client);
            if (iZab == 0) {
                o00OOO0 o00ooo1 = new o00OOO0(googleApiManager, client, this.f14406OooO0o);
                if (client.requiresSignIn()) {
                    ((zact) Preconditions.checkNotNull(this.f14411OooOO0O)).zae(o00ooo1);
                }
                try {
                    client.connect(o00ooo1);
                    return;
                } catch (SecurityException e) {
                    zar(new ConnectionResult(10), e);
                    return;
                }
            }
            ConnectionResult connectionResult = new ConnectionResult(iZab, null);
            String name = client.getClass().getName();
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

    @WorkerThread
    public final void zap(zai zaiVar) {
        Preconditions.checkHandlerThread(this.f14416OooOOOo.f14269OooOOo0);
        boolean zIsConnected = this.f14407OooO0o0.isConnected();
        LinkedList linkedList = this.f14405OooO0Oo;
        if (zIsConnected) {
            if (OooO(zaiVar)) {
                OooO0oo();
                return;
            } else {
                linkedList.add(zaiVar);
                return;
            }
        }
        linkedList.add(zaiVar);
        ConnectionResult connectionResult = this.f14413OooOOO;
        if (connectionResult == null || !connectionResult.hasResolution()) {
            zao();
        } else {
            zar(this.f14413OooOOO, null);
        }
    }

    @WorkerThread
    public final void zar(@NonNull ConnectionResult connectionResult, @Nullable Exception exc) {
        Preconditions.checkHandlerThread(this.f14416OooOOOo.f14269OooOOo0);
        zact zactVar = this.f14411OooOO0O;
        if (zactVar != null) {
            zactVar.zaf();
        }
        zan();
        this.f14416OooOOOo.f14261OooOO0.zac();
        OooO0O0(connectionResult);
        if ((this.f14407OooO0o0 instanceof com.google.android.gms.common.internal.service.zap) && connectionResult.getErrorCode() != 24) {
            GoogleApiManager googleApiManager = this.f14416OooOOOo;
            googleApiManager.f14258OooO0o0 = true;
            zaq zaqVar = googleApiManager.f14269OooOOo0;
            zaqVar.sendMessageDelayed(zaqVar.obtainMessage(19), 300000L);
        }
        if (connectionResult.getErrorCode() == 4) {
            OooO0OO(GoogleApiManager.f14252OooOOoo);
            return;
        }
        if (this.f14405OooO0Oo.isEmpty()) {
            this.f14413OooOOO = connectionResult;
            return;
        }
        if (exc != null) {
            Preconditions.checkHandlerThread(this.f14416OooOOOo.f14269OooOOo0);
            OooO0Oo(null, exc, false);
            return;
        }
        if (!this.f14416OooOOOo.f14268OooOOo) {
            OooO0OO(GoogleApiManager.OooO0O0(this.f14406OooO0o, connectionResult));
            return;
        }
        OooO0Oo(GoogleApiManager.OooO0O0(this.f14406OooO0o, connectionResult), null, true);
        if (this.f14405OooO0Oo.isEmpty() || OooOO0(connectionResult)) {
            return;
        }
        GoogleApiManager googleApiManager2 = this.f14416OooOOOo;
        if (googleApiManager2.f14255OooO.zah(googleApiManager2.f14260OooO0oo, connectionResult, this.f14410OooOO0)) {
            return;
        }
        if (connectionResult.getErrorCode() == 18) {
            this.f14412OooOO0o = true;
        }
        if (!this.f14412OooOO0o) {
            OooO0OO(GoogleApiManager.OooO0O0(this.f14406OooO0o, connectionResult));
            return;
        }
        zaq zaqVar2 = this.f14416OooOOOo.f14269OooOOo0;
        Message messageObtain = Message.obtain(zaqVar2, 9, this.f14406OooO0o);
        this.f14416OooOOOo.getClass();
        zaqVar2.sendMessageDelayed(messageObtain, 5000L);
    }

    @WorkerThread
    public final void zas(@NonNull ConnectionResult connectionResult) {
        Preconditions.checkHandlerThread(this.f14416OooOOOo.f14269OooOOo0);
        Api.Client client = this.f14407OooO0o0;
        String name = client.getClass().getName();
        String strValueOf = String.valueOf(connectionResult);
        client.disconnect(o0OoOo0.OooO0OO(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        zar(connectionResult, null);
    }

    @WorkerThread
    public final void zat(zal zalVar) {
        Preconditions.checkHandlerThread(this.f14416OooOOOo.f14269OooOOo0);
        this.f14409OooO0oo.add(zalVar);
    }

    @WorkerThread
    public final void zau() {
        Preconditions.checkHandlerThread(this.f14416OooOOOo.f14269OooOOo0);
        if (this.f14412OooOO0o) {
            zao();
        }
    }

    @WorkerThread
    public final void zav() {
        Preconditions.checkHandlerThread(this.f14416OooOOOo.f14269OooOOo0);
        OooO0OO(GoogleApiManager.zaa);
        this.f14408OooO0oO.zaf();
        for (ListenerHolder.ListenerKey listenerKey : (ListenerHolder.ListenerKey[]) this.f14404OooO.keySet().toArray(new ListenerHolder.ListenerKey[0])) {
            zap(new zah(listenerKey, new TaskCompletionSource()));
        }
        OooO0O0(new ConnectionResult(4));
        Api.Client client = this.f14407OooO0o0;
        if (client.isConnected()) {
            client.onUserSignOut(new oo0O(this));
        }
    }

    @WorkerThread
    public final void zaw() {
        GoogleApiManager googleApiManager = this.f14416OooOOOo;
        Preconditions.checkHandlerThread(googleApiManager.f14269OooOOo0);
        boolean z = this.f14412OooOO0o;
        if (z) {
            if (z) {
                zaq zaqVar = googleApiManager.f14269OooOOo0;
                ApiKey<O> apiKey = this.f14406OooO0o;
                zaqVar.removeMessages(11, apiKey);
                googleApiManager.f14269OooOOo0.removeMessages(9, apiKey);
                this.f14412OooOO0o = false;
            }
            OooO0OO(googleApiManager.f14255OooO.isGooglePlayServicesAvailable(googleApiManager.f14260OooO0oo) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f14407OooO0o0.disconnect("Timing out connection while resuming.");
        }
    }

    public final boolean zaz() {
        return this.f14407OooO0o0.requiresSignIn();
    }
}
