package p144o00Oo00o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f37678OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<Integer>[] f37679OooO0O0;

    public o00000O(int i) {
        this.f37678OooO00o = i;
        this.f37679OooO0O0 = new List[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f37679OooO0O0[i2] = new ArrayList();
        }
    }

    @NotNull
    public final Vector<Integer> OooO00o() {
        List<Integer>[] listArr;
        int i = this.f37678OooO00o;
        int[] iArr = new int[i];
        int i2 = 0;
        while (true) {
            listArr = this.f37679OooO0O0;
            if (i2 >= i) {
                break;
            }
            List<Integer> list = listArr[i2];
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>");
            for (Integer node : (ArrayList) list) {
                Intrinsics.checkNotNullExpressionValue(node, "node");
                iArr[node.intValue()] = iArr[node.intValue()] + 1;
            }
            i2++;
        }
        LinkedList linkedList = new LinkedList();
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == 0) {
                linkedList.add(Integer.valueOf(i3));
            }
        }
        Vector<Integer> vector = new Vector<>();
        int i4 = 0;
        while (!linkedList.isEmpty()) {
            Integer u = (Integer) linkedList.poll();
            vector.add(u);
            Intrinsics.checkNotNullExpressionValue(u, "u");
            List<Integer> list2 = listArr[u.intValue()];
            Intrinsics.checkNotNull(list2);
            Iterator<Integer> it = list2.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                int i5 = iArr[iIntValue] - 1;
                iArr[iIntValue] = i5;
                if (i5 == 0) {
                    linkedList.add(Integer.valueOf(iIntValue));
                }
            }
            i4++;
        }
        if (i4 == i) {
            return vector;
        }
        throw new IllegalStateException("Exists a cycle in the graph".toString());
    }
}
