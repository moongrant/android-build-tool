package p240o00oo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p252o00ooO0.o000000O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOO0O f34115OooO00o = new OooOO0O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ArrayList<o000000O> f34116OooO0O0 = new ArrayList<>();

    public final ArrayList<o000000O> OooO00o(List<? extends o000000O> list, Set<Integer> set, List<Integer> list2) {
        ArrayList<o000000O> arrayList = new ArrayList<>(list.size());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator<Integer> it = list2.iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            if (set.contains(Integer.valueOf(iIntValue))) {
                arrayList2.add(list.get(iIntValue));
            } else {
                o000000O o000000o2 = list.get(iIntValue);
                Objects.requireNonNull(o000000o2);
                arrayList3.add(o000000o2);
            }
        }
        ArrayList<o000000O> arrayList5 = f34116OooO0O0;
        arrayList5.addAll(arrayList2);
        arrayList5.addAll(arrayList4);
        arrayList.addAll(arrayList5);
        arrayList.addAll(arrayList3);
        return arrayList;
    }
}
