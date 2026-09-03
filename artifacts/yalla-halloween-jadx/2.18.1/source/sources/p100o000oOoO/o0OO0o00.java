package p100o000oOoO;

import androidx.appcompat.widget.o00000O0;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO0o00 {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public static final OooO00o f29611OooOo0O = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f29612OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0OO0O0 f29613OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public int[] f29614OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public Object[] f29615OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public ArrayList<o00oOoo> f29616OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f29617OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f29618OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f29619OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f29620OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f29621OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f29622OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public int f29623OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f29624OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f29625OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final o0oOOo f29626OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final o0oOOo f29627OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f29628OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final o0oOOo f29629OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f29630OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public o0oO0O0o f29631OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f29632OooOo00;

    public static final class OooO00o {
        /* JADX WARN: Code duplicated, block: B:10:0x003c  */
        public static final List OooO00o(o0OO0o00 o0oo0o01, int i, o0OO0o00 o0oo0o02, boolean z, boolean z2) {
            boolean z3;
            List listEmptyList;
            boolean zOooOooo;
            int iOooOOo = o0oo0o01.OooOOo(i);
            int i2 = i + iOooOOo;
            int iOooO0oO = o0oo0o01.OooO0oO(o0oo0o01.f29614OooO0O0, o0oo0o01.OooOOOo(i));
            int iOooO0oO2 = o0oo0o01.OooO0oO(o0oo0o01.f29614OooO0O0, o0oo0o01.OooOOOo(i2));
            int i3 = iOooO0oO2 - iOooO0oO;
            if (i < 0) {
                z3 = false;
            } else if ((o0oo0o01.f29614OooO0O0[(o0oo0o01.OooOOOo(i) * 5) + 1] & 201326592) != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            o0oo0o02.OooOo00(iOooOOo);
            o0oo0o02.OooOo0(i3, o0oo0o02.f29628OooOOo);
            if (o0oo0o01.f29618OooO0o0 < i2) {
                o0oo0o01.OooOo(i2);
            }
            if (o0oo0o01.f29621OooOO0 < iOooO0oO2) {
                o0oo0o01.OooOoO0(iOooO0oO2, i2);
            }
            int[] iArr = o0oo0o02.f29614OooO0O0;
            int i4 = o0oo0o02.f29628OooOOo;
            ArraysKt.copyInto(o0oo0o01.f29614OooO0O0, iArr, i4 * 5, i * 5, i2 * 5);
            Object[] objArr = o0oo0o02.f29615OooO0OO;
            int i5 = o0oo0o02.f29620OooO0oo;
            ArraysKt.copyInto(o0oo0o01.f29615OooO0OO, objArr, i5, iOooO0oO, iOooO0oO2);
            int i6 = o0oo0o02.f29630OooOOoo;
            o0OOooO0.OooOOOO(iArr, i4, i6);
            int i7 = i4 - i;
            int i8 = i4 + iOooOOo;
            int iOooO0oO3 = i5 - o0oo0o02.OooO0oO(iArr, i4);
            int i9 = o0oo0o02.f29623OooOO0o;
            int i10 = o0oo0o02.f29622OooOO0O;
            int length = objArr.length;
            int i11 = i9;
            boolean z4 = z3;
            int i12 = i4;
            while (i12 < i8) {
                if (i12 != i4) {
                    int i13 = (i12 * 5) + 2;
                    iArr[i13] = iArr[i13] + i7;
                }
                int i14 = i5;
                iArr[(i12 * 5) + 4] = o0oo0o02.OooO(o0oo0o02.OooO0oO(iArr, i12) + iOooO0oO3, i11 < i12 ? 0 : o0oo0o02.f29621OooOO0, i10, length);
                if (i12 == i11) {
                    i11++;
                }
                i12++;
                i8 = i8;
                i5 = i14;
            }
            int i15 = i5;
            int i16 = i8;
            o0oo0o02.f29623OooOO0o = i11;
            int iOooO0oo = o0OOooO0.OooO0oo(o0oo0o01.f29616OooO0Oo, i, o0oo0o01.OooOOO());
            int iOooO0oo2 = o0OOooO0.OooO0oo(o0oo0o01.f29616OooO0Oo, i2, o0oo0o01.OooOOO());
            if (iOooO0oo < iOooO0oo2) {
                ArrayList<o00oOoo> arrayList = o0oo0o01.f29616OooO0Oo;
                ArrayList arrayList2 = new ArrayList(iOooO0oo2 - iOooO0oo);
                for (int i17 = iOooO0oo; i17 < iOooO0oo2; i17++) {
                    o00oOoo o00oooo2 = arrayList.get(i17);
                    Intrinsics.checkNotNullExpressionValue(o00oooo2, "sourceAnchors[anchorIndex]");
                    o00oOoo o00oooo3 = o00oooo2;
                    o00oooo3.f29511OooO00o += i7;
                    arrayList2.add(o00oooo3);
                }
                o0oo0o02.f29616OooO0Oo.addAll(o0OOooO0.OooO0oo(o0oo0o02.f29616OooO0Oo, o0oo0o02.f29628OooOOo, o0oo0o02.OooOOO()), arrayList2);
                arrayList.subList(iOooO0oo, iOooO0oo2).clear();
                listEmptyList = arrayList2;
            } else {
                listEmptyList = CollectionsKt.emptyList();
            }
            int iOooOoo0 = o0oo0o01.OooOoo0(i);
            if (z) {
                boolean z5 = iOooOoo0 >= 0;
                if (z5) {
                    o0oo0o01.Oooo0o();
                    o0oo0o01.OooO00o(iOooOoo0 - o0oo0o01.f29628OooOOo);
                    o0oo0o01.Oooo0o();
                }
                o0oo0o01.OooO00o(i - o0oo0o01.f29628OooOOo);
                zOooOooo = o0oo0o01.OooOooo();
                if (z5) {
                    o0oo0o01.Oooo0O0();
                    o0oo0o01.OooOO0();
                    o0oo0o01.Oooo0O0();
                    o0oo0o01.OooOO0();
                }
            } else {
                boolean zOooo000 = o0oo0o01.Oooo000(i, iOooOOo);
                o0oo0o01.Oooo00O(iOooO0oO, i3, i - 1);
                zOooOooo = zOooo000;
            }
            if (!(!zOooOooo)) {
                oo0o0O0.OooO0Oo("Unexpectedly removed anchors".toString());
                throw null;
            }
            o0oo0o02.f29624OooOOO += o0OOooO0.OooO0oO(iArr, i4) ? 1 : o0OOooO0.OooO(iArr, i4);
            if (z2) {
                o0oo0o02.f29628OooOOo = i16;
                o0oo0o02.f29620OooO0oo = i15 + i3;
            }
            if (z4) {
                o0oo0o02.Oooo(i6);
            }
            return listEmptyList;
        }
    }

    public o0OO0o00(@NotNull o0OO0O0 table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.f29613OooO00o = table;
        int[] iArr = table.f29601Oooo0o;
        this.f29614OooO0O0 = iArr;
        Object[] objArr = table.f29603Oooo0oo;
        this.f29615OooO0OO = objArr;
        this.f29616OooO0Oo = table.f29604OoooO;
        int i = table.f29602Oooo0oO;
        this.f29618OooO0o0 = i;
        this.f29617OooO0o = (iArr.length / 5) - i;
        this.f29619OooO0oO = i;
        int i2 = table.f29600Oooo;
        this.f29621OooOO0 = i2;
        this.f29622OooOO0O = objArr.length - i2;
        this.f29623OooOO0o = i;
        this.f29626OooOOOO = new o0oOOo();
        this.f29627OooOOOo = new o0oOOo();
        this.f29629OooOOo0 = new o0oOOo();
        this.f29630OooOOoo = -1;
    }

    public final int OooO(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public final void OooO00o(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Cannot seek backwards".toString());
        }
        if (!(this.f29625OooOOO0 <= 0)) {
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        if (i == 0) {
            return;
        }
        int i2 = this.f29628OooOOo + i;
        if (i2 >= this.f29630OooOOoo && i2 <= this.f29619OooO0oO) {
            this.f29628OooOOo = i2;
            int iOooO0oO = OooO0oO(this.f29614OooO0O0, OooOOOo(i2));
            this.f29620OooO0oo = iOooO0oO;
            this.f29612OooO = iOooO0oO;
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Cannot seek outside the current group (");
        sbOooO0o0.append(this.f29630OooOOoo);
        sbOooO0o0.append('-');
        sbOooO0o0.append(this.f29619OooO0oO);
        sbOooO0o0.append(')');
        oo0o0O0.OooO0Oo(sbOooO0o0.toString().toString());
        throw null;
    }

    @NotNull
    public final o00oOoo OooO0O0(int i) {
        ArrayList<o00oOoo> arrayList = this.f29616OooO0Oo;
        int iOooOOo0 = o0OOooO0.OooOOo0(arrayList, i, OooOOO());
        if (iOooOOo0 >= 0) {
            o00oOoo o00oooo2 = arrayList.get(iOooOOo0);
            Intrinsics.checkNotNullExpressionValue(o00oooo2, "get(location)");
            return o00oooo2;
        }
        if (i > this.f29618OooO0o0) {
            i = -(OooOOO() - i);
        }
        o00oOoo o00oooo3 = new o00oOoo(i);
        arrayList.add(-(iOooOOo0 + 1), o00oooo3);
        return o00oooo3;
    }

    public final int OooO0OO(@NotNull o00oOoo anchor) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        int i = anchor.f29511OooO00o;
        return i < 0 ? i + OooOOO() : i;
    }

    public final int OooO0Oo(int[] iArr, int i) {
        return o0OOooO0.OooOOOo(iArr[(i * 5) + 1] >> 29) + OooO0oO(iArr, i);
    }

    public final void OooO0o() {
        this.f29632OooOo00 = true;
        if (this.f29626OooOOOO.f29675OooO0O0 == 0) {
            OooOo(OooOOO());
            OooOoO0(this.f29615OooO0OO.length - this.f29622OooOO0O, this.f29618OooO0o0);
            OooOooO();
        }
        o0OO0O0 o0oo0o1 = this.f29613OooO00o;
        int[] groups = this.f29614OooO0O0;
        int i = this.f29618OooO0o0;
        Object[] slots = this.f29615OooO0OO;
        int i2 = this.f29621OooOO0;
        ArrayList<o00oOoo> anchors = this.f29616OooO0Oo;
        Objects.requireNonNull(o0oo0o1);
        Intrinsics.checkNotNullParameter(this, "writer");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        if (!(this.f29613OooO00o == o0oo0o1 && o0oo0o1.f29605OoooO0)) {
            throw new IllegalArgumentException("Unexpected writer close()".toString());
        }
        o0oo0o1.f29605OoooO0 = false;
        o0oo0o1.OooO0oo(groups, i, slots, i2, anchors);
    }

    public final void OooO0o0() {
        int i = this.f29625OooOOO0;
        this.f29625OooOOO0 = i + 1;
        if (i == 0) {
            this.f29627OooOOOo.OooO0OO(((this.f29614OooO0O0.length / 5) - this.f29617OooO0o) - this.f29619OooO0oO);
        }
    }

    public final int OooO0oO(int[] iArr, int i) {
        if (i >= this.f29614OooO0O0.length / 5) {
            return this.f29615OooO0OO.length - this.f29622OooOO0O;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.f29615OooO0OO.length - this.f29622OooOO0O) + i2 + 1 : i2;
    }

    public final int OooO0oo(int i) {
        return i < this.f29621OooOO0 ? i : i + this.f29622OooOO0O;
    }

    public final int OooOO0() {
        boolean z = this.f29625OooOOO0 > 0;
        int i = this.f29628OooOOo;
        int i2 = this.f29619OooO0oO;
        int i3 = this.f29630OooOOoo;
        int iOooOOOo = OooOOOo(i3);
        int i4 = this.f29624OooOOO;
        int i5 = i - i3;
        boolean zOooO0oO = o0OOooO0.OooO0oO(this.f29614OooO0O0, iOooOOOo);
        if (z) {
            o0OOooO0.OooOOO0(this.f29614OooO0O0, iOooOOOo, i5);
            o0OOooO0.OooOOO(this.f29614OooO0O0, iOooOOOo, i4);
            this.f29624OooOOO = this.f29629OooOOo0.OooO0O0() + (zOooO0oO ? 1 : i4);
            this.f29630OooOOoo = OooOoo(this.f29614OooO0O0, i3);
        } else {
            if ((i != i2 ? 0 : 1) == 0) {
                throw new IllegalArgumentException("Expected to be at the end of a group".toString());
            }
            int iOooO0Oo = o0OOooO0.OooO0Oo(this.f29614OooO0O0, iOooOOOo);
            int iOooO = o0OOooO0.OooO(this.f29614OooO0O0, iOooOOOo);
            o0OOooO0.OooOOO0(this.f29614OooO0O0, iOooOOOo, i5);
            o0OOooO0.OooOOO(this.f29614OooO0O0, iOooOOOo, i4);
            int iOooO0O0 = this.f29626OooOOOO.OooO0O0();
            this.f29619OooO0oO = ((this.f29614OooO0O0.length / 5) - this.f29617OooO0o) - this.f29627OooOOOo.OooO0O0();
            this.f29630OooOOoo = iOooO0O0;
            int iOooOoo = OooOoo(this.f29614OooO0O0, i3);
            int iOooO0O1 = this.f29629OooOOo0.OooO0O0();
            this.f29624OooOOO = iOooO0O1;
            if (iOooOoo == iOooO0O0) {
                this.f29624OooOOO = iOooO0O1 + (zOooO0oO ? 0 : i4 - iOooO);
            } else {
                int i6 = i5 - iOooO0Oo;
                int i7 = zOooO0oO ? 0 : i4 - iOooO;
                if (i6 != 0 || i7 != 0) {
                    while (iOooOoo != 0 && iOooOoo != iOooO0O0 && (i7 != 0 || i6 != 0)) {
                        int iOooOOOo2 = OooOOOo(iOooOoo);
                        if (i6 != 0) {
                            o0OOooO0.OooOOO0(this.f29614OooO0O0, iOooOOOo2, o0OOooO0.OooO0Oo(this.f29614OooO0O0, iOooOOOo2) + i6);
                        }
                        if (i7 != 0) {
                            int[] iArr = this.f29614OooO0O0;
                            o0OOooO0.OooOOO(iArr, iOooOOOo2, o0OOooO0.OooO(iArr, iOooOOOo2) + i7);
                        }
                        if (o0OOooO0.OooO0oO(this.f29614OooO0O0, iOooOOOo2)) {
                            i7 = 0;
                        }
                        iOooOoo = OooOoo(this.f29614OooO0O0, iOooOoo);
                    }
                }
                this.f29624OooOOO += i7;
            }
        }
        return i4;
    }

    public final void OooOO0O() {
        int i = this.f29625OooOOO0;
        if (!(i > 0)) {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
        int i2 = i - 1;
        this.f29625OooOOO0 = i2;
        if (i2 == 0) {
            if (this.f29629OooOOo0.f29675OooO0O0 == this.f29626OooOOOO.f29675OooO0O0) {
                this.f29619OooO0oO = ((this.f29614OooO0O0.length / 5) - this.f29617OooO0o) - this.f29627OooOOOo.OooO0O0();
            } else {
                oo0o0O0.OooO0Oo("startGroup/endGroup mismatch while inserting".toString());
                throw null;
            }
        }
    }

    public final void OooOO0o(int i) {
        if (!(this.f29625OooOOO0 <= 0)) {
            throw new IllegalArgumentException("Cannot call ensureStarted() while inserting".toString());
        }
        int i2 = this.f29630OooOOoo;
        if (i2 != i) {
            if (!(i >= i2 && i < this.f29619OooO0oO)) {
                throw new IllegalArgumentException(o00O00OO.OooO00o("Started group at ", i, " must be a subgroup of the group at ", i2).toString());
            }
            int i3 = this.f29628OooOOo;
            int i4 = this.f29620OooO0oo;
            int i5 = this.f29612OooO;
            this.f29628OooOOo = i;
            Oooo0o();
            this.f29628OooOOo = i3;
            this.f29620OooO0oo = i4;
            this.f29612OooO = i5;
        }
    }

    public final int OooOOO() {
        return (this.f29614OooO0O0.length / 5) - this.f29617OooO0o;
    }

    public final void OooOOO0(int i, int i2, int i3) {
        if (i >= this.f29618OooO0o0) {
            i = -((OooOOO() - i) + 2);
        }
        while (i3 < i2) {
            o0OOooO0.OooOOOO(this.f29614OooO0O0, OooOOOo(i3), i);
            int iOooO0Oo = o0OOooO0.OooO0Oo(this.f29614OooO0O0, OooOOOo(i3)) + i3;
            OooOOO0(i3, iOooO0Oo, i3 + 1);
            i3 = iOooO0Oo;
        }
    }

    @Nullable
    public final Object OooOOOO(int i) {
        int iOooOOOo = OooOOOo(i);
        return o0OOooO0.OooO0o0(this.f29614OooO0O0, iOooOOOo) ? this.f29615OooO0OO[OooO0Oo(this.f29614OooO0O0, iOooOOOo)] : oOO00O.OooO00o.f29689OooO0O0;
    }

    public final int OooOOOo(int i) {
        return i < this.f29618OooO0o0 ? i : i + this.f29617OooO0o;
    }

    public final int OooOOo(int i) {
        return o0OOooO0.OooO0Oo(this.f29614OooO0O0, OooOOOo(i));
    }

    @Nullable
    public final Object OooOOo0(int i) {
        int iOooOOOo = OooOOOo(i);
        if (!o0OOooO0.OooO0o(this.f29614OooO0O0, iOooOOOo)) {
            return null;
        }
        Object[] objArr = this.f29615OooO0OO;
        int[] iArr = this.f29614OooO0O0;
        int i2 = iOooOOOo * 5;
        return objArr[o0OOooO0.OooOOOo(iArr[i2 + 1] >> 30) + iArr[i2 + 4]];
    }

    public final boolean OooOOoo(int i, int i2) {
        int length;
        int iOooOOo;
        if (i2 == this.f29630OooOOoo) {
            length = this.f29619OooO0oO;
        } else {
            if (i2 > this.f29626OooOOOO.OooO00o(0)) {
                iOooOOo = OooOOo(i2);
            } else {
                o0oOOo o0oooo2 = this.f29626OooOOOO;
                int i3 = o0oooo2.f29675OooO0O0;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        i4 = -1;
                        break;
                    }
                    if (o0oooo2.f29674OooO00o[i4] == i2) {
                        break;
                    }
                    i4++;
                }
                if (i4 < 0) {
                    iOooOOo = OooOOo(i2);
                } else {
                    length = ((this.f29614OooO0O0.length / 5) - this.f29617OooO0o) - this.f29627OooOOOo.f29674OooO00o[i4];
                }
            }
            length = iOooOOo + i2;
        }
        return i > i2 && i < length;
    }

    public final void OooOo(int i) {
        int i2;
        int i3 = this.f29617OooO0o;
        int i4 = this.f29618OooO0o0;
        if (i4 != i) {
            if (!this.f29616OooO0Oo.isEmpty()) {
                int length = (this.f29614OooO0O0.length / 5) - this.f29617OooO0o;
                if (i4 >= i) {
                    for (int iOooO0oo = o0OOooO0.OooO0oo(this.f29616OooO0Oo, i, length); iOooO0oo < this.f29616OooO0Oo.size(); iOooO0oo++) {
                        o00oOoo o00oooo2 = this.f29616OooO0Oo.get(iOooO0oo);
                        Intrinsics.checkNotNullExpressionValue(o00oooo2, "anchors[index]");
                        o00oOoo o00oooo3 = o00oooo2;
                        int i5 = o00oooo3.f29511OooO00o;
                        if (i5 < 0) {
                            break;
                        }
                        o00oooo3.f29511OooO00o = -(length - i5);
                    }
                } else {
                    for (int iOooO0oo2 = o0OOooO0.OooO0oo(this.f29616OooO0Oo, i4, length); iOooO0oo2 < this.f29616OooO0Oo.size(); iOooO0oo2++) {
                        o00oOoo o00oooo4 = this.f29616OooO0Oo.get(iOooO0oo2);
                        Intrinsics.checkNotNullExpressionValue(o00oooo4, "anchors[index]");
                        o00oOoo o00oooo5 = o00oooo4;
                        int i6 = o00oooo5.f29511OooO00o;
                        if (i6 >= 0 || (i2 = i6 + length) >= i) {
                            break;
                        }
                        o00oooo5.f29511OooO00o = i2;
                    }
                }
            }
            if (i3 > 0) {
                int[] iArr = this.f29614OooO0O0;
                int i7 = i * 5;
                int i8 = i3 * 5;
                int i9 = i4 * 5;
                if (i < i4) {
                    ArraysKt.copyInto(iArr, iArr, i8 + i7, i7, i9);
                } else {
                    ArraysKt.copyInto(iArr, iArr, i9, i9 + i8, i7 + i8);
                }
            }
            if (i < i4) {
                i4 = i + i3;
            }
            int length2 = this.f29614OooO0O0.length / 5;
            oo0o0O0.OooO0oO(i4 < length2);
            while (i4 < length2) {
                int iOooOO0 = o0OOooO0.OooOO0(this.f29614OooO0O0, i4);
                int iOooOOO = iOooOO0 > -2 ? iOooOO0 : OooOOO() + iOooOO0 + 2;
                if (iOooOOO >= i) {
                    iOooOOO = -((OooOOO() - iOooOOO) + 2);
                }
                if (iOooOOO != iOooOO0) {
                    o0OOooO0.OooOOOO(this.f29614OooO0O0, i4, iOooOOO);
                }
                i4++;
                if (i4 == i) {
                    i4 += i3;
                }
            }
        }
        this.f29618OooO0o0 = i;
    }

    public final void OooOo0(int i, int i2) {
        if (i > 0) {
            OooOoO0(this.f29620OooO0oo, i2);
            int i3 = this.f29621OooOO0;
            int i4 = this.f29622OooOO0O;
            if (i4 < i) {
                Object[] objArr = this.f29615OooO0OO;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                ArraysKt.copyInto(objArr, objArr2, 0, 0, i3);
                ArraysKt.copyInto(objArr, objArr2, i3 + i7, i4 + i3, length);
                this.f29615OooO0OO = objArr2;
                i4 = i7;
            }
            int i8 = this.f29612OooO;
            if (i8 >= i3) {
                this.f29612OooO = i8 + i;
            }
            this.f29621OooOO0 = i3 + i;
            this.f29622OooOO0O = i4 - i;
        }
    }

    public final void OooOo00(int i) {
        if (i > 0) {
            int i2 = this.f29628OooOOo;
            OooOo(i2);
            int i3 = this.f29618OooO0o0;
            int i4 = this.f29617OooO0o;
            int[] iArr = this.f29614OooO0O0;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                ArraysKt.copyInto(iArr, iArr2, 0, 0, i3 * 5);
                ArraysKt.copyInto(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.f29614OooO0O0 = iArr2;
                i4 = i6;
            }
            int i7 = this.f29619OooO0oO;
            if (i7 >= i3) {
                this.f29619OooO0oO = i7 + i;
            }
            int i8 = i3 + i;
            this.f29618OooO0o0 = i8;
            this.f29617OooO0o = i4 - i;
            int iOooO = OooO(i5 > 0 ? OooO0oO(this.f29614OooO0O0, OooOOOo(i2 + i)) : 0, this.f29623OooOO0o >= i3 ? this.f29621OooOO0 : 0, this.f29622OooOO0O, this.f29615OooO0OO.length);
            for (int i9 = i3; i9 < i8; i9++) {
                o0OOooO0.OooOO0o(this.f29614OooO0O0, i9, iOooO);
            }
            int i10 = this.f29623OooOO0o;
            if (i10 >= i3) {
                this.f29623OooOO0o = i10 + i;
            }
        }
    }

    public final boolean OooOo0O(int i) {
        return o0OOooO0.OooO0oO(this.f29614OooO0O0, OooOOOo(i));
    }

    @NotNull
    public final List<o00oOoo> OooOo0o(@NotNull o0OO0O0 table, int i) {
        Intrinsics.checkNotNullParameter(table, "table");
        if (!(this.f29625OooOOO0 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i != 0 || this.f29628OooOOo != 0 || this.f29613OooO00o.f29602Oooo0oO != 0) {
            o0OO0o00 o0oo0o00OooO0o0 = table.OooO0o0();
            try {
                return OooO00o.OooO00o(o0oo0o00OooO0o0, i, this, true, true);
            } finally {
                o0oo0o00OooO0o0.OooO0o();
            }
        }
        int[] iArr = this.f29614OooO0O0;
        Object[] objArr = this.f29615OooO0OO;
        ArrayList<o00oOoo> arrayList = this.f29616OooO0Oo;
        int[] iArr2 = table.f29601Oooo0o;
        int i2 = table.f29602Oooo0oO;
        Object[] objArr2 = table.f29603Oooo0oo;
        int i3 = table.f29600Oooo;
        this.f29614OooO0O0 = iArr2;
        this.f29615OooO0OO = objArr2;
        this.f29616OooO0Oo = table.f29604OoooO;
        this.f29618OooO0o0 = i2;
        this.f29617OooO0o = (iArr2.length / 5) - i2;
        this.f29621OooOO0 = i3;
        this.f29622OooOO0O = objArr2.length - i3;
        this.f29623OooOO0o = i2;
        table.OooO0oo(iArr, 0, objArr, 0, arrayList);
        return this.f29616OooO0Oo;
    }

    @NotNull
    public final List OooOoO(@NotNull o00oOoo anchor, @NotNull o0OO0o00 writer) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (!(writer.f29625OooOOO0 > 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(this.f29625OooOOO0 == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!anchor.OooO00o()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iOooO0OO = OooO0OO(anchor) + 1;
        int i = this.f29628OooOOo;
        if (!(i <= iOooO0OO && iOooO0OO < this.f29619OooO0oO)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iOooOoo0 = OooOoo0(iOooO0OO);
        int iOooOOo = OooOOo(iOooO0OO);
        int iOooO = OooOo0O(iOooO0OO) ? 1 : o0OOooO0.OooO(this.f29614OooO0O0, OooOOOo(iOooO0OO));
        List listOooO00o = OooO00o.OooO00o(this, iOooO0OO, writer, false, false);
        Oooo(iOooOoo0);
        boolean z = iOooO > 0;
        while (iOooOoo0 >= i) {
            int iOooOOOo = OooOOOo(iOooOoo0);
            int[] iArr = this.f29614OooO0O0;
            o0OOooO0.OooOOO0(iArr, iOooOOOo, o0OOooO0.OooO0Oo(iArr, iOooOOOo) - iOooOOo);
            if (z) {
                if (o0OOooO0.OooO0oO(this.f29614OooO0O0, iOooOOOo)) {
                    z = false;
                } else {
                    int[] iArr2 = this.f29614OooO0O0;
                    o0OOooO0.OooOOO(iArr2, iOooOOOo, o0OOooO0.OooO(iArr2, iOooOOOo) - iOooO);
                }
            }
            iOooOoo0 = OooOoo0(iOooOoo0);
        }
        if (z) {
            oo0o0O0.OooO0oO(this.f29624OooOOO >= iOooO);
            this.f29624OooOOO -= iOooO;
        }
        return listOooO00o;
    }

    public final void OooOoO0(int i, int i2) {
        int i3 = this.f29622OooOO0O;
        int i4 = this.f29621OooOO0;
        int i5 = this.f29623OooOO0o;
        if (i4 != i) {
            Object[] objArr = this.f29615OooO0OO;
            if (i < i4) {
                ArraysKt.copyInto(objArr, objArr, i + i3, i, i4);
            } else {
                ArraysKt.copyInto(objArr, objArr, i4, i4 + i3, i + i3);
            }
            ArraysKt.fill(objArr, (Object) null, i, i + i3);
        }
        int iMin = Math.min(i2 + 1, OooOOO());
        if (i5 != iMin) {
            int length = this.f29615OooO0OO.length - i3;
            if (iMin < i5) {
                int iOooOOOo = OooOOOo(iMin);
                int iOooOOOo2 = OooOOOo(i5);
                int i6 = this.f29618OooO0o0;
                while (iOooOOOo < iOooOOOo2) {
                    int iOooO0OO = o0OOooO0.OooO0OO(this.f29614OooO0O0, iOooOOOo);
                    if (!(iOooO0OO >= 0)) {
                        oo0o0O0.OooO0Oo("Unexpected anchor value, expected a positive anchor".toString());
                        throw null;
                    }
                    o0OOooO0.OooOO0o(this.f29614OooO0O0, iOooOOOo, -((length - iOooO0OO) + 1));
                    iOooOOOo++;
                    if (iOooOOOo == i6) {
                        iOooOOOo += this.f29617OooO0o;
                    }
                }
            } else {
                int iOooOOOo3 = OooOOOo(i5);
                int iOooOOOo4 = OooOOOo(iMin);
                while (iOooOOOo3 < iOooOOOo4) {
                    int iOooO0OO2 = o0OOooO0.OooO0OO(this.f29614OooO0O0, iOooOOOo3);
                    if (!(iOooO0OO2 < 0)) {
                        oo0o0O0.OooO0Oo("Unexpected anchor value, expected a negative anchor".toString());
                        throw null;
                    }
                    o0OOooO0.OooOO0o(this.f29614OooO0O0, iOooOOOo3, iOooO0OO2 + length + 1);
                    iOooOOOo3++;
                    if (iOooOOOo3 == this.f29618OooO0o0) {
                        iOooOOOo3 += this.f29617OooO0o;
                    }
                }
            }
            this.f29623OooOO0o = iMin;
        }
        this.f29621OooOO0 = i;
    }

    @Nullable
    public final Object OooOoOO(int i) {
        int iOooOOOo = OooOOOo(i);
        if (o0OOooO0.OooO0oO(this.f29614OooO0O0, iOooOOOo)) {
            return this.f29615OooO0OO[OooO0oo(OooO0oO(this.f29614OooO0O0, iOooOOOo))];
        }
        return null;
    }

    public final int OooOoo(int[] iArr, int i) {
        int i2 = iArr[(OooOOOo(i) * 5) + 2];
        return i2 > -2 ? i2 : OooOOO() + i2 + 2;
    }

    public final int OooOoo0(int i) {
        return OooOoo(this.f29614OooO0O0, i);
    }

    public final void OooOooO() {
        boolean z;
        o0oO0O0o o0oo0o0o2 = this.f29631OooOo0;
        if (o0oo0o0o2 != null) {
            while (!o0oo0o0o2.f29667OooO00o.isEmpty()) {
                int iOooO0O0 = o0oo0o0o2.OooO0O0();
                int iOooOOOo = OooOOOo(iOooO0O0);
                int iOooOOo = iOooO0O0 + 1;
                int iOooOOo2 = OooOOo(iOooO0O0) + iOooO0O0;
                while (true) {
                    if (iOooOOo >= iOooOOo2) {
                        z = false;
                        break;
                    }
                    if ((this.f29614OooO0O0[(OooOOOo(iOooOOo) * 5) + 1] & 201326592) != 0) {
                        z = true;
                        break;
                    }
                    iOooOOo += OooOOo(iOooOOo);
                }
                if (o0OOooO0.OooO0O0(this.f29614OooO0O0, iOooOOOo) != z) {
                    int[] iArr = this.f29614OooO0O0;
                    int i = (iOooOOOo * 5) + 1;
                    if (z) {
                        iArr[i] = iArr[i] | 67108864;
                    } else {
                        iArr[i] = iArr[i] & (-67108865);
                    }
                    int iOooOoo0 = OooOoo0(iOooO0O0);
                    if (iOooOoo0 >= 0) {
                        o0oo0o0o2.OooO00o(iOooOoo0);
                    }
                }
            }
        }
    }

    public final boolean OooOooo() {
        if (!(this.f29625OooOOO0 == 0)) {
            throw new IllegalArgumentException("Cannot remove group while inserting".toString());
        }
        int i = this.f29628OooOOo;
        int i2 = this.f29620OooO0oo;
        int iOooo0 = Oooo0();
        o0oO0O0o o0oo0o0o2 = this.f29631OooOo0;
        if (o0oo0o0o2 != null) {
            while ((!o0oo0o0o2.f29667OooO00o.isEmpty()) && ((Number) CollectionsKt.first((List) o0oo0o0o2.f29667OooO00o)).intValue() >= i) {
                o0oo0o0o2.OooO0O0();
            }
        }
        boolean zOooo000 = Oooo000(i, this.f29628OooOOo - i);
        Oooo00O(i2, this.f29620OooO0oo - i2, i - 1);
        this.f29628OooOOo = i;
        this.f29620OooO0oo = i2;
        this.f29624OooOOO -= iOooo0;
        return zOooo000;
    }

    public final void Oooo(int i) {
        if (i >= 0) {
            o0oO0O0o o0oo0o0o2 = this.f29631OooOo0;
            if (o0oo0o0o2 == null) {
                o0oo0o0o2 = new o0oO0O0o();
                this.f29631OooOo0 = o0oo0o0o2;
            }
            o0oo0o0o2.OooO00o(i);
        }
    }

    public final int Oooo0() {
        int iOooOOOo = OooOOOo(this.f29628OooOOo);
        int iOooO0Oo = o0OOooO0.OooO0Oo(this.f29614OooO0O0, iOooOOOo) + this.f29628OooOOo;
        this.f29628OooOOo = iOooO0Oo;
        this.f29620OooO0oo = OooO0oO(this.f29614OooO0O0, OooOOOo(iOooO0Oo));
        if (o0OOooO0.OooO0oO(this.f29614OooO0O0, iOooOOOo)) {
            return 1;
        }
        return o0OOooO0.OooO(this.f29614OooO0O0, iOooOOOo);
    }

    public final boolean Oooo000(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i2 <= 0) {
            return false;
        }
        ArrayList<o00oOoo> arrayList = this.f29616OooO0Oo;
        OooOo(i);
        if (!arrayList.isEmpty()) {
            int i3 = i2 + i;
            int iOooO0oo = o0OOooO0.OooO0oo(this.f29616OooO0Oo, i3, (this.f29614OooO0O0.length / 5) - this.f29617OooO0o);
            if (iOooO0oo >= this.f29616OooO0Oo.size()) {
                iOooO0oo--;
            }
            int i4 = iOooO0oo + 1;
            int i5 = 0;
            while (iOooO0oo >= 0) {
                o00oOoo o00oooo2 = this.f29616OooO0Oo.get(iOooO0oo);
                Intrinsics.checkNotNullExpressionValue(o00oooo2, "anchors[index]");
                o00oOoo o00oooo3 = o00oooo2;
                int iOooO0OO = OooO0OO(o00oooo3);
                if (iOooO0OO < i) {
                    break;
                }
                if (iOooO0OO < i3) {
                    o00oooo3.f29511OooO00o = Integer.MIN_VALUE;
                    if (i5 == 0) {
                        i5 = iOooO0oo + 1;
                    }
                    i4 = iOooO0oo;
                }
                iOooO0oo--;
            }
            z = i4 < i5;
            if (z) {
                this.f29616OooO0Oo.subList(i4, i5).clear();
            }
        } else {
            z = false;
        }
        this.f29618OooO0o0 = i;
        this.f29617OooO0o += i2;
        int i6 = this.f29623OooOO0o;
        if (i6 > i) {
            this.f29623OooOO0o = Math.max(i, i6 - i2);
        }
        int i7 = this.f29619OooO0oO;
        if (i7 >= this.f29618OooO0o0) {
            this.f29619OooO0oO = i7 - i2;
        }
        int i8 = this.f29630OooOOoo;
        if (i8 >= 0 && o0OOooO0.OooO0O0(this.f29614OooO0O0, OooOOOo(i8))) {
            z2 = true;
        }
        if (z2) {
            Oooo(this.f29630OooOOoo);
        }
        return z;
    }

    public final void Oooo00O(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.f29622OooOO0O;
            int i5 = i + i2;
            OooOoO0(i5, i3);
            this.f29621OooOO0 = i;
            this.f29622OooOO0O = i4 + i2;
            ArraysKt.fill(this.f29615OooO0OO, (Object) null, i, i5);
            int i6 = this.f29612OooO;
            if (i6 >= i) {
                this.f29612OooO = i6 - i2;
            }
        }
    }

    @Nullable
    public final Object Oooo00o(int i, @Nullable Object obj) {
        int iOooo0o0 = Oooo0o0(this.f29614OooO0O0, OooOOOo(this.f29628OooOOo));
        int i2 = iOooo0o0 + i;
        if (!(i2 >= iOooo0o0 && i2 < OooO0oO(this.f29614OooO0O0, OooOOOo(this.f29628OooOOo + 1)))) {
            StringBuilder sbOooO00o = o00000O0.OooO00o("Write to an invalid slot index ", i, " for group ");
            sbOooO00o.append(this.f29628OooOOo);
            oo0o0O0.OooO0Oo(sbOooO00o.toString().toString());
            throw null;
        }
        int iOooO0oo = OooO0oo(i2);
        Object[] objArr = this.f29615OooO0OO;
        Object obj2 = objArr[iOooO0oo];
        objArr[iOooO0oo] = obj;
        return obj2;
    }

    public final void Oooo0O0() {
        int i = this.f29619OooO0oO;
        this.f29628OooOOo = i;
        this.f29620OooO0oo = OooO0oO(this.f29614OooO0O0, OooOOOo(i));
    }

    @Nullable
    public final Object Oooo0OO(int i, int i2) {
        int iOooo0o0 = Oooo0o0(this.f29614OooO0O0, OooOOOo(i));
        int i3 = i2 + iOooo0o0;
        if (iOooo0o0 <= i3 && i3 < OooO0oO(this.f29614OooO0O0, OooOOOo(i + 1))) {
            return this.f29615OooO0OO[OooO0oo(i3)];
        }
        return oOO00O.OooO00o.f29689OooO0O0;
    }

    public final void Oooo0o() {
        if (!(this.f29625OooOOO0 == 0)) {
            throw new IllegalArgumentException("Key must be supplied when inserting".toString());
        }
        oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
        Oooo0oO(0, c0323OooO00o, false, c0323OooO00o);
    }

    public final int Oooo0o0(int[] iArr, int i) {
        if (i >= this.f29614OooO0O0.length / 5) {
            return this.f29615OooO0OO.length - this.f29622OooOO0O;
        }
        int iOooOO0O = o0OOooO0.OooOO0O(iArr, i);
        return iOooOO0O < 0 ? (this.f29615OooO0OO.length - this.f29622OooOO0O) + iOooOO0O + 1 : iOooOO0O;
    }

    public final void Oooo0oO(int i, Object obj, boolean z, Object obj2) {
        int iOooO0Oo;
        boolean z2 = this.f29625OooOOO0 > 0;
        this.f29629OooOOo0.OooO0OO(this.f29624OooOOO);
        if (z2) {
            OooOo00(1);
            int i2 = this.f29628OooOOo;
            int iOooOOOo = OooOOOo(i2);
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            int i3 = obj != c0323OooO00o ? 1 : 0;
            int i4 = (z || obj2 == c0323OooO00o) ? 0 : 1;
            int[] iArr = this.f29614OooO0O0;
            int i5 = this.f29630OooOOoo;
            int i6 = this.f29620OooO0oo;
            int i7 = z ? 1073741824 : 0;
            int i8 = i3 != 0 ? 536870912 : 0;
            int i9 = i4 != 0 ? SQLiteDatabase.CREATE_IF_NECESSARY : 0;
            int i10 = iOooOOOo * 5;
            iArr[i10 + 0] = i;
            iArr[i10 + 1] = i7 | i8 | i9;
            iArr[i10 + 2] = i5;
            iArr[i10 + 3] = 0;
            iArr[i10 + 4] = i6;
            this.f29612OooO = i6;
            int i11 = (z ? 1 : 0) + i3 + i4;
            if (i11 > 0) {
                OooOo0(i11, i2);
                Object[] objArr = this.f29615OooO0OO;
                int i12 = this.f29620OooO0oo;
                if (z) {
                    objArr[i12] = obj2;
                    i12++;
                }
                if (i3 != 0) {
                    objArr[i12] = obj;
                    i12++;
                }
                if (i4 != 0) {
                    objArr[i12] = obj2;
                    i12++;
                }
                this.f29620OooO0oo = i12;
            }
            this.f29624OooOOO = 0;
            iOooO0Oo = i2 + 1;
            this.f29630OooOOoo = i2;
            this.f29628OooOOo = iOooO0Oo;
        } else {
            this.f29626OooOOOO.OooO0OO(this.f29630OooOOoo);
            this.f29627OooOOOo.OooO0OO(((this.f29614OooO0O0.length / 5) - this.f29617OooO0o) - this.f29619OooO0oO);
            int i13 = this.f29628OooOOo;
            int iOooOOOo2 = OooOOOo(i13);
            if (!Intrinsics.areEqual(obj2, oOO00O.OooO00o.f29689OooO0O0)) {
                if (z) {
                    OoooO00(this.f29628OooOOo, obj2);
                } else {
                    Oooo0oo(obj2);
                }
            }
            this.f29620OooO0oo = Oooo0o0(this.f29614OooO0O0, iOooOOOo2);
            this.f29612OooO = OooO0oO(this.f29614OooO0O0, OooOOOo(this.f29628OooOOo + 1));
            this.f29624OooOOO = o0OOooO0.OooO(this.f29614OooO0O0, iOooOOOo2);
            this.f29630OooOOoo = i13;
            this.f29628OooOOo = i13 + 1;
            iOooO0Oo = i13 + o0OOooO0.OooO0Oo(this.f29614OooO0O0, iOooOOOo2);
        }
        this.f29619OooO0oO = iOooO0Oo;
    }

    public final void Oooo0oo(@Nullable Object obj) {
        int iOooOOOo = OooOOOo(this.f29628OooOOo);
        if (o0OOooO0.OooO0o0(this.f29614OooO0O0, iOooOOOo)) {
            this.f29615OooO0OO[OooO0oo(OooO0Oo(this.f29614OooO0O0, iOooOOOo))] = obj;
        } else {
            oo0o0O0.OooO0Oo("Updating the data of a group that was not created with a data slot".toString());
            throw null;
        }
    }

    public final void OoooO00(int i, Object obj) {
        int iOooOOOo = OooOOOo(i);
        int[] iArr = this.f29614OooO0O0;
        if (iOooOOOo < iArr.length && o0OOooO0.OooO0oO(iArr, iOooOOOo)) {
            this.f29615OooO0OO[OooO0oo(OooO0oO(this.f29614OooO0O0, iOooOOOo))] = obj;
            return;
        }
        oo0o0O0.OooO0Oo(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw null;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("SlotWriter(current = ");
        sbOooO0o0.append(this.f29628OooOOo);
        sbOooO0o0.append(" end=");
        sbOooO0o0.append(this.f29619OooO0oO);
        sbOooO0o0.append(" size = ");
        sbOooO0o0.append(OooOOO());
        sbOooO0o0.append(" gap=");
        sbOooO0o0.append(this.f29618OooO0o0);
        sbOooO0o0.append('-');
        sbOooO0o0.append(this.f29618OooO0o0 + this.f29617OooO0o);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }
}
