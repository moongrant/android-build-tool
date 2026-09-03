package p492o0o00OO0;

import com.code.android.util.o0000;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p559o0oOo.o00Oo0;
import p562o0oOo000.o000000;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOO00O extends Lambda implements Function1<ApiResult<List<UserInfo>>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f49550OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f49551OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOO00O(TopicInfoActivity topicInfoActivity, boolean z) {
        super(1);
        this.f49550OooO0Oo = topicInfoActivity;
        this.f49551OooO0o0 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<List<UserInfo>> apiResult) {
        ApiResult<List<UserInfo>> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = TopicInfoActivity.f25916OooOoOO;
        TopicInfoActivity topicInfoActivity = this.f49550OooO0Oo;
        List<UserInfo> list = topicInfoActivity.OooOoO0().f13189OooOOoo;
        o0000oo<UserInfo> o0000ooVarOooOoO0 = topicInfoActivity.OooOoO0();
        String loadEndHint = o0000.OooO0OO(o000000.No_more_data);
        o00Oo0 o00oo1 = o0000ooVarOooOoO0.f56426OooOoOO;
        if (o00oo1 != null) {
            Intrinsics.checkNotNullParameter(loadEndHint, "loadEndHint");
            o00oo1.f56231OooO0Oo = loadEndHint;
        }
        if (list.size() >= 200) {
            o0000oo<UserInfo> o0000ooVarOooOoO1 = topicInfoActivity.OooOoO0();
            String loadEndHint2 = o0000.OooO0OO(o000000.topic_info_Display_up_to_200_users);
            o00Oo0 o00oo2 = o0000ooVarOooOoO1.f56426OooOoOO;
            if (o00oo2 != null) {
                Intrinsics.checkNotNullParameter(loadEndHint2, "loadEndHint");
                o00oo2.f56231OooO0Oo = loadEndHint2;
            }
        }
        List<UserInfo> data = it.getData();
        boolean z = true;
        if (!(data != null && data.isEmpty()) && topicInfoActivity.OooOoO0().f13189OooOOoo.size() < 200) {
            z = false;
        }
        topicInfoActivity.f25918OooOo = z;
        topicInfoActivity.OooOoO0().Oooo0(Boolean.valueOf(this.f49551OooO0o0), Boolean.valueOf(it.isSuccess()), Boolean.valueOf(topicInfoActivity.f25918OooOo));
        return Unit.INSTANCE;
    }
}
