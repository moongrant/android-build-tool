package p487o0o00O;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p424o0OoO0Oo.o00O;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o000000O extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48750OooO0oO;

    public o000000O(BlackListActivity blackListActivity) {
        this.f48750OooO0oO = blackListActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        BlackListActivity blackListActivity = this.f48750OooO0oO;
        o000000 o000000Var = blackListActivity.f24920OooOo0O;
        if (o000000Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000000Var = null;
        }
        o000000Var.Oooo00O(true);
        blackListActivity.f24916OooOOo0 = 1;
        o00O.OooO0O0(LifecycleOwnerKt.getLifecycleScope(blackListActivity), new o0Oo0oo(blackListActivity, null)).observe(blackListActivity, new BlackListActivity.OooO00o(new o0OO00O(blackListActivity, true)));
    }
}
