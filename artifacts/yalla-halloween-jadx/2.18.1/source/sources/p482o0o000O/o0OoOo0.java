package p482o0o000O;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.application.App;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p252o00ooO0.o000000O;
import p391o0OOooOo.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0OoOo0 extends o000000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Context f40869OooO0OO;

    public o0OoOo0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40869OooO0OO = context;
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        UMConfigure.init(this.f40869OooO0OO, 1, null);
        MobclickAgent.setPageCollectionMode(MobclickAgent.PageMode.LEGACY_MANUAL);
        MobclickAgent.setCatchUncaughtExceptions(true);
        o0O00000.f38915OooO00o = App.f11458Oooo0oO;
    }
}
