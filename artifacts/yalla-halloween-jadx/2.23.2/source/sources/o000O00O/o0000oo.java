package o000O00O;

import android.view.View;
import androidx.media3.common.Player;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000oo implements o000OoO.o00000O0.OooO00o, o0000O.o00000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f34024OooO0Oo;

    public /* synthetic */ o0000oo(Object obj) {
        this.f34024OooO0Oo = obj;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onTrackSelectionParametersChanged((androidx.media3.common.o00O0O) this.f34024OooO0Oo);
    }

    @Override // o0000O.o00000
    public final boolean perform(View view, o0000O.o00000.OooO00o oooO00o) {
        BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.f34024OooO0Oo;
        int i = BottomSheetDragHandleView.f16029OooOOO0;
        return bottomSheetDragHandleView.OooO0OO();
    }
}
