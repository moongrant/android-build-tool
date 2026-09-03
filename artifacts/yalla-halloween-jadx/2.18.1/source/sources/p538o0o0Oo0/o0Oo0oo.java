package p538o0o0Oo0;

import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo extends Lambda implements Function1<List<TopicInfoModel>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f44058Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(AddTopicListActivity addTopicListActivity) {
        super(1);
        this.f44058Oooo0o = addTopicListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<TopicInfoModel> list) {
        List<TopicInfoModel> list2 = list;
        if (list2 != null) {
            int i = 0;
            for (Object obj : list2) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                TopicInfoModel topicInfoModel = (TopicInfoModel) obj;
                if (i == 0) {
                    topicInfoModel.setTitleLocal(true);
                }
                i = i2;
            }
        }
        AddTopicListActivity.OooOooO(this.f44058Oooo0o).setNewData(list2);
        return Unit.INSTANCE;
    }
}
