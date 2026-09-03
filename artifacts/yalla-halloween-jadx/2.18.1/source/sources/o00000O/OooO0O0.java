package o00000O;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f26772OooO00o = new OooO00o("", null, 6);

    public static final List OooO00o(List list, int i, int i2) {
        if (!(i <= i2)) {
            throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            OooO00o.OooO0O0 oooO0O0 = (OooO00o.OooO0O0) obj;
            if (OooO0OO(i, i2, oooO0O0.f26769OooO0O0, oooO0O0.f26770OooO0OO)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            OooO00o.OooO0O0 oooO0O1 = (OooO00o.OooO0O0) arrayList.get(i4);
            arrayList2.add(new OooO00o.OooO0O0(oooO0O1.f26768OooO00o, Math.max(i, oooO0O1.f26769OooO0O0) - i, Math.min(i2, oooO0O1.f26770OooO0OO) - i, oooO0O1.f26771OooO0Oo));
        }
        return arrayList2;
    }

    public static final boolean OooO0O0(int i, int i2, int i3, int i4) {
        if (i <= i3 && i4 <= i2) {
            if (i2 != i4) {
                return true;
            }
            if ((i3 == i4) == (i == i2)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean OooO0OO(int i, int i2, int i3, int i4) {
        return Math.max(i, i3) < Math.min(i2, i4) || OooO0O0(i, i2, i3, i4) || OooO0O0(i3, i4, i, i2);
    }
}
