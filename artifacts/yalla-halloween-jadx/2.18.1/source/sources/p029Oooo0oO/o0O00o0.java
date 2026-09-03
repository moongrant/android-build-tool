package p029Oooo0oO;

import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import o0000O0O.Oooo000;
import o0000O0O.o0OoOo0;
import o0O0O00.o000O000;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00o0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f2431OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f2432OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Object f2433OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f2434OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f2435OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f2436OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f2437OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f2438OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f2439OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o000O000[] f2440OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o00O000 f2441OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f2442OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f2443OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f2444OooOOO0;

    public o0O00o0(int i, Object obj, boolean z, int i2, int i3, boolean z2, LayoutDirection layoutDirection, int i4, int i5, o000O000[] o000o000Arr, o00O000 o00o001, long j) {
        this.f2432OooO00o = i;
        this.f2433OooO0O0 = obj;
        this.f2434OooO0OO = z;
        this.f2435OooO0Oo = i2;
        this.f2437OooO0o0 = i3;
        this.f2436OooO0o = z2;
        this.f2438OooO0oO = layoutDirection;
        this.f2439OooO0oo = i4;
        this.f2431OooO = i5;
        this.f2440OooOO0 = o000o000Arr;
        this.f2441OooOO0O = o00o001;
        this.f2442OooOO0o = j;
        int iMax = 0;
        for (o000O000 o000o001 : o000o000Arr) {
            iMax = Math.max(iMax, this.f2434OooO0OO ? o000o001.f35266Oooo0oO : o000o001.f35265Oooo0o);
        }
        this.f2444OooOOO0 = iMax;
        this.f2443OooOOO = iMax + this.f2437OooO0o0;
    }

    @NotNull
    public final oo0O OooO00o(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        ArrayList arrayList = new ArrayList();
        boolean z = this.f2434OooO0OO;
        int i8 = z ? i4 : i3;
        int i9 = this.f2436OooO0o ? (i8 - i) - this.f2444OooOOO0 : i;
        int i10 = (z && this.f2438OooO0oO == LayoutDirection.Rtl) ? ((z ? i3 : i4) - i2) - this.f2435OooO0Oo : i2;
        long jOooO00o = z ? Oooo000.OooO00o(i10, i9) : Oooo000.OooO00o(i9, i10);
        int lastIndex = this.f2436OooO0o ? ArraysKt.getLastIndex(this.f2440OooOO0) : 0;
        while (true) {
            boolean z2 = this.f2436OooO0o;
            if (!(!z2 ? lastIndex >= this.f2440OooOO0.length : lastIndex < 0)) {
                break;
            }
            arrayList.add(z2 ? 0 : arrayList.size(), new o00OO0OO(this.f2440OooOO0[lastIndex], this.f2440OooOO0[lastIndex].Oooo0o()));
            lastIndex = this.f2436OooO0o ? lastIndex - 1 : lastIndex + 1;
        }
        long jOooO00o2 = this.f2434OooO0OO ? Oooo000.OooO00o(i2, i) : Oooo000.OooO00o(i, i2);
        int i11 = this.f2432OooO00o;
        Object obj = this.f2433OooO0O0;
        long jOooO00o3 = this.f2434OooO0OO ? o0OoOo0.OooO00o(this.f2435OooO0Oo, this.f2444OooOOO0) : o0OoOo0.OooO00o(this.f2444OooOOO0, this.f2435OooO0Oo);
        int i12 = this.f2437OooO0o0;
        boolean z3 = this.f2436OooO0o;
        return new oo0O(jOooO00o2, jOooO00o, i11, obj, i5, i6, jOooO00o3, i7, i12, -(!z3 ? this.f2439OooO0oo : this.f2431OooO), i8 + (!z3 ? this.f2431OooO : this.f2439OooO0oo), this.f2434OooO0OO, arrayList, this.f2441OooOO0O, this.f2442OooOO0o, null);
    }
}
