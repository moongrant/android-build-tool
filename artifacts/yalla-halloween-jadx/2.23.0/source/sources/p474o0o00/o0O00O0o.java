package p474o0o00;

import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f47301OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O0o(SmsCodeActivity smsCodeActivity) {
        super(0);
        this.f47301OooO0Oo = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SmsCodeActivity smsCodeActivity = this.f47301OooO0Oo;
        smsCodeActivity.OooOo0();
        SmsCodeActivity.OooOoO0(smsCodeActivity);
        return Unit.INSTANCE;
    }
}
