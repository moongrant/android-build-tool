package com.yalla.yalla.ui.activity.room;

import com.app.base.protobuf.room.Room;
import com.yalla.yalla.data.constant.FeedbackType;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.model.room.RoomItemInfoModel;
import com.yalla.yalla.model.room.RoomItemInfoModelTag;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.view.pop.selectPop.SelectItemModel;
import com.yalla.yalla.ui.view.pop.selectPop.SelectModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0 extends Lambda implements Function2<Integer, SelectDialogModel<String>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26426OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f26427OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0(RoomSettingActivity roomSettingActivity, int i) {
        super(2);
        this.f26426OooO0Oo = roomSettingActivity;
        this.f26427OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, SelectDialogModel<String> selectDialogModel) {
        List<SelectItemModel> list;
        SelectItemModel selectItemModel;
        List<SelectItemModel> list2;
        int iIntValue = num.intValue();
        SelectDialogModel<String> itemData = selectDialogModel;
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        if (iIntValue >= 0) {
            int i = 0;
            while (true) {
                RoomSettingActivity roomSettingActivity = this.f26426OooO0Oo;
                SelectModel selectModel = roomSettingActivity.f26196OooOo0O;
                if (i >= ((selectModel == null || (list2 = selectModel.getList()) == null) ? 0 : list2.size())) {
                    break;
                }
                SelectModel selectModel2 = roomSettingActivity.f26196OooOo0O;
                if (selectModel2 != null && (list = selectModel2.getList()) != null && (selectItemModel = list.get(i)) != null) {
                    selectItemModel.setState(false);
                    if (iIntValue == i) {
                        selectItemModel.setState(true);
                        int i2 = this.f26427OooO0o0;
                        if (i2 == 1) {
                            long id = selectItemModel.getId();
                            StringBuilder sb = new StringBuilder();
                            sb.append(id);
                            String message = sb.toString();
                            Intrinsics.checkNotNullParameter(message, "message");
                            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
                            if (roomLiveService != null) {
                                roomLiveService.OooO0oO(10029, "{\"allow\":" + message + "}");
                            }
                            RoomConfiguration roomConfiguration = MixedRoomDataSource.OooO0o0().f22991OooO0o;
                            if (roomConfiguration != null) {
                                roomConfiguration.setGuestlive(Intrinsics.areEqual(selectItemModel.getName(), com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.everyone)));
                            }
                            ArrayList arrayList = roomSettingActivity.f26195OooOo00;
                            if (arrayList.size() > 0) {
                                int size = arrayList.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    if (((RoomItemInfoModel) arrayList.get(i3)).getTag() == RoomItemInfoModelTag.Permissions) {
                                        ((RoomItemInfoModel) arrayList.get(i3)).setContent(selectItemModel.getName());
                                        break;
                                    }
                                }
                                roomSettingActivity.OooOo().notifyDataSetChanged();
                            }
                        } else if (i2 == 2) {
                            if (Intrinsics.areEqual(selectItemModel.getName(), FeedbackType.Others)) {
                                if (roomSettingActivity.f26199OooOoO0 != 0) {
                                    Room.MicNumChangeRequest.Builder builderNewBuilder = Room.MicNumChangeRequest.newBuilder();
                                    builderNewBuilder.setMictype(0);
                                    RoomLiveService roomLiveService2 = RoomLiveService.f24596OooOo00;
                                    if (roomLiveService2 != null) {
                                        roomLiveService2.OooO0oo(10058, builderNewBuilder.build().toByteArray());
                                    }
                                    o0oo0000.OooO00o.OooO0OO("202013", MapsKt.mapOf(new Pair("micnum", 5)));
                                }
                            } else if (roomSettingActivity.f26199OooOoO0 != 1) {
                                Room.MicNumChangeRequest.Builder builderNewBuilder2 = Room.MicNumChangeRequest.newBuilder();
                                builderNewBuilder2.setMictype(1);
                                RoomLiveService roomLiveService3 = RoomLiveService.f24596OooOo00;
                                if (roomLiveService3 != null) {
                                    roomLiveService3.OooO0oo(10058, builderNewBuilder2.build().toByteArray());
                                }
                                o0oo0000.OooO00o.OooO0OO("202013", MapsKt.mapOf(new Pair("micnum", 10)));
                            }
                        }
                    }
                }
                i++;
            }
        }
        return Unit.INSTANCE;
    }
}
