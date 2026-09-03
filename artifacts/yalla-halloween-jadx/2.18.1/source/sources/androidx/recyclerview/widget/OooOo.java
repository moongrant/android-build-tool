package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.ULong;
import p089o000o000.o0000oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Comparator<OooO0OO> f8941OooO00o = new OooO00o();

    public static abstract class OooO<T> {
        public abstract boolean OooO00o(@NonNull T t, @NonNull T t2);

        public abstract boolean OooO0O0(@NonNull T t, @NonNull T t2);
    }

    public class OooO00o implements Comparator<OooO0OO> {
        @Override // java.util.Comparator
        public final int compare(OooO0OO oooO0OO, OooO0OO oooO0OO2) {
            return oooO0OO.f8942OooO00o - oooO0OO2.f8942OooO00o;
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
        public final int f8942OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f8943OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f8944OooO0OO;

        public OooO0OO(int i, int i2, int i3) {
            this.f8942OooO00o = i;
            this.f8943OooO0O0 = i2;
            this.f8944OooO0OO = i3;
        }
    }

    public static class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final List<OooO0OO> f8945OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f8946OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int[] f8947OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooO0O0 f8948OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final int f8949OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f8950OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f8951OooO0oO;

        public OooO0o(OooO0O0 oooO0O0, List list, int[] iArr, int[] iArr2) {
            int i;
            int i2;
            this.f8945OooO00o = list;
            this.f8946OooO0O0 = iArr;
            this.f8947OooO0OO = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f8948OooO0Oo = oooO0O0;
            o0000oo o0000ooVar = (o0000oo) oooO0O0;
            int i3 = o0000ooVar.f28756OooO0Oo;
            this.f8950OooO0o0 = i3;
            int i4 = o0000ooVar.f28757OooO0o0;
            this.f8949OooO0o = i4;
            this.f8951OooO0oO = true;
            OooO0OO oooO0OO = list.isEmpty() ? null : (OooO0OO) list.get(0);
            if (oooO0OO == null || oooO0OO.f8942OooO00o != 0 || oooO0OO.f8943OooO0O0 != 0) {
                list.add(0, new OooO0OO(0, 0, 0));
            }
            list.add(new OooO0OO(i3, i4, 0));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                OooO0OO oooO0OO2 = (OooO0OO) it.next();
                for (int i5 = 0; i5 < oooO0OO2.f8944OooO0OO; i5++) {
                    int i6 = oooO0OO2.f8942OooO00o + i5;
                    int i7 = oooO0OO2.f8943OooO0O0 + i5;
                    int i8 = this.f8948OooO0Oo.OooO00o(i6, i7) ? 1 : 2;
                    this.f8946OooO0O0[i6] = (i7 << 4) | i8;
                    this.f8947OooO0OO[i7] = (i6 << 4) | i8;
                }
            }
            if (this.f8951OooO0oO) {
                int i9 = 0;
                for (OooO0OO oooO0OO3 : this.f8945OooO00o) {
                    while (true) {
                        i = oooO0OO3.f8942OooO00o;
                        if (i9 < i) {
                            if (this.f8946OooO0O0[i9] == 0) {
                                int size = this.f8945OooO00o.size();
                                int i10 = 0;
                                for (int i11 = 0; i11 < size; i11++) {
                                    OooO0OO oooO0OO4 = this.f8945OooO00o.get(i11);
                                    while (true) {
                                        i2 = oooO0OO4.f8943OooO0O0;
                                        if (i10 < i2) {
                                            if (this.f8947OooO0OO[i10] == 0 && this.f8948OooO0Oo.OooO0O0(i9, i10)) {
                                                int i12 = this.f8948OooO0Oo.OooO00o(i9, i10) ? 8 : 4;
                                                this.f8946OooO0O0[i9] = (i10 << 4) | i12;
                                                this.f8947OooO0OO[i10] = i12 | (i9 << 4);
                                                break;
                                            }
                                            i10++;
                                        }
                                    }
                                    i10 = oooO0OO4.f8944OooO0OO + i2;
                                }
                            }
                            i9++;
                        }
                    }
                    i9 = oooO0OO3.f8944OooO0OO + i;
                }
            }
        }

        @Nullable
        public static OooOO0 OooO0O0(Collection<OooOO0> collection, int i, boolean z) {
            OooOO0 next;
            Iterator<OooOO0> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f8952OooO00o == i && next.f8954OooO0OO == z) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                OooOO0 next2 = it.next();
                if (z) {
                    next2.f8953OooO0O0--;
                } else {
                    next2.f8953OooO0O0++;
                }
            }
            return next;
        }

        public final int OooO00o(@IntRange(from = ULong.MIN_VALUE) int i) {
            if (i < 0 || i >= this.f8950OooO0o0) {
                StringBuilder sbOooO00o = androidx.appcompat.widget.o00000O0.OooO00o("Index out of bounds - passed position = ", i, ", old list size = ");
                sbOooO00o.append(this.f8950OooO0o0);
                throw new IndexOutOfBoundsException(sbOooO00o.toString());
            }
            int i2 = this.f8946OooO0O0[i];
            if ((i2 & 15) == 0) {
                return -1;
            }
            return i2 >> 4;
        }
    }

    public static class OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f8952OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f8953OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f8954OooO0OO;

        public OooOO0(int i, int i2, boolean z) {
            this.f8952OooO00o = i;
            this.f8953OooO0O0 = i2;
            this.f8954OooO0OO = z;
        }
    }

    public static class OooOO0O {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f8955OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f8956OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f8957OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f8958OooO0Oo;

        public OooOO0O() {
        }

        public OooOO0O(int i, int i2) {
            this.f8955OooO00o = 0;
            this.f8956OooO0O0 = i;
            this.f8957OooO0OO = 0;
            this.f8958OooO0Oo = i2;
        }
    }

    public static class OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f8959OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f8960OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f8961OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f8962OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f8963OooO0o0;

        public final int OooO00o() {
            return Math.min(this.f8961OooO0OO - this.f8959OooO00o, this.f8962OooO0Oo - this.f8960OooO0O0);
        }
    }
}
