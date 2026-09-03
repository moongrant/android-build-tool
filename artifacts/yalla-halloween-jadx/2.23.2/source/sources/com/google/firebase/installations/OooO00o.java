package com.google.firebase.installations;

import android.annotation.SuppressLint;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.o0OoOo0;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.installations.local.OooO00o;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.OooO0OO;
import com.google.firebase.installations.remote.TokenResult;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import o0O0OOOo.o00Oo0;
import org.json.JSONException;
import org.json.JSONObject;
import p045Oooooo.o00000O0;
import p301o0O0o0O.OooO0o;
import p302o0O0o0OO.o0000;
import p302o0O0o0OO.o0000O;
import p302o0O0o0OO.o0000O0O;
import p302o0O0o0OO.o0000OO0;
import p302o0O0o0OO.o000O000;
import p302o0O0o0OO.o000O0o;
import p302o0O0o0OO.o000Oo0;
import p303o0O0o0Oo.o000O00;
import p304o0O0o0o.OooO;
import p305o0O0o0o0.OooO0O0;
import p565o0oOo0O0.o00oO0o;
import p626o0ooO.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o implements o0000O0O {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final Object f19706OooOOO0 = new Object();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Executor f19707OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOO0o f19708OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0OO f19709OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final PersistedInstallation f19710OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000Oo0 f19711OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000O000 f19712OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OoOo0<OooO0O0> f19713OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Object f19714OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ExecutorService f19715OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @GuardedBy("this")
    public String f19716OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("FirebaseInstallations.this")
    public final HashSet f19717OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @GuardedBy("lock")
    public final ArrayList f19718OooOO0o;

    /* JADX INFO: renamed from: com.google.firebase.installations.OooO00o$OooO00o, reason: collision with other inner class name */
    public static /* synthetic */ class C0254OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19719OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f19720OooO0O0;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            f19720OooO0O0 = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19720OooO0O0[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19720OooO0O0[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            f19719OooO00o = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19719OooO00o[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        new AtomicInteger(1);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public OooO00o() {
        throw null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public OooO00o(final o0OOO0o o0ooo0o2, @NonNull OooO0o oooO0o, @NonNull ExecutorService executorService, @NonNull o00Oo0 o00oo1) {
        o0ooo0o2.OooO00o();
        OooO0OO oooO0OO = new OooO0OO(o0ooo0o2.f57662OooO00o, oooO0o);
        PersistedInstallation persistedInstallation = new PersistedInstallation(o0ooo0o2);
        if (o00oO0o.f56391OooO00o == null) {
            o00oO0o.f56391OooO00o = new o00oO0o();
        }
        o00oO0o o00oo0o2 = o00oO0o.f56391OooO00o;
        if (o000Oo0.f41757OooO0Oo == null) {
            o000Oo0.f41757OooO0Oo = new o000Oo0(o00oo0o2);
        }
        o000Oo0 o000oo1 = o000Oo0.f41757OooO0Oo;
        o0OoOo0<OooO0O0> o0oooo1 = new o0OoOo0<>(new OooO0o() { // from class: o0O0o0OO.o0000O00
            @Override // p301o0O0o0O.OooO0o
            public final Object get() {
                return new OooO0O0(o0ooo0o2);
            }
        });
        o000O000 o000o001 = new o000O000();
        this.f19714OooO0oO = new Object();
        this.f19717OooOO0O = new HashSet();
        this.f19718OooOO0o = new ArrayList();
        this.f19708OooO00o = o0ooo0o2;
        this.f19709OooO0O0 = oooO0OO;
        this.f19710OooO0OO = persistedInstallation;
        this.f19711OooO0Oo = o000oo1;
        this.f19713OooO0o0 = o0oooo1;
        this.f19712OooO0o = o000o001;
        this.f19715OooO0oo = executorService;
        this.f19707OooO = o00oo1;
    }

    public final void OooO(com.google.firebase.installations.local.OooO00o oooO00o) {
        synchronized (this.f19714OooO0oO) {
            Iterator it = this.f19718OooOO0o.iterator();
            while (it.hasNext()) {
                if (((o000O0o) it.next()).OooO00o(oooO00o)) {
                    it.remove();
                }
            }
        }
    }

    public final void OooO00o(o000O0o o000o0o2) {
        synchronized (this.f19714OooO0oO) {
            this.f19718OooOO0o.add(o000o0o2);
        }
    }

    public final void OooO0O0(final boolean z) {
        com.google.firebase.installations.local.OooO00o oooO00oOooO0OO;
        synchronized (f19706OooOOO0) {
            o0OOO0o o0ooo0o2 = this.f19708OooO00o;
            o0ooo0o2.OooO00o();
            o0000 o0000VarOooO00o = o0000.OooO00o(o0ooo0o2.f57662OooO00o);
            try {
                oooO00oOooO0OO = this.f19710OooO0OO.OooO0OO();
                PersistedInstallation.RegistrationStatus registrationStatus = PersistedInstallation.RegistrationStatus.NOT_GENERATED;
                PersistedInstallation.RegistrationStatus registrationStatus2 = oooO00oOooO0OO.f19722OooO0OO;
                if (registrationStatus2 == registrationStatus || registrationStatus2 == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                    String strOooO0o = OooO0o(oooO00oOooO0OO);
                    PersistedInstallation persistedInstallation = this.f19710OooO0OO;
                    com.google.firebase.installations.local.OooO00o.C0255OooO00o c0255OooO00o = new com.google.firebase.installations.local.OooO00o.C0255OooO00o(oooO00oOooO0OO);
                    c0255OooO00o.f19728OooO00o = strOooO0o;
                    c0255OooO00o.OooO0O0(PersistedInstallation.RegistrationStatus.UNREGISTERED);
                    oooO00oOooO0OO = c0255OooO00o.OooO00o();
                    persistedInstallation.OooO0O0(oooO00oOooO0OO);
                }
                if (o0000VarOooO00o != null) {
                    o0000VarOooO00o.OooO0O0();
                }
            } catch (Throwable th) {
                if (o0000VarOooO00o != null) {
                    o0000VarOooO00o.OooO0O0();
                }
                throw th;
            }
        }
        if (z) {
            com.google.firebase.installations.local.OooO00o.C0255OooO00o c0255OooO00o2 = new com.google.firebase.installations.local.OooO00o.C0255OooO00o(oooO00oOooO0OO);
            c0255OooO00o2.f19730OooO0OO = null;
            oooO00oOooO0OO = c0255OooO00o2.OooO00o();
        }
        OooO(oooO00oOooO0OO);
        this.f19707OooO.execute(new Runnable() { // from class: o0O0o0OO.o0000oo
            @Override // java.lang.Runnable
            public final void run() {
                OooO00o oooO00oOooO0OO2;
                OooO00o oooO00oOooO0oO;
                com.google.firebase.installations.OooO00o oooO00o = this.f41751OooO0Oo;
                boolean z2 = z;
                oooO00o.getClass();
                synchronized (com.google.firebase.installations.OooO00o.f19706OooOOO0) {
                    o0OOO0o o0ooo0o3 = oooO00o.f19708OooO00o;
                    o0ooo0o3.OooO00o();
                    o0000 o0000VarOooO00o2 = o0000.OooO00o(o0ooo0o3.f57662OooO00o);
                    try {
                        oooO00oOooO0OO2 = oooO00o.f19710OooO0OO.OooO0OO();
                        if (o0000VarOooO00o2 != null) {
                            o0000VarOooO00o2.OooO0O0();
                        }
                    } catch (Throwable th2) {
                        if (o0000VarOooO00o2 != null) {
                            o0000VarOooO00o2.OooO0O0();
                        }
                        throw th2;
                    }
                }
                try {
                    PersistedInstallation.RegistrationStatus registrationStatusOooO0o = oooO00oOooO0OO2.OooO0o();
                    PersistedInstallation.RegistrationStatus registrationStatus3 = PersistedInstallation.RegistrationStatus.REGISTER_ERROR;
                    boolean z3 = true;
                    if (registrationStatusOooO0o == registrationStatus3) {
                        oooO00oOooO0oO = oooO00o.OooO0oO(oooO00oOooO0OO2);
                    } else {
                        if (oooO00oOooO0OO2.OooO0o() == PersistedInstallation.RegistrationStatus.UNREGISTERED) {
                            oooO00oOooO0oO = oooO00o.OooO0oO(oooO00oOooO0OO2);
                        } else {
                            if (!z2 && !oooO00o.f19711OooO0Oo.OooO00o(oooO00oOooO0OO2)) {
                                return;
                            }
                            oooO00oOooO0oO = oooO00o.OooO0OO(oooO00oOooO0OO2);
                        }
                    }
                    oooO00o.OooO0Oo(oooO00oOooO0oO);
                    oooO00o.OooOO0O(oooO00oOooO0OO2, oooO00oOooO0oO);
                    if (oooO00oOooO0oO.OooO0o() == PersistedInstallation.RegistrationStatus.REGISTERED) {
                        oooO00o.OooOO0(oooO00oOooO0oO.f19721OooO0O0);
                    }
                    if (oooO00oOooO0oO.OooO0o() == registrationStatus3) {
                        oooO00o.OooO0oo(new FirebaseInstallationsException());
                        return;
                    }
                    PersistedInstallation.RegistrationStatus registrationStatus4 = PersistedInstallation.RegistrationStatus.NOT_GENERATED;
                    PersistedInstallation.RegistrationStatus registrationStatus5 = oooO00oOooO0oO.f19722OooO0OO;
                    if (registrationStatus5 != registrationStatus4 && registrationStatus5 != PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                        z3 = false;
                    }
                    if (z3) {
                        oooO00o.OooO0oo(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    } else {
                        oooO00o.OooO(oooO00oOooO0oO);
                    }
                } catch (FirebaseInstallationsException e) {
                    oooO00o.OooO0oo(e);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r2v14, types: [com.google.firebase.installations.remote.OooO0O0] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.google.firebase.installations.remote.OooO0O0] */
    public final com.google.firebase.installations.local.OooO00o OooO0OO(@NonNull com.google.firebase.installations.local.OooO00o oooO00o) throws FirebaseInstallationsException {
        ?? OooO0o2;
        ?? OooO0OO2;
        ?? r16;
        ?? r10;
        int i;
        char c;
        com.google.firebase.installations.remote.OooO0O0 oooO0O0;
        o0OOO0o o0ooo0o2 = this.f19708OooO00o;
        o0ooo0o2.OooO00o();
        String str = o0ooo0o2.f57664OooO0OO.f57674OooO00o;
        o0ooo0o2.OooO00o();
        String str2 = o0ooo0o2.f57664OooO0OO.f57680OooO0oO;
        String str3 = oooO00o.f19725OooO0o0;
        OooO0OO oooO0OO = this.f19709OooO0O0;
        OooO oooO = oooO0OO.f19750OooO0OO;
        if (!oooO.OooO0O0()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        char c2 = 2;
        ?? r11 = 1;
        URL urlOooO00o = OooO0OO.OooO00o(String.format("projects/%s/installations/%s/authTokens:generate", str2, oooO00o.f19721OooO0O0));
        int i2 = 0;
        while (true) {
            if (i2 > r11) {
                OooO0o2 = str2;
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            OooO0o2 = str2;
            TrafficStats.setThreadStatsTag(32771);
            OooO0OO2 = oooO0OO.OooO0OO(urlOooO00o, str);
            try {
                try {
                    OooO0OO2.setRequestMethod("POST");
                    OooO0OO2.addRequestProperty("Authorization", "FIS_v2 " + str3);
                    OooO0OO2.setDoOutput(r11);
                    OooO0OO.OooO0oo(OooO0OO2);
                    int responseCode = OooO0OO2.getResponseCode();
                    oooO.OooO0Oo(responseCode);
                    if (((responseCode < 200 || responseCode >= 300) ? 0 : r11) != 0) {
                        OooO0o2 = OooO0OO.OooO0o(OooO0OO2);
                        break;
                    }
                    OooO0OO.OooO0O0(OooO0OO2, null, str, OooO0o2);
                    try {
                        if (responseCode == 401 || responseCode == 404) {
                            i = i2;
                            Long l = 0L;
                            TokenResult.ResponseCode responseCode2 = TokenResult.ResponseCode.AUTH_ERROR;
                            String str4 = l == null ? " tokenExpirationTimestamp" : "";
                            if (str4.isEmpty()) {
                                try {
                                    oooO0O0 = new com.google.firebase.installations.remote.OooO0O0(null, l.longValue(), responseCode2);
                                } catch (IOException | AssertionError unused) {
                                    r10 = 1;
                                    r16 = OooO0o2;
                                    c = 2;
                                    OooO0OO2.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i2 = i + 1;
                                    c2 = c;
                                    str = str;
                                    OooO0o2 = r16;
                                    r11 = r10;
                                }
                            } else {
                                r16 = OooO0o2;
                                str = str;
                                r10 = 1;
                                c = 2;
                                try {
                                    throw new IllegalStateException("Missing required properties:".concat(str4));
                                } catch (IOException | AssertionError unused2) {
                                    continue;
                                }
                            }
                        } else {
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                try {
                                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                    Long l2 = 0L;
                                    try {
                                        TokenResult.ResponseCode responseCode3 = TokenResult.ResponseCode.BAD_CONFIG;
                                        String str5 = l2 != null ? "" : " tokenExpirationTimestamp";
                                        if (!str5.isEmpty()) {
                                            throw new IllegalStateException("Missing required properties:".concat(str5));
                                        }
                                        oooO0O0 = new com.google.firebase.installations.remote.OooO0O0(null, l2.longValue(), responseCode3);
                                    } catch (IOException | AssertionError unused3) {
                                        i = i2;
                                        r16 = OooO0o2;
                                        str = str;
                                        r10 = r11;
                                    }
                                } catch (IOException | AssertionError unused4) {
                                    i = i2;
                                    r10 = 1;
                                    r16 = OooO0o2;
                                }
                            } else {
                                r16 = OooO0o2;
                                str = str;
                                r10 = r11;
                                i = i2;
                            }
                            c = 2;
                            OooO0OO2.disconnect();
                            TrafficStats.clearThreadStatsTag();
                            i2 = i + 1;
                            c2 = c;
                            str = str;
                            OooO0o2 = r16;
                            r11 = r10;
                        }
                        OooO0o2 = oooO0O0;
                        break;
                    } catch (IOException | AssertionError unused5) {
                    }
                } catch (Throwable th) {
                    OooO0OO2.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused6) {
                r16 = OooO0o2;
                str = str;
                r10 = r11;
                i = i2;
                c = c2;
            }
        }
        OooO0OO2.disconnect();
        TrafficStats.clearThreadStatsTag();
        int i3 = C0254OooO00o.f19720OooO0O0[OooO0o2.f19745OooO0OO.ordinal()];
        if (i3 == 1) {
            o000Oo0 o000oo1 = this.f19711OooO0Oo;
            o000oo1.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            o000oo1.f41758OooO00o.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            com.google.firebase.installations.local.OooO00o.C0255OooO00o c0255OooO00o = new com.google.firebase.installations.local.OooO00o.C0255OooO00o(oooO00o);
            c0255OooO00o.f19730OooO0OO = OooO0o2.f19743OooO00o;
            c0255OooO00o.f19733OooO0o0 = Long.valueOf(OooO0o2.f19744OooO0O0);
            c0255OooO00o.f19732OooO0o = Long.valueOf(seconds);
            return c0255OooO00o.OooO00o();
        }
        if (i3 == 2) {
            com.google.firebase.installations.local.OooO00o.C0255OooO00o c0255OooO00oOooO0oo = oooO00o.OooO0oo();
            c0255OooO00oOooO0oo.f19734OooO0oO = "BAD CONFIG";
            c0255OooO00oOooO0oo.OooO0O0(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
            return c0255OooO00oOooO0oo.OooO00o();
        }
        if (i3 != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        OooOO0(null);
        com.google.firebase.installations.local.OooO00o.C0255OooO00o c0255OooO00o2 = new com.google.firebase.installations.local.OooO00o.C0255OooO00o(oooO00o);
        c0255OooO00o2.OooO0O0(PersistedInstallation.RegistrationStatus.NOT_GENERATED);
        return c0255OooO00o2.OooO00o();
    }

    public final void OooO0Oo(com.google.firebase.installations.local.OooO00o oooO00o) {
        synchronized (f19706OooOOO0) {
            o0OOO0o o0ooo0o2 = this.f19708OooO00o;
            o0ooo0o2.OooO00o();
            o0000 o0000VarOooO00o = o0000.OooO00o(o0ooo0o2.f57662OooO00o);
            try {
                this.f19710OooO0OO.OooO0O0(oooO00o);
                if (o0000VarOooO00o != null) {
                    o0000VarOooO00o.OooO0O0();
                }
            } catch (Throwable th) {
                if (o0000VarOooO00o != null) {
                    o0000VarOooO00o.OooO0O0();
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0033  */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[Catch: all -> 0x005b, DONT_GENERATE, TryCatch #0 {, blocks: (B:15:0x003e, B:17:0x0044, B:19:0x0046, B:20:0x004a), top: B:28:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0046 A[Catch: all -> 0x005b, TryCatch #0 {, blocks: (B:15:0x003e, B:17:0x0044, B:19:0x0046, B:20:0x004a), top: B:28:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:6:0x001e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    public final String OooO0o(com.google.firebase.installations.local.OooO00o oooO00o) {
        boolean z;
        OooO0O0 oooO0O0;
        String strOooO00o;
        o0OOO0o o0ooo0o2 = this.f19708OooO00o;
        o0ooo0o2.OooO00o();
        if (o0ooo0o2.f57663OooO0O0.equals("CHIME_ANDROID_SDK")) {
            if (oooO00o.f19722OooO0OO == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                oooO0O0 = this.f19713OooO0o0.get();
                synchronized (oooO0O0.f41765OooO00o) {
                    strOooO00o = oooO0O0.OooO00o();
                    if (strOooO00o != null) {
                        strOooO00o = oooO0O0.OooO0O0();
                    }
                    if (TextUtils.isEmpty(strOooO00o)) {
                        return strOooO00o;
                    }
                    this.f19712OooO0o.getClass();
                    return o000O000.OooO00o();
                }
            }
        } else {
            o0OOO0o o0ooo0o3 = this.f19708OooO00o;
            o0ooo0o3.OooO00o();
            if ("[DEFAULT]".equals(o0ooo0o3.f57663OooO0O0)) {
                if (oooO00o.f19722OooO0OO == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    oooO0O0 = this.f19713OooO0o0.get();
                    synchronized (oooO0O0.f41765OooO00o) {
                        strOooO00o = oooO0O0.OooO00o();
                        if (strOooO00o != null) {
                            strOooO00o = oooO0O0.OooO0O0();
                        }
                    }
                    if (TextUtils.isEmpty(strOooO00o)) {
                        return strOooO00o;
                    }
                    this.f19712OooO0o.getClass();
                    return o000O000.OooO00o();
                }
            }
        }
        this.f19712OooO0o.getClass();
        return o000O000.OooO00o();
    }

    public final void OooO0o0() {
        o0OOO0o o0ooo0o2 = this.f19708OooO00o;
        o0ooo0o2.OooO00o();
        Preconditions.checkNotEmpty(o0ooo0o2.f57664OooO0OO.f57675OooO0O0, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o0ooo0o2.OooO00o();
        Preconditions.checkNotEmpty(o0ooo0o2.f57664OooO0OO.f57680OooO0oO, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o0ooo0o2.OooO00o();
        Preconditions.checkNotEmpty(o0ooo0o2.f57664OooO0OO.f57674OooO00o, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o0ooo0o2.OooO00o();
        String str = o0ooo0o2.f57664OooO0OO.f57675OooO0O0;
        Pattern pattern = o000Oo0.f41756OooO0OO;
        Preconditions.checkArgument(str.contains(CertificateUtil.DELIMITER), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        o0ooo0o2.OooO00o();
        Preconditions.checkArgument(o000Oo0.f41756OooO0OO.matcher(o0ooo0o2.f57664OooO0OO.f57674OooO00o).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final com.google.firebase.installations.local.OooO00o OooO0oO(com.google.firebase.installations.local.OooO00o oooO00o) throws FirebaseInstallationsException {
        com.google.firebase.installations.remote.OooO00o oooO00oOooO0o0;
        String str = oooO00o.f19721OooO0O0;
        String string = null;
        if (str != null && str.length() == 11) {
            OooO0O0 oooO0O0 = this.f19713OooO0o0.get();
            synchronized (oooO0O0.f41765OooO00o) {
                String[] strArr = OooO0O0.f41764OooO0OO;
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        break;
                    }
                    String str2 = strArr[i];
                    String string2 = oooO0O0.f41765OooO00o.getString("|T|" + oooO0O0.f41766OooO0O0 + "|" + str2, null);
                    if (string2 != null && !string2.isEmpty()) {
                        if (string2.startsWith("{")) {
                            try {
                                string = new JSONObject(string2).getString("token");
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
        OooO0OO oooO0OO = this.f19709OooO0O0;
        o0OOO0o o0ooo0o2 = this.f19708OooO00o;
        o0ooo0o2.OooO00o();
        String str3 = o0ooo0o2.f57664OooO0OO.f57674OooO00o;
        String str4 = oooO00o.f19721OooO0O0;
        o0OOO0o o0ooo0o3 = this.f19708OooO00o;
        o0ooo0o3.OooO00o();
        String str5 = o0ooo0o3.f57664OooO0OO.f57680OooO0oO;
        o0OOO0o o0ooo0o4 = this.f19708OooO00o;
        o0ooo0o4.OooO00o();
        String str6 = o0ooo0o4.f57664OooO0OO.f57675OooO0O0;
        OooO oooO = oooO0OO.f19750OooO0OO;
        if (!oooO.OooO0O0()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlOooO00o = OooO0OO.OooO00o(String.format("projects/%s/installations", str5));
        int i2 = 0;
        while (true) {
            if (i2 > 1) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionOooO0OO = oooO0OO.OooO0OO(urlOooO00o, str3);
            try {
                try {
                    httpURLConnectionOooO0OO.setRequestMethod("POST");
                    httpURLConnectionOooO0OO.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionOooO0OO.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    OooO0OO.OooO0oO(httpURLConnectionOooO0OO, str4, str6);
                    int responseCode = httpURLConnectionOooO0OO.getResponseCode();
                    oooO.OooO0Oo(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        oooO00oOooO0o0 = OooO0OO.OooO0o0(httpURLConnectionOooO0OO);
                        httpURLConnectionOooO0OO.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        break;
                    }
                    OooO0OO.OooO0O0(httpURLConnectionOooO0OO, str6, str3, str5);
                    if (responseCode == 429) {
                        throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        com.google.firebase.installations.remote.OooO00o oooO00o2 = new com.google.firebase.installations.remote.OooO00o(null, null, null, null, InstallationResponse.ResponseCode.BAD_CONFIG);
                        httpURLConnectionOooO0OO.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        oooO00oOooO0o0 = oooO00o2;
                        break;
                    }
                    httpURLConnectionOooO0OO.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    i2++;
                } catch (Throwable th) {
                    httpURLConnectionOooO0OO.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused2) {
            }
        }
        int i3 = C0254OooO00o.f19719OooO00o[oooO00oOooO0o0.f19742OooO0o0.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.");
            }
            com.google.firebase.installations.local.OooO00o.C0255OooO00o c0255OooO00oOooO0oo = oooO00o.OooO0oo();
            c0255OooO00oOooO0oo.f19734OooO0oO = "BAD CONFIG";
            c0255OooO00oOooO0oo.OooO0O0(PersistedInstallation.RegistrationStatus.REGISTER_ERROR);
            return c0255OooO00oOooO0oo.OooO00o();
        }
        String str7 = oooO00oOooO0o0.f19739OooO0O0;
        String str8 = oooO00oOooO0o0.f19740OooO0OO;
        o000Oo0 o000oo1 = this.f19711OooO0Oo;
        o000oo1.getClass();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        o000oo1.f41758OooO00o.getClass();
        long seconds = timeUnit.toSeconds(System.currentTimeMillis());
        String strOooO0O0 = oooO00oOooO0o0.f19741OooO0Oo.OooO0O0();
        long jOooO0OO = oooO00oOooO0o0.f19741OooO0Oo.OooO0OO();
        com.google.firebase.installations.local.OooO00o.C0255OooO00o c0255OooO00o = new com.google.firebase.installations.local.OooO00o.C0255OooO00o(oooO00o);
        c0255OooO00o.f19728OooO00o = str7;
        c0255OooO00o.OooO0O0(PersistedInstallation.RegistrationStatus.REGISTERED);
        c0255OooO00o.f19730OooO0OO = strOooO0O0;
        c0255OooO00o.f19731OooO0Oo = str8;
        c0255OooO00o.f19733OooO0o0 = Long.valueOf(jOooO0OO);
        c0255OooO00o.f19732OooO0o = Long.valueOf(seconds);
        return c0255OooO00o.OooO00o();
    }

    public final void OooO0oo(Exception exc) {
        synchronized (this.f19714OooO0oO) {
            Iterator it = this.f19718OooOO0o.iterator();
            while (it.hasNext()) {
                if (((o000O0o) it.next()).OooO0O0(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void OooOO0(String str) {
        this.f19716OooOO0 = str;
    }

    public final synchronized void OooOO0O(com.google.firebase.installations.local.OooO00o oooO00o, com.google.firebase.installations.local.OooO00o oooO00o2) {
        if (this.f19717OooOO0O.size() != 0 && !TextUtils.equals(oooO00o.f19721OooO0O0, oooO00o2.f19721OooO0O0)) {
            Iterator it = this.f19717OooOO0O.iterator();
            while (it.hasNext()) {
                ((o000O00) it.next()).OooO00o();
            }
        }
    }

    @Override // p302o0O0o0OO.o0000O0O
    @NonNull
    public final Task<String> getId() {
        String str;
        OooO0o0();
        synchronized (this) {
            str = this.f19716OooOO0;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        OooO00o(new o0000OO0(taskCompletionSource));
        Task<String> task = taskCompletionSource.getTask();
        this.f19715OooO0oo.execute(new o00000O0(this, 1));
        return task;
    }

    @Override // p302o0O0o0OO.o0000O0O
    @NonNull
    public final Task getToken() {
        OooO0o0();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        OooO00o(new o0000O(this.f19711OooO0Oo, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        this.f19715OooO0oo.execute(new Runnable() { // from class: o0O0o0OO.o0000O0

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ boolean f41745OooO0o0 = false;

            @Override // java.lang.Runnable
            public final void run() {
                this.f41744OooO0Oo.OooO0O0(this.f41745OooO0o0);
            }
        });
        return task;
    }
}
