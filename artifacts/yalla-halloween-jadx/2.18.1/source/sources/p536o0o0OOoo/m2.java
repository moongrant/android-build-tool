package p536o0o0OOoo;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class m2 extends Lambda implements Function1<ApiResult<String>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f43820Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(1);
        this.f43820Oooo0o = yallaTeamMessageActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<String> apiResult) {
        ApiResult<String> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f43820Oooo0o.OooOoO();
        return Unit.INSTANCE;
    }
}
