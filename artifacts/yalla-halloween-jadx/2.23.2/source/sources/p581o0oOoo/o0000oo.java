package p581o0oOoo;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.o0000;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomMemberHostTaskModel;
import com.yalla.yalla.model.room.RoomMemberTaskHostInfoModel;
import com.yalla.yalla.service.room.OooO0O0;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p188o00o00oO.o000;
import p188o00o00oO.o000Oo0;
import p412o0Oo0o0O.o00OO;
import p414o0Oo0oO.oO00OO0O;
import p415o0Oo0oO0.o00Ooo;
import p562o0oOo000.o000000;
import p562o0oOo000.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomMemberTaskHostVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskHostVM.kt\ncom/yalla/yalla/ui/vm/room/LiveRoomMemberTaskHostVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,69:1\n81#2:70\n107#2,2:71\n81#2:73\n107#2,2:74\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskHostVM.kt\ncom/yalla/yalla/ui/vm/room/LiveRoomMemberTaskHostVM\n*L\n20#1:70\n20#1:71,2\n21#1:73\n21#1:74,2\n*E\n"})
public final class o0000oo extends o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState f56610OooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState f56611OooO0O0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(-1, null, 2, null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f56612OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f56613OooO0Oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(((oO00OO0O) o00Ooo.f46421OooOOOo.getValue()).OooOO0O()), null, 2, null);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f56615OooO0o0 = OffsetKt.Offset(0.0f, 0.0f);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final o000<RoomMemberTaskHostInfoModel> f56614OooO0o = new o000<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.LiveRoomMemberTaskHostVM$taskListSource$1", f = "LiveRoomMemberTaskHostVM.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLiveRoomMemberTaskHostVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskHostVM.kt\ncom/yalla/yalla/ui/vm/room/LiveRoomMemberTaskHostVM$taskListSource$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n1855#2,2:70\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskHostVM.kt\ncom/yalla/yalla/ui/vm/room/LiveRoomMemberTaskHostVM$taskListSource$1\n*L\n41#1:70,2\n*E\n"})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<RoomMemberTaskHostInfoModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56616OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o0000oo.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000Oo0<RoomMemberTaskHostInfoModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<RoomMemberTaskHostInfoModel> taskList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56616OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO o00oo2 = o00OO.f46151OooO00o;
                Long value = OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
                if (value == null) {
                    value = Boxing.boxLong(0L);
                }
                long jLongValue = value.longValue();
                this.f56616OooO0Oo = 1;
                obj = o00oo2.OooO00o(jLongValue, this);
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
                    long dayFriendShip = roomMemberHostTaskModel.getDayFriendShip();
                    o0000oo o0000ooVar = o0000oo.this;
                    o0000ooVar.f56610OooO00o.setValue(Long.valueOf(dayFriendShip));
                    o0000ooVar.f56611OooO0O0.setValue(Integer.valueOf(roomMemberHostTaskModel.getWeekRank()));
                }
                RoomMemberHostTaskModel roomMemberHostTaskModel2 = (RoomMemberHostTaskModel) apiResult.getData();
                if (roomMemberHostTaskModel2 != null && (taskList = roomMemberHostTaskModel2.getTaskList()) != null) {
                    for (RoomMemberTaskHostInfoModel roomMemberTaskHostInfoModel : taskList) {
                        int taskId = roomMemberTaskHostInfoModel.getTaskId();
                        if (taskId == 1) {
                            roomMemberTaskHostInfoModel.setTaskIcon(o0O0O00.ic_room_member_task_1);
                            roomMemberTaskHostInfoModel.setTaskName(o0000.OooO0OO(o000000.host_Stay_in_room));
                        } else if (taskId == 2) {
                            roomMemberTaskHostInfoModel.setTaskIcon(o0O0O00.ic_room_member_task_2);
                            roomMemberTaskHostInfoModel.setTaskName(o0000.OooO0OO(o000000.host_Chat_in_room));
                        } else if (taskId == 3) {
                            roomMemberTaskHostInfoModel.setTaskIcon(o0O0O00.ic_room_member_task_3);
                            roomMemberTaskHostInfoModel.setTaskName(o0000.OooO0OO(o000000.host_Share_the_room));
                        } else if (taskId == 4) {
                            roomMemberTaskHostInfoModel.setTaskIcon(o0O0O00.ic_room_member_task_4);
                            roomMemberTaskHostInfoModel.setTaskName(o0000.OooO0OO(o000000.host_Send_golds_gifts));
                        }
                    }
                }
            }
            RoomMemberHostTaskModel roomMemberHostTaskModel3 = (RoomMemberHostTaskModel) apiResult.getData();
            return apiResult.toPagingLoadResource(roomMemberHostTaskModel3 != null ? roomMemberHostTaskModel3.getTaskList() : null, false);
        }
    }
}
