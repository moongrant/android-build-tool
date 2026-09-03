package p007OooOOOo;

import android.content.Context;
import com.yallatech.support.platform.base.IEnv;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p003OooO0o0.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOo00 f198OooO00o = new OooOo00();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f199OooO0O0 = new OooO00o();

    public static final class OooO00o extends IEnv.IHosts {
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
        return f199OooO0O0;
    }

    @Override // com.yallatech.support.platform.base.IEnv
    /* JADX INFO: renamed from: switch, reason: not valid java name */
    public final void mo0switch(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
