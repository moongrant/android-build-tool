package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.ui.vm.RoomInfoEditVM;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0oO.O0000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000 extends Lambda implements Function1<p136o00OOOo0.OooO0OO, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26894OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(RoomSettingActivity roomSettingActivity) {
        super(1);
        this.f26894OooO0Oo = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p136o00OOOo0.OooO0OO oooO0OO) {
        p136o00OOOo0.OooO0OO oooO0OO2 = oooO0OO;
        RoomSettingActivity roomSettingActivity = this.f26894OooO0Oo;
        O0000000 o0000000 = roomSettingActivity.f26647OooOo;
        if (o0000000 != null) {
            o0000000.OooO00o();
        }
        if (oooO0OO2 != null && oooO0OO2.OooO00o() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(oooO0OO2);
            RoomInfoEditVM roomInfoEditVM = roomSettingActivity.f26655OooOoo;
            if (roomInfoEditVM == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                roomInfoEditVM = null;
            }
            RoomConfiguration roomConfiguration = roomSettingActivity.f26648OooOo0;
            roomInfoEditVM.changeImageUrl(String.valueOf(roomConfiguration != null ? roomConfiguration.getBarid() : null), arrayList).observe(roomSettingActivity, new RoomSettingActivity.OooOO0O(new oo0oOO0(oooO0OO2, roomSettingActivity)));
        }
        return Unit.INSTANCE;
    }
}
