package p491o0o00O0o;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000O extends Lambda implements Function1<ApiResult<Boolean>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f49005OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000O(PhoneNumberActivity phoneNumberActivity) {
        super(1);
        this.f49005OooO0Oo = phoneNumberActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<Boolean> apiResult) {
        ApiResult<Boolean> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f49005OooO0Oo.OooOo0();
        return Unit.INSTANCE;
    }
}
