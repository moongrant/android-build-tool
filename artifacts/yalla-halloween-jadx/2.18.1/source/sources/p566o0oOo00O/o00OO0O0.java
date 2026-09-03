package p566o0oOo00O;

import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.UserDefaultHeadListModel;
import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO0O0 extends Lambda implements Function1<ApiResult<List<UserDefaultHeadListModel>>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ UserDefaultHeadActivity f45274Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(UserDefaultHeadActivity userDefaultHeadActivity) {
        super(1);
        this.f45274Oooo0o = userDefaultHeadActivity;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<o0oOo0.o00O000o>] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiResult<List<UserDefaultHeadListModel>> apiResult) {
        ApiResult<List<UserDefaultHeadListModel>> it = apiResult;
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.f45274Oooo0o.f23432OooooOO.isEmpty()) {
            this.f45274Oooo0o.OooOooo().f49984OooO0Oo.OooO0o0();
        } else {
            this.f45274Oooo0o.OooOooo().f49984OooO0Oo.OooO0Oo();
        }
        return Unit.INSTANCE;
    }
}
