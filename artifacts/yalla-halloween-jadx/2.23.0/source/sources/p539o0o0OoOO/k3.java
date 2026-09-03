package p539o0o0OoOO;

import com.yalla.yalla.ui.view.TopicInfoHeadView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes5.dex */
public final class k3 extends Lambda implements Function0<j3> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicInfoHeadView f55583OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(TopicInfoHeadView topicInfoHeadView) {
        super(0);
        this.f55583OooO0Oo = topicInfoHeadView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final j3 invoke() {
        TopicInfoHeadView topicInfoHeadView = this.f55583OooO0Oo;
        return new j3(topicInfoHeadView, topicInfoHeadView.getContext(), oO00OO0O.item_member_list_topic);
    }
}
