package com.yalla.yalla.ui.activity.room;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.room.RoomItemInfoModel;
import com.yalla.yalla.model.room.RoomItemInfoModelTag;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSettingActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomSettingActivity$initObserve$8\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1013:1\n1864#2,3:1014\n*S KotlinDebug\n*F\n+ 1 RoomSettingActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomSettingActivity$initObserve$8\n*L\n316#1:1014,3\n*E\n"})
public final class o0o0Oo implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26948OooO0Oo;

    public o0o0Oo(RoomSettingActivity roomSettingActivity) {
        this.f26948OooO0Oo = roomSettingActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        RoomSettingActivity roomSettingActivity = this.f26948OooO0Oo;
        int i = 0;
        for (Object obj2 : roomSettingActivity.f26649OooOo00) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RoomItemInfoModel roomItemInfoModel = (RoomItemInfoModel) obj2;
            if (roomItemInfoModel.getTag() == RoomItemInfoModelTag.AllowOpenApplyMic) {
                roomItemInfoModel.setTurnOnSwitch(Boolean.valueOf(com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.OooO()));
                roomSettingActivity.OooOo().notifyDataSetChanged();
            }
            i = i2;
        }
    }
}
