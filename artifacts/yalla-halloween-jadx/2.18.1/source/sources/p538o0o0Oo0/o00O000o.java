package p538o0o0Oo0;

import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O000o extends Lambda implements Function1<MomentPoll, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailActivity f43947Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(PostDetailActivity postDetailActivity) {
        super(1);
        this.f43947Oooo0o = postDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MomentPoll momentPoll) {
        MomentPoll poll = momentPoll;
        Intrinsics.checkNotNullParameter(poll, "poll");
        MomentDetailModel momentDetailModel = this.f43947Oooo0o.f22420Ooooo0o;
        if (momentDetailModel != null) {
            momentDetailModel.setMomentPoll(poll.toJSONString());
        }
        this.f43947Oooo0o.OooOooO().f50589OooOOOO.OooOOo0(this.f43947Oooo0o.f22420Ooooo0o, 0);
        return Unit.INSTANCE;
    }
}
