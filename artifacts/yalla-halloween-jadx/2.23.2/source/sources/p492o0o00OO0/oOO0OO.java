package p492o0o00OO0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.TopicSearchActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicSearchActivity f49485OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49486OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OO(TopicSearchActivity topicSearchActivity, int i) {
        super(0);
        this.f49485OooO0Oo = topicSearchActivity;
        this.f49486OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("103034");
        int i = TopicSearchActivity.f25947OooOoo0;
        final TopicSearchActivity topicSearchActivity = this.f49485OooO0Oo;
        List<TopicInfoModel> list = topicSearchActivity.OooOoO().f13189OooOOoo;
        final int i2 = this.f49486OooO0o0;
        final TopicInfoModel topicInfoModel = list.get(i2);
        topicSearchActivity.OooOoo().joinTopic(topicInfoModel.getId()).observe(topicSearchActivity, new Observer() { // from class: o0o00OO0.ooooO000
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i3 = TopicSearchActivity.f25947OooOoo0;
                TopicSearchActivity this$0 = topicSearchActivity;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (((Response) obj).getIsSuccess()) {
                    topicInfoModel.setJoin(1);
                    this$0.OooOoO().notifyItemChanged(this$0.OooOoO().OooOOO0() + i2);
                }
            }
        });
        return Unit.INSTANCE;
    }
}
