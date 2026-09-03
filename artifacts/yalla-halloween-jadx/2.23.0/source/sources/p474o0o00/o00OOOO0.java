package p474o0o00;

import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f47283OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(PhoneNumberActivity phoneNumberActivity) {
        super(0);
        this.f47283OooO0Oo = phoneNumberActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        PhoneNumberActivity phoneNumberActivity = this.f47283OooO0Oo;
        phoneNumberActivity.OooOo0();
        PhoneNumberActivity.OooOo(phoneNumberActivity);
        return Unit.INSTANCE;
    }
}
