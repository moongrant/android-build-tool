package p227o00oOo0O;

import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o00O00o0;
import com.google.common.collect.o00O0O0O;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import p228o00oOo0o.o00Oo0;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final HashMap f39903OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f39904OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f39905OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Random f39906OooO0Oo;

    public OooOo00() {
        Random random = new Random();
        this.f39905OooO0OO = new HashMap();
        this.f39906OooO0Oo = random;
        this.f39903OooO00o = new HashMap();
        this.f39904OooO0O0 = new HashMap();
    }

    public static void OooO00o(Object obj, long j, HashMap map) {
        if (map.containsKey(obj)) {
            Long l = (Long) map.get(obj);
            int i = o0O00.f40595OooO00o;
            j = Math.max(j, l.longValue());
        }
        map.put(obj, Long.valueOf(j));
    }

    public static void OooO0OO(long j, HashMap map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList OooO0O0(ImmutableList immutableList) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f39903OooO00o;
        OooO0OO(jElapsedRealtime, map);
        HashMap map2 = this.f39904OooO0O0;
        OooO0OO(jElapsedRealtime, map2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < immutableList.size(); i++) {
            o00Oo0 o00oo1 = (o00Oo0) immutableList.get(i);
            if (!map.containsKey(o00oo1.f39936OooO0O0) && !map2.containsKey(Integer.valueOf(o00oo1.f39937OooO0OO))) {
                arrayList.add(o00oo1);
            }
        }
        return arrayList;
    }

    @Nullable
    public final o00Oo0 OooO0Oo(ImmutableList immutableList) {
        ArrayList arrayListOooO0O0 = OooO0O0(immutableList);
        if (arrayListOooO0O0.size() < 2) {
            return (o00Oo0) o00O0O0O.OooO0Oo(null, arrayListOooO0O0.iterator());
        }
        Collections.sort(arrayListOooO0O0, new OooOOOO());
        ArrayList arrayList = new ArrayList();
        int i = ((o00Oo0) arrayListOooO0O0.get(0)).f39937OooO0OO;
        for (int i2 = 0; i2 < arrayListOooO0O0.size(); i2++) {
            o00Oo0 o00oo1 = (o00Oo0) arrayListOooO0O0.get(i2);
            if (i != o00oo1.f39937OooO0OO) {
                if (arrayList.size() != 1) {
                    break;
                }
                return (o00Oo0) arrayListOooO0O0.get(0);
            }
            arrayList.add(new Pair(o00oo1.f39936OooO0O0, Integer.valueOf(o00oo1.f39938OooO0Oo)));
        }
        HashMap map = this.f39905OooO0OO;
        o00Oo0 o00oo2 = (o00Oo0) map.get(arrayList);
        if (o00oo2 == null) {
            List listSubList = arrayListOooO0O0.subList(0, arrayList.size());
            int i3 = 0;
            for (int i4 = 0; i4 < listSubList.size(); i4++) {
                i3 += ((o00Oo0) listSubList.get(i4)).f39938OooO0Oo;
            }
            int iNextInt = this.f39906OooO0Oo.nextInt(i3);
            int i5 = 0;
            for (int i6 = 0; i6 < listSubList.size(); i6++) {
                o00Oo0 o00oo3 = (o00Oo0) listSubList.get(i6);
                i5 += o00oo3.f39938OooO0Oo;
                if (iNextInt < i5) {
                    o00oo2 = o00oo3;
                    map.put(arrayList, o00oo2);
                }
            }
            o00oo2 = (o00Oo0) o00O00o0.OooO00o(listSubList);
            map.put(arrayList, o00oo2);
        }
        return o00oo2;
    }
}
