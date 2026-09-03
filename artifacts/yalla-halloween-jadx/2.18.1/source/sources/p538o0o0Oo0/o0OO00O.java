package p538o0o0Oo0;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.ui.activity.moment.AddTopicListActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O extends Lambda implements Function1<ApiResult<List<TopicInfoModel>>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AddTopicListActivity f44031Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(AddTopicListActivity addTopicListActivity) {
        super(1);
        this.f44031Oooo0o = addTopicListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<List<TopicInfoModel>> apiResult) {
        ApiResult<List<TopicInfoModel>> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        if (AddTopicListActivity.OooOooO(this.f44031Oooo0o).getItemCount() < 1) {
            AddTopicListActivity.OooOoo(this.f44031Oooo0o).f22283OooO0oO = true;
            AddTopicListActivity.OooOoo(this.f44031Oooo0o).OooO0OO(true);
        }
        this.f44031Oooo0o.Oooo00O().f50022OooO0OO.OooO0Oo();
        return Unit.INSTANCE;
    }
}
