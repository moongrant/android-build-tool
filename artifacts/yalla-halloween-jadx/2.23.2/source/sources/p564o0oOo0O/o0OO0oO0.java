package p564o0oOo0O;

import com.code.android.util.o000O;
import com.yalla.yalla.ui.view.moment.SendMomentPollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0oO0 extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SendMomentPollView f56370OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0oO0(SendMomentPollView sendMomentPollView) {
        super(0);
        this.f56370OooO0Oo = sendMomentPollView;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        SendMomentPollView sendMomentPollView = this.f56370OooO0Oo;
        sendMomentPollView.setSendMomentPoll(null);
        o000O.OooO0O0(sendMomentPollView);
        Function1<Boolean, Unit> closeListener = sendMomentPollView.getCloseListener();
        if (closeListener != null) {
            closeListener.invoke(Boolean.TRUE);
        }
        Function0<Unit> changeListener = sendMomentPollView.getChangeListener();
        if (changeListener == null) {
            return null;
        }
        changeListener.invoke();
        return Unit.INSTANCE;
    }
}
