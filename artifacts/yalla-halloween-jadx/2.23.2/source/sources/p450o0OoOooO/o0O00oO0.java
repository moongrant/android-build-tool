package p450o0OoOooO;

import com.yalla.yalla.module.event.ui.screen.EventRuleScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00oO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0O00oO0 f47525OooO0Oo = new o0O00oO0();

    public o0O00oO0() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventRuleScreen.INSTANCE.navigate();
        return Unit.INSTANCE;
    }
}
