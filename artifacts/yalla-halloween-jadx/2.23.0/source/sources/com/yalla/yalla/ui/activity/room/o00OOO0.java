package com.yalla.yalla.ui.activity.room;

import androidx.lifecycle.Observer;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.model.ProfileLimitModel;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomSettingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomSettingActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomSettingActivity$initObserve$6\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1013:1\n1864#2,3:1014\n*S KotlinDebug\n*F\n+ 1 RoomSettingActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomSettingActivity$initObserve$6\n*L\n289#1:1014,3\n*E\n"})
public final class o00OOO0 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26883OooO0Oo;

    public o00OOO0(RoomSettingActivity roomSettingActivity) {
        this.f26883OooO0Oo = roomSettingActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i;
        RoomConfiguration roomConfiguration;
        ArrayList<ProfileLimitModel> profileLimit;
        ArrayList<ProfileLimitModel> profileLimit2;
        RoomSettingActivity roomSettingActivity = this.f26883OooO0Oo;
        roomSettingActivity.f26652OooOoO.setValue(null);
        RoomConfiguration roomConfiguration2 = roomSettingActivity.f26648OooOo0;
        if (roomConfiguration2 == null || (profileLimit2 = roomConfiguration2.getProfileLimit()) == null) {
            i = -1;
        } else {
            int i2 = 0;
            i = -1;
            for (Object obj2 : profileLimit2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (((ProfileLimitModel) obj2).getOperationType() == 1) {
                    i = i2;
                }
                i2 = i3;
            }
        }
        if (i <= -1 || (roomConfiguration = roomSettingActivity.f26648OooOo0) == null || (profileLimit = roomConfiguration.getProfileLimit()) == null) {
            return;
        }
        profileLimit.remove(i);
    }
}
