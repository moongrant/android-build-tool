package com.yalla.yalla.ui.vm.room;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.app.base.model.LiveRoomMemberUserRankModel;
import com.yalla.yalla.common.model.ApiResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p520o0o0O0O0.o000OO00;
import p530o0o0OOO.o00OO00O;
import p630o0ooO00.o000O0;
import p630o0ooO00.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bR/\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R/\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/ui/vm/room/LiveRoomMemberUserRankVM;", "Lo00OO/OooO00o;", "", "isWeekly", "Lcom/app/base/model/LiveRoomMemberUserRankModel$RankDataDTO;", "getCurrentUserData", "Lo0ooO00/o000O0;", "getCurrentRankList", "", "getCurrentRankNumber", "(Z)Ljava/lang/Integer;", "", "clear", "<set-?>", "mGeneralCurrUserData$delegate", "Lo000oOoO/o0O00OO;", "getMGeneralCurrUserData", "()Lcom/app/base/model/LiveRoomMemberUserRankModel$RankDataDTO;", "setMGeneralCurrUserData", "(Lcom/app/base/model/LiveRoomMemberUserRankModel$RankDataDTO;)V", "mGeneralCurrUserData", "mWeeklyCurrUserData$delegate", "getMWeeklyCurrUserData", "setMWeeklyCurrUserData", "mWeeklyCurrUserData", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class LiveRoomMemberUserRankVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: mWeeklyCurrUserData$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO mWeeklyCurrUserData = o0OOO00.OooO0Oo(null);

    /* JADX INFO: renamed from: mGeneralCurrUserData$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO mGeneralCurrUserData = o0OOO00.OooO0Oo(null);

    @NotNull
    private final o000O0<LiveRoomMemberUserRankModel.RankDataDTO> weeklyRankList = new o000O0<>(ViewModelKt.getViewModelScope(this), new OooO0O0(null));

    @NotNull
    private final o000O0<LiveRoomMemberUserRankModel.RankDataDTO> generalRankList = new o000O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.LiveRoomMemberUserRankVM$generalRankList$1", f = "LiveRoomMemberUserRankVM.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000OO0O<LiveRoomMemberUserRankModel.RankDataDTO>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26055Oooo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveRoomMemberUserRankVM.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000OO0O<LiveRoomMemberUserRankModel.RankDataDTO>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26055Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o000OO00 o000oo01 = o000OO00.f42604OooO00o;
                Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
                if (value == null) {
                    value = Boxing.boxLong(0L);
                }
                long jLongValue = value.longValue();
                this.f26055Oooo0o = 1;
                obj = o000oo01.OooO0O0(jLongValue, 2, this);
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
            LiveRoomMemberUserRankVM liveRoomMemberUserRankVM = LiveRoomMemberUserRankVM.this;
            LiveRoomMemberUserRankModel liveRoomMemberUserRankModel = (LiveRoomMemberUserRankModel) apiResult.getData();
            liveRoomMemberUserRankVM.setMGeneralCurrUserData(liveRoomMemberUserRankModel != null ? liveRoomMemberUserRankModel.getCurrUserData() : null);
            LiveRoomMemberUserRankModel liveRoomMemberUserRankModel2 = (LiveRoomMemberUserRankModel) apiResult.getData();
            return apiResult.toPagingLoadResource(liveRoomMemberUserRankModel2 != null ? liveRoomMemberUserRankModel2.getRankData() : null, false);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.LiveRoomMemberUserRankVM$weeklyRankList$1", f = "LiveRoomMemberUserRankVM.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super o000OO0O<LiveRoomMemberUserRankModel.RankDataDTO>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26057Oooo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveRoomMemberUserRankVM.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000OO0O<LiveRoomMemberUserRankModel.RankDataDTO>> continuation) {
            return ((OooO0O0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26057Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o000OO00 o000oo01 = o000OO00.f42604OooO00o;
                Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
                if (value == null) {
                    value = Boxing.boxLong(0L);
                }
                long jLongValue = value.longValue();
                this.f26057Oooo0o = 1;
                obj = o000oo01.OooO0O0(jLongValue, 1, this);
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
            LiveRoomMemberUserRankVM liveRoomMemberUserRankVM = LiveRoomMemberUserRankVM.this;
            LiveRoomMemberUserRankModel liveRoomMemberUserRankModel = (LiveRoomMemberUserRankModel) apiResult.getData();
            liveRoomMemberUserRankVM.setMWeeklyCurrUserData(liveRoomMemberUserRankModel != null ? liveRoomMemberUserRankModel.getCurrUserData() : null);
            LiveRoomMemberUserRankModel liveRoomMemberUserRankModel2 = (LiveRoomMemberUserRankModel) apiResult.getData();
            return apiResult.toPagingLoadResource(liveRoomMemberUserRankModel2 != null ? liveRoomMemberUserRankModel2.getRankData() : null, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final LiveRoomMemberUserRankModel.RankDataDTO getMGeneralCurrUserData() {
        return (LiveRoomMemberUserRankModel.RankDataDTO) this.mGeneralCurrUserData.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMGeneralCurrUserData(LiveRoomMemberUserRankModel.RankDataDTO rankDataDTO) {
        this.mGeneralCurrUserData.setValue(rankDataDTO);
    }

    public final void clear() {
        this.weeklyRankList.OooO00o();
        this.generalRankList.OooO00o();
        setMWeeklyCurrUserData(null);
        setMGeneralCurrUserData(null);
    }

    @NotNull
    public final o000O0<LiveRoomMemberUserRankModel.RankDataDTO> getCurrentRankList(boolean isWeekly) {
        return isWeekly ? this.weeklyRankList : this.generalRankList;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable, java.util.ArrayList, java.util.List<T>] */
    @Nullable
    public final Integer getCurrentRankNumber(boolean isWeekly) {
        LiveRoomMemberUserRankModel.RankDataDTO currentUserData = getCurrentUserData(isWeekly);
        Intrinsics.checkNotNull(currentUserData);
        ?? r7 = getCurrentRankList(isWeekly).f48682OooO0Oo;
        if (r7.isEmpty()) {
            return null;
        }
        int i = 0;
        for (Object obj : r7) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(currentUserData.getUserId(), ((LiveRoomMemberUserRankModel.RankDataDTO) obj).getUserId())) {
                return Integer.valueOf(i);
            }
            i = i2;
        }
        return null;
    }

    @Nullable
    public final LiveRoomMemberUserRankModel.RankDataDTO getCurrentUserData(boolean isWeekly) {
        return isWeekly ? getMWeeklyCurrUserData() : getMGeneralCurrUserData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final LiveRoomMemberUserRankModel.RankDataDTO getMWeeklyCurrUserData() {
        return (LiveRoomMemberUserRankModel.RankDataDTO) this.mWeeklyCurrUserData.getValue();
    }

    public final void setMWeeklyCurrUserData(@Nullable LiveRoomMemberUserRankModel.RankDataDTO rankDataDTO) {
        this.mWeeklyCurrUserData.setValue(rankDataDTO);
    }
}
