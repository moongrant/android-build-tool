package p474o0o00;

import android.view.View;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oO0Ooo extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f47341OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0Ooo(SmsCodeActivity smsCodeActivity) {
        super(1);
        this.f47341OooO0Oo = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        SmsCodeActivity smsCodeActivity = this.f47341OooO0Oo;
        if (smsCodeActivity.f25305OooOoO) {
            smsCodeActivity.f25310OooOooO = 1;
            smsCodeActivity.Oooo00O(true);
            smsCodeActivity.Oooo000(false);
        } else {
            smsCodeActivity.f25310OooOooO = 2;
            smsCodeActivity.Oooo00O(true);
            smsCodeActivity.Oooo000(true);
        }
        return Unit.INSTANCE;
    }
}
