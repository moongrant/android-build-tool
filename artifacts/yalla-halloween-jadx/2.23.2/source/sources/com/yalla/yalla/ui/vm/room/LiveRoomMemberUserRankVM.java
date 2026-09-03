package com.yalla.yalla.ui.vm.room;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.model.LiveRoomMemberUserRankModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00oO.o000;
import p188o00o00oO.o000Oo0;
import p394o0Oo0.OooOO0;
import p412o0Oo0o0O.o00OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bR/\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R/\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/vm/room/LiveRoomMemberUserRankVM;", "Lo0Oo0/OooOO0;", "", "isWeekly", "Lcom/yalla/yalla/model/LiveRoomMemberUserRankModel$RankDataDTO;", "getCurrentUserData", "Lo00o00oO/o000;", "getCurrentRankList", "", "getCurrentRankNumber", "(Z)Ljava/lang/Integer;", "", "clear", "<set-?>", "mWeeklyCurrUserData$delegate", "Landroidx/compose/runtime/MutableState;", "getMWeeklyCurrUserData", "()Lcom/yalla/yalla/model/LiveRoomMemberUserRankModel$RankDataDTO;", "setMWeeklyCurrUserData", "(Lcom/yalla/yalla/model/LiveRoomMemberUserRankModel$RankDataDTO;)V", "mWeeklyCurrUserData", "mGeneralCurrUserData$delegate", "getMGeneralCurrUserData", "setMGeneralCurrUserData", "mGeneralCurrUserData", "weeklyRankList", "Lo00o00oO/o000;", "generalRankList", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLiveRoomMemberUserRankVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberUserRankVM.kt\ncom/yalla/yalla/ui/vm/room/LiveRoomMemberUserRankVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n81#2:77\n107#2,2:78\n81#2:80\n107#2,2:81\n1864#3,3:83\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberUserRankVM.kt\ncom/yalla/yalla/ui/vm/room/LiveRoomMemberUserRankVM\n*L\n15#1:77\n15#1:78,2\n17#1:80\n17#1:81,2\n61#1:83,3\n*E\n"})
public final class LiveRoomMemberUserRankVM extends OooOO0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: mWeeklyCurrUserData$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState mWeeklyCurrUserData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: mGeneralCurrUserData$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState mGeneralCurrUserData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @NotNull
    private final o000<LiveRoomMemberUserRankModel.RankDataDTO> weeklyRankList = new o000<>(ViewModelKt.getViewModelScope(this), new OooO0O0(null));

    @NotNull
    private final o000<LiveRoomMemberUserRankModel.RankDataDTO> generalRankList = new o000<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.LiveRoomMemberUserRankVM$generalRankList$1", f = "LiveRoomMemberUserRankVM.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<LiveRoomMemberUserRankModel.RankDataDTO>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31996OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveRoomMemberUserRankVM.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000Oo0<LiveRoomMemberUserRankModel.RankDataDTO>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31996OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO o00oo2 = o00OO.f46151OooO00o;
                Long value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
                if (value == null) {
                    value = Boxing.boxLong(0L);
                }
                long jLongValue = value.longValue();
                this.f31996OooO0Oo = 1;
                obj = o00oo2.OooO0O0(jLongValue, 2, this);
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
            LiveRoomMemberUserRankModel liveRoomMemberUserRankModel = (LiveRoomMemberUserRankModel) apiResult.getData();
            LiveRoomMemberUserRankVM.this.setMGeneralCurrUserData(liveRoomMemberUserRankModel != null ? liveRoomMemberUserRankModel.getCurrUserData() : null);
            LiveRoomMemberUserRankModel liveRoomMemberUserRankModel2 = (LiveRoomMemberUserRankModel) apiResult.getData();
            return apiResult.toPagingLoadResource(liveRoomMemberUserRankModel2 != null ? liveRoomMemberUserRankModel2.getRankData() : null, false);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.LiveRoomMemberUserRankVM$weeklyRankList$1", f = "LiveRoomMemberUserRankVM.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<LiveRoomMemberUserRankModel.RankDataDTO>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31998OooO0Oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveRoomMemberUserRankVM.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000Oo0<LiveRoomMemberUserRankModel.RankDataDTO>> continuation) {
            return ((OooO0O0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31998OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO o00oo2 = o00OO.f46151OooO00o;
                Long value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
                if (value == null) {
                    value = Boxing.boxLong(0L);
                }
                long jLongValue = value.longValue();
                this.f31998OooO0Oo = 1;
                obj = o00oo2.OooO0O0(jLongValue, 1, this);
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
            LiveRoomMemberUserRankModel liveRoomMemberUserRankModel = (LiveRoomMemberUserRankModel) apiResult.getData();
            LiveRoomMemberUserRankVM.this.setMWeeklyCurrUserData(liveRoomMemberUserRankModel != null ? liveRoomMemberUserRankModel.getCurrUserData() : null);
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
    public final o000<LiveRoomMemberUserRankModel.RankDataDTO> getCurrentRankList(boolean isWeekly) {
        return isWeekly ? this.weeklyRankList : this.generalRankList;
    }

    @Nullable
    public final Integer getCurrentRankNumber(boolean isWeekly) {
        LiveRoomMemberUserRankModel.RankDataDTO currentUserData = getCurrentUserData(isWeekly);
        Intrinsics.checkNotNull(currentUserData);
        List<LiveRoomMemberUserRankModel.RankDataDTO> list = getCurrentRankList(isWeekly).f38497OooO0Oo;
        if (list.isEmpty()) {
            return null;
        }
        int i = 0;
        for (Object obj : list) {
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
