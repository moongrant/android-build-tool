package p582o0oOoOoO;

import com.yalla.yalla.ui.fragment.RoomMemberConveneListDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class a3 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ RoomMemberConveneListDialog f46841Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(RoomMemberConveneListDialog roomMemberConveneListDialog) {
        super(0);
        this.f46841Oooo0o = roomMemberConveneListDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f46841Oooo0o.OooOOO().f49176OooO0oo.OooO0oo();
        if (!StringsKt.isBlank(this.f46841Oooo0o.f24164OoooOoO)) {
            RoomMemberConveneListDialog roomMemberConveneListDialog = this.f46841Oooo0o;
            roomMemberConveneListDialog.OooOOo(roomMemberConveneListDialog.f24164OoooOoO, true);
        } else {
            this.f46841Oooo0o.OooOOOo(true);
        }
        return Unit.INSTANCE;
    }
}
