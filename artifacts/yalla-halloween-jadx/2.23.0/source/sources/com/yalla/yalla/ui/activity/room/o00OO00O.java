package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.room.RoomItemInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO00O extends Lambda implements Function1<ProfileLimitModel, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26880OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(RoomSettingActivity roomSettingActivity) {
        super(1);
        this.f26880OooO0Oo = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ProfileLimitModel profileLimitModel) {
        ProfileLimitModel profileLimitModel2 = profileLimitModel;
        RoomSettingActivity roomSettingActivity = this.f26880OooO0Oo;
        for (RoomItemInfoModel roomItemInfoModel : roomSettingActivity.f26649OooOo00) {
            ProfileLimitModel profileLimitModel3 = roomItemInfoModel.getProfileLimitModel();
            if (profileLimitModel3 != null && profileLimitModel3.getOperationType() == 3) {
                roomItemInfoModel.setProfileLimitModel(profileLimitModel2);
            }
        }
        roomSettingActivity.OooOo().notifyDataSetChanged();
        return Unit.INSTANCE;
    }
}
