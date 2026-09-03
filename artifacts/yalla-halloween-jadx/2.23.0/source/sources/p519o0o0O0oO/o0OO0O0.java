package p519o0o0O0oO;

import com.code.android.uikit.contentstate.ContentState;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFollowingTopUserVM f52721OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ RecommendNewPostModel f52722OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0O0(MomentFollowingTopUserVM momentFollowingTopUserVM, RecommendNewPostModel recommendNewPostModel) {
        super(0);
        this.f52721OooO0Oo = momentFollowingTopUserVM;
        this.f52722OooO0o0 = recommendNewPostModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f52721OooO0Oo.getContentState().setValue(ContentState.Loading);
        MomentFollowingTopUserVM.userMomentList$default(this.f52721OooO0Oo, true, this.f52722OooO0o0.getUserId(), 0, 4, null);
        return Unit.INSTANCE;
    }
}
