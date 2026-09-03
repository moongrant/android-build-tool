package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Constants$TraceNames;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import o0O0oo00.OooOOO;
import p305o0O0o0oo.o00Oo0;
import p305o0O0o0oo.o00Ooo;
import p307o0O0oO0.OooOOO0;
import p309o0O0oO0o.o0OOO0o;
import p311o0O0oOO0.o000;
import p319o0O0oo0O.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
public class Trace extends o00Ooo implements Parcelable, o000 {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final OooOOO0 f20440OooOOOo = OooOOO0.OooO0Oo();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ConcurrentHashMap f20441OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WeakReference<o000> f20442OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final GaugeManager f20443OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Trace f20444OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f20445OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ConcurrentHashMap f20446OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final List<PerfSession> f20447OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList f20448OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOOO f20449OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Timer f20450OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final com.google.firebase.perf.util.OooO00o f20451OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Timer f20452OooOOOO;

    public class OooO00o implements Parcelable.Creator<Trace> {
        @Override // android.os.Parcelable.Creator
        public final Trace createFromParcel(@NonNull Parcel parcel) {
            return new Trace(parcel, false);
        }

        @Override // android.os.Parcelable.Creator
        public final Trace[] newArray(int i) {
            return new Trace[i];
        }
    }

    static {
        new ConcurrentHashMap();
        CREATOR = new OooO00o();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trace(@NonNull String str, @NonNull OooOOO oooOOO, @NonNull com.google.firebase.perf.util.OooO00o oooO00o, @NonNull o00Oo0 o00oo1) {
        super(o00oo1);
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.f20442OooO0Oo = new WeakReference<>(this);
        this.f20444OooO0o0 = null;
        this.f20445OooO0oO = str.trim();
        this.f20448OooOO0O = new ArrayList();
        this.f20446OooO0oo = new ConcurrentHashMap();
        this.f20441OooO = new ConcurrentHashMap();
        this.f20451OooOOO0 = oooO00o;
        this.f20449OooOO0o = oooOOO;
        this.f20447OooOO0 = Collections.synchronizedList(new ArrayList());
        this.f20443OooO0o = gaugeManager;
    }

    @Override // p311o0O0oOO0.o000
    public final void OooO00o(PerfSession perfSession) {
        if (perfSession == null) {
            f20440OooOOOo.OooO0o("Unable to add new SessionId to the Trace. Continuing without it.");
            return;
        }
        if (!(this.f20450OooOOO != null) || OooO0OO()) {
            return;
        }
        this.f20447OooOO0.add(perfSession);
    }

    public final void OooO0O0(@NonNull String str, @NonNull String str2) {
        if (OooO0OO()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f20445OooO0oO));
        }
        ConcurrentHashMap concurrentHashMap = this.f20441OooO;
        if (!concurrentHashMap.containsKey(str) && concurrentHashMap.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        o0OOO0o.OooO0O0(str, str2);
    }

    @VisibleForTesting
    public final boolean OooO0OO() {
        return this.f20452OooOOOO != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.f20450OooOOO != null) && !OooO0OO()) {
                f20440OooOOOo.OooO0oO("Trace '%s' is started but not stopped when it is destructed!", this.f20445OooO0oO);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Nullable
    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.f20441OooO.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f20441OooO);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        Counter counter = str != null ? (Counter) this.f20446OooO0oo.get(str.trim()) : null;
        if (counter == null) {
            return 0L;
        }
        return counter.f20439OooO0o0.get();
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j) {
        String strOooO0OO = o0OOO0o.OooO0OO(str);
        OooOOO0 oooOOO0 = f20440OooOOOo;
        if (strOooO0OO != null) {
            oooOOO0.OooO0OO("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strOooO0OO);
            return;
        }
        boolean z = this.f20450OooOOO != null;
        String str2 = this.f20445OooO0oO;
        if (!z) {
            oooOOO0.OooO0oO("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (OooO0OO()) {
            oooOOO0.OooO0oO("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f20446OooO0oo;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        AtomicLong atomicLong = counter.f20439OooO0o0;
        atomicLong.addAndGet(j);
        oooOOO0.OooO0O0("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        OooOOO0 oooOOO0 = f20440OooOOOo;
        boolean z = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            OooO0O0(str, str2);
            oooOOO0.OooO0O0("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f20445OooO0oO);
            z = true;
        } catch (Exception e) {
            oooOOO0.OooO0OO("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
        }
        if (z) {
            this.f20441OooO.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j) {
        String strOooO0OO = o0OOO0o.OooO0OO(str);
        OooOOO0 oooOOO0 = f20440OooOOOo;
        if (strOooO0OO != null) {
            oooOOO0.OooO0OO("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strOooO0OO);
            return;
        }
        boolean z = this.f20450OooOOO != null;
        String str2 = this.f20445OooO0oO;
        if (!z) {
            oooOOO0.OooO0oO("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (OooO0OO()) {
            oooOOO0.OooO0oO("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f20446OooO0oo;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        counter.f20439OooO0o0.set(j);
        oooOOO0.OooO0O0("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (!OooO0OO()) {
            this.f20441OooO.remove(str);
            return;
        }
        OooOOO0 oooOOO0 = f20440OooOOOo;
        if (oooOOO0.f42478OooO0O0) {
            oooOOO0.f42477OooO00o.getClass();
            Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Keep
    public void start() {
        String str;
        boolean zOooOo0 = o0Oo0oo.OooO0o0().OooOo0();
        OooOOO0 oooOOO0 = f20440OooOOOo;
        if (!zOooOo0) {
            oooOOO0.OooO00o("Trace feature is disabled.");
            return;
        }
        String str2 = this.f20445OooO0oO;
        if (str2 != null) {
            if (str2.length() <= 100) {
                if (!str2.startsWith("_")) {
                    str = null;
                    break;
                }
                Constants$TraceNames[] constants$TraceNamesArrValues = Constants$TraceNames.values();
                int length = constants$TraceNamesArrValues.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        if (!str2.startsWith("_st_")) {
                            str = "Trace name must not start with '_'";
                            break;
                        }
                        break;
                    } else if (!constants$TraceNamesArrValues[i].toString().equals(str2)) {
                        i++;
                    }
                    str = null;
                    break;
                }
            } else {
                str = String.format(Locale.US, "Trace name must not exceed %d characters", 100);
            }
        } else {
            str = "Trace name must not be null";
        }
        if (str != null) {
            oooOOO0.OooO0OO("Cannot start trace '%s'. Trace name is invalid.(%s)", str2, str);
            return;
        }
        if (this.f20450OooOOO != null) {
            oooOOO0.OooO0OO("Trace '%s' has already started, should not start again!", str2);
            return;
        }
        this.f20451OooOOO0.getClass();
        this.f20450OooOOO = new Timer();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f20442OooO0Oo);
        OooO00o(perfSession);
        if (perfSession.f20454OooO0o) {
            this.f20443OooO0o.collectGaugeMetricOnce(perfSession.f20455OooO0o0);
        }
    }

    @Keep
    public void stop() {
        boolean z = this.f20450OooOOO != null;
        String str = this.f20445OooO0oO;
        OooOOO0 oooOOO0 = f20440OooOOOo;
        if (!z) {
            oooOOO0.OooO0OO("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (OooO0OO()) {
            oooOOO0.OooO0OO("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f20442OooO0Oo);
        unregisterForAppState();
        this.f20451OooOOO0.getClass();
        Timer timer = new Timer();
        this.f20452OooOOOO = timer;
        if (this.f20444OooO0o0 == null) {
            ArrayList arrayList = this.f20448OooOO0O;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) arrayList.get(arrayList.size() - 1);
                if (trace.f20452OooOOOO == null) {
                    trace.f20452OooOOOO = timer;
                }
            }
            if (str.isEmpty()) {
                if (oooOOO0.f42478OooO0O0) {
                    oooOOO0.f42477OooO00o.getClass();
                    Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
                    return;
                }
                return;
            }
            this.f20449OooOO0o.OooO0OO(new p308o0O0oO0O.o00Oo0(this).OooO00o(), getAppState());
            if (SessionManager.getInstance().perfSession().f20454OooO0o) {
                this.f20443OooO0o.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f20455OooO0o0);
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.f20444OooO0o0, 0);
        parcel.writeString(this.f20445OooO0oO);
        parcel.writeList(this.f20448OooOO0O);
        parcel.writeMap(this.f20446OooO0oo);
        parcel.writeParcelable(this.f20450OooOOO, 0);
        parcel.writeParcelable(this.f20452OooOOOO, 0);
        synchronized (this.f20447OooOO0) {
            parcel.writeList(this.f20447OooOO0);
        }
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : o00Oo0.OooO00o());
        this.f20442OooO0Oo = new WeakReference<>(this);
        this.f20444OooO0o0 = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f20445OooO0oO = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f20448OooOO0O = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f20446OooO0oo = concurrentHashMap;
        this.f20441OooO = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.f20450OooOOO = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.f20452OooOOOO = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f20447OooOO0 = listSynchronizedList;
        parcel.readList(listSynchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.f20449OooOO0o = null;
            this.f20451OooOOO0 = null;
            this.f20443OooO0o = null;
        } else {
            this.f20449OooOO0o = OooOOO.f42635OooOo0O;
            this.f20451OooOOO0 = new com.google.firebase.perf.util.OooO00o();
            this.f20443OooO0o = GaugeManager.getInstance();
        }
    }
}
