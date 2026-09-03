package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0.OooOO0 f7799OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f7800OooO0o0;

    public o00O0O(o0OoOo0 o0oooo0, o0OoOo0.OooOO0 oooOO1, int i) {
        this.f7800OooO0o0 = o0oooo0;
        this.f7799OooO0Oo = oooOO1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0OoOo0 o0oooo0 = this.f7800OooO0o0;
        RecyclerView recyclerView = o0oooo0.f7840OooOOo;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        o0OoOo0.OooOO0 oooOO1 = this.f7799OooO0Oo;
        if (oooOO1.f7870OooOOO) {
            return;
        }
        RecyclerView.o0O0O00 o0o0o00 = oooOO1.f7866OooO0oo;
        if (o0o0o00.getAbsoluteAdapterPosition() != -1) {
            RecyclerView.ItemAnimator itemAnimator = o0oooo0.f7840OooOOo.getItemAnimator();
            if (itemAnimator == null || !itemAnimator.OooOO0o()) {
                ArrayList arrayList = o0oooo0.f7839OooOOOo;
                int size = arrayList.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    if (!((o0OoOo0.OooOO0) arrayList.get(i)).f7872OooOOOO) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    o0oooo0.f7837OooOOO0.OooO0oO(o0o0o00);
                    return;
                }
            }
            o0oooo0.f7840OooOOo.post(this);
        }
    }
}
