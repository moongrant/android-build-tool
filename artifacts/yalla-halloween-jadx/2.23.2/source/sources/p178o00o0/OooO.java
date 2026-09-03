package p178o00o0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;
import org.jetbrains.annotations.NotNull;
import p191o00o0O0.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO f38362OooO00o = new OooO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ArrayList<o00Oo0> f38363OooO0O0 = new ArrayList<>();

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
                o00Oo0 o00oo1 = (o00Oo0) arrayList.get(iIntValue);
                o00oo1.getClass();
                arrayList4.add(o00oo1);
            }
        }
        ArrayList<o00Oo0> arrayList6 = f38363OooO0O0;
        arrayList6.addAll(arrayList3);
        arrayList6.addAll(arrayList5);
        arrayList2.addAll(arrayList6);
        arrayList2.addAll(arrayList4);
        return arrayList2;
    }
}
