package OooOOOO;

import android.content.Context;
import com.yallatech.support.platform.base.IEnv;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p003OooO0Oo.OooOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f175OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final C0000OooO00o f176OooO0O0 = new C0000OooO00o();

    /* JADX INFO: renamed from: OooOOOO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0000OooO00o extends IEnv.IHosts {
        @Override // com.yallatech.support.platform.base.IEnv.IHosts
        @NotNull
        public final String api() {
            return "api.open.yalla.chat";
        }

        @Override // com.yallatech.support.platform.base.IEnv.IHosts
        @NotNull
        public final String downLoadH5() {
            return "https://www.yalla.chat";
        }

        @Override // com.yallatech.support.platform.base.IEnv.IHosts
        @NotNull
        public final String h5() {
            return "https://api.open.yalla.chat";
        }
    }

    @Override // com.yallatech.support.platform.base.IEnv
    public final int env() {
        return 4;
    }

    @Override // com.yallatech.support.platform.base.IEnv
    @NotNull
    public final IEnv.IHosts getHosts() {
        return f176OooO0O0;
    }

    @Override // com.yallatech.support.platform.base.IEnv
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void mo0switch(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
