package p536o0o0Oo0o;

import com.yalla.yalla.ui.screen.user.UserVisitorScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO0000O f55087OooO0Oo = new oO0000O();

    public oO0000O() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        UserVisitorScreen.INSTANCE.navigate();
        return Unit.INSTANCE;
    }
}
