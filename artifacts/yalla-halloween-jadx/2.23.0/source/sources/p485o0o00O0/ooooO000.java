package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ooooO000 implements Observer<String> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f48240OooO0Oo;

    public ooooO000(TopicInfoActivity topicInfoActivity) {
        this.f48240OooO0Oo = topicInfoActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(String str) {
        String it = str;
        int i = TopicInfoActivity.f26367OooOoOO;
        TopicInfoHeadView topicInfoHeadViewOooOoO = this.f48240OooO0Oo.OooOoO();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        topicInfoHeadViewOooOoO.OooO0Oo(it);
    }
}
