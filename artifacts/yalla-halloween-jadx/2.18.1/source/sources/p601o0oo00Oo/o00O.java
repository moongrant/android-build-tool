package p601o0oo00Oo;

import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.ui.view.MomentDetailPollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailPollView f48068Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(MomentDetailPollView momentDetailPollView) {
        super(0);
        this.f48068Oooo0o = momentDetailPollView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Function1<Boolean, Unit> toMomentDetailListener;
        MomentDetailPollView momentDetailPollView = this.f48068Oooo0o;
        MomentPoll momentPoll = momentDetailPollView.f24896OoooO;
        if (momentPoll == null || (toMomentDetailListener = momentDetailPollView.getToMomentDetailListener()) == null) {
            return null;
        }
        toMomentDetailListener.invoke(Boolean.valueOf(momentPoll.getIsExpire()));
        return null;
    }
}
