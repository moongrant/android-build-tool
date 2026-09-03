package p579o0oOoOOo;

import com.yalla.yalla.model.LoginModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class oOO0Oo00 extends Lambda implements Function1<LoginModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ooooO0O0 f46098Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0Oo00(ooooO0O0 ooooo0o0) {
        super(1);
        this.f46098Oooo0o = ooooo0o0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LoginModel loginModel) {
        if (loginModel != null) {
            this.f46098Oooo0o.dismiss();
        } else {
            ooooO0O0.OooO0oO(this.f46098Oooo0o);
        }
        return Unit.INSTANCE;
    }
}
