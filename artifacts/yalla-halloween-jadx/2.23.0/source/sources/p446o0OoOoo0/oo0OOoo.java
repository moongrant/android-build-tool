package p446o0OoOoo0;

import com.yalla.yalla.module.event.ui.screen.EventRuleScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oo0OOoo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oo0OOoo f46403OooO0Oo = new oo0OOoo();

    public oo0OOoo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EventRuleScreen.INSTANCE.navigate();
        return Unit.INSTANCE;
    }
}
