package p144o00Oo00o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00000OO f37680OooO00o = new o00000OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ArrayList<o000oOoO> f37681OooO0O0 = new ArrayList<>();

    public static ArrayList OooO00o(ArrayList arrayList, Vector vector, HashSet hashSet) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it = vector.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (hashSet.contains(Integer.valueOf(iIntValue))) {
                arrayList3.add(arrayList.get(iIntValue));
            } else {
                o000oOoO o000oooo2 = (o000oOoO) arrayList.get(iIntValue);
                o000oooo2.getClass();
                arrayList4.add(o000oooo2);
            }
        }
        ArrayList<o000oOoO> arrayList6 = f37681OooO0O0;
        arrayList6.addAll(arrayList3);
        arrayList6.addAll(arrayList5);
        arrayList2.addAll(arrayList6);
        arrayList2.addAll(arrayList4);
        return arrayList2;
    }
}
