package p601o0oo00Oo;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.ui.view.MomentDetailPollView;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0oOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailPollView f48270Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f48271Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0oOO0(MomentDetailPollView momentDetailPollView, int i) {
        super(0);
        this.f48270Oooo0o = momentDetailPollView;
        this.f48271Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MomentVM momentVM;
        MomentDetailPollView momentDetailPollView = this.f48270Oooo0o;
        MomentPoll momentPoll = momentDetailPollView.f24896OoooO;
        if (momentPoll == null) {
            return null;
        }
        int i = this.f48271Oooo0oO;
        if (momentDetailPollView.f24907o000oOoO) {
            Function1<Boolean, Unit> toMomentDetailListener = momentDetailPollView.getToMomentDetailListener();
            if (toMomentDetailListener == null) {
                return null;
            }
            toMomentDetailListener.invoke(Boolean.valueOf(momentPoll.getIsExpire()));
            return null;
        }
        if (momentPoll.getIsExpire()) {
            Function1<Boolean, Unit> toMomentDetailListener2 = momentDetailPollView.getToMomentDetailListener();
            if (toMomentDetailListener2 == null) {
                return null;
            }
            toMomentDetailListener2.invoke(Boolean.valueOf(momentPoll.getIsExpire()));
            return null;
        }
        o0O00000.OooO0OO("Moemnts_vote");
        long voteOptionId = momentPoll.getVoteOptionId();
        long id = momentPoll.getId();
        MomentPoll.Option option = momentPoll.getOptions().get(i);
        FragmentActivity fragmentActivity = momentDetailPollView.f24899OoooO0O;
        if (fragmentActivity == null || (momentVM = momentDetailPollView.f24900OoooOO0) == null) {
            return null;
        }
        if (voteOptionId == 0) {
            LiveData<ApiResult<MomentPoll>> liveDataMomentPoll = momentVM.momentPoll(id, option.getId());
            if (liveDataMomentPoll == null) {
                return null;
            }
            FragmentActivity fragmentActivity2 = momentDetailPollView.f24899OoooO0O;
            Intrinsics.checkNotNull(fragmentActivity2);
            liveDataMomentPoll.observe(fragmentActivity2, new OooOo(new o00OO000(momentDetailPollView), null, null, false, 14));
            return null;
        }
        Intrinsics.checkNotNull(fragmentActivity);
        p255o00ooO0o.oo0oOO0 oo0ooo0 = new p255o00ooO0o.oo0oOO0(fragmentActivity);
        oo0ooo0.OooOoo(R.string.moment_poll_cancel_Title);
        oo0ooo0.OooOOOo(R.string.moment_poll_cancel_Retract);
        oo0ooo0.OooOo0o(new o00OO00O(momentDetailPollView, id, voteOptionId, fragmentActivity));
        oo0ooo0.OooOoOO(true);
        oo0ooo0.OooOOO0();
        return null;
    }
}
