package p474o0o00;

import android.view.View;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.account.DeleteAccountSubmitActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountSubmitActivity f47229OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(DeleteAccountSubmitActivity deleteAccountSubmitActivity) {
        super(1);
        this.f47229OooO0Oo = deleteAccountSubmitActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        LiveEventBus.get("FINISH_DELETE_ACCOUNT_REASON_ACTIVITY").post(null);
        this.f47229OooO0Oo.finish();
        return Unit.INSTANCE;
    }
}
