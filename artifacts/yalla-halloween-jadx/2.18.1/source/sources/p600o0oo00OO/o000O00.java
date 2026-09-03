package p600o0oo00OO;

import com.app.base.model.UserHeadFrameModel;
import com.google.android.gms.common.util.CollectionUtils;
import com.yalla.yalla.ui.vm.user.HeadFrameViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p029Oooo0oO.o00OO;
import p029Oooo0oO.o00OOO00;
import p029Oooo0oO.oo00o;
import p043OooooO0.o00O0000;
import p047Oooooo0.o00OO0OO;
import p100o000oOoO.oOO00O;
import p600o0oo00OO.o0000O;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O00 extends Lambda implements Function1<o00OOO00, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ HeadFrameViewModel f48037Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(HeadFrameViewModel headFrameViewModel) {
        super(1);
        this.f48037Oooo0o = headFrameViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00OOO00 o00ooo01) {
        o00OOO00 LazyVerticalGrid = o00ooo01;
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final o000Oo0 o000oo1 = new o000Oo0(this.f48037Oooo0o);
        if (!CollectionUtils.isEmpty(this.f48037Oooo0o.getUnLockHeaddressList())) {
            o000O000 o000o001 = o000O000.f48038Oooo0o;
            o000OO o000oo2 = o000OO.f48044OooO00o;
            o00OO.OooO00o(LazyVerticalGrid, null, o000o001, null, o000OO.f48045OooO0O0, 5, null);
            final o00OO0OO<UserHeadFrameModel> unLockHeaddressList = this.f48037Oooo0o.getUnLockHeaddressList();
            LazyVerticalGrid.OooO0O0(unLockHeaddressList.size(), null, null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.screen.user.HeaderFrameScreen$HeaddressList$3$1$1$invoke$$inlined$itemsIndexed$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    unLockHeaddressList.get(num.intValue());
                    return null;
                }
            }, o00O0000.OooO0O0(1229287273, true, new Function4<oo00o, Integer, oOO00O, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.user.HeaderFrameScreen$HeaddressList$3$1$1$invoke$$inlined$itemsIndexed$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(oo00o oo00oVar, Integer num, oOO00O ooo00o, Integer num2) {
                    int i;
                    oo00o items = oo00oVar;
                    int iIntValue = num.intValue();
                    oOO00O ooo00o2 = ooo00o;
                    int iIntValue2 = num2.intValue();
                    Intrinsics.checkNotNullParameter(items, "$this$items");
                    if ((iIntValue2 & 14) == 0) {
                        i = (ooo00o2.Oooo0oo(items) ? 4 : 2) | iIntValue2;
                    } else {
                        i = iIntValue2;
                    }
                    if ((iIntValue2 & 112) == 0) {
                        i |= ooo00o2.OooO(iIntValue) ? 32 : 16;
                    }
                    if ((i & 731) == 146 && ooo00o2.OooOo0()) {
                        ooo00o2.OooOoo0();
                    } else {
                        o0000O.OooO0oo(o0000O.f48009OooO00o, iIntValue, (UserHeadFrameModel) unLockHeaddressList.get(iIntValue), true, o000oo1, ooo00o2, ((((i & 112) | (i & 14)) >> 3) & 14) | 25024);
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        if (!CollectionUtils.isEmpty(this.f48037Oooo0o.getLockHeaddressList())) {
            o000O0o o000o0o2 = o000O0o.f48043Oooo0o;
            o000OO o000oo3 = o000OO.f48044OooO00o;
            o00OO.OooO00o(LazyVerticalGrid, null, o000o0o2, null, o000OO.f48046OooO0OO, 5, null);
            final o00OO0OO<UserHeadFrameModel> lockHeaddressList = this.f48037Oooo0o.getLockHeaddressList();
            LazyVerticalGrid.OooO0O0(lockHeaddressList.size(), null, null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.ui.screen.user.HeaderFrameScreen$HeaddressList$3$1$1$invoke$$inlined$itemsIndexed$default$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    lockHeaddressList.get(num.intValue());
                    return null;
                }
            }, o00O0000.OooO0O0(1229287273, true, new Function4<oo00o, Integer, oOO00O, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.user.HeaderFrameScreen$HeaddressList$3$1$1$invoke$$inlined$itemsIndexed$default$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(oo00o oo00oVar, Integer num, oOO00O ooo00o, Integer num2) {
                    int i;
                    oo00o items = oo00oVar;
                    int iIntValue = num.intValue();
                    oOO00O ooo00o2 = ooo00o;
                    int iIntValue2 = num2.intValue();
                    Intrinsics.checkNotNullParameter(items, "$this$items");
                    if ((iIntValue2 & 14) == 0) {
                        i = (ooo00o2.Oooo0oo(items) ? 4 : 2) | iIntValue2;
                    } else {
                        i = iIntValue2;
                    }
                    if ((iIntValue2 & 112) == 0) {
                        i |= ooo00o2.OooO(iIntValue) ? 32 : 16;
                    }
                    if ((i & 731) == 146 && ooo00o2.OooOo0()) {
                        ooo00o2.OooOoo0();
                    } else {
                        o0000O.OooO0oo(o0000O.f48009OooO00o, iIntValue, (UserHeadFrameModel) lockHeaddressList.get(iIntValue), false, o000oo1, ooo00o2, ((((i & 112) | (i & 14)) >> 3) & 14) | 25024);
                    }
                    return Unit.INSTANCE;
                }
            }));
        }
        return Unit.INSTANCE;
    }
}
