package p121o00O0Ooo;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000Ooo extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f36454OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(String str) {
        super(1);
        this.f36454OooO0Oo = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semanticsPropertyReceiver2 = semanticsPropertyReceiver;
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, this.f36454OooO0Oo);
        SemanticsPropertiesKt.m3179setRolekuIjeqM(semanticsPropertyReceiver2, Role.INSTANCE.m3168getImageo7Vup1c());
        return Unit.INSTANCE;
    }
}
