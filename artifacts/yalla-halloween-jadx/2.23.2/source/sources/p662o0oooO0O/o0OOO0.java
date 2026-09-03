package p662o0oooO0O;

import androidx.camera.core.impl.o00O;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class o0OOO0 extends AbstractList<ByteString> implements RandomAccess {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f59781OooO0o = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ByteString[] f59782OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final int[] f59783OooO0o0;

    public static final class OooO00o {
        public static void OooO00o(long j, oo0OOoo oo0oooo, int i, List list, int i2, int i3, List list2) throws IOException {
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = i;
            if (!(i2 < i3)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            for (int i9 = i2; i9 < i3; i9++) {
                if (!(((ByteString) list.get(i9)).OooO0o0() >= i8)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            ByteString byteString = (ByteString) list.get(i2);
            ByteString byteString2 = (ByteString) list.get(i3 - 1);
            int i10 = -1;
            if (i8 == byteString.OooO0o0()) {
                int iIntValue = ((Number) list2.get(i2)).intValue();
                int i11 = i2 + 1;
                ByteString byteString3 = (ByteString) list.get(i11);
                i4 = i11;
                i5 = iIntValue;
                byteString = byteString3;
            } else {
                i4 = i2;
                i5 = -1;
            }
            if (byteString.OooOO0(i8) == byteString2.OooOO0(i8)) {
                int iMin = Math.min(byteString.OooO0o0(), byteString2.OooO0o0());
                int i12 = 0;
                for (int i13 = i8; i13 < iMin && byteString.OooOO0(i13) == byteString2.OooOO0(i13); i13++) {
                    i12++;
                }
                long j2 = 4;
                long j3 = (oo0oooo.f59828OooO0o0 / j2) + j + ((long) 2) + ((long) i12) + 1;
                oo0oooo.oo0o0Oo(-i12);
                oo0oooo.oo0o0Oo(i5);
                int i14 = i8 + i12;
                while (i8 < i14) {
                    oo0oooo.oo0o0Oo(byteString.OooOO0(i8) & 255);
                    i8++;
                }
                if (i4 + 1 == i3) {
                    if (!(i14 == ((ByteString) list.get(i4)).OooO0o0())) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    oo0oooo.oo0o0Oo(((Number) list2.get(i4)).intValue());
                    return;
                } else {
                    oo0OOoo oo0oooo2 = new oo0OOoo();
                    oo0oooo.oo0o0Oo(((int) ((oo0oooo2.f59828OooO0o0 / j2) + j3)) * (-1));
                    OooO00o(j3, oo0oooo2, i14, list, i4, i3, list2);
                    oo0oooo.o00Oo0(oo0oooo2);
                    return;
                }
            }
            int i15 = 1;
            for (int i16 = i4 + 1; i16 < i3; i16++) {
                if (((ByteString) list.get(i16 - 1)).OooOO0(i8) != ((ByteString) list.get(i16)).OooOO0(i8)) {
                    i15++;
                }
            }
            long j4 = 4;
            long j5 = ((long) (i15 * 2)) + (oo0oooo.f59828OooO0o0 / j4) + j + ((long) 2);
            oo0oooo.oo0o0Oo(i15);
            oo0oooo.oo0o0Oo(i5);
            for (int i17 = i4; i17 < i3; i17++) {
                int iOooOO0 = ((ByteString) list.get(i17)).OooOO0(i8);
                if (i17 == i4 || iOooOO0 != ((ByteString) list.get(i17 - 1)).OooOO0(i8)) {
                    oo0oooo.oo0o0Oo(iOooOO0 & 255);
                }
            }
            oo0OOoo oo0oooo3 = new oo0OOoo();
            while (i4 < i3) {
                byte bOooOO0 = ((ByteString) list.get(i4)).OooOO0(i8);
                int i18 = i4 + 1;
                int i19 = i18;
                while (true) {
                    if (i19 >= i3) {
                        i6 = i3;
                        break;
                    } else {
                        if (bOooOO0 != ((ByteString) list.get(i19)).OooOO0(i8)) {
                            i6 = i19;
                            break;
                        }
                        i19++;
                    }
                }
                if (i18 == i6 && i8 + 1 == ((ByteString) list.get(i4)).OooO0o0()) {
                    oo0oooo.oo0o0Oo(((Number) list2.get(i4)).intValue());
                    i7 = i6;
                } else {
                    oo0oooo.oo0o0Oo(((int) ((oo0oooo3.f59828OooO0o0 / j4) + j5)) * i10);
                    i7 = i6;
                    OooO00o(j5, oo0oooo3, i8 + 1, list, i4, i7, list2);
                }
                oo0oooo3 = oo0oooo3;
                i4 = i7;
                j4 = j4;
                i10 = -1;
            }
            oo0oooo.o00Oo0(oo0oooo3);
        }

        @JvmStatic
        @NotNull
        public static o0OOO0 OooO0O0(@NotNull ByteString... byteStrings) throws IOException {
            Intrinsics.checkNotNullParameter(byteStrings, "byteStrings");
            int i = 0;
            if (byteStrings.length == 0) {
                return new o0OOO0(new ByteString[0], new int[]{0, -1});
            }
            List mutableList = ArraysKt.toMutableList(byteStrings);
            CollectionsKt.sort(mutableList);
            ArrayList arrayList = new ArrayList(byteStrings.length);
            int length = byteStrings.length;
            for (int iOooO00o = 0; iOooO00o < length; iOooO00o = o00O.OooO00o(-1, arrayList, iOooO00o, 1)) {
                ByteString byteString = byteStrings[iOooO00o];
            }
            Object[] array = arrayList.toArray(new Integer[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Integer[] numArr = (Integer[]) array;
            List listMutableListOf = CollectionsKt.mutableListOf(Arrays.copyOf(numArr, numArr.length));
            int length2 = byteStrings.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length2) {
                listMutableListOf.set(CollectionsKt__CollectionsKt.binarySearch$default(mutableList, byteStrings[i2], 0, 0, 6, (Object) null), Integer.valueOf(i3));
                i2++;
                i3++;
            }
            if (!(((ByteString) mutableList.get(0)).OooO0o0() > 0)) {
                throw new IllegalArgumentException("the empty byte string is not a supported option".toString());
            }
            int i4 = 0;
            while (i4 < mutableList.size()) {
                ByteString prefix = (ByteString) mutableList.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < mutableList.size()) {
                    ByteString byteString2 = (ByteString) mutableList.get(i6);
                    byteString2.getClass();
                    Intrinsics.checkNotNullParameter(prefix, "prefix");
                    if (!byteString2.OooOOO(0, prefix, prefix.OooO0o0())) {
                        break;
                    }
                    if (!(byteString2.OooO0o0() != prefix.OooO0o0())) {
                        throw new IllegalArgumentException(("duplicate option: " + byteString2).toString());
                    }
                    if (((Number) listMutableListOf.get(i6)).intValue() > ((Number) listMutableListOf.get(i4)).intValue()) {
                        mutableList.remove(i6);
                        listMutableListOf.remove(i6);
                    } else {
                        i6++;
                    }
                }
                i4 = i5;
            }
            oo0OOoo oo0oooo = new oo0OOoo();
            OooO00o(0L, oo0oooo, 0, mutableList, 0, mutableList.size(), listMutableListOf);
            int[] iArr = new int[(int) (oo0oooo.f59828OooO0o0 / ((long) 4))];
            while (!oo0oooo.o00oO0O()) {
                iArr[i] = oo0oooo.readInt();
                i++;
            }
            Object[] objArrCopyOf = Arrays.copyOf(byteStrings, byteStrings.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            return new o0OOO0((ByteString[]) objArrCopyOf, iArr);
        }
    }

    public o0OOO0(ByteString[] byteStringArr, int[] iArr) {
        this.f59782OooO0Oo = byteStringArr;
        this.f59783OooO0o0 = iArr;
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
        return this.f59782OooO0Oo[i];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* JADX INFO: renamed from: getSize */
    public final int get_size() {
        return this.f59782OooO0Oo.length;
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
