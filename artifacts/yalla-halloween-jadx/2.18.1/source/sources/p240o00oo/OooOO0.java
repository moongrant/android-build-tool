package p240o00oo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f34113OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final List<Integer>[] f34114OooO0O0;

    public OooOO0(int i) {
        this.f34113OooO00o = i;
        this.f34114OooO0O0 = new List[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.f34114OooO0O0[i2] = new ArrayList();
        }
    }

    @NotNull
    public final Vector<Integer> OooO00o() {
        int i = this.f34113OooO00o;
        int[] iArr = new int[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            List<Integer> list = this.f34114OooO0O0[i2];
            Objects.requireNonNull(list, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Int>");
            for (Integer node : (ArrayList) list) {
                Intrinsics.checkNotNullExpressionValue(node, "node");
                iArr[node.intValue()] = iArr[node.intValue()] + 1;
            }
            i2 = i3;
        }
        LinkedList linkedList = new LinkedList();
        int i4 = this.f34113OooO00o;
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i5 + 1;
            if (iArr[i5] == 0) {
                linkedList.add(Integer.valueOf(i5));
            }
            i5 = i6;
        }
        Vector<Integer> vector = new Vector<>();
        int i7 = 0;
        while (!linkedList.isEmpty()) {
            Integer u = (Integer) linkedList.poll();
            vector.add(u);
            List<Integer>[] listArr = this.f34114OooO0O0;
            Intrinsics.checkNotNullExpressionValue(u, "u");
            List<Integer> list2 = listArr[u.intValue()];
            Intrinsics.checkNotNull(list2);
            Iterator<Integer> it = list2.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                iArr[iIntValue] = iArr[iIntValue] - 1;
                if (iArr[iIntValue] == 0) {
                    linkedList.add(Integer.valueOf(iIntValue));
                }
            }
            i7++;
        }
        if (i7 == this.f34113OooO00o) {
            return vector;
        }
        throw new IllegalStateException("Exists a cycle in the graph".toString());
    }
}
