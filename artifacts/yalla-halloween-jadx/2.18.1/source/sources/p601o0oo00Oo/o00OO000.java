package p601o0oo00Oo;

import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.ui.view.MomentDetailPollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO000 extends Lambda implements Function1<MomentPoll, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailPollView f48145Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(MomentDetailPollView momentDetailPollView) {
        super(1);
        this.f48145Oooo0o = momentDetailPollView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentPoll momentPoll) {
        MomentPoll momentPoll2 = momentPoll;
        if (momentPoll2 != null) {
            MomentDetailPollView momentDetailPollView = this.f48145Oooo0o;
            momentDetailPollView.OooO00o(momentDetailPollView.f24899OoooO0O, momentDetailPollView.f24901OoooOOO, momentPoll2, momentDetailPollView.f24907o000oOoO);
            Function1<MomentPoll, Unit> changeMomentPollListener = momentDetailPollView.getChangeMomentPollListener();
            if (changeMomentPollListener != null) {
                changeMomentPollListener.invoke(momentPoll2);
            }
        }
        return Unit.INSTANCE;
    }
}
