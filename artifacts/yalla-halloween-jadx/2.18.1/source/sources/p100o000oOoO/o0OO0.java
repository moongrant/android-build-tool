package p100o000oOoO;

import OooO00o.OooO00o;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class o0OO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f29584OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0OO0O0 f29585OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final int[] f29586OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f29587OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Object[] f29588OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f29589OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f29590OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f29591OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f29592OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f29593OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f29594OooOO0O;

    public o0OO0(@NotNull o0OO0O0 table) {
        Intrinsics.checkNotNullParameter(table, "table");
        this.f29585OooO00o = table;
        this.f29586OooO0O0 = table.f29601Oooo0o;
        int i = table.f29602Oooo0oO;
        this.f29587OooO0OO = i;
        this.f29588OooO0Oo = table.f29603Oooo0oo;
        this.f29590OooO0o0 = table.f29600Oooo;
        this.f29591OooO0oO = i;
        this.f29592OooO0oo = -1;
    }

    public final int OooO(int i) {
        return this.f29586OooO0O0[i * 5];
    }

    @NotNull
    public final o00oOoo OooO00o(int i) {
        ArrayList<o00oOoo> arrayList = this.f29585OooO00o.f29604OoooO;
        int iOooOOo0 = o0OOooO0.OooOOo0(arrayList, i, this.f29587OooO0OO);
        if (iOooOOo0 < 0) {
            o00oOoo o00oooo2 = new o00oOoo(i);
            arrayList.add(-(iOooOOo0 + 1), o00oooo2);
            return o00oooo2;
        }
        o00oOoo o00oooo3 = arrayList.get(iOooOOo0);
        Intrinsics.checkNotNullExpressionValue(o00oooo3, "get(location)");
        return o00oooo3;
    }

    public final Object OooO0O0(int[] iArr, int i) {
        int iOooOOOo;
        if (!o0OOooO0.OooO0o0(iArr, i)) {
            return oOO00O.OooO00o.f29689OooO0O0;
        }
        Object[] objArr = this.f29588OooO0Oo;
        int i2 = i * 5;
        if (i2 >= iArr.length) {
            iOooOOOo = iArr.length;
        } else {
            iOooOOOo = o0OOooO0.OooOOOo(iArr[i2 + 1] >> 29) + iArr[i2 + 4];
        }
        return objArr[iOooOOOo];
    }

    public final void OooO0OO() {
        o0OO0O0 o0oo0o1 = this.f29585OooO00o;
        Objects.requireNonNull(o0oo0o1);
        Intrinsics.checkNotNullParameter(this, "reader");
        if (!(this.f29585OooO00o == o0oo0o1 && o0oo0o1.f29606OoooO00 > 0)) {
            throw new IllegalArgumentException("Unexpected reader close()".toString());
        }
        o0oo0o1.f29606OoooO00--;
    }

    public final void OooO0Oo() {
        if (this.f29584OooO == 0) {
            if (!(this.f29589OooO0o == this.f29591OooO0oO)) {
                throw new IllegalArgumentException("endGroup() not called at the end of a group".toString());
            }
            int iOooOO0 = o0OOooO0.OooOO0(this.f29586OooO0O0, this.f29592OooO0oo);
            this.f29592OooO0oo = iOooOO0;
            this.f29591OooO0oO = iOooOO0 < 0 ? this.f29587OooO0OO : iOooOO0 + o0OOooO0.OooO0Oo(this.f29586OooO0O0, iOooOO0);
        }
    }

    public final int OooO0o() {
        int i = this.f29589OooO0o;
        if (i < this.f29591OooO0oO) {
            return this.f29586OooO0O0[i * 5];
        }
        return 0;
    }

    @Nullable
    public final Object OooO0o0() {
        int i = this.f29589OooO0o;
        if (i < this.f29591OooO0oO) {
            return OooO0O0(this.f29586OooO0O0, i);
        }
        return 0;
    }

    @Nullable
    public final Object OooO0oO(int i) {
        return OooO0O0(this.f29586OooO0O0, i);
    }

    @Nullable
    public final Object OooO0oo(int i, int i2) {
        int iOooOO0O = o0OOooO0.OooOO0O(this.f29586OooO0O0, i);
        int i3 = i + 1;
        int i4 = iOooOO0O + i2;
        return i4 < (i3 < this.f29587OooO0OO ? o0OOooO0.OooO0OO(this.f29586OooO0O0, i3) : this.f29590OooO0o0) ? this.f29588OooO0Oo[i4] : oOO00O.OooO00o.f29689OooO0O0;
    }

    @Nullable
    public final Object OooOO0(int i) {
        return OooOOOo(this.f29586OooO0O0, i);
    }

    public final int OooOO0O(int i) {
        return o0OOooO0.OooO0Oo(this.f29586OooO0O0, i);
    }

    public final boolean OooOO0o(int i) {
        return o0OOooO0.OooO0oO(this.f29586OooO0O0, i);
    }

    @Nullable
    public final Object OooOOO(int i) {
        if (!o0OOooO0.OooO0oO(this.f29586OooO0O0, i)) {
            return null;
        }
        int[] iArr = this.f29586OooO0O0;
        return o0OOooO0.OooO0oO(iArr, i) ? this.f29588OooO0Oo[iArr[(i * 5) + 4]] : oOO00O.OooO00o.f29689OooO0O0;
    }

    @Nullable
    public final Object OooOOO0() {
        int i;
        if (this.f29584OooO > 0 || (i = this.f29593OooOO0) >= this.f29594OooOO0O) {
            return oOO00O.OooO00o.f29689OooO0O0;
        }
        Object[] objArr = this.f29588OooO0Oo;
        this.f29593OooOO0 = i + 1;
        return objArr[i];
    }

    public final int OooOOOO(int i) {
        return o0OOooO0.OooO(this.f29586OooO0O0, i);
    }

    public final Object OooOOOo(int[] iArr, int i) {
        if (!o0OOooO0.OooO0o(iArr, i)) {
            return null;
        }
        int i2 = i * 5;
        return this.f29588OooO0Oo[o0OOooO0.OooOOOo(iArr[i2 + 1] >> 30) + iArr[i2 + 4]];
    }

    public final void OooOOo(int i) {
        if (!(this.f29584OooO == 0)) {
            throw new IllegalArgumentException("Cannot reposition while in an empty region".toString());
        }
        this.f29589OooO0o = i;
        int iOooOO0 = i < this.f29587OooO0OO ? o0OOooO0.OooOO0(this.f29586OooO0O0, i) : -1;
        this.f29592OooO0oo = iOooOO0;
        if (iOooOO0 < 0) {
            this.f29591OooO0oO = this.f29587OooO0OO;
        } else {
            this.f29591OooO0oO = o0OOooO0.OooO0Oo(this.f29586OooO0O0, iOooOO0) + iOooOO0;
        }
        this.f29593OooOO0 = 0;
        this.f29594OooOO0O = 0;
    }

    public final int OooOOo0(int i) {
        return o0OOooO0.OooOO0(this.f29586OooO0O0, i);
    }

    public final int OooOOoo() {
        if (!(this.f29584OooO == 0)) {
            throw new IllegalArgumentException("Cannot skip while in an empty region".toString());
        }
        int iOooO = o0OOooO0.OooO0oO(this.f29586OooO0O0, this.f29589OooO0o) ? 1 : o0OOooO0.OooO(this.f29586OooO0O0, this.f29589OooO0o);
        int i = this.f29589OooO0o;
        this.f29589OooO0o = o0OOooO0.OooO0Oo(this.f29586OooO0O0, i) + i;
        return iOooO;
    }

    public final void OooOo0() {
        if (this.f29584OooO <= 0) {
            if (!(o0OOooO0.OooOO0(this.f29586OooO0O0, this.f29589OooO0o) == this.f29592OooO0oo)) {
                throw new IllegalArgumentException("Invalid slot table detected".toString());
            }
            int i = this.f29589OooO0o;
            this.f29592OooO0oo = i;
            this.f29591OooO0oO = o0OOooO0.OooO0Oo(this.f29586OooO0O0, i) + i;
            int i2 = this.f29589OooO0o;
            int i3 = i2 + 1;
            this.f29589OooO0o = i3;
            this.f29593OooOO0 = o0OOooO0.OooOO0O(this.f29586OooO0O0, i2);
            this.f29594OooOO0O = i2 >= this.f29587OooO0OO - 1 ? this.f29590OooO0o0 : o0OOooO0.OooO0OO(this.f29586OooO0O0, i3);
        }
    }

    public final void OooOo00() {
        if (!(this.f29584OooO == 0)) {
            throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
        }
        this.f29589OooO0o = this.f29591OooO0oO;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("SlotReader(current=");
        sbOooO0o0.append(this.f29589OooO0o);
        sbOooO0o0.append(", key=");
        sbOooO0o0.append(OooO0o());
        sbOooO0o0.append(", parent=");
        sbOooO0o0.append(this.f29592OooO0oo);
        sbOooO0o0.append(", end=");
        return o0O0ooO.OooO00o(sbOooO0o0, this.f29591OooO0oO, ')');
    }
}
