package p141o00Oo;

import androidx.compose.foundation.gestures.DragScope;

/* JADX INFO: loaded from: classes2.dex */
public final class o000000 implements DragScope {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000OOo f37490OooO00o;

    public o000000(o000OOo o000ooo2) {
        this.f37490OooO00o = o000ooo2;
    }

    @Override // androidx.compose.foundation.gestures.DragScope
    public final void dragBy(float f) {
        this.f37490OooO00o.f37491OooO00o.invoke(Float.valueOf(f));
    }
}
