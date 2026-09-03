package p039OoooOoO;

import java.util.Arrays;
import java.util.Objects;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042Ooooo0o.o000O00O;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0O0<K, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f3749OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f3750OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final p042Ooooo0o.o000O0O0 f3751OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public Object[] f3752OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f3748OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final o000O0O0 f3747OooO0o = new o000O0O0(0, 0, new Object[0]);

    public static final class OooO00o {
    }

    public static final class OooO0O0<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public o000O0O0<K, V> f3753OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f3754OooO0O0;

        public OooO0O0(@NotNull o000O0O0<K, V> node, int i) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.f3753OooO00o = node;
            this.f3754OooO0O0 = i;
        }
    }

    public o000O0O0(int i, int i2, @NotNull Object[] buffer, @Nullable p042Ooooo0o.o000O0O0 o000o0o1) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f3749OooO00o = i;
        this.f3750OooO0O0 = i2;
        this.f3751OooO0OO = o000o0o1;
        this.f3752OooO0Oo = buffer;
    }

    @Nullable
    public final V OooO(int i, K k, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if (OooOO0(i3)) {
            int iOooO0oo = OooO0oo(i3);
            if (Intrinsics.areEqual(k, this.f3752OooO0Oo[iOooO0oo])) {
                return OooOoO(iOooO0oo);
            }
            return null;
        }
        if (!OooOO0O(i3)) {
            return null;
        }
        o000O0O0<K, V> o000o0o0OooOo0 = OooOo0(OooOo0O(i3));
        if (i2 != 30) {
            return o000o0o0OooOo0.OooO(i, k, i2 + 5);
        }
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, o000o0o0OooOo0.f3752OooO0Oo.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return null;
        }
        while (!Intrinsics.areEqual(k, o000o0o0OooOo0.f3752OooO0Oo[first])) {
            if (first == last) {
                return null;
            }
            first += step;
        }
        return o000o0o0OooOo0.OooOoO(first);
    }

    public final OooO0O0<K, V> OooO00o() {
        return new OooO0O0<>(this, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object[] OooO0O0(int i, int i2, int i3, K k, V v, int i4, p042Ooooo0o.o000O0O0 o000o0o1) {
        Object obj = this.f3752OooO0Oo[i];
        o000O0O0 o000o0o0OooOO0o = OooOO0o(obj != null ? obj.hashCode() : 0, obj, OooOoO(i), i3, k, v, i4 + 5, o000o0o1);
        int iOooOo0O = OooOo0O(i2) + 1;
        Object[] objArr = this.f3752OooO0Oo;
        int i5 = iOooOo0O - 2;
        Object[] objArr2 = new Object[(objArr.length - 2) + 1];
        ArraysKt.OooO0o0(objArr, objArr2, 0, 0, i, 6);
        ArraysKt.copyInto(objArr, objArr2, i, i + 2, iOooOo0O);
        objArr2[i5] = o000o0o0OooOO0o;
        ArraysKt.copyInto(objArr, objArr2, i5 + 1, iOooOo0O, objArr.length);
        return objArr2;
    }

    public final int OooO0OO() {
        if (this.f3750OooO0O0 == 0) {
            return this.f3752OooO0Oo.length / 2;
        }
        int iBitCount = Integer.bitCount(this.f3749OooO00o);
        int length = this.f3752OooO0Oo.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += OooOo0(i).OooO0OO();
        }
        return iBitCount;
    }

    public final boolean OooO0Oo(K k) {
        IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, this.f3752OooO0Oo.length), 2);
        int first = intProgressionStep.getFirst();
        int last = intProgressionStep.getLast();
        int step = intProgressionStep.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.areEqual(k, this.f3752OooO0Oo[first])) {
                if (first != last) {
                    first += step;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean OooO0o(o000O0O0<K, V> o000o0o1) {
        if (this == o000o0o1) {
            return true;
        }
        if (this.f3750OooO0O0 != o000o0o1.f3750OooO0O0 || this.f3749OooO00o != o000o0o1.f3749OooO00o) {
            return false;
        }
        int length = this.f3752OooO0Oo.length;
        for (int i = 0; i < length; i++) {
            if (this.f3752OooO0Oo[i] != o000o0o1.f3752OooO0Oo[i]) {
                return false;
            }
        }
        return true;
    }

    public final boolean OooO0o0(int i, K k, int i2) {
        int i3 = 1 << ((i >> i2) & 31);
        if (OooOO0(i3)) {
            return Intrinsics.areEqual(k, this.f3752OooO0Oo[OooO0oo(i3)]);
        }
        if (!OooOO0O(i3)) {
            return false;
        }
        o000O0O0<K, V> o000o0o0OooOo0 = OooOo0(OooOo0O(i3));
        return i2 == 30 ? o000o0o0OooOo0.OooO0Oo(k) : o000o0o0OooOo0.OooO0o0(i, k, i2 + 5);
    }

    public final int OooO0oO() {
        return Integer.bitCount(this.f3749OooO00o);
    }

    public final int OooO0oo(int i) {
        return Integer.bitCount((i - 1) & this.f3749OooO00o) * 2;
    }

    public final boolean OooOO0(int i) {
        return (i & this.f3749OooO00o) != 0;
    }

    public final boolean OooOO0O(int i) {
        return (i & this.f3750OooO0O0) != 0;
    }

    public final o000O0O0<K, V> OooOO0o(int i, K k, V v, int i2, K k2, V v2, int i3, p042Ooooo0o.o000O0O0 o000o0o1) {
        if (i3 > 30) {
            return new o000O0O0<>(0, 0, new Object[]{k, v, k2, v2}, o000o0o1);
        }
        int i4 = (i >> i3) & 31;
        int i5 = (i2 >> i3) & 31;
        if (i4 == i5) {
            return new o000O0O0<>(0, 1 << i4, new Object[]{OooOO0o(i, k, v, i2, k2, v2, i3 + 5, o000o0o1)}, o000o0o1);
        }
        Object[] objArr = new Object[4];
        if (i4 < i5) {
            objArr[0] = k;
            objArr[1] = v;
            objArr[2] = k2;
            objArr[3] = v2;
        } else {
            objArr[0] = k2;
            objArr[1] = v2;
            objArr[2] = k;
            objArr[3] = v;
        }
        return new o000O0O0<>((1 << i4) | (1 << i5), 0, objArr, o000o0o1);
    }

    @NotNull
    public final o000O0O0<K, V> OooOOO(int i, K k, V v, int i2, @NotNull o0000O0<K, V> mutator) {
        o000O0O0<K, V> o000o0o0OooOOO;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int i3 = 1 << ((i >> i2) & 31);
        if (OooOO0(i3)) {
            int iOooO0oo = OooO0oo(i3);
            if (!Intrinsics.areEqual(k, this.f3752OooO0Oo[iOooO0oo])) {
                mutator.OooO0O0(mutator.size() + 1);
                p042Ooooo0o.o000O0O0 o000o0o1 = mutator.f3724Oooo0oO;
                if (this.f3751OooO0OO != o000o0o1) {
                    return new o000O0O0<>(this.f3749OooO00o ^ i3, this.f3750OooO0O0 | i3, OooO0O0(iOooO0oo, i3, i, k, v, i2, o000o0o1), o000o0o1);
                }
                this.f3752OooO0Oo = OooO0O0(iOooO0oo, i3, i, k, v, i2, o000o0o1);
                this.f3749OooO00o ^= i3;
                this.f3750OooO0O0 |= i3;
                return this;
            }
            mutator.f3722Oooo = OooOoO(iOooO0oo);
            if (OooOoO(iOooO0oo) == v) {
                return this;
            }
            if (this.f3751OooO0OO == mutator.f3724Oooo0oO) {
                this.f3752OooO0Oo[iOooO0oo + 1] = v;
                return this;
            }
            mutator.f3727OoooO00++;
            Object[] objArr = this.f3752OooO0Oo;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iOooO0oo + 1] = v;
            return new o000O0O0<>(this.f3749OooO00o, this.f3750OooO0O0, objArrCopyOf, mutator.f3724Oooo0oO);
        }
        if (!OooOO0O(i3)) {
            mutator.OooO0O0(mutator.size() + 1);
            p042Ooooo0o.o000O0O0 o000o0o2 = mutator.f3724Oooo0oO;
            int iOooO0oo2 = OooO0oo(i3);
            if (this.f3751OooO0OO != o000o0o2) {
                return new o000O0O0<>(this.f3749OooO00o | i3, this.f3750OooO0O0, o00.OooO00o(this.f3752OooO0Oo, iOooO0oo2, k, v), o000o0o2);
            }
            this.f3752OooO0Oo = o00.OooO00o(this.f3752OooO0Oo, iOooO0oo2, k, v);
            this.f3749OooO00o |= i3;
            return this;
        }
        int iOooOo0O = OooOo0O(i3);
        o000O0O0<K, V> o000o0o0OooOo0 = OooOo0(iOooOo0O);
        if (i2 == 30) {
            IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, o000o0o0OooOo0.f3752OooO0Oo.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
                mutator.OooO0O0(mutator.size() + 1);
                o000o0o0OooOOO = new o000O0O0<>(0, 0, o00.OooO00o(o000o0o0OooOo0.f3752OooO0Oo, 0, k, v), mutator.f3724Oooo0oO);
            } else {
                while (true) {
                    if (!Intrinsics.areEqual(k, o000o0o0OooOo0.f3752OooO0Oo[first])) {
                        if (first == last) {
                            break;
                        }
                        first += step;
                    } else {
                        mutator.f3722Oooo = o000o0o0OooOo0.OooOoO(first);
                        if (o000o0o0OooOo0.f3751OooO0OO == mutator.f3724Oooo0oO) {
                            o000o0o0OooOo0.f3752OooO0Oo[first + 1] = v;
                            o000o0o0OooOOO = o000o0o0OooOo0;
                        } else {
                            mutator.f3727OoooO00++;
                            Object[] objArr2 = o000o0o0OooOo0.f3752OooO0Oo;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, size)");
                            objArrCopyOf2[first + 1] = v;
                            o000o0o0OooOOO = new o000O0O0<>(0, 0, objArrCopyOf2, mutator.f3724Oooo0oO);
                        }
                    }
                }
                mutator.OooO0O0(mutator.size() + 1);
                o000o0o0OooOOO = new o000O0O0<>(0, 0, o00.OooO00o(o000o0o0OooOo0.f3752OooO0Oo, 0, k, v), mutator.f3724Oooo0oO);
            }
        } else {
            o000o0o0OooOOO = o000o0o0OooOo0.OooOOO(i, k, v, i2 + 5, mutator);
        }
        return o000o0o0OooOo0 == o000o0o0OooOOO ? this : OooOo00(iOooOo0O, o000o0o0OooOOO, mutator.f3724Oooo0oO);
    }

    public final o000O0O0<K, V> OooOOO0(int i, o0000O0<K, V> o0000o1) {
        o0000o1.OooO0O0(o0000o1.size() - 1);
        o0000o1.f3722Oooo = OooOoO(i);
        Object[] objArr = this.f3752OooO0Oo;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f3751OooO0OO != o0000o1.f3724Oooo0oO) {
            return new o000O0O0<>(0, 0, o00.OooO0O0(objArr, i), o0000o1.f3724Oooo0oO);
        }
        this.f3752OooO0Oo = o00.OooO0O0(objArr, i);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [OoooOoO.o000O0O0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [OoooOoO.o000O0O0] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v28, types: [OoooOoO.o000O0O0] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v43 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    /* JADX WARN: Type inference failed for: r24v0, types: [OoooOoO.o000O0O0, OoooOoO.o000O0O0<K, V>] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [OoooOoO.o000O0O0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @NotNull
    public final o000O0O0<K, V> OooOOOO(@NotNull o000O0O0<K, V> otherNode, int i, @NotNull o000O00O intersectionCounter, @NotNull o0000O0<K, V> mutator) {
        ?? o000o0o1;
        ?? r19;
        ?? OooOO0o2;
        ?? OooOo1;
        int iHashCode;
        int iHashCode2;
        ?? OooOOOO2;
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionCounter, "intersectionCounter");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        if (this == otherNode) {
            intersectionCounter.f3773OooO00o += OooO0OO();
            return this;
        }
        if (i > 30) {
            p042Ooooo0o.o000O0O0 o000o0o2 = mutator.f3724Oooo0oO;
            int i2 = otherNode.f3750OooO0O0;
            Object[] objArr = this.f3752OooO0Oo;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + otherNode.f3752OooO0Oo.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            int length = this.f3752OooO0Oo.length;
            IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, otherNode.f3752OooO0Oo.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    if (OooO0Oo(otherNode.f3752OooO0Oo[first])) {
                        intersectionCounter.f3773OooO00o++;
                    } else {
                        Object[] objArr2 = otherNode.f3752OooO0Oo;
                        objArrCopyOf[length] = objArr2[first];
                        objArrCopyOf[length + 1] = objArr2[first + 1];
                        length += 2;
                    }
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
            if (length == this.f3752OooO0Oo.length) {
                return this;
            }
            if (length == otherNode.f3752OooO0Oo.length) {
                return otherNode;
            }
            if (length == objArrCopyOf.length) {
                return new o000O0O0<>(0, 0, objArrCopyOf, o000o0o2);
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
            return new o000O0O0<>(0, 0, objArrCopyOf2, o000o0o2);
        }
        int i3 = this.f3750OooO0O0 | otherNode.f3750OooO0O0;
        int i4 = this.f3749OooO00o;
        int i5 = otherNode.f3749OooO00o;
        int i6 = (i4 ^ i5) & (~i3);
        int i7 = i4 & i5;
        int i8 = i6;
        while (i7 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i7);
            if (Intrinsics.areEqual(this.f3752OooO0Oo[OooO0oo(iLowestOneBit)], otherNode.f3752OooO0Oo[otherNode.OooO0oo(iLowestOneBit)])) {
                i8 |= iLowestOneBit;
            } else {
                i3 |= iLowestOneBit;
            }
            i7 ^= iLowestOneBit;
        }
        if (!((i3 & i8) == 0)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (Intrinsics.areEqual(this.f3751OooO0OO, mutator.f3724Oooo0oO) && this.f3749OooO00o == i8 && this.f3750OooO0O0 == i3) {
            o000o0o1 = this;
        } else {
            o000o0o1 = new o000O0O0(i8, i3, new Object[Integer.bitCount(i3) + (Integer.bitCount(i8) * 2)]);
        }
        int i9 = i3;
        int i10 = 0;
        ?? r7 = o000o0o1;
        while (i9 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i9);
            Object[] objArr3 = r7.f3752OooO0Oo;
            int length2 = (objArr3.length - 1) - i10;
            if (OooOO0O(iLowestOneBit2)) {
                ?? OooOo2 = OooOo0(OooOo0O(iLowestOneBit2));
                if (otherNode.OooOO0O(iLowestOneBit2)) {
                    OooOOOO2 = OooOo2.OooOOOO(otherNode.OooOo0(otherNode.OooOo0O(iLowestOneBit2)), i + 5, intersectionCounter, mutator);
                } else if (otherNode.OooOO0(iLowestOneBit2)) {
                    int iOooO0oo = otherNode.OooO0oo(iLowestOneBit2);
                    Object obj = otherNode.f3752OooO0Oo[iOooO0oo];
                    V vOooOoO = otherNode.OooOoO(iOooO0oo);
                    int size = mutator.size();
                    if (obj != null) {
                        OooOOOO2 = OooOo2;
                        iHashCode2 = obj.hashCode();
                    } else {
                        OooOOOO2 = OooOo2;
                        iHashCode2 = 0;
                    }
                    Object[] objArr4 = objArr3;
                    o000O0O0 o000o0o0OooOOO = OooOo2.OooOOO(iHashCode2, obj, vOooOoO, i + 5, mutator);
                    OooOO0o2 = o000o0o0OooOOO;
                    r19 = objArr4;
                    if (mutator.size() == size) {
                        intersectionCounter.f3773OooO00o++;
                        OooOO0o2 = o000o0o0OooOOO;
                        r19 = objArr4;
                    }
                }
                OooOOOO2 = OooOo2;
                r19 = objArr3;
                OooOO0o2 = OooOOOO2;
            } else {
                r19 = objArr3;
                if (otherNode.OooOO0O(iLowestOneBit2)) {
                    OooOo1 = otherNode.OooOo0(otherNode.OooOo0O(iLowestOneBit2));
                    if (OooOO0(iLowestOneBit2)) {
                        int iOooO0oo2 = OooO0oo(iLowestOneBit2);
                        Object obj2 = this.f3752OooO0Oo[iOooO0oo2];
                        if (obj2 != null) {
                            OooOO0o2 = OooOo1;
                            r19 = r19;
                            iHashCode = obj2.hashCode();
                        } else {
                            OooOO0o2 = OooOo1;
                            r19 = r19;
                            iHashCode = 0;
                        }
                        int i11 = i + 5;
                        if (OooOo1.OooO0o0(iHashCode, obj2, i11)) {
                            intersectionCounter.f3773OooO00o++;
                            OooOO0o2 = OooOo1;
                            r19 = r19;
                        } else {
                            OooOO0o2 = OooOo1.OooOOO(obj2 != null ? obj2.hashCode() : 0, obj2, OooOoO(iOooO0oo2), i11, mutator);
                            r19 = r19;
                        }
                    }
                } else {
                    int iOooO0oo3 = OooO0oo(iLowestOneBit2);
                    Object obj3 = this.f3752OooO0Oo[iOooO0oo3];
                    Object objOooOoO = OooOoO(iOooO0oo3);
                    int iOooO0oo4 = otherNode.OooO0oo(iLowestOneBit2);
                    Object obj4 = otherNode.f3752OooO0Oo[iOooO0oo4];
                    OooOO0o2 = OooOO0o(obj3 != null ? obj3.hashCode() : 0, obj3, objOooOoO, obj4 != null ? obj4.hashCode() : 0, obj4, otherNode.OooOoO(iOooO0oo4), i + 5, mutator.f3724Oooo0oO);
                }
                r19[length2] = OooOO0o2;
                i10++;
                i9 ^= iLowestOneBit2;
                r7 = r7;
                i8 = i8;
            }
            OooOO0o2 = OooOo1;
            r19 = r19;
            r19[length2] = OooOO0o2;
            i10++;
            i9 ^= iLowestOneBit2;
            r7 = r7;
            i8 = i8;
        }
        o000O0O0<K, V> o000o0o3 = (o000O0O0<K, V>) r7;
        int i12 = 0;
        while (i8 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i8);
            int i13 = i12 * 2;
            if (otherNode.OooOO0(iLowestOneBit3)) {
                int iOooO0oo5 = otherNode.OooO0oo(iLowestOneBit3);
                Object[] objArr5 = o000o0o3.f3752OooO0Oo;
                objArr5[i13] = otherNode.f3752OooO0Oo[iOooO0oo5];
                objArr5[i13 + 1] = otherNode.OooOoO(iOooO0oo5);
                if (OooOO0(iLowestOneBit3)) {
                    intersectionCounter.f3773OooO00o++;
                }
            } else {
                int iOooO0oo6 = OooO0oo(iLowestOneBit3);
                Object[] objArr6 = o000o0o3.f3752OooO0Oo;
                objArr6[i13] = this.f3752OooO0Oo[iOooO0oo6];
                objArr6[i13 + 1] = OooOoO(iOooO0oo6);
            }
            i12++;
            i8 ^= iLowestOneBit3;
        }
        if (OooO0o(o000o0o3)) {
            return this;
        }
        return otherNode.OooO0o(o000o0o3) ? otherNode : o000o0o3;
    }

    @Nullable
    public final o000O0O0<K, V> OooOOOo(int i, K k, int i2, @NotNull o0000O0<K, V> mutator) {
        o000O0O0<K, V> o000o0o0OooOOOo;
        o000O0O0<K, V> o000o0o1;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int i3 = 1 << ((i >> i2) & 31);
        if (OooOO0(i3)) {
            int iOooO0oo = OooO0oo(i3);
            return Intrinsics.areEqual(k, this.f3752OooO0Oo[iOooO0oo]) ? OooOOo(iOooO0oo, i3, mutator) : this;
        }
        if (!OooOO0O(i3)) {
            return this;
        }
        int iOooOo0O = OooOo0O(i3);
        o000O0O0<K, V> o000o0o0OooOo0 = OooOo0(iOooOo0O);
        if (i2 == 30) {
            IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, o000o0o0OooOo0.f3752OooO0Oo.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    if (Intrinsics.areEqual(k, o000o0o0OooOo0.f3752OooO0Oo[first])) {
                        o000o0o0OooOOOo = o000o0o0OooOo0.OooOOO0(first, mutator);
                    } else if (first != last) {
                        first += step;
                    }
                }
            }
            o000o0o1 = o000o0o0OooOo0;
            return OooOOoo(o000o0o0OooOo0, o000o0o1, iOooOo0O, i3, mutator.f3724Oooo0oO);
        }
        o000o0o0OooOOOo = o000o0o0OooOo0.OooOOOo(i, k, i2 + 5, mutator);
        o000o0o1 = o000o0o0OooOOOo;
        return OooOOoo(o000o0o0OooOo0, o000o0o1, iOooOo0O, i3, mutator.f3724Oooo0oO);
    }

    public final o000O0O0<K, V> OooOOo(int i, int i2, o0000O0<K, V> o0000o1) {
        o0000o1.OooO0O0(o0000o1.size() - 1);
        o0000o1.f3722Oooo = OooOoO(i);
        Object[] objArr = this.f3752OooO0Oo;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f3751OooO0OO != o0000o1.f3724Oooo0oO) {
            return new o000O0O0<>(i2 ^ this.f3749OooO00o, this.f3750OooO0O0, o00.OooO0O0(objArr, i), o0000o1.f3724Oooo0oO);
        }
        this.f3752OooO0Oo = o00.OooO0O0(objArr, i);
        this.f3749OooO00o ^= i2;
        return this;
    }

    @Nullable
    public final o000O0O0<K, V> OooOOo0(int i, K k, V v, int i2, @NotNull o0000O0<K, V> mutator) {
        o000O0O0<K, V> o000o0o0OooOOo0;
        o000O0O0<K, V> o000o0o1;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int i3 = 1 << ((i >> i2) & 31);
        if (OooOO0(i3)) {
            int iOooO0oo = OooO0oo(i3);
            return (Intrinsics.areEqual(k, this.f3752OooO0Oo[iOooO0oo]) && Intrinsics.areEqual(v, OooOoO(iOooO0oo))) ? OooOOo(iOooO0oo, i3, mutator) : this;
        }
        if (!OooOO0O(i3)) {
            return this;
        }
        int iOooOo0O = OooOo0O(i3);
        o000O0O0<K, V> o000o0o0OooOo0 = OooOo0(iOooOo0O);
        if (i2 == 30) {
            IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, o000o0o0OooOo0.f3752OooO0Oo.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    if (Intrinsics.areEqual(k, o000o0o0OooOo0.f3752OooO0Oo[first]) && Intrinsics.areEqual(v, o000o0o0OooOo0.OooOoO(first))) {
                        o000o0o0OooOOo0 = o000o0o0OooOo0.OooOOO0(first, mutator);
                    } else if (first != last) {
                        first += step;
                    }
                }
            }
            o000o0o1 = o000o0o0OooOo0;
            return OooOOoo(o000o0o0OooOo0, o000o0o1, iOooOo0O, i3, mutator.f3724Oooo0oO);
        }
        o000o0o0OooOOo0 = o000o0o0OooOo0.OooOOo0(i, k, v, i2 + 5, mutator);
        o000o0o1 = o000o0o0OooOOo0;
        return OooOOoo(o000o0o0OooOo0, o000o0o1, iOooOo0O, i3, mutator.f3724Oooo0oO);
    }

    public final o000O0O0<K, V> OooOOoo(o000O0O0<K, V> o000o0o1, o000O0O0<K, V> o000o0o2, int i, int i2, p042Ooooo0o.o000O0O0 o000o0o3) {
        if (o000o0o2 == null) {
            Object[] objArr = this.f3752OooO0Oo;
            if (objArr.length == 1) {
                return null;
            }
            if (this.f3751OooO0OO != o000o0o3) {
                return new o000O0O0<>(this.f3749OooO00o, i2 ^ this.f3750OooO0O0, o00.OooO0OO(objArr, i), o000o0o3);
            }
            this.f3752OooO0Oo = o00.OooO0OO(objArr, i);
            this.f3750OooO0O0 ^= i2;
        } else if (this.f3751OooO0OO == o000o0o3 || o000o0o1 != o000o0o2) {
            return OooOo00(i, o000o0o2, o000o0o3);
        }
        return this;
    }

    @Nullable
    public final o000O0O0<K, V> OooOo(int i, K k, int i2) {
        o000O0O0<K, V> o000o0o0OooOo;
        int i3 = 1 << ((i >> i2) & 31);
        if (OooOO0(i3)) {
            int iOooO0oo = OooO0oo(i3);
            if (!Intrinsics.areEqual(k, this.f3752OooO0Oo[iOooO0oo])) {
                return this;
            }
            Object[] objArr = this.f3752OooO0Oo;
            if (objArr.length == 2) {
                return null;
            }
            return new o000O0O0<>(this.f3749OooO00o ^ i3, this.f3750OooO0O0, o00.OooO0O0(objArr, iOooO0oo));
        }
        if (!OooOO0O(i3)) {
            return this;
        }
        int iOooOo0O = OooOo0O(i3);
        o000O0O0<K, V> o000o0o0OooOo0 = OooOo0(iOooOo0O);
        if (i2 == 30) {
            IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, o000o0o0OooOo0.f3752OooO0Oo.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    if (!Intrinsics.areEqual(k, o000o0o0OooOo0.f3752OooO0Oo[first])) {
                        if (first == last) {
                            o000o0o0OooOo = o000o0o0OooOo0;
                            break;
                        }
                        first += step;
                    } else {
                        Object[] objArr2 = o000o0o0OooOo0.f3752OooO0Oo;
                        if (objArr2.length != 2) {
                            o000o0o0OooOo = new o000O0O0<>(0, 0, o00.OooO0O0(objArr2, first));
                            break;
                        }
                        o000o0o0OooOo = null;
                        break;
                    }
                }
            } else {
                o000o0o0OooOo = o000o0o0OooOo0;
                break;
            }
        } else {
            o000o0o0OooOo = o000o0o0OooOo0.OooOo(i, k, i2 + 5);
        }
        if (o000o0o0OooOo != null) {
            return o000o0o0OooOo0 != o000o0o0OooOo ? OooOoO0(iOooOo0O, i3, o000o0o0OooOo) : this;
        }
        Object[] objArr3 = this.f3752OooO0Oo;
        if (objArr3.length == 1) {
            return null;
        }
        return new o000O0O0<>(this.f3749OooO00o, this.f3750OooO0O0 ^ i3, o00.OooO0OO(objArr3, iOooOo0O));
    }

    @NotNull
    public final o000O0O0<K, V> OooOo0(int i) {
        Object obj = this.f3752OooO0Oo[i];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (o000O0O0) obj;
    }

    public final o000O0O0<K, V> OooOo00(int i, o000O0O0<K, V> o000o0o1, p042Ooooo0o.o000O0O0 o000o0o2) {
        Object[] objArr = this.f3752OooO0Oo;
        if (objArr.length == 1 && o000o0o1.f3752OooO0Oo.length == 2 && o000o0o1.f3750OooO0O0 == 0) {
            o000o0o1.f3749OooO00o = this.f3750OooO0O0;
            return o000o0o1;
        }
        if (this.f3751OooO0OO == o000o0o2) {
            objArr[i] = o000o0o1;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[i] = o000o0o1;
        return new o000O0O0<>(this.f3749OooO00o, this.f3750OooO0O0, objArrCopyOf, o000o0o2);
    }

    public final int OooOo0O(int i) {
        return (this.f3752OooO0Oo.length - 1) - Integer.bitCount((i - 1) & this.f3750OooO0O0);
    }

    @Nullable
    public final OooO0O0<K, V> OooOo0o(int i, K k, V v, int i2) {
        OooO0O0<K, V> oooO0O0OooOo0o;
        int i3 = 1 << ((i >> i2) & 31);
        if (OooOO0(i3)) {
            int iOooO0oo = OooO0oo(i3);
            if (!Intrinsics.areEqual(k, this.f3752OooO0Oo[iOooO0oo])) {
                return new o000O0O0(this.f3749OooO00o ^ i3, this.f3750OooO0O0 | i3, OooO0O0(iOooO0oo, i3, i, k, v, i2, null)).OooO00o();
            }
            if (OooOoO(iOooO0oo) == v) {
                return null;
            }
            Object[] objArr = this.f3752OooO0Oo;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iOooO0oo + 1] = v;
            return new OooO0O0<>(new o000O0O0(this.f3749OooO00o, this.f3750OooO0O0, objArrCopyOf), 0);
        }
        if (!OooOO0O(i3)) {
            return new o000O0O0(this.f3749OooO00o | i3, this.f3750OooO0O0, o00.OooO00o(this.f3752OooO0Oo, OooO0oo(i3), k, v)).OooO00o();
        }
        int iOooOo0O = OooOo0O(i3);
        o000O0O0<K, V> o000o0o0OooOo0 = OooOo0(iOooOo0O);
        if (i2 == 30) {
            IntProgression intProgressionStep = RangesKt.step(RangesKt.until(0, o000o0o0OooOo0.f3752OooO0Oo.length), 2);
            int first = intProgressionStep.getFirst();
            int last = intProgressionStep.getLast();
            int step = intProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    if (!Intrinsics.areEqual(k, o000o0o0OooOo0.f3752OooO0Oo[first])) {
                        if (first == last) {
                            oooO0O0OooOo0o = new o000O0O0(0, 0, o00.OooO00o(o000o0o0OooOo0.f3752OooO0Oo, 0, k, v)).OooO00o();
                            break;
                        }
                        first += step;
                    } else {
                        if (v != o000o0o0OooOo0.OooOoO(first)) {
                            Object[] objArr2 = o000o0o0OooOo0.f3752OooO0Oo;
                            Object[] objArrCopyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                            Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, size)");
                            objArrCopyOf2[first + 1] = v;
                            oooO0O0OooOo0o = new OooO0O0<>(new o000O0O0(0, 0, objArrCopyOf2), 0);
                            break;
                        }
                        oooO0O0OooOo0o = null;
                        break;
                    }
                }
            } else {
                oooO0O0OooOo0o = new o000O0O0(0, 0, o00.OooO00o(o000o0o0OooOo0.f3752OooO0Oo, 0, k, v)).OooO00o();
                break;
            }
            if (oooO0O0OooOo0o == null) {
                return null;
            }
        } else {
            oooO0O0OooOo0o = o000o0o0OooOo0.OooOo0o(i, k, v, i2 + 5);
            if (oooO0O0OooOo0o == null) {
                return null;
            }
        }
        o000O0O0<K, V> o000o0o0OooOoO0 = OooOoO0(iOooOo0O, i3, oooO0O0OooOo0o.f3753OooO00o);
        Intrinsics.checkNotNullParameter(o000o0o0OooOoO0, "<set-?>");
        oooO0O0OooOo0o.f3753OooO00o = o000o0o0OooOoO0;
        return oooO0O0OooOo0o;
    }

    public final V OooOoO(int i) {
        return (V) this.f3752OooO0Oo[i + 1];
    }

    public final o000O0O0<K, V> OooOoO0(int i, int i2, o000O0O0<K, V> o000o0o1) {
        Object[] objArr = o000o0o1.f3752OooO0Oo;
        if (objArr.length != 2 || o000o0o1.f3750OooO0O0 != 0) {
            Object[] objArr2 = this.f3752OooO0Oo;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[i] = o000o0o1;
            return new o000O0O0<>(this.f3749OooO00o, this.f3750OooO0O0, objArrCopyOf);
        }
        if (this.f3752OooO0Oo.length == 1) {
            o000o0o1.f3749OooO00o = this.f3750OooO0O0;
            return o000o0o1;
        }
        int iOooO0oo = OooO0oo(i2);
        Object[] objArr3 = this.f3752OooO0Oo;
        Object obj = objArr[0];
        Object obj2 = objArr[1];
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr3, objArr3.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
        ArraysKt.copyInto(objArrCopyOf2, objArrCopyOf2, i + 2, i + 1, objArr3.length);
        ArraysKt.copyInto(objArrCopyOf2, objArrCopyOf2, iOooO0oo + 2, iOooO0oo, i);
        objArrCopyOf2[iOooO0oo] = obj;
        objArrCopyOf2[iOooO0oo + 1] = obj2;
        return new o000O0O0<>(this.f3749OooO00o ^ i2, i2 ^ this.f3750OooO0O0, objArrCopyOf2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o000O0O0(int i, int i2, @NotNull Object[] buffer) {
        this(i, i2, buffer, null);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }
}
