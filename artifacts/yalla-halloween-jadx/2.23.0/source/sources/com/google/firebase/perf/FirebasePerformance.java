package com.google.firebase.perf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.OooOo00;
import com.google.firebase.perf.v1.AndroidApplicationInfo;
import com.google.firebase.perf.v1.ApplicationInfo;
import com.twitter.sdk.android.core.internal.oauth.OooO0O0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import o0O0o0.OooO;
import o0O0oo00.OooOOO;
import p176o00o0.o0OoOo0;
import p281o0O0O0oO.OooOO0;
import p298o0O0o00o.OooO0OO;
import p304o0O0o0oO.Oooo000;
import p305o0O0o0oo.o00Oo0;
import p307o0O0oO0.OooOOO0;
import p319o0O0oo0O.o000000;
import p319o0O0oo0O.o0Oo0oo;
import p671oo0oOOo.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
public final class FirebasePerformance {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final OooOOO0 f20405OooO0o0 = OooOOO0.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f20406OooO00o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO<o00O0O> f20407OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO f20408OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO<o0OoOo0> f20409OooO0Oo;

    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
        public static final String CONNECT = "CONNECT";
        public static final String DELETE = "DELETE";
        public static final String GET = "GET";
        public static final String HEAD = "HEAD";
        public static final String OPTIONS = "OPTIONS";
        public static final String PATCH = "PATCH";
        public static final String POST = "POST";
        public static final String PUT = "PUT";
        public static final String TRACE = "TRACE";
    }

    @Inject
    @VisibleForTesting
    public FirebasePerformance(OooOO0 oooOO1, OooO0OO<o00O0O> oooO0OO, OooO oooO, OooO0OO<o0OoOo0> oooO0OO2, RemoteConfigManager remoteConfigManager, o0Oo0oo o0oo0oo2, SessionManager sessionManager) {
        Bundle bundle;
        this.f20407OooO0O0 = oooO0OO;
        this.f20408OooO0OO = oooO;
        this.f20409OooO0Oo = oooO0OO2;
        if (oooOO1 == null) {
            new com.google.firebase.perf.util.OooO(new Bundle());
            return;
        }
        final OooOOO oooOOO = OooOOO.f42635OooOo0O;
        oooOOO.f42640OooO0oO = oooOO1;
        oooOO1.OooO00o();
        p281o0O0O0oO.OooOOO0 oooOOO0 = oooOO1.f41951OooO0OO;
        oooOOO.f42651OooOOoo = oooOOO0.f41966OooO0oO;
        oooOOO.f42636OooO = oooO;
        oooOOO.f42642OooOO0 = oooO0OO2;
        oooOOO.f42644OooOO0o.execute(new Runnable() { // from class: o0O0oo00.OooO
            @Override // java.lang.Runnable
            public final void run() {
                o000000 o000000Var;
                String strOooO00o;
                String str;
                String str2;
                final OooOOO oooOOO2 = oooOOO;
                p281o0O0O0oO.OooOO0 oooOO2 = oooOOO2.f42640OooO0oO;
                oooOO2.OooO00o();
                Context context = oooOO2.f41949OooO00o;
                oooOOO2.f42646OooOOO0 = context;
                oooOOO2.f42649OooOOo = context.getPackageName();
                oooOOO2.f42645OooOOO = o0Oo0oo.OooO0o0();
                oooOOO2.f42647OooOOOO = new OooO0OO(oooOOO2.f42646OooOOO0, new com.google.firebase.perf.util.OooOOO0(100L, 1L, TimeUnit.MINUTES));
                oooOOO2.f42648OooOOOo = o00Oo0.OooO00o();
                p298o0O0o00o.OooO0OO<o0OoOo0> oooO0OO3 = oooOOO2.f42642OooOO0;
                o0Oo0oo o0oo0oo3 = oooOOO2.f42645OooOOO;
                o0oo0oo3.getClass();
                o000000 o000000Var2 = o000000.f42658OooO00o;
                synchronized (o000000.class) {
                    if (o000000.f42658OooO00o == null) {
                        o000000.f42658OooO00o = new o000000();
                    }
                    o000000Var = o000000.f42658OooO00o;
                }
                if (Oooo000.f42409OooO00o.booleanValue()) {
                    o000000Var.getClass();
                    strOooO00o = "FIREPERF";
                } else {
                    o000000Var.getClass();
                    long jLongValue = ((Long) o0oo0oo3.f42681OooO00o.getRemoteConfigValueOrDefault("fpr_log_source", -1L)).longValue();
                    Map<Long, String> map = o000000.f42659OooO0O0;
                    if (!map.containsKey(Long.valueOf(jLongValue)) || (str = map.get(Long.valueOf(jLongValue))) == null) {
                        com.google.firebase.perf.util.OooOO0<String> oooOO0OooO0Oo = o0oo0oo3.OooO0Oo(o000000Var);
                        strOooO00o = oooOO0OooO0Oo.OooO0O0() ? oooOO0OooO0Oo.OooO00o() : "FIREPERF";
                    } else {
                        o0oo0oo3.f42683OooO0OO.OooO0o0("com.google.firebase.perf.LogSourceName", str);
                        strOooO00o = str;
                    }
                }
                oooOOO2.f42643OooOO0O = new OooO00o(oooO0OO3, strOooO00o);
                oooOOO2.f42648OooOOOo.OooO0Oo(new WeakReference<>(OooOOO.f42635OooOo0O));
                ApplicationInfo.OooO0O0 oooO0O0NewBuilder = ApplicationInfo.newBuilder();
                oooOOO2.f42650OooOOo0 = oooO0O0NewBuilder;
                p281o0O0O0oO.OooOO0 oooOO3 = oooOOO2.f42640OooO0oO;
                oooOO3.OooO00o();
                oooO0O0NewBuilder.OooO0oo(oooOO3.f41951OooO0OO.f41961OooO0O0);
                AndroidApplicationInfo.OooO0O0 oooO0O0NewBuilder2 = AndroidApplicationInfo.newBuilder();
                oooO0O0NewBuilder2.OooO0O0(oooOOO2.f42649OooOOo);
                oooO0O0NewBuilder2.OooO0Oo();
                Context context2 = oooOOO2.f42646OooOOO0;
                try {
                    str2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
                    if (str2 == null) {
                        str2 = "";
                    }
                    while (true) {
                        ConcurrentLinkedQueue<OooO0O0> concurrentLinkedQueue = oooOOO2.f42639OooO0o0;
                        if (concurrentLinkedQueue.isEmpty()) {
                            return;
                        }
                        final OooO0O0 oooO0O0Poll = concurrentLinkedQueue.poll();
                        if (oooO0O0Poll != null) {
                            oooOOO2.f42644OooOO0o.execute(new Runnable() { // from class: o0O0oo00.OooOOO0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    OooOOO oooOOO3 = oooOOO2;
                                    oooOOO3.getClass();
                                    OooO0O0 oooO0O0 = oooO0O0Poll;
                                    oooOOO3.OooO0Oo(oooO0O0.f42608OooO00o, oooO0O0.f42609OooO0O0);
                                }
                            });
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                oooO0O0NewBuilder2.OooO0o0(str2);
                oooO0O0NewBuilder.OooO0o0(oooO0O0NewBuilder2);
                oooOOO2.f42638OooO0o.set(true);
            }
        });
        oooOO1.OooO00o();
        Context context = oooOO1.f41949OooO00o;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.d("isEnabled", "No perf enable meta data found " + e.getMessage());
            bundle = null;
        }
        com.google.firebase.perf.util.OooO oooO2 = bundle != null ? new com.google.firebase.perf.util.OooO(bundle) : new com.google.firebase.perf.util.OooO();
        remoteConfigManager.setFirebaseRemoteConfigProvider(oooO0OO);
        o0oo0oo2.f42682OooO0O0 = oooO2;
        o0Oo0oo.f42679OooO0Oo.f42478OooO0O0 = OooOo00.OooO00o(context);
        o0oo0oo2.f42683OooO0OO.OooO0O0(context);
        sessionManager.setApplicationContext(context);
        Boolean boolOooO0oO = o0oo0oo2.OooO0oO();
        OooOOO0 oooOOO1 = f20405OooO0o0;
        if (oooOOO1.f42478OooO0O0) {
            if (boolOooO0oO != null ? boolOooO0oO.booleanValue() : OooOO0.OooO0OO().OooO0oo()) {
                oooOO1.OooO00o();
                String str = String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", String.format("%s/trends?utm_source=%s&utm_medium=%s", OooO0O0.OooO0O0(oooOOO0.f41966OooO0oO, context.getPackageName()), "perf-android-sdk", "android-ide"));
                if (oooOOO1.f42478OooO0O0) {
                    oooOOO1.f42477OooO00o.getClass();
                    Log.i("FirebasePerformance", str);
                }
            }
        }
    }
}
