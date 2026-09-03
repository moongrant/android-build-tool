package p440o0OoOo0o;

import com.yalla.yalla.module.account.ui.screen.LinkedAccountsScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000Ooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0000Ooo f46127OooO0Oo = new o0000Ooo();

    public o0000Ooo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LinkedAccountsScreen.INSTANCE.navigate();
        return Unit.INSTANCE;
    }
}
