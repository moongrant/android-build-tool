package com.code.android.yldialog.timechoose;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 extends RecyclerView.o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ DateScrollView f13538OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f13539OooO0O0;

    public OooO0O0(DateScrollView dateScrollView, int i) {
        this.f13538OooO00o = dateScrollView;
        this.f13539OooO0O0 = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o00O0O
    public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i) {
        View viewFindChildViewUnder;
        int iIntValue;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        DateScrollView dateScrollView = this.f13538OooO00o;
        if (dateScrollView.f13507OooO0o0 == 0 || dateScrollView.f13506OooO0o == null || i != 0 || (viewFindChildViewUnder = recyclerView.findChildViewUnder(recyclerView.getWidth() * 0.5f, recyclerView.getHeight() * 0.5f)) == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(viewFindChildViewUnder) - dateScrollView.f13507OooO0o0;
        DateScrollView.DateScrollAdapter dateScrollAdapter = dateScrollView.f13508OooO0oO;
        if (dateScrollAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapter");
            dateScrollAdapter = null;
        }
        dateScrollAdapter.getClass();
        try {
            List<Integer> list = dateScrollAdapter.f13511OooO00o;
            Intrinsics.checkNotNull(list);
            iIntValue = list.get(childAdapterPosition).intValue();
        } catch (Exception e) {
            e.printStackTrace();
            iIntValue = -1;
        }
        if (childAdapterPosition >= 0) {
            DateScrollView.OooO0O0 oooO0O0 = dateScrollView.f13506OooO0o;
            Intrinsics.checkNotNull(oooO0O0);
            oooO0O0.OooO0O0(iIntValue, childAdapterPosition, this.f13539OooO0O0);
        }
    }
}
