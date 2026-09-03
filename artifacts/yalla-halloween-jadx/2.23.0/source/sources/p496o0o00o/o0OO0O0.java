package p496o0o00o;

import androidx.compose.runtime.Oooo0;
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
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p464o0Oooo.o000000O;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0O0 extends Lambda implements Function2<Integer, SelectDialogModel<?>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserInfoActivity f49095OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0O0(UserInfoActivity userInfoActivity) {
        super(2);
        this.f49095OooO0Oo = userInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, SelectDialogModel<?> selectDialogModel) {
        int iIntValue = num.intValue();
        SelectDialogModel<?> item = selectDialogModel;
        Intrinsics.checkNotNullParameter(item, "item");
        UserInfoActivity userInfoActivity = this.f49095OooO0Oo;
        if (iIntValue == 0) {
            UserInfoActivity.OooO00o oooO00o = UserInfoActivity.f27240Oooo0o;
            userInfoActivity.OooOoo0(1);
        } else {
            UserInfoActivity.OooO00o oooO00o2 = UserInfoActivity.f27240Oooo0o;
            userInfoActivity.getClass();
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            CloudFileType cloudFileType = CloudFileType.USER_BACKGROUND;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            String strOooO00o = Oooo0.OooO00o();
            o0O00OO o0o00oo2 = new o0O00OO(userInfoActivity);
            boolean z = App.f22703OooO0o0;
            LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
            linkedHashMapOooO00o.put("type", cloudFileType.getCode() + "");
            linkedHashMapOooO00o.put("id", strOooO00o);
            linkedHashMapOooO00o.put("imgUpType", "1");
            linkedHashMapOooO00o.put("imageurl", "");
            OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, "/WebserversME/PictureME/PicQiniu", linkedHashMapOooO00o, o0o00oo2);
        }
        return Unit.INSTANCE;
    }
}
