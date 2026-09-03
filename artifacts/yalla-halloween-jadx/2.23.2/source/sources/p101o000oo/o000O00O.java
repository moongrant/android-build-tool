package p101o000oo;

import androidx.paging.DiffingChangePayload;
import androidx.recyclerview.widget.o0OOO0o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNullPaddedListDiffHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NullPaddedListDiffHelper.kt\nandroidx/paging/OverlappingListsDiffDispatcher$PlaceholderUsingUpdateCallback\n*L\n1#1,532:1\n211#1:533\n211#1:534\n211#1:535\n211#1:536\n211#1:537\n211#1:538\n211#1:539\n211#1:540\n211#1:541\n211#1:542\n211#1:543\n211#1:544\n*S KotlinDebug\n*F\n+ 1 NullPaddedListDiffHelper.kt\nandroidx/paging/OverlappingListsDiffDispatcher$PlaceholderUsingUpdateCallback\n*L\n294#1:533\n316#1:534\n323#1:535\n343#1:536\n350#1:537\n366#1:538\n391#1:539\n396#1:540\n427#1:541\n434#1:542\n440#1:543\n444#1:544\n*E\n"})
public final class o000O00O<T> implements o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000Oo0<T> f35451OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000Oo0<T> f35452OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0OOO0o f35453OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f35454OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f35455OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f35456OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f35457OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f35458OooO0oo;

    public o000O00O(@NotNull o000Oo0<T> oldList, @NotNull o000Oo0<T> newList, @NotNull o0OOO0o callback) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f35451OooO00o = oldList;
        this.f35452OooO0O0 = newList;
        this.f35453OooO0OO = callback;
        this.f35454OooO0Oo = oldList.OooO0O0();
        this.f35456OooO0o0 = oldList.OooO0OO();
        this.f35455OooO0o = oldList.OooO00o();
        this.f35457OooO0oO = 1;
        this.f35458OooO0oo = 1;
    }

    @Override // androidx.recyclerview.widget.o0OOO0o
    public final void OooO00o(int i, int i2) {
        boolean z;
        int i3 = this.f35455OooO0o;
        boolean z2 = true;
        o0OOO0o o0ooo0o2 = this.f35453OooO0OO;
        if (i >= i3 && this.f35458OooO0oo != 2) {
            int iMin = Math.min(i2, this.f35456OooO0o0);
            if (iMin > 0) {
                this.f35458OooO0oo = 3;
                o0ooo0o2.OooO0OO(this.f35454OooO0Oo + i, iMin, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.f35456OooO0o0 -= iMin;
            }
            int i4 = i2 - iMin;
            if (i4 > 0) {
                o0ooo0o2.OooO00o(iMin + i + this.f35454OooO0Oo, i4);
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (i <= 0 && this.f35457OooO0oO != 2) {
                int iMin2 = Math.min(i2, this.f35454OooO0Oo);
                if (iMin2 > 0) {
                    this.f35457OooO0oO = 3;
                    o0ooo0o2.OooO0OO((0 - iMin2) + this.f35454OooO0Oo, iMin2, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                    this.f35454OooO0Oo -= iMin2;
                }
                int i5 = i2 - iMin2;
                if (i5 > 0) {
                    o0ooo0o2.OooO00o(this.f35454OooO0Oo + 0, i5);
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                o0ooo0o2.OooO00o(i + this.f35454OooO0Oo, i2);
            }
        }
        this.f35455OooO0o += i2;
    }

    @Override // androidx.recyclerview.widget.o0OOO0o
    public final void OooO0O0(int i, int i2) {
        boolean z;
        int i3 = i + i2;
        int i4 = this.f35455OooO0o;
        boolean z2 = true;
        o000Oo0<T> o000oo1 = this.f35452OooO0O0;
        o0OOO0o o0ooo0o2 = this.f35453OooO0OO;
        if (i3 >= i4 && this.f35458OooO0oo != 3) {
            int iCoerceAtLeast = RangesKt.coerceAtLeast(Math.min(o000oo1.OooO0OO() - this.f35456OooO0o0, i2), 0);
            int i5 = i2 - iCoerceAtLeast;
            if (iCoerceAtLeast > 0) {
                this.f35458OooO0oo = 2;
                o0ooo0o2.OooO0OO(this.f35454OooO0Oo + i, iCoerceAtLeast, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                this.f35456OooO0o0 += iCoerceAtLeast;
            }
            if (i5 > 0) {
                o0ooo0o2.OooO0O0(iCoerceAtLeast + i + this.f35454OooO0Oo, i5);
            }
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (i <= 0 && this.f35457OooO0oO != 3) {
                int iCoerceAtLeast2 = RangesKt.coerceAtLeast(Math.min(o000oo1.OooO0O0() - this.f35454OooO0Oo, i2), 0);
                int i6 = i2 - iCoerceAtLeast2;
                if (i6 > 0) {
                    o0ooo0o2.OooO0O0(this.f35454OooO0Oo + 0, i6);
                }
                if (iCoerceAtLeast2 > 0) {
                    this.f35457OooO0oO = 2;
                    o0ooo0o2.OooO0OO(this.f35454OooO0Oo + 0, iCoerceAtLeast2, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                    this.f35454OooO0Oo += iCoerceAtLeast2;
                }
            } else {
                z2 = false;
            }
            if (!z2) {
                o0ooo0o2.OooO0O0(i + this.f35454OooO0Oo, i2);
            }
        }
        this.f35455OooO0o -= i2;
    }

    @Override // androidx.recyclerview.widget.o0OOO0o
    public final void OooO0OO(int i, int i2, @Nullable Object obj) {
        this.f35453OooO0OO.OooO0OO(i + this.f35454OooO0Oo, i2, obj);
    }

    @Override // androidx.recyclerview.widget.o0OOO0o
    public final void OooO0Oo(int i, int i2) {
        int i3 = this.f35454OooO0Oo;
        this.f35453OooO0OO.OooO0Oo(i + i3, i2 + i3);
    }
}
