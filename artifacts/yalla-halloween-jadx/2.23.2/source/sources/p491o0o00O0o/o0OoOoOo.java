package p491o0o00O0o;

import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OoOoOo extends Lambda implements Function1<ApiResult<LoginListModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f49060OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOoOo(PhoneNumberActivity phoneNumberActivity) {
        super(1);
        this.f49060OooO0Oo = phoneNumberActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<LoginListModel> apiResult) {
        if (apiResult.isSuccess()) {
            this.f49060OooO0Oo.finish();
        }
        return Unit.INSTANCE;
    }
}
