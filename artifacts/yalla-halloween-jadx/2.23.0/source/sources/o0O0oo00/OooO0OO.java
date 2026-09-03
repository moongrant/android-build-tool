package o0O0oo00;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.resource.ResourceType;
import com.google.firebase.perf.util.OooOo00;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.SessionVerbosity;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p319o0O0oo0O.o00000;
import p319o0O0oo0O.o000000O;
import p319o0O0oo0O.o00000O0;
import p319o0O0oo0O.o000OOo;
import p319o0O0oo0O.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0Oo0oo f42610OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double f42611OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final double f42612OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f42613OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f42614OooO0o0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final p307o0O0oO0.OooOOO0 f42615OooOO0O = p307o0O0oO0.OooOOO0.OooO0Oo();

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final long f42616OooOO0o = TimeUnit.SECONDS.toMicros(1);

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public long f42617OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.firebase.perf.util.OooO00o f42618OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f42619OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public com.google.firebase.perf.util.OooOOO0 f42621OooO0Oo;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public com.google.firebase.perf.util.OooOOO0 f42624OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public com.google.firebase.perf.util.OooOOO0 f42625OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public long f42626OooOO0;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f42623OooO0o0 = 500;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public double f42622OooO0o = 500;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Timer f42620OooO0OO = new Timer();

        public OooO00o(com.google.firebase.perf.util.OooOOO0 oooOOO0, com.google.firebase.perf.util.OooO00o oooO00o, o0Oo0oo o0oo0oo2, @ResourceType String str) {
            o00000 o00000Var;
            long jLongValue;
            this.f42618OooO00o = oooO00o;
            this.f42621OooO0Oo = oooOOO0;
            long jOooOO0o = str == ResourceType.TRACE ? o0oo0oo2.OooOO0o() : o0oo0oo2.OooOO0o();
            if (str == ResourceType.TRACE) {
                jLongValue = o0oo0oo2.OooOOo0();
            } else {
                synchronized (o00000.class) {
                    if (o00000.f42657OooO00o == null) {
                        o00000.f42657OooO00o = new o00000();
                    }
                    o00000Var = o00000.f42657OooO00o;
                }
                com.google.firebase.perf.util.OooOO0<Long> oooOO0OooOOO0 = o0oo0oo2.OooOOO0(o00000Var);
                if (oooOO0OooOOO0.OooO0O0() && o0Oo0oo.OooOOo(oooOO0OooOOO0.OooO00o().longValue())) {
                    o0oo0oo2.f42683OooO0OO.OooO0OO(oooOO0OooOOO0.OooO00o().longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                    jLongValue = oooOO0OooOOO0.OooO00o().longValue();
                } else {
                    com.google.firebase.perf.util.OooOO0<Long> oooOO0OooO0OO = o0oo0oo2.OooO0OO(o00000Var);
                    if (oooOO0OooO0OO.OooO0O0() && o0Oo0oo.OooOOo(oooOO0OooO0OO.OooO00o().longValue())) {
                        jLongValue = oooOO0OooO0OO.OooO00o().longValue();
                    } else {
                        Long l = 700L;
                        jLongValue = l.longValue();
                    }
                }
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.f42624OooO0oO = new com.google.firebase.perf.util.OooOOO0(jLongValue, jOooOO0o, timeUnit);
            this.f42617OooO = jLongValue;
            long jOooOO0o2 = str == ResourceType.TRACE ? o0oo0oo2.OooOO0o() : o0oo0oo2.OooOO0o();
            long jOooO0OO = OooO0OO(o0oo0oo2, str);
            this.f42625OooO0oo = new com.google.firebase.perf.util.OooOOO0(jOooO0OO, jOooOO0o2, timeUnit);
            this.f42626OooOO0 = jOooO0OO;
            this.f42619OooO0O0 = false;
        }

        public static long OooO0OO(o0Oo0oo o0oo0oo2, @ResourceType String str) {
            o000000O o000000o2;
            if (str == ResourceType.TRACE) {
                return o0oo0oo2.OooOOOo();
            }
            o0oo0oo2.getClass();
            synchronized (o000000O.class) {
                if (o000000O.f42660OooO00o == null) {
                    o000000O.f42660OooO00o = new o000000O();
                }
                o000000o2 = o000000O.f42660OooO00o;
            }
            com.google.firebase.perf.util.OooOO0<Long> oooOO0OooOOO0 = o0oo0oo2.OooOOO0(o000000o2);
            if (oooOO0OooOOO0.OooO0O0() && o0Oo0oo.OooOOo(oooOO0OooOOO0.OooO00o().longValue())) {
                o0oo0oo2.f42683OooO0OO.OooO0OO(oooOO0OooOOO0.OooO00o().longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                return oooOO0OooOOO0.OooO00o().longValue();
            }
            com.google.firebase.perf.util.OooOO0<Long> oooOO0OooO0OO = o0oo0oo2.OooO0OO(o000000o2);
            if (oooOO0OooO0OO.OooO0O0() && o0Oo0oo.OooOOo(oooOO0OooO0OO.OooO00o().longValue())) {
                return oooOO0OooO0OO.OooO00o().longValue();
            }
            Long l = 70L;
            return l.longValue();
        }

        public final synchronized void OooO00o(boolean z) {
            try {
                this.f42621OooO0Oo = z ? this.f42624OooO0oO : this.f42625OooO0oo;
                this.f42623OooO0o0 = z ? this.f42617OooO : this.f42626OooOO0;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0067 A[Catch: all -> 0x0090, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0034, B:14:0x005c, B:16:0x0067, B:17:0x0075, B:19:0x007d, B:22:0x0082, B:24:0x0086, B:10:0x003c, B:13:0x0059, B:11:0x0046, B:12:0x0050), top: B:31:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:19:0x007d A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0034, B:14:0x005c, B:16:0x0067, B:17:0x0075, B:19:0x007d, B:22:0x0082, B:24:0x0086, B:10:0x003c, B:13:0x0059, B:11:0x0046, B:12:0x0050), top: B:31:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:22:0x0082 A[Catch: all -> 0x0090, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0034, B:14:0x005c, B:16:0x0067, B:17:0x0075, B:19:0x007d, B:22:0x0082, B:24:0x0086, B:10:0x003c, B:13:0x0059, B:11:0x0046, B:12:0x0050), top: B:31:0x0001 }] */
        /* JADX WARN: Code duplicated, block: B:24:0x0086 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0034, B:14:0x005c, B:16:0x0067, B:17:0x0075, B:19:0x007d, B:22:0x0082, B:24:0x0086, B:10:0x003c, B:13:0x0059, B:11:0x0046, B:12:0x0050), top: B:31:0x0001 }] */
        public final synchronized boolean OooO0O0() {
            double d;
            long nanos;
            double seconds;
            double d2;
            double d3;
            this.f42618OooO00o.getClass();
            Timer timer = new Timer();
            Timer timer2 = this.f42620OooO0OO;
            timer2.getClass();
            double d4 = timer.f20478OooO0o0 - timer2.f20478OooO0o0;
            com.google.firebase.perf.util.OooOOO0 oooOOO0 = this.f42621OooO0Oo;
            oooOOO0.getClass();
            int[] iArr = com.google.firebase.perf.util.OooOOO0.OooO00o.f20474OooO00o;
            TimeUnit timeUnit = oooOOO0.f20473OooO0OO;
            int i = iArr[timeUnit.ordinal()];
            long j = oooOOO0.f20472OooO0O0;
            long j2 = oooOOO0.f20471OooO00o;
            if (i == 1) {
                d = j2 / j;
                nanos = TimeUnit.SECONDS.toNanos(1L);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        seconds = j2 / timeUnit.toSeconds(j);
                    } else {
                        d = j2 / j;
                        nanos = TimeUnit.SECONDS.toMillis(1L);
                    }
                    d2 = (d4 * seconds) / f42616OooOO0o;
                    if (d2 > 0.0d) {
                        this.f42622OooO0o = Math.min(this.f42622OooO0o + d2, this.f42623OooO0o0);
                        this.f42620OooO0OO = timer;
                    }
                    d3 = this.f42622OooO0o;
                    if (d3 >= 1.0d) {
                        this.f42622OooO0o = d3 - 1.0d;
                        return true;
                    }
                    if (this.f42619OooO0O0) {
                        f42615OooOO0O.OooO0o("Exceeded log rate limit, dropping the log.");
                    }
                    return false;
                }
                d = j2 / j;
                nanos = TimeUnit.SECONDS.toMicros(1L);
            }
            seconds = d * nanos;
            d2 = (d4 * seconds) / f42616OooOO0o;
            if (d2 > 0.0d) {
                this.f42622OooO0o = Math.min(this.f42622OooO0o + d2, this.f42623OooO0o0);
                this.f42620OooO0OO = timer;
            }
            d3 = this.f42622OooO0o;
            if (d3 >= 1.0d) {
                this.f42622OooO0o = d3 - 1.0d;
                return true;
            }
            if (this.f42619OooO0O0) {
                f42615OooOO0O.OooO0o("Exceeded log rate limit, dropping the log.");
            }
            return false;
        }
    }

    public OooO0OO(@NonNull Context context, com.google.firebase.perf.util.OooOOO0 oooOOO0) {
        com.google.firebase.perf.util.OooO00o oooO00o = new com.google.firebase.perf.util.OooO00o();
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        o0Oo0oo o0oo0ooOooO0o0 = o0Oo0oo.OooO0o0();
        this.f42613OooO0Oo = null;
        this.f42614OooO0o0 = null;
        boolean z = false;
        if (!(0.0d <= dNextDouble && dNextDouble < 1.0d)) {
            throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0, 1.0).");
        }
        if (0.0d <= dNextDouble2 && dNextDouble2 < 1.0d) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0, 1.0).");
        }
        this.f42611OooO0O0 = dNextDouble;
        this.f42612OooO0OO = dNextDouble2;
        this.f42610OooO00o = o0oo0ooOooO0o0;
        this.f42613OooO0Oo = new OooO00o(oooOOO0, oooO00o, o0oo0ooOooO0o0, ResourceType.TRACE);
        this.f42614OooO0o0 = new OooO00o(oooOOO0, oooO00o, o0oo0ooOooO0o0, ResourceType.NETWORK);
        OooOo00.OooO00o(context);
    }

    public static boolean OooO00o(List list) {
        return list.size() > 0 && ((PerfSession) list.get(0)).getSessionVerbosityCount() > 0 && ((PerfSession) list.get(0)).getSessionVerbosity(0) == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    public final boolean OooO0O0() {
        o000OOo o000ooo2;
        com.google.firebase.perf.util.OooOO0<Double> oooOO1;
        com.google.firebase.perf.util.OooOO0<Double> oooOO0OooO0O0;
        double dDoubleValue;
        o0Oo0oo o0oo0oo2 = this.f42610OooO00o;
        o0oo0oo2.getClass();
        synchronized (o000OOo.class) {
            if (o000OOo.f42676OooO00o == null) {
                o000OOo.f42676OooO00o = new o000OOo();
            }
            o000ooo2 = o000OOo.f42676OooO00o;
        }
        com.google.firebase.perf.util.OooOO0<Double> OooOO1 = o0oo0oo2.OooOO0(o000ooo2);
        if (OooOO1.OooO0O0()) {
            dDoubleValue = OooOO1.OooO00o().doubleValue() / 100.0d;
            if (!o0Oo0oo.OooOo0O(dDoubleValue)) {
                oooOO1 = o0oo0oo2.f42681OooO00o.getDouble("fpr_vc_fragment_sampling_rate");
                if (oooOO1.OooO0O0() || !o0Oo0oo.OooOo0O(oooOO1.OooO00o().doubleValue())) {
                    oooOO0OooO0O0 = o0oo0oo2.OooO0O0(o000ooo2);
                    if (oooOO0OooO0O0.OooO0O0() || !o0Oo0oo.OooOo0O(oooOO0OooO0O0.OooO00o().doubleValue())) {
                        dDoubleValue = Double.valueOf(0.0d).doubleValue();
                    } else {
                        dDoubleValue = oooOO0OooO0O0.OooO00o().doubleValue();
                    }
                } else {
                    o0oo0oo2.f42683OooO0OO.OooO0Oo("com.google.firebase.perf.FragmentSamplingRate", oooOO1.OooO00o().doubleValue());
                    dDoubleValue = oooOO1.OooO00o().doubleValue();
                }
            }
        } else {
            oooOO1 = o0oo0oo2.f42681OooO00o.getDouble("fpr_vc_fragment_sampling_rate");
            if (oooOO1.OooO0O0()) {
                oooOO0OooO0O0 = o0oo0oo2.OooO0O0(o000ooo2);
                if (oooOO0OooO0O0.OooO0O0()) {
                    dDoubleValue = Double.valueOf(0.0d).doubleValue();
                } else {
                    dDoubleValue = Double.valueOf(0.0d).doubleValue();
                }
            } else {
                oooOO0OooO0O0 = o0oo0oo2.OooO0O0(o000ooo2);
                if (oooOO0OooO0O0.OooO0O0()) {
                    dDoubleValue = Double.valueOf(0.0d).doubleValue();
                } else {
                    dDoubleValue = Double.valueOf(0.0d).doubleValue();
                }
            }
        }
        return this.f42612OooO0OO < dDoubleValue;
    }

    public final boolean OooO0OO() {
        o00000O0 o00000o1;
        double dDoubleValue;
        o0Oo0oo o0oo0oo2 = this.f42610OooO00o;
        o0oo0oo2.getClass();
        synchronized (o00000O0.class) {
            if (o00000O0.f42662OooO00o == null) {
                o00000O0.f42662OooO00o = new o00000O0();
            }
            o00000o1 = o00000O0.f42662OooO00o;
        }
        RemoteConfigManager remoteConfigManager = o0oo0oo2.f42681OooO00o;
        o00000o1.getClass();
        com.google.firebase.perf.util.OooOO0<Double> oooOO1 = remoteConfigManager.getDouble("fpr_vc_network_request_sampling_rate");
        if (oooOO1.OooO0O0() && o0Oo0oo.OooOo0O(oooOO1.OooO00o().doubleValue())) {
            o0oo0oo2.f42683OooO0OO.OooO0Oo("com.google.firebase.perf.NetworkRequestSamplingRate", oooOO1.OooO00o().doubleValue());
            dDoubleValue = oooOO1.OooO00o().doubleValue();
        } else {
            com.google.firebase.perf.util.OooOO0<Double> oooOO0OooO0O0 = o0oo0oo2.OooO0O0(o00000o1);
            if (oooOO0OooO0O0.OooO0O0() && o0Oo0oo.OooOo0O(oooOO0OooO0O0.OooO00o().doubleValue())) {
                dDoubleValue = oooOO0OooO0O0.OooO00o().doubleValue();
            } else {
                dDoubleValue = o0oo0oo2.f42681OooO00o.isLastFetchFailed() ? Double.valueOf(Double.valueOf(1.0d).doubleValue() / 1000.0d).doubleValue() : Double.valueOf(1.0d).doubleValue();
            }
        }
        return this.f42611OooO0O0 < dDoubleValue;
    }
}
