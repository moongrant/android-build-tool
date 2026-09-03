package com.yallatech.support.platform.base;

import OooOOOO.OooO00o;
import android.content.Context;
import com.umeng.analytics.pro.d;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p003OooO0Oo.OooOo;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\tR\u0016\u0010\r\u001a\u00020\n8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/yallatech/support/platform/base/IEnv;", "", "Landroid/content/Context;", d.R, "", "env", "", "switch", "(Landroid/content/Context;I)V", "()I", "Lcom/yallatech/support/platform/base/IEnv$IHosts;", "getHosts", "()Lcom/yallatech/support/platform/base/IEnv$IHosts;", "hosts", "Companion", "IHosts", "lib_release"}, k = 1, mv = {1, 5, 1})
public interface IEnv {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int ENV_DEV = 1;
    public static final int ENV_RELEASE = 4;
    public static final int ENV_TEST = 2;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/yallatech/support/platform/base/IEnv$Companion;", "", "LOooO0Oo/OooOo;", "impl", "()LOooO0Oo/OooOo;", "", "ENV_DEV", "I", "ENV_TEST", "ENV_RELEASE", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ENV_DEV = 1;
        public static final int ENV_RELEASE = 4;
        public static final int ENV_TEST = 2;

        private Companion() {
        }

        @NotNull
        public final OooOo impl() {
            return OooO00o.f175OooO00o;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/yallatech/support/platform/base/IEnv$IHosts;", "", "", "api", "()Ljava/lang/String;", "h5", "downLoadH5", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class IHosts {
        @NotNull
        public abstract String api();

        @NotNull
        public abstract String downLoadH5();

        @NotNull
        public abstract String h5();
    }

    int env();

    @NotNull
    IHosts getHosts();

    /* JADX INFO: renamed from: switch */
    void mo0switch(@NotNull Context context, int env);
}
