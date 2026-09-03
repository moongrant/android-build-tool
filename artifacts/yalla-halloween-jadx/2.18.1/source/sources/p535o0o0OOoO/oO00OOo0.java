package p535o0o0OOoO;

import com.android.billingclient.api.o00000O;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00OOo0 extends Lambda implements Function1<ApiError, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oO00OOo0 f43633Oooo0o = new oO00OOo0();

    public oO00OOo0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(ApiError apiError) {
        ApiError it = apiError;
        Intrinsics.checkNotNullParameter(it, "it");
        ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.check_for_updates_notUpdate));
        o00000O.OooO0O0().OooO();
        return Unit.INSTANCE;
    }
}
