package p566o0oOo00O;

import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO00O extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserDefaultHeadActivity f45273Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(UserDefaultHeadActivity userDefaultHeadActivity) {
        super(1);
        this.f45273Oooo0o = userDefaultHeadActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        UserDefaultHeadActivity userDefaultHeadActivity = this.f45273Oooo0o;
        UserDefaultHeadActivity.OooO00o oooO00o = UserDefaultHeadActivity.f23427Oooooo0;
        userDefaultHeadActivity.OooOooo().f49984OooO0Oo.OooO0o();
        return Unit.INSTANCE;
    }
}
