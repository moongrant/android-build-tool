package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class ab {

    @VisibleForTesting
    private static volatile ab AFLogger$LogLevel;
    private static final Handler AFVersionDeclaration;
    private static final BitSet init;
    public final Handler AFInAppEventParameterName;
    public final Runnable AFInAppEventType;
    public final Runnable AFKeystoreWrapper;
    public final Executor AppsFlyer2dXConversionCallback;
    public final Runnable getLevel;
    private long onAppOpenAttribution;
    private boolean onAppOpenAttributionNative;
    private final Map<x, x> onAttributionFailureNative;
    private int onDeepLinkingNative;
    private final Map<x, Map<String, Object>> onInstallConversionDataLoadedNative;
    private final SensorManager onInstallConversionFailureNative;
    private final Runnable onResponseErrorNative;
    public final Object valueOf = new Object();
    public boolean values;

    /* JADX INFO: renamed from: com.appsflyer.internal.ab$10, reason: invalid class name */
    public class AnonymousClass10 implements Runnable {
        public AnonymousClass10() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (!ab.this.onAttributionFailureNative.isEmpty()) {
                    for (x xVar : ab.this.onAttributionFailureNative.values()) {
                        ab.this.onInstallConversionFailureNative.unregisterListener(xVar);
                        xVar.AFKeystoreWrapper(ab.this.onInstallConversionDataLoadedNative, true);
                    }
                }
            } catch (Throwable unused) {
            }
            ab.this.onDeepLinkingNative = 0;
            ab.this.onAppOpenAttributionNative = false;
        }
    }

    static {
        BitSet bitSet = new BitSet(6);
        init = bitSet;
        AFVersionDeclaration = new Handler(Looper.getMainLooper());
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    private ab(@NonNull SensorManager sensorManager, Handler handler) {
        BitSet bitSet = init;
        this.onAttributionFailureNative = new HashMap(bitSet.size());
        this.onInstallConversionDataLoadedNative = new ConcurrentHashMap(bitSet.size());
        this.AFKeystoreWrapper = new Runnable() { // from class: com.appsflyer.internal.ab.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ab.this.valueOf) {
                    final ab abVar = ab.this;
                    abVar.AppsFlyer2dXConversionCallback.execute(new Runnable() { // from class: com.appsflyer.internal.ab.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                for (Sensor sensor : ab.this.onInstallConversionFailureNative.getSensorList(-1)) {
                                    if (ab.values(sensor.getType())) {
                                        x xVar = new x(sensor, ab.this.AppsFlyer2dXConversionCallback);
                                        if (!ab.this.onAttributionFailureNative.containsKey(xVar)) {
                                            ab.this.onAttributionFailureNative.put(xVar, xVar);
                                        }
                                        ab.this.onInstallConversionFailureNative.registerListener((SensorEventListener) ab.this.onAttributionFailureNative.get(xVar), sensor, 0);
                                    }
                                }
                            } catch (Throwable unused) {
                            }
                            ab.this.onAppOpenAttributionNative = true;
                        }
                    });
                    ab abVar2 = ab.this;
                    abVar2.AFInAppEventParameterName.postDelayed(abVar2.onResponseErrorNative, 100L);
                    ab.this.values = true;
                }
            }
        };
        this.AFInAppEventType = new Runnable() { // from class: com.appsflyer.internal.ab.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ab.this.valueOf) {
                    ab abVar = ab.this;
                    abVar.AppsFlyer2dXConversionCallback.execute(abVar.new AnonymousClass10());
                }
            }
        };
        this.getLevel = new Runnable() { // from class: com.appsflyer.internal.ab.3
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ab.this.valueOf) {
                    ab abVar = ab.this;
                    if (abVar.values) {
                        abVar.AFInAppEventParameterName.removeCallbacks(abVar.AFKeystoreWrapper);
                        ab abVar2 = ab.this;
                        abVar2.AFInAppEventParameterName.removeCallbacks(abVar2.AFInAppEventType);
                        ab abVar3 = ab.this;
                        abVar3.AppsFlyer2dXConversionCallback.execute(abVar3.new AnonymousClass10());
                        ab.this.values = false;
                    }
                }
            }
        };
        this.onDeepLinkingNative = 1;
        this.onAppOpenAttribution = 0L;
        this.onResponseErrorNative = new Runnable() { // from class: com.appsflyer.internal.ab.2
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (ab.this.valueOf) {
                    if (ab.this.onDeepLinkingNative == 0) {
                        ab.this.onDeepLinkingNative = 1;
                    }
                    ab abVar = ab.this;
                    abVar.AFInAppEventParameterName.postDelayed(abVar.AFInAppEventType, ((long) abVar.onDeepLinkingNative) * 500);
                }
            }
        };
        this.AppsFlyer2dXConversionCallback = Executors.newSingleThreadExecutor();
        this.onInstallConversionFailureNative = sensorManager;
        this.AFInAppEventParameterName = handler;
    }

    public static ab AFKeystoreWrapper(Context context) {
        return AFLogger$LogLevel != null ? AFLogger$LogLevel : AFInAppEventParameterName((SensorManager) context.getApplicationContext().getSystemService(com.umeng.analytics.pro.ak.ac), AFVersionDeclaration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean values(int i) {
        return i >= 0 && init.get(i);
    }

    private static ab AFInAppEventParameterName(SensorManager sensorManager, Handler handler) {
        if (AFLogger$LogLevel == null) {
            synchronized (ab.class) {
                if (AFLogger$LogLevel == null) {
                    AFLogger$LogLevel = new ab(sensorManager, handler);
                }
            }
        }
        return AFLogger$LogLevel;
    }

    public final List<Map<String, Object>> AFInAppEventType() {
        Iterator<x> it = this.onAttributionFailureNative.values().iterator();
        while (it.hasNext()) {
            it.next().AFKeystoreWrapper(this.onInstallConversionDataLoadedNative, true);
        }
        Map<x, Map<String, Object>> map = this.onInstallConversionDataLoadedNative;
        if (map != null && !map.isEmpty()) {
            return new CopyOnWriteArrayList(this.onInstallConversionDataLoadedNative.values());
        }
        return new CopyOnWriteArrayList(Collections.emptyList());
    }

    public final void valueOf() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.onAppOpenAttribution;
        if (j != 0) {
            this.onDeepLinkingNative++;
            if (j - jCurrentTimeMillis < 500) {
                this.AFInAppEventParameterName.removeCallbacks(this.AFInAppEventType);
                this.AFInAppEventParameterName.post(this.AFKeystoreWrapper);
            }
        } else {
            this.AFInAppEventParameterName.post(this.getLevel);
            this.AFInAppEventParameterName.post(this.AFKeystoreWrapper);
        }
        this.onAppOpenAttribution = jCurrentTimeMillis;
    }

    @NonNull
    public final List<Map<String, Object>> AFKeystoreWrapper() {
        synchronized (this.valueOf) {
            if (!this.onAttributionFailureNative.isEmpty() && this.onAppOpenAttributionNative) {
                Iterator<x> it = this.onAttributionFailureNative.values().iterator();
                while (it.hasNext()) {
                    it.next().AFKeystoreWrapper(this.onInstallConversionDataLoadedNative, false);
                }
            }
            if (this.onInstallConversionDataLoadedNative.isEmpty()) {
                return new CopyOnWriteArrayList(Collections.emptyList());
            }
            return new CopyOnWriteArrayList(this.onInstallConversionDataLoadedNative.values());
        }
    }
}
