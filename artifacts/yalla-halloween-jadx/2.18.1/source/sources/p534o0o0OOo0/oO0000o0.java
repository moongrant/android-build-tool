package p534o0o0OOo0;

import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0000o0 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f43610Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000o0(SmsCodeActivity smsCodeActivity) {
        super(1);
        this.f43610Oooo0o = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        SmsCodeActivity.OooOooo(this.f43610Oooo0o, it);
        return Unit.INSTANCE;
    }
}
