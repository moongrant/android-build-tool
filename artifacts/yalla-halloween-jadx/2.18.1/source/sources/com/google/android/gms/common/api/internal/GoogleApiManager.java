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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p021OooOooo.o0OoOo0;
import p331o0O0oooO.o0O;
import p331o0O0oooO.o0O000;
import p331o0O0oooO.o0O0o00O;
import p331o0O0oooO.o0O0oo00;

/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
public class GoogleApiManager implements Handler.Callback {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public static GoogleApiManager f15231OooooO0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public TelemetryLoggingClient f15232Oooo;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public TelemetryData f15235Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final GoogleApiAvailability f15237OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final Context f15238OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final com.google.android.gms.common.internal.zal f15239OoooO0O;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotOnlyInitialized
    public final zaq f15244OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public volatile boolean f15245OoooOoo;

    @NonNull
    public static final Status zaa = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final Status f15229Ooooo00 = new Status(4, "The user must be signed in to make this API call.");

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final Object f15230Ooooo0o = new Object();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f15233Oooo0o = 10000;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f15234Oooo0oO = false;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final AtomicInteger f15236OoooO = new AtomicInteger(1);

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final AtomicInteger f15240OoooOO0 = new AtomicInteger(0);

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final Map<ApiKey<?>, zabq<?>> f15246o000oOoO = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public zaae f15241OoooOOO = null;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @GuardedBy("lock")
    public final Set<ApiKey<?>> f15242OoooOOo = new o0OoOo0(0);

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final Set<ApiKey<?>> f15243OoooOo0 = new o0OoOo0(0);

    @KeepForSdk
    public GoogleApiManager(Context context, Looper looper, GoogleApiAvailability googleApiAvailability) {
        this.f15245OoooOoo = true;
        this.f15238OoooO00 = context;
        zaq zaqVar = new zaq(looper, this);
        this.f15244OoooOoO = zaqVar;
        this.f15237OoooO0 = googleApiAvailability;
        this.f15239OoooO0O = new com.google.android.gms.common.internal.zal(googleApiAvailability);
        if (DeviceProperties.isAuto(context)) {
            this.f15245OoooOoo = false;
        }
        zaqVar.sendMessage(zaqVar.obtainMessage(6));
    }

    public static Status OooO0OO(ApiKey<?> apiKey, ConnectionResult connectionResult) {
        String strZab = apiKey.zab();
        String strValueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(strZab).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(strZab);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(connectionResult, sb.toString());
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized (f15230Ooooo0o) {
            GoogleApiManager googleApiManager = f15231OooooO0;
            if (googleApiManager != null) {
                googleApiManager.f15240OoooOO0.incrementAndGet();
                zaq zaqVar = googleApiManager.f15244OoooOoO;
                zaqVar.sendMessageAtFrontOfQueue(zaqVar.obtainMessage(10));
            }
        }
    }

    @NonNull
    public static GoogleApiManager zal() {
        GoogleApiManager googleApiManager;
        synchronized (f15230Ooooo0o) {
            Preconditions.checkNotNull(f15231OooooO0, "Must guarantee manager is non-null before using getInstance");
            googleApiManager = f15231OooooO0;
        }
        return googleApiManager;
    }

    @NonNull
    public static GoogleApiManager zam(@NonNull Context context) {
        GoogleApiManager googleApiManager;
        synchronized (f15230Ooooo0o) {
            if (f15231OooooO0 == null) {
                f15231OooooO0 = new GoogleApiManager(context.getApplicationContext(), GmsClientSupervisor.getOrStartHandlerThread().getLooper(), GoogleApiAvailability.getInstance());
            }
            googleApiManager = f15231OooooO0;
        }
        return googleApiManager;
    }

    @WorkerThread
    public final boolean OooO00o() {
        if (this.f15234Oooo0oO) {
            return false;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null && !config.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        int iZaa = this.f15239OoooO0O.zaa(this.f15238OoooO00, 203400000);
        return iZaa == -1 || iZaa == 0;
    }

    public final boolean OooO0O0(ConnectionResult connectionResult, int i) {
        return this.f15237OoooO0.zah(this.f15238OoooO00, connectionResult, i);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @WorkerThread
    public final zabq<?> OooO0Oo(GoogleApi<?> googleApi) {
        Object apiKey = googleApi.getApiKey();
        zabq<?> zabqVar = this.f15246o000oOoO.get(apiKey);
        if (zabqVar == null) {
            zabqVar = new zabq<>(this, googleApi);
            this.f15246o000oOoO.put((ApiKey<?>) apiKey, zabqVar);
        }
        if (zabqVar.zaz()) {
            this.f15243OoooOo0.add((ApiKey<?>) apiKey);
        }
        zabqVar.zao();
        return zabqVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x0067  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0070  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    public final <T> void OooO0o(TaskCompletionSource<T> taskCompletionSource, int i, GoogleApi googleApi) {
        long jCurrentTimeMillis;
        long jElapsedRealtime;
        if (i != 0) {
            ApiKey apiKey = googleApi.getApiKey();
            o0O0oo00 o0o0oo00 = null;
            if (OooO00o()) {
                RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
                boolean methodTimingTelemetryEnabled = true;
                if (config == null) {
                    if (methodTimingTelemetryEnabled) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    } else {
                        jCurrentTimeMillis = 0;
                    }
                    if (methodTimingTelemetryEnabled) {
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    } else {
                        jElapsedRealtime = 0;
                    }
                    o0o0oo00 = new o0O0oo00(this, i, apiKey, jCurrentTimeMillis, jElapsedRealtime);
                } else if (config.getMethodInvocationTelemetryEnabled()) {
                    boolean methodTimingTelemetryEnabled2 = config.getMethodTimingTelemetryEnabled();
                    zabq zabqVar = (zabq) this.f15246o000oOoO.get(apiKey);
                    if (zabqVar == null) {
                        methodTimingTelemetryEnabled = methodTimingTelemetryEnabled2;
                        if (methodTimingTelemetryEnabled) {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        } else {
                            jCurrentTimeMillis = 0;
                        }
                        if (methodTimingTelemetryEnabled) {
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                        } else {
                            jElapsedRealtime = 0;
                        }
                        o0o0oo00 = new o0O0oo00(this, i, apiKey, jCurrentTimeMillis, jElapsedRealtime);
                    } else if (zabqVar.zaf() instanceof BaseGmsClient) {
                        BaseGmsClient baseGmsClient = (BaseGmsClient) zabqVar.zaf();
                        if (!baseGmsClient.hasConnectionInfo() || baseGmsClient.isConnecting()) {
                            methodTimingTelemetryEnabled = methodTimingTelemetryEnabled2;
                        } else {
                            ConnectionTelemetryConfiguration connectionTelemetryConfigurationOooO00o = o0O0oo00.OooO00o(zabqVar, baseGmsClient, i);
                            if (connectionTelemetryConfigurationOooO00o != null) {
                                zabqVar.f15393OooOO0o++;
                                methodTimingTelemetryEnabled = connectionTelemetryConfigurationOooO00o.getMethodTimingTelemetryEnabled();
                            }
                        }
                        if (methodTimingTelemetryEnabled) {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        } else {
                            jCurrentTimeMillis = 0;
                        }
                        if (methodTimingTelemetryEnabled) {
                            jElapsedRealtime = SystemClock.elapsedRealtime();
                        } else {
                            jElapsedRealtime = 0;
                        }
                        o0o0oo00 = new o0O0oo00(this, i, apiKey, jCurrentTimeMillis, jElapsedRealtime);
                    }
                }
            }
            if (o0o0oo00 != null) {
                Task<T> task = taskCompletionSource.getTask();
                final zaq zaqVar = this.f15244OoooOoO;
                Objects.requireNonNull(zaqVar);
                task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.zabk
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        zaqVar.post(runnable);
                    }
                }, o0o0oo00);
            }
        }
    }

    @WorkerThread
    public final void OooO0o0() {
        TelemetryData telemetryData = this.f15235Oooo0oo;
        if (telemetryData != null) {
            if (telemetryData.zaa() > 0 || OooO00o()) {
                if (this.f15232Oooo == null) {
                    this.f15232Oooo = TelemetryLogging.getClient(this.f15238OoooO00);
                }
                this.f15232Oooo.log(telemetryData);
            }
            this.f15235Oooo0oo = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:88:0x025e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0264  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:92:0x02b3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v39, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r10v38, types: [OooOooo.o0OoOo0, java.lang.Object, java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>>] */
    /* JADX WARN: Type inference failed for: r10v40, types: [OooOooo.o0OoOo0, java.util.Set<com.google.android.gms.common.api.internal.ApiKey<?>>] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.util.ArrayList, java.util.List<o0O0oooO.o0O0o00O>] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.ArrayList, java.util.List<o0O0oooO.o0O0o00O>] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.LinkedList, java.util.Queue<com.google.android.gms.common.api.internal.zai>] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map<com.google.android.gms.common.api.internal.ApiKey<?>, com.google.android.gms.common.api.internal.zabq<?>>, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.LinkedList, java.util.Queue<com.google.android.gms.common.api.internal.zai>] */
    @Override // android.os.Handler.Callback
    @WorkerThread
    public final boolean handleMessage(@NonNull Message message) {
        Feature[] featureArrZab;
        int i = message.what;
        zabq zabqVar = null;
        switch (i) {
            case 1:
                this.f15233Oooo0o = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f15244OoooOoO.removeMessages(12);
                for (ApiKey apiKey : this.f15246o000oOoO.keySet()) {
                    zaq zaqVar = this.f15244OoooOoO;
                    zaqVar.sendMessageDelayed(zaqVar.obtainMessage(12, apiKey), this.f15233Oooo0o);
                }
                return true;
            case 2:
                zal zalVar = (zal) message.obj;
                for (ApiKey<?> apiKey2 : zalVar.zab()) {
                    zabq zabqVar2 = (zabq) this.f15246o000oOoO.get(apiKey2);
                    if (zabqVar2 == null) {
                        zalVar.zac(apiKey2, new ConnectionResult(13), null);
                        return true;
                    }
                    if (zabqVar2.f15384OooO0O0.isConnected()) {
                        zalVar.zac(apiKey2, ConnectionResult.RESULT_SUCCESS, zabqVar2.zaf().getEndpointPackageName());
                    } else {
                        ConnectionResult connectionResultZad = zabqVar2.zad();
                        if (connectionResultZad != null) {
                            zalVar.zac(apiKey2, connectionResultZad, null);
                        } else {
                            zabqVar2.zat(zalVar);
                            zabqVar2.zao();
                        }
                    }
                }
                return true;
            case 3:
                for (zabq zabqVar3 : this.f15246o000oOoO.values()) {
                    zabqVar3.zan();
                    zabqVar3.zao();
                }
                return true;
            case 4:
            case 8:
            case 13:
                zach zachVar = (zach) message.obj;
                zabq<?> zabqVarOooO0Oo = (zabq) this.f15246o000oOoO.get(zachVar.zac.getApiKey());
                if (zabqVarOooO0Oo == null) {
                    zabqVarOooO0Oo = OooO0Oo(zachVar.zac);
                }
                if (!zabqVarOooO0Oo.zaz() || this.f15240OoooOO0.get() == zachVar.zab) {
                    zabqVarOooO0Oo.zap(zachVar.zaa);
                } else {
                    zachVar.zaa.zad(zaa);
                    zabqVarOooO0Oo.zav();
                }
                return true;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                for (zabq zabqVar4 : this.f15246o000oOoO.values()) {
                    if (zabqVar4.zab() == i2) {
                        zabqVar = zabqVar4;
                        if (zabqVar != null) {
                            StringBuilder sb = new StringBuilder(76);
                            sb.append("Could not find API instance ");
                            sb.append(i2);
                            sb.append(" while trying to fail enqueued calls.");
                            Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                        } else if (connectionResult.getErrorCode() == 13) {
                            String errorString = this.f15237OoooO0.getErrorString(connectionResult.getErrorCode());
                            String errorMessage = connectionResult.getErrorMessage();
                            StringBuilder sb2 = new StringBuilder(String.valueOf(errorString).length() + 69 + String.valueOf(errorMessage).length());
                            sb2.append("Error resolution was canceled by the user, original error message: ");
                            sb2.append(errorString);
                            sb2.append(": ");
                            sb2.append(errorMessage);
                            zabqVar.OooO0OO(new Status(17, sb2.toString()));
                        } else {
                            zabqVar.OooO0OO(OooO0OO(zabqVar.f15385OooO0OO, connectionResult));
                        }
                        return true;
                    }
                }
                if (zabqVar != null) {
                    StringBuilder sb3 = new StringBuilder(76);
                    sb3.append("Could not find API instance ");
                    sb3.append(i2);
                    sb3.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb3.toString(), new Exception());
                } else if (connectionResult.getErrorCode() == 13) {
                    String errorString2 = this.f15237OoooO0.getErrorString(connectionResult.getErrorCode());
                    String errorMessage2 = connectionResult.getErrorMessage();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(errorString2).length() + 69 + String.valueOf(errorMessage2).length());
                    sb4.append("Error resolution was canceled by the user, original error message: ");
                    sb4.append(errorString2);
                    sb4.append(": ");
                    sb4.append(errorMessage2);
                    zabqVar.OooO0OO(new Status(17, sb4.toString()));
                } else {
                    zabqVar.OooO0OO(OooO0OO(zabqVar.f15385OooO0OO, connectionResult));
                }
                return true;
            case 6:
                if (this.f15238OoooO00.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize((Application) this.f15238OoooO00.getApplicationContext());
                    BackgroundDetector.getInstance().addListener(new OooO0OO(this));
                    if (!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.f15233Oooo0o = 300000L;
                    }
                }
                return true;
            case 7:
                OooO0Oo((GoogleApi) message.obj);
                return true;
            case 9:
                if (this.f15246o000oOoO.containsKey(message.obj)) {
                    ((zabq) this.f15246o000oOoO.get(message.obj)).zau();
                }
                return true;
            case 10:
                ?? r10 = this.f15243OoooOo0;
                Objects.requireNonNull(r10);
                o0OoOo0.OooO00o oooO00o = new o0OoOo0.OooO00o();
                while (oooO00o.hasNext()) {
                    zabq zabqVar5 = (zabq) this.f15246o000oOoO.remove((ApiKey) oooO00o.next());
                    if (zabqVar5 != null) {
                        zabqVar5.zav();
                    }
                }
                this.f15243OoooOo0.clear();
                return true;
            case 11:
                if (this.f15246o000oOoO.containsKey(message.obj)) {
                    ((zabq) this.f15246o000oOoO.get(message.obj)).zaw();
                }
                return true;
            case 12:
                if (this.f15246o000oOoO.containsKey(message.obj)) {
                    ((zabq) this.f15246o000oOoO.get(message.obj)).zaA();
                }
                return true;
            case 14:
                o0O000 o0o001 = (o0O000) message.obj;
                ApiKey<?> apiKey3 = o0o001.f37075OooO00o;
                if (this.f15246o000oOoO.containsKey(apiKey3)) {
                    o0o001.f37076OooO0O0.setResult(Boolean.valueOf(((zabq) this.f15246o000oOoO.get(apiKey3)).OooOOO0(false)));
                } else {
                    o0o001.f37076OooO0O0.setResult(Boolean.FALSE);
                }
                return true;
            case 15:
                o0O0o00O o0o0o00o = (o0O0o00O) message.obj;
                if (this.f15246o000oOoO.containsKey(o0o0o00o.f37107OooO00o)) {
                    zabq zabqVar6 = (zabq) this.f15246o000oOoO.get(o0o0o00o.f37107OooO00o);
                    if (zabqVar6.f15391OooOO0.contains(o0o0o00o) && !zabqVar6.f15382OooO) {
                        if (zabqVar6.f15384OooO0O0.isConnected()) {
                            zabqVar6.OooO0o0();
                        } else {
                            zabqVar6.zao();
                        }
                    }
                }
                return true;
            case 16:
                o0O0o00O o0o0o00o2 = (o0O0o00O) message.obj;
                if (this.f15246o000oOoO.containsKey(o0o0o00o2.f37107OooO00o)) {
                    zabq<?> zabqVar7 = (zabq) this.f15246o000oOoO.get(o0o0o00o2.f37107OooO00o);
                    if (zabqVar7.f15391OooOO0.remove(o0o0o00o2)) {
                        zabqVar7.f15394OooOOO0.f15244OoooOoO.removeMessages(15, o0o0o00o2);
                        zabqVar7.f15394OooOOO0.f15244OoooOoO.removeMessages(16, o0o0o00o2);
                        Feature feature = o0o0o00o2.f37108OooO0O0;
                        ArrayList arrayList = new ArrayList(zabqVar7.f15383OooO00o.size());
                        for (zai zaiVar : zabqVar7.f15383OooO00o) {
                            if ((zaiVar instanceof zac) && (featureArrZab = ((zac) zaiVar).zab(zabqVar7)) != null && ArrayUtils.contains(featureArrZab, feature)) {
                                arrayList.add(zaiVar);
                            }
                        }
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            zai zaiVar2 = (zai) arrayList.get(i3);
                            zabqVar7.f15383OooO00o.remove(zaiVar2);
                            zaiVar2.zae(new UnsupportedApiCallException(feature));
                        }
                    }
                }
                return true;
            case 17:
                OooO0o0();
                return true;
            case 18:
                o0O o0o = (o0O) message.obj;
                if (o0o.f37072OooO0OO == 0) {
                    TelemetryData telemetryData = new TelemetryData(o0o.f37071OooO0O0, Arrays.asList(o0o.f37070OooO00o));
                    if (this.f15232Oooo == null) {
                        this.f15232Oooo = TelemetryLogging.getClient(this.f15238OoooO00);
                    }
                    this.f15232Oooo.log(telemetryData);
                } else {
                    TelemetryData telemetryData2 = this.f15235Oooo0oo;
                    if (telemetryData2 != null) {
                        List<MethodInvocation> listZab = telemetryData2.zab();
                        if (telemetryData2.zaa() != o0o.f37071OooO0O0 || (listZab != null && listZab.size() >= o0o.f37073OooO0Oo)) {
                            this.f15244OoooOoO.removeMessages(17);
                            OooO0o0();
                        } else {
                            this.f15235Oooo0oo.zac(o0o.f37070OooO00o);
                        }
                    }
                    if (this.f15235Oooo0oo == null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(o0o.f37070OooO00o);
                        this.f15235Oooo0oo = new TelemetryData(o0o.f37071OooO0O0, arrayList2);
                        zaq zaqVar2 = this.f15244OoooOoO;
                        zaqVar2.sendMessageDelayed(zaqVar2.obtainMessage(17), o0o.f37072OooO0OO);
                    }
                }
                return true;
            case 19:
                this.f15234Oooo0oO = false;
                return true;
            default:
                o00O00O.OooO0OO.OooO0O0(31, "Unknown message id: ", i, "GoogleApiManager");
                return false;
        }
    }

    public final void zaA() {
        zaq zaqVar = this.f15244OoooOoO;
        zaqVar.sendMessage(zaqVar.obtainMessage(3));
    }

    public final void zaB(@NonNull GoogleApi<?> googleApi) {
        zaq zaqVar = this.f15244OoooOoO;
        zaqVar.sendMessage(zaqVar.obtainMessage(7, googleApi));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void zaC(@NonNull zaae zaaeVar) {
        synchronized (f15230Ooooo0o) {
            if (this.f15241OoooOOO != zaaeVar) {
                this.f15241OoooOOO = zaaeVar;
                this.f15242OoooOOo.clear();
            }
            this.f15242OoooOOo.addAll(zaaeVar.f15313OoooO0);
        }
    }

    public final int zaa() {
        return this.f15236OoooO.getAndIncrement();
    }

    @NonNull
    public final Task<Map<ApiKey<?>, String>> zao(@NonNull Iterable<? extends HasApiKey<?>> iterable) {
        zal zalVar = new zal(iterable);
        zaq zaqVar = this.f15244OoooOoO;
        zaqVar.sendMessage(zaqVar.obtainMessage(2, zalVar));
        return zalVar.zaa();
    }

    @NonNull
    public final Task<Boolean> zap(@NonNull GoogleApi<?> googleApi) {
        o0O000 o0o001 = new o0O000(googleApi.getApiKey());
        zaq zaqVar = this.f15244OoooOoO;
        zaqVar.sendMessage(zaqVar.obtainMessage(14, o0o001));
        return o0o001.f37076OooO0O0.getTask();
    }

    @NonNull
    public final <O extends Api.ApiOptions> Task<Void> zaq(@NonNull GoogleApi<O> googleApi, @NonNull RegisterListenerMethod<Api.AnyClient, ?> registerListenerMethod, @NonNull UnregisterListenerMethod<Api.AnyClient, ?> unregisterListenerMethod, @NonNull Runnable runnable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        OooO0o(taskCompletionSource, registerListenerMethod.zaa(), googleApi);
        zaf zafVar = new zaf(new zaci(registerListenerMethod, unregisterListenerMethod, runnable), taskCompletionSource);
        zaq zaqVar = this.f15244OoooOoO;
        zaqVar.sendMessage(zaqVar.obtainMessage(8, new zach(zafVar, this.f15240OoooOO0.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    @NonNull
    public final <O extends Api.ApiOptions> Task<Boolean> zar(@NonNull GoogleApi<O> googleApi, @NonNull ListenerHolder.ListenerKey listenerKey, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        OooO0o(taskCompletionSource, i, googleApi);
        zah zahVar = new zah(listenerKey, taskCompletionSource);
        zaq zaqVar = this.f15244OoooOoO;
        zaqVar.sendMessage(zaqVar.obtainMessage(13, new zach(zahVar, this.f15240OoooOO0.get(), googleApi)));
        return taskCompletionSource.getTask();
    }

    public final <O extends Api.ApiOptions> void zaw(@NonNull GoogleApi<O> googleApi, int i, @NonNull BaseImplementation.ApiMethodImpl<? extends Result, Api.AnyClient> apiMethodImpl) {
        zae zaeVar = new zae(i, apiMethodImpl);
        zaq zaqVar = this.f15244OoooOoO;
        zaqVar.sendMessage(zaqVar.obtainMessage(4, new zach(zaeVar, this.f15240OoooOO0.get(), googleApi)));
    }

    public final <O extends Api.ApiOptions, ResultT> void zax(@NonNull GoogleApi<O> googleApi, int i, @NonNull TaskApiCall<Api.AnyClient, ResultT> taskApiCall, @NonNull TaskCompletionSource<ResultT> taskCompletionSource, @NonNull StatusExceptionMapper statusExceptionMapper) {
        OooO0o(taskCompletionSource, taskApiCall.zaa(), googleApi);
        zag zagVar = new zag(i, taskApiCall, taskCompletionSource, statusExceptionMapper);
        zaq zaqVar = this.f15244OoooOoO;
        zaqVar.sendMessage(zaqVar.obtainMessage(4, new zach(zagVar, this.f15240OoooOO0.get(), googleApi)));
    }

    public final void zaz(@NonNull ConnectionResult connectionResult, int i) {
        if (OooO0O0(connectionResult, i)) {
            return;
        }
        zaq zaqVar = this.f15244OoooOoO;
        zaqVar.sendMessage(zaqVar.obtainMessage(5, i, 0, connectionResult));
    }
}
