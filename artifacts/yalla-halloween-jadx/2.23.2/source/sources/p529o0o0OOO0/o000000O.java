package p529o0o0OOO0;

import com.yalla.yalla.data.db.table.SystemMessage;
import com.yalla.yalla.ui.adapter.Oooo000;
import com.yalla.yalla.ui.fragment.message.MessageBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends Lambda implements Function1<SystemMessage, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MessageBoxFragment f53371OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000O(MessageBoxFragment messageBoxFragment) {
        super(1);
        this.f53371OooO0Oo = messageBoxFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(SystemMessage systemMessage) {
        SystemMessage systemMessage2 = systemMessage;
        Oooo000 oooo000 = this.f53371OooO0Oo.f27997OooOOOo;
        if (oooo000 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterMessageHead");
            oooo000 = null;
        }
        oooo000.Oooo0o0(systemMessage2);
        return Unit.INSTANCE;
    }
}
