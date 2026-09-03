package p534o0o0OOo0;

import android.content.Intent;
import android.os.Parcelable;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiError1069;
import com.yalla.yalla.data.constant.ClientCodeType;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import o0o0000.OooOOOO;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoO00O extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f43590Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoO00O(LoginActivity loginActivity) {
        super(1);
        this.f43590Oooo0o = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError error = apiError;
        Intrinsics.checkNotNullParameter(error, "it");
        LoginActivity context = this.f43590Oooo0o;
        LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
        Objects.requireNonNull(context);
        if (error.getCode() == 1069) {
            try {
                o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                ApiError1069 apiError1069 = (ApiError1069) o0OOO0o.OooO0O0(error.getMessage(), ApiError1069.class);
                List listSplit$default = StringsKt__StringsKt.split$default(String.valueOf(apiError1069 != null ? apiError1069.getData() : null), new String[]{","}, false, 0, 6, (Object) null);
                if ((!listSplit$default.isEmpty()) && (!StringsKt.isBlank((CharSequence) listSplit$default.get(0)))) {
                    String str = (String) listSplit$default.get(0);
                    String str2 = (String) listSplit$default.get(1);
                    ClientCodeType clientCodeType = ClientCodeType.LoginVerification;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent intent = new Intent(context, (Class<?>) SmsCodeActivity.class);
                    intent.putExtra("PHONE_NUMBER", str);
                    intent.putExtra("COUNTRY_AREA_CODE", str2);
                    intent.putExtra("TYPE_ACCOUNT", clientCodeType);
                    intent.putExtra("TYPE_UNBIND", -1);
                    intent.putExtra("DELETE_REASON_TYPE", (Parcelable) null);
                    intent.putExtra("IS_ACTIVATE", 0);
                    context.startActivity(intent);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
