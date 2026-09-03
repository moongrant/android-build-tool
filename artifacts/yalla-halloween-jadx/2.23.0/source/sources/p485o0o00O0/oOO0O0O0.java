package p485o0o00O0;

import com.code.android.util.o0000;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.moment.TopicInfoActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p562o0oOo0O.o0OoOo0;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O0O0 extends Lambda implements Function1<ApiResult<List<UserInfo>>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicInfoActivity f48152OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f48153OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O0O0(TopicInfoActivity topicInfoActivity, boolean z) {
        super(1);
        this.f48152OooO0Oo = topicInfoActivity;
        this.f48153OooO0o0 = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<List<UserInfo>> apiResult) {
        ApiResult<List<UserInfo>> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = TopicInfoActivity.f26367OooOoOO;
        TopicInfoActivity topicInfoActivity = this.f48152OooO0Oo;
        List<UserInfo> list = topicInfoActivity.OooOoO0().f10111OooOOoo;
        o000O<UserInfo> o000oOooOoO0 = topicInfoActivity.OooOoO0();
        String loadEndHint = o0000.OooO0OO(oO00OOo0.No_more_data);
        o0OoOo0 o0oooo0 = o000oOooOoO0.f56199OooOoOO;
        if (o0oooo0 != null) {
            Intrinsics.checkNotNullParameter(loadEndHint, "loadEndHint");
            o0oooo0.f56194OooO0Oo = loadEndHint;
        }
        if (list.size() >= 200) {
            o000O<UserInfo> o000oOooOoO1 = topicInfoActivity.OooOoO0();
            String loadEndHint2 = o0000.OooO0OO(oO00OOo0.topic_info_Display_up_to_200_users);
            o0OoOo0 o0oooo1 = o000oOooOoO1.f56199OooOoOO;
            if (o0oooo1 != null) {
                Intrinsics.checkNotNullParameter(loadEndHint2, "loadEndHint");
                o0oooo1.f56194OooO0Oo = loadEndHint2;
            }
        }
        List<UserInfo> data = it.getData();
        boolean z = true;
        if (!(data != null && data.isEmpty()) && topicInfoActivity.OooOoO0().f10111OooOOoo.size() < 200) {
            z = false;
        }
        topicInfoActivity.f26369OooOo = z;
        topicInfoActivity.OooOoO0().Oooo0(Boolean.valueOf(this.f48153OooO0o0), Boolean.valueOf(it.isSuccess()), Boolean.valueOf(topicInfoActivity.f26369OooOo));
        return Unit.INSTANCE;
    }
}
