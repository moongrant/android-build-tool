package p485o0o00O0;

import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00O extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentMessageListActivity f47835OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(MomentMessageListActivity momentMessageListActivity) {
        super(1);
        this.f47835OooO0Oo = momentMessageListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        int i = MomentMessageListActivity.f26116OooOoOO;
        this.f47835OooO0Oo.OooOo().f59148OooO0O0.OooO0O0();
        return Unit.INSTANCE;
    }
}
