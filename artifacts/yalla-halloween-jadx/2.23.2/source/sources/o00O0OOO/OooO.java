package o00O0OOO;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.BackoffPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import oo00o.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO implements Runnable {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f36272OooO0o = p115o00O00oO.o0Oo0oo.OooO0o("EnqueueRunnable");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo00o.o0Oo0oo f36273OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oo00o.o000oOoO f36274OooO0o0;

    public OooO(@NonNull oo00o.o0Oo0oo o0oo0oo2) {
        oo00o.o000oOoO o000oooo2 = new oo00o.o000oOoO();
        this.f36273OooO0Oo = o0oo0oo2;
        this.f36274OooO0o0 = o000oooo2;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0302  */
    /* JADX WARN: Code duplicated, block: B:134:0x0306 A[LOOP:5: B:133:0x0304->B:134:0x0306, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x0330  */
    /* JADX WARN: Code duplicated, block: B:138:0x0346  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bb  */
    /* JADX WARN: Instruction removed from duplicated block: B:132:0x0302, please report this as an issue */
    public static boolean OooO00o(@NonNull oo00o.o0Oo0oo o0oo0oo2) throws Throwable {
        boolean zOooO00o;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        Iterator<? extends p115o00O00oO.o000000O> it;
        boolean z9;
        UUID uuid;
        int i;
        List<oo00o.o0Oo0oo> list = o0oo0oo2.f60295OooO0oO;
        String str = f36272OooO0o;
        if (list != null) {
            zOooO00o = false;
            for (oo00o.o0Oo0oo o0oo0oo3 : list) {
                if (o0oo0oo3.f60296OooO0oo) {
                    p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0oO(str, "Already enqueued work ids (" + TextUtils.join(", ", o0oo0oo3.f60294OooO0o0) + ")");
                } else {
                    zOooO00o |= OooO00o(o0oo0oo3);
                }
            }
        } else {
            zOooO00o = false;
        }
        String[] strArr = (String[]) oo00o.o0Oo0oo.OooO0OO(o0oo0oo2).toArray(new String[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        o00000O0 o00000o1 = o0oo0oo2.f60289OooO00o;
        WorkDatabase workDatabase = o00000o1.f60221OooO0OO;
        boolean z10 = strArr != null && strArr.length > 0;
        if (z10) {
            int length = strArr.length;
            int i2 = 0;
            z2 = false;
            z3 = false;
            z = true;
            while (true) {
                if (i2 < length) {
                    String str2 = strArr[i2];
                    o00O0OO.o00Ooo o00oooOooO0oo = workDatabase.OooOo0().OooO0oo(str2);
                    if (o00oooOooO0oo == null) {
                        p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0O0(str, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        WorkInfo$State workInfo$State = o00oooOooO0oo.f36217OooO0O0;
                        z &= workInfo$State == WorkInfo$State.SUCCEEDED;
                        if (workInfo$State == WorkInfo$State.FAILED) {
                            z3 = true;
                        } else if (workInfo$State == WorkInfo$State.CANCELLED) {
                            z2 = true;
                        }
                        i2++;
                    }
                }
                z4 = zOooO00o;
                z8 = true;
                z7 = false;
                o0oo0oo2.f60296OooO0oo = z8;
                return z4 | z7;
            }
        }
        z = true;
        z2 = false;
        z3 = false;
        String str3 = o0oo0oo2.f60290OooO0O0;
        boolean z11 = !TextUtils.isEmpty(str3);
        if (z11 && !z10) {
            ArrayList arrayListOooOO0o = workDatabase.OooOo0().OooOO0o(str3);
            if (arrayListOooOO0o.isEmpty()) {
                z4 = zOooO00o;
                z5 = z10;
            } else {
                ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.APPEND;
                ExistingWorkPolicy existingWorkPolicy2 = o0oo0oo2.f60291OooO0OO;
                if (existingWorkPolicy2 == existingWorkPolicy || existingWorkPolicy2 == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                    o00O0OO.OooO0O0 oooO0O0OooOOOo = workDatabase.OooOOOo();
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = arrayListOooOO0o.iterator();
                    while (it2.hasNext()) {
                        Iterator it3 = it2;
                        o00O0OO.o00Ooo.OooO00o oooO00o = (o00O0OO.o00Ooo.OooO00o) it2.next();
                        boolean z12 = zOooO00o;
                        if (!oooO0O0OooOOOo.OooO0Oo(oooO00o.f36235OooO00o)) {
                            WorkInfo$State workInfo$State2 = WorkInfo$State.SUCCEEDED;
                            WorkInfo$State workInfo$State3 = oooO00o.f36236OooO0O0;
                            boolean z13 = (workInfo$State3 == workInfo$State2) & z;
                            if (workInfo$State3 == WorkInfo$State.FAILED) {
                                z3 = true;
                            } else if (workInfo$State3 == WorkInfo$State.CANCELLED) {
                                z2 = true;
                            }
                            arrayList.add(oooO00o.f36235OooO00o);
                            z = z13;
                        }
                        oooO0O0OooOOOo = oooO0O0OooOOOo;
                        it2 = it3;
                        zOooO00o = z12;
                    }
                    z4 = zOooO00o;
                    List listEmptyList = arrayList;
                    listEmptyList = arrayList;
                    if (existingWorkPolicy2 == ExistingWorkPolicy.APPEND_OR_REPLACE && (z2 || z3)) {
                        o00O0OO.oo000o oo000oVarOooOo0 = workDatabase.OooOo0();
                        Iterator it4 = oo000oVarOooOo0.OooOO0o(str3).iterator();
                        while (it4.hasNext()) {
                            oo000oVarOooOo0.OooO00o(((o00O0OO.o00Ooo.OooO00o) it4.next()).f36235OooO00o);
                        }
                        z2 = false;
                        z3 = false;
                        listEmptyList = Collections.emptyList();
                    }
                    strArr = (String[]) listEmptyList.toArray(strArr);
                    z5 = strArr.length > 0;
                } else {
                    if (existingWorkPolicy2 == ExistingWorkPolicy.KEEP) {
                        Iterator it5 = arrayListOooOO0o.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                WorkInfo$State workInfo$State4 = ((o00O0OO.o00Ooo.OooO00o) it5.next()).f36236OooO0O0;
                                boolean z14 = z10;
                                if (workInfo$State4 == WorkInfo$State.ENQUEUED || workInfo$State4 == WorkInfo$State.RUNNING) {
                                    z4 = zOooO00o;
                                    z8 = true;
                                    z7 = false;
                                    o0oo0oo2.f60296OooO0oo = z8;
                                    return z4 | z7;
                                }
                                z10 = z14;
                            }
                        }
                    }
                    boolean z15 = z10;
                    new OooO0OO(o00000o1, str3, false).run();
                    o00O0OO.oo000o oo000oVarOooOo1 = workDatabase.OooOo0();
                    Iterator it6 = arrayListOooOO0o.iterator();
                    while (it6.hasNext()) {
                        oo000oVarOooOo1.OooO00o(((o00O0OO.o00Ooo.OooO00o) it6.next()).f36235OooO00o);
                    }
                    z4 = zOooO00o;
                    z5 = z15;
                    z6 = true;
                }
            }
            z6 = false;
        } else {
            z4 = zOooO00o;
            z5 = z10;
            z6 = false;
        }
        Iterator<? extends p115o00O00oO.o000000O> it7 = o0oo0oo2.f60292OooO0Oo.iterator();
        while (it7.hasNext()) {
            p115o00O00oO.o000000O next = it7.next();
            o00O0OO.o00Ooo workSpec = next.f36144OooO0O0;
            if (!z5 || z) {
                it = it7;
                workSpec.f36227OooOOO = jCurrentTimeMillis;
            } else if (z3) {
                it = it7;
                workSpec.f36217OooO0O0 = WorkInfo$State.FAILED;
            } else {
                it = it7;
                if (z2) {
                    workSpec.f36217OooO0O0 = WorkInfo$State.CANCELLED;
                } else {
                    workSpec.f36217OooO0O0 = WorkInfo$State.BLOCKED;
                }
            }
            long j = jCurrentTimeMillis;
            if (workSpec.f36217OooO0O0 == WorkInfo$State.ENQUEUED) {
                z6 = true;
            }
            o00O0OO.oo000o oo000oVarOooOo2 = workDatabase.OooOo0();
            List<oo00o.oo000o> schedulers = o00000o1.f60224OooO0o0;
            Intrinsics.checkNotNullParameter(schedulers, "schedulers");
            Intrinsics.checkNotNullParameter(workSpec, "workSpec");
            o00000O0 o00000o2 = o00000o1;
            if (Build.VERSION.SDK_INT < 26) {
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                p115o00O00oO.Oooo0 oooo0 = workSpec.f36224OooOO0;
                String name = ConstraintTrackingWorker.class.getName();
                z9 = z6;
                String str4 = workSpec.f36218OooO0OO;
                if (!Intrinsics.areEqual(str4, name) && (oooo0.f36134OooO0Oo || oooo0.f36136OooO0o0)) {
                    androidx.work.OooO0O0.OooO00o oooO00o2 = new androidx.work.OooO0O0.OooO00o();
                    oooO00o2.OooO00o(workSpec.f36221OooO0o0.f11474OooO00o);
                    HashMap map = oooO00o2.f11475OooO00o;
                    map.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str4);
                    androidx.work.OooO0O0 input = new androidx.work.OooO0O0(map);
                    androidx.work.OooO0O0.OooO0OO(input);
                    Intrinsics.checkNotNullExpressionValue(input, "Builder().putAll(workSpe…ame)\n            .build()");
                    String workerClassName = ConstraintTrackingWorker.class.getName();
                    Intrinsics.checkNotNullExpressionValue(workerClassName, "name");
                    String id = workSpec.f36216OooO00o;
                    WorkInfo$State state = workSpec.f36217OooO0O0;
                    String str5 = workSpec.f36219OooO0Oo;
                    androidx.work.OooO0O0 output = workSpec.f36220OooO0o;
                    long j2 = workSpec.f36222OooO0oO;
                    long j3 = workSpec.f36223OooO0oo;
                    long j4 = workSpec.f36215OooO;
                    p115o00O00oO.Oooo0 constraints = workSpec.f36224OooOO0;
                    int i3 = workSpec.f36225OooOO0O;
                    BackoffPolicy backoffPolicy = workSpec.f36226OooOO0o;
                    str3 = str3;
                    z11 = z11;
                    long j5 = workSpec.f36228OooOOO0;
                    long j6 = workSpec.f36227OooOOO;
                    long j7 = workSpec.f36229OooOOOO;
                    long j8 = workSpec.f36230OooOOOo;
                    boolean z16 = workSpec.f36232OooOOo0;
                    OutOfQuotaPolicy outOfQuotaPolicy = workSpec.f36231OooOOo;
                    int i4 = workSpec.f36233OooOOoo;
                    int i5 = workSpec.f36234OooOo00;
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
                    Intrinsics.checkNotNullParameter(input, "input");
                    Intrinsics.checkNotNullParameter(output, "output");
                    Intrinsics.checkNotNullParameter(constraints, "constraints");
                    Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
                    Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
                    workSpec = new o00O0OO.o00Ooo(id, state, workerClassName, str5, input, output, j2, j3, j4, constraints, i3, backoffPolicy, j5, j6, j7, j8, z16, outOfQuotaPolicy, i4, i5);
                }
                oo000oVarOooOo2.OooOOoo(workSpec);
                uuid = next.f36143OooO00o;
                if (z5) {
                    for (String str6 : strArr) {
                        String string = uuid.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
                        workDatabase.OooOOOo().OooO0OO(new o00O0OO.OooO00o(string, str6));
                    }
                }
                o00O0OO.o0Oo0oo o0oo0ooOooOo0O = workDatabase.OooOo0O();
                String string2 = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(string2, "id.toString()");
                o0oo0ooOooOo0O.OooO0O0(string2, next.f36145OooO0OO);
                if (z11) {
                    o00O0OO.Oooo0 oooo0OooOOoo = workDatabase.OooOOoo();
                    String string3 = uuid.toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "id.toString()");
                    str3 = str3;
                    oooo0OooOOoo.OooO0O0(new o00O0OO.Oooo000(str3, string3));
                } else {
                    str3 = str3;
                }
                it7 = it;
                o00000o1 = o00000o2;
                jCurrentTimeMillis = j;
                z6 = z9;
                z = z;
                z2 = z2;
                z3 = z3;
                z11 = z11;
            } else {
                z9 = z6;
            }
            oo000oVarOooOo2.OooOOoo(workSpec);
            uuid = next.f36143OooO00o;
            if (z5) {
                while (i < r4) {
                    String string4 = uuid.toString();
                    Intrinsics.checkNotNullExpressionValue(string4, "id.toString()");
                    workDatabase.OooOOOo().OooO0OO(new o00O0OO.OooO00o(string4, str6));
                }
            }
            o00O0OO.o0Oo0oo o0oo0ooOooOo0O2 = workDatabase.OooOo0O();
            String string5 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string5, "id.toString()");
            o0oo0ooOooOo0O2.OooO0O0(string5, next.f36145OooO0OO);
            if (z11) {
                o00O0OO.Oooo0 oooo0OooOOoo2 = workDatabase.OooOOoo();
                String string6 = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(string6, "id.toString()");
                str3 = str3;
                oooo0OooOOoo2.OooO0O0(new o00O0OO.Oooo000(str3, string6));
            } else {
                str3 = str3;
            }
            it7 = it;
            o00000o1 = o00000o2;
            jCurrentTimeMillis = j;
            z6 = z9;
            z = z;
            z2 = z2;
            z3 = z3;
            z11 = z11;
        }
        z7 = z6;
        z8 = true;
        o0oo0oo2.f60296OooO0oo = z8;
        return z4 | z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oo00o.o000oOoO o000oooo2 = this.f36274OooO0o0;
        oo00o.o0Oo0oo o0oo0oo2 = this.f36273OooO0Oo;
        try {
            o0oo0oo2.getClass();
            o00000O0 o00000o1 = o0oo0oo2.f60289OooO00o;
            if (oo00o.o0Oo0oo.OooO0O0(o0oo0oo2, new HashSet())) {
                throw new IllegalStateException("WorkContinuation has cycles (" + o0oo0oo2 + ")");
            }
            WorkDatabase workDatabase = o00000o1.f60221OooO0OO;
            workDatabase.OooO0OO();
            try {
                boolean zOooO00o = OooO00o(o0oo0oo2);
                workDatabase.OooOOO();
                workDatabase.OooOO0();
                if (zOooO00o) {
                    o00O0O.OooO00o(o00000o1.f60219OooO00o, RescheduleReceiver.class, true);
                    oo00o.o00oO0o.OooO00o(o00000o1.f60220OooO0O0, o00000o1.f60221OooO0OO, o00000o1.f60224OooO0o0);
                }
                o000oooo2.OooO00o(p115o00O00oO.oo0o0Oo.f36163OooO00o);
            } catch (Throwable th) {
                workDatabase.OooOO0();
                throw th;
            }
        } catch (Throwable th2) {
            o000oooo2.OooO00o(new o00O00oO.oo0o0Oo.OooO00o.C0414OooO00o(th2));
        }
    }
}
