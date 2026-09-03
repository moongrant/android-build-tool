package p544o0o0OoOO;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.VoteDetailModel;
import com.yalla.yalla.model.VoteRankModel;
import com.yalla.yalla.ui.activity.room.VoteHistoryDetailActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p188o00o00o0.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class v7 extends Lambda implements Function1<ApiResult<VoteDetailModel>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ VoteHistoryDetailActivity f44332Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(VoteHistoryDetailActivity voteHistoryDetailActivity) {
        super(1);
        this.f44332Oooo0o = voteHistoryDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<VoteDetailModel> apiResult) {
        ApiResult<VoteDetailModel> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        OooO0OO<VoteRankModel> oooO0OO = this.f44332Oooo0o.f23106OooooOo;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setLoadComplete();
        return Unit.INSTANCE;
    }
}
