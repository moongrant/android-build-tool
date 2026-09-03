package androidx.recyclerview.widget;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O0O.OooOO0 f10931OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00O0O f10932OooO0o0;

    public o00Oo0(o00O0O o00o0o2, o00O0O.OooOO0 oooOO1, int i) {
        this.f10932OooO0o0 = o00o0o2;
        this.f10931OooO0Oo = oooOO1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o00O0O o00o0o2 = this.f10932OooO0o0;
        RecyclerView recyclerView = o00o0o2.f10897OooOOo;
        if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
            return;
        }
        o00O0O.OooOO0 oooOO1 = this.f10931OooO0Oo;
        if (oooOO1.f10927OooOOO) {
            return;
        }
        RecyclerView.o0O0O00 o0o0o00 = oooOO1.f10923OooO0oo;
        if (o0o0o00.getAbsoluteAdapterPosition() != -1) {
            RecyclerView.ItemAnimator itemAnimator = o00o0o2.f10897OooOOo.getItemAnimator();
            if (itemAnimator == null || !itemAnimator.OooOO0o()) {
                ArrayList arrayList = o00o0o2.f10896OooOOOo;
                int size = arrayList.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    if (!((o00O0O.OooOO0) arrayList.get(i)).f10929OooOOOO) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    o00o0o2.f10894OooOOO0.OooO0oO(o0o0o00);
                    return;
                }
            }
            o00o0o2.f10897OooOOo.post(this);
        }
    }
}
