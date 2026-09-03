package p601o0oo00Oo;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.ui.view.MomentDetailPollView;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO00O extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f48146Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ MomentDetailPollView f48147Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f48148Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f48149Oooo0oo;

    public static final class OooO00o extends Lambda implements Function1<MomentPoll, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailPollView f48150Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f48151Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentDetailPollView momentDetailPollView, FragmentActivity fragmentActivity) {
            super(1);
            this.f48150Oooo0o = momentDetailPollView;
            this.f48151Oooo0oO = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MomentPoll momentPoll) {
            MomentPoll momentPoll2 = momentPoll;
            if (momentPoll2 != null) {
                MomentDetailPollView momentDetailPollView = this.f48150Oooo0o;
                momentDetailPollView.OooO00o(this.f48151Oooo0oO, momentDetailPollView.f24901OoooOOO, momentPoll2, momentDetailPollView.f24907o000oOoO);
                Function1<MomentPoll, Unit> changeMomentPollListener = momentDetailPollView.getChangeMomentPollListener();
                if (changeMomentPollListener != null) {
                    changeMomentPollListener.invoke(momentPoll2);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(MomentDetailPollView momentDetailPollView, long j, long j2, FragmentActivity fragmentActivity) {
        super(0);
        this.f48147Oooo0o = momentDetailPollView;
        this.f48148Oooo0oO = j;
        this.f48149Oooo0oo = j2;
        this.f48146Oooo = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        LiveData<ApiResult<MomentPoll>> liveDataMomentPollCancel;
        MomentVM momentVM = this.f48147Oooo0o.f24900OoooOO0;
        if (momentVM == null || (liveDataMomentPollCancel = momentVM.momentPollCancel(this.f48148Oooo0oO, this.f48149Oooo0oo)) == null) {
            return null;
        }
        FragmentActivity fragmentActivity = this.f48146Oooo;
        liveDataMomentPollCancel.observe(fragmentActivity, new OooOo(new OooO00o(this.f48147Oooo0o, fragmentActivity), null, null, false, 14));
        return Unit.INSTANCE;
    }
}
