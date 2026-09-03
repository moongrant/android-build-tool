package p536o0o0OOoo;

import androidx.lifecycle.LiveData;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import o0o0000.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class n2 extends Lambda implements Function2<Long, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f43828Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(2);
        this.f43828Oooo0o = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Long l, Integer num) {
        long jLongValue = l.longValue();
        int iIntValue = num.intValue();
        BaseActivityK.OooOoo0(this.f43828Oooo0o, null, 0L, 3, null);
        YallaTeamMessageActivity yallaTeamMessageActivity = this.f43828Oooo0o;
        YallaTeamMessageActivity.OooO00o oooO00o = YallaTeamMessageActivity.f22251OoooooO;
        LiveData<ApiResult<String>> liveDataSubmitCustomerSatisfaction = yallaTeamMessageActivity.OooOooo().submitCustomerSatisfaction(jLongValue, iIntValue);
        YallaTeamMessageActivity yallaTeamMessageActivity2 = this.f43828Oooo0o;
        liveDataSubmitCustomerSatisfaction.observe(yallaTeamMessageActivity2, new OooOo(null, null, new m2(yallaTeamMessageActivity2), false, 11));
        return Unit.INSTANCE;
    }
}
