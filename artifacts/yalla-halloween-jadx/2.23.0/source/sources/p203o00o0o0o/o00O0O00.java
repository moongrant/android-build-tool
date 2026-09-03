package p203o00o0o0o;

import com.app.base.protobuf.room.Room;
import com.google.android.exoplayer2.OooOo00;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p562o0oOo0O.o000oOoO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0O00 implements OooOo00.OooO, o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f39193OooO0Oo;

    public /* synthetic */ o00O0O00(Object obj) {
        this.f39193OooO0Oo = obj;
    }

    @Override // p562o0oOo0O.o000oOoO
    public final void OooO0O0() {
        RoomMoraGameListDialog this$0 = (RoomMoraGameListDialog) this.f39193OooO0Oo;
        int i = RoomMoraGameListDialog.f27951OooOOO0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        List<T> list = this$0.f27955OooOO0o.f10111OooOOoo;
        RoomMoraGameListDialog.OooOO0o(((Room.RoshamboModel) list.get(list.size() - 1)).getMorauuid(), false);
    }
}
