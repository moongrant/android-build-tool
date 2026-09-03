package p496o0o00o;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0000O extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserDefaultHeadActivity f49059OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0000O(UserDefaultHeadActivity userDefaultHeadActivity) {
        super(1);
        this.f49059OooO0Oo = userDefaultHeadActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = UserDefaultHeadActivity.f27215OooOoO0;
        this.f49059OooO0Oo.OooOoO0().f57607OooO0Oo.OooO0o();
        return Unit.INSTANCE;
    }
}
