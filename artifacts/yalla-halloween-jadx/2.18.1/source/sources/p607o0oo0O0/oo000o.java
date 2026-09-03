package p607o0oo0O0;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.RoomMemberHostTaskModel;
import com.yalla.yalla.model.RoomMemberTaskHostInfoModel;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import o00O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p254o00ooO0O.o000O0O0;
import p497o0o00Oo.OooOOO0;
import p520o0o0O0O0.o000OO00;
import p530o0o0OOO.o00OO00O;
import p630o0ooO00.o000O0;
import p630o0ooO00.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oo000o extends o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48328OooO00o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(0L);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f48329OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(-1);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public o0O00OO<Boolean> f48330OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public o0O00OO<Boolean> f48331OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o000O0<RoomMemberTaskHostInfoModel> f48332OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f48333OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.LiveRoomMemberTaskHostVM$taskListSource$1", f = "LiveRoomMemberTaskHostVM.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000OO0O<RoomMemberTaskHostInfoModel>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f48334Oooo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return oo000o.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000OO0O<RoomMemberTaskHostInfoModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<RoomMemberTaskHostInfoModel> taskList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f48334Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o000OO00 o000oo01 = o000OO00.f42604OooO00o;
                Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
                if (value == null) {
                    value = Boxing.boxLong(0L);
                }
                long jLongValue = value.longValue();
                this.f48334Oooo0o = 1;
                obj = o000oo01.OooO00o(jLongValue, this);
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
                RoomMemberHostTaskModel roomMemberHostTaskModel = (RoomMemberHostTaskModel) apiResult.getData();
                if (roomMemberHostTaskModel != null) {
                    oo000o oo000oVar = oo000o.this;
                    oo000oVar.f48328OooO00o.setValue(Long.valueOf(roomMemberHostTaskModel.getDayFriendShip()));
                    oo000oVar.f48329OooO0O0.setValue(Integer.valueOf(roomMemberHostTaskModel.getWeekRank()));
                }
                RoomMemberHostTaskModel roomMemberHostTaskModel2 = (RoomMemberHostTaskModel) apiResult.getData();
                if (roomMemberHostTaskModel2 != null && (taskList = roomMemberHostTaskModel2.getTaskList()) != null) {
                    for (RoomMemberTaskHostInfoModel roomMemberTaskHostInfoModel : taskList) {
                        int taskId = roomMemberTaskHostInfoModel.getTaskId();
                        if (taskId == 1) {
                            roomMemberTaskHostInfoModel.setTaskIcon(R.mipmap.ic_room_member_task_1);
                            roomMemberTaskHostInfoModel.setTaskName(o000O0O0.OooO0OO(R.string.host_Stay_in_room));
                        } else if (taskId == 2) {
                            roomMemberTaskHostInfoModel.setTaskIcon(R.mipmap.ic_room_member_task_2);
                            roomMemberTaskHostInfoModel.setTaskName(o000O0O0.OooO0OO(R.string.host_Chat_in_room));
                        } else if (taskId == 3) {
                            roomMemberTaskHostInfoModel.setTaskIcon(R.mipmap.ic_room_member_task_3);
                            roomMemberTaskHostInfoModel.setTaskName(o000O0O0.OooO0OO(R.string.host_Share_the_room));
                        } else if (taskId == 4) {
                            roomMemberTaskHostInfoModel.setTaskIcon(R.mipmap.ic_room_member_task_4);
                            roomMemberTaskHostInfoModel.setTaskName(o000O0O0.OooO0OO(R.string.host_Send_golds_gifts));
                        }
                    }
                }
            }
            RoomMemberHostTaskModel roomMemberHostTaskModel3 = (RoomMemberHostTaskModel) apiResult.getData();
            return apiResult.toPagingLoadResource(roomMemberHostTaskModel3 != null ? roomMemberHostTaskModel3.getTaskList() : null, false);
        }
    }

    public oo000o() {
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        this.f48331OooO0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.valueOf(OooOOO0.OooOO0o().OooOO0O()));
        this.f48333OooO0o0 = OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        this.f48332OooO0o = new o000O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));
    }
}
