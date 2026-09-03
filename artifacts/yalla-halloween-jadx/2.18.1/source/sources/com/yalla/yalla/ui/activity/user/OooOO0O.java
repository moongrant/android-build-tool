package com.yalla.yalla.ui.activity.user;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.vm.UserInfoEditVM;
import com.yalla.yalla.ui.activity.BaseActivityK;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p142o00OOooO.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserInfoEditActivity f23351Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(UserInfoEditActivity userInfoEditActivity) {
        super(1);
        this.f23351Oooo0o = userInfoEditActivity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            UserInfoEditActivity userInfoEditActivity = this.f23351Oooo0o;
            UserInfoEditActivity.OooO00o oooO00o = UserInfoEditActivity.f23493o0ooOOo;
            Objects.requireNonNull(userInfoEditActivity);
            BaseActivityK.OooOoo0(userInfoEditActivity, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.uploading), 0L, 2, null);
            UserInfoEditVM.uploadAvatar$default((UserInfoEditVM) userInfoEditActivity.f23498OooooOO.getValue(), uriOooO0O0, null, false, 6, null).observe(userInfoEditActivity, new o00O0000(userInfoEditActivity, 4));
        }
        return Unit.INSTANCE;
    }
}
