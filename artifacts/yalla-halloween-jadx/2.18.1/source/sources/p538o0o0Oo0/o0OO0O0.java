package p538o0o0Oo0;

import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0O0 extends Lambda implements Function1<ApiResult<List<UserInfo>>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f44034Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0O0(TopicInfoActivity topicInfoActivity) {
        super(1);
        this.f44034Oooo0o = topicInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<List<UserInfo>> apiResult) {
        ApiResult<List<UserInfo>> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        TopicInfoActivity topicInfoActivity = this.f44034Oooo0o;
        TopicInfoActivity.OooO00o oooO00o = TopicInfoActivity.f22623OoooooO;
        topicInfoActivity.Oooo000().setManagerList(this.f44034Oooo0o.f22628OooooOO);
        TopicInfoActivity.OooOoo(this.f44034Oooo0o, true);
        return Unit.INSTANCE;
    }
}
