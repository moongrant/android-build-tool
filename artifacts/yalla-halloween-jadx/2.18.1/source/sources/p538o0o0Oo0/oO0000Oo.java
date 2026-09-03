package p538o0o0Oo0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0000Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f44085Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f44086Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000Oo(TopicSearchActivity topicSearchActivity, int i) {
        super(0);
        this.f44085Oooo0o = topicSearchActivity;
        this.f44086Oooo0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O00000.OooO0OO("Moments_topics_follow");
        final TopicSearchActivity topicSearchActivity = this.f44085Oooo0o;
        final int i = this.f44086Oooo0oO;
        TopicSearchActivity.OooO00o oooO00o = TopicSearchActivity.f22654OooooOo;
        final TopicInfoModel topicInfoModel = topicSearchActivity.OooOoo().getData().get(i);
        topicSearchActivity.Oooo000().joinTopic(topicInfoModel.getId()).observe(topicSearchActivity, new Observer() { // from class: o0o0Oo0.oO00000
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                TopicInfoModel topicInfoModel2 = topicInfoModel;
                TopicSearchActivity this$0 = topicSearchActivity;
                int i2 = i;
                TopicSearchActivity.OooO00o oooO00o2 = TopicSearchActivity.f22654OooooOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((Response) obj).getIsSuccess()) {
                    topicInfoModel2.setJoin(1);
                    this$0.OooOoo().notifyItemChanged(this$0.OooOoo().getHeaderLayoutCount() + i2);
                }
            }
        });
        return Unit.INSTANCE;
    }
}
