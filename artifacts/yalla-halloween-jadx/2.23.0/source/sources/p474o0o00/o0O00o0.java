package p474o0o00;

import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f47305OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00o0(PhoneNumberActivity phoneNumberActivity) {
        super(1);
        this.f47305OooO0Oo = phoneNumberActivity;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean z;
        Boolean it = bool;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        boolean zBooleanValue = it.booleanValue();
        PhoneNumberActivity phoneNumberActivity = this.f47305OooO0Oo;
        if (zBooleanValue) {
            int i = PhoneNumberActivity.f25262OooOoO;
            if (phoneNumberActivity.OooOoO0().OooO0o()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        new o0oOO(phoneNumberActivity, z).show();
        return Unit.INSTANCE;
    }
}
