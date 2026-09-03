package p582o0oOoOoO;

import com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class w2 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomMemberConveneListDialog f46911Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(RoomMemberConveneListDialog roomMemberConveneListDialog) {
        super(1);
        this.f46911Oooo0o = roomMemberConveneListDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        if (o00O0.OooO0o0(it)) {
            this.f46911Oooo0o.OooOOo(it, true);
        }
        return Unit.INSTANCE;
    }
}
