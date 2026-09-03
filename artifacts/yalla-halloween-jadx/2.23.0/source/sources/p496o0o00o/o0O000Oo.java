package p496o0o00o;

import com.yalla.yalla.ui.activity.user.UserDefaultHeadActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ UserDefaultHeadActivity f49061OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000Oo(UserDefaultHeadActivity userDefaultHeadActivity) {
        super(0);
        this.f49061OooO0Oo = userDefaultHeadActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f49061OooO0Oo.finish();
        return Unit.INSTANCE;
    }
}
