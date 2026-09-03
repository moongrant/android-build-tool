package p534o0o0OOo0;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0 extends Lambda implements Function1<ApiResult<Boolean>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f43568Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0(PhoneNumberActivity phoneNumberActivity) {
        super(1);
        this.f43568Oooo0o = phoneNumberActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<Boolean> apiResult) {
        ApiResult<Boolean> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f43568Oooo0o.OooOoO();
        return Unit.INSTANCE;
    }
}
