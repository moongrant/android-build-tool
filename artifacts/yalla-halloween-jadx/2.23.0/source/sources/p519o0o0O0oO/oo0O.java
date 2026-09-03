package p519o0o0O0oO;

import com.yalla.yalla.model.CheckInAddUpWeekModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0O extends Lambda implements Function1<ApiResult<CheckInAddUpWeekModel>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0OOO f53022OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(o00O0OOO o00o0ooo2) {
        super(1);
        this.f53022OooO0Oo = o00o0ooo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<CheckInAddUpWeekModel> apiResult) {
        ApiResult<CheckInAddUpWeekModel> apiResult2 = apiResult;
        boolean zIsSuccess = apiResult2.isSuccess();
        o00O0OOO o00o0ooo2 = this.f53022OooO0Oo;
        if (!zIsSuccess || apiResult2.getData() == null) {
            o00o0ooo2.OooOOOo();
        } else {
            CheckInAddUpWeekModel data = apiResult2.getData();
            o00o0ooo2.f52575OooOo0 = data != null ? data.getRewardMultiple() : 0;
            CheckInAddUpWeekModel data2 = apiResult2.getData();
            o00O0OOO.OooOO0O(o00o0ooo2, data2 != null ? data2.getNum() : 0);
        }
        return Unit.INSTANCE;
    }
}
