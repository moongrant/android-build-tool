package p485o0o00O0;

import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0 extends Lambda implements Function1<List<UserInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f48145OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f48146OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O0(TopicInfoActivity topicInfoActivity, boolean z) {
        super(1);
        this.f48145OooO0Oo = z;
        this.f48146OooO0o0 = topicInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserInfo> list) {
        List<UserInfo> list2 = list;
        if (list2 != null) {
            boolean z = this.f48145OooO0Oo;
            TopicInfoActivity topicInfoActivity = this.f48146OooO0o0;
            if (z) {
                int i = TopicInfoActivity.f26367OooOoOO;
                topicInfoActivity.OooOoO0().OooOoO0(list2);
            } else {
                int i2 = TopicInfoActivity.f26367OooOoOO;
                topicInfoActivity.OooOoO0().OooO0O0(list2);
            }
        }
        return Unit.INSTANCE;
    }
}
