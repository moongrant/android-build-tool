package androidx.appcompat.widget;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OO00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f3292OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f3293OooO0o0;

    public /* synthetic */ o000OO00(Object obj, int i) {
        this.f3292OooO0Oo = i;
        this.f3293OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3292OooO0Oo;
        Object obj = this.f3293OooO0o0;
        switch (i) {
            case 0:
                ((o000OOo0) obj).OooO00o();
                break;
            default:
                ArrayList transitioningViews = (ArrayList) obj;
                Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
                androidx.fragment.app.o0000oo.OooO0OO(4, transitioningViews);
                break;
        }
    }
}
