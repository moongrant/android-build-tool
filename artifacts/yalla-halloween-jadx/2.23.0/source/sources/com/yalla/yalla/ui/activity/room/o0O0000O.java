package com.yalla.yalla.ui.activity.room;

import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.view.pop.memberFee.MemberFeeModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0000O extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f26896OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26897OooO0o0;

    public o0O0000O(RoomSettingActivity roomSettingActivity, int i) {
        this.f26897OooO0o0 = roomSettingActivity;
        this.f26896OooO0o = i;
    }

    @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
    public final void OooO0o0(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        RoomSettingActivity roomSettingActivity = this.f26897OooO0o0;
        if (roomSettingActivity.f26648OooOo0 == null) {
            return;
        }
        MutableLiveData<Integer> mutableLiveData = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25014OooOOo0;
        int i = this.f26896OooO0o;
        mutableLiveData.postValue(Integer.valueOf(i));
        MemberFeeModel memberFeeModel = roomSettingActivity.f26651OooOo0o;
        if (memberFeeModel != null) {
            memberFeeModel.setFee(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        String dues = sb.toString();
        Intrinsics.checkNotNullParameter(dues, "dues");
        RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
        RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
        if (roomLiveService2 != null) {
            roomLiveService2.OooO0oO(10041, "{\"dues\":" + dues + "}");
        }
    }
}
