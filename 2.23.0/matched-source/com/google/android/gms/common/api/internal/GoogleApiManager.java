package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.internal.base.zaq;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p188o00o0O.OooOOO0;
import p254o00ooOO0.o00OO0OO;
import p254o00ooOO0.o00OOO0;
import p254o00ooOO0.o00OOO00;
import p254o00ooOO0.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
@KeepForSdk
public class GoogleApiManager implements Handler.Callback {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public static GoogleApiManager f14729OooOo0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final GoogleApiAvailability f14731OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public TelemetryData f14733OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public TelemetryLoggingClient f14735OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Context f14736OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final com.google.android.gms.common.internal.zal f14737OooOO0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public volatile boolean f14744OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotOnlyInitialized
    public final zaq f14745OooOOo0;

    @NonNull
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final Status f14728OooOOoo = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final Object f14730OooOo00 = new Object();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f14732OooO0Oo = 10000;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f14734OooO0o0 = false;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final AtomicInteger f14738OooOO0O = new AtomicInteger(1);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final AtomicInteger f14739OooOO0o = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final ConcurrentHashMap f14741OooOOO0 = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public zaae f14740OooOOO = null;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @GuardedBy("lock")
    public final OooOOO0 f14742OooOOOO = new OooOOO0();

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final OooOOO0 f14743OooOOOo = new OooOOO0();

    @KeepForSdk
    public GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f14744OooOOo = true;
        this.f14736OooO0oo = context;
        zaq zaqVar = new zaq(looper, this);
        this.f14745OooOOo0 = zaqVar;
        this.f14731OooO = googleApiAvailability;
        this.f14737OooOO0 = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.f14744OooOOo = false;
        }
        zaqVar.sendMessage(zaqVar.obtainMessage(6));
    }

    public static Status OooO0O0(ApiKey<?> apiKey, ConnectionResult connectionResult) {
        String strZab = apiKey.zab();
        String strValueOf = String.valueOf(connectionResult);
        return new Status(connectionResult, androidx.compose.material.OooO00o.OooO0O0(new StringBuilder(String.valueOf(strZab).length() + 63 + strValueOf.length()), "API: ", strZab, " is not available on this device. Connection failed with: ", strValueOf));
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (f14730OooOo00) {
            GoogleApiManager googleApiManager = f14729OooOo0;
            if (googleApiManager != null) {
                googleApiManager.f14739OooOO0o.incrementAndGet();
                zaq zaqVar = googleApiManager.f14745OooOOo0;
                zaqVar.sendMessageAtFrontOfQueue(zaqVar.obtainMessage(10));
            }
        }
    }

    @NonNull
    public static GoogleApiManager zal() {
        GoogleApiManager googleApiManager;
        synchronized (f14730OooOo00) {
            Preconditions.checkNotNull(f14729OooOo0, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = f14729OooOo0;
        }
        return googleApiManager;
    }

    @NonNull
    public static GoogleApiManager zam(@NonNull Context context) {
        GoogleApiManager googleApiManager;
        synchronized (f14730OooOo00) {
            if (f14729OooOo0 == null) {
                f14729OooOo0 = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.getOrStartHandlerThread().getLooper(), GoogleApiAvailability.getInstance());
            }
            googleApiManager = f14729OooOo0;
        }
        return googleApiManager;
    }

    @WorkerThread
    public final boolean OooO00o() {
        if (this.f14734OooO0o0) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int iZaa = this.f14737OooOO0.zaa(this.f14736OooO0oo, 203400000);
        return iZaa == -1 || iZaa == 0;
    }

    @WorkerThread
    public final zabq<?> OooO0OO(GoogleApi<?> googleApi) {
        Object apiKey = googleApi.getApiKey();
        ConcurrentHashMap concurrentHashMap = this.f14741OooOOO0;
        zabq<?> zabqVar = (zabq) concurrentHashMap.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new zabq<>(this, googleApi);
            concurrentHashMap.put(apiKey, zabqVar);
        }
        if (zabqVar.zaz()) {
            this.f14743OooOOOo.add(apiKey);
        }
        zabqVar.zao();
        return zabqVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    public final <T> void OooO0Oo(TaskCompletionSource<T> taskCompletionSource, int i, GoogleApi googleApi) {
        o00OOO00 o00ooo01;
        if (i != 0) {
            ApiKey apiKey = googleApi.getApiKey();
            if (OooO00o()) {
                RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
                boolean methodTimingTelemetryEnabled = true;
                if (config != null) {
                    if (config.getMethodInvocationTelemetryEnabled()) {
                        boolean methodTimingTelemetryEnabled2 = config.getMethodTimingTelemetryEnabled();
                        zabq zabqVar = (zabq) this.f14741OooOOO0.get(apiKey);
                        if (zabqVar == null) {
                            methodTimingTelemetryEnabled = methodTimingTelemetryEnabled2;
                        } else if (zabqVar.zaf() instanceof BaseGmsClient) {
                            BaseGmsClient baseGmsClient = (BaseGmsClient) zabqVar.zaf();
                            if (!baseGmsClient.hasConnectionInfo() || baseGmsClient.isConnecting()) {
                                methodTimingTelemetryEnabled = methodTimingTelemetryEnabled2;
                            } else {
                                ConnectionTelemetryConfiguration connectionTelemetryConfigurationOooO00o = o00OOO00.OooO00o(zabqVar, baseGmsClient, i);
                                if (connectionTelemetryConfigurationOooO00o != null) {
                                    zabqVar.f14891OooOOOO++;
                                    methodTimingTelemetryEnabled = connectionTelemetryConfigurationOooO00o.getMethodTimingTelemetryEnabled();
                                }
                            }
                        }
                    }
                    o00ooo01 = null;
                }
                o00ooo01 = new o00OOO00(this, i, apiKey, methodTimingTelemetryEnabled ? System.currentTimeMillis() : 0L, methodTimingTelemetryEnabled ? SystemClock.elapsedRealtime() : 0L);
            } else {
                o00ooo01 = null;
            }
            if (o00ooo01 != null) {
                Task<T> task = taskCompletionSource.getTask();
                final zaq zaqVar = this.f14745OooOOo0;
                zaqVar.getClass();
                task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.zabk
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        zaqVar.post(runnable);
                    }
                }, o00ooo01);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0277  */
    /* JADX WARN: Code duplicated, block: B:110:0x027d  */
    /* JADX WARN: Code duplicated, block: B:111:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:112:0x02c0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler.Callback
    @WorkerThread
    public final boolean handleMessage(@NonNull Message message) {
        Feature[] featureArrZab;
        int i = message.what;
        zaq zaqVar = this.f14745OooOOo0;
        ConcurrentHashMap concurrentHashMap = this.f14741OooOOO0;
        Context context = this.f14736OooO0oo;
        zabq zabqVar = null;
        switch (i) {
            case 1:
                this.f14732OooO0Oo = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                zaqVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zaqVar.sendMessageDelayed(zaqVar.obtainMessage(12, (ApiKey) it.next()), this.f14732OooO0Oo);
                }
                return true;
            case 2:
                zal zalVar = (zal) message.obj;
                for (ApiKey<?> apiKey : zalVar.zab()) {
                    zabq zabqVar2 = (zabq) concurrentHashMap.get(apiKey);
                    if (zabqVar2 == null) {
                        zalVar.zac(apiKey, new ConnectionResult(13), null);
                        return true;
                    }
                    if (zabqVar2.f14883OooO0o0.isConnected()) {
                        zalVar.zac(apiKey, ConnectionResult.RESULT_SUCCESS, zabqVar2.zaf().getEndpointPackageName());
                    } else {
                        ConnectionResult connectionResultZad = zabqVar2.zad();
                        if (connectionResultZad != null) {
                            zalVar.zac(apiKey, connectionResultZad, null);
                        } else {
                            zabqVar2.zat(zalVar);
                            zabqVar2.zao();
                        }
                    }
                }
                return true;
            case 3:
                for (zabq zabqVar3 : concurrentHashMap.values()) {
                    zabqVar3.zan();
                    zabqVar3.zao();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zach zachVar = (zach) message.obj;
                zabq<?> zabqVarOooO0OO = (zabq) concurrentHashMap.get(zachVar.zac.getApiKey());
                if (zabqVarOooO0OO == null) {
                    zabqVarOooO0OO = OooO0OO(zachVar.zac);
                }
                if (!zabqVarOooO0OO.zaz() || this.f14739OooOO0o.get() == zachVar.zab) {
                    zabqVarOooO0OO.zap(zachVar.zaa);
                } else {
                    zachVar.zaa.zad(zaa);
                    zabqVarOooO0OO.zav();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                for (zabq zabqVar4 : concurrentHashMap.values()) {
                    if (zabqVar4.zab() == i2) {
                        zabqVar = zabqVar4;
                        if (zabqVar != null) {
                            StringBuilder sb = new StringBuilder(76);
                            sb.append("Could not find API instance ");
                            sb.append(i2);
                            sb.append(" while trying to fail enqueued calls.");
                            Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                        } else if (connectionResult.getErrorCode() == 13) {
                            String errorString = this.f14731OooO.getErrorString(connectionResult.getErrorCode());
                            String errorMessage = connectionResult.getErrorMessage();
                            zabqVar.OooO0OO(new Status(17, androidx.compose.material.OooO00o.OooO0O0(new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(errorMessage).length()), "Error resolution was canceled by the user, original error message: ", errorString, ": ", errorMessage)));
                        } else {
                            zabqVar.OooO0OO(OooO0O0(zabqVar.f14882OooO0o, connectionResult));
                        }
                        return true;
                    }
                }
                if (zabqVar != null) {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                } else if (connectionResult.getErrorCode() == 13) {
                    String errorString2 = this.f14731OooO.getErrorString(connectionResult.getErrorCode());
                    String errorMessage2 = connectionResult.getErrorMessage();
                    zabqVar.OooO0OO(new Status(17, androidx.compose.material.OooO00o.OooO0O0(new StringBuilder(String.valueOf(errorString2).length() + 69 + String.valueOf(errorMessage2).length()), "Error resolution was canceled by the user, original error message: ", errorString2, ": ", errorMessage2)));
                } else {
                    zabqVar.OooO0OO(OooO0O0(zabqVar.f14882OooO0o, connectionResult));
                }
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) context.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new OooO0OO(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.f14732OooO0Oo = 300000L;
                    }
                }
                return true;
            case 7:
                OooO0OO((GoogleApi) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((zabq) concurrentHashMap.get(message.obj)).zau();
                }
                return true;
            case 10:
                OooOOO0 oooOOO0 = this.f14743OooOOOo;
                oooOOO0.getClass();
                OooOOO0.OooO00o oooO00o = new OooOOO0.OooO00o();
                while (oooO00o.hasNext()) {
                    zabq zabqVar5 = (zabq) concurrentHashMap.remove((ApiKey) oooO00o.next());
                    if (zabqVar5 != null) {
                        zabqVar5.zav();
                    }
                }
                oooOOO0.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((zabq) concurrentHashMap.get(message.obj)).zaw();
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((zabq) concurrentHashMap.get(message.obj)).zaA();
                }
                return true;
            case 14:
                o0O0ooO o0o0ooo = (o0O0ooO) message.obj;
                ApiKey<?> apiKey2 = o0o0ooo.f41002OooO00o;
                boolean zContainsKey = concurrentHashMap.containsKey(apiKey2);
                TaskCompletionSource<Boolean> taskCompletionSource = o0o0ooo.f41003OooO0O0;
                if (zContainsKey) {
                    taskCompletionSource.setResult(Boolean.valueOf(((zabq) concurrentHashMap.get(apiKey2)).OooOO0O(false)));
                } else {
                    taskCompletionSource.setResult(Boolean.FALSE);
                }
                return true;
            case 15:
                o00OO0OO o00oo0oo = (o00OO0OO) message.obj;
                if (concurrentHashMap.containsKey(o00oo0oo.f40974OooO00o)) {
                    zabq zabqVar6 = (zabq) concurrentHashMap.get(o00oo0oo.f40974OooO00o);
                    if (zabqVar6.f14890OooOOO0.contains(o00oo0oo) && !zabqVar6.f14888OooOO0o) {
                        if (zabqVar6.f14883OooO0o0.isConnected()) {
                            zabqVar6.OooO0o0();
                        } else {
                            zabqVar6.zao();
                        }
                    }
                }
                return true;
            case 16:
                o00OO0OO o00oo0oo2 = (o00OO0OO) message.obj;
                if (concurrentHashMap.containsKey(o00oo0oo2.f40974OooO00o)) {
                    zabq<?> zabqVar7 = (zabq) concurrentHashMap.get(o00oo0oo2.f40974OooO00o);
                    if (zabqVar7.f14890OooOOO0.remove(o00oo0oo2)) {
                        GoogleApiManager googleApiManager = zabqVar7.f14892OooOOOo;
                        googleApiManager.f14745OooOOo0.removeMessages(15, o00oo0oo2);
                        googleApiManager.f14745OooOOo0.removeMessages(16, o00oo0oo2);
                        LinkedList linkedList = zabqVar7.f14881OooO0Oo;
                        ArrayList arrayList = new ArrayList(linkedList.size());
                        Iterator it2 = linkedList.iterator();
                        while (true) {
                            boolean zHasNext = it2.hasNext();
                            Feature feature = o00oo0oo2.f40975OooO0O0;
                            if (zHasNext) {
                                zai zaiVar = (zai) it2.next();
                                if ((zaiVar instanceof zac) && (featureArrZab = ((zac) zaiVar).zab(zabqVar7)) != null && ArrayUtils.contains(featureArrZab, feature)) {
                                    arrayList.add(zaiVar);
                                }
                            } else {
                                int size = arrayList.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    zai zaiVar2 = (zai) arrayList.get(i3);
                                    linkedList.remove(zaiVar2);
                                    zaiVar2.zae(new UnsupportedApiCallException(feature));
                                }
                            }
                        }
                    }
                }
                return true;
            case 17:
                TelemetryData telemetryData = this.f14733OooO0o;
                if (telemetryData != null) {
                    if (telemetryData.zaa() > 0 || OooO00o()) {
                        if (this.f14735OooO0oO == null) {
                            this.f14735OooO0oO = TelemetryLogging.getClient(context);
                        }
                        this.f14735OooO0oO.log(telemetryData);
                    }
                    this.f14733OooO0o = null;
                }
                return true;
            case 18:
                o00OOO0 o00ooo1 = (o00OOO0) message.obj;
                long j = o00ooo1.f40978OooO0OO;
                MethodInvocation methodInvocation = o00ooo1.f40976OooO00o;
                int i4 = o00ooo1.f40977OooO0O0;
                if (j == 0) {
                    TelemetryData telemetryData2 = new TelemetryData(i4, Arrays.asList(methodInvocation));
                    if (this.f14735OooO0oO == null) {
                        this.f14735OooO0oO = TelemetryLogging.getClient(context);
                    }
                    this.f14735OooO0oO.log(telemetryData2);
                } else {
                    TelemetryData telemetryData3 = this.f14733OooO0o;
                    if (telemetryData3 != null) {
                        List<MethodInvocation> listZab = telemetryData3.zab();
                        if (telemetryData3.zaa() != i4 || (listZab != null && listZab.size() >= o00ooo1.f40979OooO0Oo)) {
                            zaqVar.removeMessages(17);
                            TelemetryData telemetryData4 = this.f14733OooO0o;
                            if (telemetryData4 != null) {
                                if (telemetryData4.zaa() > 0 || OooO00o()) {
                                    if (this.f14735OooO0oO == null) {
                                        this.f14735OooO0oO = TelemetryLogging.getClient(context);
                                    }
                                    this.f14735OooO0oO.log(telemetryData4);
                                }
                                this.f14733OooO0o = null;
                            }
                        } else {
                            this.f14733OooO0o.zac(methodInvocation);
                        }
                    }
                    if (this.f14733OooO0o == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(methodInvocation);
                        this.f14733OooO0o = new TelemetryData(i4, arrayList2);
                        zaqVar.sendMessageDelayed(zaqVar.obtainMessage(17), o00ooo1.f40978OooO0OO);
                    }
                }
                return true;
            case 19:
                this.f14734OooO0o0 = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }

    public final void zaA() {
        zaq zaqVar = this.f14745OooOOo0;
        zaqVar.sendMessage(zaqVar.obtainMessage(3));
    }

    public final void zaB(@NonNull GoogleApi<?> googleApi) {
        zaq zaqVar = this.f14745OooOOo0;
        zaqVar.sendMessage(zaqVar.obtainMessage(7, googleApi));
    }

    public final void zaC(@NonNull zaae zaaeVar) {
        synchronized (f14730OooOo00) {
            if (this.f14740OooOOO != zaaeVar) {
                this.f14740OooOOO = zaaeVar;
                this.f14742OooOOOO.clear();
            }
            this.f14742OooOOOO.addAll(zaaeVar.f14812OooO);
        }
    }

    public final int zaa() {
        return this.f14738OooOO0O.getAndIncrement();
    }

    @NonNull
    public final Task<Map<ApiKey<?>, String>> zao(@NonNull Iterable<? extends HasApiKey<?>> iterable) {
        zal zalVar = new zal(iterable);
        zaq zaqVar = this.f14745OooOOo0;
        zaqVar.sendMessage(zaqVar.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    @NonNull
    public final Task<Boolean> zap(@NonNull GoogleApi<?> googleApi) {
        o0O0ooO o0o0ooo = new o0O0ooO(googleApi.getApiKey());
        zaq zaqVar = this.f14745OooOOo0;
        zaqVar.sendMessage(zaqVar.obtainMessage(14, o0o0ooo));
        return o0o0ooo.f41003OooO0O0.getTask();
    }

    @NonNull
    public final <O extends Api.ApiOptions> Task<Void> zaq(@NonNull GoogleApi<O> googleApi, @NonNull RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, @NonNull UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, @NonNull Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        OooO0Oo(taskCompletionSource, registerListenerMethod.zaa(), googleApi);
        zaf zafVar = new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource);
        zaq zaqVar = this.f14745OooOOo0;
        zaqVar.sendMessage(zaqVar.obtainMessage(8, new zach(zafVar, this.f14739OooOO0o.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    @NonNull
    public final <O extends Api.ApiOptions> Task<Boolean> zar(@NonNull GoogleApi<O> googleApi, @NonNull ListenerHolder.ListenerKey listenerKey, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        OooO0Oo(taskCompletionSource, i, googleApi);
        zah zahVar = new zah(listenerKey, taskCompletionSource);
        zaq zaqVar = this.f14745OooOOo0;
        zaqVar.sendMessage(zaqVar.obtainMessage(13, new zach(zahVar, this.f14739OooOO0o.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends Api.ApiOptions> void zaw(@NonNull GoogleApi<O> googleApi, int i, @NonNull BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zae zaeVar = new zae(i, apiMethodImpl);
        zaq zaqVar = this.f14745OooOOo0;
        zaqVar.sendMessage(zaqVar.obtainMessage(4, new zach(zaeVar, this.f14739OooOO0o.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, ResultT> void zax(@NonNull GoogleApi<O> googleApi, int i, @NonNull TaskApiCall<Api.AnyClient, ResultT> taskApiCall, @NonNull TaskCompletionSource<ResultT> taskCompletionSource, @NonNull StatusExceptionMapper statusExceptionMapper) {
        OooO0Oo(taskCompletionSource, taskApiCall.zaa(), googleApi);
        zag zagVar = new zag(i, taskApiCall, taskCompletionSource, statusExceptionMapper);
        zaq zaqVar = this.f14745OooOOo0;
        zaqVar.sendMessage(zaqVar.obtainMessage(4, new zach(zagVar, this.f14739OooOO0o.get(), googleApi)));
    }

    public final void zaz(@NonNull ConnectionResult connectionResult, int i) {
        if (this.f14731OooO.zah(this.f14736OooO0oo, connectionResult, i)) {
            return;
        }
        zaq zaqVar = this.f14745OooOOo0;
        zaqVar.sendMessage(zaqVar.obtainMessage(5, i, 0, connectionResult));
    }
}
