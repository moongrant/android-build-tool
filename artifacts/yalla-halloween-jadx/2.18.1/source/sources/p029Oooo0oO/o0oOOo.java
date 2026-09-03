package p029Oooo0oO;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0oOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f2463OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f2464OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O00o0[] f2465OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final List<o000OO0O> f2466OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f2467OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f2468OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f2469OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f2470OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f2471OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f2472OooOO0;

    public o0oOOo(int i, o0O00o0[] o0o00o0Arr, List list, boolean z, int i2, LayoutDirection layoutDirection, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this.f2464OooO00o = i;
        this.f2465OooO0O0 = o0o00o0Arr;
        this.f2466OooO0OO = list;
        this.f2467OooO0Oo = z;
        this.f2469OooO0o0 = i2;
        this.f2468OooO0o = layoutDirection;
        this.f2470OooO0oO = i3;
        this.f2471OooO0oo = i4;
        int iMax = 0;
        for (o0O00o0 o0o00o1 : o0o00o0Arr) {
            iMax = Math.max(iMax, o0o00o1.f2444OooOOO0);
        }
        this.f2463OooO = iMax;
        this.f2472OooOO0 = iMax + this.f2470OooO0oO;
    }

    @NotNull
    public final List<oo0O> OooO00o(int i, int i2, int i3) {
        o0O00o0[] o0o00o0Arr = this.f2465OooO0O0;
        ArrayList arrayList = new ArrayList(o0o00o0Arr.length);
        int length = o0o00o0Arr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 < length) {
            o0O00o0 o0o00o1 = o0o00o0Arr[i4];
            int i8 = i5 + 1;
            int i9 = (int) this.f2466OooO0OO.get(i5).f2271OooO00o;
            int i10 = this.f2468OooO0o == LayoutDirection.Rtl ? (this.f2469OooO0o0 - i6) - i9 : i6;
            boolean z = this.f2467OooO0Oo;
            int i11 = z ? this.f2464OooO00o : i10;
            if (!z) {
                i10 = this.f2464OooO00o;
            }
            oo0O oo0oOooO00o = o0o00o1.OooO00o(i, i7, i2, i3, i11, i10, this.f2463OooO);
            i7 += o0o00o1.f2435OooO0Oo + this.f2471OooO0oo;
            i6 += i9;
            arrayList.add(oo0oOooO00o);
            i4++;
            i5 = i8;
            o0o00o0Arr = o0o00o0Arr;
        }
        return arrayList;
    }
}
