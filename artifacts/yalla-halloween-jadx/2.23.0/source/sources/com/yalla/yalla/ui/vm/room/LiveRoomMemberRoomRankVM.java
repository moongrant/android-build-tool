package com.yalla.yalla.ui.vm.room;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.LiveRoomMemberRoomRankModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00Oo000.OooO;
import p394o0Oo00oO.o0O0O00;
import p406o0Oo0Ooo.n;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\u0002R/\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R/\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R/\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/yalla/yalla/ui/vm/room/LiveRoomMemberRoomRankVM;", "Lo0Oo00oO/o0O0O00;", "", "countdown", "Lkotlin/Pair;", "", "", "getCurrentRankNumber", "", "getRankShow", "clear", "<set-?>", "mEndOfDistance$delegate", "Landroidx/compose/runtime/MutableState;", "getMEndOfDistance", "()Ljava/lang/Long;", "setMEndOfDistance", "(Ljava/lang/Long;)V", "mEndOfDistance", "mCurrRoomFriendShip$delegate", "getMCurrRoomFriendShip", "setMCurrRoomFriendShip", "mCurrRoomFriendShip", "Lcom/yalla/yalla/model/LiveRoomMemberRoomRankModel$AwardDataDTO;", "mAwardData$delegate", "getMAwardData", "()Lcom/yalla/yalla/model/LiveRoomMemberRoomRankModel$AwardDataDTO;", "setMAwardData", "(Lcom/yalla/yalla/model/LiveRoomMemberRoomRankModel$AwardDataDTO;)V", "mAwardData", "Lo00Oo000/OooO0O0;", "Lcom/yalla/yalla/model/LiveRoomMemberRoomRankModel$RankDataDTO;", "rankList", "Lo00Oo000/OooO0O0;", "getRankList", "()Lo00Oo000/OooO0O0;", "Lkotlinx/coroutines/Job;", "countdownTimeJob", "Lkotlinx/coroutines/Job;", "getCountdownTimeJob", "()Lkotlinx/coroutines/Job;", "setCountdownTimeJob", "(Lkotlinx/coroutines/Job;)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLiveRoomMemberRoomRankVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberRoomRankVM.kt\ncom/yalla/yalla/ui/vm/room/LiveRoomMemberRoomRankVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n81#2:105\n107#2,2:106\n81#2:108\n107#2,2:109\n81#2:111\n107#2,2:112\n1864#3,3:114\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberRoomRankVM.kt\ncom/yalla/yalla/ui/vm/room/LiveRoomMemberRoomRankVM\n*L\n20#1:105\n20#1:106,2\n21#1:108\n21#1:109,2\n22#1:111\n22#1:112,2\n72#1:114,3\n*E\n"})
public final class LiveRoomMemberRoomRankVM extends o0O0O00 {
    public static final int $stable = 8;

    @Nullable
    private Job countdownTimeJob;

    /* JADX INFO: renamed from: mEndOfDistance$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState mEndOfDistance = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: mCurrRoomFriendShip$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState mCurrRoomFriendShip = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: mAwardData$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState mAwardData = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @NotNull
    private final p143o00Oo000.OooO0O0<LiveRoomMemberRoomRankModel.RankDataDTO> rankList = new p143o00Oo000.OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO0O0(null));

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.LiveRoomMemberRoomRankVM$countdown$1", f = "LiveRoomMemberRoomRankVM.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32528OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveRoomMemberRoomRankVM.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002e  */
        /* JADX WARN: Code duplicated, block: B:14:0x0033  */
        /* JADX WARN: Code duplicated, block: B:17:0x0038  */
        /* JADX WARN: Code duplicated, block: B:19:0x0042 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x004b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0040 -> B:20:0x0043). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x004b
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f32528OooO0Oo
                r2 = 1
                if (r1 == 0) goto L18
                if (r1 != r2) goto L10
                kotlin.ResultKt.throwOnFailure(r8)
                r8 = r7
                goto L43
            L10:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L18:
                kotlin.ResultKt.throwOnFailure(r8)
                com.yalla.yalla.ui.vm.room.LiveRoomMemberRoomRankVM r8 = com.yalla.yalla.ui.vm.room.LiveRoomMemberRoomRankVM.this
                java.lang.Long r8 = r8.getMEndOfDistance()
                if (r8 == 0) goto L61
                r8 = r7
            L24:
                com.yalla.yalla.ui.vm.room.LiveRoomMemberRoomRankVM r1 = com.yalla.yalla.ui.vm.room.LiveRoomMemberRoomRankVM.this
                java.lang.Long r1 = r1.getMEndOfDistance()
                r3 = 0
                if (r1 == 0) goto L33
                long r5 = r1.longValue()
                goto L34
            L33:
                r5 = r3
            L34:
                int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r1 <= 0) goto L61
                r8.f32528OooO0Oo = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r1 = kotlinx.coroutines.DelayKt.delay(r3, r8)
                if (r1 != r0) goto L43
                return r0
            L43:
                com.yalla.yalla.ui.vm.room.LiveRoomMemberRoomRankVM r1 = com.yalla.yalla.ui.vm.room.LiveRoomMemberRoomRankVM.this
                java.lang.Long r3 = r1.getMEndOfDistance()
                if (r3 == 0) goto L24
                java.lang.Long r3 = r1.getMEndOfDistance()
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                long r3 = r3.longValue()
                r5 = 1
                long r3 = r3 - r5
                java.lang.Long r3 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r3)
                r1.setMEndOfDistance(r3)
                goto L24
            L61:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yalla.yalla.ui.vm.room.LiveRoomMemberRoomRankVM.OooO00o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.LiveRoomMemberRoomRankVM$rankList$1", f = "LiveRoomMemberRoomRankVM.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super OooO<LiveRoomMemberRoomRankModel.RankDataDTO>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32530OooO0Oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveRoomMemberRoomRankVM.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super OooO<LiveRoomMemberRoomRankModel.RankDataDTO>> continuation) {
            return ((OooO0O0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32530OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                n nVar = n.f44887OooO00o;
                com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
                Long value = oooO00o.OooO00o().f25001OooO0Oo.getValue();
                if (value == null) {
                    value = Boxing.boxLong(0L);
                }
                long jLongValue = value.longValue();
                Integer value2 = oooO00o.OooO00o().f25008OooOO0o.getValue();
                boolean z = value2 != null && value2.intValue() == 1;
                this.f32530OooO0Oo = 1;
                obj = nVar.OooO0Oo(jLongValue, z, this);
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
            LiveRoomMemberRoomRankModel liveRoomMemberRoomRankModel = (LiveRoomMemberRoomRankModel) apiResult.getData();
            Long endOfDistance = liveRoomMemberRoomRankModel != null ? liveRoomMemberRoomRankModel.getEndOfDistance() : null;
            LiveRoomMemberRoomRankVM liveRoomMemberRoomRankVM = LiveRoomMemberRoomRankVM.this;
            liveRoomMemberRoomRankVM.setMEndOfDistance(endOfDistance);
            LiveRoomMemberRoomRankModel liveRoomMemberRoomRankModel2 = (LiveRoomMemberRoomRankModel) apiResult.getData();
            liveRoomMemberRoomRankVM.setMCurrRoomFriendShip(liveRoomMemberRoomRankModel2 != null ? liveRoomMemberRoomRankModel2.getCurrRoomFriendShip() : null);
            liveRoomMemberRoomRankVM.countdown();
            LiveRoomMemberRoomRankModel liveRoomMemberRoomRankModel3 = (LiveRoomMemberRoomRankModel) apiResult.getData();
            liveRoomMemberRoomRankVM.setMAwardData(liveRoomMemberRoomRankModel3 != null ? liveRoomMemberRoomRankModel3.getAwardData() : null);
            LiveRoomMemberRoomRankModel liveRoomMemberRoomRankModel4 = (LiveRoomMemberRoomRankModel) apiResult.getData();
            return apiResult.toPagingLoadResource(liveRoomMemberRoomRankModel4 != null ? liveRoomMemberRoomRankModel4.getRankData() : null, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void countdown() {
        Job job = this.countdownTimeJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.countdownTimeJob = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(null), 3, null);
    }

    private final Pair<Integer, Long> getCurrentRankNumber() {
        List<LiveRoomMemberRoomRankModel.RankDataDTO> list = this.rankList.f37663OooO0Oo;
        if (list.isEmpty()) {
            return null;
        }
        Long value = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25001OooO0Oo.getValue();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            LiveRoomMemberRoomRankModel.RankDataDTO rankDataDTO = (LiveRoomMemberRoomRankModel.RankDataDTO) obj;
            if (Intrinsics.areEqual(value, rankDataDTO.getRoomId())) {
                Integer rank = rankDataDTO.getRank();
                Integer numValueOf = Integer.valueOf(rank != null ? rank.intValue() : 0);
                Long friendShip = rankDataDTO.getFriendShip();
                return new Pair<>(numValueOf, Long.valueOf(friendShip != null ? friendShip.longValue() : 0L));
            }
            i = i2;
        }
        return null;
    }

    public final void clear() {
        this.rankList.OooO00o();
        setMEndOfDistance(null);
        setMCurrRoomFriendShip(null);
        setMAwardData(null);
    }

    @Nullable
    public final Job getCountdownTimeJob() {
        return this.countdownTimeJob;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final LiveRoomMemberRoomRankModel.AwardDataDTO getMAwardData() {
        return (LiveRoomMemberRoomRankModel.AwardDataDTO) this.mAwardData.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Long getMCurrRoomFriendShip() {
        return (Long) this.mCurrRoomFriendShip.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Long getMEndOfDistance() {
        return (Long) this.mEndOfDistance.getValue();
    }

    @NotNull
    public final p143o00Oo000.OooO0O0<LiveRoomMemberRoomRankModel.RankDataDTO> getRankList() {
        return this.rankList;
    }

    @NotNull
    public final String getRankShow() {
        Pair<Integer, Long> currentRankNumber = getCurrentRankNumber();
        List<LiveRoomMemberRoomRankModel.RankDataDTO> list = this.rankList.f37663OooO0Oo;
        if (currentRankNumber == null) {
            return list.size() >= 99 ? "99+" : "-";
        }
        return o0OoOo0.OooOO0o(currentRankNumber.getFirst(), "");
    }

    public final void setCountdownTimeJob(@Nullable Job job) {
        this.countdownTimeJob = job;
    }

    public final void setMAwardData(@Nullable LiveRoomMemberRoomRankModel.AwardDataDTO awardDataDTO) {
        this.mAwardData.setValue(awardDataDTO);
    }

    public final void setMCurrRoomFriendShip(@Nullable Long l) {
        this.mCurrRoomFriendShip.setValue(l);
    }

    public final void setMEndOfDistance(@Nullable Long l) {
        this.mEndOfDistance.setValue(l);
    }
}
