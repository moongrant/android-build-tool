package p316o0O0oOo0;

import android.content.Context;
import androidx.annotation.NonNull;
import com.android.billingclient.api.o0000Ooo;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.metrics.resource.ResourceType;
import com.google.firebase.perf.util.OooO;
import com.google.firebase.perf.util.OooOO0O;
import com.google.firebase.perf.util.OooOOO;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.SessionVerbosity;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p309o0O0oO0.o000OOo0;
import p309o0O0oO0.o00O00;
import p309o0O0oO0.o00O000o;
import p309o0O0oO0.o00O00O;
import p309o0O0oO0.o00oOoo;
import p311o0O0oO0o.o0O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOo0 f41896OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final double f41897OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final double f41898OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f41899OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f41900OooO0o0;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static final o0O0O00 f41901OooOO0O = o0O0O00.OooO0Oo();

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static final long f41902OooOO0o = TimeUnit.SECONDS.toMicros(1);

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public long f41903OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0000Ooo f41904OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f41905OooO0O0;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooOO0O f41907OooO0Oo;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public OooOO0O f41910OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public OooOO0O f41911OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public long f41912OooOO0;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f41909OooO0o0 = 500;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public double f41908OooO0o = 500;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Timer f41906OooO0OO = new Timer();

        public OooO00o(OooOO0O oooOO0O, o0000Ooo o0000ooo, o000OOo0 o000ooo1, @ResourceType String str) {
            o00O00 o00o01;
            long jLongValue;
            this.f41904OooO00o = o0000ooo;
            this.f41907OooO0Oo = oooOO0O;
            long jOooOO0o = str == ResourceType.TRACE ? o000ooo1.OooOO0o() : o000ooo1.OooOO0o();
            if (str == ResourceType.TRACE) {
                jLongValue = o000ooo1.OooOOo0();
            } else {
                synchronized (o00O00.class) {
                    if (o00O00.f41793OooO00o == null) {
                        o00O00.f41793OooO00o = new o00O00();
                    }
                    o00o01 = o00O00.f41793OooO00o;
                }
                OooO<Long> oooOOooOOO0 = o000ooo1.OooOOO0(o00o01);
                if (oooOOooOOO0.OooO0O0() && o000OOo0.OooOOo(oooOOooOOO0.OooO00o().longValue())) {
                    o000ooo1.f41787OooO0OO.OooO0OO(oooOOooOOO0.OooO00o().longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                    jLongValue = oooOOooOOO0.OooO00o().longValue();
                } else {
                    OooO<Long> oooOOooO0OO = o000ooo1.OooO0OO(o00o01);
                    if (oooOOooO0OO.OooO0O0() && o000OOo0.OooOOo(oooOOooO0OO.OooO00o().longValue())) {
                        jLongValue = oooOOooO0OO.OooO00o().longValue();
                    } else {
                        Long l = 700L;
                        jLongValue = l.longValue();
                    }
                }
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.f41910OooO0oO = new OooOO0O(jLongValue, jOooOO0o, timeUnit);
            this.f41903OooO = jLongValue;
            long jOooOO0o2 = str == ResourceType.TRACE ? o000ooo1.OooOO0o() : o000ooo1.OooOO0o();
            long jOooO0OO = OooO0OO(o000ooo1, str);
            this.f41911OooO0oo = new OooOO0O(jOooO0OO, jOooOO0o2, timeUnit);
            this.f41912OooOO0 = jOooO0OO;
            this.f41905OooO0O0 = false;
        }

        public static long OooO0OO(o000OOo0 o000ooo1, @ResourceType String str) {
            o00O000o o00o000o2;
            if (str == ResourceType.TRACE) {
                return o000ooo1.OooOOOo();
            }
            o000ooo1.getClass();
            synchronized (o00O000o.class) {
                if (o00O000o.f41797OooO00o == null) {
                    o00O000o.f41797OooO00o = new o00O000o();
                }
                o00o000o2 = o00O000o.f41797OooO00o;
            }
            OooO<Long> oooOOooOOO0 = o000ooo1.OooOOO0(o00o000o2);
            if (oooOOooOOO0.OooO0O0() && o000OOo0.OooOOo(oooOOooOOO0.OooO00o().longValue())) {
                o000ooo1.f41787OooO0OO.OooO0OO(oooOOooOOO0.OooO00o().longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                return oooOOooOOO0.OooO00o().longValue();
            }
            OooO<Long> oooOOooO0OO = o000ooo1.OooO0OO(o00o000o2);
            if (oooOOooO0OO.OooO0O0() && o000OOo0.OooOOo(oooOOooO0OO.OooO00o().longValue())) {
                return oooOOooO0OO.OooO00o().longValue();
            }
            Long l = 70L;
            return l.longValue();
        }

        public final synchronized void OooO00o(boolean z) {
            try {
                this.f41907OooO0Oo = z ? this.f41910OooO0oO : this.f41911OooO0oo;
                this.f41909OooO0o0 = z ? this.f41903OooO : this.f41912OooOO0;
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
            this.f41904OooO00o.getClass();
            Timer timer = new Timer();
            Timer timer2 = this.f41906OooO0OO;
            timer2.getClass();
            double d4 = timer.f20005OooO0o0 - timer2.f20005OooO0o0;
            OooOO0O oooOO0O = this.f41907OooO0Oo;
            oooOO0O.getClass();
            int[] iArr = OooOO0O.OooO00o.f20001OooO00o;
            TimeUnit timeUnit = oooOO0O.f20000OooO0OO;
            int i = iArr[timeUnit.ordinal()];
            long j = oooOO0O.f19999OooO0O0;
            long j2 = oooOO0O.f19998OooO00o;
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
                    d2 = (d4 * seconds) / f41902OooOO0o;
                    if (d2 > 0.0d) {
                        this.f41908OooO0o = Math.min(this.f41908OooO0o + d2, this.f41909OooO0o0);
                        this.f41906OooO0OO = timer;
                    }
                    d3 = this.f41908OooO0o;
                    if (d3 >= 1.0d) {
                        this.f41908OooO0o = d3 - 1.0d;
                        return true;
                    }
                    if (this.f41905OooO0O0) {
                        f41901OooOO0O.OooO0o("Exceeded log rate limit, dropping the log.");
                    }
                    return false;
                }
                d = j2 / j;
                nanos = TimeUnit.SECONDS.toMicros(1L);
            }
            seconds = d * nanos;
            d2 = (d4 * seconds) / f41902OooOO0o;
            if (d2 > 0.0d) {
                this.f41908OooO0o = Math.min(this.f41908OooO0o + d2, this.f41909OooO0o0);
                this.f41906OooO0OO = timer;
            }
            d3 = this.f41908OooO0o;
            if (d3 >= 1.0d) {
                this.f41908OooO0o = d3 - 1.0d;
                return true;
            }
            if (this.f41905OooO0O0) {
                f41901OooOO0O.OooO0o("Exceeded log rate limit, dropping the log.");
            }
            return false;
        }
    }

    public o00oO0o(@NonNull Context context, OooOO0O oooOO0O) {
        o0000Ooo o0000ooo = new o0000Ooo();
        double dNextDouble = new Random().nextDouble();
        double dNextDouble2 = new Random().nextDouble();
        o000OOo0 o000ooo0OooO0o0 = o000OOo0.OooO0o0();
        this.f41899OooO0Oo = null;
        this.f41900OooO0o0 = null;
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
        this.f41897OooO0O0 = dNextDouble;
        this.f41898OooO0OO = dNextDouble2;
        this.f41896OooO00o = o000ooo0OooO0o0;
        this.f41899OooO0Oo = new OooO00o(oooOO0O, o0000ooo, o000ooo0OooO0o0, ResourceType.TRACE);
        this.f41900OooO0o0 = new OooO00o(oooOO0O, o0000ooo, o000ooo0OooO0o0, ResourceType.NETWORK);
        OooOOO.OooO00o(context);
    }

    public static boolean OooO00o(List list) {
        return list.size() > 0 && ((PerfSession) list.get(0)).getSessionVerbosityCount() > 0 && ((PerfSession) list.get(0)).getSessionVerbosity(0) == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0034  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    /* JADX WARN: Code duplicated, block: B:24:0x0093  */
    public final boolean OooO0O0() {
        o00oOoo o00oooo2;
        OooO<Double> oooO;
        OooO<Double> oooOOooO0O0;
        double dDoubleValue;
        o000OOo0 o000ooo1 = this.f41896OooO00o;
        o000ooo1.getClass();
        synchronized (o00oOoo.class) {
            if (o00oOoo.f41807OooO00o == null) {
                o00oOoo.f41807OooO00o = new o00oOoo();
            }
            o00oooo2 = o00oOoo.f41807OooO00o;
        }
        OooO<Double> oooOOooOO0 = o000ooo1.OooOO0(o00oooo2);
        if (oooOOooOO0.OooO0O0()) {
            dDoubleValue = oooOOooOO0.OooO00o().doubleValue() / 100.0d;
            if (!o000OOo0.OooOo0O(dDoubleValue)) {
                oooO = o000ooo1.f41785OooO00o.getDouble("fpr_vc_fragment_sampling_rate");
                if (oooO.OooO0O0() || !o000OOo0.OooOo0O(oooO.OooO00o().doubleValue())) {
                    oooOOooO0O0 = o000ooo1.OooO0O0(o00oooo2);
                    if (oooOOooO0O0.OooO0O0() || !o000OOo0.OooOo0O(oooOOooO0O0.OooO00o().doubleValue())) {
                        dDoubleValue = Double.valueOf(0.0d).doubleValue();
                    } else {
                        dDoubleValue = oooOOooO0O0.OooO00o().doubleValue();
                    }
                } else {
                    o000ooo1.f41787OooO0OO.OooO0Oo("com.google.firebase.perf.FragmentSamplingRate", oooO.OooO00o().doubleValue());
                    dDoubleValue = oooO.OooO00o().doubleValue();
                }
            }
        } else {
            oooO = o000ooo1.f41785OooO00o.getDouble("fpr_vc_fragment_sampling_rate");
            if (oooO.OooO0O0()) {
                oooOOooO0O0 = o000ooo1.OooO0O0(o00oooo2);
                if (oooOOooO0O0.OooO0O0()) {
                    dDoubleValue = Double.valueOf(0.0d).doubleValue();
                } else {
                    dDoubleValue = Double.valueOf(0.0d).doubleValue();
                }
            } else {
                oooOOooO0O0 = o000ooo1.OooO0O0(o00oooo2);
                if (oooOOooO0O0.OooO0O0()) {
                    dDoubleValue = Double.valueOf(0.0d).doubleValue();
                } else {
                    dDoubleValue = Double.valueOf(0.0d).doubleValue();
                }
            }
        }
        return this.f41898OooO0OO < dDoubleValue;
    }

    public final boolean OooO0OO() {
        o00O00O o00o00o2;
        double dDoubleValue;
        o000OOo0 o000ooo1 = this.f41896OooO00o;
        o000ooo1.getClass();
        synchronized (o00O00O.class) {
            if (o00O00O.f41798OooO00o == null) {
                o00O00O.f41798OooO00o = new o00O00O();
            }
            o00o00o2 = o00O00O.f41798OooO00o;
        }
        RemoteConfigManager remoteConfigManager = o000ooo1.f41785OooO00o;
        o00o00o2.getClass();
        OooO<Double> oooO = remoteConfigManager.getDouble("fpr_vc_network_request_sampling_rate");
        if (oooO.OooO0O0() && o000OOo0.OooOo0O(oooO.OooO00o().doubleValue())) {
            o000ooo1.f41787OooO0OO.OooO0Oo("com.google.firebase.perf.NetworkRequestSamplingRate", oooO.OooO00o().doubleValue());
            dDoubleValue = oooO.OooO00o().doubleValue();
        } else {
            OooO<Double> oooOOooO0O0 = o000ooo1.OooO0O0(o00o00o2);
            if (oooOOooO0O0.OooO0O0() && o000OOo0.OooOo0O(oooOOooO0O0.OooO00o().doubleValue())) {
                dDoubleValue = oooOOooO0O0.OooO00o().doubleValue();
            } else {
                dDoubleValue = o000ooo1.f41785OooO00o.isLastFetchFailed() ? Double.valueOf(Double.valueOf(1.0d).doubleValue() / 1000.0d).doubleValue() : Double.valueOf(1.0d).doubleValue();
            }
        }
        return this.f41897OooO0O0 < dDoubleValue;
    }
}
