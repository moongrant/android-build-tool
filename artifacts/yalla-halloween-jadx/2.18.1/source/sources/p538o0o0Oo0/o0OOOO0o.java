package p538o0o0Oo0;

import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p188o00o00o0.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOOO0o extends Lambda implements Function1<ApiResult<List<UserInfo>>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f44054Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOOO0o(TopicManagerActivity topicManagerActivity) {
        super(1);
        this.f44054Oooo0o = topicManagerActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<List<UserInfo>> apiResult) {
        ApiResult<List<UserInfo>> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        TopicManagerActivity topicManagerActivity = this.f44054Oooo0o;
        TopicManagerActivity.OooO00o oooO00o = TopicManagerActivity.f22638Oooooo;
        OooO0OO<UserInfo> oooO0OOOooOoo = topicManagerActivity.OooOoo();
        Boolean bool = Boolean.TRUE;
        oooO0OOOooOoo.setLoadComplete(bool, Boolean.valueOf(it.isSuccess()), bool);
        return Unit.INSTANCE;
    }
}
