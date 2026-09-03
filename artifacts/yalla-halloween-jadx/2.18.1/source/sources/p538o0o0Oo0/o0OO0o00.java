package p538o0o0Oo0;

import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0o00 extends Lambda implements Function1<ApiResult<List<UserInfo>>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f44037Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f44038Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o00(TopicInfoActivity topicInfoActivity, boolean z) {
        super(1);
        this.f44037Oooo0o = topicInfoActivity;
        this.f44038Oooo0oO = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<List<UserInfo>> apiResult) {
        ApiResult<List<UserInfo>> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        TopicInfoActivity topicInfoActivity = this.f44037Oooo0o;
        TopicInfoActivity.OooO00o oooO00o = TopicInfoActivity.f22623OoooooO;
        List<UserInfo> data = topicInfoActivity.OooOooo().getData();
        TopicInfoActivity topicInfoActivity2 = this.f44037Oooo0o;
        topicInfoActivity2.OooOooo().setLoadEndHint(o000O0O0.OooO0OO(R.string.No_more_data));
        if (data.size() >= 200) {
            topicInfoActivity2.OooOooo().setLoadEndHint(o000O0O0.OooO0OO(R.string.topic_info_Display_up_to_200_users));
        }
        TopicInfoActivity topicInfoActivity3 = this.f44037Oooo0o;
        List<UserInfo> data2 = it.getData();
        topicInfoActivity3.f22629OooooOo = (data2 != null && data2.isEmpty()) || this.f44037Oooo0o.OooOooo().getData().size() >= 200;
        this.f44037Oooo0o.OooOooo().setLoadComplete(Boolean.valueOf(this.f44038Oooo0oO), Boolean.valueOf(it.isSuccess()), Boolean.valueOf(this.f44037Oooo0o.f22629OooooOo));
        return Unit.INSTANCE;
    }
}
