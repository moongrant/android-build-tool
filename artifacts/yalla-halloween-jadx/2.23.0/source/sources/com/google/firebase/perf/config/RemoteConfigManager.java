package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.OooO0O0;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0O0OOO0.o0Oo0oo;
import p022Oooo00O.o000O00;
import p022Oooo00O.o000O00O;
import p281o0O0O0oO.OooOO0;
import p281o0O0O0oO.OooOOO;
import p298o0O0o00o.OooO0OO;
import p307o0O0oO0.OooOOO0;
import p319o0O0oo0O.o000O0o;
import p319o0O0oo0O.o0O0O00;
import p671oo0oOOo.OooOo;
import p671oo0oOOo.Oooo000;
import p671oo0oOOo.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, Oooo000> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final o000O0o cache;
    private final Executor executor;

    @Nullable
    private OooOo firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;

    @Nullable
    private OooO0OO<o00O0O> firebaseRemoteConfigProvider;
    private static final OooOOO0 logger = OooOOO0.OooO0Oo();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    /* JADX WARN: Illegal instructions before constructor call */
    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        o000O0o o000o0o2;
        OooOOO0 oooOOO0 = o000O0o.f42671OooO0OO;
        synchronized (o000O0o.class) {
            if (o000O0o.f42672OooO0Oo == null) {
                o000O0o.f42672OooO0Oo = new o000O0o(Executors.newSingleThreadExecutor());
            }
            o000o0o2 = o000O0o.f42672OooO0Oo;
        }
        this(o000o0o2, new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, 5000 + ((long) new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS)), getInitialStartupMillis());
    }

    @VisibleForTesting
    public static long getInitialStartupMillis() {
        OooOOO oooOOO = (OooOOO) OooOO0.OooO0OO().OooO0O0(OooOOO.class);
        return oooOOO != null ? oooOOO.OooO0O0() : System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private Oooo000 getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        Oooo000 oooo000 = this.allRcConfigMap.get(str);
        if (oooo000.getSource() != 2) {
            return null;
        }
        logger.OooO0O0("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", oooo000.OooO00o(), str);
        return oooo000;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j) {
        return j - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.OooO00o());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.OooO0oO("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        OooOo oooOo = this.firebaseRemoteConfig;
        final ConfigFetchHandler configFetchHandler = oooOo.f60919OooO0o0;
        OooO0O0 oooO0O0 = configFetchHandler.f20515OooO0oo;
        oooO0O0.getClass();
        final long j = oooO0O0.f20539OooO00o.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.f20505OooOO0);
        final HashMap map = new HashMap(configFetchHandler.f20507OooO);
        map.put("X-Firebase-RC-Fetch-Type", ConfigFetchHandler.FetchType.BASE.OooO00o() + "/1");
        configFetchHandler.f20512OooO0o.OooO0O0().continueWithTask(configFetchHandler.f20510OooO0OO, new Continuation() { // from class: o0O0oOo.o00000
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return configFetchHandler.OooO0O0(j, task, map);
            }
        }).onSuccessTask(o0Oo0oo.INSTANCE, new p671oo0oOOo.OooOOO()).onSuccessTask(oooOo.f60915OooO0O0, new p026Oooo0o.OooO0OO(oooOo)).addOnSuccessListener(this.executor, new o000O00(this)).addOnFailureListener(this.executor, new o000O00O(this, 2));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.OooO00o());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public com.google.firebase.perf.util.OooOO0<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.OooO00o("The key to get Remote Config boolean value is null.");
            return new com.google.firebase.perf.util.OooOO0<>();
        }
        Oooo000 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new com.google.firebase.perf.util.OooOO0<>(Boolean.valueOf(remoteConfigValue.OooO0Oo()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.OooO00o().isEmpty()) {
                    logger.OooO0O0("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.OooO00o(), str);
                }
            }
        }
        return new com.google.firebase.perf.util.OooOO0<>();
    }

    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public com.google.firebase.perf.util.OooOO0<Double> getDouble(String str) {
        if (str == null) {
            logger.OooO00o("The key to get Remote Config double value is null.");
            return new com.google.firebase.perf.util.OooOO0<>();
        }
        Oooo000 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new com.google.firebase.perf.util.OooOO0<>(Double.valueOf(remoteConfigValue.OooO0OO()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.OooO00o().isEmpty()) {
                    logger.OooO0O0("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.OooO00o(), str);
                }
            }
        }
        return new com.google.firebase.perf.util.OooOO0<>();
    }

    public com.google.firebase.perf.util.OooOO0<Long> getLong(String str) {
        if (str == null) {
            logger.OooO00o("The key to get Remote Config long value is null.");
            return new com.google.firebase.perf.util.OooOO0<>();
        }
        Oooo000 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new com.google.firebase.perf.util.OooOO0<>(Long.valueOf(remoteConfigValue.OooO0O0()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.OooO00o().isEmpty()) {
                    logger.OooO0O0("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.OooO00o(), str);
                }
            }
        }
        return new com.google.firebase.perf.util.OooOO0<>();
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
    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        Object objValueOf;
        Oooo000 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue == null) {
            return t;
        }
        try {
            if (t instanceof Boolean) {
                objValueOf = Boolean.valueOf(remoteConfigValue.OooO0Oo());
            } else if (t instanceof Double) {
                objValueOf = Double.valueOf(remoteConfigValue.OooO0OO());
            } else if ((t instanceof Long) || (t instanceof Integer)) {
                objValueOf = Long.valueOf(remoteConfigValue.OooO0O0());
            } else {
                if (!(t instanceof String)) {
                    T t2 = (T) remoteConfigValue.OooO00o();
                    try {
                        logger.OooO0O0("No matching type found for the defaultValue: '%s', using String.", t);
                        return t2;
                    } catch (IllegalArgumentException unused) {
                        t = t2;
                        if (remoteConfigValue.OooO00o().isEmpty()) {
                            return t;
                        }
                        logger.OooO0O0("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.OooO00o(), str);
                        return t;
                    }
                }
                objValueOf = remoteConfigValue.OooO00o();
            }
            return (T) objValueOf;
        } catch (IllegalArgumentException unused2) {
        }
    }

    public com.google.firebase.perf.util.OooOO0<String> getString(String str) {
        if (str == null) {
            logger.OooO00o("The key to get Remote Config String value is null.");
            return new com.google.firebase.perf.util.OooOO0<>();
        }
        Oooo000 remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new com.google.firebase.perf.util.OooOO0<>(remoteConfigValue.OooO00o()) : new com.google.firebase.perf.util.OooOO0<>();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        OooO0OO<o00O0O> oooO0OO;
        o00O0O o00o0o2;
        if (this.firebaseRemoteConfig == null && (oooO0OO = this.firebaseRemoteConfigProvider) != null && (o00o0o2 = oooO0OO.get()) != null) {
            this.firebaseRemoteConfig = o00o0o2.OooO00o(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        OooOo oooOo = this.firebaseRemoteConfig;
        return oooOo == null || oooOo.OooO0O0().f42569OooO00o == 1 || this.firebaseRemoteConfig.OooO0O0().f42569OooO00o == 2;
    }

    public void setFirebaseRemoteConfigProvider(@Nullable OooO0OO<o00O0O> oooO0OO) {
        this.firebaseRemoteConfigProvider = oooO0OO;
    }

    @VisibleForTesting
    public void syncConfigValues(Map<String, Oooo000> map) {
        o0O0O00 o0o0o00;
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        synchronized (o0O0O00.class) {
            if (o0O0O00.f42677OooO00o == null) {
                o0O0O00.f42677OooO00o = new o0O0O00();
            }
            o0o0o00 = o0O0O00.f42677OooO00o;
        }
        ConcurrentHashMap<String, Oooo000> concurrentHashMap = this.allRcConfigMap;
        o0o0o00.getClass();
        Oooo000 oooo000 = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (oooo000 == null) {
            logger.OooO00o("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.OooO0o("com.google.firebase.perf.ExperimentTTID", oooo000.OooO0Oo());
        } catch (Exception unused) {
            logger.OooO00o("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    @VisibleForTesting
    public RemoteConfigManager(o000O0o o000o0o2, Executor executor, OooOo oooOo, long j, long j2) {
        ConcurrentHashMap<String, Oooo000> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = o000o0o2;
        this.executor = executor;
        this.firebaseRemoteConfig = oooOo;
        if (oooOo == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(oooOo.OooO00o());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j2;
        this.appStartConfigFetchDelayInMs = j;
    }
}
