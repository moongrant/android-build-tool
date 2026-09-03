package androidx.compose.ui.platform;

import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0O implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f6474Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f6475Oooo0oO;

    public /* synthetic */ o00O0O(Object obj, int i) {
        this.f6474Oooo0o = i;
        this.f6475Oooo0oO = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6474Oooo0o) {
            case 0:
                Function0 tmp0 = (Function0) this.f6475Oooo0oO;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            case 1:
                ((androidx.room.OooO0OO) this.f6475Oooo0oO).f9288Oooo0o.OooO00o();
                break;
            default:
                MomentDetailView.m487setForwardText$lambda14$lambda12((MomentDetailView) this.f6475Oooo0oO);
                break;
        }
    }
}
