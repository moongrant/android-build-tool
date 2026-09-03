package p474o0o00;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO extends Lambda implements Function1<ApiResult<Boolean>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f47273OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO(PhoneNumberActivity phoneNumberActivity) {
        super(1);
        this.f47273OooO0Oo = phoneNumberActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<Boolean> apiResult) {
        ApiResult<Boolean> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f47273OooO0Oo.OooOo0();
        return Unit.INSTANCE;
    }
}
