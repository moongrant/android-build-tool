package com.yalla.yalla.ui.vm.user;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.model.BadgeBannerModel;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.model.BadgeModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394o0Oo00oO.o0O0O00;
import p406o0Oo0Ooo.oOO0;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR%\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR%\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R%\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000eR%\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\f\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u001e\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0007\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/BadgeVM;", "Lo0Oo00oO/o0O0O00;", "", "requestBadgeBannerRankTop", "requestBadgeInfo", "", "userId", "J", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/yalla/yalla/model/BadgeBannerModel;", "medalBannerRank", "Landroidx/lifecycle/MutableLiveData;", "getMedalBannerRank", "()Landroidx/lifecycle/MutableLiveData;", "Lcom/yalla/yalla/model/BadgeDataModel;", "achievementList", "getAchievementList", "honorList", "getHonorList", "", "isFromMe", "Z", "()Z", "", "kotlin.jvm.PlatformType", "currentStar", "getCurrentStar", "currentRank", "getCurrentRank", "currentId", "getCurrentId", "()J", "<init>", "(J)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class BadgeVM extends o0O0O00 {
    public static final int $stable = 8;
    private final long currentId;

    @NotNull
    private final MutableLiveData<Integer> currentRank;

    @NotNull
    private final MutableLiveData<Integer> currentStar;
    private final boolean isFromMe;
    private final long userId;

    @NotNull
    private final MutableLiveData<List<BadgeBannerModel>> medalBannerRank = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<BadgeDataModel>> achievementList = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<List<BadgeDataModel>> honorList = new MutableLiveData<>();

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.BadgeVM$requestBadgeBannerRankTop$1", f = "BadgeVM.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32660OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BadgeVM.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32660OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                oOO0 ooo0 = oOO0.f44917OooO00o;
                this.f32660OooO0Oo = 1;
                obj = ooo0.OooO00o(this);
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
                BadgeVM.this.getMedalBannerRank().postValue(apiResult.getData());
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.BadgeVM$requestBadgeInfo$1", f = "BadgeVM.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32662OooO0Oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BadgeVM.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32662OooO0Oo;
            BadgeVM badgeVM = BadgeVM.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                oOO0 ooo0 = oOO0.f44917OooO00o;
                long j = badgeVM.userId;
                this.f32662OooO0Oo = 1;
                obj = ooo0.OooO0O0(j, this);
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
                MutableLiveData<List<BadgeDataModel>> achievementList = badgeVM.getAchievementList();
                BadgeModel badgeModel = (BadgeModel) apiResult.getData();
                achievementList.postValue(badgeModel != null ? badgeModel.getData() : null);
                MutableLiveData<List<BadgeDataModel>> honorList = badgeVM.getHonorList();
                BadgeModel badgeModel2 = (BadgeModel) apiResult.getData();
                honorList.postValue(badgeModel2 != null ? badgeModel2.getHonordata() : null);
                MutableLiveData<Integer> currentStar = badgeVM.getCurrentStar();
                BadgeModel badgeModel3 = (BadgeModel) apiResult.getData();
                currentStar.postValue(badgeModel3 != null ? Boxing.boxInt(badgeModel3.getSumstars()) : null);
                MutableLiveData<Integer> currentRank = badgeVM.getCurrentRank();
                BadgeModel badgeModel4 = (BadgeModel) apiResult.getData();
                currentRank.postValue(badgeModel4 != null ? Boxing.boxInt(badgeModel4.getRank()) : null);
                o000000O o000000o2 = o000000O.f46674OooO00o;
                MutableLiveData mutableLiveData = (MutableLiveData) o000000O.f46709Oooo0O0.getValue();
                BadgeModel badgeModel5 = (BadgeModel) apiResult.getData();
                mutableLiveData.postValue(badgeModel5 != null ? badgeModel5.getOpenDiamondMedal() : null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BadgeVM(long j) {
        this.userId = j;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        boolean z = false;
        if (l != null && l.longValue() == j) {
            z = true;
        }
        this.isFromMe = z;
        this.currentStar = new MutableLiveData<>(0);
        this.currentRank = new MutableLiveData<>(0);
        this.currentId = j;
        requestBadgeInfo();
        requestBadgeBannerRankTop();
    }

    private final void requestBadgeBannerRankTop() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(null), 3, null);
    }

    @NotNull
    public final MutableLiveData<List<BadgeDataModel>> getAchievementList() {
        return this.achievementList;
    }

    public final long getCurrentId() {
        return this.currentId;
    }

    @NotNull
    public final MutableLiveData<Integer> getCurrentRank() {
        return this.currentRank;
    }

    @NotNull
    public final MutableLiveData<Integer> getCurrentStar() {
        return this.currentStar;
    }

    @NotNull
    public final MutableLiveData<List<BadgeDataModel>> getHonorList() {
        return this.honorList;
    }

    @NotNull
    public final MutableLiveData<List<BadgeBannerModel>> getMedalBannerRank() {
        return this.medalBannerRank;
    }

    /* JADX INFO: renamed from: isFromMe, reason: from getter */
    public final boolean getIsFromMe() {
        return this.isFromMe;
    }

    public final void requestBadgeInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(null), 3, null);
    }
}
