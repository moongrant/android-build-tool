package p513o0o0O00;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0o extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f51081OooO00o;

    public o0OOO0o(int i) {
        this.f51081OooO00o = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        super.getItemOffsets(rect, view, recyclerView, o0ooo0o2);
        int i = this.f51081OooO00o;
        rect.left = i;
        rect.top = i;
        rect.right = i;
        rect.bottom = i;
    }
}
