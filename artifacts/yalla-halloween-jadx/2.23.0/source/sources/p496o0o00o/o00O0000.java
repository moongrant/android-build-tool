package p496o0o00o;

import android.view.View;
import com.yalla.yalla.ui.activity.user.FollowerActivity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p466o0Oooo0o.oo00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 extends oo00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ FollowerActivity f49011OooO0oO;

    public o00O0000(FollowerActivity followerActivity) {
        this.f49011OooO0oO = followerActivity;
    }

    @Override // p466o0Oooo0o.oo00o
    public final void OooO00o(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        FollowerActivity followerActivity = this.f49011OooO0oO;
        o00 o00Var = followerActivity.f27109OooOo0;
        if (o00Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o00Var = null;
        }
        o00Var.Oooo00O(true);
        followerActivity.OooOo0O();
    }
}
