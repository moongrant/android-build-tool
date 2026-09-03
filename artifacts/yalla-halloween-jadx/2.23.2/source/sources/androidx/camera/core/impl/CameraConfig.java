package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface CameraConfig extends o00O0OOO {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO0o f3522OooO0o = Config.OooO00o.OooO00o(UseCaseConfigFactory.class, "camerax.core.camera.useCaseConfigFactory");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO0o f3523OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO0o f3524OooO0oo;

    @Retention(RetentionPolicy.SOURCE)
    public @interface RequiredRule {
    }

    static {
        Config.OooO00o.OooO00o(o000Oo0.class, "camerax.core.camera.compatibilityId");
        f3523OooO0oO = Config.OooO00o.OooO00o(Integer.class, "camerax.core.camera.useCaseCombinationRequiredRule");
        f3524OooO0oo = Config.OooO00o.OooO00o(o00OO00O.class, "camerax.core.camera.SessionProcessor");
        Config.OooO00o.OooO00o(Boolean.class, "camerax.core.camera.isZslDisabled");
    }
}
