package p529o0o0OOO0;

import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.ui.adapter.Oooo000;
import com.yalla.yalla.ui.fragment.message.MessageBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000O0 extends Lambda implements Function1<YallaTeamMessage, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MessageBoxFragment f53377OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000O0(MessageBoxFragment messageBoxFragment) {
        super(1);
        this.f53377OooO0Oo = messageBoxFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(YallaTeamMessage yallaTeamMessage) {
        YallaTeamMessage yallaTeamMessage2 = yallaTeamMessage;
        Oooo000 oooo000 = this.f53377OooO0Oo.f27997OooOOOo;
        if (oooo000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            oooo000 = null;
        }
        oooo000.Oooo0oO(yallaTeamMessage2);
        return Unit.INSTANCE;
    }
}
