package p089o000o000;

import androidx.paging.DiffingChangePayload;
import androidx.recyclerview.widget.OooO0OO;
import androidx.recyclerview.widget.OooOo;
import androidx.recyclerview.widget.o0ooOOo;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o<T> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Flow<OooOo> f28647OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOo.OooO<T> f28648OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0ooOOo f28649OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f28650OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f28651OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f28652OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f28653OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final OooO00o f28654OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f28655OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final Flow<Unit> f28656OooOO0;

    public static final class OooO00o extends o00O00<T> {

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ OooO0o<T> f28657OooOOO0;

        /* JADX INFO: renamed from: o000o000.OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$differBase$1", f = "AsyncPagingDataDiffer.kt", i = {0, 0, 0, 0, 0}, l = {182}, m = "presentNewList", n = {"this", "previousList", "newList", "onListPresentable", "lastAccessedIndex"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
        public static final class C0306OooO00o extends ContinuationImpl {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public Function0 f28658Oooo;

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public OooO00o f28659Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public o0000O00 f28660Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public o0000O00 f28661Oooo0oo;

            /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
            public int f28662OoooO;

            /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
            public /* synthetic */ Object f28663OoooO0;

            /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
            public int f28664OoooO00;

            public C0306OooO00o(Continuation<? super C0306OooO00o> continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f28663OoooO0 = obj;
                this.f28662OoooO |= Integer.MIN_VALUE;
                return OooO00o.this.OooO0o(null, null, 0, null, this);
            }
        }

        @DebugMetadata(c = "androidx.paging.AsyncPagingDataDiffer$differBase$1$presentNewList$diffResult$1", f = "AsyncPagingDataDiffer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super o0000>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ o0000O00<T> f28666Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ o0000O00<T> f28667Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ OooO0o<T> f28668Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(o0000O00<T> o0000o00, o0000O00<T> o0000o01, OooO0o<T> oooO0o, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f28666Oooo0o = o0000o00;
                this.f28667Oooo0oO = o0000o01;
                this.f28668Oooo0oo = oooO0o;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f28666Oooo0o, this.f28667Oooo0oO, this.f28668Oooo0oo, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super o0000> continuation) {
                return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:147:0x0124 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:29:0x00de A[ADDED_TO_REGION] */
            /* JADX WARN: Code duplicated, block: B:32:0x00e4  */
            /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
            /* JADX WARN: Code duplicated, block: B:43:0x0100  */
            /* JADX WARN: Code duplicated, block: B:45:0x0108  */
            /* JADX WARN: Code duplicated, block: B:50:0x0122  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ArrayList arrayList;
                o0000O00<T> o0000o00;
                ArrayList arrayList2;
                OooOo.OooOO0O oooOO0O;
                OooOo.OooOOO0 oooOOO0;
                ArrayList arrayList3;
                ArrayList arrayList4;
                OooOo.OooOO0O oooOO0O2;
                OooOo.OooO0OO oooO0OO;
                int i;
                int i2;
                OooOo.OooOOO0 oooOOO1;
                OooOo.OooOOO0 oooOOO2;
                int i3;
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                int i9;
                boolean z;
                int i10;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                o0000O00<T> o0000o01 = this.f28666Oooo0o;
                o0000O00<T> newList = this.f28667Oooo0oO;
                OooOo.OooO<T> diffCallback = this.f28668Oooo0oo.f28648OooO00o;
                Intrinsics.checkNotNullParameter(o0000o01, "<this>");
                Intrinsics.checkNotNullParameter(newList, "newList");
                Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
                int iOooO00o = o0000o01.OooO00o();
                int iOooO00o2 = newList.OooO00o();
                o0000oo o0000ooVar = new o0000oo(o0000o01, newList, diffCallback, iOooO00o, iOooO00o2);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(new OooOo.OooOO0O(iOooO00o, iOooO00o2));
                int i11 = 1;
                int i12 = ((((iOooO00o + iOooO00o2) + 1) / 2) * 2) + 1;
                int[] iArr = new int[i12];
                int i13 = i12 / 2;
                int[] iArr2 = new int[i12];
                ArrayList arrayList7 = new ArrayList();
                while (!arrayList6.isEmpty()) {
                    OooOo.OooOO0O oooOO0O3 = (OooOo.OooOO0O) arrayList6.remove(arrayList6.size() - i11);
                    int i14 = oooOO0O3.f8956OooO0O0;
                    int i15 = oooOO0O3.f8955OooO00o;
                    int i16 = i14 - i15;
                    if (i16 >= i11 && (i = oooOO0O3.f8958OooO0Oo - oooOO0O3.f8957OooO0OO) >= i11) {
                        int i17 = ((i + i16) + i11) / 2;
                        int i18 = i11 + i13;
                        iArr[i18] = i15;
                        iArr2[i18] = i14;
                        int i19 = 0;
                        while (true) {
                            if (i19 >= i17) {
                                arrayList = arrayList6;
                                o0000o00 = o0000o01;
                                arrayList2 = arrayList7;
                                oooOO0O = oooOO0O3;
                                oooOOO0 = null;
                                break;
                            }
                            boolean z2 = Math.abs((oooOO0O3.f8956OooO0O0 - oooOO0O3.f8955OooO00o) - (oooOO0O3.f8958OooO0Oo - oooOO0O3.f8957OooO0OO)) % 2 == i11;
                            int i20 = (oooOO0O3.f8956OooO0O0 - oooOO0O3.f8955OooO00o) - (oooOO0O3.f8958OooO0Oo - oooOO0O3.f8957OooO0OO);
                            int i21 = -i19;
                            int i22 = i21;
                            while (true) {
                                if (i22 > i19) {
                                    arrayList = arrayList6;
                                    o0000o00 = o0000o01;
                                    arrayList2 = arrayList7;
                                    i2 = i17;
                                    oooOOO1 = null;
                                    break;
                                }
                                if (i22 != i21) {
                                    if (i22 != i19) {
                                        i2 = i17;
                                        if (iArr[i22 + 1 + i13] > iArr[(i22 - 1) + i13]) {
                                        }
                                        o0000o00 = o0000o01;
                                        arrayList = arrayList6;
                                        i8 = ((i7 - oooOO0O3.f8955OooO00o) + oooOO0O3.f8957OooO0OO) - i22;
                                        if (i19 == 0 && i7 == i6) {
                                            i9 = i8 - 1;
                                        } else {
                                            i9 = i8;
                                        }
                                        arrayList2 = arrayList7;
                                        while (i7 < oooOO0O3.f8956OooO0O0 && i8 < oooOO0O3.f8958OooO0Oo && o0000ooVar.OooO0O0(i7, i8)) {
                                            i7++;
                                            i8++;
                                        }
                                        iArr[i22 + i13] = i7;
                                        if (z2) {
                                            i10 = i20 - i22;
                                            z = z2;
                                            if (i10 < i21 + 1 && i10 <= i19 - 1 && iArr2[i10 + i13] <= i7) {
                                                oooOOO1 = new OooOo.OooOOO0();
                                                oooOOO1.f8959OooO00o = i6;
                                                oooOOO1.f8960OooO0O0 = i9;
                                                oooOOO1.f8961OooO0OO = i7;
                                                oooOOO1.f8962OooO0Oo = i8;
                                                oooOOO1.f8963OooO0o0 = false;
                                                break;
                                            }
                                        } else {
                                            z = z2;
                                        }
                                        i22 += 2;
                                        o0000o01 = o0000o00;
                                        i17 = i2;
                                        arrayList6 = arrayList;
                                        arrayList7 = arrayList2;
                                        z2 = z;
                                    } else {
                                        i2 = i17;
                                    }
                                    i6 = iArr[(i22 - 1) + i13];
                                    i7 = i6 + 1;
                                    o0000o00 = o0000o01;
                                    arrayList = arrayList6;
                                    i8 = ((i7 - oooOO0O3.f8955OooO00o) + oooOO0O3.f8957OooO0OO) - i22;
                                    if (i19 == 0) {
                                        i9 = i8;
                                    } else {
                                        i9 = i8;
                                    }
                                    arrayList2 = arrayList7;
                                    while (i7 < oooOO0O3.f8956OooO0O0) {
                                        i7++;
                                        i8++;
                                    }
                                    iArr[i22 + i13] = i7;
                                    if (z2) {
                                        i10 = i20 - i22;
                                        z = z2;
                                        if (i10 < i21 + 1) {
                                            continue;
                                        }
                                    } else {
                                        z = z2;
                                    }
                                    i22 += 2;
                                    o0000o01 = o0000o00;
                                    i17 = i2;
                                    arrayList6 = arrayList;
                                    arrayList7 = arrayList2;
                                    z2 = z;
                                } else {
                                    i2 = i17;
                                }
                                i6 = iArr[i22 + 1 + i13];
                                i7 = i6;
                                o0000o00 = o0000o01;
                                arrayList = arrayList6;
                                i8 = ((i7 - oooOO0O3.f8955OooO00o) + oooOO0O3.f8957OooO0OO) - i22;
                                if (i19 == 0) {
                                    i9 = i8;
                                } else {
                                    i9 = i8;
                                }
                                arrayList2 = arrayList7;
                                while (i7 < oooOO0O3.f8956OooO0O0) {
                                    i7++;
                                    i8++;
                                }
                                iArr[i22 + i13] = i7;
                                if (z2) {
                                    i10 = i20 - i22;
                                    z = z2;
                                    if (i10 < i21 + 1) {
                                        continue;
                                    }
                                } else {
                                    z = z2;
                                }
                                i22 += 2;
                                o0000o01 = o0000o00;
                                i17 = i2;
                                arrayList6 = arrayList;
                                arrayList7 = arrayList2;
                                z2 = z;
                            }
                            if (oooOOO1 != null) {
                                oooOOO0 = oooOOO1;
                                oooOO0O = oooOO0O3;
                                break;
                            }
                            int i23 = (oooOO0O3.f8956OooO0O0 - oooOO0O3.f8955OooO00o) - (oooOO0O3.f8958OooO0Oo - oooOO0O3.f8957OooO0OO);
                            boolean z3 = i23 % 2 == 0;
                            int i24 = i21;
                            while (true) {
                                if (i24 > i19) {
                                    oooOO0O = oooOO0O3;
                                    oooOOO2 = null;
                                    break;
                                }
                                if (i24 == i21 || (i24 != i19 && iArr2[i24 + 1 + i13] < iArr2[(i24 - 1) + i13])) {
                                    i3 = iArr2[i24 + 1 + i13];
                                    i4 = i3;
                                } else {
                                    i3 = iArr2[(i24 - 1) + i13];
                                    i4 = i3 - 1;
                                }
                                int i25 = oooOO0O3.f8958OooO0Oo - ((oooOO0O3.f8956OooO0O0 - i4) - i24);
                                int i26 = (i19 == 0 || i4 != i3) ? i25 : i25 + 1;
                                while (true) {
                                    if (i4 > oooOO0O3.f8955OooO00o && i25 > oooOO0O3.f8957OooO0OO) {
                                        int i27 = i4 - 1;
                                        oooOO0O = oooOO0O3;
                                        int i28 = i25 - 1;
                                        if (!o0000ooVar.OooO0O0(i27, i28)) {
                                            break;
                                        }
                                        i25 = i28;
                                        i4 = i27;
                                        oooOO0O3 = oooOO0O;
                                    } else {
                                        oooOO0O = oooOO0O3;
                                        break;
                                    }
                                }
                                iArr2[i24 + i13] = i4;
                                if (z3 && (i5 = i23 - i24) >= i21 && i5 <= i19 && iArr[i5 + i13] >= i4) {
                                    oooOOO2 = new OooOo.OooOOO0();
                                    oooOOO2.f8959OooO00o = i4;
                                    oooOOO2.f8960OooO0O0 = i25;
                                    oooOOO2.f8961OooO0OO = i3;
                                    oooOOO2.f8962OooO0Oo = i26;
                                    oooOOO2.f8963OooO0o0 = true;
                                    break;
                                }
                                i24 += 2;
                                oooOO0O3 = oooOO0O;
                            }
                            if (oooOOO2 != null) {
                                oooOOO0 = oooOOO2;
                                break;
                            }
                            i19++;
                            o0000o01 = o0000o00;
                            i17 = i2;
                            arrayList6 = arrayList;
                            arrayList7 = arrayList2;
                            oooOO0O3 = oooOO0O;
                            i11 = 1;
                        }
                    } else {
                        arrayList = arrayList6;
                        o0000o00 = o0000o01;
                        arrayList2 = arrayList7;
                        oooOO0O = oooOO0O3;
                        oooOOO0 = null;
                        break;
                    }
                    if (oooOOO0 != null) {
                        if (oooOOO0.OooO00o() > 0) {
                            int i29 = oooOOO0.f8962OooO0Oo;
                            int i30 = oooOOO0.f8960OooO0O0;
                            int i31 = i29 - i30;
                            int i32 = oooOOO0.f8961OooO0OO;
                            int i33 = oooOOO0.f8959OooO00o;
                            int i34 = i32 - i33;
                            if (!(i31 != i34)) {
                                oooO0OO = new OooOo.OooO0OO(i33, i30, i34);
                            } else if (oooOOO0.f8963OooO0o0) {
                                oooO0OO = new OooOo.OooO0OO(i33, i30, oooOOO0.OooO00o());
                            } else {
                                oooO0OO = i31 > i34 ? new OooOo.OooO0OO(i33, i30 + 1, oooOOO0.OooO00o()) : new OooOo.OooO0OO(i33 + 1, i30, oooOOO0.OooO00o());
                            }
                            arrayList5.add(oooO0OO);
                        }
                        if (arrayList2.isEmpty()) {
                            oooOO0O2 = new OooOo.OooOO0O();
                            arrayList4 = arrayList2;
                        } else {
                            arrayList4 = arrayList2;
                            oooOO0O2 = (OooOo.OooOO0O) arrayList4.remove(arrayList2.size() - 1);
                        }
                        oooOO0O2.f8955OooO00o = oooOO0O.f8955OooO00o;
                        oooOO0O2.f8957OooO0OO = oooOO0O.f8957OooO0OO;
                        oooOO0O2.f8956OooO0O0 = oooOOO0.f8959OooO00o;
                        oooOO0O2.f8958OooO0Oo = oooOOO0.f8960OooO0O0;
                        arrayList3 = arrayList;
                        arrayList3.add(oooOO0O2);
                        oooOO0O.f8956OooO0O0 = oooOO0O.f8956OooO0O0;
                        oooOO0O.f8958OooO0Oo = oooOO0O.f8958OooO0Oo;
                        oooOO0O.f8955OooO00o = oooOOO0.f8961OooO0OO;
                        oooOO0O.f8957OooO0OO = oooOOO0.f8962OooO0Oo;
                        arrayList3.add(oooOO0O);
                    } else {
                        arrayList3 = arrayList;
                        arrayList4 = arrayList2;
                        arrayList4.add(oooOO0O);
                    }
                    arrayList7 = arrayList4;
                    arrayList6 = arrayList3;
                    o0000o01 = o0000o00;
                    i11 = 1;
                }
                Collections.sort(arrayList5, OooOo.f8941OooO00o);
                OooOo.OooO0o oooO0o = new OooOo.OooO0o(o0000ooVar, arrayList5, iArr, iArr2);
                Intrinsics.checkNotNullExpressionValue(oooO0o, "NullPaddedList<T>.comput…    },\n        true\n    )");
                boolean z4 = false;
                Iterable iterableUntil = RangesKt.until(0, o0000o01.OooO00o());
                if (!(iterableUntil instanceof Collection) || !((Collection) iterableUntil).isEmpty()) {
                    Iterator<T> it = iterableUntil.iterator();
                    while (it.hasNext()) {
                        if (oooO0o.OooO00o(((IntIterator) it).nextInt()) != -1) {
                            z4 = true;
                            break;
                        }
                    }
                }
                return new o0000(oooO0o, z4);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooO0o<T> oooO0o, o0OoOo0 o0oooo1, CoroutineContext coroutineContext) {
            super(o0oooo1, coroutineContext);
            this.f28657OooOOO0 = oooO0o;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // p089o000o000.o00O00
        @Nullable
        public final Object OooO0o(@NotNull o0000O00<T> o0000o00, @NotNull o0000O00<T> o0000o01, int i, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Integer> continuation) throws Throwable {
            C0306OooO00o c0306OooO00o;
            o0000O00 newList;
            Function0<Unit> function1;
            int i2;
            o0000O00 oldList;
            OooO00o oooO00o;
            int i3;
            o0000 o0000Var;
            String str;
            String str2;
            int iCoerceIn;
            int iOooO00o;
            int i4;
            if (continuation instanceof C0306OooO00o) {
                c0306OooO00o = (C0306OooO00o) continuation;
                int i5 = c0306OooO00o.f28662OoooO;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    c0306OooO00o.f28662OoooO = i5 - Integer.MIN_VALUE;
                } else {
                    c0306OooO00o = new C0306OooO00o(continuation);
                }
            } else {
                c0306OooO00o = new C0306OooO00o(continuation);
            }
            Object obj = c0306OooO00o.f28663OoooO0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i6 = c0306OooO00o.f28662OoooO;
            if (i6 == 0) {
                ResultKt.throwOnFailure(obj);
                o000O o000o = (o000O) o0000o00;
                if (o000o.getSize() == 0) {
                    ((o00O00OO) function0).invoke();
                    OooO0O0 oooO0O0 = this.f28657OooOOO0.f28653OooO0o0;
                    int size = ((o000O) o0000o01).getSize();
                    Objects.requireNonNull(oooO0O0);
                    if (size <= 0) {
                        return null;
                    }
                    oooO0O0.f28669OooO00o.f28649OooO0O0.OooO00o(0, size);
                    return null;
                }
                newList = (o000O) o0000o01;
                if (newList.getSize() == 0) {
                    ((o00O00OO) function0).invoke();
                    OooO0O0 oooO0O1 = this.f28657OooOOO0.f28653OooO0o0;
                    int size2 = o000o.getSize();
                    Objects.requireNonNull(oooO0O1);
                    if (size2 <= 0) {
                        return null;
                    }
                    oooO0O1.f28669OooO00o.f28649OooO0O0.OooO0O0(0, size2);
                    return null;
                }
                OooO0o<T> oooO0o = this.f28657OooOOO0;
                CoroutineContext coroutineContext = oooO0o.f28651OooO0Oo;
                OooO0O0 oooO0O2 = new OooO0O0(o000o, newList, oooO0o, null);
                c0306OooO00o.f28659Oooo0o = this;
                c0306OooO00o.f28660Oooo0oO = o000o;
                c0306OooO00o.f28661Oooo0oo = newList;
                c0306OooO00o.f28658Oooo = function0;
                c0306OooO00o.f28664OoooO00 = i;
                c0306OooO00o.f28662OoooO = 1;
                Object objWithContext = BuildersKt.withContext(coroutineContext, oooO0O2, c0306OooO00o);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function0;
                i2 = i;
                oldList = o000o;
                obj = objWithContext;
                oooO00o = this;
            } else {
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = c0306OooO00o.f28664OoooO00;
                function1 = c0306OooO00o.f28658Oooo;
                newList = c0306OooO00o.f28661Oooo0oo;
                oldList = c0306OooO00o.f28660Oooo0oO;
                oooO00o = c0306OooO00o.f28659Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            o0000 diffResult = (o0000) obj;
            function1.invoke();
            o0ooOOo callback = oooO00o.f28657OooOOO0.f28649OooO0O0;
            String str3 = "<this>";
            Intrinsics.checkNotNullParameter(oldList, "<this>");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(newList, "newList");
            String str4 = "diffResult";
            Intrinsics.checkNotNullParameter(diffResult, "diffResult");
            if (diffResult.f28692OooO0O0) {
                Intrinsics.checkNotNullParameter(oldList, "oldList");
                Intrinsics.checkNotNullParameter(newList, "newList");
                Intrinsics.checkNotNullParameter(callback, "callback");
                Intrinsics.checkNotNullParameter(diffResult, "diffResult");
                o0000O0 o0000o1 = new o0000O0(oldList, newList, callback);
                OooOo.OooO0o oooO0o2 = diffResult.f28691OooO00o;
                Objects.requireNonNull(oooO0o2);
                OooO0OO oooO0OO = o0000o1 instanceof OooO0OO ? (OooO0OO) o0000o1 : new OooO0OO(o0000o1);
                int i7 = oooO0o2.f8950OooO0o0;
                ArrayDeque arrayDeque = new ArrayDeque();
                int i8 = oooO0o2.f8950OooO0o0;
                int i9 = oooO0o2.f8949OooO0o;
                int size3 = oooO0o2.f8945OooO00o.size() - 1;
                while (size3 >= 0) {
                    OooOo.OooO0OO oooO0OO2 = oooO0o2.f8945OooO00o.get(size3);
                    int i10 = i9;
                    int i11 = oooO0OO2.f8942OooO00o;
                    int i12 = i7;
                    int i13 = oooO0OO2.f8944OooO0OO;
                    int i14 = i11 + i13;
                    int i15 = i8;
                    int i16 = oooO0OO2.f8943OooO0O0 + i13;
                    i7 = i12;
                    int i17 = i2;
                    int i18 = i15;
                    while (i18 > i14) {
                        i18--;
                        i14 = i14;
                        int i19 = oooO0o2.f8946OooO0O0[i18];
                        if ((i19 & 12) != 0) {
                            o0000 o0000Var2 = diffResult;
                            int i20 = i19 >> 4;
                            String str5 = str3;
                            String str6 = str4;
                            OooOo.OooOO0 oooOO0OooO0O0 = OooOo.OooO0o.OooO0O0(arrayDeque, i20, false);
                            if (oooOO0OooO0O0 != null) {
                                int i21 = (i7 - oooOO0OooO0O0.f8953OooO0O0) - 1;
                                oooO0OO.OooO0OO(i18, i21);
                                if ((i19 & 4) != 0) {
                                    oooO0OO.OooO0Oo(i21, 1, oooO0o2.f8948OooO0Oo.OooO0OO(i18, i20));
                                }
                            } else {
                                arrayDeque.add(new OooOo.OooOO0(i18, (i7 - i18) - 1, true));
                            }
                            diffResult = o0000Var2;
                            str4 = str6;
                            str3 = str5;
                        } else {
                            oooO0OO.OooO0O0(i18, 1);
                            i7--;
                            str4 = str4;
                        }
                    }
                    o0000 o0000Var3 = diffResult;
                    String str7 = str3;
                    String str8 = str4;
                    int i22 = i10;
                    while (i22 > i16) {
                        i22--;
                        int i23 = oooO0o2.f8947OooO0OO[i22];
                        if ((i23 & 12) != 0) {
                            int i24 = i23 >> 4;
                            int i25 = i16;
                            OooOo.OooOO0 oooOO0OooO0O1 = OooOo.OooO0o.OooO0O0(arrayDeque, i24, true);
                            if (oooOO0OooO0O1 == null) {
                                arrayDeque.add(new OooOo.OooOO0(i22, i7 - i18, false));
                            } else {
                                oooO0OO.OooO0OO((i7 - oooOO0OooO0O1.f8953OooO0O0) - 1, i18);
                                if ((i23 & 4) != 0) {
                                    oooO0OO.OooO0Oo(i18, 1, oooO0o2.f8948OooO0Oo.OooO0OO(i24, i22));
                                }
                            }
                            i16 = i25;
                        } else {
                            oooO0OO.OooO00o(i18, 1);
                            i7++;
                        }
                    }
                    int i26 = oooO0OO2.f8942OooO00o;
                    int i27 = oooO0OO2.f8943OooO0O0;
                    int i28 = i26;
                    for (int i29 = 0; i29 < oooO0OO2.f8944OooO0OO; i29++) {
                        if ((oooO0o2.f8946OooO0O0[i28] & 15) == 2) {
                            oooO0OO.OooO0Oo(i28, 1, oooO0o2.f8948OooO0Oo.OooO0OO(i28, i27));
                        }
                        i28++;
                        i27++;
                    }
                    i8 = oooO0OO2.f8942OooO00o;
                    i9 = oooO0OO2.f8943OooO0O0;
                    size3--;
                    i2 = i17;
                    diffResult = o0000Var3;
                    str4 = str8;
                    str3 = str7;
                }
                i3 = i2;
                o0000Var = diffResult;
                str = str3;
                str2 = str4;
                oooO0OO.OooO0o0();
                int iMin = Math.min(o0000o1.f28725OooO00o.OooO0O0(), o0000o1.f28728OooO0Oo);
                int iOooO0O0 = o0000o1.f28726OooO0O0.OooO0O0() - o0000o1.f28728OooO0Oo;
                if (iOooO0O0 > 0) {
                    if (iMin > 0) {
                        i4 = 0;
                        o0000o1.f28727OooO0OO.OooO0Oo(0, iMin, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                    } else {
                        i4 = 0;
                    }
                    o0000o1.f28727OooO0OO.OooO00o(i4, iOooO0O0);
                } else if (iOooO0O0 < 0) {
                    o0000o1.f28727OooO0OO.OooO0O0(0, -iOooO0O0);
                    int i30 = iMin + iOooO0O0;
                    if (i30 > 0) {
                        o0000o1.f28727OooO0OO.OooO0Oo(0, i30, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                    }
                }
                o0000o1.f28728OooO0Oo = o0000o1.f28726OooO0O0.OooO0O0();
                int iMin2 = Math.min(o0000o1.f28725OooO00o.OooO0OO(), o0000o1.f28730OooO0o0);
                int iOooO0OO = o0000o1.f28726OooO0O0.OooO0OO();
                int i31 = o0000o1.f28730OooO0o0;
                int i32 = iOooO0OO - i31;
                int i33 = o0000o1.f28728OooO0Oo + o0000o1.f28729OooO0o + i31;
                int i34 = i33 - iMin2;
                boolean z = i34 != o0000o1.f28725OooO00o.getSize() - iMin2;
                if (i32 > 0) {
                    o0000o1.f28727OooO0OO.OooO00o(i33, i32);
                } else if (i32 < 0) {
                    o0000o1.f28727OooO0OO.OooO0O0(i33 + i32, -i32);
                    iMin2 += i32;
                }
                if (iMin2 > 0 && z) {
                    o0000o1.f28727OooO0OO.OooO0Oo(i34, iMin2, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
                o0000o1.f28730OooO0o0 = o0000o1.f28726OooO0O0.OooO0OO();
            } else {
                i3 = i2;
                o0000Var = diffResult;
                str = "<this>";
                str2 = "diffResult";
                Intrinsics.checkNotNullParameter(callback, "callback");
                Intrinsics.checkNotNullParameter(oldList, "oldList");
                Intrinsics.checkNotNullParameter(newList, "newList");
                int iMax = Math.max(oldList.OooO0O0(), newList.OooO0O0());
                int iMin3 = Math.min(oldList.OooO00o() + oldList.OooO0O0(), newList.OooO00o() + newList.OooO0O0());
                int i35 = iMin3 - iMax;
                if (i35 > 0) {
                    callback.OooO0O0(iMax, i35);
                    callback.OooO00o(iMax, i35);
                }
                int iMin4 = Math.min(iMax, iMin3);
                int iMax2 = Math.max(iMax, iMin3);
                int iCoerceAtMost = RangesKt.coerceAtMost(oldList.OooO0O0(), newList.getSize());
                int iCoerceAtMost2 = RangesKt.coerceAtMost(oldList.OooO00o() + oldList.OooO0O0(), newList.getSize());
                DiffingChangePayload diffingChangePayload = DiffingChangePayload.ITEM_TO_PLACEHOLDER;
                int i36 = iMin4 - iCoerceAtMost;
                if (i36 > 0) {
                    callback.OooO0Oo(iCoerceAtMost, i36, diffingChangePayload);
                }
                int i37 = iCoerceAtMost2 - iMax2;
                if (i37 > 0) {
                    callback.OooO0Oo(iMax2, i37, diffingChangePayload);
                }
                int iCoerceAtMost3 = RangesKt.coerceAtMost(newList.OooO0O0(), oldList.getSize());
                int iCoerceAtMost4 = RangesKt.coerceAtMost(newList.OooO00o() + newList.OooO0O0(), oldList.getSize());
                DiffingChangePayload diffingChangePayload2 = DiffingChangePayload.PLACEHOLDER_TO_ITEM;
                int i38 = iMin4 - iCoerceAtMost3;
                if (i38 > 0) {
                    callback.OooO0Oo(iCoerceAtMost3, i38, diffingChangePayload2);
                }
                int i39 = iCoerceAtMost4 - iMax2;
                if (i39 > 0) {
                    callback.OooO0Oo(iMax2, i39, diffingChangePayload2);
                }
                int size4 = newList.getSize() - oldList.getSize();
                if (size4 > 0) {
                    callback.OooO00o(oldList.getSize(), size4);
                } else if (size4 < 0) {
                    callback.OooO0O0(oldList.getSize() + size4, -size4);
                }
            }
            Intrinsics.checkNotNullParameter(oldList, str);
            o0000 o0000Var4 = o0000Var;
            Intrinsics.checkNotNullParameter(o0000Var4, str2);
            Intrinsics.checkNotNullParameter(newList, "newList");
            if (o0000Var4.f28692OooO0O0) {
                int i40 = i3;
                int iOooO0O1 = i40 - oldList.OooO0O0();
                if (iOooO0O1 >= 0 && iOooO0O1 < oldList.OooO00o()) {
                    for (int i41 = 0; i41 < 30; i41++) {
                        int i42 = ((i41 / 2) * (i41 % 2 == 1 ? -1 : 1)) + iOooO0O1;
                        if (i42 >= 0 && i42 < oldList.OooO00o() && (iOooO00o = o0000Var4.f28691OooO00o.OooO00o(i42)) != -1) {
                            iCoerceIn = newList.OooO0O0() + iOooO00o;
                        }
                    }
                    iCoerceIn = RangesKt.coerceIn(i40, (ClosedRange<Integer>) RangesKt.until(0, newList.getSize()));
                } else {
                    iCoerceIn = RangesKt.coerceIn(i40, (ClosedRange<Integer>) RangesKt.until(0, newList.getSize()));
                }
            } else {
                iCoerceIn = RangesKt.coerceIn(i3, (ClosedRange<Integer>) RangesKt.until(0, newList.getSize()));
            }
            return Boxing.boxInt(iCoerceIn);
        }

        @Override // p089o000o000.o00O00
        public final boolean OooO0o0() {
            return this.f28657OooOOO0.f28652OooO0o;
        }
    }

    public static final class OooO0O0 implements o0OoOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooO0o<T> f28669OooO00o;

        public OooO0O0(OooO0o<T> oooO0o) {
            this.f28669OooO00o = oooO0o;
        }

        @Override // p089o000o000.o0OoOo0
        public final void OooO00o(int i, int i2) {
            if (i2 > 0) {
                this.f28669OooO00o.f28649OooO0O0.OooO00o(i, i2);
            }
        }

        @Override // p089o000o000.o0OoOo0
        public final void OooO0O0(int i, int i2) {
            if (i2 > 0) {
                this.f28669OooO00o.f28649OooO0O0.OooO0O0(i, i2);
            }
        }

        @Override // p089o000o000.o0OoOo0
        public final void OooO0OO(int i, int i2) {
            if (i2 > 0) {
                this.f28669OooO00o.f28649OooO0O0.OooO0Oo(i, i2, null);
            }
        }
    }

    @JvmOverloads
    public OooO0o(@NotNull OooOo.OooO<T> diffCallback, @NotNull o0ooOOo updateCallback, @NotNull CoroutineContext mainDispatcher, @NotNull CoroutineContext workerDispatcher) {
        Intrinsics.checkNotNullParameter(diffCallback, "diffCallback");
        Intrinsics.checkNotNullParameter(updateCallback, "updateCallback");
        Intrinsics.checkNotNullParameter(mainDispatcher, "mainDispatcher");
        Intrinsics.checkNotNullParameter(workerDispatcher, "workerDispatcher");
        this.f28648OooO00o = diffCallback;
        this.f28649OooO0O0 = updateCallback;
        this.f28650OooO0OO = mainDispatcher;
        this.f28651OooO0Oo = workerDispatcher;
        OooO0O0 oooO0O0 = new OooO0O0(this);
        this.f28653OooO0o0 = oooO0O0;
        OooO00o oooO00o = new OooO00o(this, oooO0O0, mainDispatcher);
        this.f28654OooO0oO = oooO00o;
        this.f28655OooO0oo = new AtomicInteger(0);
        this.f28647OooO = oooO00o.f28915OooOO0O;
        this.f28656OooOO0 = FlowKt.asSharedFlow(oooO00o.f28916OooOO0o);
    }
}
