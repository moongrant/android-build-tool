package com.yalla.yalla.ui.activity.room;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.yalla.yalla.ui.vm.RoomInfoEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p519o0o0O0oO.O0000000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26821OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(RoomSettingActivity roomSettingActivity) {
        super(1);
        this.f26821OooO0Oo = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            RoomSettingActivity roomSettingActivity = this.f26821OooO0Oo;
            if (roomSettingActivity.f26647OooOo == null) {
                p519o0o0O0oO.o0O00O0o.OooO00o().getClass();
                roomSettingActivity.f26647OooOo = new O0000000();
            }
            O0000000 o0000000 = roomSettingActivity.f26647OooOo;
            if (o0000000 != null) {
                o0000000.OooO0O0(oO00OOo0.uploading, roomSettingActivity);
            }
            RoomInfoEditVM roomInfoEditVM = roomSettingActivity.f26655OooOoo;
            if (roomInfoEditVM == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                roomInfoEditVM = null;
            }
            roomInfoEditVM.uploadRoomHeader(uriOooO0O0).observe(roomSettingActivity, new RoomSettingActivity.OooOO0O(new o0O000(roomSettingActivity)));
        }
        return Unit.INSTANCE;
    }
}
