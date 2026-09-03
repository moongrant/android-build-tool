package p308o0O0oO0O;

import androidx.annotation.Nullable;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import o0O0oo00.OooOOO;
import p305o0O0o0oo.o00Oo0;
import p305o0O0o0oo.o00Ooo;
import p306o0O0oO.o0ooOOo;
import p307o0O0oO0.OooOOO0;
import p311o0O0oOO0.o000;
import p634o0ooO0oO.o00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O extends o00Ooo implements o000 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooOOO0 f42481OooOO0O = OooOOO0.OooO0Oo();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public String f42482OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<PerfSession> f42483OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOOO f42484OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final GaugeManager f42485OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final NetworkRequestMetric.OooO0O0 f42486OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final WeakReference<o000> f42487OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f42488OooOO0;

    /* JADX WARN: Illegal instructions before constructor call */
    public o00O0O(OooOOO oooOOO) {
        o00Oo0 o00oo0OooO00o = o00Oo0.OooO00o();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(o00oo0OooO00o);
        this.f42486OooO0oO = NetworkRequestMetric.newBuilder();
        this.f42487OooO0oo = new WeakReference<>(this);
        this.f42484OooO0o = oooOOO;
        this.f42485OooO0o0 = gaugeManager;
        this.f42483OooO0Oo = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    public static o00O0O OooO0OO(OooOOO oooOOO) {
        return new o00O0O(oooOOO);
    }

    public final void OooO(long j) {
        this.f42486OooO0oO.OooOOOO(j);
    }

    @Override // p311o0O0oOO0.o000
    public final void OooO00o(PerfSession perfSession) {
        if (perfSession == null) {
            f42481OooOO0O.OooO0o("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        NetworkRequestMetric.OooO0O0 oooO0O0 = this.f42486OooO0oO;
        if (!oooO0O0.OooO0o() || oooO0O0.OooO0oo()) {
            return;
        }
        this.f42483OooO0Oo.add(perfSession);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    public final void OooO0O0() {
        List listUnmodifiableList;
        boolean z;
        SessionManager.getInstance().unregisterForSessionUpdates(this.f42487OooO0oo);
        unregisterForAppState();
        synchronized (this.f42483OooO0Oo) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession perfSession : this.f42483OooO0Oo) {
                if (perfSession != null) {
                    arrayList.add(perfSession);
                }
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        com.google.firebase.perf.v1.PerfSession[] perfSessionArrOooO0O0 = PerfSession.OooO0O0(listUnmodifiableList);
        if (perfSessionArrOooO0O0 != null) {
            this.f42486OooO0oO.OooO0O0(Arrays.asList(perfSessionArrOooO0O0));
        }
        final NetworkRequestMetric networkRequestMetricBuild = this.f42486OooO0oO.build();
        String str = this.f42482OooO;
        if (str != null) {
            if (o0ooOOo.f42471OooO00o.matcher(str).matches()) {
                z = false;
            }
            if (!z) {
                f42481OooOO0O.OooO00o("Dropping network request from a 'User-Agent' that is not allowed");
            } else {
                if (this.f42488OooOO0) {
                }
                final OooOOO oooOOO = this.f42484OooO0o;
                final ApplicationProcessState appState = getAppState();
                oooOOO.f42644OooOO0o.execute(new Runnable() { // from class: o0O0oo00.OooOO0
                    @Override // java.lang.Runnable
                    public final void run() {
                        OooOOO oooOOO2 = oooOOO;
                        oooOOO2.getClass();
                        PerfMetric.OooO0O0 oooO0O0NewBuilder = PerfMetric.newBuilder();
                        oooO0O0NewBuilder.OooO0o0(networkRequestMetricBuild);
                        oooOOO2.OooO0Oo(oooO0O0NewBuilder, appState);
                    }
                });
                this.f42488OooOO0 = true;
            }
        }
        Pattern pattern = o0ooOOo.f42471OooO00o;
        z = true;
        if (!z) {
            f42481OooOO0O.OooO00o("Dropping network request from a 'User-Agent' that is not allowed");
        } else if (this.f42488OooOO0) {
            final OooOOO oooOOO2 = this.f42484OooO0o;
            final ApplicationProcessState appState2 = getAppState();
            oooOOO2.f42644OooOO0o.execute(new Runnable() { // from class: o0O0oo00.OooOO0
                @Override // java.lang.Runnable
                public final void run() {
                    OooOOO oooOOO3 = oooOOO2;
                    oooOOO3.getClass();
                    PerfMetric.OooO0O0 oooO0O0NewBuilder = PerfMetric.newBuilder();
                    oooO0O0NewBuilder.OooO0o0(networkRequestMetricBuild);
                    oooOOO3.OooO0Oo(oooO0O0NewBuilder, appState2);
                }
            });
            this.f42488OooOO0 = true;
        }
    }

    public final void OooO0Oo(@Nullable String str) {
        NetworkRequestMetric.HttpMethod httpMethod;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    httpMethod = NetworkRequestMetric.HttpMethod.OPTIONS;
                    break;
                case "GET":
                    httpMethod = NetworkRequestMetric.HttpMethod.GET;
                    break;
                case "PUT":
                    httpMethod = NetworkRequestMetric.HttpMethod.PUT;
                    break;
                case "HEAD":
                    httpMethod = NetworkRequestMetric.HttpMethod.HEAD;
                    break;
                case "POST":
                    httpMethod = NetworkRequestMetric.HttpMethod.POST;
                    break;
                case "PATCH":
                    httpMethod = NetworkRequestMetric.HttpMethod.PATCH;
                    break;
                case "TRACE":
                    httpMethod = NetworkRequestMetric.HttpMethod.TRACE;
                    break;
                case "CONNECT":
                    httpMethod = NetworkRequestMetric.HttpMethod.CONNECT;
                    break;
                case "DELETE":
                    httpMethod = NetworkRequestMetric.HttpMethod.DELETE;
                    break;
                default:
                    httpMethod = NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN;
                    break;
            }
            this.f42486OooO0oO.OooOO0(httpMethod);
        }
    }

    public final void OooO0o(long j) {
        this.f42486OooO0oO.OooOOO0(j);
    }

    public final void OooO0o0(int i) {
        this.f42486OooO0oO.OooOO0O(i);
    }

    public final void OooO0oO(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f42487OooO0oo);
        this.f42486OooO0oO.OooO(j);
        OooO00o(perfSession);
        if (perfSession.f20454OooO0o) {
            this.f42485OooO0o0.collectGaugeMetricOnce(perfSession.f20455OooO0o0);
        }
    }

    public final void OooO0oo(@Nullable String str) {
        NetworkRequestMetric.OooO0O0 oooO0O0 = this.f42486OooO0oO;
        if (str == null) {
            oooO0O0.OooO0Oo();
            return;
        }
        boolean z = false;
        if (str.length() <= 128) {
            int i = 0;
            while (true) {
                if (i >= str.length()) {
                    z = true;
                    break;
                }
                char cCharAt = str.charAt(i);
                if (cCharAt <= 31 || cCharAt > 127) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (z) {
            oooO0O0.OooOOO(str);
        } else {
            f42481OooOO0O.OooO0o("The content type of the response is not a valid content-type:".concat(str));
        }
    }

    public final void OooOO0(long j) {
        this.f42486OooO0oO.OooOOo(j);
        if (SessionManager.getInstance().perfSession().f20454OooO0o) {
            this.f42485OooO0o0.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f20455OooO0o0);
        }
    }

    public final void OooOO0O(@Nullable String str) {
        o00OO o00ooOooO0OO;
        int iLastIndexOf;
        if (str != null) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            o00OO o00ooOooO0OO2 = null;
            try {
                Intrinsics.checkNotNullParameter(str, "<this>");
                o00OO.OooO00o oooO00o = new o00OO.OooO00o();
                oooO00o.OooO0oO(null, str);
                o00ooOooO0OO = oooO00o.OooO0OO();
            } catch (IllegalArgumentException unused) {
                o00ooOooO0OO = null;
            }
            if (o00ooOooO0OO != null) {
                o00OO.OooO00o oooO00oOooO0o = o00ooOooO0OO.OooO0o();
                Intrinsics.checkNotNullParameter("", "username");
                String strOooO00o = o00OO.OooO0O0.OooO00o("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
                Intrinsics.checkNotNullParameter(strOooO00o, "<set-?>");
                oooO00oOooO0o.f57213OooO0O0 = strOooO00o;
                Intrinsics.checkNotNullParameter("", "password");
                String strOooO00o2 = o00OO.OooO0O0.OooO00o("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
                Intrinsics.checkNotNullParameter(strOooO00o2, "<set-?>");
                oooO00oOooO0o.f57214OooO0OO = strOooO00o2;
                oooO00oOooO0o.f57218OooO0oO = null;
                oooO00oOooO0o.f57219OooO0oo = null;
                str = oooO00oOooO0o.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    Intrinsics.checkNotNullParameter(str, "<this>");
                    try {
                        Intrinsics.checkNotNullParameter(str, "<this>");
                        o00OO.OooO00o oooO00o2 = new o00OO.OooO00o();
                        oooO00o2.OooO0oO(null, str);
                        o00ooOooO0OO2 = oooO00o2.OooO0OO();
                    } catch (IllegalArgumentException unused2) {
                    }
                    str = (o00ooOooO0OO2 != null && o00ooOooO0OO2.OooO0O0().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, 2000);
                }
            }
            this.f42486OooO0oO.OooOo00(str);
        }
    }
}
