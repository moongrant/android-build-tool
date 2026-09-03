package androidx.compose.ui.platform;

import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00O0O implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f6502Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f6503OoooO00;

    public /* synthetic */ o00O0O(Object obj, int i) {
        this.f6502Oooo = i;
        this.f6503OoooO00 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6502Oooo) {
            case 0:
                Function0 tmp0 = (Function0) this.f6503OoooO00;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke();
                break;
            case 1:
                ((androidx.room.OooO0OO) this.f6503OoooO00).f9304Oooo.OooO00o();
                break;
            default:
                MomentDetailView.m487setForwardText$lambda14$lambda12((MomentDetailView) this.f6503OoooO00);
                break;
        }
    }
}
