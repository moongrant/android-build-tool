package p609o0oo0O0o;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.BadgeRankDataModel;
import com.yalla.yalla.model.BadgeRankModel;
import com.yalla.yalla.ui.fragment.BadgeRankDataFragment;
import com.yalla.yalla.ui.fragment.BadgeRankFragment;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p520o0o0O0O0.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.user.BadgeRankVM$requestBadgeInfo$1", f = "BadgeRankVM.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
public final class o00O000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o00O00 f48354Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f48355Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ BadgeRankFragment.BadgeType f48356Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ BadgeRankDataFragment.BadgeRank f48357Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(BadgeRankFragment.BadgeType badgeType, BadgeRankDataFragment.BadgeRank badgeRank, o00O00 o00o01, Continuation<? super o00O000o> continuation) {
        super(2, continuation);
        this.f48356Oooo0oO = badgeType;
        this.f48357Oooo0oo = badgeRank;
        this.f48354Oooo = o00o01;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O000o(this.f48356Oooo0oO, this.f48357Oooo0oo, this.f48354Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List<BadgeRankDataModel> data;
        List<BadgeRankDataModel> data2;
        List<BadgeRankDataModel> data3;
        List<BadgeRankDataModel> data4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48355Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooOOO0 oooOOO0 = OooOOO0.f42243OooO00o;
            String value = this.f48356Oooo0oO.getValue();
            String value2 = this.f48357Oooo0oo.getValue();
            this.f48355Oooo0o = 1;
            obj = oooOOO0.OooO0Oo(value, value2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ApiResult apiResult = (ApiResult) obj;
        if (apiResult.isSuccess()) {
            BadgeRankModel badgeRankModel = (BadgeRankModel) apiResult.getData();
            if (badgeRankModel != null) {
                Boxing.boxBoolean(badgeRankModel.isOpenDiamondMedal());
            }
            o00O00 o00o01 = this.f48354Oooo;
            BadgeRankModel badgeRankModel2 = (BadgeRankModel) apiResult.getData();
            o00o01.f48344OooO00o = badgeRankModel2 != null && badgeRankModel2.isOpenDiamondMedal();
            BadgeRankFragment.BadgeType badgeType = BadgeRankFragment.BadgeType.GlobalType;
            BadgeRankFragment.BadgeType badgeType2 = this.f48356Oooo0oO;
            if (badgeType == badgeType2 && BadgeRankDataFragment.BadgeRank.TotalRank == this.f48357Oooo0oo) {
                o00O00 o00o02 = this.f48354Oooo;
                o00o02.f48346OooO0OO = o00O00.OooO0O0(o00o02, apiResult);
                o00O00 o00o03 = this.f48354Oooo;
                o00o03.f48345OooO0O0.postValue(o00o03.f48346OooO0OO);
                BadgeRankModel badgeRankModel3 = (BadgeRankModel) apiResult.getData();
                if (badgeRankModel3 != null && (data4 = badgeRankModel3.getData()) != null) {
                    this.f48354Oooo.f48350OooO0oO.postValue(data4);
                }
            } else if (badgeType == badgeType2 && BadgeRankDataFragment.BadgeRank.QuarterRank == this.f48357Oooo0oo) {
                o00O00 o00o04 = this.f48354Oooo;
                o00o04.f48347OooO0Oo = o00O00.OooO0O0(o00o04, apiResult);
                o00O00 o00o05 = this.f48354Oooo;
                o00o05.f48345OooO0O0.postValue(o00o05.f48347OooO0Oo);
                BadgeRankModel badgeRankModel4 = (BadgeRankModel) apiResult.getData();
                if (badgeRankModel4 != null && (data3 = badgeRankModel4.getData()) != null) {
                    this.f48354Oooo.f48351OooO0oo.postValue(data3);
                }
            } else {
                BadgeRankFragment.BadgeType badgeType3 = BadgeRankFragment.BadgeType.FriendType;
                if (badgeType3 == badgeType2 && BadgeRankDataFragment.BadgeRank.TotalRank == this.f48357Oooo0oo) {
                    o00O00 o00o06 = this.f48354Oooo;
                    o00o06.f48349OooO0o0 = o00O00.OooO0O0(o00o06, apiResult);
                    o00O00 o00o07 = this.f48354Oooo;
                    o00o07.f48345OooO0O0.postValue(o00o07.f48349OooO0o0);
                    BadgeRankModel badgeRankModel5 = (BadgeRankModel) apiResult.getData();
                    if (badgeRankModel5 != null && (data2 = badgeRankModel5.getData()) != null) {
                        this.f48354Oooo.f48343OooO.postValue(data2);
                    }
                } else if (badgeType3 == badgeType2 && BadgeRankDataFragment.BadgeRank.QuarterRank == this.f48357Oooo0oo) {
                    o00O00 o00o08 = this.f48354Oooo;
                    o00o08.f48348OooO0o = o00O00.OooO0O0(o00o08, apiResult);
                    o00O00 o00o09 = this.f48354Oooo;
                    o00o09.f48345OooO0O0.postValue(o00o09.f48348OooO0o);
                    BadgeRankModel badgeRankModel6 = (BadgeRankModel) apiResult.getData();
                    if (badgeRankModel6 != null && (data = badgeRankModel6.getData()) != null) {
                        this.f48354Oooo.f48352OooOO0.postValue(data);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
