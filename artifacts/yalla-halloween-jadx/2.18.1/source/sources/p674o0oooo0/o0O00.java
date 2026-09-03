package p674o0oooo0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.UByte;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00 extends AbstractList<ByteString> implements RandomAccess {

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f52039Oooo0oo = new OooO00o();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final ByteString[] f52040Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final int[] f52041Oooo0oO;

    public static final class OooO00o {
        public final void OooO00o(long j, o0oOO o0ooo2, int i, List<? extends ByteString> list, int i2, int i3, List<Integer> list2) throws IOException {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = i;
            if (!(i2 < i3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i9 = i2; i9 < i3; i9++) {
                if (!(list.get(i9).OooO0o0() >= i8)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = list.get(i2);
            ByteString byteString2 = list.get(i3 - 1);
            if (i8 == byteString.OooO0o0()) {
                int iIntValue = list2.get(i2).intValue();
                int i10 = i2 + 1;
                ByteString byteString3 = list.get(i10);
                i4 = i10;
                i5 = iIntValue;
                byteString = byteString3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (byteString.OooO0oo(i8) == byteString2.OooO0oo(i8)) {
                int iMin = Math.min(byteString.OooO0o0(), byteString2.OooO0o0());
                int i11 = 0;
                for (int i12 = i8; i12 < iMin && byteString.OooO0oo(i12) == byteString2.OooO0oo(i12); i12++) {
                    i11++;
                }
                long j2 = 4;
                long j3 = (o0ooo2.f52099Oooo0oO / j2) + j + ((long) 2) + ((long) i11) + 1;
                o0ooo2.o0OoOo0(-i11);
                o0ooo2.o0OoOo0(i5);
                int i13 = i8 + i11;
                while (i8 < i13) {
                    o0ooo2.o0OoOo0(byteString.OooO0oo(i8) & UByte.MAX_VALUE);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (!(i13 == list.get(i4).OooO0o0())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    o0ooo2.o0OoOo0(list2.get(i4).intValue());
                    return;
                } else {
                    o0oOO o0ooo3 = new o0oOO();
                    o0ooo2.o0OoOo0(((int) ((o0ooo3.f52099Oooo0oO / j2) + j3)) * (-1));
                    OooO00o(j3, o0ooo3, i13, list, i4, i3, list2);
                    o0ooo2.o0ooOOo(o0ooo3);
                    return;
                }
            }
            int i14 = 1;
            for (int i15 = i4 + 1; i15 < i3; i15++) {
                if (list.get(i15 - 1).OooO0oo(i8) != list.get(i15).OooO0oo(i8)) {
                    i14++;
                }
            }
            long j4 = 4;
            long j5 = ((long) (i14 * 2)) + (o0ooo2.f52099Oooo0oO / j4) + j + ((long) 2);
            o0ooo2.o0OoOo0(i14);
            o0ooo2.o0OoOo0(i5);
            for (int i16 = i4; i16 < i3; i16++) {
                byte bOooO0oo = list.get(i16).OooO0oo(i8);
                if (i16 == i4 || bOooO0oo != list.get(i16 - 1).OooO0oo(i8)) {
                    o0ooo2.o0OoOo0(bOooO0oo & UByte.MAX_VALUE);
                }
            }
            o0oOO o0ooo4 = new o0oOO();
            while (i4 < i3) {
                byte bOooO0oo2 = list.get(i4).OooO0oo(i8);
                int i17 = i4 + 1;
                int i18 = i17;
                while (true) {
                    if (i18 >= i3) {
                        i6 = i3;
                        break;
                    } else {
                        if (bOooO0oo2 != list.get(i18).OooO0oo(i8)) {
                            i6 = i18;
                            break;
                        }
                        i18++;
                    }
                }
                if (i17 == i6 && i8 + 1 == list.get(i4).OooO0o0()) {
                    o0ooo2.o0OoOo0(list2.get(i4).intValue());
                    i7 = i6;
                } else {
                    o0ooo2.o0OoOo0(((int) ((o0ooo4.f52099Oooo0oO / j4) + j5)) * (-1));
                    i7 = i6;
                    OooO00o(j5, o0ooo4, i8 + 1, list, i4, i7, list2);
                }
                o0ooo4 = o0ooo4;
                i4 = i7;
                j4 = j4;
                j5 = j5;
            }
            o0ooo2.o0ooOOo(o0ooo4);
        }

        @JvmStatic
        @NotNull
        public final o0O00 OooO0O0(@NotNull ByteString... byteStrings) throws IOException {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            int i = 0;
            if (byteStrings.length == 0) {
                return new o0O00(new ByteString[0], new int[]{0, -1});
            }
            List<? extends ByteString> mutableList = ArraysKt.toMutableList(byteStrings);
            CollectionsKt.sort(mutableList);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            for (ByteString byteString : byteStrings) {
                arrayList.add(-1);
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Integer[] numArr = (Integer[]) array;
            List<Integer> listMutableListOf = CollectionsKt.mutableListOf((Integer[]) Arrays.copyOf(numArr, numArr.length));
            int length = byteStrings.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                listMutableListOf.set(CollectionsKt__CollectionsKt.binarySearch$default(mutableList, byteStrings[i2], 0, 0, 6, (Object) null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (!(mutableList.get(0).OooO0o0() > 0)) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i4 = 0;
            while (i4 < mutableList.size()) {
                ByteString prefix = mutableList.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < mutableList.size()) {
                    ByteString byteString2 = mutableList.get(i6);
                    Objects.requireNonNull(byteString2);
                    Intrinsics.checkNotNullParameter(prefix, "prefix");
                    if (!byteString2.OooOO0O(prefix, prefix.OooO0o0())) {
                        break;
                    }
                    if (!(byteString2.OooO0o0() != prefix.OooO0o0())) {
                        throw new IllegalArgumentException(("duplicate option: " + byteString2).toString());
                    }
                    if (listMutableListOf.get(i6).intValue() > listMutableListOf.get(i4).intValue()) {
                        mutableList.remove(i6);
                        listMutableListOf.remove(i6);
                    } else {
                        i6++;
                    }
                }
                i4 = i5;
            }
            o0oOO o0ooo2 = new o0oOO();
            OooO00o(0L, o0ooo2, 0, mutableList, 0, mutableList.size(), listMutableListOf);
            int[] iArr = new int[(int) (o0ooo2.f52099Oooo0oO / ((long) 4))];
            while (!o0ooo2.OooOooo()) {
                iArr[i] = o0ooo2.readInt();
                i++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "java.util.Arrays.copyOf(this, size)");
            return new o0O00((ByteString[]) objArrCopyOf, iArr);
        }
    }

    public o0O00(ByteString[] byteStringArr, int[] iArr) {
        this.f52040Oooo0o = byteStringArr;
        this.f52041Oooo0oO = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ByteString) {
            return super.contains((ByteString) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f52040Oooo0o[i];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        return this.f52040Oooo0o.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.indexOf((ByteString) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof ByteString) {
            return super.lastIndexOf((ByteString) obj);
        }
        return -1;
    }
}
