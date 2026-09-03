package o000O00O;

import androidx.paging.DiffingChangePayload;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends androidx.paging.o0Oo0oo<Object> {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final /* synthetic */ OooO00o<Object> f34446OooOOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(OooO00o oooO00o, OooO oooO, CoroutineContext coroutineContext) {
        super(oooO, coroutineContext, null);
        this.f34446OooOOO = oooO00o;
    }

    @Override // androidx.paging.o0Oo0oo
    public final boolean OooO0OO() {
        return this.f34446OooOOO.f34430OooO0o;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.paging.o0Oo0oo
    @Nullable
    public final Object OooO0Oo(@NotNull androidx.paging.o0ooOOo o0ooooo, @NotNull androidx.paging.o0ooOOo o0ooooo2, int i, @NotNull o000O0O0 o000o0o1, @NotNull Continuation continuation) throws Throwable {
        OooO0O0 oooO0O0;
        Function0 function0;
        int i2;
        OooO0o oooO0o;
        o00000O0 o00000o1;
        int i3;
        String str;
        androidx.recyclerview.widget.OooOo.OooO0o oooO0o2;
        String str2;
        String str3;
        int iCoerceIn;
        androidx.recyclerview.widget.OooOo.OooO0o oooO0o3;
        int i4;
        int[] iArr;
        String str4;
        androidx.recyclerview.widget.OooOo.OooO0O0 oooO0O1;
        int i5;
        String str5;
        androidx.recyclerview.widget.OooOo.OooO0o oooO0o4;
        o00000O o00000o;
        String str6;
        int i6;
        o00000O oldList = o0ooooo;
        o00000O newList = o0ooooo2;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i7 = oooO0O0.f34442OooOO0O;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                oooO0O0.f34442OooOO0O = i7 - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(this, continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(this, continuation);
        }
        Object objWithContext = oooO0O0.f34435OooO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i8 = oooO0O0.f34442OooOO0O;
        if (i8 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            int size = o0ooooo.getSize();
            OooO00o<Object> oooO00o = this.f34446OooOOO;
            if (size == 0) {
                o000o0o1.invoke();
                oooO00o.f34431OooO0o0.OooO00o(0, o0ooooo2.getSize());
                return null;
            }
            if (o0ooooo2.getSize() == 0) {
                o000o0o1.invoke();
                oooO00o.f34431OooO0o0.OooO0O0(0, o0ooooo.getSize());
                return null;
            }
            CoroutineContext coroutineContext = oooO00o.f34429OooO0Oo;
            OooO0OO oooO0OO = new OooO0OO(oldList, newList, oooO00o, null);
            oooO0O0.f34436OooO0Oo = this;
            oooO0O0.f34438OooO0o0 = oldList;
            oooO0O0.f34437OooO0o = newList;
            function0 = o000o0o1;
            oooO0O0.f34439OooO0oO = function0;
            i2 = i;
            oooO0O0.f34440OooO0oo = i2;
            oooO0O0.f34442OooOO0O = 1;
            objWithContext = BuildersKt.withContext(coroutineContext, oooO0OO, oooO0O0);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            oooO0o = this;
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i9 = oooO0O0.f34440OooO0oo;
            Function0 function1 = oooO0O0.f34439OooO0oO;
            o00000O o00000o2 = oooO0O0.f34437OooO0o;
            o00000O o00000o3 = oooO0O0.f34438OooO0o0;
            oooO0o = oooO0O0.f34436OooO0Oo;
            ResultKt.throwOnFailure(objWithContext);
            i2 = i9;
            oldList = o00000o3;
            function0 = function1;
            newList = o00000o2;
        }
        o00000O0 diffResult = (o00000O0) objWithContext;
        function0.invoke();
        androidx.recyclerview.widget.o0ooOOo callback = oooO0o.f34446OooOOO.f34427OooO0O0;
        String str7 = "<this>";
        Intrinsics.checkNotNullParameter(oldList, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String str8 = "newList";
        Intrinsics.checkNotNullParameter(newList, "newList");
        String str9 = "diffResult";
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        boolean z = diffResult.f34495OooO0O0;
        androidx.recyclerview.widget.OooOo.OooO0o oooO0o5 = diffResult.f34494OooO00o;
        if (z) {
            Intrinsics.checkNotNullParameter(oldList, "oldList");
            Intrinsics.checkNotNullParameter(newList, "newList");
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(diffResult, "diffResult");
            o0000Ooo o0000ooo = new o0000Ooo(oldList, newList, callback);
            oooO0o5.getClass();
            androidx.recyclerview.widget.OooO0OO oooO0OO2 = o0000ooo instanceof androidx.recyclerview.widget.OooO0OO ? (androidx.recyclerview.widget.OooO0OO) o0000ooo : new androidx.recyclerview.widget.OooO0OO(o0000ooo);
            ArrayDeque arrayDeque = new ArrayDeque();
            List<androidx.recyclerview.widget.OooOo.OooO0OO> list = oooO0o5.f7563OooO00o;
            int size2 = list.size() - 1;
            int i10 = oooO0o5.f7568OooO0o0;
            int i11 = oooO0o5.f7567OooO0o;
            int i12 = size2;
            int i13 = i10;
            while (i12 >= 0) {
                int i14 = i11;
                androidx.recyclerview.widget.OooOo.OooO0OO oooO0OO3 = list.get(i12);
                int i15 = i10;
                int i16 = oooO0OO3.f7560OooO00o;
                List<androidx.recyclerview.widget.OooOo.OooO0OO> list2 = list;
                int i17 = oooO0OO3.f7562OooO0OO;
                int i18 = i16 + i17;
                int i19 = i13;
                int i20 = oooO0OO3.f7561OooO0O0;
                int i21 = i2;
                int i22 = i17 + i20;
                int i23 = i15;
                int i24 = i19;
                o00000O0 o00000o4 = diffResult;
                while (true) {
                    iArr = oooO0o5.f7564OooO0O0;
                    str4 = str9;
                    oooO0O1 = oooO0o5.f7566OooO0Oo;
                    if (i24 <= i18) {
                        break;
                    }
                    i24--;
                    int i25 = iArr[i24];
                    if ((i25 & 12) != 0) {
                        i6 = i18;
                        int i26 = i25 >> 4;
                        o00000o = newList;
                        str6 = str7;
                        androidx.recyclerview.widget.OooOo.OooOO0 oooOO0OooO0O0 = androidx.recyclerview.widget.OooOo.OooO0o.OooO0O0(arrayDeque, i26, false);
                        if (oooOO0OooO0O0 != null) {
                            int i27 = (i23 - oooOO0OooO0O0.f7571OooO0O0) - 1;
                            oooO0OO2.OooO0Oo(i24, i27);
                            if ((i25 & 4) != 0) {
                                oooO0OO2.OooO0OO(i27, 1, oooO0O1.OooO0OO(i24, i26));
                            }
                        } else {
                            arrayDeque.add(new androidx.recyclerview.widget.OooOo.OooOO0(i24, (i23 - i24) - 1, true));
                        }
                    } else {
                        o00000o = newList;
                        str6 = str7;
                        i6 = i18;
                        oooO0OO2.OooO0O0(i24, 1);
                        i23--;
                    }
                    str9 = str4;
                    i18 = i6;
                    str7 = str6;
                    newList = o00000o;
                }
                o00000O o00000o5 = newList;
                String str10 = str7;
                int i28 = i14;
                i10 = i23;
                while (i28 > i22) {
                    i28--;
                    int i29 = oooO0o5.f7565OooO0OO[i28];
                    if ((i29 & 12) != 0) {
                        i5 = i22;
                        int i30 = i29 >> 4;
                        str5 = str8;
                        oooO0o4 = oooO0o5;
                        androidx.recyclerview.widget.OooOo.OooOO0 oooOO0OooO0O1 = androidx.recyclerview.widget.OooOo.OooO0o.OooO0O0(arrayDeque, i30, true);
                        if (oooOO0OooO0O1 == null) {
                            arrayDeque.add(new androidx.recyclerview.widget.OooOo.OooOO0(i28, i10 - i24, false));
                        } else {
                            oooO0OO2.OooO0Oo((i10 - oooOO0OooO0O1.f7571OooO0O0) - 1, i24);
                            if ((i29 & 4) != 0) {
                                oooO0OO2.OooO0OO(i24, 1, oooO0O1.OooO0OO(i30, i28));
                            }
                        }
                    } else {
                        i5 = i22;
                        str5 = str8;
                        oooO0o4 = oooO0o5;
                        oooO0OO2.OooO00o(i24, 1);
                        i10++;
                    }
                    i22 = i5;
                    oooO0o5 = oooO0o4;
                    str8 = str5;
                }
                String str11 = str8;
                androidx.recyclerview.widget.OooOo.OooO0o oooO0o6 = oooO0o5;
                i13 = oooO0OO3.f7560OooO00o;
                int i31 = i20;
                int i32 = i13;
                for (int i33 = 0; i33 < i17; i33++) {
                    if ((iArr[i32] & 15) == 2) {
                        oooO0OO2.OooO0OO(i32, 1, oooO0O1.OooO0OO(i32, i31));
                    }
                    i32++;
                    i31++;
                }
                i12--;
                i11 = i20;
                diffResult = o00000o4;
                i2 = i21;
                list = list2;
                oooO0o5 = oooO0o6;
                str9 = str4;
                str8 = str11;
                str7 = str10;
                newList = o00000o5;
            }
            o00000O o00000o6 = newList;
            o00000o1 = diffResult;
            String str12 = str7;
            i3 = i2;
            String str13 = str8;
            str = str9;
            oooO0o2 = oooO0o5;
            oooO0OO2.OooO0o0();
            o00000O<T> o00000o7 = o0000ooo.f34511OooO00o;
            int iMin = Math.min(o00000o7.OooO0O0(), o0000ooo.f34514OooO0Oo);
            o00000O<T> o00000o8 = o0000ooo.f34512OooO0O0;
            int iOooO0O0 = o00000o8.OooO0O0() - o0000ooo.f34514OooO0Oo;
            androidx.recyclerview.widget.o0ooOOo o0ooooo3 = o0000ooo.f34513OooO0OO;
            if (iOooO0O0 > 0) {
                if (iMin > 0) {
                    i4 = 0;
                    o0ooooo3.OooO0OO(0, iMin, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                } else {
                    i4 = 0;
                }
                o0ooooo3.OooO00o(i4, iOooO0O0);
            } else if (iOooO0O0 < 0) {
                o0ooooo3.OooO0O0(0, -iOooO0O0);
                int i34 = iMin + iOooO0O0;
                if (i34 > 0) {
                    o0ooooo3.OooO0OO(0, i34, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            o0000ooo.f34514OooO0Oo = o00000o8.OooO0O0();
            int iMin2 = Math.min(o00000o7.OooO0OO(), o0000ooo.f34516OooO0o0);
            int iOooO0OO = o00000o8.OooO0OO();
            int i35 = o0000ooo.f34516OooO0o0;
            int i36 = iOooO0OO - i35;
            int i37 = o0000ooo.f34514OooO0Oo + o0000ooo.f34515OooO0o + i35;
            int i38 = i37 - iMin2;
            boolean z2 = i38 != o00000o7.getSize() - iMin2;
            if (i36 > 0) {
                o0ooooo3.OooO00o(i37, i36);
            } else if (i36 < 0) {
                o0ooooo3.OooO0O0(i37 + i36, -i36);
                iMin2 += i36;
            }
            if (iMin2 > 0 && z2) {
                o0ooooo3.OooO0OO(i38, iMin2, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
            }
            o0000ooo.f34516OooO0o0 = o00000o8.OooO0OO();
            str2 = str13;
            str3 = str12;
            newList = o00000o6;
        } else {
            o00000o1 = diffResult;
            i3 = i2;
            str = "diffResult";
            oooO0o2 = oooO0o5;
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(oldList, "oldList");
            str2 = "newList";
            Intrinsics.checkNotNullParameter(newList, str2);
            int iMax = Math.max(oldList.OooO0O0(), newList.OooO0O0());
            int iMin3 = Math.min(oldList.OooO00o() + oldList.OooO0O0(), newList.OooO00o() + newList.OooO0O0());
            int i39 = iMin3 - iMax;
            if (i39 > 0) {
                callback.OooO0O0(iMax, i39);
                callback.OooO00o(iMax, i39);
            }
            int iMin4 = Math.min(iMax, iMin3);
            int iMax2 = Math.max(iMax, iMin3);
            int iCoerceAtMost = RangesKt.coerceAtMost(oldList.OooO0O0(), newList.getSize());
            int iCoerceAtMost2 = RangesKt.coerceAtMost(oldList.OooO00o() + oldList.OooO0O0(), newList.getSize());
            DiffingChangePayload diffingChangePayload = DiffingChangePayload.ITEM_TO_PLACEHOLDER;
            int i40 = iMin4 - iCoerceAtMost;
            if (i40 > 0) {
                callback.OooO0OO(iCoerceAtMost, i40, diffingChangePayload);
            }
            int i41 = iCoerceAtMost2 - iMax2;
            if (i41 > 0) {
                callback.OooO0OO(iMax2, i41, diffingChangePayload);
            }
            int iCoerceAtMost3 = RangesKt.coerceAtMost(newList.OooO0O0(), oldList.getSize());
            int iCoerceAtMost4 = RangesKt.coerceAtMost(newList.OooO00o() + newList.OooO0O0(), oldList.getSize());
            DiffingChangePayload diffingChangePayload2 = DiffingChangePayload.PLACEHOLDER_TO_ITEM;
            int i42 = iMin4 - iCoerceAtMost3;
            if (i42 > 0) {
                callback.OooO0OO(iCoerceAtMost3, i42, diffingChangePayload2);
            }
            int i43 = iCoerceAtMost4 - iMax2;
            if (i43 > 0) {
                callback.OooO0OO(iMax2, i43, diffingChangePayload2);
            }
            int size3 = newList.getSize() - oldList.getSize();
            if (size3 > 0) {
                callback.OooO00o(oldList.getSize(), size3);
            } else if (size3 < 0) {
                callback.OooO0O0(oldList.getSize() + size3, -size3);
            }
            str3 = "<this>";
        }
        Intrinsics.checkNotNullParameter(oldList, str3);
        o00000O0 o00000o9 = o00000o1;
        Intrinsics.checkNotNullParameter(o00000o9, str);
        Intrinsics.checkNotNullParameter(newList, str2);
        if (o00000o9.f34495OooO0O0) {
            int i44 = i3;
            int iOooO0O1 = i44 - oldList.OooO0O0();
            if (iOooO0O1 >= 0 && iOooO0O1 < oldList.OooO00o()) {
                int i45 = 0;
                while (i45 < 30) {
                    int i46 = ((i45 / 2) * (i45 % 2 == 1 ? -1 : 1)) + iOooO0O1;
                    if (i46 < 0 || i46 >= oldList.OooO00o()) {
                        oooO0o3 = oooO0o2;
                    } else {
                        oooO0o3 = oooO0o2;
                        int iOooO00o = oooO0o3.OooO00o(i46);
                        if (iOooO00o != -1) {
                            iCoerceIn = newList.OooO0O0() + iOooO00o;
                        }
                    }
                    i45++;
                    oooO0o2 = oooO0o3;
                }
                iCoerceIn = RangesKt___RangesKt.coerceIn(i44, (ClosedRange<Integer>) RangesKt.until(0, newList.getSize()));
            } else {
                iCoerceIn = RangesKt___RangesKt.coerceIn(i44, (ClosedRange<Integer>) RangesKt.until(0, newList.getSize()));
            }
        } else {
            iCoerceIn = RangesKt___RangesKt.coerceIn(i3, (ClosedRange<Integer>) RangesKt.until(0, newList.getSize()));
        }
        return Boxing.boxInt(iCoerceIn);
    }
}
