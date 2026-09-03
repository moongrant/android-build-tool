package p535o0o0OOoO;

import OooO00o.OooO00o;
import com.android.billingclient.api.o00000O;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o000OO00;
import p166o00OoOoo.o0O00O0o;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p499o0o00OoO.o00000;
import p499o0o00OoO.o000OOo;
import p499o0o00OoO.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.MainActivity$initObserverOnLogin$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oO0O00o0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public oO0O00o0(Continuation<? super oO0O00o0> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO0O00o0(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new oO0O00o0(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o0O00O0o o0o00o0oOooO0O0 = o00000O.OooO0O0();
        Objects.requireNonNull(o0o00o0oOooO0O0);
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("NewTask");
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        sbOooO0o0.append(oooOOO.OooOo().getValue());
        if (o0o00o0oOooO0O0.OooO0Oo(sbOooO0o0.toString(), false)) {
            SharedMainMessageManager.INSTANCE.getHaveRewardTask().postValue(Boxing.boxBoolean(true));
        }
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        o000OOo o000oooOooO0oo = OooOOO0.OooO0oo();
        Objects.requireNonNull(o000oooOooO0oo);
        if (o000oooOooO0oo.OooO00o("achievementTask" + oooOOO.OooOo().getValue(), false)) {
            SharedMainMessageManager.INSTANCE.getHaveAchievementRewardTask().postValue(Boxing.boxBoolean(true));
        }
        o0OO00O o0oo00oOooO0o0 = OooOOO0.OooO0o0();
        StringBuilder sbOooO00o = o000OO00.OooO00o(o0oo00oOooO0o0, "uniqueMessageDot");
        sbOooO00o.append(oooOOO.OooOo().getValue());
        String string = sbOooO00o.toString();
        Boolean value = oooOOO.OooOooO().getValue();
        Boolean bool = Boolean.TRUE;
        if (o0oo00oOooO0o0.OooO00o(string, Intrinsics.areEqual(value, bool) && Intrinsics.areEqual(oooOOO.OooOooo().getValue(), Boolean.FALSE))) {
            SharedMainMessageManager.INSTANCE.getUniqueMessageDot().postValue(Boxing.boxBoolean(true));
        }
        o0OO00O o0oo00oOooO0o1 = OooOOO0.OooO0o0();
        StringBuilder sbOooO00o2 = o000OO00.OooO00o(o0oo00oOooO0o1, "storeBubbleDot");
        sbOooO00o2.append(oooOOO.OooOo().getValue());
        if (o0oo00oOooO0o1.OooO00o(sbOooO00o2.toString(), Intrinsics.areEqual(oooOOO.OooOooO().getValue(), bool) && Intrinsics.areEqual(oooOOO.OooOooo().getValue(), Boolean.FALSE))) {
            SharedMainMessageManager.INSTANCE.getStoreBubbleDot().postValue(Boxing.boxBoolean(true));
        }
        if (!OooOOO.f41218OooO0OO) {
            o00000 o00000VarOooOO0O = OooOOO0.OooOO0O();
            Objects.requireNonNull(o00000VarOooOO0O);
            if (!o00000VarOooOO0O.OooO00o("premiumRedDot_MomentEdit_Hide4Main" + oooOOO.OooOo().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getPremiumMomentEditRedDot().postValue(Boxing.boxBoolean(true));
            }
            o00000 o00000VarOooOO0O2 = OooOOO0.OooOO0O();
            Objects.requireNonNull(o00000VarOooOO0O2);
            if (!o00000VarOooOO0O2.OooO00o("vipRedDot_CustomRoomTheme_Hide4Main" + oooOOO.OooOo().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_CustomRoomTheme().postValue(Boxing.boxBoolean(true));
            }
            o00000 o00000VarOooOO0O3 = OooOOO0.OooOO0O();
            Objects.requireNonNull(o00000VarOooOO0O3);
            if (!o00000VarOooOO0O3.OooO00o("vipRedDot_ExclusiveBubble_Hide4Main" + oooOOO.OooOo().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_ExclusiveBubble().postValue(Boxing.boxBoolean(true));
            }
            o00000 o00000VarOooOO0O4 = OooOOO0.OooOO0O();
            Objects.requireNonNull(o00000VarOooOO0O4);
            if (!o00000VarOooOO0O4.OooO00o("vipRedDot_IncognitoAccess_Hide4Main" + oooOOO.OooOo().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_IncognitoAccess().postValue(Boxing.boxBoolean(true));
            }
        }
        return Unit.INSTANCE;
    }
}
