package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0.OooOO0 f9181Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f9182Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f9183Oooo0oo;

    public o00O0O(o0OoOo0 o0oooo1, o0OoOo0.OooOO0 oooOO1, int i) {
        this.f9183Oooo0oo = o0oooo1;
        this.f9181Oooo0o = oooOO1;
        this.f9182Oooo0oO = i;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OoOo0$OooOO0>] */
    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f9183Oooo0oo.f9223OooOOo;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        o0OoOo0.OooOO0 oooOO1 = this.f9181Oooo0o;
        if (oooOO1.f9255OoooOOO || oooOO1.f9252OoooO00.getAbsoluteAdapterPosition() == -1) {
            return;
        }
        RecyclerView.ItemAnimator itemAnimator = this.f9183Oooo0oo.f9223OooOOo.getItemAnimator();
        if (itemAnimator == null || !itemAnimator.OooOO0o()) {
            o0OoOo0 o0oooo1 = this.f9183Oooo0oo;
            int size = o0oooo1.f9222OooOOOo.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                if (!((o0OoOo0.OooOO0) o0oooo1.f9222OooOOOo.get(i)).f9256OoooOOo) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                this.f9183Oooo0oo.f9220OooOOO0.OooOO0(this.f9181Oooo0o.f9252OoooO00);
                return;
            }
        }
        this.f9183Oooo0oo.f9223OooOOo.post(this);
    }
}
