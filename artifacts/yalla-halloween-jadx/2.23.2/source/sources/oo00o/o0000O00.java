package oo00o;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o0000O00 implements Runnable {

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final String f60230OooOo0 = p115o00O00oO.o0Oo0oo.OooO0o("WorkerWrapper");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final p119o00O0Oo0.o0OoOo0 f60231OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f60232OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<oo000o> f60233OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f60234OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00O0OO.o00Ooo f60235OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public androidx.work.OooO0OO f60236OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final androidx.work.OooO00o f60238OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final oo0o0O0.OooO00o f60239OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o00O0OO.oo000o f60240OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final WorkDatabase f60241OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final o00O0OO.OooO0O0 f60242OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final List<String> f60243OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public String f60245OooOOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public volatile boolean f60247OooOo00;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public androidx.work.OooO0OO.OooO00o f60237OooOO0 = new androidx.work.OooO0OO.OooO00o.C0185OooO00o();

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final p117o00O0OOo.o00000O<Boolean> f60244OooOOo = new p117o00O0OOo.o00000O<>();

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final p117o00O0OOo.o00000O<androidx.work.OooO0OO.OooO00o> f60246OooOOoo = new p117o00O0OOo.o00000O<>();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NonNull
        public WorkerParameters.OooO00o f60248OooO = new WorkerParameters.OooO00o();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final Context f60249OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public final oo0o0O0.OooO00o f60250OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public final p119o00O0Oo0.o0OoOo0 f60251OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public final androidx.work.OooO00o f60252OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NonNull
        public final o00O0OO.o00Ooo f60253OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NonNull
        public final WorkDatabase f60254OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public List<oo000o> f60255OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final List<String> f60256OooO0oo;

        public OooO00o(@NonNull Context context, @NonNull androidx.work.OooO00o oooO00o, @NonNull p119o00O0Oo0.o0OoOo0 o0oooo1, @NonNull oo0o0O0.OooO00o oooO00o2, @NonNull WorkDatabase workDatabase, @NonNull o00O0OO.o00Ooo o00ooo2, @NonNull ArrayList arrayList) {
            this.f60249OooO00o = context.getApplicationContext();
            this.f60251OooO0OO = o0oooo1;
            this.f60250OooO0O0 = oooO00o2;
            this.f60252OooO0Oo = oooO00o;
            this.f60254OooO0o0 = workDatabase;
            this.f60253OooO0o = o00ooo2;
            this.f60256OooO0oo = arrayList;
        }
    }

    public o0000O00(@NonNull OooO00o oooO00o) {
        this.f60232OooO0Oo = oooO00o.f60249OooO00o;
        this.f60231OooO = oooO00o.f60251OooO0OO;
        this.f60239OooOO0o = oooO00o.f60250OooO0O0;
        o00O0OO.o00Ooo o00ooo2 = oooO00o.f60253OooO0o;
        this.f60235OooO0oO = o00ooo2;
        this.f60234OooO0o0 = o00ooo2.f36216OooO00o;
        this.f60233OooO0o = oooO00o.f60255OooO0oO;
        WorkerParameters.OooO00o oooO00o2 = oooO00o.f60248OooO;
        this.f60236OooO0oo = null;
        this.f60238OooOO0O = oooO00o.f60252OooO0Oo;
        WorkDatabase workDatabase = oooO00o.f60254OooO0o0;
        this.f60241OooOOO0 = workDatabase;
        this.f60240OooOOO = workDatabase.OooOo0();
        this.f60242OooOOOO = workDatabase.OooOOOo();
        this.f60243OooOOOo = oooO00o.f60256OooO0oo;
    }

    public final void OooO00o(androidx.work.OooO0OO.OooO00o oooO00o) {
        boolean z = oooO00o instanceof androidx.work.OooO0OO.OooO00o.C0186OooO0OO;
        o00O0OO.o00Ooo o00ooo2 = this.f60235OooO0oO;
        String str = f60230OooOo0;
        if (!z) {
            if (oooO00o instanceof androidx.work.OooO0OO.OooO00o.OooO0O0) {
                p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0o0(str, "Worker result RETRY for " + this.f60245OooOOo0);
                OooO0OO();
                return;
            }
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0o0(str, "Worker result FAILURE for " + this.f60245OooOOo0);
            if (o00ooo2.OooO0OO()) {
                OooO0Oo();
                return;
            } else {
                OooO0oO();
                return;
            }
        }
        p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0o0(str, "Worker result SUCCESS for " + this.f60245OooOOo0);
        if (o00ooo2.OooO0OO()) {
            OooO0Oo();
            return;
        }
        o00O0OO.OooO0O0 oooO0O0 = this.f60242OooOOOO;
        String str2 = this.f60234OooO0o0;
        o00O0OO.oo000o oo000oVar = this.f60240OooOOO;
        WorkDatabase workDatabase = this.f60241OooOOO0;
        workDatabase.OooO0OO();
        try {
            oo000oVar.OooOOO(WorkInfo$State.SUCCEEDED, str2);
            oo000oVar.OooOOOO(str2, ((androidx.work.OooO0OO.OooO00o.C0186OooO0OO) this.f60237OooOO0).f11481OooO00o);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : oooO0O0.OooO00o(str2)) {
                if (oo000oVar.OooO0oO(str3) == WorkInfo$State.BLOCKED && oooO0O0.OooO0O0(str3)) {
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0o0(str, "Setting status to enqueued for " + str3);
                    oo000oVar.OooOOO(WorkInfo$State.ENQUEUED, str3);
                    oo000oVar.OooOOOo(jCurrentTimeMillis, str3);
                }
            }
            workDatabase.OooOOO();
        } finally {
            workDatabase.OooOO0();
            OooO0o0(false);
        }
    }

    public final void OooO0O0() {
        boolean zOooO0oo = OooO0oo();
        String str = this.f60234OooO0o0;
        WorkDatabase workDatabase = this.f60241OooOOO0;
        if (!zOooO0oo) {
            workDatabase.OooO0OO();
            try {
                WorkInfo$State workInfo$StateOooO0oO = this.f60240OooOOO.OooO0oO(str);
                workDatabase.OooOo00().OooO00o(str);
                if (workInfo$StateOooO0oO == null) {
                    OooO0o0(false);
                } else if (workInfo$StateOooO0oO == WorkInfo$State.RUNNING) {
                    OooO00o(this.f60237OooOO0);
                } else if (!workInfo$StateOooO0oO.OooO00o()) {
                    OooO0OO();
                }
                workDatabase.OooOOO();
                workDatabase.OooOO0();
            } catch (Throwable th) {
                workDatabase.OooOO0();
                throw th;
            }
        }
        List<oo000o> list = this.f60233OooO0o;
        if (list != null) {
            Iterator<oo000o> it = list.iterator();
            while (it.hasNext()) {
                it.next().OooO0O0(str);
            }
            o00oO0o.OooO00o(this.f60238OooOO0O, workDatabase, list);
        }
    }

    public final void OooO0OO() {
        String str = this.f60234OooO0o0;
        o00O0OO.oo000o oo000oVar = this.f60240OooOOO;
        WorkDatabase workDatabase = this.f60241OooOOO0;
        workDatabase.OooO0OO();
        try {
            oo000oVar.OooOOO(WorkInfo$State.ENQUEUED, str);
            oo000oVar.OooOOOo(System.currentTimeMillis(), str);
            oo000oVar.OooO0OO(-1L, str);
            workDatabase.OooOOO();
        } finally {
            workDatabase.OooOO0();
            OooO0o0(true);
        }
    }

    public final void OooO0Oo() {
        String str = this.f60234OooO0o0;
        o00O0OO.oo000o oo000oVar = this.f60240OooOOO;
        WorkDatabase workDatabase = this.f60241OooOOO0;
        workDatabase.OooO0OO();
        try {
            oo000oVar.OooOOOo(System.currentTimeMillis(), str);
            oo000oVar.OooOOO(WorkInfo$State.ENQUEUED, str);
            oo000oVar.OooOo00(str);
            oo000oVar.OooO0O0(str);
            oo000oVar.OooO0OO(-1L, str);
            workDatabase.OooOOO();
        } finally {
            workDatabase.OooOO0();
            OooO0o0(false);
        }
    }

    public final void OooO0o() {
        o00O0OO.oo000o oo000oVar = this.f60240OooOOO;
        String str = this.f60234OooO0o0;
        WorkInfo$State workInfo$StateOooO0oO = oo000oVar.OooO0oO(str);
        WorkInfo$State workInfo$State = WorkInfo$State.RUNNING;
        String str2 = f60230OooOo0;
        if (workInfo$StateOooO0oO == workInfo$State) {
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            OooO0o0(true);
            return;
        }
        p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(str2, "Status for " + str + " is " + workInfo$StateOooO0oO + " ; not doing any work");
        OooO0o0(false);
    }

    public final void OooO0o0(boolean z) {
        boolean zContainsKey;
        this.f60241OooOOO0.OooO0OO();
        try {
            if (!this.f60241OooOOO0.OooOo0().OooOOo()) {
                o00O0OOO.o00O0O.OooO00o(this.f60232OooO0Oo, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f60240OooOOO.OooOOO(WorkInfo$State.ENQUEUED, this.f60234OooO0o0);
                this.f60240OooOOO.OooO0OO(-1L, this.f60234OooO0o0);
            }
            if (this.f60235OooO0oO != null && this.f60236OooO0oo != null) {
                oo0o0O0.OooO00o oooO00o = this.f60239OooOO0o;
                String str = this.f60234OooO0o0;
                o00Oo0 o00oo1 = (o00Oo0) oooO00o;
                synchronized (o00oo1.f60278OooOOOO) {
                    zContainsKey = o00oo1.f60267OooO.containsKey(str);
                }
                if (zContainsKey) {
                    ((o00Oo0) this.f60239OooOO0o).OooOO0O(this.f60234OooO0o0);
                }
            }
            this.f60241OooOOO0.OooOOO();
            this.f60241OooOOO0.OooOO0();
            this.f60244OooOOo.OooO(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f60241OooOOO0.OooOO0();
            throw th;
        }
    }

    @VisibleForTesting
    public final void OooO0oO() {
        String str = this.f60234OooO0o0;
        WorkDatabase workDatabase = this.f60241OooOOO0;
        workDatabase.OooO0OO();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean zIsEmpty = linkedList.isEmpty();
                o00O0OO.oo000o oo000oVar = this.f60240OooOOO;
                if (zIsEmpty) {
                    oo000oVar.OooOOOO(str, ((androidx.work.OooO0OO.OooO00o.C0185OooO00o) this.f60237OooOO0).f11480OooO00o);
                    workDatabase.OooOOO();
                    return;
                } else {
                    String str2 = (String) linkedList.remove();
                    if (oo000oVar.OooO0oO(str2) != WorkInfo$State.CANCELLED) {
                        oo000oVar.OooOOO(WorkInfo$State.FAILED, str2);
                    }
                    linkedList.addAll(this.f60242OooOOOO.OooO00o(str2));
                }
            }
        } finally {
            workDatabase.OooOO0();
            OooO0o0(false);
        }
    }

    public final boolean OooO0oo() {
        if (!this.f60247OooOo00) {
            return false;
        }
        p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(f60230OooOo0, "Work interrupted for " + this.f60245OooOOo0);
        WorkInfo$State workInfo$StateOooO0oO = this.f60240OooOOO.OooO0oO(this.f60234OooO0o0);
        if (workInfo$StateOooO0oO == null) {
            OooO0o0(false);
        } else {
            OooO0o0(!workInfo$StateOooO0oO.OooO00o());
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008b A[Catch: all -> 0x0206, TryCatch #1 {all -> 0x0206, blocks: (B:14:0x004f, B:17:0x0059, B:18:0x0078, B:20:0x007e, B:22:0x0082, B:31:0x00b3, B:27:0x008b, B:29:0x0097), top: B:75:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0097 A[Catch: all -> 0x0206, TRY_LEAVE, TryCatch #1 {all -> 0x0206, blocks: (B:14:0x004f, B:17:0x0059, B:18:0x0078, B:20:0x007e, B:22:0x0082, B:31:0x00b3, B:27:0x008b, B:29:0x0097), top: B:75:0x004f }] */
    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        p115o00O00oO.o00Ooo o00ooo2;
        androidx.work.OooO0O0 oooO0O0OooO00o;
        StringBuilder sb = new StringBuilder("Work [ id=");
        String str = this.f60234OooO0o0;
        sb.append(str);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str2 : this.f60243OooOOOo) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str2);
        }
        sb.append(" } ]");
        this.f60245OooOOo0 = sb.toString();
        o00O0OO.o00Ooo o00ooo3 = this.f60235OooO0oO;
        if (OooO0oo()) {
            return;
        }
        WorkDatabase workDatabase = this.f60241OooOOO0;
        workDatabase.OooO0OO();
        try {
            WorkInfo$State workInfo$State = o00ooo3.f36217OooO0O0;
            WorkInfo$State workInfo$State2 = WorkInfo$State.ENQUEUED;
            String str3 = o00ooo3.f36218OooO0OO;
            String str4 = f60230OooOo0;
            if (workInfo$State == workInfo$State2) {
                if (!o00ooo3.OooO0OO()) {
                    if (o00ooo3.f36217OooO0O0 == workInfo$State2 && o00ooo3.f36225OooOO0O > 0) {
                        if (System.currentTimeMillis() < o00ooo3.OooO00o()) {
                            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(str4, String.format("Delaying execution for %s because it is being executed before schedule.", str3));
                            OooO0o0(true);
                            workDatabase.OooOOO();
                        }
                    }
                } else if (System.currentTimeMillis() < o00ooo3.OooO00o()) {
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(str4, String.format("Delaying execution for %s because it is being executed before schedule.", str3));
                    OooO0o0(true);
                    workDatabase.OooOOO();
                }
                workDatabase.OooOOO();
                workDatabase.OooOO0();
                boolean zOooO0OO = o00ooo3.OooO0OO();
                o00O0OO.oo000o oo000oVar = this.f60240OooOOO;
                androidx.work.OooO00o oooO00o = this.f60238OooOO0O;
                if (zOooO0OO) {
                    oooO0O0OooO00o = o00ooo3.f36221OooO0o0;
                } else {
                    p115o00O00oO.oo000o oo000oVar2 = oooO00o.f11467OooO0Oo;
                    String str5 = o00ooo3.f36219OooO0Oo;
                    oo000oVar2.getClass();
                    String str6 = p115o00O00oO.o00Ooo.f36154OooO00o;
                    try {
                        o00ooo2 = (p115o00O00oO.o00Ooo) Class.forName(str5).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    } catch (Exception e) {
                        p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0OO(p115o00O00oO.o00Ooo.f36154OooO00o, o00O00OO.OooO00o("Trouble instantiating + ", str5), e);
                        o00ooo2 = null;
                    }
                    if (o00ooo2 == null) {
                        p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0O0(str4, "Could not create Input Merger " + o00ooo3.f36219OooO0Oo);
                        OooO0oO();
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(o00ooo3.f36221OooO0o0);
                    arrayList.addAll(oo000oVar.OooO(str));
                    oooO0O0OooO00o = o00ooo2.OooO00o(arrayList);
                }
                androidx.work.OooO0O0 oooO0O0 = oooO0O0OooO00o;
                UUID uuidFromString = UUID.fromString(str);
                List<String> list = this.f60243OooOOOo;
                ExecutorService executorService = oooO00o.f11464OooO00o;
                p119o00O0Oo0.o0OoOo0 o0oooo1 = this.f60231OooO;
                p115o00O00oO.o00000 o00000Var = oooO00o.f11466OooO0OO;
                oo0o0O0.OooO00o oooO00o2 = this.f60239OooOO0o;
                p119o00O0Oo0.o0OoOo0 o0oooo2 = this.f60231OooO;
                WorkerParameters workerParameters = new WorkerParameters(uuidFromString, oooO0O0, list, executorService, o0oooo1, o00000Var, new o00O0OOO.o000OOo(workDatabase, oooO00o2, o0oooo2));
                if (this.f60236OooO0oo == null) {
                    this.f60236OooO0oo = o00000Var.OooO00o(this.f60232OooO0Oo, str3, workerParameters);
                }
                androidx.work.OooO0OO oooO0OO = this.f60236OooO0oo;
                if (oooO0OO == null) {
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0O0(str4, "Could not create Worker " + str3);
                    OooO0oO();
                    return;
                }
                if (oooO0OO.f11479OooO0oO) {
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0O0(str4, "Received an already-used Worker " + str3 + "; Worker Factory should return new instances");
                    OooO0oO();
                    return;
                }
                boolean z2 = true;
                oooO0OO.f11479OooO0oO = true;
                workDatabase.OooO0OO();
                try {
                    if (oo000oVar.OooO0oO(str) == WorkInfo$State.ENQUEUED) {
                        oo000oVar.OooOOO(WorkInfo$State.RUNNING, str);
                        oo000oVar.OooOo0(str);
                    } else {
                        z2 = false;
                    }
                    workDatabase.OooOOO();
                    workDatabase.OooOO0();
                    if (!z2) {
                        OooO0o();
                        return;
                    }
                    if (OooO0oo()) {
                        return;
                    }
                    o00O0OOO.oo0o0Oo oo0o0oo = new o00O0OOO.oo0o0Oo(this.f60232OooO0Oo, this.f60235OooO0oO, this.f60236OooO0oo, workerParameters.f11491OooO0o, this.f60231OooO);
                    p119o00O0Oo0.o00O0O o00o0o2 = (p119o00O0Oo0.o00O0O) o0oooo2;
                    o00o0o2.f36416OooO0OO.execute(oo0o0oo);
                    final p117o00O0OOo.o00000O<Void> o00000o = oo0o0oo.f36323OooO0Oo;
                    Runnable runnable = new Runnable() { // from class: oo00o.o00000OO
                        @Override // java.lang.Runnable
                        public final void run() {
                            o0000O00 o0000o00 = this.f60228OooO0Oo;
                            com.google.common.util.concurrent.OooOO0O oooOO0O = o00000o;
                            if (o0000o00.f60246OooOOoo.f36334OooO0Oo instanceof o00O0OOo.o00000.OooO0O0) {
                                oooOO0O.cancel(true);
                            }
                        }
                    };
                    o00O0OOO.o0OOO0o o0ooo0o2 = new o00O0OOO.o0OOO0o();
                    p117o00O0OOo.o00000O<androidx.work.OooO0OO.OooO00o> o00000o2 = this.f60246OooOOoo;
                    o00000o2.OooO0oo(runnable, o0ooo0o2);
                    o00000o.OooO0oo(new o0000Ooo(this, o00000o), o00o0o2.f36416OooO0OO);
                    o00000o2.OooO0oo(new o0000(this, this.f60245OooOOo0), o00o0o2.f36414OooO00o);
                    return;
                } catch (Throwable th) {
                    workDatabase.OooOO0();
                    throw th;
                }
            }
            OooO0o();
            workDatabase.OooOOO();
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO00o(str4, str3 + " is not in ENQUEUED state. Nothing more to do");
            workDatabase.OooOO0();
        } catch (Throwable th2) {
            workDatabase.OooOO0();
            throw th2;
        }
    }
}
