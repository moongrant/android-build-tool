package p536o0o0Oo0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.OnTopPostForUserPostModel;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0O implements Observer<OnTopPostForUserPostModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f55197OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55198OooO0o0;

    public oOO0O0O(String str, MomentUserListVM momentUserListVM) {
        this.f55197OooO0Oo = str;
        this.f55198OooO0o0 = momentUserListVM;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(OnTopPostForUserPostModel onTopPostForUserPostModel) {
        OnTopPostForUserPostModel onTopPostForUserPostModel2 = onTopPostForUserPostModel;
        Intrinsics.checkNotNullParameter(onTopPostForUserPostModel2, "<name for destructuring parameter 0>");
        String userId = onTopPostForUserPostModel2.getUserId();
        long postId = onTopPostForUserPostModel2.getPostId();
        if (Intrinsics.areEqual(userId, this.f55197OooO0Oo)) {
            MomentUserListVM.setTopicDetailTopPostId$default(this.f55198OooO0o0, postId, true, null, 4, null);
        }
        this.f55198OooO0o0.setTopPostDetailId(null);
    }
}
