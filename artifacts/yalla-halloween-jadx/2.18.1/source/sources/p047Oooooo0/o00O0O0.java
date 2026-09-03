package p047Oooooo0;

import androidx.compose.runtime.Immutable;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public final class o00O0O0 implements Iterable<Integer>, KMappedMarker {

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public static final o00O0O0 f4079OoooO00 = new o00O0O0(0, 0, 0, null);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public final int[] f4080Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final long f4081Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final long f4082Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f4083Oooo0oo;

    @DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", i = {0, 0, 1, 1, 2, 2}, l = {295, ShopVehicleListModel.VehicleTagType_Vip300, 307}, m = "invokeSuspend", n = {"$this$sequence", "belowBound", "$this$sequence", "index", "$this$sequence", "index"}, s = {"L$0", "L$1", "L$0", "I$0", "L$0", "I$0"})
    public static final class OooO00o extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f4084Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int[] f4085Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f4086Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f4087Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f4089OoooO00;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = o00O0O0.this.new OooO00o(continuation);
            oooO00o.f4089OoooO00 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope<? super Integer> sequenceScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0089  */
        /* JADX WARN: Code duplicated, block: B:28:0x0095  */
        /* JADX WARN: Code duplicated, block: B:30:0x00aa A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0074 -> B:19:0x0077). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0093 -> B:31:0x00ab). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a8 -> B:31:0x00ab). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 235
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Oooooo0.o00O0O0.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o00O0O0(long j, long j2, int i, int[] iArr) {
        this.f4081Oooo0o = j;
        this.f4082Oooo0oO = j2;
        this.f4083Oooo0oo = i;
        this.f4080Oooo = iArr;
    }

    @NotNull
    public final o00O0O0 OooO00o(@NotNull o00O0O0 bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        o00O0O0 o00o0o0 = f4079OoooO00;
        if (bits == o00o0o0) {
            return this;
        }
        if (this == o00o0o0) {
            return o00o0o0;
        }
        int i = bits.f4083Oooo0oo;
        int i2 = this.f4083Oooo0oo;
        if (i == i2) {
            int[] iArr = bits.f4080Oooo;
            int[] iArr2 = this.f4080Oooo;
            if (iArr == iArr2) {
                return new o00O0O0(this.f4081Oooo0o & (~bits.f4081Oooo0o), this.f4082Oooo0oO & (~bits.f4082Oooo0oO), i2, iArr2);
            }
        }
        Iterator<Integer> it = bits.iterator();
        o00O0O0 o00o0o0OooO0O0 = this;
        while (it.hasNext()) {
            o00o0o0OooO0O0 = o00o0o0OooO0O0.OooO0O0(it.next().intValue());
        }
        return o00o0o0OooO0O0;
    }

    @NotNull
    public final o00O0O0 OooO0O0(int i) {
        int[] iArr;
        int iOooO0O0;
        int i2 = this.f4083Oooo0oo;
        int i3 = i - i2;
        if (i3 >= 0 && i3 < 64) {
            long j = 1 << i3;
            long j2 = this.f4082Oooo0oO;
            if ((j2 & j) != 0) {
                return new o00O0O0(this.f4081Oooo0o, j2 & (~j), i2, this.f4080Oooo);
            }
        } else if (i3 >= 64 && i3 < 128) {
            long j3 = 1 << (i3 - 64);
            long j4 = this.f4081Oooo0o;
            if ((j4 & j3) != 0) {
                return new o00O0O0(j4 & (~j3), this.f4082Oooo0oO, i2, this.f4080Oooo);
            }
        } else if (i3 < 0 && (iArr = this.f4080Oooo) != null && (iOooO0O0 = o00O0O0O.OooO0O0(iArr, i)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new o00O0O0(this.f4081Oooo0o, this.f4082Oooo0oO, this.f4083Oooo0oo, null);
            }
            int[] iArr2 = new int[length];
            if (iOooO0O0 > 0) {
                ArraysKt.copyInto(iArr, iArr2, 0, 0, iOooO0O0);
            }
            if (iOooO0O0 < length) {
                ArraysKt.copyInto(iArr, iArr2, iOooO0O0, iOooO0O0 + 1, length + 1);
            }
            return new o00O0O0(this.f4081Oooo0o, this.f4082Oooo0oO, this.f4083Oooo0oo, iArr2);
        }
        return this;
    }

    public final boolean OooO0OO(int i) {
        int[] iArr;
        int i2 = i - this.f4083Oooo0oo;
        if (i2 >= 0 && i2 < 64) {
            return ((1 << i2) & this.f4082Oooo0oO) != 0;
        }
        if (i2 >= 64 && i2 < 128) {
            return ((1 << (i2 - 64)) & this.f4081Oooo0o) != 0;
        }
        if (i2 <= 0 && (iArr = this.f4080Oooo) != null) {
            return o00O0O0O.OooO0O0(iArr, i) >= 0;
        }
        return false;
    }

    @NotNull
    public final o00O0O0 OooO0o0(@NotNull o00O0O0 bits) {
        Intrinsics.checkNotNullParameter(bits, "bits");
        o00O0O0 o00o0o0 = f4079OoooO00;
        if (bits == o00o0o0) {
            return this;
        }
        if (this == o00o0o0) {
            return bits;
        }
        int i = bits.f4083Oooo0oo;
        int i2 = this.f4083Oooo0oo;
        if (i == i2) {
            int[] iArr = bits.f4080Oooo;
            int[] iArr2 = this.f4080Oooo;
            if (iArr == iArr2) {
                return new o00O0O0(this.f4081Oooo0o | bits.f4081Oooo0o, this.f4082Oooo0oO | bits.f4082Oooo0oO, i2, iArr2);
            }
        }
        if (this.f4080Oooo == null) {
            Iterator<Integer> it = iterator();
            while (it.hasNext()) {
                bits = bits.OooO0oO(it.next().intValue());
            }
            return bits;
        }
        Iterator<Integer> it2 = bits.iterator();
        o00O0O0 o00o0o0OooO0oO = this;
        while (it2.hasNext()) {
            o00o0o0OooO0oO = o00o0o0OooO0oO.OooO0oO(it2.next().intValue());
        }
        return o00o0o0OooO0oO;
    }

    @NotNull
    public final o00O0O0 OooO0oO(int i) {
        int i2;
        int[] intArray;
        int i3 = this.f4083Oooo0oo;
        int i4 = i - i3;
        long j = 0;
        if (i4 >= 0 && i4 < 64) {
            long j2 = 1 << i4;
            long j3 = this.f4082Oooo0oO;
            if ((j3 & j2) == 0) {
                return new o00O0O0(this.f4081Oooo0o, j3 | j2, i3, this.f4080Oooo);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j4 = 1 << (i4 - 64);
            long j5 = this.f4081Oooo0o;
            if ((j5 & j4) == 0) {
                return new o00O0O0(j5 | j4, this.f4082Oooo0oO, i3, this.f4080Oooo);
            }
        } else if (i4 < 128) {
            int[] iArr = this.f4080Oooo;
            if (iArr == null) {
                return new o00O0O0(this.f4081Oooo0o, this.f4082Oooo0oO, i3, new int[]{i});
            }
            int iOooO0O0 = o00O0O0O.OooO0O0(iArr, i);
            if (iOooO0O0 < 0) {
                int i5 = -(iOooO0O0 + 1);
                int length = iArr.length + 1;
                int[] iArr2 = new int[length];
                ArraysKt.copyInto(iArr, iArr2, 0, 0, i5);
                ArraysKt.copyInto(iArr, iArr2, i5 + 1, i5, length - 1);
                iArr2[i5] = i;
                return new o00O0O0(this.f4081Oooo0o, this.f4082Oooo0oO, this.f4083Oooo0oo, iArr2);
            }
        } else if (!OooO0OO(i)) {
            long j6 = this.f4081Oooo0o;
            long j7 = this.f4082Oooo0oO;
            int i6 = this.f4083Oooo0oo;
            ArrayList arrayList = null;
            int i7 = ((i + 1) / 64) * 64;
            long j8 = j7;
            long j9 = j6;
            while (true) {
                if (i6 >= i7) {
                    i2 = i6;
                    break;
                }
                if (j8 != j) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr3 = this.f4080Oooo;
                        if (iArr3 != null) {
                            for (int i8 : iArr3) {
                                arrayList.add(Integer.valueOf(i8));
                            }
                        }
                    }
                    for (int i9 = 0; i9 < 64; i9++) {
                        if (((1 << i9) & j8) != 0) {
                            arrayList.add(Integer.valueOf(i9 + i6));
                        }
                    }
                    j = 0;
                }
                if (j9 == j) {
                    j8 = j;
                    i2 = i7;
                    break;
                }
                i6 += 64;
                j8 = j9;
                j9 = j;
            }
            if (arrayList == null || (intArray = CollectionsKt.toIntArray(arrayList)) == null) {
                intArray = this.f4080Oooo;
            }
            return new o00O0O0(j9, j8, i2, intArray).OooO0oO(i);
        }
        return this;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Integer> iterator() {
        return SequencesKt.sequence(new OooO00o(null)).iterator();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(this, 10));
        Iterator<Integer> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().intValue()));
        }
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("", "prefix");
        Intrinsics.checkNotNullParameter("", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        sb2.append((CharSequence) "");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
