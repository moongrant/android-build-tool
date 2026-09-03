package p474o0o00;

import com.code.android.json.OooO00o;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiError1069;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p375o0OOoOO.o00000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O0 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f47236OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(LoginActivity loginActivity) {
        super(1);
        this.f47236OooO0Oo = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError error = apiError;
        Intrinsics.checkNotNullParameter(error, "it");
        int i = LoginActivity.f25186OooOo0O;
        LoginActivity loginActivity = this.f47236OooO0Oo;
        loginActivity.getClass();
        if (error.getCode() == 1069) {
            try {
                Function2<? super String, ? super Throwable, Unit> function2 = OooO00o.f10146OooO00o;
                ApiError1069 apiError1069 = (ApiError1069) OooO00o.OooO0OO(ApiError1069.class, error.getMessage());
                List listSplit$default = StringsKt__StringsKt.split$default(String.valueOf(apiError1069 != null ? apiError1069.getData() : null), new String[]{","}, false, 0, 6, (Object) null);
                if ((!listSplit$default.isEmpty()) && (!StringsKt.isBlank((CharSequence) listSplit$default.get(0)))) {
                    int i2 = SmsCodeActivity.f25298Oooo0;
                    SmsCodeActivity.OooO00o.OooO00o(loginActivity, (String) listSplit$default.get(0), (String) listSplit$default.get(1), ClientCodeType.LoginVerification, 0, null, 0, null, false, 496);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
