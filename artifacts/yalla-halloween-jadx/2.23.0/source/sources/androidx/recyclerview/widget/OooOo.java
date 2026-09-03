package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO00o f7559OooO00o = new OooO00o();

    public static abstract class OooO<T> {
        public abstract boolean OooO00o(@NonNull T t, @NonNull T t2);

        public abstract boolean OooO0O0(@NonNull T t, @NonNull T t2);
    }

    public class OooO00o implements Comparator<OooO0OO> {
        @Override // java.util.Comparator
        public final int compare(OooO0OO oooO0OO, OooO0OO oooO0OO2) {
            return oooO0OO.f7560OooO00o - oooO0OO2.f7560OooO00o;
        }
    }

    public static abstract class OooO0O0 {
        public abstract boolean OooO00o(int i, int i2);

        public abstract boolean OooO0O0(int i, int i2);

        @Nullable
        public abstract Object OooO0OO(int i, int i2);
    }

    public static class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f7560OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f7561OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f7562OooO0OO;

        public OooO0OO(int i, int i2, int i3) {
            this.f7560OooO00o = i;
            this.f7561OooO0O0 = i2;
            this.f7562OooO0OO = i3;
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<OooO0OO> f7563OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f7564OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int[] f7565OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0O0 f7566OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f7567OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f7568OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f7569OooO0oO;

        public OooO0o(o000O00O.o00000OO o00000oo2, ArrayList arrayList, int[] iArr, int[] iArr2) {
            OooO0O0 oooO0O0;
            int[] iArr3;
            int[] iArr4;
            int i;
            int i2;
            this.f7563OooO00o = arrayList;
            this.f7564OooO0O0 = iArr;
            this.f7565OooO0OO = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f7566OooO0Oo = o00000oo2;
            int i3 = o00000oo2.f34499OooO0Oo;
            this.f7568OooO0o0 = i3;
            int i4 = o00000oo2.f34500OooO0o0;
            this.f7567OooO0o = i4;
            this.f7569OooO0oO = true;
            OooO0OO oooO0OO = arrayList.isEmpty() ? null : (OooO0OO) arrayList.get(0);
            if (oooO0OO == null || oooO0OO.f7560OooO00o != 0 || oooO0OO.f7561OooO0O0 != 0) {
                arrayList.add(0, new OooO0OO(0, 0, 0));
            }
            arrayList.add(new OooO0OO(i3, i4, 0));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                oooO0O0 = this.f7566OooO0Oo;
                iArr3 = this.f7565OooO0OO;
                iArr4 = this.f7564OooO0O0;
                if (!zHasNext) {
                    break;
                }
                OooO0OO oooO0OO2 = (OooO0OO) it.next();
                for (int i5 = 0; i5 < oooO0OO2.f7562OooO0OO; i5++) {
                    int i6 = oooO0OO2.f7560OooO00o + i5;
                    int i7 = oooO0OO2.f7561OooO0O0 + i5;
                    int i8 = oooO0O0.OooO00o(i6, i7) ? 1 : 2;
                    iArr4[i6] = (i7 << 4) | i8;
                    iArr3[i7] = (i6 << 4) | i8;
                }
            }
            if (this.f7569OooO0oO) {
                Iterator it2 = arrayList.iterator();
                int i9 = 0;
                while (it2.hasNext()) {
                    OooO0OO oooO0OO3 = (OooO0OO) it2.next();
                    while (true) {
                        i = oooO0OO3.f7560OooO00o;
                        if (i9 < i) {
                            if (iArr4[i9] == 0) {
                                int size = arrayList.size();
                                int i10 = 0;
                                for (int i11 = 0; i11 < size; i11++) {
                                    OooO0OO oooO0OO4 = (OooO0OO) arrayList.get(i11);
                                    while (true) {
                                        i2 = oooO0OO4.f7561OooO0O0;
                                        if (i10 < i2) {
                                            if (iArr3[i10] == 0 && oooO0O0.OooO0O0(i9, i10)) {
                                                int i12 = oooO0O0.OooO00o(i9, i10) ? 8 : 4;
                                                iArr4[i9] = (i10 << 4) | i12;
                                                iArr3[i10] = i12 | (i9 << 4);
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                    i10 = oooO0OO4.f7562OooO0OO + i2;
                                }
                            }
                            i9++;
                        }
                    }
                    i9 = oooO0OO3.f7562OooO0OO + i;
                }
            }
        }

        @Nullable
        public static OooOO0 OooO0O0(ArrayDeque arrayDeque, int i, boolean z) {
            OooOO0 oooOO1;
            Iterator it = arrayDeque.iterator();
            while (true) {
                if (!it.hasNext()) {
                    oooOO1 = null;
                    break;
                }
                oooOO1 = (OooOO0) it.next();
                if (oooOO1.f7570OooO00o == i && oooOO1.f7572OooO0OO == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                OooOO0 oooOO2 = (OooOO0) it.next();
                if (z) {
                    oooOO2.f7571OooO0O0--;
                } else {
                    oooOO2.f7571OooO0O0++;
                }
            }
            return oooOO1;
        }

        public final int OooO00o(@IntRange(from = ULong.MIN_VALUE) int i) {
            int i2 = this.f7568OooO0o0;
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException(p022Oooo00O.OooOO0.OooO00o("Index out of bounds - passed position = ", i, ", old list size = ", i2));
            }
            int i3 = this.f7564OooO0O0[i];
            if ((i3 & 15) == 0) {
                return -1;
            }
            return i3 >> 4;
        }
    }

    public static class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f7570OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7571OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f7572OooO0OO;

        public OooOO0(int i, int i2, boolean z) {
            this.f7570OooO00o = i;
            this.f7571OooO0O0 = i2;
            this.f7572OooO0OO = z;
        }
    }

    public static class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f7573OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7574OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7575OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7576OooO0Oo;

        public OooOO0O() {
        }

        public OooOO0O(int i, int i2) {
            this.f7573OooO00o = 0;
            this.f7574OooO0O0 = i;
            this.f7575OooO0OO = 0;
            this.f7576OooO0Oo = i2;
        }
    }

    public static class OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f7577OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f7578OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f7579OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f7580OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f7581OooO0o0;

        public final int OooO00o() {
            return Math.min(this.f7579OooO0OO - this.f7577OooO00o, this.f7580OooO0Oo - this.f7578OooO0O0);
        }
    }
}
