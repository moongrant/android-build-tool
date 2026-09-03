package p534o0o0OOo0;

import android.view.View;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.account.DeleteAccountCheckActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oOOo extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ DeleteAccountCheckActivity f43599Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOOo(DeleteAccountCheckActivity deleteAccountCheckActivity) {
        super(1);
        this.f43599Oooo0o = deleteAccountCheckActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        LiveEventBus.get("FINISH_DELETE_ACCOUNT_REASON_ACTIVITY").post(null);
        this.f43599Oooo0o.finish();
        return Unit.INSTANCE;
    }
}
