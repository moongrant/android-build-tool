package p496o0o00o;

import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserDefaultHeadListModel;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000 extends Lambda implements Function1<ApiResult<List<UserDefaultHeadListModel>>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserDefaultHeadActivity f49057OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000(UserDefaultHeadActivity userDefaultHeadActivity) {
        super(1);
        this.f49057OooO0Oo = userDefaultHeadActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<List<UserDefaultHeadListModel>> apiResult) {
        ApiResult<List<UserDefaultHeadListModel>> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        UserDefaultHeadActivity userDefaultHeadActivity = this.f49057OooO0Oo;
        if (userDefaultHeadActivity.f27221OooOo0o.isEmpty()) {
            userDefaultHeadActivity.OooOoO0().f57607OooO0Oo.OooO0o0();
        } else {
            userDefaultHeadActivity.OooOoO0().f57607OooO0Oo.OooO0Oo();
        }
        return Unit.INSTANCE;
    }
}
