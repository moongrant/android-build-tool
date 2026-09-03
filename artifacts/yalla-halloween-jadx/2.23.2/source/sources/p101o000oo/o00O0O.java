package p101o000oo;

import androidx.recyclerview.widget.Oooo000;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1", f = "AsyncPagingDataDiffer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o000O0o>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000Oo0<Object> f35536OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000oOoO<Object> f35537OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000Oo0<Object> f35538OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(o000Oo0<Object> o000oo1, o000Oo0<Object> o000oo2, o000oOoO<Object> o000oooo2, Continuation<? super o00O0O> continuation) {
        super(2, continuation);
        this.f35536OooO0Oo = o000oo1;
        this.f35538OooO0o0 = o000oo2;
        this.f35537OooO0o = o000oooo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0O(this.f35536OooO0Oo, this.f35538OooO0o0, this.f35537OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o000O0o> continuation) {
        return ((o00O0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0124 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    /* JADX WARN: Code duplicated, block: B:45:0x0108  */
    /* JADX WARN: Code duplicated, block: B:50:0x0122  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        o000Oo0<Object> o000oo1;
        ArrayList arrayList;
        ArrayList arrayList2;
        Oooo000.OooOO0O oooOO0O;
        Oooo000.OooOOO0 oooOOO0;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i;
        Oooo000.OooOO0O oooOO0O2;
        Oooo000.OooO0OO oooO0OO;
        int i2;
        int i3;
        Oooo000.OooOOO0 oooOOO1;
        Oooo000.OooOOO0 oooOOO2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Oooo000.OooO<Object> diffCallback = this.f35537OooO0o.f35486OooO00o;
        o000Oo0<Object> o000oo2 = this.f35536OooO0Oo;
        Intrinsics.checkNotNullParameter(o000oo2, "<this>");
        o000Oo0<Object> newList = this.f35538OooO0o0;
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        int iOooO00o = o000oo2.OooO00o();
        int iOooO00o2 = newList.OooO00o();
        o000O00 o000o01 = new o000O00(o000oo2, newList, diffCallback, iOooO00o, iOooO00o2);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new Oooo000.OooOO0O(iOooO00o, iOooO00o2));
        int i13 = 1;
        int i14 = ((((iOooO00o + iOooO00o2) + 1) / 2) * 2) + 1;
        int[] iArr = new int[i14];
        int i15 = i14 / 2;
        int[] iArr2 = new int[i14];
        ArrayList arrayList7 = new ArrayList();
        while (!arrayList6.isEmpty()) {
            Oooo000.OooOO0O oooOO0O3 = (Oooo000.OooOO0O) arrayList6.remove(arrayList6.size() - i13);
            int i16 = oooOO0O3.f10676OooO0O0;
            int i17 = oooOO0O3.f10675OooO00o;
            int i18 = i16 - i17;
            if (i18 >= i13 && (i2 = oooOO0O3.f10678OooO0Oo - oooOO0O3.f10677OooO0OO) >= i13) {
                int i19 = ((i2 + i18) + i13) / 2;
                int i20 = i13 + i15;
                iArr[i20] = i17;
                iArr2[i20] = i16;
                int i21 = 0;
                while (true) {
                    if (i21 >= i19) {
                        o000oo1 = o000oo2;
                        arrayList = arrayList6;
                        arrayList2 = arrayList7;
                        oooOO0O = oooOO0O3;
                        oooOOO0 = null;
                        break;
                    }
                    int i22 = Math.abs((oooOO0O3.f10676OooO0O0 - oooOO0O3.f10675OooO00o) - (oooOO0O3.f10678OooO0Oo - oooOO0O3.f10677OooO0OO)) % 2 == i13 ? i13 : 0;
                    int i23 = (oooOO0O3.f10676OooO0O0 - oooOO0O3.f10675OooO00o) - (oooOO0O3.f10678OooO0Oo - oooOO0O3.f10677OooO0OO);
                    int i24 = -i21;
                    int i25 = i24;
                    while (true) {
                        if (i25 > i21) {
                            o000oo1 = o000oo2;
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            i3 = i19;
                            oooOOO1 = null;
                            break;
                        }
                        if (i25 != i24) {
                            if (i25 != i21) {
                                i3 = i19;
                                if (iArr[i25 + 1 + i15] > iArr[(i25 - 1) + i15]) {
                                }
                                o000oo1 = o000oo2;
                                arrayList = arrayList6;
                                i9 = ((i8 - oooOO0O3.f10675OooO00o) + oooOO0O3.f10677OooO0OO) - i25;
                                if (i21 == 0 && i8 == i7) {
                                    i10 = i9 - 1;
                                } else {
                                    i10 = i9;
                                }
                                arrayList2 = arrayList7;
                                while (i8 < oooOO0O3.f10676OooO0O0 && i9 < oooOO0O3.f10678OooO0Oo && o000o01.OooO0O0(i8, i9)) {
                                    i8++;
                                    i9++;
                                }
                                iArr[i25 + i15] = i8;
                                if (i22 != 0) {
                                    i12 = i23 - i25;
                                    i11 = i22;
                                    if (i12 < i24 + 1 && i12 <= i21 - 1 && iArr2[i12 + i15] <= i8) {
                                        oooOOO1 = new Oooo000.OooOOO0();
                                        oooOOO1.f10679OooO00o = i7;
                                        oooOOO1.f10680OooO0O0 = i10;
                                        oooOOO1.f10681OooO0OO = i8;
                                        oooOOO1.f10682OooO0Oo = i9;
                                        oooOOO1.f10683OooO0o0 = false;
                                        break;
                                    }
                                } else {
                                    i11 = i22;
                                }
                                i25 += 2;
                                o000oo2 = o000oo1;
                                i19 = i3;
                                arrayList6 = arrayList;
                                arrayList7 = arrayList2;
                                i22 = i11;
                            } else {
                                i3 = i19;
                            }
                            i7 = iArr[(i25 - 1) + i15];
                            i8 = i7 + 1;
                            o000oo1 = o000oo2;
                            arrayList = arrayList6;
                            i9 = ((i8 - oooOO0O3.f10675OooO00o) + oooOO0O3.f10677OooO0OO) - i25;
                            if (i21 == 0) {
                                i10 = i9;
                            } else {
                                i10 = i9;
                            }
                            arrayList2 = arrayList7;
                            while (i8 < oooOO0O3.f10676OooO0O0) {
                                i8++;
                                i9++;
                            }
                            iArr[i25 + i15] = i8;
                            if (i22 != 0) {
                                i12 = i23 - i25;
                                i11 = i22;
                                if (i12 < i24 + 1) {
                                    continue;
                                }
                            } else {
                                i11 = i22;
                            }
                            i25 += 2;
                            o000oo2 = o000oo1;
                            i19 = i3;
                            arrayList6 = arrayList;
                            arrayList7 = arrayList2;
                            i22 = i11;
                        } else {
                            i3 = i19;
                        }
                        i7 = iArr[i25 + 1 + i15];
                        i8 = i7;
                        o000oo1 = o000oo2;
                        arrayList = arrayList6;
                        i9 = ((i8 - oooOO0O3.f10675OooO00o) + oooOO0O3.f10677OooO0OO) - i25;
                        if (i21 == 0) {
                            i10 = i9;
                        } else {
                            i10 = i9;
                        }
                        arrayList2 = arrayList7;
                        while (i8 < oooOO0O3.f10676OooO0O0) {
                            i8++;
                            i9++;
                        }
                        iArr[i25 + i15] = i8;
                        if (i22 != 0) {
                            i12 = i23 - i25;
                            i11 = i22;
                            if (i12 < i24 + 1) {
                                continue;
                            }
                        } else {
                            i11 = i22;
                        }
                        i25 += 2;
                        o000oo2 = o000oo1;
                        i19 = i3;
                        arrayList6 = arrayList;
                        arrayList7 = arrayList2;
                        i22 = i11;
                    }
                    if (oooOOO1 != null) {
                        oooOOO0 = oooOOO1;
                        oooOO0O = oooOO0O3;
                        break;
                    }
                    int i26 = (oooOO0O3.f10676OooO0O0 - oooOO0O3.f10675OooO00o) - (oooOO0O3.f10678OooO0Oo - oooOO0O3.f10677OooO0OO);
                    boolean z2 = i26 % 2 == 0;
                    int i27 = i24;
                    while (true) {
                        if (i27 > i21) {
                            oooOO0O = oooOO0O3;
                            oooOOO2 = null;
                            break;
                        }
                        if (i27 == i24 || (i27 != i21 && iArr2[i27 + 1 + i15] < iArr2[(i27 - 1) + i15])) {
                            i4 = iArr2[i27 + 1 + i15];
                            i5 = i4;
                        } else {
                            i4 = iArr2[(i27 - 1) + i15];
                            i5 = i4 - 1;
                        }
                        int i28 = oooOO0O3.f10678OooO0Oo - ((oooOO0O3.f10676OooO0O0 - i5) - i27);
                        int i29 = (i21 == 0 || i5 != i4) ? i28 : i28 + 1;
                        while (true) {
                            if (i5 > oooOO0O3.f10675OooO00o && i28 > oooOO0O3.f10677OooO0OO) {
                                int i30 = i5 - 1;
                                oooOO0O = oooOO0O3;
                                int i31 = i28 - 1;
                                if (!o000o01.OooO0O0(i30, i31)) {
                                    break;
                                }
                                i28 = i31;
                                i5 = i30;
                                oooOO0O3 = oooOO0O;
                            } else {
                                oooOO0O = oooOO0O3;
                                break;
                            }
                        }
                        iArr2[i27 + i15] = i5;
                        if (z2 && (i6 = i26 - i27) >= i24 && i6 <= i21 && iArr[i6 + i15] >= i5) {
                            oooOOO2 = new Oooo000.OooOOO0();
                            oooOOO2.f10679OooO00o = i5;
                            oooOOO2.f10680OooO0O0 = i28;
                            oooOOO2.f10681OooO0OO = i4;
                            oooOOO2.f10682OooO0Oo = i29;
                            oooOOO2.f10683OooO0o0 = true;
                            break;
                        }
                        i27 += 2;
                        oooOO0O3 = oooOO0O;
                    }
                    if (oooOOO2 != null) {
                        oooOOO0 = oooOOO2;
                        break;
                    }
                    i21++;
                    o000oo2 = o000oo1;
                    i19 = i3;
                    arrayList6 = arrayList;
                    arrayList7 = arrayList2;
                    oooOO0O3 = oooOO0O;
                    i13 = 1;
                }
            } else {
                o000oo1 = o000oo2;
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                oooOO0O = oooOO0O3;
                oooOOO0 = null;
                break;
            }
            if (oooOOO0 != null) {
                if (oooOOO0.OooO00o() > 0) {
                    int i32 = oooOOO0.f10682OooO0Oo;
                    int i33 = oooOOO0.f10680OooO0O0;
                    int i34 = i32 - i33;
                    int i35 = oooOOO0.f10681OooO0OO;
                    int i36 = oooOOO0.f10679OooO00o;
                    int i37 = i35 - i36;
                    if (!(i34 != i37)) {
                        oooO0OO = new Oooo000.OooO0OO(i36, i33, i37);
                    } else if (oooOOO0.f10683OooO0o0) {
                        oooO0OO = new Oooo000.OooO0OO(i36, i33, oooOOO0.OooO00o());
                    } else {
                        oooO0OO = i34 > i37 ? new Oooo000.OooO0OO(i36, i33 + 1, oooOOO0.OooO00o()) : new Oooo000.OooO0OO(i36 + 1, i33, oooOOO0.OooO00o());
                    }
                    arrayList5.add(oooO0OO);
                }
                if (arrayList2.isEmpty()) {
                    oooOO0O2 = new Oooo000.OooOO0O();
                    arrayList4 = arrayList2;
                    i = 1;
                } else {
                    i = 1;
                    arrayList4 = arrayList2;
                    oooOO0O2 = (Oooo000.OooOO0O) arrayList4.remove(arrayList2.size() - 1);
                }
                oooOO0O2.f10675OooO00o = oooOO0O.f10675OooO00o;
                oooOO0O2.f10677OooO0OO = oooOO0O.f10677OooO0OO;
                oooOO0O2.f10676OooO0O0 = oooOOO0.f10679OooO00o;
                oooOO0O2.f10678OooO0Oo = oooOOO0.f10680OooO0O0;
                arrayList3 = arrayList;
                arrayList3.add(oooOO0O2);
                oooOO0O.f10676OooO0O0 = oooOO0O.f10676OooO0O0;
                oooOO0O.f10678OooO0Oo = oooOO0O.f10678OooO0Oo;
                oooOO0O.f10675OooO00o = oooOOO0.f10681OooO0OO;
                oooOO0O.f10677OooO0OO = oooOOO0.f10682OooO0Oo;
                arrayList3.add(oooOO0O);
            } else {
                arrayList3 = arrayList;
                arrayList4 = arrayList2;
                i = 1;
                arrayList4.add(oooOO0O);
            }
            arrayList7 = arrayList4;
            arrayList6 = arrayList3;
            i13 = i;
            o000oo2 = o000oo1;
        }
        o000Oo0<Object> o000oo3 = o000oo2;
        int i38 = i13;
        Collections.sort(arrayList5, Oooo000.f10661OooO00o);
        Oooo000.OooO0o oooO0o = new Oooo000.OooO0o(o000o01, arrayList5, iArr, iArr2);
        Intrinsics.checkNotNullExpressionValue(oooO0o, "NullPaddedList<T>.comput…    },\n        true\n    )");
        Iterable iterableUntil = RangesKt.until(0, o000oo3.OooO00o());
        if ((iterableUntil instanceof Collection) && ((Collection) iterableUntil).isEmpty()) {
            z = 0;
        } else {
            Iterator it = iterableUntil.iterator();
            while (it.hasNext()) {
                if ((oooO0o.OooO00o(((IntIterator) it).nextInt()) != -1 ? i38 : 0) != 0) {
                    z = i38;
                }
            }
            z = 0;
        }
        return new o000O0o(oooO0o, z);
    }
}
