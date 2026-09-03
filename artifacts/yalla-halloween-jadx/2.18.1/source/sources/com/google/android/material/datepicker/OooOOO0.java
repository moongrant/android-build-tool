package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Calendar f16965OooO00o = o000OOo.OooO(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Calendar f16966OooO0O0 = o000OOo.OooO(null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f16967OooO0OO;

    public OooOOO0(OooOO0O oooOO0O) {
        this.f16967OooO0OO = oooOO0O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.o0OOO0o o0ooo0o2) {
        if ((recyclerView.getAdapter() instanceof o000000O) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            o000000O o000000o2 = (o000000O) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (o000OO0O.OooO0o<Long, Long> oooO0o : this.f16967OooO0OO.f16951Oooo0oo.OooOo0O()) {
                Long l = oooO0o.f28234OooO00o;
                if (l != null && oooO0o.f28235OooO0O0 != null) {
                    this.f16965OooO00o.setTimeInMillis(l.longValue());
                    this.f16966OooO0O0.setTimeInMillis(oooO0o.f28235OooO0O0.longValue());
                    int iOooO00o = o000000o2.OooO00o(this.f16965OooO00o.get(1));
                    int iOooO00o2 = o000000o2.OooO00o(this.f16966OooO0O0.get(1));
                    View viewFindViewByPosition = gridLayoutManager.findViewByPosition(iOooO00o);
                    View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(iOooO00o2);
                    int i = gridLayoutManager.f8828Oooo0oO;
                    int i2 = iOooO00o / i;
                    int i3 = iOooO00o2 / i;
                    for (int i4 = i2; i4 <= i3; i4++) {
                        View viewFindViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.f8828Oooo0oO * i4);
                        if (viewFindViewByPosition3 != null) {
                            int top = viewFindViewByPosition3.getTop() + this.f16967OooO0OO.f16955OoooO0O.f16929OooO0Oo.f16920OooO00o.top;
                            int bottom = viewFindViewByPosition3.getBottom() - this.f16967OooO0OO.f16955OoooO0O.f16929OooO0Oo.f16920OooO00o.bottom;
                            canvas.drawRect(i4 == i2 ? (viewFindViewByPosition.getWidth() / 2) + viewFindViewByPosition.getLeft() : 0, top, i4 == i3 ? (viewFindViewByPosition2.getWidth() / 2) + viewFindViewByPosition2.getLeft() : recyclerView.getWidth(), bottom, this.f16967OooO0OO.f16955OoooO0O.f16933OooO0oo);
                        }
                    }
                }
            }
        }
    }
}
