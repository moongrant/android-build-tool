package p650o0ooo;

import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFollowingTopUserVM f58616OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RecommendNewPostModel f58617OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000Oo(MomentFollowingTopUserVM momentFollowingTopUserVM, RecommendNewPostModel recommendNewPostModel) {
        super(0);
        this.f58616OooO0Oo = momentFollowingTopUserVM;
        this.f58617OooO0o0 = recommendNewPostModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f58616OooO0Oo.getContentState().setValue(ContentState.Loading);
        MomentFollowingTopUserVM.userMomentList$default(this.f58616OooO0Oo, true, this.f58617OooO0o0.getUserId(), 0, 4, null);
        return Unit.INSTANCE;
    }
}
