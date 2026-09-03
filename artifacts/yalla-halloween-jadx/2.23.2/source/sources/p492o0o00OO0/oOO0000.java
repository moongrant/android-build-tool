package p492o0o00OO0;

import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.moment.TopicManagerActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0000 extends Lambda implements Function1<ApiResult<List<UserInfo>>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ TopicManagerActivity f49468OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0000(TopicManagerActivity topicManagerActivity) {
        super(1);
        this.f49468OooO0Oo = topicManagerActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<List<UserInfo>> apiResult) {
        ApiResult<List<UserInfo>> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = TopicManagerActivity.f25931OooOoO;
        o0000oo<UserInfo> o0000ooVarOooOo = this.f49468OooO0Oo.OooOo();
        Boolean bool = Boolean.TRUE;
        o0000ooVarOooOo.Oooo0(bool, Boolean.valueOf(it.isSuccess()), bool);
        return Unit.INSTANCE;
    }
}
