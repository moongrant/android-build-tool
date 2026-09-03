package p022Oooo00O;

import kotlin.jvm.internal.Intrinsics;
import p519o0o0O0oO.d2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O000o0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f698OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f699OooO0o0;

    public /* synthetic */ o0O000o0(Object obj, int i) {
        this.f698OooO0Oo = i;
        this.f699OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f698OooO0Oo;
        Object obj = this.f699OooO0o0;
        switch (i) {
            case 0:
                ((o0O00OO) obj).f706OooO00o.OooO0Oo();
                break;
            default:
                d2 this$0 = (d2) obj;
                int i2 = d2.f52195OooOOO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f52198OooOO0O.setVisibility(0);
                break;
        }
    }
}
