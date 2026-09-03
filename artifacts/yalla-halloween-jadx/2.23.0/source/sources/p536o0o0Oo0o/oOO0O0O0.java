package p536o0o0Oo0o;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.OnTopPostForUserPostModel;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0O0 implements Observer<OnTopPostForUserPostModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f55199OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55200OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f55201OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ LazyListState f55202OooO0oO;

    public oOO0O0O0(CoroutineScope coroutineScope, String str, MomentUserListVM momentUserListVM, LazyListState lazyListState) {
        this.f55199OooO0Oo = coroutineScope;
        this.f55201OooO0o0 = str;
        this.f55200OooO0o = momentUserListVM;
        this.f55202OooO0oO = lazyListState;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(OnTopPostForUserPostModel onTopPostForUserPostModel) {
        OnTopPostForUserPostModel onTopPostForUserPostModel2 = onTopPostForUserPostModel;
        Intrinsics.checkNotNullParameter(onTopPostForUserPostModel2, "<name for destructuring parameter 0>");
        String userId = onTopPostForUserPostModel2.getUserId();
        long postId = onTopPostForUserPostModel2.getPostId();
        BuildersKt__Builders_commonKt.launch$default(this.f55199OooO0Oo, null, null, new oOO0O00O(this.f55202OooO0oO, null), 3, null);
        if (Intrinsics.areEqual(userId, this.f55201OooO0o0)) {
            MomentUserListVM momentUserListVM = this.f55200OooO0o;
            momentUserListVM.setTopicDetailTopPostId(postId, true, new oOO0O0(momentUserListVM, postId, null));
        }
    }
}
