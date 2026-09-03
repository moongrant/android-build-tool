package p491o0o00O0o;

import com.yalla.yalla.ui.activity.account.OooOO0O;
import com.yalla.yalla.ui.activity.account.PhoneNumberActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00O0o extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ PhoneNumberActivity f49010OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00O0o(PhoneNumberActivity phoneNumberActivity) {
        super(1);
        this.f49010OooO0Oo = phoneNumberActivity;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean z;
        Boolean bool2 = bool;
        Intrinsics.checkNotNull(bool2);
        boolean zBooleanValue = bool2.booleanValue();
        PhoneNumberActivity phoneNumberActivity = this.f49010OooO0Oo;
        if (zBooleanValue) {
            int i = PhoneNumberActivity.f24807OooOoO;
            if (phoneNumberActivity.OooOoO0().OooO0o()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        new OooOO0O(phoneNumberActivity, z).show();
        return Unit.INSTANCE;
    }
}
