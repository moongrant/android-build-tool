package com.yalla.yalla.ui.activity.room;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.room.RoomItemInfoModel;
import com.yalla.yalla.model.room.RoomItemInfoModelTag;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSettingActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomSettingActivity$initObserve$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1013:1\n1864#2,3:1014\n*S KotlinDebug\n*F\n+ 1 RoomSettingActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomSettingActivity$initObserve$4\n*L\n269#1:1014,3\n*E\n"})
public final class o00OO implements Observer<Boolean> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26878OooO0Oo;

    public o00OO(RoomSettingActivity roomSettingActivity) {
        this.f26878OooO0Oo = roomSettingActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Boolean bool) {
        Boolean bool2 = bool;
        RoomSettingActivity roomSettingActivity = this.f26878OooO0Oo;
        int i = 0;
        for (Object obj : roomSettingActivity.f26649OooOo00) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RoomItemInfoModel roomItemInfoModel = (RoomItemInfoModel) obj;
            if (roomItemInfoModel.getTag() == RoomItemInfoModelTag.EnterRoomAllow) {
                roomItemInfoModel.setTurnOnSwitch(Boolean.valueOf(!Intrinsics.areEqual(bool2, Boolean.TRUE)));
                roomSettingActivity.OooOo().notifyDataSetChanged();
                return;
            }
            i = i2;
        }
    }
}
