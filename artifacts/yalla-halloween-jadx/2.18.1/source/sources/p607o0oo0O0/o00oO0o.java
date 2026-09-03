package p607o0oo0O0;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.RoomMemberTaskInfoModel;
import com.yalla.yalla.model.RoomMemberTaskModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
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
import o00O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0OOO00;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000Oo0;
import p520o0o0O0O0.o000OO00;
import p530o0o0OOO.o00OO00O;
import p630o0ooO00.o000O0;
import p630o0ooO00.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o00oO0o extends o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48305OooO00o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo("");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48306OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48307OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(1);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48308OooO0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48310OooO0o0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(20);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48309OooO0o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(0L);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48311OooO0oO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(510L);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48312OooO0oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(0L);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48304OooO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(0);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48313OooOO0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(0L);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48314OooOO0O = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(0L);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f48315OooOO0o = OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final o000O0<RoomMemberTaskInfoModel> f48316OooOOO0 = new o000O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.LiveRoomMemberTaskVM$taskListSource$1", f = "LiveRoomMemberTaskVM.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000OO0O<RoomMemberTaskInfoModel>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f48317Oooo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o00oO0o.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000OO0O<RoomMemberTaskInfoModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<RoomMemberTaskInfoModel> taskList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f48317Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o000OO00 o000oo01 = o000OO00.f42604OooO00o;
                Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
                if (value == null) {
                    value = Boxing.boxLong(0L);
                }
                long jLongValue = value.longValue();
                this.f48317Oooo0o = 1;
                obj = o000oo01.OooO0OO(jLongValue, this);
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
                RoomMemberTaskModel roomMemberTaskModel = (RoomMemberTaskModel) apiResult.getData();
                if (roomMemberTaskModel != null) {
                    o00oO0o o00oo0o2 = o00oO0o.this;
                    String badgeUrl = roomMemberTaskModel.getBadgeUrl();
                    Objects.requireNonNull(o00oo0o2);
                    Intrinsics.checkNotNullParameter(badgeUrl, "<set-?>");
                    o00oo0o2.f48305OooO00o.setValue(badgeUrl);
                    o00oo0o2.f48306OooO0O0.setValue(Integer.valueOf(roomMemberTaskModel.getMemberLevel()));
                    o00oo0o2.f48307OooO0OO.setValue(Integer.valueOf(roomMemberTaskModel.getBadgeLevel()));
                    o00oo0o2.f48308OooO0Oo.setValue(Boolean.valueOf(o000Oo0.OooO00o(Boxing.boxInt(roomMemberTaskModel.getBadgeSate()))));
                    o00oo0o2.f48310OooO0o0.setValue(Integer.valueOf(roomMemberTaskModel.getMemberLevelLimit()));
                    o00oo0o2.f48309OooO0o.setValue(Long.valueOf(roomMemberTaskModel.getDayFriendShip()));
                    o00oo0o2.f48311OooO0oO.setValue(Long.valueOf(roomMemberTaskModel.getDayFriendShipLimit()));
                    o00oo0o2.f48312OooO0oo.setValue(Long.valueOf(roomMemberTaskModel.getTotalFriendShip()));
                    o00oo0o2.f48313OooOO0.setValue(Long.valueOf(roomMemberTaskModel.getTotalProgress()));
                    o00oo0o2.f48314OooOO0O.setValue(Long.valueOf(roomMemberTaskModel.getCurrentProgress()));
                    o00oo0o2.f48304OooO.setValue(Integer.valueOf(roomMemberTaskModel.getWeekRank()));
                }
                RoomMemberTaskModel roomMemberTaskModel2 = (RoomMemberTaskModel) apiResult.getData();
                if (roomMemberTaskModel2 != null && (taskList = roomMemberTaskModel2.getTaskList()) != null) {
                    for (RoomMemberTaskInfoModel roomMemberTaskInfoModel : taskList) {
                        int taskId = roomMemberTaskInfoModel.getTaskId();
                        if (taskId == 1) {
                            roomMemberTaskInfoModel.setTaskDesc(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Stay_in_room_desc), String.valueOf(roomMemberTaskInfoModel.getUnitRewardVal())));
                            roomMemberTaskInfoModel.setTaskName(o000O0O0.OooO0OO(R.string.Stay_in_room));
                        } else if (taskId == 2) {
                            roomMemberTaskInfoModel.setTaskDesc(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Chat_in_room_desc), String.valueOf(roomMemberTaskInfoModel.getUnitRewardVal())));
                            roomMemberTaskInfoModel.setTaskName(o000O0O0.OooO0OO(R.string.Chat_in_room));
                        } else if (taskId == 3) {
                            roomMemberTaskInfoModel.setTaskDesc(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Share_the_room_desc), String.valueOf(roomMemberTaskInfoModel.getUnitRewardVal())));
                            roomMemberTaskInfoModel.setTaskName(o000O0O0.OooO0OO(R.string.Share_the_room));
                        } else if (taskId == 4) {
                            roomMemberTaskInfoModel.setTaskDesc(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.Send_golds_gifts_desc), String.valueOf(roomMemberTaskInfoModel.getUnitRewardVal())));
                            roomMemberTaskInfoModel.setTaskName(o000O0O0.OooO0OO(R.string.Send_golds_gifts));
                        }
                    }
                }
            }
            RoomMemberTaskModel roomMemberTaskModel3 = (RoomMemberTaskModel) apiResult.getData();
            return apiResult.toPagingLoadResource(roomMemberTaskModel3 != null ? roomMemberTaskModel3.getTaskList() : null, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0O0() {
        return ((Boolean) this.f48308OooO0Oo.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long OooO0OO() {
        return ((Number) this.f48314OooOO0O.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0Oo() {
        return ((Number) this.f48306OooO0O0.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long OooO0o() {
        return ((Number) this.f48312OooO0oo.getValue()).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0o0() {
        return ((Number) this.f48310OooO0o0.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long OooO0oO() {
        return ((Number) this.f48313OooOO0.getValue()).longValue();
    }
}
