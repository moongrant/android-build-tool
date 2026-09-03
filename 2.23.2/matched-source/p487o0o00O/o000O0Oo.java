package p487o0o00O;

import androidx.media3.session.o00O0O0;
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
import p269o00oooo0.o0O0oo0o;
import p414o0Oo0oO.oO0O0OoO;
import p414o0Oo0oO.oO0OOo0o;
import p414o0Oo0oO.oOo00OO0;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p477o0o00.OooO0o;
import p519o0o0O0OO.o0OO0;
import p536o0o0Oo00.OooO0OO;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.main.MainActivity$initObserverOnLogin$1", f = "MainActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000O0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public o000O0Oo(Continuation<? super o000O0Oo> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O0Oo(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new o000O0Oo(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        OooO0o oooO0oOooO00o = o0O0oo0o.OooO00o();
        oooO0oOooO00o.getClass();
        StringBuilder sb = new StringBuilder("NewTask");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        sb.append(o0O00oO0.OooOOo0().getValue());
        if (oooO0oOooO00o.OooO0O0(sb.toString(), false)) {
            SharedMainMessageManager.INSTANCE.getHaveRewardTask().postValue(Boxing.boxBoolean(true));
        }
        oO0O0OoO oo0o0ooo = (oO0O0OoO) o00Ooo.f46414OooO0oo.getValue();
        oo0o0ooo.getClass();
        if (oo0o0ooo.OooO0O0("achievementTask" + o0O00oO0.OooOOo0().getValue(), false)) {
            SharedMainMessageManager.INSTANCE.getHaveAchievementRewardTask().postValue(Boxing.boxBoolean(true));
        }
        oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
        oo0ooo0oOooO0o0.getClass();
        String strOooO0O0 = o00O0O0.OooO0O0("uniqueMessageDot", o0O00oO0.OooOOo0().getValue());
        T value = o0O00oO0.OooOo0O().getValue();
        Boolean bool = Boolean.TRUE;
        if (oo0ooo0oOooO0o0.OooO0O0(strOooO0O0, Intrinsics.areEqual(value, bool) && Intrinsics.areEqual(o0O00oO0.OooOo0o().getValue(), Boolean.FALSE))) {
            SharedMainMessageManager.INSTANCE.getUniqueMessageDot().postValue(Boxing.boxBoolean(true));
        }
        oO0OOo0o oo0ooo0oOooO0o1 = o00Ooo.OooO0o0();
        oo0ooo0oOooO0o1.getClass();
        if (oo0ooo0oOooO0o1.OooO0O0(o00O0O0.OooO0O0("storeBubbleDot", o0O00oO0.OooOOo0().getValue()), Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), bool) && Intrinsics.areEqual(o0O00oO0.OooOo0o().getValue(), Boolean.FALSE))) {
            SharedMainMessageManager.INSTANCE.getStoreBubbleDot().postValue(Boxing.boxBoolean(true));
        }
        OooO0OO.f54352OooO0O0.postValue(Boxing.boxBoolean(false));
        o0OO0.f52405OooO00o.postValue(Boxing.boxBoolean(true));
        if (!o0O00oO0.f47939OooO0Oo) {
            oOo00OO0 ooo00oo0OooOO0O = o00Ooo.OooOO0O();
            ooo00oo0OooOO0O.getClass();
            if (!ooo00oo0OooOO0O.OooO0O0("premiumRedDot_MomentEdit_Hide4Main" + o0O00oO0.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getPremiumMomentEditRedDot().postValue(Boxing.boxBoolean(true));
            }
            oOo00OO0 ooo00oo0OooOO0O2 = o00Ooo.OooOO0O();
            ooo00oo0OooOO0O2.getClass();
            if (!ooo00oo0OooOO0O2.OooO0O0("vipRedDot_CustomRoomTheme_Hide4Main" + o0O00oO0.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_CustomRoomTheme().postValue(Boxing.boxBoolean(true));
            }
            oOo00OO0 ooo00oo0OooOO0O3 = o00Ooo.OooOO0O();
            ooo00oo0OooOO0O3.getClass();
            if (!ooo00oo0OooOO0O3.OooO0O0("vipRedDot_ExclusiveBubble_Hide4Main" + o0O00oO0.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_ExclusiveBubble().postValue(Boxing.boxBoolean(true));
            }
            oOo00OO0 ooo00oo0OooOO0O4 = o00Ooo.OooOO0O();
            ooo00oo0OooOO0O4.getClass();
            if (!ooo00oo0OooOO0O4.OooO0O0("vipRedDot_IncognitoAccess_Hide4Main" + o0O00oO0.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_IncognitoAccess().postValue(Boxing.boxBoolean(true));
            }
            oOo00OO0 ooo00oo0OooOO0O5 = o00Ooo.OooOO0O();
            ooo00oo0OooOO0O5.getClass();
            if (!ooo00oo0OooOO0O5.OooO0O0("vipRedDot_ExclusiveBackpackGift_Hide4Main" + o0O00oO0.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_ExclusiveBackpackGift().postValue(Boxing.boxBoolean(true));
            }
            oOo00OO0 ooo00oo0OooOO0O6 = o00Ooo.OooOO0O();
            ooo00oo0OooOO0O6.getClass();
            if (!ooo00oo0OooOO0O6.OooO0O0("vipRedDot_ExclusiveGiftRunway_Hide4Main" + o0O00oO0.OooOOo0().getValue(), false)) {
                SharedMainMessageManager.INSTANCE.getVipRedDot_ExclusiveGiftRunway().postValue(Boxing.boxBoolean(true));
            }
        }
        return Unit.INSTANCE;
    }
}
