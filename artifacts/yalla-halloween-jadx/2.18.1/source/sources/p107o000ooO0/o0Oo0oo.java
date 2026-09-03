package p107o000ooO0;

import android.content.Context;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import com.google.common.util.concurrent.OooO0OO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import o00O0000.OooO0O0;
import o00O0000.o000oOoO;
import o00O0000.o00O0O;
import o00O0000.o00Oo0;
import o00O0000.o00oO0o;
import o00O0000.oo000o;
import p091o000o00o.o0000O0;
import p102o000oo.OooOo;
import p102o000oo.OooOo00;
import p102o000oo.o0OoOo0;
import p236o00oOoo.o00OOOO0;
import p326o0O0ooO.o00O00;
import p326o0O0ooO.o00O0O00;
import p326o0O0ooO.o00O0O0O;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0Oo0oo implements Runnable {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final String f29985OooooOo = o0OoOo0.OooO0o0("WorkerWrapper");

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public WorkerParameters.OooO00o f29986Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Context f29987Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public String f29988Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public List<Oooo000> f29989Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public o00O0000.o0OoOo0 f29992OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public o00O000.OooO00o f29993OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public androidx.work.OooO00o f29994OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public WorkDatabase f29995OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public o00O0O f29996OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public OooO0O0 f29997OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public oo000o f29998OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public List<String> f29999OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public String f30000Ooooo00;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public volatile boolean f30003OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public o00.OooO00o f30004o000oOoO;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NonNull
    public ListenableWorker.OooO00o f29990OoooO = new ListenableWorker.OooO00o.C0067OooO00o();

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NonNull
    public o00OOOO0<Boolean> f30001Ooooo0o = new o00OOOO0<>();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public OooO0OO<ListenableWorker.OooO00o> f30002OooooO0 = null;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public ListenableWorker f29991OoooO0 = null;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public Context f30005OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public o00.OooO00o f30006OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public o00O000.OooO00o f30007OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public androidx.work.OooO00o f30008OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NonNull
        public String f30009OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NonNull
        public WorkDatabase f30010OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public List<Oooo000> f30011OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NonNull
        public WorkerParameters.OooO00o f30012OooO0oo = new WorkerParameters.OooO00o();

        public OooO00o(@NonNull Context context, @NonNull androidx.work.OooO00o oooO00o, @NonNull o00O000.OooO00o oooO00o2, @NonNull o00.OooO00o oooO00o3, @NonNull WorkDatabase workDatabase, @NonNull String str) {
            this.f30005OooO00o = context.getApplicationContext();
            this.f30007OooO0OO = oooO00o2;
            this.f30006OooO0O0 = oooO00o3;
            this.f30008OooO0Oo = oooO00o;
            this.f30010OooO0o0 = workDatabase;
            this.f30009OooO0o = str;
        }
    }

    public o0Oo0oo(@NonNull OooO00o oooO00o) {
        this.f29987Oooo0o = oooO00o.f30005OooO00o;
        this.f29993OoooO0O = oooO00o.f30007OooO0OO;
        this.f30004o000oOoO = oooO00o.f30006OooO0O0;
        this.f29988Oooo0oO = oooO00o.f30009OooO0o;
        this.f29989Oooo0oo = oooO00o.f30011OooO0oO;
        this.f29986Oooo = oooO00o.f30012OooO0oo;
        this.f29994OoooOO0 = oooO00o.f30008OooO0Oo;
        WorkDatabase workDatabase = oooO00o.f30010OooO0o0;
        this.f29995OoooOOO = workDatabase;
        this.f29996OoooOOo = workDatabase.OooOo0O();
        this.f29997OoooOo0 = this.f29995OoooOOO.OooOOo0();
        this.f29998OoooOoO = this.f29995OoooOOO.OooOo0o();
    }

    public final boolean OooO() {
        if (!this.f30003OooooOO) {
            return false;
        }
        o0OoOo0.OooO0OO().OooO00o(f29985OooooOo, String.format("Work interrupted for %s", this.f30000Ooooo00), new Throwable[0]);
        WorkInfo$State workInfo$StateOooO0o = ((o00Oo0) this.f29996OoooOOo).OooO0o(this.f29988Oooo0oO);
        if (workInfo$StateOooO0o == null) {
            OooO0o(false);
        } else {
            OooO0o(!workInfo$StateOooO0o.OooO00o());
        }
        return true;
    }

    public final void OooO00o(ListenableWorker.OooO00o oooO00o) {
        if (!(oooO00o instanceof ListenableWorker.OooO00o.OooO0OO)) {
            if (oooO00o instanceof ListenableWorker.OooO00o.OooO0O0) {
                o0OoOo0.OooO0OO().OooO0Oo(f29985OooooOo, String.format("Worker result RETRY for %s", this.f30000Ooooo00), new Throwable[0]);
                OooO0Oo();
                return;
            }
            o0OoOo0.OooO0OO().OooO0Oo(f29985OooooOo, String.format("Worker result FAILURE for %s", this.f30000Ooooo00), new Throwable[0]);
            if (this.f29992OoooO00.OooO0OO()) {
                OooO0o0();
                return;
            } else {
                OooO0oo();
                return;
            }
        }
        o0OoOo0.OooO0OO().OooO0Oo(f29985OooooOo, String.format("Worker result SUCCESS for %s", this.f30000Ooooo00), new Throwable[0]);
        if (this.f29992OoooO00.OooO0OO()) {
            OooO0o0();
            return;
        }
        this.f29995OoooOOO.OooO0OO();
        try {
            ((o00Oo0) this.f29996OoooOOo).OooOOOO(WorkInfo$State.SUCCEEDED, this.f29988Oooo0oO);
            ((o00Oo0) this.f29996OoooOOo).OooOOO0(this.f29988Oooo0oO, ((ListenableWorker.OooO00o.OooO0OO) this.f29990OoooO).f9732OooO00o);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : (ArrayList) ((o00O0000.OooO0OO) this.f29997OoooOo0).OooO00o(this.f29988Oooo0oO)) {
                if (((o00Oo0) this.f29996OoooOOo).OooO0o(str) == WorkInfo$State.BLOCKED && ((o00O0000.OooO0OO) this.f29997OoooOo0).OooO0O0(str)) {
                    o0OoOo0.OooO0OO().OooO0Oo(f29985OooooOo, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    ((o00Oo0) this.f29996OoooOOo).OooOOOO(WorkInfo$State.ENQUEUED, str);
                    ((o00Oo0) this.f29996OoooOOo).OooOOO(str, jCurrentTimeMillis);
                }
            }
            this.f29995OoooOOO.OooOOOO();
        } finally {
            this.f29995OoooOOO.OooOO0O();
            OooO0o(false);
        }
    }

    public final void OooO0O0(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((o00Oo0) this.f29996OoooOOo).OooO0o(str2) != WorkInfo$State.CANCELLED) {
                ((o00Oo0) this.f29996OoooOOo).OooOOOO(WorkInfo$State.FAILED, str2);
            }
            linkedList.addAll(((o00O0000.OooO0OO) this.f29997OoooOo0).OooO00o(str2));
        }
    }

    public final void OooO0OO() {
        if (!OooO()) {
            this.f29995OoooOOO.OooO0OO();
            try {
                WorkInfo$State workInfo$StateOooO0o = ((o00Oo0) this.f29996OoooOOo).OooO0o(this.f29988Oooo0oO);
                ((o000oOoO) this.f29995OoooOOO.OooOo0()).OooO00o(this.f29988Oooo0oO);
                if (workInfo$StateOooO0o == null) {
                    OooO0o(false);
                } else if (workInfo$StateOooO0o == WorkInfo$State.RUNNING) {
                    OooO00o(this.f29990OoooO);
                } else if (!workInfo$StateOooO0o.OooO00o()) {
                    OooO0Oo();
                }
                this.f29995OoooOOO.OooOOOO();
                this.f29995OoooOOO.OooOO0O();
            } catch (Throwable th) {
                this.f29995OoooOOO.OooOO0O();
                throw th;
            }
        }
        List<Oooo000> list = this.f29989Oooo0oo;
        if (list != null) {
            Iterator<Oooo000> it = list.iterator();
            while (it.hasNext()) {
                it.next().OooO0o0(this.f29988Oooo0oO);
            }
            Oooo0.OooO00o(this.f29994OoooOO0, this.f29995OoooOOO, this.f29989Oooo0oo);
        }
    }

    public final void OooO0Oo() {
        this.f29995OoooOOO.OooO0OO();
        try {
            ((o00Oo0) this.f29996OoooOOo).OooOOOO(WorkInfo$State.ENQUEUED, this.f29988Oooo0oO);
            ((o00Oo0) this.f29996OoooOOo).OooOOO(this.f29988Oooo0oO, System.currentTimeMillis());
            ((o00Oo0) this.f29996OoooOOo).OooOO0O(this.f29988Oooo0oO, -1L);
            this.f29995OoooOOO.OooOOOO();
        } finally {
            this.f29995OoooOOO.OooOO0O();
            OooO0o(true);
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.HashMap, java.util.Map<java.lang.String, o000ooO0.o0Oo0oo>] */
    public final void OooO0o(boolean z) {
        ListenableWorker listenableWorker;
        this.f29995OoooOOO.OooO0OO();
        try {
            o00Oo0 o00oo1 = (o00Oo0) this.f29995OoooOOO.OooOo0O();
            Objects.requireNonNull(o00oo1);
            o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            o00oo1.f30139OooO00o.OooO0O0();
            Cursor cursorOooOOO = o00oo1.f30139OooO00o.OooOOO(o0000o0OooO0o);
            try {
                boolean z2 = cursorOooOOO.moveToFirst() && cursorOooOOO.getInt(0) != 0;
                cursorOooOOO.close();
                o0000o0OooO0o.release();
                if (!z2) {
                    o00O00.OooO00o(this.f29987Oooo0o, RescheduleReceiver.class, false);
                }
                if (z) {
                    ((o00Oo0) this.f29996OoooOOo).OooOOOO(WorkInfo$State.ENQUEUED, this.f29988Oooo0oO);
                    ((o00Oo0) this.f29996OoooOOo).OooOO0O(this.f29988Oooo0oO, -1L);
                }
                if (this.f29992OoooO00 != null && (listenableWorker = this.f29991OoooO0) != null && listenableWorker.OooO0OO()) {
                    o00.OooO00o oooO00o = this.f30004o000oOoO;
                    String str = this.f29988Oooo0oO;
                    OooOo oooOo = (OooOo) oooO00o;
                    synchronized (oooOo.f29950OoooOOO) {
                        oooOo.f29946OoooO0.remove(str);
                        oooOo.OooO0oo();
                    }
                }
                this.f29995OoooOOO.OooOOOO();
                this.f29995OoooOOO.OooOO0O();
                this.f30001Ooooo0o.OooOO0(Boolean.valueOf(z));
            } catch (Throwable th) {
                cursorOooOOO.close();
                o0000o0OooO0o.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f29995OoooOOO.OooOO0O();
            throw th2;
        }
    }

    public final void OooO0o0() {
        this.f29995OoooOOO.OooO0OO();
        try {
            ((o00Oo0) this.f29996OoooOOo).OooOOO(this.f29988Oooo0oO, System.currentTimeMillis());
            ((o00Oo0) this.f29996OoooOOo).OooOOOO(WorkInfo$State.ENQUEUED, this.f29988Oooo0oO);
            ((o00Oo0) this.f29996OoooOOo).OooOO0o(this.f29988Oooo0oO);
            ((o00Oo0) this.f29996OoooOOo).OooOO0O(this.f29988Oooo0oO, -1L);
            this.f29995OoooOOO.OooOOOO();
        } finally {
            this.f29995OoooOOO.OooOO0O();
            OooO0o(false);
        }
    }

    public final void OooO0oO() {
        WorkInfo$State workInfo$StateOooO0o = ((o00Oo0) this.f29996OoooOOo).OooO0o(this.f29988Oooo0oO);
        if (workInfo$StateOooO0o == WorkInfo$State.RUNNING) {
            o0OoOo0.OooO0OO().OooO00o(f29985OooooOo, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f29988Oooo0oO), new Throwable[0]);
            OooO0o(true);
        } else {
            o0OoOo0.OooO0OO().OooO00o(f29985OooooOo, String.format("Status for %s is %s; not doing any work", this.f29988Oooo0oO, workInfo$StateOooO0o), new Throwable[0]);
            OooO0o(false);
        }
    }

    @VisibleForTesting
    public final void OooO0oo() {
        this.f29995OoooOOO.OooO0OO();
        try {
            OooO0O0(this.f29988Oooo0oO);
            androidx.work.OooO0O0 oooO0O0 = ((ListenableWorker.OooO00o.C0067OooO00o) this.f29990OoooO).f9731OooO00o;
            ((o00Oo0) this.f29996OoooOOo).OooOOO0(this.f29988Oooo0oO, oooO0O0);
            this.f29995OoooOOO.OooOOOO();
        } finally {
            this.f29995OoooOOO.OooOO0O();
            OooO0o(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c3 A[Catch: all -> 0x02d9, TryCatch #2 {all -> 0x02d9, blocks: (B:14:0x0057, B:16:0x0065, B:17:0x0086, B:19:0x008c, B:20:0x00ae, B:22:0x00b4, B:24:0x00ba, B:38:0x0106, B:29:0x00c3, B:34:0x00d6, B:36:0x00de), top: B:97:0x0057 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d3  */
    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        o00O0000.o0OoOo0 o0oooo1;
        boolean z;
        androidx.work.OooO0O0 oooO0O0OooO00o;
        ArrayList<String> arrayList = (ArrayList) ((o00oO0o) this.f29998OoooOoO).OooO00o(this.f29988Oooo0oO);
        this.f29999OoooOoo = arrayList;
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f29988Oooo0oO);
        sb.append(", tags={ ");
        boolean z2 = true;
        boolean z3 = true;
        for (String str : arrayList) {
            if (z3) {
                z3 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        this.f30000Ooooo00 = sb.toString();
        if (OooO()) {
            return;
        }
        this.f29995OoooOOO.OooO0OO();
        try {
            o00O0000.o0OoOo0 o0oooo0OooO0oo = ((o00Oo0) this.f29996OoooOOo).OooO0oo(this.f29988Oooo0oO);
            this.f29992OoooO00 = o0oooo0OooO0oo;
            if (o0oooo0OooO0oo == null) {
                o0OoOo0.OooO0OO().OooO0O0(f29985OooooOo, String.format("Didn't find WorkSpec for id %s", this.f29988Oooo0oO), new Throwable[0]);
                OooO0o(false);
                this.f29995OoooOOO.OooOOOO();
            } else {
                WorkInfo$State workInfo$State = o0oooo0OooO0oo.f30153OooO0O0;
                WorkInfo$State workInfo$State2 = WorkInfo$State.ENQUEUED;
                if (workInfo$State == workInfo$State2) {
                    if (o0oooo0OooO0oo.OooO0OO()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        o0oooo1 = this.f29992OoooO00;
                        if (o0oooo1.f30163OooOOO == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            o0OoOo0.OooO0OO().OooO00o(f29985OooooOo, String.format("Delaying execution for %s because it is being executed before schedule.", this.f29992OoooO00.f30154OooO0OO), new Throwable[0]);
                            OooO0o(true);
                            this.f29995OoooOOO.OooOOOO();
                        }
                    } else {
                        o00O0000.o0OoOo0 o0oooo2 = this.f29992OoooO00;
                        if (o0oooo2.f30153OooO0O0 == workInfo$State2 && o0oooo2.f30161OooOO0O > 0) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            o0oooo1 = this.f29992OoooO00;
                            if (o0oooo1.f30163OooOOO == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z && jCurrentTimeMillis2 < o0oooo1.OooO00o()) {
                                o0OoOo0.OooO0OO().OooO00o(f29985OooooOo, String.format("Delaying execution for %s because it is being executed before schedule.", this.f29992OoooO00.f30154OooO0OO), new Throwable[0]);
                                OooO0o(true);
                                this.f29995OoooOOO.OooOOOO();
                            }
                        }
                    }
                    this.f29995OoooOOO.OooOOOO();
                    this.f29995OoooOOO.OooOO0O();
                    if (this.f29992OoooO00.OooO0OO()) {
                        oooO0O0OooO00o = this.f29992OoooO00.f30157OooO0o0;
                    } else {
                        OooOo oooOo = this.f29994OoooOO0.f9736OooO0Oo;
                        String str2 = this.f29992OoooO00.f30155OooO0Oo;
                        Objects.requireNonNull(oooOo);
                        String str3 = OooOo00.f29807OooO00o;
                        OooOo00 oooOo00 = null;
                        try {
                            oooOo00 = (OooOo00) Class.forName(str2).newInstance();
                        } catch (Exception e) {
                            o0OoOo0.OooO0OO().OooO0O0(OooOo00.f29807OooO00o, p016OooOoO0.OooOo00.OooO0Oo("Trouble instantiating + ", str2), e);
                        }
                        if (oooOo00 == null) {
                            o0OoOo0.OooO0OO().OooO0O0(f29985OooooOo, String.format("Could not create Input Merger %s", this.f29992OoooO00.f30155OooO0Oo), new Throwable[0]);
                            OooO0oo();
                            return;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(this.f29992OoooO00.f30157OooO0o0);
                        o00O0O o00o0o2 = this.f29996OoooOOo;
                        String str4 = this.f29988Oooo0oO;
                        o00Oo0 o00oo1 = (o00Oo0) o00o0o2;
                        Objects.requireNonNull(o00oo1);
                        o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
                        if (str4 == null) {
                            o0000o0OooO0o.bindNull(1);
                        } else {
                            o0000o0OooO0o.bindString(1, str4);
                        }
                        o00oo1.f30139OooO00o.OooO0O0();
                        Cursor cursorOooOOO = o00oo1.f30139OooO00o.OooOOO(o0000o0OooO0o);
                        try {
                            ArrayList arrayList3 = new ArrayList(cursorOooOOO.getCount());
                            while (cursorOooOOO.moveToNext()) {
                                arrayList3.add(androidx.work.OooO0O0.OooO00o(cursorOooOOO.getBlob(0)));
                            }
                            cursorOooOOO.close();
                            o0000o0OooO0o.release();
                            arrayList2.addAll(arrayList3);
                            oooO0O0OooO00o = oooOo00.OooO00o(arrayList2);
                        } catch (Throwable th) {
                            cursorOooOOO.close();
                            o0000o0OooO0o.release();
                            throw th;
                        }
                    }
                    androidx.work.OooO0O0 oooO0O0 = oooO0O0OooO00o;
                    UUID uuidFromString = UUID.fromString(this.f29988Oooo0oO);
                    List<String> list = this.f29999OoooOoo;
                    int i = this.f29992OoooO00.f30161OooOO0O;
                    androidx.work.OooO00o oooO00o = this.f29994OoooOO0;
                    WorkerParameters workerParameters = new WorkerParameters(uuidFromString, oooO0O0, list, oooO00o.f9733OooO00o, this.f29993OoooO0O, oooO00o.f9735OooO0OO, new o00O0O0O(this.f29995OoooOOO, this.f30004o000oOoO, this.f29993OoooO0O));
                    if (this.f29991OoooO0 == null) {
                        this.f29991OoooO0 = this.f29994OoooOO0.f9735OooO0OO.OooO00o(this.f29987Oooo0o, this.f29992OoooO00.f30154OooO0OO, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f29991OoooO0;
                    if (listenableWorker == null) {
                        o0OoOo0.OooO0OO().OooO0O0(f29985OooooOo, String.format("Could not create Worker %s", this.f29992OoooO00.f30154OooO0OO), new Throwable[0]);
                        OooO0oo();
                        return;
                    }
                    if (listenableWorker.f9726Oooo) {
                        o0OoOo0.OooO0OO().OooO0O0(f29985OooooOo, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f29992OoooO00.f30154OooO0OO), new Throwable[0]);
                        OooO0oo();
                        return;
                    }
                    listenableWorker.f9726Oooo = true;
                    this.f29995OoooOOO.OooO0OO();
                    try {
                        if (((o00Oo0) this.f29996OoooOOo).OooO0o(this.f29988Oooo0oO) == WorkInfo$State.ENQUEUED) {
                            ((o00Oo0) this.f29996OoooOOo).OooOOOO(WorkInfo$State.RUNNING, this.f29988Oooo0oO);
                            ((o00Oo0) this.f29996OoooOOo).OooOO0(this.f29988Oooo0oO);
                        } else {
                            z2 = false;
                        }
                        this.f29995OoooOOO.OooOOOO();
                        this.f29995OoooOOO.OooOO0O();
                        if (!z2) {
                            OooO0oO();
                            return;
                        }
                        if (OooO()) {
                            return;
                        }
                        o00OOOO0 o00oooo1 = new o00OOOO0();
                        o00O0O00 o00o0o01 = new o00O0O00(this.f29987Oooo0o, this.f29992OoooO00, this.f29991OoooO0, workerParameters.f9752OooO0o, this.f29993OoooO0O);
                        ((o00O000.OooO0O0) this.f29993OoooO0O).f30116OooO0OO.execute(o00o0o01);
                        o00OOOO0<Void> o00oooo2 = o00o0o01.f37002Oooo0o;
                        o00oooo2.OooO00o(new o0ooOOo(this, o00oooo2, o00oooo1), ((o00O000.OooO0O0) this.f29993OoooO0O).f30116OooO0OO);
                        o00oooo1.OooO00o(new o0OOO0o(this, o00oooo1, this.f30000Ooooo00), ((o00O000.OooO0O0) this.f29993OoooO0O).f30114OooO00o);
                        return;
                    } catch (Throwable th2) {
                        this.f29995OoooOOO.OooOO0O();
                        throw th2;
                    }
                }
                OooO0oO();
                this.f29995OoooOOO.OooOOOO();
                o0OoOo0.OooO0OO().OooO00o(f29985OooooOo, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f29992OoooO00.f30154OooO0OO), new Throwable[0]);
            }
            this.f29995OoooOOO.OooOO0O();
        } catch (Throwable th3) {
            this.f29995OoooOOO.OooOO0O();
            throw th3;
        }
    }
}
