package p601o0oo00Oo;

import com.yalla.yalla.ui.view.SendMomentPollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0000O extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ SendMomentPollView f48247Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000O(SendMomentPollView sendMomentPollView) {
        super(0);
        this.f48247Oooo0o = sendMomentPollView;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        this.f48247Oooo0o.setSendMomentPoll(null);
        oOO00O.OooO00o(this.f48247Oooo0o);
        Function1<Boolean, Unit> closeListener = this.f48247Oooo0o.getCloseListener();
        if (closeListener != null) {
            closeListener.invoke(Boolean.TRUE);
        }
        Function0<Unit> changeListener = this.f48247Oooo0o.getChangeListener();
        if (changeListener == null) {
            return null;
        }
        changeListener.invoke();
        return Unit.INSTANCE;
    }
}
