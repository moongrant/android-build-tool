package p486o0o00O00;

import com.android.billingclient.api.o0000OO0;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
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
import p101o000oo.Oooo000;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00000;
import p409o0Oo0o0o.o00000OO;
import p409o0Oo0o0o.o0O0O00;
import p464o0Oooo.o000000O;
import p480o0o000Oo.o0OOO0o;
import p509o0o0O0.o0O0o;
import p513o0o0O00o.OooOo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.MainActivity$initObserverOnLogin$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000OO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public o000OO0O(Continuation<? super o000OO0O> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000OO0O(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new o000OO0O(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o0OOO0o o0ooo0oOooO0O0 = o0000OO0.OooO0O0();
        o0ooo0oOooO0O0.getClass();
        StringBuilder sb = new StringBuilder("NewTask");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        sb.append(o000000O.OooOOo0().getValue());
        if (o0ooo0oOooO0O0.OooO0O0(sb.toString(), false)) {
            SharedMainMessageManager.INSTANCE.getHaveRewardTask().postValue(Boxing.boxBoolean(true));
        }
        o00000 o00000Var = (o00000) o00Oo0.f45183OooO0oo.getValue();
        o00000Var.getClass();
        if (o00000Var.OooO0O0("achievementTask" + o000000O.OooOOo0().getValue(), false)) {
            SharedMainMessageManager.INSTANCE.getHaveAchievementRewardTask().postValue(Boxing.boxBoolean(true));
        }
        o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
        o0o0o00OooO0o0.getClass();
        String strOooO00o = Oooo000.OooO00o("uniqueMessageDot", o000000O.OooOOo0().getValue());
        T value = o000000O.OooOo0O().getValue();
        Boolean bool = Boolean.TRUE;
        if (o0o0o00OooO0o0.OooO0O0(strOooO00o, Intrinsics.areEqual(value, bool) && Intrinsics.areEqual(o000000O.OooOo0o().getValue(), Boolean.FALSE))) {
            SharedMainMessageManager.INSTANCE.getUniqueMessageDot().postValue(Boxing.boxBoolean(true));
        }
        o0O0O00 o0o0o00OooO0o1 = o00Oo0.OooO0o0();
        o0o0o00OooO0o1.getClass();
        if (o0o0o00OooO0o1.OooO0O0(Oooo000.OooO00o("storeBubbleDot", o000000O.OooOOo0().getValue()), Intrinsics.areEqual(o000000O.OooOo0O().getValue(), bool) && Intrinsics.areEqual(o000000O.OooOo0o().getValue(), Boolean.FALSE))) {
            SharedMainMessageManager.INSTANCE.getStoreBubbleDot().postValue(Boxing.boxBoolean(true));
        }
        OooOo.f51554OooO0O0.postValue(Boxing.boxBoolean(false));
        o0O0o.f51161OooO00o.postValue(Boxing.boxBoolean(true));
        if (!o000000O.f46677OooO0Oo) {
            o00000OO o00000ooOooOO0O = o00Oo0.OooOO0O();
            o00000ooOooOO0O.getClass();
            if (!o00000ooOooOO0O.OooO0O0("premiumRedDot_MomentEdit_Hide4Main" + o000000O.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getPremiumMomentEditRedDot().postValue(Boxing.boxBoolean(true));
            }
            o00000OO o00000ooOooOO0O2 = o00Oo0.OooOO0O();
            o00000ooOooOO0O2.getClass();
            if (!o00000ooOooOO0O2.OooO0O0("vipRedDot_CustomRoomTheme_Hide4Main" + o000000O.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_CustomRoomTheme().postValue(Boxing.boxBoolean(true));
            }
            o00000OO o00000ooOooOO0O3 = o00Oo0.OooOO0O();
            o00000ooOooOO0O3.getClass();
            if (!o00000ooOooOO0O3.OooO0O0("vipRedDot_ExclusiveBubble_Hide4Main" + o000000O.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_ExclusiveBubble().postValue(Boxing.boxBoolean(true));
            }
            o00000OO o00000ooOooOO0O4 = o00Oo0.OooOO0O();
            o00000ooOooOO0O4.getClass();
            if (!o00000ooOooOO0O4.OooO0O0("vipRedDot_IncognitoAccess_Hide4Main" + o000000O.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_IncognitoAccess().postValue(Boxing.boxBoolean(true));
            }
            o00000OO o00000ooOooOO0O5 = o00Oo0.OooOO0O();
            o00000ooOooOO0O5.getClass();
            if (!o00000ooOooOO0O5.OooO0O0("vipRedDot_ExclusiveBackpackGift_Hide4Main" + o000000O.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_ExclusiveBackpackGift().postValue(Boxing.boxBoolean(true));
            }
            o00000OO o00000ooOooOO0O6 = o00Oo0.OooOO0O();
            o00000ooOooOO0O6.getClass();
            if (!o00000ooOooOO0O6.OooO0O0("vipRedDot_ExclusiveGiftRunway_Hide4Main" + o000000O.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_ExclusiveGiftRunway().postValue(Boxing.boxBoolean(true));
            }
        }
        return Unit.INSTANCE;
    }
}
