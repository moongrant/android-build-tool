package p521o0o0O0OO;

import com.code.android.util.ToastUtil;
import com.yalla.yalla.common.model.ApiError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0O extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oo0O f42959Oooo0o = new oo0O();

    public oo0O() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        ToastUtil.f12567OooO00o.OooO0O0(it.toString());
        return Unit.INSTANCE;
    }
}
