package p535o0o0OOoO;

import android.widget.TextView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.bean.AbsJavaBeanApi;
import com.app.base.model.PrivacySetModel;
import com.yalla.yalla.ui.activity.main.PrivacyActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO000 extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PrivacyActivity f43679OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f43680OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ String f43681OooO0OO;

    public static final class OooO00o extends o00000O0<AbsJavaBeanApi<String>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO000(PrivacyActivity privacyActivity, int i, String str) {
        super(privacyActivity);
        this.f43679OooO00o = privacyActivity;
        this.f43680OooO0O0 = i;
        this.f43681OooO0OO = str;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        PrivacySetModel privacySetModel;
        Intrinsics.checkNotNullParameter(response, "response");
        AbsJavaBeanApi absJavaBeanApi = (AbsJavaBeanApi) o0Oo0oo.OooO0OO(response, new OooO00o().getType());
        if ((absJavaBeanApi != null ? (String) absJavaBeanApi.getData() : null) == null || (privacySetModel = this.f43679OooO00o.f22051Ooooo0o) == null) {
            return;
        }
        Intrinsics.checkNotNull(privacySetModel);
        privacySetModel.setSeeroom(this.f43680OooO0O0);
        TextView textView = this.f43679OooO00o.f22049OoooOoo;
        Intrinsics.checkNotNull(textView);
        textView.setText(this.f43681OooO0OO);
    }
}
