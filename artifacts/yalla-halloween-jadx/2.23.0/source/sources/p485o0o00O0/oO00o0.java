package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.OnTopPostForTopicModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.vm.moment.TopicDetailVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oO00o0 implements Observer<OnTopPostForTopicModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicDetailVM f48054OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f48055OooO0o0;

    public oO00o0(TopicDetailVM topicDetailVM, Function0<Unit> function0) {
        this.f48054OooO0Oo = topicDetailVM;
        this.f48055OooO0o0 = function0;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(OnTopPostForTopicModel onTopPostForTopicModel) {
        OnTopPostForTopicModel it = onTopPostForTopicModel;
        Intrinsics.checkNotNullParameter(it, "it");
        TopicInfoModel value = this.f48054OooO0Oo.getTopicDetailLocal().getValue();
        if (value != null && it.getTopicId() == value.getId()) {
            this.f48055OooO0o0.invoke();
        }
    }
}
