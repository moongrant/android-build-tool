package p538o0o0Oo0;

import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOooO0 extends Lambda implements Function1<List<UserInfo>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f44056Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f44057Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOooO0(boolean z, TopicInfoActivity topicInfoActivity) {
        super(1);
        this.f44056Oooo0o = z;
        this.f44057Oooo0oO = topicInfoActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<UserInfo> list) {
        List<UserInfo> list2 = list;
        if (list2 != null) {
            boolean z = this.f44056Oooo0o;
            TopicInfoActivity topicInfoActivity = this.f44057Oooo0oO;
            if (z) {
                TopicInfoActivity.OooO00o oooO00o = TopicInfoActivity.f22623OoooooO;
                topicInfoActivity.OooOooo().setNewData(list2);
            } else {
                TopicInfoActivity.OooO00o oooO00o2 = TopicInfoActivity.f22623OoooooO;
                topicInfoActivity.OooOooo().addData(list2);
            }
        }
        return Unit.INSTANCE;
    }
}
