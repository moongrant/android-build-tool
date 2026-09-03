package p506o0o00oOo;

import com.yalla.yalla.app.application.App;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.SelectDialogModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p004OooO0oO.o0OoOo0;
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p426o0OoO0o0.OooOOOO;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOOO000o extends Lambda implements Function2<Integer, SelectDialogModel<?>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f50536OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOO000o(UserInfoActivity userInfoActivity) {
        super(2);
        this.f50536OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, SelectDialogModel<?> selectDialogModel) {
        int iIntValue = num.intValue();
        SelectDialogModel<?> item = selectDialogModel;
        Intrinsics.checkNotNullParameter(item, "item");
        UserInfoActivity userInfoActivity = this.f50536OooO0Oo;
        if (iIntValue == 0) {
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f26775Oooo0o;
            userInfoActivity.OooOoo0(1);
        } else {
            UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f26775Oooo0o;
            userInfoActivity.getClass();
            o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
            CloudFileType cloudFileType = CloudFileType.USER_BACKGROUND;
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            String strOooO00o = o0OoOo0.OooO00o();
            oOo00o00 ooo00o00 = new oOo00o00(userInfoActivity);
            boolean z = App.f22233OooO0o0;
            LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
            linkedHashMapOooO00o.put("type", cloudFileType.getCode() + "");
            linkedHashMapOooO00o.put("id", strOooO00o);
            linkedHashMapOooO00o.put("imgUpType", "1");
            linkedHashMapOooO00o.put("imageurl", "");
            OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, "/WebserversME/PictureME/PicQiniu", linkedHashMapOooO00o, ooo00o00);
        }
        return Unit.INSTANCE;
    }
}
