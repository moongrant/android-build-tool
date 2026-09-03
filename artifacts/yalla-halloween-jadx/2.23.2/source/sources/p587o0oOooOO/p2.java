package p587o0oOooOO;

import com.yalla.yalla.ui.view.TopicInfoHeadView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class p2 extends Lambda implements Function0<o2> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicInfoHeadView f56933OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(TopicInfoHeadView topicInfoHeadView) {
        super(0);
        this.f56933OooO0Oo = topicInfoHeadView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o2 invoke() {
        TopicInfoHeadView topicInfoHeadView = this.f56933OooO0Oo;
        return new o2(topicInfoHeadView, topicInfoHeadView.getContext(), oo0o0Oo.item_member_list_topic);
    }
}
