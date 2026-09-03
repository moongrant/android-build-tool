package p506o0o00oOo;

import android.view.View;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p473o0OoooOo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOOOoo extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f50579OooO0oO;

    public ooOOOOoo(FollowerActivity followerActivity) {
        this.f50579OooO0oO = followerActivity;
    }

    @Override // p473o0OoooOo.o0OOOO0o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        FollowerActivity followerActivity = this.f50579OooO0oO;
        oO000OOo oo000ooo = followerActivity.f26642OooOo0;
        if (oo000ooo == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo000ooo = null;
        }
        oo000ooo.Oooo00O(true);
        followerActivity.OooOo0O();
    }
}
