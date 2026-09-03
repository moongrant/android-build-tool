package p100o000oOoO;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0oO0O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<Integer> f29667OooO00o;

    public o0oO0O0o() {
        ArrayList list = new ArrayList();
        Intrinsics.checkNotNullParameter(list, "list");
        this.f29667OooO00o = list;
    }

    public final void OooO00o(int i) {
        if (!this.f29667OooO00o.isEmpty()) {
            if (this.f29667OooO00o.get(0).intValue() == i) {
                return;
            }
            List<Integer> list = this.f29667OooO00o;
            if (list.get(list.size() - 1).intValue() == i) {
                return;
            }
        }
        int size = this.f29667OooO00o.size();
        this.f29667OooO00o.add(Integer.valueOf(i));
        while (size > 0) {
            int i2 = ((size + 1) >>> 1) - 1;
            int iIntValue = this.f29667OooO00o.get(i2).intValue();
            if (i <= iIntValue) {
                break;
            }
            this.f29667OooO00o.set(size, Integer.valueOf(iIntValue));
            size = i2;
        }
        this.f29667OooO00o.set(size, Integer.valueOf(i));
    }

    public final int OooO0O0() {
        int iIntValue;
        if (!(this.f29667OooO00o.size() > 0)) {
            oo0o0O0.OooO0Oo("Set is empty".toString());
            throw null;
        }
        int iIntValue2 = this.f29667OooO00o.get(0).intValue();
        while ((!this.f29667OooO00o.isEmpty()) && this.f29667OooO00o.get(0).intValue() == iIntValue2) {
            List<Integer> list = this.f29667OooO00o;
            list.set(0, (Integer) CollectionsKt.last((List) list));
            List<Integer> list2 = this.f29667OooO00o;
            list2.remove(list2.size() - 1);
            int size = this.f29667OooO00o.size();
            int size2 = this.f29667OooO00o.size() >>> 1;
            int i = 0;
            while (i < size2) {
                int iIntValue3 = this.f29667OooO00o.get(i).intValue();
                int i2 = (i + 1) * 2;
                int i3 = i2 - 1;
                int iIntValue4 = this.f29667OooO00o.get(i3).intValue();
                if (i2 < size && (iIntValue = this.f29667OooO00o.get(i2).intValue()) > iIntValue4) {
                    if (iIntValue <= iIntValue3) {
                        break;
                    }
                    this.f29667OooO00o.set(i, Integer.valueOf(iIntValue));
                    this.f29667OooO00o.set(i2, Integer.valueOf(iIntValue3));
                    i = i2;
                } else {
                    if (iIntValue4 <= iIntValue3) {
                        break;
                    }
                    this.f29667OooO00o.set(i, Integer.valueOf(iIntValue4));
                    this.f29667OooO00o.set(i3, Integer.valueOf(iIntValue3));
                    i = i3;
                }
            }
        }
        return iIntValue2;
    }
}
