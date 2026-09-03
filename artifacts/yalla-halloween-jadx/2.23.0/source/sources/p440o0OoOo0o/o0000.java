package p440o0OoOo0o;

import android.app.Activity;
import android.content.Intent;
import com.yalla.yalla.ui.activity.account.AccountProtectionActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Activity f46116OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000(Activity activity) {
        super(0);
        this.f46116OooO0Oo = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        int i = AccountProtectionActivity.f25146OooOo0O;
        Activity activity = this.f46116OooO0Oo;
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivity(new Intent(activity, (Class<?>) AccountProtectionActivity.class));
        return Unit.INSTANCE;
    }
}
