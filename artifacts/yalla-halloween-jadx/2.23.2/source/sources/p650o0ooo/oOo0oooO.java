package p650o0ooo;

import com.yalla.yalla.model.CheckInAddUpWeekModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0oooO extends Lambda implements Function1<ApiResult<CheckInAddUpWeekModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oO0O00oO f59040OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0oooO(oO0O00oO oo0o00oo) {
        super(1);
        this.f59040OooO0Oo = oo0o00oo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<CheckInAddUpWeekModel> apiResult) {
        ApiResult<CheckInAddUpWeekModel> apiResult2 = apiResult;
        boolean zIsSuccess = apiResult2.isSuccess();
        oO0O00oO oo0o00oo = this.f59040OooO0Oo;
        if (!zIsSuccess || apiResult2.getData() == null) {
            oo0o00oo.OooOOOo();
        } else {
            CheckInAddUpWeekModel data = apiResult2.getData();
            oo0o00oo.f58869OooOo0 = data != null ? data.getRewardMultiple() : 0;
            CheckInAddUpWeekModel data2 = apiResult2.getData();
            oO0O00oO.OooOO0O(oo0o00oo, data2 != null ? data2.getNum() : 0);
        }
        return Unit.INSTANCE;
    }
}
