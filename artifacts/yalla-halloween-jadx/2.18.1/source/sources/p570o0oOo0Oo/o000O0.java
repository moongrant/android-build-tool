package p570o0oOo0Oo;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O0 extends RecyclerView.OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f45462OooO00o;

    public o000O0(int i) {
        this.f45462OooO00o = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OooOo
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.o0OOO0o o0ooo0o2) {
        super.getItemOffsets(rect, view, recyclerView, o0ooo0o2);
        int i = this.f45462OooO00o;
        rect.left = i;
        rect.top = i;
        rect.right = i;
        rect.bottom = i;
    }
}
