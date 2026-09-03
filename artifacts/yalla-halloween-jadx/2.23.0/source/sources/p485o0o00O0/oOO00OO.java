package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import com.yalla.yalla.ui.view.TopicInfoHeadView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00OO implements Observer<UserInfo> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f48144OooO0Oo;

    public oOO00OO(TopicInfoActivity topicInfoActivity) {
        this.f48144OooO0Oo = topicInfoActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(UserInfo userInfo) {
        UserInfo it = userInfo;
        int i = TopicInfoActivity.f26367OooOoOO;
        TopicInfoHeadView topicInfoHeadViewOooOoO = this.f48144OooO0Oo.OooOoO();
        Intrinsics.checkNotNullExpressionValue(it, "it");
        topicInfoHeadViewOooOoO.OooO0OO(it);
    }
}
