package p485o0o00O0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class o0000O00 implements Observer<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47806OooO0Oo;

    public o0000O00(MomentDetailActivity momentDetailActivity) {
        this.f47806OooO0Oo = momentDetailActivity;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(@NotNull Object result) {
        Intrinsics.checkNotNullParameter(result, "result");
        boolean zBooleanValue = ((Boolean) result).booleanValue();
        int i = MomentDetailActivity.f26057Oooo0;
        this.f47806OooO0Oo.OooOoOO().f59049OooO0O0.setExpanded(zBooleanValue);
    }
}
