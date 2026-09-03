package p581o0oOoo;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o000000;
import com.code.android.util.o0000O;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomMemberTaskInfoModel;
import com.yalla.yalla.model.room.RoomMemberTaskModel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
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
import p412o0Oo0o0O.o00OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomMemberTaskVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskVM.kt\ncom/yalla/yalla/ui/vm/room/LiveRoomMemberTaskVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,79:1\n81#2:80\n107#2,2:81\n81#2:83\n107#2,2:84\n81#2:86\n107#2,2:87\n81#2:89\n107#2,2:90\n81#2:92\n107#2,2:93\n81#2:95\n107#2,2:96\n81#2:98\n107#2,2:99\n81#2:101\n107#2,2:102\n81#2:104\n107#2,2:105\n81#2:107\n107#2,2:108\n81#2:110\n107#2,2:111\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskVM.kt\ncom/yalla/yalla/ui/vm/room/LiveRoomMemberTaskVM\n*L\n21#1:80\n21#1:81,2\n22#1:83\n22#1:84,2\n23#1:86\n23#1:87,2\n24#1:89\n24#1:90,2\n25#1:92\n25#1:93,2\n26#1:95\n26#1:96,2\n27#1:98\n27#1:99,2\n28#1:101\n28#1:102,2\n29#1:104\n29#1:105,2\n30#1:107\n30#1:108,2\n31#1:110\n31#1:111,2\n*E\n"})
public final class o0000O0 extends o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState f56574OooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState f56575OooO0O0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f56576OooO0OO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(1, null, 2, null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState f56577OooO0Oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState f56579OooO0o0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(20, null, 2, null);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f56578OooO0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableState f56580OooO0oO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(510L, null, 2, null);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableState f56581OooO0oo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableState f56573OooO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f56582OooOO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final MutableState f56583OooOO0O = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f56584OooOO0o = OffsetKt.Offset(0.0f, 0.0f);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final o000<RoomMemberTaskInfoModel> f56585OooOOO0 = new o000<>(ViewModelKt.getViewModelScope(this), new OooO00o(null));

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.LiveRoomMemberTaskVM$taskListSource$1", f = "LiveRoomMemberTaskVM.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nLiveRoomMemberTaskVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomMemberTaskVM.kt\ncom/yalla/yalla/ui/vm/room/LiveRoomMemberTaskVM$taskListSource$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1855#2,2:80\n*S KotlinDebug\n*F\n+ 1 LiveRoomMemberTaskVM.kt\ncom/yalla/yalla/ui/vm/room/LiveRoomMemberTaskVM$taskListSource$1\n*L\n55#1:80,2\n*E\n"})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super o000Oo0<RoomMemberTaskInfoModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f56586OooO0Oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o0000O0.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000Oo0<RoomMemberTaskInfoModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<RoomMemberTaskInfoModel> taskList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f56586OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO o00oo2 = o00OO.f46151OooO00o;
                long jOooO0o0 = com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.OooO0o0();
                this.f56586OooO0Oo = 1;
                obj = o00oo2.OooO0OO(jOooO0o0, this);
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
                    String badgeUrl = roomMemberTaskModel.getBadgeUrl();
                    o0000O0 o0000o1 = o0000O0.this;
                    o0000o1.getClass();
                    Intrinsics.checkNotNullParameter(badgeUrl, "<set-?>");
                    o0000o1.f56574OooO00o.setValue(badgeUrl);
                    o0000o1.f56575OooO0O0.setValue(Integer.valueOf(roomMemberTaskModel.getMemberLevel()));
                    o0000o1.f56576OooO0OO.setValue(Integer.valueOf(roomMemberTaskModel.getBadgeLevel()));
                    o0000o1.f56577OooO0Oo.setValue(Boolean.valueOf(o000000.OooO00o(Boxing.boxInt(roomMemberTaskModel.getBadgeSate()))));
                    o0000o1.f56579OooO0o0.setValue(Integer.valueOf(roomMemberTaskModel.getMemberLevelLimit()));
                    o0000o1.f56578OooO0o.setValue(Long.valueOf(roomMemberTaskModel.getDayFriendShip()));
                    o0000o1.f56580OooO0oO.setValue(Long.valueOf(roomMemberTaskModel.getDayFriendShipLimit()));
                    o0000o1.f56581OooO0oo.setValue(Long.valueOf(roomMemberTaskModel.getTotalFriendShip()));
                    o0000o1.f56582OooOO0.setValue(Long.valueOf(roomMemberTaskModel.getTotalProgress()));
                    o0000o1.f56583OooOO0O.setValue(Long.valueOf(roomMemberTaskModel.getCurrentProgress()));
                    o0000o1.f56573OooO.setValue(Integer.valueOf(roomMemberTaskModel.getWeekRank()));
                }
                RoomMemberTaskModel roomMemberTaskModel2 = (RoomMemberTaskModel) apiResult.getData();
                if (roomMemberTaskModel2 != null && (taskList = roomMemberTaskModel2.getTaskList()) != null) {
                    for (RoomMemberTaskInfoModel roomMemberTaskInfoModel : taskList) {
                        int taskId = roomMemberTaskInfoModel.getTaskId();
                        if (taskId == 1) {
                            roomMemberTaskInfoModel.setTaskDesc(o0000O.OooO00o(o0000.OooO0OO(p562o0oOo000.o000000.Stay_in_room_desc), String.valueOf(roomMemberTaskInfoModel.getUnitRewardVal())));
                            roomMemberTaskInfoModel.setTaskName(o0000.OooO0OO(p562o0oOo000.o000000.Stay_in_room));
                        } else if (taskId == 2) {
                            roomMemberTaskInfoModel.setTaskDesc(o0000O.OooO00o(o0000.OooO0OO(p562o0oOo000.o000000.Chat_in_room_desc), String.valueOf(roomMemberTaskInfoModel.getUnitRewardVal())));
                            roomMemberTaskInfoModel.setTaskName(o0000.OooO0OO(p562o0oOo000.o000000.Chat_in_room));
                        } else if (taskId == 3) {
                            roomMemberTaskInfoModel.setTaskDesc(o0000O.OooO00o(o0000.OooO0OO(p562o0oOo000.o000000.Share_the_room_desc), String.valueOf(roomMemberTaskInfoModel.getUnitRewardVal())));
                            roomMemberTaskInfoModel.setTaskName(o0000.OooO0OO(p562o0oOo000.o000000.Share_the_room));
                        } else if (taskId == 4) {
                            roomMemberTaskInfoModel.setTaskDesc(o0000O.OooO00o(o0000.OooO0OO(p562o0oOo000.o000000.Send_golds_gifts_desc), String.valueOf(roomMemberTaskInfoModel.getUnitRewardVal())));
                            roomMemberTaskInfoModel.setTaskName(o0000.OooO0OO(p562o0oOo000.o000000.Send_golds_gifts));
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
        return ((Boolean) this.f56577OooO0Oo.getValue()).booleanValue();
    }
}
