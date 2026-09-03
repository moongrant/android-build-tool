package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0000Ooo;
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
import p308o0O0oO.OooOO0;
import p309o0O0oO0.o000OOo0;
import p313o0O0oOO0.o00O0O;
import p316o0O0oOo0.o0OO00O;
import p678oooOO0.o0O0O00;
import p678oooOO0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public class Trace extends o0O0O00 implements Parcelable, o0O0oo00.OooO00o {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final p311o0O0oO0o.o0O0O00 f19968OooOOOo = p311o0O0oO0o.o0O0O00.OooO0Oo();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ConcurrentHashMap f19969OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final WeakReference<o0O0oo00.OooO00o> f19970OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final GaugeManager f19971OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Trace f19972OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f19973OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final ConcurrentHashMap f19974OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final List<PerfSession> f19975OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final ArrayList f19976OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o0OO00O f19977OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public Timer f19978OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o0000Ooo f19979OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public Timer f19980OooOOOO;

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
    public Trace(@NonNull String str, @NonNull o0OO00O o0oo00o2, @NonNull o0000Ooo o0000ooo, @NonNull oo0o0Oo oo0o0oo) {
        super(oo0o0oo);
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.f19970OooO0Oo = new WeakReference<>(this);
        this.f19972OooO0o0 = null;
        this.f19973OooO0oO = str.trim();
        this.f19976OooOO0O = new ArrayList();
        this.f19974OooO0oo = new ConcurrentHashMap();
        this.f19969OooO = new ConcurrentHashMap();
        this.f19979OooOOO0 = o0000ooo;
        this.f19977OooOO0o = o0oo00o2;
        this.f19975OooOO0 = Collections.synchronizedList(new ArrayList());
        this.f19971OooO0o = gaugeManager;
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO00o(PerfSession perfSession) {
        if (perfSession == null) {
            f19968OooOOOo.OooO0o("Unable to add new SessionId to the Trace. Continuing without it.");
            return;
        }
        if (!(this.f19978OooOOO != null) || OooO0OO()) {
            return;
        }
        this.f19975OooOO0.add(perfSession);
    }

    public final void OooO0O0(@NonNull String str, @NonNull String str2) {
        if (OooO0OO()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.f19973OooO0oO));
        }
        ConcurrentHashMap concurrentHashMap = this.f19969OooO;
        if (!concurrentHashMap.containsKey(str) && concurrentHashMap.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        o00O0O.OooO0O0(str, str2);
    }

    @VisibleForTesting
    public final boolean OooO0OO() {
        return this.f19980OooOOOO != null;
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final void finalize() throws Throwable {
        try {
            if ((this.f19978OooOOO != null) && !OooO0OO()) {
                f19968OooOOOo.OooO0oO("Trace '%s' is started but not stopped when it is destructed!", this.f19973OooO0oO);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Nullable
    @Keep
    public String getAttribute(@NonNull String str) {
        return (String) this.f19969OooO.get(str);
    }

    @NonNull
    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f19969OooO);
    }

    @Keep
    public long getLongMetric(@NonNull String str) {
        Counter counter = str != null ? (Counter) this.f19974OooO0oo.get(str.trim()) : null;
        if (counter == null) {
            return 0L;
        }
        return counter.f19967OooO0o0.get();
    }

    @Keep
    public void incrementMetric(@NonNull String str, long j) {
        String strOooO0OO = o00O0O.OooO0OO(str);
        p311o0O0oO0o.o0O0O00 o0o0o00 = f19968OooOOOo;
        if (strOooO0OO != null) {
            o0o0o00.OooO0OO("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, strOooO0OO);
            return;
        }
        boolean z = this.f19978OooOOO != null;
        String str2 = this.f19973OooO0oO;
        if (!z) {
            o0o0o00.OooO0oO("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (OooO0OO()) {
            o0o0o00.OooO0oO("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f19974OooO0oo;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        AtomicLong atomicLong = counter.f19967OooO0o0;
        atomicLong.addAndGet(j);
        o0o0o00.OooO0O0("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    @Keep
    public void putAttribute(@NonNull String str, @NonNull String str2) {
        p311o0O0oO0o.o0O0O00 o0o0o00 = f19968OooOOOo;
        boolean z = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            OooO0O0(str, str2);
            o0o0o00.OooO0O0("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f19973OooO0oO);
            z = true;
        } catch (Exception e) {
            o0o0o00.OooO0OO("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
        }
        if (z) {
            this.f19969OooO.put(str, str2);
        }
    }

    @Keep
    public void putMetric(@NonNull String str, long j) {
        String strOooO0OO = o00O0O.OooO0OO(str);
        p311o0O0oO0o.o0O0O00 o0o0o00 = f19968OooOOOo;
        if (strOooO0OO != null) {
            o0o0o00.OooO0OO("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, strOooO0OO);
            return;
        }
        boolean z = this.f19978OooOOO != null;
        String str2 = this.f19973OooO0oO;
        if (!z) {
            o0o0o00.OooO0oO("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (OooO0OO()) {
            o0o0o00.OooO0oO("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String strTrim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.f19974OooO0oo;
        Counter counter = (Counter) concurrentHashMap.get(strTrim);
        if (counter == null) {
            counter = new Counter(strTrim);
            concurrentHashMap.put(strTrim, counter);
        }
        counter.f19967OooO0o0.set(j);
        o0o0o00.OooO0O0("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j), str2);
    }

    @Keep
    public void removeAttribute(@NonNull String str) {
        if (!OooO0OO()) {
            this.f19969OooO.remove(str);
            return;
        }
        p311o0O0oO0o.o0O0O00 o0o0o00 = f19968OooOOOo;
        if (o0o0o00.f41826OooO0O0) {
            o0o0o00.f41825OooO00o.getClass();
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
        boolean zOooOo0 = o000OOo0.OooO0o0().OooOo0();
        p311o0O0oO0o.o0O0O00 o0o0o00 = f19968OooOOOo;
        if (!zOooOo0) {
            o0o0o00.OooO00o("Trace feature is disabled.");
            return;
        }
        String str2 = this.f19973OooO0oO;
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
            o0o0o00.OooO0OO("Cannot start trace '%s'. Trace name is invalid.(%s)", str2, str);
            return;
        }
        if (this.f19978OooOOO != null) {
            o0o0o00.OooO0OO("Trace '%s' has already started, should not start again!", str2);
            return;
        }
        this.f19979OooOOO0.getClass();
        this.f19978OooOOO = new Timer();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f19970OooO0Oo);
        OooO00o(perfSession);
        if (perfSession.f19982OooO0o) {
            this.f19971OooO0o.collectGaugeMetricOnce(perfSession.f19983OooO0o0);
        }
    }

    @Keep
    public void stop() {
        boolean z = this.f19978OooOOO != null;
        String str = this.f19973OooO0oO;
        p311o0O0oO0o.o0O0O00 o0o0o00 = f19968OooOOOo;
        if (!z) {
            o0o0o00.OooO0OO("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (OooO0OO()) {
            o0o0o00.OooO0OO("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.f19970OooO0Oo);
        unregisterForAppState();
        this.f19979OooOOO0.getClass();
        Timer timer = new Timer();
        this.f19980OooOOOO = timer;
        if (this.f19972OooO0o0 == null) {
            ArrayList arrayList = this.f19976OooOO0O;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) arrayList.get(arrayList.size() - 1);
                if (trace.f19980OooOOOO == null) {
                    trace.f19980OooOOOO = timer;
                }
            }
            if (str.isEmpty()) {
                if (o0o0o00.f41826OooO0O0) {
                    o0o0o00.f41825OooO00o.getClass();
                    Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
                    return;
                }
                return;
            }
            this.f19977OooOO0o.OooO0OO(new OooOO0(this).OooO00o(), getAppState());
            if (SessionManager.getInstance().perfSession().f19982OooO0o) {
                this.f19971OooO0o.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f19983OooO0o0);
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.f19972OooO0o0, 0);
        parcel.writeString(this.f19973OooO0oO);
        parcel.writeList(this.f19976OooOO0O);
        parcel.writeMap(this.f19974OooO0oo);
        parcel.writeParcelable(this.f19978OooOOO, 0);
        parcel.writeParcelable(this.f19980OooOOOO, 0);
        synchronized (this.f19975OooOO0) {
            parcel.writeList(this.f19975OooOO0);
        }
    }

    public Trace(Parcel parcel, boolean z) {
        super(z ? null : oo0o0Oo.OooO00o());
        this.f19970OooO0Oo = new WeakReference<>(this);
        this.f19972OooO0o0 = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f19973OooO0oO = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f19976OooOO0O = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f19974OooO0oo = concurrentHashMap;
        this.f19969OooO = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.f19978OooOOO = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.f19980OooOOOO = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.f19975OooOO0 = listSynchronizedList;
        parcel.readList(listSynchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.f19977OooOO0o = null;
            this.f19979OooOOO0 = null;
            this.f19971OooO0o = null;
        } else {
            this.f19977OooOO0o = o0OO00O.f41914OooOo0O;
            this.f19979OooOOO0 = new o0000Ooo();
            this.f19971OooO0o = GaugeManager.getInstance();
        }
    }
}
