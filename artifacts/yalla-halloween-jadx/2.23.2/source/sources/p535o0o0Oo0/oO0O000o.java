package p535o0o0Oo0;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.manager.MusicState;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO0O000o implements Observer {
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        List it = (List) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (oO0O00.f53970OooO00o) {
            oO0O00.f53970OooO00o = false;
            return;
        }
        LiveData liveDataOooO00o = MusicState.OooO00o();
        boolean z = oO0O00.f53970OooO00o;
        liveDataOooO00o.removeObserver((Observer) oO0O00.f53976OooO0oO.getValue());
        if (oO0O00.f53971OooO0O0 != null) {
            if (MusicState.f22363OooO0O0.getValue() == MusicState.State.Playing) {
                oO0O00.OooO0o(oO0O00.f53971OooO0O0, 2);
            } else {
                MusicState.f22362OooO00o.setValue(oO0O00.f53971OooO0O0);
            }
            oO0O00.f53971OooO0O0 = null;
            return;
        }
        if (oO0O00.f53972OooO0OO) {
            oO0O00.f53972OooO0OO = false;
            LiveEventBus.get("MUSIC_NEXT_DELETED").post(Boolean.TRUE);
        }
    }
}
