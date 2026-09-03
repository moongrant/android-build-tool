package p492o0o00O0O;

import androidx.media3.session.o00O00;
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
import p270o00oooo0.o0O0OO0;
import p416o0Oo0oO.oO0O0OoO;
import p416o0Oo0oO.oO0OOo0o;
import p416o0Oo0oO.oOo00OO0;
import p417o0Oo0oO0.o00Oo0;
import p474o0OoooOO.oo0oO0;
import p487o0o000oO.o0000;
import p519o0o0O0O.o0oOO;
import p520o0o0O0O0.OooO0OO;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.MainActivity$initObserverOnLogin$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public o000O(Continuation<? super o000O> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new o000O(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o0000 o0000VarOooO0O0 = o0O0OO0.OooO0O0();
        o0000VarOooO0O0.getClass();
        StringBuilder sb = new StringBuilder("NewTask");
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        sb.append(oo0oO0.OooOOo0().getValue());
        if (o0000VarOooO0O0.OooO0O0(sb.toString(), false)) {
            SharedMainMessageManager.INSTANCE.getHaveRewardTask().postValue(Boxing.boxBoolean(true));
        }
        oO0O0OoO oo0o0ooo = (oO0O0OoO) o00Oo0.f46413OooO0oo.getValue();
        oo0o0ooo.getClass();
        if (oo0o0ooo.OooO0O0("achievementTask" + oo0oO0.OooOOo0().getValue(), false)) {
            SharedMainMessageManager.INSTANCE.getHaveAchievementRewardTask().postValue(Boxing.boxBoolean(true));
        }
        oO0OOo0o oo0ooo0oOooO0o0 = o00Oo0.OooO0o0();
        oo0ooo0oOooO0o0.getClass();
        String strOooO00o = o00O00.OooO00o("uniqueMessageDot", oo0oO0.OooOOo0().getValue());
        T value = oo0oO0.OooOo0O().getValue();
        Boolean bool = Boolean.TRUE;
        if (oo0ooo0oOooO0o0.OooO0O0(strOooO00o, Intrinsics.areEqual(value, bool) && Intrinsics.areEqual(oo0oO0.OooOo0o().getValue(), Boolean.FALSE))) {
            SharedMainMessageManager.INSTANCE.getUniqueMessageDot().postValue(Boxing.boxBoolean(true));
        }
        oO0OOo0o oo0ooo0oOooO0o1 = o00Oo0.OooO0o0();
        oo0ooo0oOooO0o1.getClass();
        if (oo0ooo0oOooO0o1.OooO0O0(o00O00.OooO00o("storeBubbleDot", oo0oO0.OooOOo0().getValue()), Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), bool) && Intrinsics.areEqual(oo0oO0.OooOo0o().getValue(), Boolean.FALSE))) {
            SharedMainMessageManager.INSTANCE.getStoreBubbleDot().postValue(Boxing.boxBoolean(true));
        }
        OooO0OO.f52741OooO0O0.postValue(Boxing.boxBoolean(false));
        o0oOO.f52647OooO00o.postValue(Boxing.boxBoolean(true));
        if (!oo0oO0.f47970OooO0Oo) {
            oOo00OO0 ooo00oo0OooOO0O = o00Oo0.OooOO0O();
            ooo00oo0OooOO0O.getClass();
            if (!ooo00oo0OooOO0O.OooO0O0("premiumRedDot_MomentEdit_Hide4Main" + oo0oO0.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getPremiumMomentEditRedDot().postValue(Boxing.boxBoolean(true));
            }
            oOo00OO0 ooo00oo0OooOO0O2 = o00Oo0.OooOO0O();
            ooo00oo0OooOO0O2.getClass();
            if (!ooo00oo0OooOO0O2.OooO0O0("vipRedDot_CustomRoomTheme_Hide4Main" + oo0oO0.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_CustomRoomTheme().postValue(Boxing.boxBoolean(true));
            }
            oOo00OO0 ooo00oo0OooOO0O3 = o00Oo0.OooOO0O();
            ooo00oo0OooOO0O3.getClass();
            if (!ooo00oo0OooOO0O3.OooO0O0("vipRedDot_ExclusiveBubble_Hide4Main" + oo0oO0.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_ExclusiveBubble().postValue(Boxing.boxBoolean(true));
            }
            oOo00OO0 ooo00oo0OooOO0O4 = o00Oo0.OooOO0O();
            ooo00oo0OooOO0O4.getClass();
            if (!ooo00oo0OooOO0O4.OooO0O0("vipRedDot_IncognitoAccess_Hide4Main" + oo0oO0.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_IncognitoAccess().postValue(Boxing.boxBoolean(true));
            }
            oOo00OO0 ooo00oo0OooOO0O5 = o00Oo0.OooOO0O();
            ooo00oo0OooOO0O5.getClass();
            if (!ooo00oo0OooOO0O5.OooO0O0("vipRedDot_ExclusiveBackpackGift_Hide4Main" + oo0oO0.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_ExclusiveBackpackGift().postValue(Boxing.boxBoolean(true));
            }
            oOo00OO0 ooo00oo0OooOO0O6 = o00Oo0.OooOO0O();
            ooo00oo0OooOO0O6.getClass();
            if (!ooo00oo0OooOO0O6.OooO0O0("vipRedDot_ExclusiveGiftRunway_Hide4Main" + oo0oO0.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_ExclusiveGiftRunway().postValue(Boxing.boxBoolean(true));
            }
        }
        return Unit.INSTANCE;
    }
}
