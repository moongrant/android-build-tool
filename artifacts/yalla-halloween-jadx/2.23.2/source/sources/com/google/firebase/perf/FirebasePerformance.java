package com.google.firebase.perf;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.android.billingclient.api.o0000Ooo;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.OooOOO;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Inject;
import javax.inject.Singleton;
import p233o00oOoOO.o0OoO00O;
import p301o0O0o0O.OooO0o;
import p302o0O0o0OO.o0000O0O;
import p309o0O0oO0.o000OOo0;
import p311o0O0oO0o.o0O0O00;
import p316o0O0oOo0.o0OO00O;
import p316o0O0oOo0.o0ooOOo;
import p317o0O0oOoO.o00O00;
import p626o0ooO.o0OOO0o;
import p626o0ooO.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
public final class FirebasePerformance {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0O0O00 f19933OooO0o0 = o0O0O00.OooO0Oo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ConcurrentHashMap f19934OooO00o = new ConcurrentHashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0o<o00O00> f19935OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000O0O f19936OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o<o0OoO00O> f19937OooO0Oo;

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
    public FirebasePerformance(o0OOO0o o0ooo0o2, OooO0o<o00O00> oooO0o, o0000O0O o0000o0o2, OooO0o<o0OoO00O> oooO0o2, RemoteConfigManager remoteConfigManager, o000OOo0 o000ooo1, SessionManager sessionManager) {
        Bundle bundle;
        this.f19935OooO0O0 = oooO0o;
        this.f19936OooO0OO = o0000o0o2;
        this.f19937OooO0Oo = oooO0o2;
        if (o0ooo0o2 == null) {
            new com.google.firebase.perf.util.OooO0o(new Bundle());
            return;
        }
        o0OO00O o0oo00o2 = o0OO00O.f41914OooOo0O;
        o0oo00o2.f41919OooO0oO = o0ooo0o2;
        o0ooo0o2.OooO00o();
        oo0o0Oo oo0o0oo = o0ooo0o2.f57664OooO0OO;
        o0oo00o2.f41930OooOOoo = oo0o0oo.f57680OooO0oO;
        o0oo00o2.f41915OooO = o0000o0o2;
        o0oo00o2.f41921OooOO0 = oooO0o2;
        o0oo00o2.f41923OooOO0o.execute(new o0ooOOo(o0oo00o2, 0));
        o0ooo0o2.OooO00o();
        Context context = o0ooo0o2.f57662OooO00o;
        try {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        } catch (PackageManager.NameNotFoundException | NullPointerException e) {
            Log.d("isEnabled", "No perf enable meta data found " + e.getMessage());
            bundle = null;
        }
        com.google.firebase.perf.util.OooO0o oooO0o3 = bundle != null ? new com.google.firebase.perf.util.OooO0o(bundle) : new com.google.firebase.perf.util.OooO0o();
        remoteConfigManager.setFirebaseRemoteConfigProvider(oooO0o);
        o000ooo1.f41786OooO0O0 = oooO0o3;
        o000OOo0.f41783OooO0Oo.f41826OooO0O0 = OooOOO.OooO00o(context);
        o000ooo1.f41787OooO0OO.OooO0O0(context);
        sessionManager.setApplicationContext(context);
        Boolean boolOooO0oO = o000ooo1.OooO0oO();
        o0O0O00 o0o0o00 = f19933OooO0o0;
        if (o0o0o00.f41826OooO0O0) {
            if (boolOooO0oO != null ? boolOooO0oO.booleanValue() : o0OOO0o.OooO0OO().OooO0oo()) {
                o0ooo0o2.OooO00o();
                String str = String.format("Firebase Performance Monitoring is successfully initialized! In a minute, visit the Firebase console to view your data: %s", String.format("%s/trends?utm_source=%s&utm_medium=%s", o0000Ooo.OooO00o(oo0o0oo.f57680OooO0oO, context.getPackageName()), "perf-android-sdk", "android-ide"));
                if (o0o0o00.f41826OooO0O0) {
                    o0o0o00.f41825OooO00o.getClass();
                    Log.i("FirebasePerformance", str);
                }
            }
        }
    }
}
