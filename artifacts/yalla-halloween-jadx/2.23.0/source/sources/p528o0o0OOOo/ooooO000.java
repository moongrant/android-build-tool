package p528o0o0OOOo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class ooooO000 implements Observer<List<MusicTable>> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ooooO000 f54416OooO0Oo = new ooooO000();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<MusicTable> list) {
        List<MusicTable> it = list;
        Intrinsics.checkNotNullParameter(it, "it");
        if (oOO0.f54098OooO00o) {
            oOO0.f54098OooO00o = false;
            return;
        }
        LiveData liveDataOooO00o = MusicState.OooO00o();
        boolean z = oOO0.f54098OooO00o;
        liveDataOooO00o.removeObserver((Observer) oOO0.f54104OooO0oO.getValue());
        if (oOO0.f54099OooO0O0 != null) {
            if (MusicState.f22836OooO0O0.getValue() == MusicState.State.Playing) {
                oOO0.OooO0o(oOO0.f54099OooO0O0, 2);
            } else {
                MusicState.f22835OooO00o.setValue(oOO0.f54099OooO0O0);
            }
            oOO0.f54099OooO0O0 = null;
            return;
        }
        if (oOO0.f54100OooO0OO) {
            oOO0.f54100OooO0OO = false;
            LiveEventBus.get("MUSIC_NEXT_DELETED").post(Boolean.TRUE);
        }
    }
}
