package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Calendar f16918OooO00o = o0000.OooO(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Calendar f16919OooO0O0 = o0000.OooO(null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f16920OooO0OO;

    public Oooo000(OooOo00 oooOo00) {
        this.f16920OooO0OO = oooOo00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.o0OOO0o o0ooo0o2) {
        S s;
        if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            OooOo00 oooOo00 = this.f16920OooO0OO;
            for (o000OO.OooO0o oooO0o : oooOo00.f16902OooO0o.ooOO()) {
                F f = oooO0o.f34865OooO00o;
                if (f != 0 && (s = oooO0o.f34866OooO0O0) != 0) {
                    long jLongValue = ((Long) f).longValue();
                    Calendar calendar = this.f16918OooO00o;
                    calendar.setTimeInMillis(jLongValue);
                    long jLongValue2 = ((Long) s).longValue();
                    Calendar calendar2 = this.f16919OooO0O0;
                    calendar2.setTimeInMillis(jLongValue2);
                    int i = calendar.get(1) - yearGridAdapter.f16929OooO00o.f16904OooO0oO.f16805OooO0Oo.f16859OooO0o;
                    int i2 = calendar2.get(1) - yearGridAdapter.f16929OooO00o.f16904OooO0oO.f16805OooO0Oo.f16859OooO0o;
                    View viewFindViewByPosition = gridLayoutManager.findViewByPosition(i);
                    View viewFindViewByPosition2 = gridLayoutManager.findViewByPosition(i2);
                    int i3 = gridLayoutManager.f7447OooO0o0;
                    int i4 = i / i3;
                    int i5 = i2 / i3;
                    int i6 = i4;
                    while (i6 <= i5) {
                        View viewFindViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.f7447OooO0o0 * i6);
                        if (viewFindViewByPosition3 != null) {
                            canvas.drawRect((i6 != i4 || viewFindViewByPosition == null) ? 0 : (viewFindViewByPosition.getWidth() / 2) + viewFindViewByPosition.getLeft(), viewFindViewByPosition3.getTop() + oooOo00.f16907OooOO0O.f16879OooO0Oo.f16870OooO00o.top, (i6 != i5 || viewFindViewByPosition2 == null) ? recyclerView.getWidth() : (viewFindViewByPosition2.getWidth() / 2) + viewFindViewByPosition2.getLeft(), viewFindViewByPosition3.getBottom() - oooOo00.f16907OooOO0O.f16879OooO0Oo.f16870OooO00o.bottom, oooOo00.f16907OooOO0O.f16883OooO0oo);
                        }
                        i6++;
                    }
                }
            }
        }
    }
}
