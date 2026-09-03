package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.compose.foundation.layout.o00oO0o;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.perf.util.OooO;
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
import o000O0.OooO0OO;
import o000O00O.o0OO00O;
import o000O00O.oo0o0Oo;
import o0O0OOOo.o00O0O;
import p301o0O0o0O.OooO0o;
import p309o0O0oO0.o00O;
import p311o0O0oO0o.o0O0O00;
import p317o0O0oOoO.o00O00;
import p317o0O0oOoO.o00O0000;
import p317o0O0oOoO.o0O0ooO;
import p318o0O0oOoo.o00O0;
import p318o0O0oOoo.o00O00OO;
import p318o0O0oOoo.o00O00o0;
import p318o0O0oOoo.oo00o;
import p626o0ooO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, o0O0ooO> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final o00O cache;
    private final Executor executor;

    @Nullable
    private o00O0000 firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;

    @Nullable
    private OooO0o<o00O00> firebaseRemoteConfigProvider;
    private static final o0O0O00 logger = o0O0O00.OooO0Oo();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    /* JADX WARN: Illegal instructions before constructor call */
    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        o00O o00o2;
        o0O0O00 o0o0o00 = o00O.f41788OooO0OO;
        synchronized (o00O.class) {
            if (o00O.f41789OooO0Oo == null) {
                o00O.f41789OooO0Oo = new o00O(Executors.newSingleThreadExecutor());
            }
            o00o2 = o00O.f41789OooO0Oo;
        }
        this(o00o2, new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, 5000 + ((long) new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS)), getInitialStartupMillis());
    }

    @VisibleForTesting
    public static long getInitialStartupMillis() {
        p626o0ooO.o0O0O00 o0o0o00 = (p626o0ooO.o0O0O00) o0OOO0o.OooO0OO().OooO0O0(p626o0ooO.o0O0O00.class);
        return o0o0o00 != null ? o0o0o00.OooO0O0() : System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private o0O0ooO getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        o0O0ooO o0o0ooo = this.allRcConfigMap.get(str);
        if (o0o0ooo.getSource() != 2) {
            return null;
        }
        logger.OooO0O0("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", o0o0ooo.OooO00o(), str);
        return o0o0ooo;
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
        final o00O0000 o00o0001 = this.firebaseRemoteConfig;
        final ConfigFetchHandler configFetchHandler = o00o0001.f41965OooO0o0;
        OooO0O0 oooO0O0 = configFetchHandler.f20042OooO0oo;
        oooO0O0.getClass();
        final long j = oooO0O0.f20066OooO00o.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.f20032OooOO0);
        final HashMap map = new HashMap(configFetchHandler.f20034OooO);
        map.put("X-Firebase-RC-Fetch-Type", ConfigFetchHandler.FetchType.BASE.OooO00o() + "/1");
        configFetchHandler.f20039OooO0o.OooO0O0().continueWithTask(configFetchHandler.f20037OooO0OO, new Continuation() { // from class: o0O0oOoo.o00O0O00
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return configFetchHandler.OooO0O0(j, task, map);
            }
        }).onSuccessTask(o00O0O.INSTANCE, new o00oO0o()).onSuccessTask(o00o0001.f41961OooO0O0, new SuccessContinuation() { // from class: o0O0oOoO.o000OOo0
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                final o00O0000 o00o0002 = o00o0001;
                final Task<o00O0> taskOooO0O0 = o00o0002.f41962OooO0OO.OooO0O0();
                final Task<o00O0> taskOooO0O1 = o00o0002.f41963OooO0Oo.OooO0O0();
                return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskOooO0O0, taskOooO0O1}).continueWithTask(o00o0002.f41961OooO0O0, new Continuation() { // from class: o0O0oOoO.o00
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        o00O0000 o00o0003 = o00o0002;
                        o00o0003.getClass();
                        Task task2 = taskOooO0O0;
                        if (!task2.isSuccessful() || task2.getResult() == null) {
                            return Tasks.forResult(Boolean.FALSE);
                        }
                        o00O0 o00o1 = (o00O0) task2.getResult();
                        Task task3 = taskOooO0O1;
                        int i = 1;
                        if (task3.isSuccessful()) {
                            o00O0 o00o2 = (o00O0) task3.getResult();
                            if (!(o00o2 == null || !o00o1.f41974OooO0OO.equals(o00o2.f41974OooO0OO))) {
                                return Tasks.forResult(Boolean.FALSE);
                            }
                        }
                        oo00o oo00oVar = o00o0003.f41963OooO0Oo;
                        oo00oVar.getClass();
                        o00O00OO o00o00oo2 = new o00O00OO(oo00oVar, o00o1);
                        Executor executor = oo00oVar.f42009OooO00o;
                        return Tasks.call(executor, o00o00oo2).onSuccessTask(executor, new o00O00o0(oo00oVar, o00o1)).continueWith(o00o0003.f41961OooO0O0, new OooO0OO(o00o0003, i));
                    }
                });
            }
        }).addOnSuccessListener(this.executor, new o0OO00O(this, 3)).addOnFailureListener(this.executor, new oo0o0Oo(this));
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

    public OooO<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.OooO00o("The key to get Remote Config boolean value is null.");
            return new OooO<>();
        }
        o0O0ooO remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new OooO<>(Boolean.valueOf(remoteConfigValue.OooO0Oo()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.OooO00o().isEmpty()) {
                    logger.OooO0O0("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.OooO00o(), str);
                }
            }
        }
        return new OooO<>();
    }

    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public OooO<Double> getDouble(String str) {
        if (str == null) {
            logger.OooO00o("The key to get Remote Config double value is null.");
            return new OooO<>();
        }
        o0O0ooO remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new OooO<>(Double.valueOf(remoteConfigValue.OooO0OO()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.OooO00o().isEmpty()) {
                    logger.OooO0O0("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.OooO00o(), str);
                }
            }
        }
        return new OooO<>();
    }

    public OooO<Long> getLong(String str) {
        if (str == null) {
            logger.OooO00o("The key to get Remote Config long value is null.");
            return new OooO<>();
        }
        o0O0ooO remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new OooO<>(Long.valueOf(remoteConfigValue.OooO0O0()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.OooO00o().isEmpty()) {
                    logger.OooO0O0("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.OooO00o(), str);
                }
            }
        }
        return new OooO<>();
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
        o0O0ooO remoteConfigValue = getRemoteConfigValue(str);
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

    public OooO<String> getString(String str) {
        if (str == null) {
            logger.OooO00o("The key to get Remote Config String value is null.");
            return new OooO<>();
        }
        o0O0ooO remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new OooO<>(remoteConfigValue.OooO00o()) : new OooO<>();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        OooO0o<o00O00> oooO0o;
        o00O00 o00o01;
        if (this.firebaseRemoteConfig == null && (oooO0o = this.firebaseRemoteConfigProvider) != null && (o00o01 = oooO0o.get()) != null) {
            this.firebaseRemoteConfig = o00o01.OooO00o(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        o00O0000 o00o0001 = this.firebaseRemoteConfig;
        return o00o0001 == null || o00o0001.OooO0O0().f41970OooO00o == 1 || this.firebaseRemoteConfig.OooO0O0().f41970OooO00o == 2;
    }

    public void setFirebaseRemoteConfigProvider(@Nullable OooO0o<o00O00> oooO0o) {
        this.firebaseRemoteConfigProvider = oooO0o;
    }

    @VisibleForTesting
    public void syncConfigValues(Map<String, o0O0ooO> map) {
        p309o0O0oO0.o0O0ooO o0o0ooo;
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        synchronized (p309o0O0oO0.o0O0ooO.class) {
            if (p309o0O0oO0.o0O0ooO.f41808OooO00o == null) {
                p309o0O0oO0.o0O0ooO.f41808OooO00o = new p309o0O0oO0.o0O0ooO();
            }
            o0o0ooo = p309o0O0oO0.o0O0ooO.f41808OooO00o;
        }
        ConcurrentHashMap<String, o0O0ooO> concurrentHashMap = this.allRcConfigMap;
        o0o0ooo.getClass();
        o0O0ooO o0o0ooo2 = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (o0o0ooo2 == null) {
            logger.OooO00o("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.OooO0o("com.google.firebase.perf.ExperimentTTID", o0o0ooo2.OooO0Oo());
        } catch (Exception unused) {
            logger.OooO00o("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    @VisibleForTesting
    public RemoteConfigManager(o00O o00o2, Executor executor, o00O0000 o00o0001, long j, long j2) {
        ConcurrentHashMap<String, o0O0ooO> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = o00o2;
        this.executor = executor;
        this.firebaseRemoteConfig = o00o0001;
        if (o00o0001 == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(o00o0001.OooO00o());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j2;
        this.appStartConfigFetchDelayInMs = j;
    }
}
