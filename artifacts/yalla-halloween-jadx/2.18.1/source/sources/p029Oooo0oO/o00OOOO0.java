package p029Oooo0oO;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o00OOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f2362OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00O0O0 f2363OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ArrayList<OooO00o> f2364OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f2365OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f2366OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f2367OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f2368OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final List<Integer> f2369OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public List<o000OO0O> f2370OooO0oo;

    public static final class OooO0O0 implements o00O0O00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO0O0 f2373OooO00o = new OooO0O0();
    }

    @StabilityInferred(parameters = 0)
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f2374OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final List<o000OO0O> f2375OooO0O0;

        public OooO0OO(int i, @NotNull List<o000OO0O> spans) {
            Intrinsics.checkNotNullParameter(spans, "spans");
            this.f2374OooO00o = i;
            this.f2375OooO0O0 = spans;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<OooO00o, Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f2376Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(1);
            this.f2376Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Integer invoke(OooO00o oooO00o) {
            OooO00o it = oooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.f2371OooO00o - this.f2376Oooo0o);
        }
    }

    public o00OOOO0(@NotNull o00O0O0 itemsSnapshot) {
        Intrinsics.checkNotNullParameter(itemsSnapshot, "itemsSnapshot");
        this.f2363OooO00o = itemsSnapshot;
        ArrayList<OooO00o> arrayList = new ArrayList<>();
        arrayList.add(new OooO00o(0));
        this.f2364OooO0O0 = arrayList;
        this.f2367OooO0o = -1;
        this.f2369OooO0oO = new ArrayList();
        this.f2370OooO0oo = CollectionsKt.emptyList();
    }

    public final int OooO00o() {
        return ((int) Math.sqrt((((double) OooO0Oo()) * 1.0d) / ((double) this.f2362OooO))) + 1;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList, java.util.List<java.lang.Integer>] */
    @NotNull
    public final OooO0OO OooO0O0(int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        List<o000OO0O> list;
        if (!this.f2363OooO00o.f2302OooO0O0) {
            int i5 = this.f2362OooO;
            int i6 = i * i5;
            int iCoerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(i5, OooO0Oo() - i6), 0);
            if (iCoerceAtLeast == this.f2370OooO0oo.size()) {
                list = this.f2370OooO0oo;
            } else {
                ArrayList arrayList = new ArrayList(iCoerceAtLeast);
                for (int i7 = 0; i7 < iCoerceAtLeast; i7++) {
                    arrayList.add(new o000OO0O(1));
                }
                this.f2370OooO0oo = arrayList;
                list = arrayList;
            }
            return new OooO0OO(i6, list);
        }
        int iMin = Math.min(i / OooO00o(), this.f2364OooO0O0.size() - 1);
        int iOooO00o = OooO00o() * iMin;
        int iIntValue = this.f2364OooO0O0.get(iMin).f2371OooO00o;
        int iOooO0o0 = this.f2364OooO0O0.get(iMin).f2372OooO0O0;
        int i8 = this.f2365OooO0OO;
        if (iOooO00o <= i8 && i8 <= i) {
            iIntValue = this.f2366OooO0Oo;
            iOooO0o0 = this.f2368OooO0o0;
            iOooO00o = i8;
        } else if (iMin == this.f2367OooO0o && (i2 = i - iOooO00o) < this.f2369OooO0oO.size()) {
            iIntValue = ((Number) this.f2369OooO0oO.get(i2)).intValue();
            iOooO00o = i;
            iOooO0o0 = 0;
        }
        if (iOooO00o % OooO00o() == 0) {
            int i9 = i - iOooO00o;
            if (2 <= i9 && i9 < OooO00o()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            this.f2367OooO0o = iMin;
            this.f2369OooO0oO.clear();
        }
        if (!(iOooO00o <= i)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        while (iOooO00o < i && iIntValue < OooO0Oo()) {
            if (z) {
                this.f2369OooO0oO.add(Integer.valueOf(iIntValue));
            }
            int i10 = 0;
            while (i10 < this.f2362OooO && iIntValue < OooO0Oo()) {
                if (iOooO0o0 == 0) {
                    i4 = iOooO0o0;
                    iOooO0o0 = OooO0o0(iIntValue);
                } else {
                    i4 = 0;
                }
                i10 += iOooO0o0;
                if (i10 > this.f2362OooO) {
                    break;
                }
                iIntValue++;
                iOooO0o0 = i4;
            }
            iOooO00o++;
            if (iOooO00o % OooO00o() == 0 && iIntValue < OooO0Oo()) {
                if (!(this.f2364OooO0O0.size() == iOooO00o / OooO00o())) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                this.f2364OooO0O0.add(new OooO00o(iIntValue, iOooO0o0));
            }
        }
        this.f2365OooO0OO = i;
        this.f2366OooO0Oo = iIntValue;
        this.f2368OooO0o0 = iOooO0o0;
        ArrayList arrayList2 = new ArrayList();
        int i11 = iIntValue;
        int i12 = 0;
        while (i12 < this.f2362OooO && i11 < OooO0Oo()) {
            if (iOooO0o0 == 0) {
                int i13 = iOooO0o0;
                iOooO0o0 = OooO0o0(i11);
                i3 = i13;
            } else {
                i3 = 0;
            }
            i12 += iOooO0o0;
            if (i12 > this.f2362OooO) {
                break;
            }
            i11++;
            arrayList2.add(new o000OO0O(iOooO0o0));
            iOooO0o0 = i3;
        }
        return new OooO0OO(iIntValue, arrayList2);
    }

    public final int OooO0OO(int i) {
        if (OooO0Oo() <= 0) {
            return 0;
        }
        if (!(i < OooO0Oo())) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!this.f2363OooO00o.f2302OooO0O0) {
            return i / this.f2362OooO;
        }
        int iBinarySearch$default = CollectionsKt__CollectionsKt.binarySearch$default(this.f2364OooO0O0, 0, 0, new OooO0o(i), 3, (Object) null);
        if (iBinarySearch$default < 0) {
            iBinarySearch$default = (-iBinarySearch$default) - 2;
        }
        int iOooO00o = OooO00o() * iBinarySearch$default;
        int i2 = this.f2364OooO0O0.get(iBinarySearch$default).f2371OooO00o;
        if (!(i2 <= i)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int i3 = 0;
        while (i2 < i) {
            int i4 = i2 + 1;
            int iOooO0o0 = OooO0o0(i2);
            i3 += iOooO0o0;
            int i5 = this.f2362OooO;
            if (i3 >= i5) {
                iOooO00o++;
                i3 = i3 == i5 ? 0 : iOooO0o0;
            }
            if (iOooO00o % OooO00o() == 0 && iOooO00o / OooO00o() >= this.f2364OooO0O0.size()) {
                this.f2364OooO0O0.add(new OooO00o(i4 - (i3 > 0 ? 1 : 0)));
            }
            i2 = i4;
        }
        return OooO0o0(i) + i3 > this.f2362OooO ? iOooO00o + 1 : iOooO00o;
    }

    public final int OooO0Oo() {
        return this.f2363OooO00o.f2301OooO00o.getSize();
    }

    public final int OooO0o0(int i) {
        o00O0O0 o00o0o0 = this.f2363OooO00o;
        OooO0O0 getSpan = OooO0O0.f2373OooO00o;
        Objects.requireNonNull(o00o0o0);
        Intrinsics.checkNotNullParameter(getSpan, "$this$getSpan");
        androidx.compose.foundation.lazy.layout.OooO0O0.OooO00o<o00> oooO00o = o00o0o0.f2301OooO00o.get(i);
        return RangesKt.coerceIn((int) oooO00o.f5795OooO0OO.f2248OooO0O0.invoke(getSpan, Integer.valueOf(i - oooO00o.f5793OooO00o)).f2271OooO00o, 1, this.f2362OooO);
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f2371OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f2372OooO0O0;

        public OooO00o(int i) {
            this.f2371OooO00o = i;
            this.f2372OooO0O0 = 0;
        }

        public OooO00o(int i, int i2) {
            this.f2371OooO00o = i;
            this.f2372OooO0O0 = i2;
        }
    }
}
