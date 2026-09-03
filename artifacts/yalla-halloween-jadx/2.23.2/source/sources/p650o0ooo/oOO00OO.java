package p650o0ooo;

import com.yalla.yalla.model.RandomActivityModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.main.MainRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO00OO extends Lambda implements Function1<ApiResult<RandomActivityModel.DataBean>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainRoomVM f58939OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO00OO(MainRoomVM mainRoomVM) {
        super(1);
        this.f58939OooO0Oo = mainRoomVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<RandomActivityModel.DataBean> apiResult) {
        ApiResult<RandomActivityModel.DataBean> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        oOO0O000.OooO0Oo(this.f58939OooO0Oo);
        return Unit.INSTANCE;
    }
}
