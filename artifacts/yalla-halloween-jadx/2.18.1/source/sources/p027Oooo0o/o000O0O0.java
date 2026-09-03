package p027Oooo0o;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import kotlin.collections.ArraysKt;
import o0000O0O.Oooo000;
import o0O0O00.o000O000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f1894OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f1895OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o000O000[] f1896OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f1897OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o00OO0O0.OooO0O0 f1898OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final LayoutDirection f1899OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final o00OO0O0.OooO0OO f1900OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f1901OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f1902OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final o0OOO0o f1903OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f1904OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f1905OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f1906OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final Object f1907OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f1908OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f1909OooOOOo;

    @ExperimentalFoundationApi
    public o000O0O0(int i, o000O000[] o000o000Arr, boolean z, o00OO0O0.OooO0O0 oooO0O0, o00OO0O0.OooO0OO oooO0OO, LayoutDirection layoutDirection, boolean z2, int i2, int i3, o0OOO0o o0ooo0o2, int i4, long j, Object obj) {
        this.f1895OooO00o = i;
        this.f1896OooO0O0 = o000o000Arr;
        this.f1897OooO0OO = z;
        this.f1898OooO0Oo = oooO0O0;
        this.f1900OooO0o0 = oooO0OO;
        this.f1899OooO0o = layoutDirection;
        this.f1901OooO0oO = z2;
        this.f1902OooO0oo = i2;
        this.f1894OooO = i3;
        this.f1903OooOO0 = o0ooo0o2;
        this.f1904OooOO0O = i4;
        this.f1905OooOO0o = j;
        this.f1907OooOOO0 = obj;
        int i5 = 0;
        int iMax = 0;
        for (o000O000 o000o001 : o000o000Arr) {
            boolean z3 = this.f1897OooO0OO;
            i5 += z3 ? o000o001.f35266Oooo0oO : o000o001.f35265Oooo0o;
            iMax = Math.max(iMax, !z3 ? o000o001.f35266Oooo0oO : o000o001.f35265Oooo0o);
        }
        this.f1906OooOOO = i5;
        this.f1908OooOOOO = i5 + this.f1904OooOO0O;
        this.f1909OooOOOo = iMax;
    }

    @NotNull
    public final o000OO OooO00o(int i, int i2, int i3) {
        long jOooO00o;
        ArrayList arrayList = new ArrayList();
        int i4 = this.f1897OooO0OO ? i3 : i2;
        boolean z = this.f1901OooO0oO;
        int i5 = z ? (i4 - i) - this.f1906OooOOO : i;
        int lastIndex = z ? ArraysKt.getLastIndex(this.f1896OooO0O0) : 0;
        while (true) {
            boolean z2 = this.f1901OooO0oO;
            if (!(!z2 ? lastIndex >= this.f1896OooO0O0.length : lastIndex < 0)) {
                return new o000OO(i, this.f1895OooO00o, this.f1907OooOOO0, this.f1906OooOOO, this.f1908OooOOOO, -(!z2 ? this.f1902OooO0oo : this.f1894OooO), i4 + (!z2 ? this.f1894OooO : this.f1902OooO0oo), this.f1897OooO0OO, arrayList, this.f1903OooOO0, this.f1905OooOO0o, null);
            }
            o000O000 o000o001 = this.f1896OooO0O0[lastIndex];
            int size = z2 ? 0 : arrayList.size();
            if (this.f1897OooO0OO) {
                o00OO0O0.OooO0O0 oooO0O0 = this.f1898OooO0Oo;
                if (oooO0O0 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                jOooO00o = Oooo000.OooO00o(oooO0O0.OooO00o(o000o001.f35265Oooo0o, i2, this.f1899OooO0o), i5);
            } else {
                o00OO0O0.OooO0OO oooO0OO = this.f1900OooO0o0;
                if (oooO0OO == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                jOooO00o = Oooo000.OooO00o(i5, oooO0OO.OooO00o(o000o001.f35266Oooo0oO, i3));
            }
            i5 += this.f1897OooO0OO ? o000o001.f35266Oooo0oO : o000o001.f35265Oooo0o;
            arrayList.add(size, new o0000O0O(jOooO00o, o000o001, this.f1896OooO0O0[lastIndex].Oooo0o()));
            lastIndex = this.f1901OooO0oO ? lastIndex - 1 : lastIndex + 1;
        }
    }
}
