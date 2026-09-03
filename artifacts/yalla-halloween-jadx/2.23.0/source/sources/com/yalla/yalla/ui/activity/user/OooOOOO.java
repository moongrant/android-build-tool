package com.yalla.yalla.ui.activity.user;

import android.net.Uri;
import com.app.selectPicture.model.SelectImageData;
import com.code.android.util.o0000;
import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p496o0o00o.o;
import p496o0o00o.oO00000;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function1<SelectImageData, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f27134OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(UserInfoActivity userInfoActivity) {
        super(1);
        this.f27134OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SelectImageData selectImageData) {
        Uri uriOooO0O0;
        SelectImageData selectImageData2 = selectImageData;
        if (selectImageData2 != null && (uriOooO0O0 = selectImageData2.OooO0O0()) != null) {
            UserInfoActivity userInfoActivity = this.f27134OooO0Oo;
            int i = userInfoActivity.f27258Oooo0O0;
            if (i == 0) {
                BaseActivityK.OooOo0o(userInfoActivity, o0000.OooO0OO(oO00OOo0.uploading), 0L, 2);
                userInfoActivity.OooOooo().uploadAvatar(uriOooO0O0).observe(userInfoActivity, new UserInfoActivity.OooOOO0(new oO00000(userInfoActivity)));
            } else if (i == 1) {
                BaseActivityK.OooOo0o(userInfoActivity, o0000.OooO0OO(oO00OOo0.uploading), 0L, 2);
                userInfoActivity.OooOooo().uploadCover(uriOooO0O0).observe(userInfoActivity, new UserInfoActivity.OooOOO0(new o(userInfoActivity)));
            }
        }
        return Unit.INSTANCE;
    }
}
