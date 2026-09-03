package p588o0oOooOo;

import com.yalla.yalla.model.BadgeRankDataModel;
import com.yalla.yalla.model.BadgeRankModel;
import com.yalla.yalla.model.http.ApiResult;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p412o0Oo0o0O.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.user.BadgeRankVM$requestBadgeInfo$1", f = "BadgeRankVM.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nBadgeRankVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeRankVM.kt\ncom/yalla/yalla/ui/vm/user/BadgeRankVM$requestBadgeInfo$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
public final class z2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f57086OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ BadgeRankDataFragment.BadgeRank f57087OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ BadgeRankFragment.BadgeType f57088OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ a3 f57089OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(BadgeRankFragment.BadgeType badgeType, BadgeRankDataFragment.BadgeRank badgeRank, a3 a3Var, Continuation<? super z2> continuation) {
        super(2, continuation);
        this.f57088OooO0o0 = badgeType;
        this.f57087OooO0o = badgeRank;
        this.f57089OooO0oO = a3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new z2(this.f57088OooO0o0, this.f57087OooO0o, this.f57089OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((z2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List<BadgeRankDataModel> data;
        List<BadgeRankDataModel> data2;
        List<BadgeRankDataModel> data3;
        List<BadgeRankDataModel> data4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f57086OooO0Oo;
        BadgeRankFragment.BadgeType badgeType = this.f57088OooO0o0;
        BadgeRankDataFragment.BadgeRank badgeRank = this.f57087OooO0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o0000O0O o0000o0o2 = o0000O0O.f45951OooO00o;
            String value = badgeType.getValue();
            String value2 = badgeRank.getValue();
            this.f57086OooO0Oo = 1;
            obj = o0000o0o2.OooO0Oo(value, value2, this);
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
            BadgeRankModel badgeRankModel2 = (BadgeRankModel) apiResult.getData();
            boolean z = badgeRankModel2 != null && badgeRankModel2.isOpenDiamondMedal();
            a3 a3Var = this.f57089OooO0oO;
            a3Var.f57073OooO00o = z;
            BadgeRankFragment.BadgeType badgeType2 = BadgeRankFragment.BadgeType.GlobalType;
            if (badgeType2 == badgeType && BadgeRankDataFragment.BadgeRank.TotalRank == badgeRank) {
                a3Var.f57075OooO0OO = a3.OooO0O0(a3Var, apiResult);
                a3Var.f57074OooO0O0.postValue(a3Var.f57075OooO0OO);
                BadgeRankModel badgeRankModel3 = (BadgeRankModel) apiResult.getData();
                if (badgeRankModel3 != null && (data4 = badgeRankModel3.getData()) != null) {
                    a3Var.f57079OooO0oO.postValue(data4);
                }
            } else if (badgeType2 == badgeType && BadgeRankDataFragment.BadgeRank.QuarterRank == badgeRank) {
                a3Var.f57076OooO0Oo = a3.OooO0O0(a3Var, apiResult);
                a3Var.f57074OooO0O0.postValue(a3Var.f57076OooO0Oo);
                BadgeRankModel badgeRankModel4 = (BadgeRankModel) apiResult.getData();
                if (badgeRankModel4 != null && (data3 = badgeRankModel4.getData()) != null) {
                    a3Var.f57080OooO0oo.postValue(data3);
                }
            } else {
                BadgeRankFragment.BadgeType badgeType3 = BadgeRankFragment.BadgeType.FriendType;
                if (badgeType3 == badgeType && BadgeRankDataFragment.BadgeRank.TotalRank == badgeRank) {
                    a3Var.f57078OooO0o0 = a3.OooO0O0(a3Var, apiResult);
                    a3Var.f57074OooO0O0.postValue(a3Var.f57078OooO0o0);
                    BadgeRankModel badgeRankModel5 = (BadgeRankModel) apiResult.getData();
                    if (badgeRankModel5 != null && (data2 = badgeRankModel5.getData()) != null) {
                        a3Var.f57072OooO.postValue(data2);
                    }
                } else if (badgeType3 == badgeType && BadgeRankDataFragment.BadgeRank.QuarterRank == badgeRank) {
                    a3Var.f57077OooO0o = a3.OooO0O0(a3Var, apiResult);
                    a3Var.f57074OooO0O0.postValue(a3Var.f57077OooO0o);
                    BadgeRankModel badgeRankModel6 = (BadgeRankModel) apiResult.getData();
                    if (badgeRankModel6 != null && (data = badgeRankModel6.getData()) != null) {
                        a3Var.f57081OooOO0.postValue(data);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
