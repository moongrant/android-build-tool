package OooO00o.OooO00o.OooO00o.OooO00o.p000OooOOOo;

import OooOO0O.OooOO0;
import com.yallatech.support.platform.login.bean.AuthResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOO0 f70OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(OooOO0 oooOO1) {
        super(1);
        this.f70OooO0Oo = oooOO1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String setOnInitErrorAction = str;
        Intrinsics.checkNotNullParameter(setOnInitErrorAction, "$this$setOnInitErrorAction");
        this.f70OooO0Oo.f177OooO0O0.OooO0Oo(AuthResponse.Companion.OooO00o(AuthResponse.INSTANCE, null, -2002, null, 5));
        return Unit.INSTANCE;
    }
}
