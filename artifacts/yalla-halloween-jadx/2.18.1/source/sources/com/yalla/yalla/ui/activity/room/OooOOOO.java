package com.yalla.yalla.ui.activity.room;

import com.app.base.dialog.baseDialog.SelectDialogModel;
import com.app.base.interfaceType.FeedbackType;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.model.RoomItemInfoModel;
import com.app.base.model.RoomItemInfoModelTag;
import com.app.base.view.pop.selectPop.SelectItemModel;
import com.app.base.view.pop.selectPop.SelectModel;
import com.weieyu.yalla.R;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p159o00OoOO.o00;
import p159o00OoOO.o000O00O;
import p159o00OoOO.o00O000;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends Lambda implements Function2<Integer, SelectDialogModel<String>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f22925Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f22926Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(RoomSettingActivity roomSettingActivity, int i) {
        super(2);
        this.f22925Oooo0o = roomSettingActivity;
        this.f22926Oooo0oO = i;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList, java.util.List<com.app.base.model.RoomItemInfoModel>] */
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
                SelectModel selectModel = this.f22925Oooo0o.f22973OooooO0;
                if (i >= ((selectModel == null || (list2 = selectModel.getList()) == null) ? 0 : list2.size())) {
                    break;
                }
                SelectModel selectModel2 = this.f22925Oooo0o.f22973OooooO0;
                if (selectModel2 != null && (list = selectModel2.getList()) != null && (selectItemModel = list.get(i)) != null) {
                    int i2 = this.f22926Oooo0oO;
                    RoomSettingActivity roomSettingActivity = this.f22925Oooo0o;
                    selectItemModel.setState(false);
                    if (iIntValue == i) {
                        selectItemModel.setState(true);
                        if (i2 == 1) {
                            Objects.requireNonNull(roomSettingActivity);
                            o00O000 o00o000OooO = o00O000.OooO();
                            String str = selectItemModel.getId() + "";
                            Objects.requireNonNull(o00o000OooO);
                            o00 o00Var = o00O000.f32468OooO00o;
                            if (o00Var != null) {
                                o00Var.OooO0o(10029, "{\"allow\":" + str + "}");
                            }
                            RoomConfiguration roomConfiguration = o000O00O.OooO().f32427Oooo;
                            if (roomConfiguration != null) {
                                roomConfiguration.setGuestlive(Intrinsics.areEqual(selectItemModel.getName(), o000O0O0.OooO0OO(R.string.everyone)));
                            }
                            if (roomSettingActivity.f22971Ooooo00.size() > 0) {
                                int size = roomSettingActivity.f22971Ooooo00.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    if (((RoomItemInfoModel) roomSettingActivity.f22971Ooooo00.get(i3)).getTag() == RoomItemInfoModelTag.Permissions) {
                                        ((RoomItemInfoModel) roomSettingActivity.f22971Ooooo00.get(i3)).setContent(selectItemModel.getName());
                                        break;
                                    }
                                }
                                roomSettingActivity.OooOoo().notifyDataSetChanged();
                            }
                        } else if (i2 == 2) {
                            Objects.requireNonNull(roomSettingActivity);
                            if (Intrinsics.areEqual(selectItemModel.getName(), FeedbackType.Others)) {
                                if (roomSettingActivity.f22977Oooooo0 != 0) {
                                    o00O000.OooO().OooO0Oo(0);
                                    o0O00000.OooO0o0("InRoom_setting_mic_success", FeedbackType.Others);
                                }
                            } else if (roomSettingActivity.f22977Oooooo0 != 1) {
                                o00O000.OooO().OooO0Oo(1);
                                o0O00000.OooO0o0("InRoom_setting_mic_success", "10");
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
