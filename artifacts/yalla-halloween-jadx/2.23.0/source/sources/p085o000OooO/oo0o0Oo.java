package p085o000OooO;

import android.content.Context;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.ListenableWorker;
import androidx.work.WorkInfo$State;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import o000O.OooO0O0;
import p004OooO0oO.o0OoOo0;
import p022Oooo00O.o00O00OO;
import p084o000Ooo0.o000oOoO;
import p091o000o0O.OooOOOO;
import p091o000o0O.OooOo00;
import p091o000o0O.o000000;
import p091o000o0O.o000OOo;
import p091o000o0O.o0OO00O;
import p091o000o0O.o0OOO0o;
import p091o000o0O.o0Oo0oo;
import p092o000o0O0.o00000O;
import p093o000o0OO.o000000O;
import p093o000o0OO.o00000O0;
import p093o000o0OO.o0ooOOo;
import p094o000o0Oo.o0000O00;
import p096o000o0o0.o0000O0;
import p096o000o0o0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oo0o0Oo implements Runnable {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final String f35170OooOo0O = o000oOoO.OooO0o0("WorkerWrapper");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0000O0 f35171OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f35172OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final List<Oooo000> f35173OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f35174OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0Oo0oo f35175OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ListenableWorker f35176OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final androidx.work.OooO00o f35178OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o00000O f35179OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o0OO00O f35180OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final WorkDatabase f35181OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final OooOOOO f35182OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final o000OOo f35183OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public String f35184OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public ArrayList f35185OooOOo0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public volatile boolean f35187OooOo0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public ListenableWorker.OooO00o f35177OooOO0 = new ListenableWorker.OooO00o.C0165OooO00o();

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final o0000O00<Boolean> f35186OooOOoo = new o0000O00<>();

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public com.google.common.util.concurrent.OooO00o<ListenableWorker.OooO00o> f35188OooOo00 = null;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final Context f35189OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public final o00000O f35190OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public final o0000O0 f35191OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NonNull
        public final androidx.work.OooO00o f35192OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NonNull
        public final String f35193OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NonNull
        public final WorkDatabase f35194OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public List<Oooo000> f35195OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @NonNull
        public WorkerParameters.OooO00o f35196OooO0oo = new WorkerParameters.OooO00o();

        public OooO00o(@NonNull Context context, @NonNull androidx.work.OooO00o oooO00o, @NonNull o0000O0 o0000o1, @NonNull o00000O o00000o, @NonNull WorkDatabase workDatabase, @NonNull String str) {
            this.f35189OooO00o = context.getApplicationContext();
            this.f35191OooO0OO = o0000o1;
            this.f35190OooO0O0 = o00000o;
            this.f35192OooO0Oo = oooO00o;
            this.f35194OooO0o0 = workDatabase;
            this.f35193OooO0o = str;
        }
    }

    public oo0o0Oo(@NonNull OooO00o oooO00o) {
        this.f35172OooO0Oo = oooO00o.f35189OooO00o;
        this.f35171OooO = oooO00o.f35191OooO0OO;
        this.f35179OooOO0o = oooO00o.f35190OooO0O0;
        this.f35174OooO0o0 = oooO00o.f35193OooO0o;
        this.f35173OooO0o = oooO00o.f35195OooO0oO;
        WorkerParameters.OooO00o oooO00o2 = oooO00o.f35196OooO0oo;
        this.f35176OooO0oo = null;
        this.f35178OooOO0O = oooO00o.f35192OooO0Oo;
        WorkDatabase workDatabase = oooO00o.f35194OooO0o0;
        this.f35181OooOOO0 = workDatabase;
        this.f35180OooOOO = workDatabase.OooOo00();
        this.f35182OooOOOO = workDatabase.OooOOOO();
        this.f35183OooOOOo = workDatabase.OooOo0();
    }

    public final boolean OooO() {
        if (!this.f35187OooOo0) {
            return false;
        }
        o000oOoO.OooO0OO().OooO00o(f35170OooOo0O, String.format("Work interrupted for %s", this.f35184OooOOo), new Throwable[0]);
        WorkInfo$State workInfo$StateOooO0o = ((p091o000o0O.oo0o0Oo) this.f35180OooOOO).OooO0o(this.f35174OooO0o0);
        if (workInfo$StateOooO0o == null) {
            OooO0o(false);
        } else {
            OooO0o(!workInfo$StateOooO0o.OooO00o());
        }
        return true;
    }

    public final void OooO00o(ListenableWorker.OooO00o oooO00o) {
        boolean z = oooO00o instanceof ListenableWorker.OooO00o.OooO0OO;
        String str = f35170OooOo0O;
        if (!z) {
            if (oooO00o instanceof ListenableWorker.OooO00o.OooO0O0) {
                o000oOoO.OooO0OO().OooO0Oo(str, String.format("Worker result RETRY for %s", this.f35184OooOOo), new Throwable[0]);
                OooO0Oo();
                return;
            }
            o000oOoO.OooO0OO().OooO0Oo(str, String.format("Worker result FAILURE for %s", this.f35184OooOOo), new Throwable[0]);
            if (this.f35175OooO0oO.OooO0OO()) {
                OooO0o0();
                return;
            } else {
                OooO0oo();
                return;
            }
        }
        o000oOoO.OooO0OO().OooO0Oo(str, String.format("Worker result SUCCESS for %s", this.f35184OooOOo), new Throwable[0]);
        if (this.f35175OooO0oO.OooO0OO()) {
            OooO0o0();
            return;
        }
        OooOOOO oooOOOO = this.f35182OooOOOO;
        String str2 = this.f35174OooO0o0;
        o0OO00O o0oo00o2 = this.f35180OooOOO;
        WorkDatabase workDatabase = this.f35181OooOOO0;
        workDatabase.OooO0OO();
        try {
            ((p091o000o0O.oo0o0Oo) o0oo00o2).OooOOO0(WorkInfo$State.SUCCEEDED, str2);
            ((p091o000o0O.oo0o0Oo) o0oo00o2).OooOO0O(str2, ((ListenableWorker.OooO00o.OooO0OO) this.f35177OooOO0).f8377OooO00o);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str3 : ((OooOo00) oooOOOO).OooO00o(str2)) {
                if (((p091o000o0O.oo0o0Oo) o0oo00o2).OooO0o(str3) == WorkInfo$State.BLOCKED && ((OooOo00) oooOOOO).OooO0O0(str3)) {
                    o000oOoO.OooO0OO().OooO0Oo(str, String.format("Setting status to enqueued for %s", str3), new Throwable[0]);
                    ((p091o000o0O.oo0o0Oo) o0oo00o2).OooOOO0(WorkInfo$State.ENQUEUED, str3);
                    ((p091o000o0O.oo0o0Oo) o0oo00o2).OooOO0o(jCurrentTimeMillis, str3);
                }
            }
            workDatabase.OooOOO0();
        } finally {
            workDatabase.OooOO0();
            OooO0o(false);
        }
    }

    public final void OooO0O0(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            p091o000o0O.oo0o0Oo oo0o0oo = (p091o000o0O.oo0o0Oo) this.f35180OooOOO;
            if (oo0o0oo.OooO0o(str2) != WorkInfo$State.CANCELLED) {
                oo0o0oo.OooOOO0(WorkInfo$State.FAILED, str2);
            }
            linkedList.addAll(((OooOo00) this.f35182OooOOOO).OooO00o(str2));
        }
    }

    public final void OooO0OO() {
        boolean zOooO = OooO();
        String str = this.f35174OooO0o0;
        WorkDatabase workDatabase = this.f35181OooOOO0;
        if (!zOooO) {
            workDatabase.OooO0OO();
            try {
                WorkInfo$State workInfo$StateOooO0o = ((p091o000o0O.oo0o0Oo) this.f35180OooOOO).OooO0o(str);
                o0OOO0o o0ooo0o2 = (o0OOO0o) workDatabase.OooOOoo();
                RoomDatabase roomDatabase = o0ooo0o2.f35258OooO00o;
                roomDatabase.OooO0O0();
                o0OOO0o.OooO0O0 oooO0O0 = o0ooo0o2.f35259OooO0O0;
                SupportSQLiteStatement supportSQLiteStatementOooO00o = oooO0O0.OooO00o();
                if (str == null) {
                    supportSQLiteStatementOooO00o.bindNull(1);
                } else {
                    supportSQLiteStatementOooO00o.bindString(1, str);
                }
                roomDatabase.OooO0OO();
                try {
                    supportSQLiteStatementOooO00o.executeUpdateDelete();
                    roomDatabase.OooOOO0();
                    roomDatabase.OooOO0();
                    oooO0O0.OooO0OO(supportSQLiteStatementOooO00o);
                    if (workInfo$StateOooO0o == null) {
                        OooO0o(false);
                    } else if (workInfo$StateOooO0o == WorkInfo$State.RUNNING) {
                        OooO00o(this.f35177OooOO0);
                    } else if (!workInfo$StateOooO0o.OooO00o()) {
                        OooO0Oo();
                    }
                    workDatabase.OooOOO0();
                    workDatabase.OooOO0();
                } catch (Throwable th) {
                    roomDatabase.OooOO0();
                    oooO0O0.OooO0OO(supportSQLiteStatementOooO00o);
                    throw th;
                }
            } catch (Throwable th2) {
                workDatabase.OooOO0();
                throw th2;
            }
        }
        List<Oooo000> list = this.f35173OooO0o;
        if (list != null) {
            Iterator<Oooo000> it = list.iterator();
            while (it.hasNext()) {
                it.next().OooO00o(str);
            }
            Oooo0.OooO00o(this.f35178OooOO0O, workDatabase, list);
        }
    }

    public final void OooO0Oo() {
        String str = this.f35174OooO0o0;
        o0OO00O o0oo00o2 = this.f35180OooOOO;
        WorkDatabase workDatabase = this.f35181OooOOO0;
        workDatabase.OooO0OO();
        try {
            ((p091o000o0O.oo0o0Oo) o0oo00o2).OooOOO0(WorkInfo$State.ENQUEUED, str);
            ((p091o000o0O.oo0o0Oo) o0oo00o2).OooOO0o(System.currentTimeMillis(), str);
            ((p091o000o0O.oo0o0Oo) o0oo00o2).OooOO0(-1L, str);
            workDatabase.OooOOO0();
        } finally {
            workDatabase.OooOO0();
            OooO0o(true);
        }
    }

    public final void OooO0o(boolean z) {
        ListenableWorker listenableWorker;
        this.f35181OooOOO0.OooO0OO();
        try {
            p091o000o0O.oo0o0Oo oo0o0oo = (p091o000o0O.oo0o0Oo) this.f35181OooOOO0.OooOo00();
            oo0o0oo.getClass();
            TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
            RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            RoomDatabase roomDatabase = oo0o0oo.f35284OooO00o;
            roomDatabase.OooO0O0();
            Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
            try {
                boolean z2 = cursorOooO0O0.moveToFirst() && cursorOooO0O0.getInt(0) != 0;
                cursorOooO0O0.close();
                roomSQLiteQueryOooO00o.release();
                if (!z2) {
                    o0ooOOo.OooO00o(this.f35172OooO0Oo, RescheduleReceiver.class, false);
                }
                if (z) {
                    ((p091o000o0O.oo0o0Oo) this.f35180OooOOO).OooOOO0(WorkInfo$State.ENQUEUED, this.f35174OooO0o0);
                    ((p091o000o0O.oo0o0Oo) this.f35180OooOOO).OooOO0(-1L, this.f35174OooO0o0);
                }
                if (this.f35175OooO0oO != null && (listenableWorker = this.f35176OooO0oo) != null && listenableWorker.OooO0OO()) {
                    o00000O o00000o = this.f35179OooOO0o;
                    String str = this.f35174OooO0o0;
                    OooOo oooOo = (OooOo) o00000o;
                    synchronized (oooOo.f35132OooOOO) {
                        oooOo.f35123OooO.remove(str);
                        oooOo.OooO();
                    }
                }
                this.f35181OooOOO0.OooOOO0();
                this.f35181OooOOO0.OooOO0();
                this.f35186OooOOoo.OooO0oo(Boolean.valueOf(z));
            } catch (Throwable th) {
                cursorOooO0O0.close();
                roomSQLiteQueryOooO00o.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f35181OooOOO0.OooOO0();
            throw th2;
        }
    }

    public final void OooO0o0() {
        String str = this.f35174OooO0o0;
        o0OO00O o0oo00o2 = this.f35180OooOOO;
        WorkDatabase workDatabase = this.f35181OooOOO0;
        workDatabase.OooO0OO();
        try {
            ((p091o000o0O.oo0o0Oo) o0oo00o2).OooOO0o(System.currentTimeMillis(), str);
            ((p091o000o0O.oo0o0Oo) o0oo00o2).OooOOO0(WorkInfo$State.ENQUEUED, str);
            p091o000o0O.oo0o0Oo oo0o0oo = (p091o000o0O.oo0o0Oo) o0oo00o2;
            RoomDatabase roomDatabase = oo0o0oo.f35284OooO00o;
            roomDatabase.OooO0O0();
            o000o0O.oo0o0Oo.OooOO0 oooOO1 = oo0o0oo.f35290OooO0oO;
            SupportSQLiteStatement supportSQLiteStatementOooO00o = oooOO1.OooO00o();
            if (str == null) {
                supportSQLiteStatementOooO00o.bindNull(1);
            } else {
                supportSQLiteStatementOooO00o.bindString(1, str);
            }
            roomDatabase.OooO0OO();
            try {
                supportSQLiteStatementOooO00o.executeUpdateDelete();
                roomDatabase.OooOOO0();
                roomDatabase.OooOO0();
                oooOO1.OooO0OO(supportSQLiteStatementOooO00o);
                ((p091o000o0O.oo0o0Oo) o0oo00o2).OooOO0(-1L, str);
                workDatabase.OooOOO0();
                workDatabase.OooOO0();
                OooO0o(false);
            } catch (Throwable th) {
                roomDatabase.OooOO0();
                oooOO1.OooO0OO(supportSQLiteStatementOooO00o);
                throw th;
            }
        } catch (Throwable th2) {
            workDatabase.OooOO0();
            OooO0o(false);
            throw th2;
        }
    }

    public final void OooO0oO() {
        p091o000o0O.oo0o0Oo oo0o0oo = (p091o000o0O.oo0o0Oo) this.f35180OooOOO;
        String str = this.f35174OooO0o0;
        WorkInfo$State workInfo$StateOooO0o = oo0o0oo.OooO0o(str);
        WorkInfo$State workInfo$State = WorkInfo$State.RUNNING;
        String str2 = f35170OooOo0O;
        if (workInfo$StateOooO0o == workInfo$State) {
            o000oOoO.OooO0OO().OooO00o(str2, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", str), new Throwable[0]);
            OooO0o(true);
        } else {
            o000oOoO.OooO0OO().OooO00o(str2, String.format("Status for %s is %s; not doing any work", str, workInfo$StateOooO0o), new Throwable[0]);
            OooO0o(false);
        }
    }

    @VisibleForTesting
    public final void OooO0oo() {
        String str = this.f35174OooO0o0;
        WorkDatabase workDatabase = this.f35181OooOOO0;
        workDatabase.OooO0OO();
        try {
            OooO0O0(str);
            ((p091o000o0O.oo0o0Oo) this.f35180OooOOO).OooOO0O(str, ((ListenableWorker.OooO00o.C0165OooO00o) this.f35177OooOO0).f8376OooO00o);
            workDatabase.OooOOO0();
        } finally {
            workDatabase.OooOO0();
            OooO0o(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b1 A[Catch: all -> 0x02be, TryCatch #4 {all -> 0x02be, blocks: (B:14:0x0050, B:17:0x005d, B:18:0x0078, B:20:0x007e, B:21:0x009c, B:23:0x00a2, B:25:0x00a8, B:39:0x00ee, B:30:0x00b1, B:35:0x00c4, B:37:0x00cc), top: B:110:0x0050 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c1  */
    @Override // java.lang.Runnable
    @WorkerThread
    public final void run() {
        o0Oo0oo o0oo0oo2;
        boolean z;
        p084o000Ooo0.OooOOOO oooOOOO;
        androidx.work.OooO0O0 oooO0O0OooO00o;
        o000000 o000000Var = (o000000) this.f35183OooOOOo;
        String str = this.f35174OooO0o0;
        ArrayList<String> arrayListOooO00o = o000000Var.OooO00o(str);
        this.f35185OooOOo0 = arrayListOooO00o;
        StringBuilder sbOooO00o = o0OoOo0.OooO00o("Work [ id=", str, ", tags={ ");
        boolean z2 = true;
        boolean z3 = true;
        for (String str2 : arrayListOooO00o) {
            if (z3) {
                z3 = false;
            } else {
                sbOooO00o.append(", ");
            }
            sbOooO00o.append(str2);
        }
        sbOooO00o.append(" } ]");
        this.f35184OooOOo = sbOooO00o.toString();
        o0OO00O o0oo00o2 = this.f35180OooOOO;
        if (OooO()) {
            return;
        }
        WorkDatabase workDatabase = this.f35181OooOOO0;
        workDatabase.OooO0OO();
        try {
            o0Oo0oo o0oo0ooOooO0oo = ((p091o000o0O.oo0o0Oo) o0oo00o2).OooO0oo(str);
            this.f35175OooO0oO = o0oo0ooOooO0oo;
            String str3 = f35170OooOo0O;
            if (o0oo0ooOooO0oo == null) {
                o000oOoO.OooO0OO().OooO0O0(str3, String.format("Didn't find WorkSpec for id %s", str), new Throwable[0]);
                OooO0o(false);
                workDatabase.OooOOO0();
            } else {
                WorkInfo$State workInfo$State = o0oo0ooOooO0oo.f35263OooO0O0;
                WorkInfo$State workInfo$State2 = WorkInfo$State.ENQUEUED;
                if (workInfo$State == workInfo$State2) {
                    if (o0oo0ooOooO0oo.OooO0OO()) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        o0oo0oo2 = this.f35175OooO0oO;
                        if (o0oo0oo2.f35273OooOOO == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            o000oOoO.OooO0OO().OooO00o(str3, String.format("Delaying execution for %s because it is being executed before schedule.", this.f35175OooO0oO.f35264OooO0OO), new Throwable[0]);
                            OooO0o(true);
                            workDatabase.OooOOO0();
                        }
                    } else {
                        o0Oo0oo o0oo0oo3 = this.f35175OooO0oO;
                        if (o0oo0oo3.f35263OooO0O0 == workInfo$State2 && o0oo0oo3.f35271OooOO0O > 0) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            o0oo0oo2 = this.f35175OooO0oO;
                            if (o0oo0oo2.f35273OooOOO == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z && jCurrentTimeMillis2 < o0oo0oo2.OooO00o()) {
                                o000oOoO.OooO0OO().OooO00o(str3, String.format("Delaying execution for %s because it is being executed before schedule.", this.f35175OooO0oO.f35264OooO0OO), new Throwable[0]);
                                OooO0o(true);
                                workDatabase.OooOOO0();
                            }
                        }
                    }
                    workDatabase.OooOOO0();
                    workDatabase.OooOO0();
                    boolean zOooO0OO = this.f35175OooO0oO.OooO0OO();
                    androidx.work.OooO00o oooO00o = this.f35178OooOO0O;
                    if (zOooO0OO) {
                        oooO0O0OooO00o = this.f35175OooO0oO.f35267OooO0o0;
                    } else {
                        p084o000Ooo0.OooOo00 oooOo00 = oooO00o.f8381OooO0Oo;
                        String str4 = this.f35175OooO0oO.f35265OooO0Oo;
                        oooOo00.getClass();
                        String str5 = p084o000Ooo0.OooOOOO.f35105OooO00o;
                        try {
                            oooOOOO = (p084o000Ooo0.OooOOOO) Class.forName(str4).newInstance();
                        } catch (Exception e) {
                            o000oOoO.OooO0OO().OooO0O0(p084o000Ooo0.OooOOOO.f35105OooO00o, o00O00OO.OooO00o("Trouble instantiating + ", str4), e);
                            oooOOOO = null;
                        }
                        if (oooOOOO == null) {
                            o000oOoO.OooO0OO().OooO0O0(str3, String.format("Could not create Input Merger %s", this.f35175OooO0oO.f35265OooO0Oo), new Throwable[0]);
                            OooO0oo();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f35175OooO0oO.f35267OooO0o0);
                        p091o000o0O.oo0o0Oo oo0o0oo = (p091o000o0O.oo0o0Oo) o0oo00o2;
                        oo0o0oo.getClass();
                        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
                        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                        if (str == null) {
                            roomSQLiteQueryOooO00o.bindNull(1);
                        } else {
                            roomSQLiteQueryOooO00o.bindString(1, str);
                        }
                        RoomDatabase roomDatabase = oo0o0oo.f35284OooO00o;
                        roomDatabase.OooO0O0();
                        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase, roomSQLiteQueryOooO00o);
                        try {
                            ArrayList arrayList2 = new ArrayList(cursorOooO0O0.getCount());
                            while (cursorOooO0O0.moveToNext()) {
                                arrayList2.add(androidx.work.OooO0O0.OooO00o(cursorOooO0O0.getBlob(0)));
                            }
                            cursorOooO0O0.close();
                            roomSQLiteQueryOooO00o.release();
                            arrayList.addAll(arrayList2);
                            oooO0O0OooO00o = oooOOOO.OooO00o(arrayList);
                        } catch (Throwable th) {
                            cursorOooO0O0.close();
                            roomSQLiteQueryOooO00o.release();
                            throw th;
                        }
                    }
                    androidx.work.OooO0O0 oooO0O0 = oooO0O0OooO00o;
                    UUID uuidFromString = UUID.fromString(str);
                    ArrayList arrayList3 = this.f35185OooOOo0;
                    int i = this.f35175OooO0oO.f35271OooOO0O;
                    ExecutorService executorService = oooO00o.f8378OooO00o;
                    o0000O0 o0000o1 = this.f35171OooO;
                    p084o000Ooo0.o0OOO0o o0ooo0o2 = oooO00o.f8380OooO0OO;
                    o00000O o00000o = this.f35179OooOO0o;
                    o0000O0 o0000o2 = this.f35171OooO;
                    WorkerParameters workerParameters = new WorkerParameters(uuidFromString, oooO0O0, arrayList3, executorService, o0000o1, o0ooo0o2, new o00000O0(workDatabase, o00000o, o0000o2));
                    if (this.f35176OooO0oo == null) {
                        this.f35176OooO0oo = o0ooo0o2.OooO00o(this.f35172OooO0Oo, this.f35175OooO0oO.f35264OooO0OO, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f35176OooO0oo;
                    if (listenableWorker == null) {
                        o000oOoO.OooO0OO().OooO0O0(str3, String.format("Could not create Worker %s", this.f35175OooO0oO.f35264OooO0OO), new Throwable[0]);
                        OooO0oo();
                        return;
                    }
                    if (listenableWorker.f8374OooO0oO) {
                        o000oOoO.OooO0OO().OooO0O0(str3, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f35175OooO0oO.f35264OooO0OO), new Throwable[0]);
                        OooO0oo();
                        return;
                    }
                    listenableWorker.f8374OooO0oO = true;
                    workDatabase.OooO0OO();
                    try {
                        if (((p091o000o0O.oo0o0Oo) o0oo00o2).OooO0o(str) == WorkInfo$State.ENQUEUED) {
                            ((p091o000o0O.oo0o0Oo) o0oo00o2).OooOOO0(WorkInfo$State.RUNNING, str);
                            p091o000o0O.oo0o0Oo oo0o0oo2 = (p091o000o0O.oo0o0Oo) o0oo00o2;
                            RoomDatabase roomDatabase2 = oo0o0oo2.f35284OooO00o;
                            roomDatabase2.OooO0O0();
                            o000o0O.oo0o0Oo.OooO oooO = oo0o0oo2.f35288OooO0o;
                            SupportSQLiteStatement supportSQLiteStatementOooO00o = oooO.OooO00o();
                            if (str == null) {
                                supportSQLiteStatementOooO00o.bindNull(1);
                            } else {
                                supportSQLiteStatementOooO00o.bindString(1, str);
                            }
                            roomDatabase2.OooO0OO();
                            try {
                                supportSQLiteStatementOooO00o.executeUpdateDelete();
                                roomDatabase2.OooOOO0();
                                roomDatabase2.OooOO0();
                                oooO.OooO0OO(supportSQLiteStatementOooO00o);
                            } catch (Throwable th2) {
                                roomDatabase2.OooOO0();
                                oooO.OooO0OO(supportSQLiteStatementOooO00o);
                                throw th2;
                            }
                        } else {
                            z2 = false;
                        }
                        workDatabase.OooOOO0();
                        workDatabase.OooOO0();
                        if (!z2) {
                            OooO0oO();
                            return;
                        }
                        if (OooO()) {
                            return;
                        }
                        o0000O00 o0000o00 = new o0000O00();
                        o000000O o000000o2 = new o000000O(this.f35172OooO0Oo, this.f35175OooO0oO, this.f35176OooO0oo, workerParameters.f8397OooO0o, this.f35171OooO);
                        o0000O0O o0000o0o2 = (o0000O0O) o0000o2;
                        o0000o0o2.f35391OooO0OO.execute(o000000o2);
                        o0000O00<Void> o0000o01 = o000000o2.f35313OooO0Oo;
                        o0000o01.OooO(new o0Oo0oo(this, o0000o01, o0000o00), o0000o0o2.f35391OooO0OO);
                        o0000o00.OooO(new o0OO00O(this, o0000o00, this.f35184OooOOo), o0000o0o2.f35389OooO00o);
                        return;
                    } catch (Throwable th3) {
                        workDatabase.OooOO0();
                        throw th3;
                    }
                }
                OooO0oO();
                workDatabase.OooOOO0();
                o000oOoO.OooO0OO().OooO00o(str3, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f35175OooO0oO.f35264OooO0OO), new Throwable[0]);
            }
            workDatabase.OooOO0();
        } catch (Throwable th4) {
            workDatabase.OooOO0();
            throw th4;
        }
    }
}
