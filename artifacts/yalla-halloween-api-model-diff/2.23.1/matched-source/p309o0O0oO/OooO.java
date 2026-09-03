package p309o0O0oO;

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
import o0O0oo00.OooO00o;
import p312o0O0oO0o.oo0o0Oo;
import p313o0O0oOO.o00000OO;
import p317o0O0oOo0.o0OO00O;
import p640o0ooO0oo.o0OOOO00;
import p679oooOO0.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends o0O0O00 implements OooO00o {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final oo0o0Oo f41764OooOO0O = oo0o0Oo.OooO0Oo();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public String f41765OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<PerfSession> f41766OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0OO00O f41767OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final GaugeManager f41768OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final NetworkRequestMetric.OooO0O0 f41769OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final WeakReference<OooO00o> f41770OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f41771OooOO0;

    /* JADX WARN: Illegal instructions before constructor call */
    public OooO(o0OO00O o0oo00o2) {
        p679oooOO0.oo0o0Oo oo0o0ooOooO00o = p679oooOO0.oo0o0Oo.OooO00o();
        GaugeManager gaugeManager = GaugeManager.getInstance();
        super(oo0o0ooOooO00o);
        this.f41769OooO0oO = NetworkRequestMetric.newBuilder();
        this.f41770OooO0oo = new WeakReference<>(this);
        this.f41767OooO0o = o0oo00o2;
        this.f41768OooO0o0 = gaugeManager;
        this.f41766OooO0Oo = Collections.synchronizedList(new ArrayList());
        registerForAppState();
    }

    public static OooO OooO0OO(o0OO00O o0oo00o2) {
        return new OooO(o0oo00o2);
    }

    public final void OooO(long j) {
        this.f41769OooO0oO.OooOOOO(j);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO00o(PerfSession perfSession) {
        if (perfSession == null) {
            f41764OooOO0O.OooO0o("Unable to add new SessionId to the Network Trace. Continuing without it.");
            return;
        }
        NetworkRequestMetric.OooO0O0 oooO0O0 = this.f41769OooO0oO;
        if (!oooO0O0.OooO0o() || oooO0O0.OooO0oo()) {
            return;
        }
        this.f41766OooO0Oo.add(perfSession);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0061  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    public final void OooO0O0() {
        List listUnmodifiableList;
        boolean z;
        SessionManager.getInstance().unregisterForSessionUpdates(this.f41770OooO0oo);
        unregisterForAppState();
        synchronized (this.f41766OooO0Oo) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession perfSession : this.f41766OooO0Oo) {
                if (perfSession != null) {
                    arrayList.add(perfSession);
                }
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        com.google.firebase.perf.v1.PerfSession[] perfSessionArrOooO0O0 = PerfSession.OooO0O0(listUnmodifiableList);
        if (perfSessionArrOooO0O0 != null) {
            this.f41769OooO0oO.OooO0O0(Arrays.asList(perfSessionArrOooO0O0));
        }
        final NetworkRequestMetric networkRequestMetricBuild = this.f41769OooO0oO.build();
        String str = this.f41765OooO;
        if (str != null) {
            if (o00000OO.f41834OooO00o.matcher(str).matches()) {
                z = false;
            }
            if (!z) {
                f41764OooOO0O.OooO00o("Dropping network request from a 'User-Agent' that is not allowed");
            } else {
                if (this.f41771OooOO0) {
                }
                final o0OO00O o0oo00o2 = this.f41767OooO0o;
                final ApplicationProcessState appState = getAppState();
                o0oo00o2.f41917OooOO0o.execute(new Runnable() { // from class: o0O0oOo0.o0OOO0o
                    @Override // java.lang.Runnable
                    public final void run() {
                        o0OO00O o0oo00o3 = (o0OO00O) o0oo00o2;
                        NetworkRequestMetric networkRequestMetric = (NetworkRequestMetric) networkRequestMetricBuild;
                        ApplicationProcessState applicationProcessState = (ApplicationProcessState) appState;
                        o0oo00o3.getClass();
                        PerfMetric.OooO0O0 oooO0O0NewBuilder = PerfMetric.newBuilder();
                        oooO0O0NewBuilder.OooO0o0(networkRequestMetric);
                        o0oo00o3.OooO0Oo(oooO0O0NewBuilder, applicationProcessState);
                    }
                });
                this.f41771OooOO0 = true;
            }
        }
        Pattern pattern = o00000OO.f41834OooO00o;
        z = true;
        if (!z) {
            f41764OooOO0O.OooO00o("Dropping network request from a 'User-Agent' that is not allowed");
        } else if (this.f41771OooOO0) {
            final o0OO00O o0oo00o3 = this.f41767OooO0o;
            final ApplicationProcessState appState2 = getAppState();
            o0oo00o3.f41917OooOO0o.execute(new Runnable() { // from class: o0O0oOo0.o0OOO0o
                @Override // java.lang.Runnable
                public final void run() {
                    o0OO00O o0oo00o4 = (o0OO00O) o0oo00o3;
                    NetworkRequestMetric networkRequestMetric = (NetworkRequestMetric) networkRequestMetricBuild;
                    ApplicationProcessState applicationProcessState = (ApplicationProcessState) appState2;
                    o0oo00o4.getClass();
                    PerfMetric.OooO0O0 oooO0O0NewBuilder = PerfMetric.newBuilder();
                    oooO0O0NewBuilder.OooO0o0(networkRequestMetric);
                    o0oo00o4.OooO0Oo(oooO0O0NewBuilder, applicationProcessState);
                }
            });
            this.f41771OooOO0 = true;
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
            this.f41769OooO0oO.OooOO0(httpMethod);
        }
    }

    public final void OooO0o(long j) {
        this.f41769OooO0oO.OooOOO0(j);
    }

    public final void OooO0o0(int i) {
        this.f41769OooO0oO.OooOO0O(i);
    }

    public final void OooO0oO(long j) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f41770OooO0oo);
        this.f41769OooO0oO.OooO(j);
        OooO00o(perfSession);
        if (perfSession.f19987OooO0o) {
            this.f41768OooO0o0.collectGaugeMetricOnce(perfSession.f19988OooO0o0);
        }
    }

    public final void OooO0oo(@Nullable String str) {
        NetworkRequestMetric.OooO0O0 oooO0O0 = this.f41769OooO0oO;
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
            f41764OooOO0O.OooO0o("The content type of the response is not a valid content-type:".concat(str));
        }
    }

    public final void OooOO0(long j) {
        this.f41769OooO0oO.OooOOo0(j);
        if (SessionManager.getInstance().perfSession().f19987OooO0o) {
            this.f41768OooO0o0.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f19988OooO0o0);
        }
    }

    public final void OooOO0O(@Nullable String str) {
        o0OOOO00 o0oooo00OooO0OO;
        int iLastIndexOf;
        if (str != null) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            o0OOOO00 o0oooo00OooO0OO2 = null;
            try {
                Intrinsics.checkNotNullParameter(str, "<this>");
                o0OOOO00.OooO00o oooO00o = new o0OOOO00.OooO00o();
                oooO00o.OooO0oO(null, str);
                o0oooo00OooO0OO = oooO00o.OooO0OO();
            } catch (IllegalArgumentException unused) {
                o0oooo00OooO0OO = null;
            }
            if (o0oooo00OooO0OO != null) {
                o0OOOO00.OooO00o oooO00oOooO0o = o0oooo00OooO0OO.OooO0o();
                Intrinsics.checkNotNullParameter("", "username");
                String strOooO00o = o0OOOO00.OooO0O0.OooO00o("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
                Intrinsics.checkNotNullParameter(strOooO00o, "<set-?>");
                oooO00oOooO0o.f57355OooO0O0 = strOooO00o;
                Intrinsics.checkNotNullParameter("", "password");
                String strOooO00o2 = o0OOOO00.OooO0O0.OooO00o("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251);
                Intrinsics.checkNotNullParameter(strOooO00o2, "<set-?>");
                oooO00oOooO0o.f57356OooO0OO = strOooO00o2;
                oooO00oOooO0o.f57360OooO0oO = null;
                oooO00oOooO0o.f57361OooO0oo = null;
                str = oooO00oOooO0o.toString();
            }
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    Intrinsics.checkNotNullParameter(str, "<this>");
                    try {
                        Intrinsics.checkNotNullParameter(str, "<this>");
                        o0OOOO00.OooO00o oooO00o2 = new o0OOOO00.OooO00o();
                        oooO00o2.OooO0oO(null, str);
                        o0oooo00OooO0OO2 = oooO00o2.OooO0OO();
                    } catch (IllegalArgumentException unused2) {
                    }
                    str = (o0oooo00OooO0OO2 != null && o0oooo00OooO0OO2.OooO0O0().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, 1999)) >= 0) ? str.substring(0, iLastIndexOf) : str.substring(0, 2000);
                }
            }
            this.f41769OooO0oO.OooOOoo(str);
        }
    }
}
