package com.google.firebase.installations;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.OooO00o;
import com.google.firebase.installations.local.OooO0O0;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.OooO0OO;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.qiniu.android.http.request.Request;
import com.umeng.commonsdk.internal.a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p214o00oO0.o00OOO0;
import p372o0OOo0o.oo0o0Oo;
import p375o0OOo0oo.o0OOO0o;
import p376o0OOoO0.OooOO0O;
import p377o0OOoO00.OooOOO;
import p377o0OOoO00.OooOo;
import p377o0OOoO00.OooOo00;
import p377o0OOoO00.Oooo0;
import p377o0OOoO00.o000oOoO;
import p377o0OOoO00.o0OoOo0;
import p378o0OOoO0O.o000Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o implements OooOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ThreadPoolExecutor f19121OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p351o0OOOOo.OooOOO f19122OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f19123OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PersistedInstallation f19124OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OoOo0 f19125OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Oooo0 f19126OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000Oo0 f19127OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Object f19128OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ExecutorService f19129OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("this")
    public String f19130OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("FirebaseInstallations.this")
    public Set<OooOO0O> f19131OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @GuardedBy("lock")
    public final List<o000oOoO> f19132OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Object f19120OooOOO0 = new Object();

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final ThreadFactoryC0151OooO00o f19119OooOOO = new ThreadFactoryC0151OooO00o();

    /* JADX INFO: renamed from: com.google.firebase.installations.OooO00o$OooO00o, reason: collision with other inner class name */
    public class ThreadFactoryC0151OooO00o implements ThreadFactory {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicInteger f19133OooO00o = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f19133OooO00o.getAndIncrement())));
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19134OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f19135OooO0O0;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            f19135OooO0O0 = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19135OooO0O0[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19135OooO0O0[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f19134OooO00o = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19134OooO00o[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public OooO00o(p351o0OOOOo.OooOOO oooOOO, @NonNull o0OOO0o<oo0o0Oo> o0ooo0o2) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactoryC0151OooO00o threadFactoryC0151OooO00o = f19119OooOOO;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactoryC0151OooO00o);
        oooOOO.OooO00o();
        OooO0OO oooO0OO = new OooO0OO(oooOOO.f38263OooO00o, o0ooo0o2);
        PersistedInstallation persistedInstallation = new PersistedInstallation(oooOOO);
        o0OoOo0 o0oooo0OooO0OO = o0OoOo0.OooO0OO();
        o000Oo0 o000oo1 = new o000Oo0(oooOOO);
        Oooo0 oooo0 = new Oooo0();
        this.f19128OooO0oO = new Object();
        this.f19131OooOO0O = new HashSet();
        this.f19132OooOO0o = new ArrayList();
        this.f19122OooO00o = oooOOO;
        this.f19123OooO0O0 = oooO0OO;
        this.f19124OooO0OO = persistedInstallation;
        this.f19125OooO0Oo = o0oooo0OooO0OO;
        this.f19127OooO0o0 = o000oo1;
        this.f19126OooO0o = oooo0;
        this.f19129OooO0oo = threadPoolExecutor;
        this.f19121OooO = new ThreadPoolExecutor(0, 1, 30L, timeUnit, new LinkedBlockingQueue(), threadFactoryC0151OooO00o);
    }

    @NonNull
    public static OooO00o OooO0o0() {
        p351o0OOOOo.OooOOO oooOOOOooO0OO = p351o0OOOOo.OooOOO.OooO0OO();
        Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
        return (OooO00o) oooOOOOooO0OO.OooO0O0(OooOOO.class);
    }

    public final com.google.firebase.installations.local.OooO0O0 OooO(com.google.firebase.installations.local.OooO0O0 oooO0O0) throws FirebaseInstallationsException {
        InstallationResponse installationResponseOooO0o0;
        com.google.firebase.installations.local.OooO00o oooO00o = (com.google.firebase.installations.local.OooO00o) oooO0O0;
        String str = oooO00o.f19136OooO0O0;
        String string = null;
        if (str != null && str.length() == 11) {
            o000Oo0 o000oo1 = this.f19127OooO0o0;
            synchronized (o000oo1.f38707OooO00o) {
                String[] strArr = o000Oo0.f38706OooO0OO;
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        break;
                    }
                    String str2 = strArr[i];
                    String string2 = o000oo1.f38707OooO00o.getString("|T|" + o000oo1.f38708OooO0O0 + "|" + str2, null);
                    if (string2 != null && !string2.isEmpty()) {
                        if (string2.startsWith("{")) {
                            try {
                                string = new JSONObject(string2).getString(FirebaseMessagingService.EXTRA_TOKEN);
                            } catch (JSONException unused) {
                            }
                        } else {
                            string = string2;
                        }
                        break;
                    }
                    i++;
                }
            }
        }
        OooO0OO oooO0OO = this.f19123OooO0O0;
        String strOooO0OO = OooO0OO();
        String str3 = oooO00o.f19136OooO0O0;
        String strOooO0o = OooO0o();
        String strOooO0Oo = OooO0Oo();
        if (!oooO0OO.f19168OooO0OO.OooO00o()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlOooO00o = oooO0OO.OooO00o(String.format("projects/%s/installations", strOooO0o));
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(a.f);
            HttpURLConnection httpURLConnectionOooO0OO = oooO0OO.OooO0OO(urlOooO00o, strOooO0OO);
            try {
                try {
                    httpURLConnectionOooO0OO.setRequestMethod(Request.HttpMethodPOST);
                    httpURLConnectionOooO0OO.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionOooO0OO.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    oooO0OO.OooO0oO(httpURLConnectionOooO0OO, str3, strOooO0Oo);
                    int responseCode = httpURLConnectionOooO0OO.getResponseCode();
                    oooO0OO.f19168OooO0OO.OooO0O0(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        installationResponseOooO0o0 = oooO0OO.OooO0o0(httpURLConnectionOooO0OO);
                        httpURLConnectionOooO0OO.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    OooO0OO.OooO0O0(httpURLConnectionOooO0OO, strOooO0Oo, strOooO0OO, strOooO0o);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        com.google.firebase.installations.remote.OooO00o oooO00o2 = new com.google.firebase.installations.remote.OooO00o(null, null, null, null, InstallationResponse.ResponseCode.BAD_CONFIG);
                        httpURLConnectionOooO0OO.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        installationResponseOooO0o0 = oooO00o2;
                        break;
                    }
                    httpURLConnectionOooO0OO.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                } catch (IOException | AssertionError unused2) {
                }
            } catch (Throwable th) {
                httpURLConnectionOooO0OO.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        com.google.firebase.installations.remote.OooO00o oooO00o3 = (com.google.firebase.installations.remote.OooO00o) installationResponseOooO0o0;
        int i3 = OooO0O0.f19134OooO00o[oooO00o3.f19157OooO0o0.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            com.google.firebase.installations.local.OooO00o.C0152OooO00o c0152OooO00o = new com.google.firebase.installations.local.OooO00o.C0152OooO00o(oooO00o);
            c0152OooO00o.f19149OooO0oO = "BAD CONFIG";
            c0152OooO00o.OooO0OO(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
            return c0152OooO00o.OooO00o();
        }
        String str4 = oooO00o3.f19154OooO0O0;
        String str5 = oooO00o3.f19155OooO0OO;
        long jOooO0O0 = this.f19125OooO0Oo.OooO0O0();
        String strOooO0OO2 = oooO00o3.f19156OooO0Oo.OooO0OO();
        long jOooO0Oo = oooO00o3.f19156OooO0Oo.OooO0Oo();
        com.google.firebase.installations.local.OooO00o.C0152OooO00o c0152OooO00o2 = new com.google.firebase.installations.local.OooO00o.C0152OooO00o(oooO00o);
        c0152OooO00o2.f19143OooO00o = str4;
        c0152OooO00o2.OooO0OO(PersistedInstallation.RegistrationStatus.REGISTERED);
        c0152OooO00o2.f19145OooO0OO = strOooO0OO2;
        c0152OooO00o2.f19146OooO0Oo = str5;
        c0152OooO00o2.OooO0O0(jOooO0Oo);
        c0152OooO00o2.OooO0Oo(jOooO0O0);
        return c0152OooO00o2.OooO00o();
    }

    public final void OooO00o(final boolean z) {
        com.google.firebase.installations.local.OooO0O0 oooO0O0OooO0OO;
        synchronized (f19120OooOOO0) {
            p351o0OOOOo.OooOOO oooOOO = this.f19122OooO00o;
            oooOOO.OooO00o();
            o00OOO0 o00ooo0OooO00o = o00OOO0.OooO00o(oooOOO.f38263OooO00o);
            try {
                oooO0O0OooO0OO = this.f19124OooO0OO.OooO0OO();
                if (oooO0O0OooO0OO.OooO()) {
                    String strOooO0oo = OooO0oo(oooO0O0OooO0OO);
                    PersistedInstallation persistedInstallation = this.f19124OooO0OO;
                    com.google.firebase.installations.local.OooO00o.C0152OooO00o c0152OooO00o = new com.google.firebase.installations.local.OooO00o.C0152OooO00o((com.google.firebase.installations.local.OooO00o) oooO0O0OooO0OO);
                    c0152OooO00o.f19143OooO00o = strOooO0oo;
                    c0152OooO00o.OooO0OO(PersistedInstallation.RegistrationStatus.UNREGISTERED);
                    oooO0O0OooO0OO = c0152OooO00o.OooO00o();
                    persistedInstallation.OooO0O0(oooO0O0OooO0OO);
                }
                if (o00ooo0OooO00o != null) {
                    o00ooo0OooO00o.OooO0OO();
                }
            } catch (Throwable th) {
                if (o00ooo0OooO00o != null) {
                    o00ooo0OooO00o.OooO0OO();
                }
                throw th;
            }
        }
        if (z) {
            com.google.firebase.installations.local.OooO00o.C0152OooO00o c0152OooO00o2 = new com.google.firebase.installations.local.OooO00o.C0152OooO00o((com.google.firebase.installations.local.OooO00o) oooO0O0OooO0OO);
            c0152OooO00o2.f19145OooO0OO = null;
            oooO0O0OooO0OO = c0152OooO00o2.OooO00o();
        }
        OooOO0O(oooO0O0OooO0OO);
        this.f19121OooO.execute(new Runnable() { // from class: o0OOoO00.OooOOO0
            /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashSet, java.util.Set<o0OOoO0.OooOO0O>] */
            /* JADX WARN: Type inference failed for: r2v12, types: [java.util.HashSet, java.util.Set<o0OOoO0.OooOO0O>] */
            @Override // java.lang.Runnable
            public final void run() {
                OooO0O0 oooO0O0OooO0OO2;
                OooO0O0 oooO0O0OooO;
                OooO00o oooO00o = this.f38694Oooo0o;
                boolean z2 = z;
                Objects.requireNonNull(oooO00o);
                Object obj = OooO00o.f19120OooOOO0;
                synchronized (obj) {
                    p351o0OOOOo.OooOOO oooOOO2 = oooO00o.f19122OooO00o;
                    oooOOO2.OooO00o();
                    o00OOO0 o00ooo0OooO00o2 = o00OOO0.OooO00o(oooOOO2.f38263OooO00o);
                    try {
                        oooO0O0OooO0OO2 = oooO00o.f19124OooO0OO.OooO0OO();
                        if (o00ooo0OooO00o2 != null) {
                            o00ooo0OooO00o2.OooO0OO();
                        }
                    } catch (Throwable th2) {
                        if (o00ooo0OooO00o2 != null) {
                            o00ooo0OooO00o2.OooO0OO();
                        }
                        throw th2;
                    }
                }
                try {
                    if (oooO0O0OooO0OO2.OooO0oo()) {
                        oooO0O0OooO = oooO00o.OooO(oooO0O0OooO0OO2);
                    } else {
                        if (((com.google.firebase.installations.local.OooO00o) oooO0O0OooO0OO2).f19137OooO0OO == PersistedInstallation.RegistrationStatus.UNREGISTERED) {
                            oooO0O0OooO = oooO00o.OooO(oooO0O0OooO0OO2);
                        } else if (!z2 && !oooO00o.f19125OooO0Oo.OooO0Oo(oooO0O0OooO0OO2)) {
                            return;
                        } else {
                            oooO0O0OooO = oooO00o.OooO0O0(oooO0O0OooO0OO2);
                        }
                    }
                    synchronized (obj) {
                        p351o0OOOOo.OooOOO oooOOO3 = oooO00o.f19122OooO00o;
                        oooOOO3.OooO00o();
                        o00OOO0 o00ooo0OooO00o3 = o00OOO0.OooO00o(oooOOO3.f38263OooO00o);
                        try {
                            oooO00o.f19124OooO0OO.OooO0O0(oooO0O0OooO);
                            if (o00ooo0OooO00o3 != null) {
                                o00ooo0OooO00o3.OooO0OO();
                            }
                        } catch (Throwable th3) {
                            if (o00ooo0OooO00o3 != null) {
                                o00ooo0OooO00o3.OooO0OO();
                            }
                            throw th3;
                        }
                    }
                    synchronized (oooO00o) {
                        if (oooO00o.f19131OooOO0O.size() != 0 && !TextUtils.equals(((com.google.firebase.installations.local.OooO00o) oooO0O0OooO0OO2).f19136OooO0O0, ((com.google.firebase.installations.local.OooO00o) oooO0O0OooO).f19136OooO0O0)) {
                            Iterator it = oooO00o.f19131OooOO0O.iterator();
                            while (it.hasNext()) {
                                ((OooOO0O) it.next()).OooO00o();
                            }
                        }
                    }
                    if (oooO0O0OooO.OooOO0()) {
                        String str = ((com.google.firebase.installations.local.OooO00o) oooO0O0OooO).f19136OooO0O0;
                        synchronized (oooO00o) {
                            oooO00o.f19130OooOO0 = str;
                        }
                    }
                    if (oooO0O0OooO.OooO0oo()) {
                        oooO00o.OooOO0(new FirebaseInstallationsException());
                    } else if (oooO0O0OooO.OooO()) {
                        oooO00o.OooOO0(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    } else {
                        oooO00o.OooOO0O(oooO0O0OooO);
                    }
                } catch (FirebaseInstallationsException e) {
                    oooO00o.OooOO0(e);
                }
            }
        });
    }

    public final com.google.firebase.installations.local.OooO0O0 OooO0O0(@NonNull com.google.firebase.installations.local.OooO0O0 oooO0O0) throws FirebaseInstallationsException {
        HttpURLConnection httpURLConnectionOooO0OO;
        TokenResult tokenResultOooO0o;
        OooO0OO oooO0OO = this.f19123OooO0O0;
        String strOooO0OO = OooO0OO();
        com.google.firebase.installations.local.OooO00o oooO00o = (com.google.firebase.installations.local.OooO00o) oooO0O0;
        String str = oooO00o.f19136OooO0O0;
        String strOooO0o = OooO0o();
        String str2 = oooO00o.f19140OooO0o0;
        if (!oooO0OO.f19168OooO0OO.OooO00o()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlOooO00o = oooO0OO.OooO00o(String.format("projects/%s/installations/%s/authTokens:generate", strOooO0o, str));
        int i = 0;
        while (true) {
            if (i > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(a.h);
            httpURLConnectionOooO0OO = oooO0OO.OooO0OO(urlOooO00o, strOooO0OO);
            try {
                httpURLConnectionOooO0OO.setRequestMethod(Request.HttpMethodPOST);
                httpURLConnectionOooO0OO.addRequestProperty("Authorization", "FIS_v2 " + str2);
                httpURLConnectionOooO0OO.setDoOutput(true);
                oooO0OO.OooO0oo(httpURLConnectionOooO0OO);
                int responseCode = httpURLConnectionOooO0OO.getResponseCode();
                oooO0OO.f19168OooO0OO.OooO0O0(responseCode);
                if (responseCode >= 200 && responseCode < 300) {
                    tokenResultOooO0o = oooO0OO.OooO0o(httpURLConnectionOooO0OO);
                    break;
                }
                OooO0OO.OooO0O0(httpURLConnectionOooO0OO, null, strOooO0OO, strOooO0o);
                if (responseCode == 401 || responseCode == 404) {
                    com.google.firebase.installations.remote.OooO0O0.OooO00o oooO00o2 = (com.google.firebase.installations.remote.OooO0O0.OooO00o) TokenResult.OooO00o();
                    oooO00o2.f19163OooO0OO = TokenResult.ResponseCode.AUTH_ERROR;
                    tokenResultOooO0o = oooO00o2.OooO00o();
                    break;
                }
                if (responseCode == 429) {
                    throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    com.google.firebase.installations.remote.OooO0O0.OooO00o oooO00o3 = (com.google.firebase.installations.remote.OooO0O0.OooO00o) TokenResult.OooO00o();
                    oooO00o3.f19163OooO0OO = TokenResult.ResponseCode.BAD_CONFIG;
                    tokenResultOooO0o = oooO00o3.OooO00o();
                    break;
                }
                httpURLConnectionOooO0OO.disconnect();
                TrafficStats.clearThreadStatsTag();
                i++;
            } catch (IOException | AssertionError unused) {
            } catch (Throwable th) {
                httpURLConnectionOooO0OO.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        httpURLConnectionOooO0OO.disconnect();
        TrafficStats.clearThreadStatsTag();
        com.google.firebase.installations.remote.OooO0O0 oooO0O1 = (com.google.firebase.installations.remote.OooO0O0) tokenResultOooO0o;
        int i2 = OooO0O0.f19135OooO0O0[oooO0O1.f19160OooO0OO.ordinal()];
        if (i2 == 1) {
            String str3 = oooO0O1.f19158OooO00o;
            long j = oooO0O1.f19159OooO0O0;
            long jOooO0O0 = this.f19125OooO0Oo.OooO0O0();
            com.google.firebase.installations.local.OooO00o.C0152OooO00o c0152OooO00o = new com.google.firebase.installations.local.OooO00o.C0152OooO00o(oooO00o);
            c0152OooO00o.f19145OooO0OO = str3;
            c0152OooO00o.OooO0O0(j);
            c0152OooO00o.OooO0Oo(jOooO0O0);
            return c0152OooO00o.OooO00o();
        }
        if (i2 == 2) {
            com.google.firebase.installations.local.OooO00o.C0152OooO00o c0152OooO00o2 = new com.google.firebase.installations.local.OooO00o.C0152OooO00o(oooO00o);
            c0152OooO00o2.f19149OooO0oO = "BAD CONFIG";
            c0152OooO00o2.OooO0OO(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
            return c0152OooO00o2.OooO00o();
        }
        if (i2 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        synchronized (this) {
            this.f19130OooOO0 = null;
        }
        com.google.firebase.installations.local.OooO00o.C0152OooO00o c0152OooO00o3 = new com.google.firebase.installations.local.OooO00o.C0152OooO00o(oooO00o);
        c0152OooO00o3.OooO0OO(PersistedInstallation.RegistrationStatus.NOT_GENERATED);
        return c0152OooO00o3.OooO00o();
    }

    @Nullable
    public final String OooO0OO() {
        p351o0OOOOo.OooOOO oooOOO = this.f19122OooO00o;
        oooOOO.OooO00o();
        return oooOOO.f38265OooO0OO.f38282OooO00o;
    }

    @VisibleForTesting
    public final String OooO0Oo() {
        p351o0OOOOo.OooOOO oooOOO = this.f19122OooO00o;
        oooOOO.OooO00o();
        return oooOOO.f38265OooO0OO.f38283OooO0O0;
    }

    @Nullable
    public final String OooO0o() {
        p351o0OOOOo.OooOOO oooOOO = this.f19122OooO00o;
        oooOOO.OooO00o();
        return oooOOO.f38265OooO0OO.f38288OooO0oO;
    }

    public final void OooO0oO() {
        Preconditions.checkNotEmpty(OooO0Oo(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(OooO0o(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(OooO0OO(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String strOooO0Oo = OooO0Oo();
        Pattern pattern = o0OoOo0.f38703OooO0OO;
        Preconditions.checkArgument(strOooO0Oo.contains(CertificateUtil.DELIMITER), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(o0OoOo0.f38703OooO0OO.matcher(OooO0OO()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String OooO0oo(com.google.firebase.installations.local.OooO0O0 oooO0O0) {
        String string;
        p351o0OOOOo.OooOOO oooOOO = this.f19122OooO00o;
        oooOOO.OooO00o();
        if (oooOOO.f38264OooO0O0.equals("CHIME_ANDROID_SDK") || this.f19122OooO00o.OooO0oo()) {
            if (((com.google.firebase.installations.local.OooO00o) oooO0O0).f19137OooO0OO == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                o000Oo0 o000oo1 = this.f19127OooO0o0;
                synchronized (o000oo1.f38707OooO00o) {
                    synchronized (o000oo1.f38707OooO00o) {
                        string = o000oo1.f38707OooO00o.getString("|S|id", null);
                    }
                    if (string == null) {
                        string = o000oo1.OooO00o();
                    }
                }
                return TextUtils.isEmpty(string) ? this.f19126OooO0o.OooO00o() : string;
            }
        }
        return this.f19126OooO0o.OooO00o();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o0OOoO00.o000oOoO>] */
    public final void OooOO0(Exception exc) {
        synchronized (this.f19128OooO0oO) {
            Iterator it = this.f19132OooOO0o.iterator();
            while (it.hasNext()) {
                if (((o000oOoO) it.next()).OooO00o(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<o0OOoO00.o000oOoO>] */
    public final void OooOO0O(com.google.firebase.installations.local.OooO0O0 oooO0O0) {
        synchronized (this.f19128OooO0oO) {
            Iterator it = this.f19132OooOO0o.iterator();
            while (it.hasNext()) {
                if (((o000oOoO) it.next()).OooO0O0(oooO0O0)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p377o0OOoO00.OooOOO
    @NonNull
    public final Task<String> getId() {
        String str;
        OooO0oO();
        synchronized (this) {
            str = this.f19130OooOO0;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        OooOo oooOo = new OooOo(taskCompletionSource);
        synchronized (this.f19128OooO0oO) {
            this.f19132OooOO0o.add(oooOo);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.f19129OooO0oo.execute(new androidx.activity.OooO0OO(this, 1));
        return task;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p377o0OOoO00.OooOOO
    @NonNull
    public final Task getToken() {
        OooO0oO();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        OooOo00 oooOo00 = new OooOo00(this.f19125OooO0Oo, taskCompletionSource);
        synchronized (this.f19128OooO0oO) {
            this.f19132OooOO0o.add(oooOo00);
        }
        Task task = taskCompletionSource.getTask();
        this.f19129OooO0oo.execute(new Runnable() { // from class: o0OOoO00.OooOO0O

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ boolean f38693Oooo0oO = false;

            @Override // java.lang.Runnable
            public final void run() {
                this.f38692Oooo0o.OooO00o(this.f38693Oooo0oO);
            }
        });
        return task;
    }
}
