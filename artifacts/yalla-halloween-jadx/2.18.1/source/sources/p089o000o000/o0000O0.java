package p089o000o000;

import androidx.paging.DiffingChangePayload;
import androidx.recyclerview.widget.o0ooOOo;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0<T> implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000O00<T> f28725OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0000O00<T> f28726OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0ooOOo f28727OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f28728OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f28729OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f28730OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f28731OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f28732OooO0oo;

    public o0000O0(@NotNull o0000O00<T> oldList, @NotNull o0000O00<T> newList, @NotNull o0ooOOo callback) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f28725OooO00o = oldList;
        this.f28726OooO0O0 = newList;
        this.f28727OooO0OO = callback;
        this.f28728OooO0Oo = oldList.OooO0O0();
        this.f28730OooO0o0 = oldList.OooO0OO();
        this.f28729OooO0o = oldList.OooO00o();
        this.f28731OooO0oO = 1;
        this.f28732OooO0oo = 1;
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO00o(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= this.f28729OooO0o && this.f28732OooO0oo != 2) {
            int iMin = Math.min(i2, this.f28730OooO0o0);
            if (iMin > 0) {
                this.f28732OooO0oo = 3;
                this.f28727OooO0OO.OooO0Oo(this.f28728OooO0Oo + i, iMin, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.f28730OooO0o0 -= iMin;
            }
            int i3 = i2 - iMin;
            if (i3 > 0) {
                this.f28727OooO0OO.OooO00o(iMin + i + this.f28728OooO0Oo, i3);
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (i <= 0 && this.f28731OooO0oO != 2) {
                int iMin2 = Math.min(i2, this.f28728OooO0Oo);
                if (iMin2 > 0) {
                    this.f28731OooO0oO = 3;
                    this.f28727OooO0OO.OooO0Oo((0 - iMin2) + this.f28728OooO0Oo, iMin2, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                    this.f28728OooO0Oo -= iMin2;
                }
                int i4 = i2 - iMin2;
                if (i4 > 0) {
                    this.f28727OooO0OO.OooO00o(this.f28728OooO0Oo + 0, i4);
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                this.f28727OooO0OO.OooO00o(i + this.f28728OooO0Oo, i2);
            }
        }
        this.f28729OooO0o += i2;
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO0O0(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i + i2 >= this.f28729OooO0o && this.f28732OooO0oo != 3) {
            int iCoerceAtLeast = RangesKt.coerceAtLeast(Math.min(this.f28726OooO0O0.OooO0OO() - this.f28730OooO0o0, i2), 0);
            int i3 = i2 - iCoerceAtLeast;
            if (iCoerceAtLeast > 0) {
                this.f28732OooO0oo = 2;
                this.f28727OooO0OO.OooO0Oo(this.f28728OooO0Oo + i, iCoerceAtLeast, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                this.f28730OooO0o0 += iCoerceAtLeast;
            }
            if (i3 > 0) {
                this.f28727OooO0OO.OooO0O0(iCoerceAtLeast + i + this.f28728OooO0Oo, i3);
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (i <= 0 && this.f28731OooO0oO != 3) {
                int iCoerceAtLeast2 = RangesKt.coerceAtLeast(Math.min(this.f28726OooO0O0.OooO0O0() - this.f28728OooO0Oo, i2), 0);
                int i4 = i2 - iCoerceAtLeast2;
                if (i4 > 0) {
                    this.f28727OooO0OO.OooO0O0(this.f28728OooO0Oo + 0, i4);
                }
                if (iCoerceAtLeast2 > 0) {
                    this.f28731OooO0oO = 2;
                    this.f28727OooO0OO.OooO0Oo(this.f28728OooO0Oo + 0, iCoerceAtLeast2, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                    this.f28728OooO0Oo += iCoerceAtLeast2;
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                this.f28727OooO0OO.OooO0O0(i + this.f28728OooO0Oo, i2);
            }
        }
        this.f28729OooO0o -= i2;
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO0OO(int i, int i2) {
        o0ooOOo o0ooooo2 = this.f28727OooO0OO;
        int i3 = this.f28728OooO0Oo;
        o0ooooo2.OooO0OO(i + i3, i2 + i3);
    }

    @Override // androidx.recyclerview.widget.o0ooOOo
    public final void OooO0Oo(int i, int i2, @Nullable Object obj) {
        this.f28727OooO0OO.OooO0Oo(i + this.f28728OooO0Oo, i2, obj);
    }
}
