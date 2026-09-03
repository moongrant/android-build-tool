package p100o000oOoo;

import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000oo extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f35499OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000oo(String str) {
        super(1);
        this.f35499OooO0Oo = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyReceiver semanticsPropertyReceiver2 = semanticsPropertyReceiver;
        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver2, this.f35499OooO0Oo);
        SemanticsPropertiesKt.m3169setRolekuIjeqM(semanticsPropertyReceiver2, Role.INSTANCE.m3158getImageo7Vup1c());
        return Unit.INSTANCE;
    }
}
