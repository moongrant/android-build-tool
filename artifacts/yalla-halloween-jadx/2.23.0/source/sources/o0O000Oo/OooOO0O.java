package o0O000Oo;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import io.opentelemetry.compat.Predicate;
import o0000O.o000OOo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOO0O implements o000OOo, Predicate {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f41658OooO0Oo;

    @Override // io.opentelemetry.compat.Predicate
    public final boolean OooO00o(String str) {
        return ((String) this.f41658OooO0Oo).equals(str);
    }

    @Override // o0000O.o000OOo
    public final boolean perform(View view, o000OOo.OooO00o oooO00o) {
        BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.f41658OooO0Oo;
        int i = BottomSheetDragHandleView.f16502OooOOO0;
        return bottomSheetDragHandleView.OooO0OO();
    }
}
