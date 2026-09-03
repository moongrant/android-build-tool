package com.yalla.yalla.ui.activity.room;

import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.ui.vm.RoomInfoEditVM;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p650o0ooo.a;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo00 extends Lambda implements Function1<p182o00o000O.OooO0o, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26434OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(RoomSettingActivity roomSettingActivity) {
        super(1);
        this.f26434OooO0Oo = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(p182o00o000O.OooO0o oooO0o) {
        p182o00o000O.OooO0o oooO0o2 = oooO0o;
        RoomSettingActivity roomSettingActivity = this.f26434OooO0Oo;
        a aVar = roomSettingActivity.f26193OooOo;
        if (aVar != null) {
            aVar.OooO00o();
        }
        if (oooO0o2 != null && oooO0o2.OooO00o() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(oooO0o2);
            RoomInfoEditVM roomInfoEditVM = roomSettingActivity.f26201OooOoo;
            if (roomInfoEditVM == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                roomInfoEditVM = null;
            }
            RoomConfiguration roomConfiguration = roomSettingActivity.f26194OooOo0;
            roomInfoEditVM.changeImageUrl(String.valueOf(roomConfiguration != null ? roomConfiguration.getBarid() : null), arrayList).observe(roomSettingActivity, new RoomSettingActivity.OooOO0O(new o00O0OO(oooO0o2, roomSettingActivity)));
        }
        return Unit.INSTANCE;
    }
}
