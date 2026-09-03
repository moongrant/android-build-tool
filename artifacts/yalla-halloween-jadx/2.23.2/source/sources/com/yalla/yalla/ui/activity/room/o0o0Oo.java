package com.yalla.yalla.ui.activity.room;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.yalla.yalla.ui.vm.RoomInfoEditVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p650o0ooo.a;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f26481OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(RoomSettingActivity roomSettingActivity) {
        super(1);
        this.f26481OooO0Oo = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            RoomSettingActivity roomSettingActivity = this.f26481OooO0Oo;
            if (roomSettingActivity.f26193OooOo == null) {
                p650o0ooo.o00O0OO0.OooO00o().getClass();
                roomSettingActivity.f26193OooOo = new a();
            }
            a aVar = roomSettingActivity.f26193OooOo;
            if (aVar != null) {
                aVar.OooO0O0(p562o0oOo000.o000000.uploading, roomSettingActivity);
            }
            RoomInfoEditVM roomInfoEditVM = roomSettingActivity.f26201OooOoo;
            if (roomInfoEditVM == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                roomInfoEditVM = null;
            }
            roomInfoEditVM.uploadRoomHeader(uriOooO0O0).observe(roomSettingActivity, new RoomSettingActivity.OooOO0O(new o00Oo00(roomSettingActivity)));
        }
        return Unit.INSTANCE;
    }
}
