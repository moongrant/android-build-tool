package p601o0oo00Oo;

import android.view.View;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.ui.view.MomentDetailView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00oO0 extends o00Oo0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailView f48178Oooo;

    public o0O00oO0(MomentDetailView momentDetailView) {
        this.f48178Oooo = momentDetailView;
    }

    @Override // p654o0ooo.o00Oo0
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        PackManager.INSTANCE.goToAppStore(this.f48178Oooo.getActivity());
    }
}
