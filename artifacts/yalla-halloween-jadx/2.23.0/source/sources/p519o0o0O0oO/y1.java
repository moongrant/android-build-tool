package p519o0o0O0oO;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.gift.GiftPropAll;
import com.yalla.yalla.ui.dialog.RoomMoraGameListDialog;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y1 implements Observer<List<GiftPropAll>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomMoraGameListDialog f53215OooO0Oo;

    public y1(RoomMoraGameListDialog roomMoraGameListDialog) {
        this.f53215OooO0Oo = roomMoraGameListDialog;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<GiftPropAll> list) {
        List<GiftPropAll> it = list;
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isEmpty()) {
            this.f53215OooO0Oo.f27955OooOO0o.notifyDataSetChanged();
        }
    }
}
