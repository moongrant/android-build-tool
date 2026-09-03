package p486o0o00O00;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.yalla.ui.activity.main.BlackListActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p420o0OoO0OO.o0ooOOo;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O00 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ BlackListActivity f48380OooO0oO;

    public o0O0O00(BlackListActivity blackListActivity) {
        this.f48380OooO0oO = blackListActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        BlackListActivity blackListActivity = this.f48380OooO0oO;
        oo0o0Oo oo0o0oo = blackListActivity.f25374OooOo0O;
        if (oo0o0oo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0o0oo = null;
        }
        oo0o0oo.Oooo00O(true);
        blackListActivity.f25370OooOOo0 = 1;
        o0ooOOo.OooO0O0(LifecycleOwnerKt.getLifecycleScope(blackListActivity), new o00oO0o(blackListActivity, null)).observe(blackListActivity, new BlackListActivity.OooO00o(new o0ooOOo(blackListActivity, true)));
    }
}
