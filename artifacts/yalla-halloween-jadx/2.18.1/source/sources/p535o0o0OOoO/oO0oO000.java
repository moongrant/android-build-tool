package p535o0o0OOoO;

import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApi;
import com.app.base.model.PrivacySetModel;
import com.yalla.yalla.ui.activity.main.PrivacyActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0oO000 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PrivacyActivity f43672OooO00o;

    public static final class OooO00o extends o00000O0<AbsJavaBeanApi<PrivacySetModel>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0oO000(PrivacyActivity privacyActivity) {
        super(privacyActivity);
        this.f43672OooO00o = privacyActivity;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@NotNull String code2, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code2, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onError(code2, message);
        PrivacyActivity.OooOoO(this.f43672OooO00o, null);
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) o0Oo0oo.OooO0OO(response, new OooO00o().getType());
        if (absJavaBeanApi == null || absJavaBeanApi.getData() == null) {
            PrivacyActivity.OooOoO(this.f43672OooO00o, null);
        } else {
            PrivacyActivity.OooOoO(this.f43672OooO00o, (PrivacySetModel) absJavaBeanApi.getData());
        }
    }
}
