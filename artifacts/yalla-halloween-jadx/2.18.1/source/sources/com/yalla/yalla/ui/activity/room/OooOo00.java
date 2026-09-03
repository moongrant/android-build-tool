package com.yalla.yalla.ui.activity.room;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.vm.RoomInfoEditVM;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p139o00OOOo0.o0ooOOo;
import p501o0o00o.o0000O0;
import p707oOooo0o.o000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomSettingActivity f22928Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(RoomSettingActivity roomSettingActivity) {
        super(1);
        this.f22928Oooo0o = roomSettingActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            RoomSettingActivity roomSettingActivity = this.f22928Oooo0o;
            if (roomSettingActivity.f22975OooooOo == null) {
                Objects.requireNonNull(o0ooOOo.OooO00o());
                roomSettingActivity.f22975OooooOo = new o000O();
            }
            o000O o000o = roomSettingActivity.f22975OooooOo;
            if (o000o != null) {
                o000o.OooO0O0(roomSettingActivity, R.string.uploading);
            }
            RoomInfoEditVM roomInfoEditVM = roomSettingActivity.f22982o0OoOo0;
            if (roomInfoEditVM == null) {
                Intrinsics.throwUninitializedPropertyAccessException("vm");
                roomInfoEditVM = null;
            }
            roomInfoEditVM.uploadRoomHeader(uriOooO0O0).observe(roomSettingActivity, new o0000O0(roomSettingActivity, 4));
        }
        return Unit.INSTANCE;
    }
}
