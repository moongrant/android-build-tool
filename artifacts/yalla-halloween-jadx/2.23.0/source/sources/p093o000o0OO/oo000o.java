package p093o000o0OO;

import android.database.Cursor;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.work.ExistingWorkPolicy;
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
import java.util.TreeMap;
import java.util.UUID;
import o000O.OooO0O0;
import p084o000Ooo0.OooO;
import p084o000Ooo0.o000oOoO;
import p084o000Ooo0.o00O0O;
import p084o000Ooo0.o0ooOOo;
import p085o000OooO.OooOo00;
import p085o000OooO.Oooo0;
import p085o000OooO.o0OOO0o;
import p091o000o0O.OooOOO;
import p091o000o0O.OooOOOO;
import p091o000o0O.o000000;
import p091o000o0O.o000OOo;
import p091o000o0O.o00Oo0;
import p091o000o0O.o00Ooo;
import p091o000o0O.o0O0O00;
import p091o000o0O.o0OO00O;
import p091o000o0O.o0Oo0oo;
import p091o000o0O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oo000o implements Runnable {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f35350OooO0o = o000oOoO.OooO0o0("EnqueueRunnable");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p085o000OooO.o000oOoO f35351OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOo00 f35352OooO0o0 = new OooOo00();

    public oo000o(@NonNull p085o000OooO.o000oOoO o000oooo2) {
        this.f35351OooO0Oo = o000oooo2;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0202  */
    /* JADX WARN: Code duplicated, block: B:133:0x024c  */
    /* JADX WARN: Code duplicated, block: B:140:0x028a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0292  */
    /* JADX WARN: Code duplicated, block: B:144:0x0294  */
    /* JADX WARN: Code duplicated, block: B:149:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:151:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:160:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:167:0x032f  */
    /* JADX WARN: Code duplicated, block: B:206:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x018f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0195  */
    /* JADX WARN: Code duplicated, block: B:86:0x0197  */
    /* JADX WARN: Code duplicated, block: B:89:0x019d  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6  */
    public static boolean OooO00o(@NonNull p085o000OooO.o000oOoO o000oooo2) throws Throwable {
        boolean zOooO00o;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        RoomDatabase roomDatabase;
        UUID uuid;
        RoomDatabase roomDatabase2;
        RoomDatabase roomDatabase3;
        int length;
        int i;
        RoomDatabase roomDatabase4;
        String str;
        boolean z13;
        List listEmptyList;
        boolean z14;
        boolean z15;
        WorkInfo$State workInfo$State;
        boolean z16;
        boolean z17;
        List<p085o000OooO.o000oOoO> list = o000oooo2.f35147OooO0oO;
        String str2 = f35350OooO0o;
        if (list != null) {
            zOooO00o = false;
            for (p085o000OooO.o000oOoO o000oooo3 : list) {
                if (o000oooo3.f35148OooO0oo) {
                    o000oOoO.OooO0OO().OooO0o(str2, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", o000oooo3.f35146OooO0o0)), new Throwable[0]);
                } else {
                    zOooO00o |= OooO00o(o000oooo3);
                }
            }
        } else {
            zOooO00o = false;
        }
        String[] strArr = (String[]) p085o000OooO.o000oOoO.OooO0O0(o000oooo2).toArray(new String[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        o0OOO0o o0ooo0o2 = o000oooo2.f35141OooO00o;
        WorkDatabase workDatabase = o0ooo0o2.f35160OooO0OO;
        boolean z18 = strArr != null && strArr.length > 0;
        if (z18) {
            int length2 = strArr.length;
            z = true;
            int i2 = 0;
            z2 = false;
            z3 = false;
            while (true) {
                if (i2 < length2) {
                    String str3 = strArr[i2];
                    o0Oo0oo o0oo0ooOooO0oo = ((oo0o0Oo) workDatabase.OooOo00()).OooO0oo(str3);
                    if (o0oo0ooOooO0oo == null) {
                        o000oOoO.OooO0OO().OooO0O0(str2, String.format("Prerequisite %s doesn't exist; not enqueuing", str3), new Throwable[0]);
                    } else {
                        WorkInfo$State workInfo$State2 = o0oo0ooOooO0oo.f35263OooO0O0;
                        z &= workInfo$State2 == WorkInfo$State.SUCCEEDED;
                        if (workInfo$State2 == WorkInfo$State.FAILED) {
                            z3 = true;
                        } else if (workInfo$State2 == WorkInfo$State.CANCELLED) {
                            z2 = true;
                        }
                        i2++;
                    }
                }
                z5 = zOooO00o;
                z10 = true;
                z9 = false;
                o000oooo2.f35148OooO0oo = z10;
                return z5 | z9;
            }
        }
        z = true;
        z2 = false;
        z3 = false;
        String str4 = o000oooo2.f35142OooO0O0;
        boolean z19 = !TextUtils.isEmpty(str4);
        if (z19 && !z18) {
            ArrayList arrayListOooO = ((oo0o0Oo) workDatabase.OooOo00()).OooO(str4);
            if (arrayListOooO.isEmpty()) {
                z4 = z19;
                z5 = zOooO00o;
                z6 = false;
                z7 = z18;
            } else {
                ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.APPEND;
                ExistingWorkPolicy existingWorkPolicy2 = o000oooo2.f35143OooO0OO;
                if (existingWorkPolicy2 == existingWorkPolicy || existingWorkPolicy2 == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                    OooOOOO OooOOOO2 = workDatabase.OooOOOO();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = arrayListOooO.iterator();
                    while (it.hasNext()) {
                        o0Oo0oo.OooO00o oooO00o = (o0Oo0oo.OooO00o) it.next();
                        Iterator it2 = it;
                        String str5 = oooO00o.f35279OooO00o;
                        boolean z20 = zOooO00o;
                        p091o000o0O.OooOo00 oooOo00 = (p091o000o0O.OooOo00) OooOOOO2;
                        oooOo00.getClass();
                        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
                        OooOOOO oooOOOO = OooOOOO2;
                        boolean z21 = z19;
                        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                        if (str5 == null) {
                            roomSQLiteQueryOooO00o.bindNull(1);
                        } else {
                            roomSQLiteQueryOooO00o.bindString(1, str5);
                        }
                        RoomDatabase roomDatabase5 = oooOo00.f35239OooO00o;
                        roomDatabase5.OooO0O0();
                        Cursor cursorOooO0O0 = OooO0O0.OooO0O0(roomDatabase5, roomSQLiteQueryOooO00o);
                        try {
                            if (cursorOooO0O0.moveToFirst()) {
                                z14 = false;
                                if (cursorOooO0O0.getInt(0) != 0) {
                                    z15 = true;
                                }
                                cursorOooO0O0.close();
                                roomSQLiteQueryOooO00o.release();
                                if (z15) {
                                    workInfo$State = oooO00o.f35280OooO0O0;
                                    if (workInfo$State == WorkInfo$State.SUCCEEDED) {
                                        z16 = true;
                                    } else {
                                        z16 = z14;
                                    }
                                    boolean z22 = z16 & z;
                                    if (workInfo$State == WorkInfo$State.FAILED) {
                                        z17 = z2;
                                        z3 = true;
                                    } else if (workInfo$State == WorkInfo$State.CANCELLED) {
                                        z17 = true;
                                    } else {
                                        z17 = z2;
                                    }
                                    arrayList.add(oooO00o.f35279OooO00o);
                                    z2 = z17;
                                    z = z22;
                                }
                                it = it2;
                                zOooO00o = z20;
                                OooOOOO2 = oooOOOO;
                                z19 = z21;
                            } else {
                                z14 = false;
                            }
                            z15 = z14;
                            cursorOooO0O0.close();
                            roomSQLiteQueryOooO00o.release();
                            if (z15) {
                                workInfo$State = oooO00o.f35280OooO0O0;
                                if (workInfo$State == WorkInfo$State.SUCCEEDED) {
                                    z16 = true;
                                } else {
                                    z16 = z14;
                                }
                                boolean z23 = z16 & z;
                                if (workInfo$State == WorkInfo$State.FAILED) {
                                    z17 = z2;
                                    z3 = true;
                                } else if (workInfo$State == WorkInfo$State.CANCELLED) {
                                    z17 = true;
                                } else {
                                    z17 = z2;
                                }
                                arrayList.add(oooO00o.f35279OooO00o);
                                z2 = z17;
                                z = z23;
                            }
                            it = it2;
                            zOooO00o = z20;
                            OooOOOO2 = oooOOOO;
                            z19 = z21;
                        } catch (Throwable th) {
                            cursorOooO0O0.close();
                            roomSQLiteQueryOooO00o.release();
                            throw th;
                        }
                    }
                    z4 = z19;
                    z5 = zOooO00o;
                    z6 = false;
                    if (existingWorkPolicy2 == ExistingWorkPolicy.APPEND_OR_REPLACE && (z2 || z3)) {
                        oo0o0Oo oo0o0oo = (oo0o0Oo) workDatabase.OooOo00();
                        Iterator it3 = oo0o0oo.OooO(str4).iterator();
                        while (it3.hasNext()) {
                            oo0o0oo.OooO00o(((o0Oo0oo.OooO00o) it3.next()).f35279OooO00o);
                        }
                        z13 = false;
                        z3 = false;
                        listEmptyList = Collections.emptyList();
                    } else {
                        z13 = z2;
                        listEmptyList = arrayList;
                    }
                    strArr = (String[]) listEmptyList.toArray(strArr);
                    z2 = z13;
                    z7 = strArr.length > 0;
                } else {
                    if (existingWorkPolicy2 == ExistingWorkPolicy.KEEP) {
                        Iterator it4 = arrayListOooO.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                WorkInfo$State workInfo$State3 = ((o0Oo0oo.OooO00o) it4.next()).f35280OooO0O0;
                                boolean z24 = z18;
                                if (workInfo$State3 == WorkInfo$State.ENQUEUED || workInfo$State3 == WorkInfo$State.RUNNING) {
                                    z5 = zOooO00o;
                                    z10 = true;
                                    z9 = false;
                                    o000oooo2.f35148OooO0oo = z10;
                                    return z5 | z9;
                                }
                                z18 = z24;
                            }
                        }
                    }
                    boolean z25 = z18;
                    new o00Oo0(o0ooo0o2, str4).run();
                    o0OO00O o0oo00oOooOo00 = workDatabase.OooOo00();
                    Iterator it5 = arrayListOooO.iterator();
                    while (it5.hasNext()) {
                        ((oo0o0Oo) o0oo00oOooOo00).OooO00o(((o0Oo0oo.OooO00o) it5.next()).f35279OooO00o);
                    }
                    z4 = z19;
                    z5 = zOooO00o;
                    z7 = z25;
                    z8 = true;
                }
            }
            z8 = z6;
        } else {
            z4 = z19;
            z5 = zOooO00o;
            z6 = false;
            z7 = z18;
            z8 = z6;
        }
        Iterator<? extends o0ooOOo> it6 = o000oooo2.f35144OooO0Oo.iterator();
        while (it6.hasNext()) {
            o0ooOOo next = it6.next();
            o0Oo0oo o0oo0oo2 = next.f35116OooO0O0;
            try {
                if (!z7 || z) {
                    if (o0oo0oo2.OooO0OO()) {
                        o0oo0oo2.f35273OooOOO = 0L;
                    } else {
                        o0oo0oo2.f35273OooOOO = jCurrentTimeMillis;
                    }
                    if (Build.VERSION.SDK_INT <= 25) {
                        OooO oooO = o0oo0oo2.f35270OooOO0;
                        str = o0oo0oo2.f35264OooO0OO;
                        z11 = z8;
                        if (!str.equals(ConstraintTrackingWorker.class.getName()) && (oooO.f35086OooO0Oo || oooO.f35088OooO0o0)) {
                            androidx.work.OooO0O0.OooO00o oooO00o2 = new androidx.work.OooO0O0.OooO00o();
                            oooO00o2.OooO00o(o0oo0oo2.f35267OooO0o0.f8388OooO00o);
                            HashMap map = oooO00o2.f8389OooO00o;
                            map.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                            o0oo0oo2.f35264OooO0OO = ConstraintTrackingWorker.class.getName();
                            androidx.work.OooO0O0 oooO0O0 = new androidx.work.OooO0O0(map);
                            androidx.work.OooO0O0.OooO0O0(oooO0O0);
                            o0oo0oo2.f35267OooO0o0 = oooO0O0;
                        }
                    } else {
                        z11 = z8;
                    }
                    if (o0oo0oo2.f35263OooO0O0 == WorkInfo$State.ENQUEUED) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    oo0o0Oo oo0o0oo2 = (oo0o0Oo) workDatabase.OooOo00();
                    roomDatabase = oo0o0oo2.f35284OooO00o;
                    roomDatabase.OooO0O0();
                    roomDatabase.OooO0OO();
                    oo0o0oo2.f35285OooO0O0.OooO0o(o0oo0oo2);
                    roomDatabase.OooOOO0();
                    roomDatabase.OooOO0();
                    uuid = next.f35115OooO00o;
                    if (z7) {
                        length = strArr.length;
                        i = 0;
                        while (i < length) {
                            boolean z26 = z12;
                            String[] strArr2 = strArr;
                            int i3 = length;
                            OooOOO oooOOO = new OooOOO(uuid.toString(), strArr[i]);
                            p091o000o0O.OooOo00 oooOo01 = (p091o000o0O.OooOo00) workDatabase.OooOOOO();
                            roomDatabase4 = oooOo01.f35239OooO00o;
                            roomDatabase4.OooO0O0();
                            roomDatabase4.OooO0OO();
                            try {
                                oooOo01.f35240OooO0O0.OooO0o(oooOOO);
                                roomDatabase4.OooOOO0();
                                roomDatabase4.OooOO0();
                                i++;
                                z12 = z26;
                                length = i3;
                                strArr = strArr2;
                            } catch (Throwable th2) {
                                roomDatabase4.OooOO0();
                                throw th2;
                            }
                        }
                    }
                    String[] strArr3 = strArr;
                    boolean z27 = z12;
                    for (String str6 : next.f35117OooO0OO) {
                        o000OOo o000oooOooOo0 = workDatabase.OooOo0();
                        o0O0O00 o0o0o00 = new o0O0O00(str6, uuid.toString());
                        o000000 o000000Var = (o000000) o000oooOooOo0;
                        roomDatabase3 = o000000Var.f35243OooO00o;
                        roomDatabase3.OooO0O0();
                        roomDatabase3.OooO0OO();
                        try {
                            o000000Var.f35244OooO0O0.OooO0o(o0o0o00);
                            roomDatabase3.OooOOO0();
                            roomDatabase3.OooOO0();
                        } catch (Throwable th3) {
                            roomDatabase3.OooOO0();
                            throw th3;
                        }
                    }
                    if (z4) {
                        o00Ooo o00oooOooOOo = workDatabase.OooOOo();
                        o00Oo0 o00oo1 = new o00Oo0(str4, uuid.toString());
                        p091o000o0O.oo000o oo000oVar = (p091o000o0O.oo000o) o00oooOooOOo;
                        roomDatabase2 = oo000oVar.f35281OooO00o;
                        roomDatabase2.OooO0O0();
                        roomDatabase2.OooO0OO();
                        try {
                            oo000oVar.f35282OooO0O0.OooO0o(o00oo1);
                            roomDatabase2.OooOOO0();
                            roomDatabase2.OooOO0();
                        } catch (Throwable th4) {
                            roomDatabase2.OooOO0();
                            throw th4;
                        }
                    }
                    it6 = it6;
                    z8 = z27;
                    strArr = strArr3;
                } else if (z3) {
                    o0oo0oo2.f35263OooO0O0 = WorkInfo$State.FAILED;
                } else if (z2) {
                    o0oo0oo2.f35263OooO0O0 = WorkInfo$State.CANCELLED;
                } else {
                    o0oo0oo2.f35263OooO0O0 = WorkInfo$State.BLOCKED;
                }
                oo0o0oo2.f35285OooO0O0.OooO0o(o0oo0oo2);
                roomDatabase.OooOOO0();
                roomDatabase.OooOO0();
                uuid = next.f35115OooO00o;
                if (z7) {
                    length = strArr.length;
                    i = 0;
                    while (i < length) {
                        boolean z28 = z12;
                        String[] strArr4 = strArr;
                        int i4 = length;
                        OooOOO oooOOO2 = new OooOOO(uuid.toString(), strArr[i]);
                        p091o000o0O.OooOo00 oooOo02 = (p091o000o0O.OooOo00) workDatabase.OooOOOO();
                        roomDatabase4 = oooOo02.f35239OooO00o;
                        roomDatabase4.OooO0O0();
                        roomDatabase4.OooO0OO();
                        oooOo02.f35240OooO0O0.OooO0o(oooOOO2);
                        roomDatabase4.OooOOO0();
                        roomDatabase4.OooOO0();
                        i++;
                        z12 = z28;
                        length = i4;
                        strArr = strArr4;
                    }
                }
                String[] strArr5 = strArr;
                boolean z29 = z12;
                while (r1.hasNext()) {
                    o000OOo o000oooOooOo1 = workDatabase.OooOo0();
                    o0O0O00 o0o0o01 = new o0O0O00(str6, uuid.toString());
                    o000000 o000000Var2 = (o000000) o000oooOooOo1;
                    roomDatabase3 = o000000Var2.f35243OooO00o;
                    roomDatabase3.OooO0O0();
                    roomDatabase3.OooO0OO();
                    o000000Var2.f35244OooO0O0.OooO0o(o0o0o01);
                    roomDatabase3.OooOOO0();
                    roomDatabase3.OooOO0();
                }
                if (z4) {
                    o00Ooo o00oooOooOOo2 = workDatabase.OooOOo();
                    o00Oo0 o00oo2 = new o00Oo0(str4, uuid.toString());
                    p091o000o0O.oo000o oo000oVar2 = (p091o000o0O.oo000o) o00oooOooOOo2;
                    roomDatabase2 = oo000oVar2.f35281OooO00o;
                    roomDatabase2.OooO0O0();
                    roomDatabase2.OooO0OO();
                    oo000oVar2.f35282OooO0O0.OooO0o(o00oo2);
                    roomDatabase2.OooOOO0();
                    roomDatabase2.OooOO0();
                }
                it6 = it6;
                z8 = z29;
                strArr = strArr5;
            } catch (Throwable th5) {
                roomDatabase.OooOO0();
                throw th5;
            }
            if (Build.VERSION.SDK_INT <= 25) {
                OooO oooO2 = o0oo0oo2.f35270OooOO0;
                str = o0oo0oo2.f35264OooO0OO;
                z11 = z8;
                if (!str.equals(ConstraintTrackingWorker.class.getName())) {
                    androidx.work.OooO0O0.OooO00o oooO00o3 = new androidx.work.OooO0O0.OooO00o();
                    oooO00o3.OooO00o(o0oo0oo2.f35267OooO0o0.f8388OooO00o);
                    HashMap map2 = oooO00o3.f8389OooO00o;
                    map2.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
                    o0oo0oo2.f35264OooO0OO = ConstraintTrackingWorker.class.getName();
                    androidx.work.OooO0O0 oooO0O1 = new androidx.work.OooO0O0(map2);
                    androidx.work.OooO0O0.OooO0O0(oooO0O1);
                    o0oo0oo2.f35267OooO0o0 = oooO0O1;
                }
            } else {
                z11 = z8;
            }
            if (o0oo0oo2.f35263OooO0O0 == WorkInfo$State.ENQUEUED) {
                z12 = true;
            } else {
                z12 = z11;
            }
            oo0o0Oo oo0o0oo3 = (oo0o0Oo) workDatabase.OooOo00();
            roomDatabase = oo0o0oo3.f35284OooO00o;
            roomDatabase.OooO0O0();
            roomDatabase.OooO0OO();
        }
        z9 = z8;
        z10 = true;
        o000oooo2.f35148OooO0oo = z10;
        return z5 | z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooOo00 oooOo00 = this.f35352OooO0o0;
        p085o000OooO.o000oOoO o000oooo2 = this.f35351OooO0Oo;
        try {
            o000oooo2.getClass();
            o0OOO0o o0ooo0o2 = o000oooo2.f35141OooO00o;
            if (p085o000OooO.o000oOoO.OooO00o(o000oooo2, new HashSet())) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", o000oooo2));
            }
            WorkDatabase workDatabase = o0ooo0o2.f35160OooO0OO;
            workDatabase.OooO0OO();
            try {
                boolean zOooO00o = OooO00o(o000oooo2);
                workDatabase.OooOOO0();
                workDatabase.OooOO0();
                if (zOooO00o) {
                    o0ooOOo.OooO00o(o0ooo0o2.f35158OooO00o, RescheduleReceiver.class, true);
                    Oooo0.OooO00o(o0ooo0o2.f35159OooO0O0, o0ooo0o2.f35160OooO0OO, o0ooo0o2.f35163OooO0o0);
                }
                oooOo00.OooO00o(o00O0O.f35111OooO00o);
            } catch (Throwable th) {
                workDatabase.OooOO0();
                throw th;
            }
        } catch (Throwable th2) {
            oooOo00.OooO00o(new o00O0O.OooO00o.C0411OooO00o(th2));
        }
    }
}
