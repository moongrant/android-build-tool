package p534o0o0OOo0;

import android.view.View;
import com.yalla.yalla.ui.activity.account.SmsCodeActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOo000 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SmsCodeActivity f43588Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOo000(SmsCodeActivity smsCodeActivity) {
        super(1);
        this.f43588Oooo0o = smsCodeActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        SmsCodeActivity smsCodeActivity = this.f43588Oooo0o;
        if (smsCodeActivity.f21852Oooooo) {
            smsCodeActivity.f21859ooOO = 2;
            smsCodeActivity.Oooo0o0(true);
            this.f43588Oooo0o.Oooo0OO(true);
        } else {
            smsCodeActivity.f21859ooOO = 1;
            smsCodeActivity.Oooo0o0(true);
            this.f43588Oooo0o.Oooo0OO(false);
        }
        return Unit.INSTANCE;
    }
}
