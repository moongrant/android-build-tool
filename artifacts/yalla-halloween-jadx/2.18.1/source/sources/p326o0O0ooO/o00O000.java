package p326o0O0ooO;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import o00O0000.OooO00o;
import o00O0000.OooO0O0;
import o00O0000.OooO0OO;
import o00O0000.OooOOOO;
import o00O0000.OooOo;
import o00O0000.o00O0O;
import o00O0000.o00Oo0;
import o00O0000.o00Ooo;
import o00O0000.oo000o;
import p091o000o00o.o0000O0;
import p102o000oo.OooOO0O;
import p102o000oo.o0OOO0o;
import p102o000oo.o0OoOo0;
import p107o000ooO0.OooOo00;
import p107o000ooO0.Oooo0;
import p107o000ooO0.Oooo000;
import p107o000ooO0.o000oOoO;
import p107o000ooO0.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o00O000 implements Runnable {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static final String f36979Oooo0oo = o0OoOo0.OooO0o0("EnqueueRunnable");

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o000oOoO f36980Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooOo00 f36981Oooo0oO = new OooOo00();

    public o00O000(@NonNull o000oOoO o000oooo2) {
        this.f36980Oooo0o = o000oooo2;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01fd  */
    public static boolean OooO00o(@NonNull o000oOoO o000oooo2) {
        boolean zOooO00o;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        o000oOoO o000oooo3 = o000oooo2;
        List<o000oOoO> list = o000oooo3.f29966OooO0oO;
        if (list != null) {
            zOooO00o = false;
            for (o000oOoO o000oooo4 : list) {
                if (o000oooo4.f29967OooO0oo) {
                    o0OoOo0.OooO0OO().OooO0o(f36979Oooo0oo, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", o000oooo4.f29965OooO0o0)), new Throwable[0]);
                } else {
                    zOooO00o |= OooO00o(o000oooo4);
                }
            }
        } else {
            zOooO00o = false;
        }
        Set<String> setOooO0O0 = o000oOoO.OooO0O0(o000oooo2);
        o00oO0o o00oo0o2 = o000oooo3.f29960OooO00o;
        List<? extends o0OOO0o> list2 = o000oooo3.f29963OooO0Oo;
        String[] strArr = (String[]) setOooO0O0.toArray(new String[0]);
        String str = o000oooo3.f29961OooO0O0;
        ExistingWorkPolicy existingWorkPolicy = o000oooo3.f29962OooO0OO;
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = o00oo0o2.f29976OooO0OO;
        boolean z9 = strArr != null && strArr.length > 0;
        if (z9) {
            int length = strArr.length;
            int i = 0;
            z = true;
            z2 = false;
            z3 = false;
            while (true) {
                if (i < length) {
                    String str2 = strArr[i];
                    o00O0000.o0OoOo0 o0oooo0OooO0oo = ((o00Oo0) workDatabase.OooOo0O()).OooO0oo(str2);
                    if (o0oooo0OooO0oo == null) {
                        o0OoOo0.OooO0OO().OooO0O0(f36979Oooo0oo, String.format("Prerequisite %s doesn't exist; not enqueuing", str2), new Throwable[0]);
                    } else {
                        WorkInfo$State workInfo$State = o0oooo0OooO0oo.f30153OooO0O0;
                        z &= workInfo$State == WorkInfo$State.SUCCEEDED;
                        if (workInfo$State == WorkInfo$State.FAILED) {
                            z2 = true;
                        } else if (workInfo$State == WorkInfo$State.CANCELLED) {
                            z3 = true;
                        }
                        i++;
                    }
                }
                z4 = zOooO00o;
                z6 = true;
                z7 = false;
                o000oooo3.f29967OooO0oo = z6;
                return z4 | z7;
            }
        }
        z = true;
        z2 = false;
        z3 = false;
        boolean z10 = !TextUtils.isEmpty(str);
        if (z10 && !z9) {
            ArrayList arrayList = (ArrayList) ((o00Oo0) workDatabase.OooOo0O()).OooO(str);
            if (arrayList.isEmpty()) {
                z4 = zOooO00o;
            } else if (existingWorkPolicy == ExistingWorkPolicy.APPEND || existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                OooO0O0 oooO0O0OooOOo0 = workDatabase.OooOOo0();
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o00O0000.o0OoOo0.OooO00o oooO00o = (o00O0000.o0OoOo0.OooO00o) it.next();
                    Iterator it2 = it;
                    String str3 = oooO00o.f30169OooO00o;
                    boolean z11 = zOooO00o;
                    OooO0OO oooO0OO = (OooO0OO) oooO0O0OooOOo0;
                    Objects.requireNonNull(oooO0OO);
                    OooO0O0 oooO0O0 = oooO0O0OooOOo0;
                    o0000O0 o0000o0OooO0o = o0000O0.OooO0o("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
                    if (str3 == null) {
                        o0000o0OooO0o.bindNull(1);
                    } else {
                        o0000o0OooO0o.bindString(1, str3);
                    }
                    oooO0OO.f30120OooO00o.OooO0O0();
                    Cursor cursorOooOOO = oooO0OO.f30120OooO00o.OooOOO(o0000o0OooO0o);
                    try {
                        boolean z12 = cursorOooOOO.moveToFirst() && cursorOooOOO.getInt(0) != 0;
                        cursorOooOOO.close();
                        o0000o0OooO0o.release();
                        if (!z12) {
                            WorkInfo$State workInfo$State2 = oooO00o.f30170OooO0O0;
                            boolean z13 = (workInfo$State2 == WorkInfo$State.SUCCEEDED) & z;
                            if (workInfo$State2 == WorkInfo$State.FAILED) {
                                z2 = true;
                            } else if (workInfo$State2 == WorkInfo$State.CANCELLED) {
                                z3 = true;
                            }
                            arrayList2.add(oooO00o.f30169OooO00o);
                            z = z13;
                        }
                        it = it2;
                        zOooO00o = z11;
                        oooO0O0OooOOo0 = oooO0O0;
                    } catch (Throwable th) {
                        cursorOooOOO.close();
                        o0000o0OooO0o.release();
                        throw th;
                    }
                }
                z4 = zOooO00o;
                List listEmptyList = arrayList2;
                listEmptyList = arrayList2;
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z3 || z2)) {
                    o00Oo0 o00oo1 = (o00Oo0) workDatabase.OooOo0O();
                    Iterator it3 = ((ArrayList) o00oo1.OooO(str)).iterator();
                    while (it3.hasNext()) {
                        o00oo1.OooO00o(((o00O0000.o0OoOo0.OooO00o) it3.next()).f30169OooO00o);
                    }
                    z2 = false;
                    z3 = false;
                    listEmptyList = Collections.emptyList();
                }
                strArr = (String[]) listEmptyList.toArray(strArr);
                z9 = strArr.length > 0;
            } else {
                if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            WorkInfo$State workInfo$State3 = ((o00O0000.o0OoOo0.OooO00o) it4.next()).f30170OooO0O0;
                            if (workInfo$State3 == WorkInfo$State.ENQUEUED || workInfo$State3 == WorkInfo$State.RUNNING) {
                                z4 = zOooO00o;
                                z6 = true;
                                z7 = false;
                                o000oooo3.f29967OooO0oo = z6;
                                return z4 | z7;
                            }
                        }
                    }
                }
                new o0O0ooO(o00oo0o2, str).run();
                o00O0O o00o0oOooOo0O = workDatabase.OooOo0O();
                Iterator it5 = arrayList.iterator();
                while (it5.hasNext()) {
                    ((o00Oo0) o00o0oOooOo0O).OooO00o(((o00O0000.o0OoOo0.OooO00o) it5.next()).f30169OooO00o);
                }
                z4 = zOooO00o;
                z5 = true;
            }
            z5 = false;
        } else {
            z4 = zOooO00o;
            z5 = false;
        }
        for (o0OOO0o o0ooo0o2 : list2) {
            o00O0000.o0OoOo0 o0oooo1 = o0ooo0o2.f29816OooO0O0;
            if (!z9 || z) {
                if (o0oooo1.OooO0OO()) {
                    o0oooo1.f30163OooOOO = 0L;
                } else {
                    o0oooo1.f30163OooOOO = jCurrentTimeMillis;
                }
            } else if (z2) {
                o0oooo1.f30153OooO0O0 = WorkInfo$State.FAILED;
            } else if (z3) {
                o0oooo1.f30153OooO0O0 = WorkInfo$State.CANCELLED;
            } else {
                o0oooo1.f30153OooO0O0 = WorkInfo$State.BLOCKED;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23 && i2 <= 25) {
                OooO0O0(o0oooo1);
            } else if (i2 <= 22) {
                try {
                    Class<?> cls = Class.forName("androidx.work.impl.background.gcm.GcmScheduler");
                    Iterator<Oooo000> it6 = o00oo0o2.f29979OooO0o0.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            z8 = false;
                            break;
                        }
                        if (cls.isAssignableFrom(it6.next().getClass())) {
                            z8 = true;
                            break;
                        }
                    }
                } catch (ClassNotFoundException unused) {
                }
                if (z8) {
                    OooO0O0(o0oooo1);
                }
            }
            if (o0oooo1.f30153OooO0O0 == WorkInfo$State.ENQUEUED) {
                z5 = true;
            }
            o00Oo0 o00oo2 = (o00Oo0) workDatabase.OooOo0O();
            o00oo2.f30139OooO00o.OooO0O0();
            o00oo2.f30139OooO00o.OooO0OO();
            try {
                o00oo2.f30140OooO0O0.OooO0oO(o0oooo1);
                o00oo2.f30139OooO00o.OooOOOO();
                o00oo2.f30139OooO00o.OooOO0O();
                if (z9) {
                    int length2 = strArr.length;
                    int i3 = 0;
                    while (i3 < length2) {
                        int i4 = length2;
                        OooO00o oooO00o2 = new OooO00o(o0ooo0o2.OooO00o(), strArr[i3]);
                        OooO0OO oooO0OO2 = (OooO0OO) workDatabase.OooOOo0();
                        oooO0OO2.f30120OooO00o.OooO0O0();
                        oooO0OO2.f30120OooO00o.OooO0OO();
                        try {
                            oooO0OO2.f30121OooO0O0.OooO0oO(oooO00o2);
                            oooO0OO2.f30120OooO00o.OooOOOO();
                            oooO0OO2.f30120OooO00o.OooOO0O();
                            i3++;
                            length2 = i4;
                        } catch (Throwable th2) {
                            oooO0OO2.f30120OooO00o.OooOO0O();
                            throw th2;
                        }
                    }
                }
                Iterator<String> it7 = o0ooo0o2.f29817OooO0OO.iterator();
                while (it7.hasNext()) {
                    String next = it7.next();
                    oo000o oo000oVarOooOo0o = workDatabase.OooOo0o();
                    Iterator<String> it8 = it7;
                    o00Ooo o00ooo2 = new o00Ooo(next, o0ooo0o2.OooO00o());
                    o00O0000.o00oO0o o00oo0o3 = (o00O0000.o00oO0o) oo000oVarOooOo0o;
                    o00oo0o3.f30149OooO00o.OooO0O0();
                    o00oo0o3.f30149OooO00o.OooO0OO();
                    try {
                        o00oo0o3.f30150OooO0O0.OooO0oO(o00ooo2);
                        o00oo0o3.f30149OooO00o.OooOOOO();
                        o00oo0o3.f30149OooO00o.OooOO0O();
                        it7 = it8;
                    } catch (Throwable th3) {
                        o00oo0o3.f30149OooO00o.OooOO0O();
                        throw th3;
                    }
                }
                if (z10) {
                    o00O0000.OooOo00 OooOo01 = workDatabase.OooOo00();
                    OooOOOO oooOOOO = new OooOOOO(str, o0ooo0o2.OooO00o());
                    OooOo oooOo = (OooOo) OooOo01;
                    oooOo.f30133OooO00o.OooO0O0();
                    oooOo.f30133OooO00o.OooO0OO();
                    try {
                        oooOo.f30134OooO0O0.OooO0oO(oooOOOO);
                        oooOo.f30133OooO00o.OooOOOO();
                        oooOo.f30133OooO00o.OooOO0O();
                    } catch (Throwable th4) {
                        oooOo.f30133OooO00o.OooOO0O();
                        throw th4;
                    }
                }
            } catch (Throwable th5) {
                o00oo2.f30139OooO00o.OooOO0O();
                throw th5;
            }
        }
        z6 = true;
        o000oooo3 = o000oooo2;
        z7 = z5;
        o000oooo3.f29967OooO0oo = z6;
        return z4 | z7;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static void OooO0O0(o00O0000.o0OoOo0 o0oooo1) {
        OooOO0O oooOO0O = o0oooo1.f30160OooOO0;
        String str = o0oooo1.f30154OooO0OO;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (oooOO0O.f29792OooO0Oo || oooOO0O.f29794OooO0o0) {
            androidx.work.OooO0O0.OooO00o oooO00o = new androidx.work.OooO0O0.OooO00o();
            oooO00o.OooO0O0(o0oooo1.f30157OooO0o0.f9743OooO00o);
            oooO00o.f9744OooO00o.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            o0oooo1.f30154OooO0OO = ConstraintTrackingWorker.class.getName();
            o0oooo1.f30157OooO0o0 = oooO00o.OooO00o();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            o000oOoO o000oooo2 = this.f36980Oooo0o;
            Objects.requireNonNull(o000oooo2);
            if (o000oOoO.OooO00o(o000oooo2, new HashSet())) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f36980Oooo0o));
            }
            WorkDatabase workDatabase = this.f36980Oooo0o.f29960OooO00o.f29976OooO0OO;
            workDatabase.OooO0OO();
            try {
                boolean zOooO00o = OooO00o(this.f36980Oooo0o);
                workDatabase.OooOOOO();
                workDatabase.OooOO0O();
                if (zOooO00o) {
                    o00O00.OooO00o(this.f36980Oooo0o.f29960OooO00o.f29974OooO00o, RescheduleReceiver.class, true);
                    o00oO0o o00oo0o2 = this.f36980Oooo0o.f29960OooO00o;
                    Oooo0.OooO00o(o00oo0o2.f29975OooO0O0, o00oo0o2.f29976OooO0OO, o00oo0o2.f29979OooO0o0);
                }
                this.f36981Oooo0oO.OooO00o(p102o000oo.o00Oo0.f29811OooO00o);
            } catch (Throwable th) {
                workDatabase.OooOO0O();
                throw th;
            }
        } catch (Throwable th2) {
            this.f36981Oooo0oO.OooO00o(new o000oo.o00Oo0.OooO0O0.OooO00o(th2));
        }
    }
}
