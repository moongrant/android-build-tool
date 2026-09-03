package p563o0oOo0;

import androidx.appcompat.app.AppCompatActivity;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.ReportCommentDetailModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000O0 extends Lambda implements Function1<ApiResult<ReportCommentDetailModel>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0000O00 f45001Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(o0000O00 o0000o00) {
        super(1);
        this.f45001Oooo0o = o0000o00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<ReportCommentDetailModel> apiResult) {
        ApiResult<ReportCommentDetailModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        AppCompatActivity appCompatActivity = this.f45001Oooo0o.f45002OooO00o;
        BaseActivityK baseActivityK = appCompatActivity instanceof BaseActivityK ? (BaseActivityK) appCompatActivity : null;
        if (baseActivityK != null) {
            baseActivityK.OooOoO();
        }
        return Unit.INSTANCE;
    }
}
