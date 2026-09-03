package p617o0oo0o;

import android.content.Intent;
import com.yalla.yalla.ui.activity.account.AccountBindActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MainActivity f48473Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(MainActivity mainActivity) {
        super(0);
        this.f48473Oooo0o = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AccountBindActivity.OooO00o oooO00o = AccountBindActivity.f21702OooooOO;
        MainActivity activity = this.f48473Oooo0o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        activity.startActivity(new Intent(activity, (Class<?>) AccountBindActivity.class));
        return Unit.INSTANCE;
    }
}
