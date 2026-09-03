package p535o0o0OOoO;

import android.widget.ImageView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApi;
import com.app.base.model.PrivacySetModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.main.PrivacyActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PrivacyActivity f43629OooO00o;

    public static final class OooO00o extends o00000O0<AbsJavaBeanApi<String>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO(PrivacyActivity privacyActivity) {
        super(privacyActivity);
        this.f43629OooO00o = privacyActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) o0Oo0oo.OooO0OO(response, new OooO00o().getType());
        if ((absJavaBeanApi != null ? (String) absJavaBeanApi.getData() : null) != null) {
            PrivacySetModel privacySetModel = this.f43629OooO00o.f22051Ooooo0o;
            Intrinsics.checkNotNull(privacySetModel);
            PrivacySetModel privacySetModel2 = this.f43629OooO00o.f22051Ooooo0o;
            Intrinsics.checkNotNull(privacySetModel2);
            privacySetModel.setIsverify(privacySetModel2.getIsverify() == 1 ? 0 : 1);
            ImageView imageView = this.f43629OooO00o.f22047OoooOo0;
            Intrinsics.checkNotNull(imageView);
            PrivacySetModel privacySetModel3 = this.f43629OooO00o.f22051Ooooo0o;
            Intrinsics.checkNotNull(privacySetModel3);
            imageView.setImageResource(privacySetModel3.getIsverify() == 1 ? R.drawable.setting_right_sound_on : R.drawable.setting_right_sound_off);
        }
    }
}
