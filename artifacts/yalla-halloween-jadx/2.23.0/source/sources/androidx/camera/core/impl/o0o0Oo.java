package androidx.camera.core.impl;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.Oooo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface o0o0Oo<T extends androidx.camera.core.Oooo0> extends p034OoooOO0.o0Oo0oo<T>, p034OoooOO0.o0O0O00, o000O0Oo {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final OooO0o f3777OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final OooO0o f3778OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final OooO0o f3779OooOooO;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final OooO0o f3771OooOo0 = Config.OooO00o.OooO00o(SessionConfig.class, "camerax.core.useCase.defaultSessionConfig");

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final OooO0o f3772OooOo0O = Config.OooO00o.OooO00o(o000000O.class, "camerax.core.useCase.defaultCaptureConfig");

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final OooO0o f3773OooOo0o = Config.OooO00o.OooO00o(SessionConfig.OooO0o.class, "camerax.core.useCase.sessionConfigUnpacker");

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO0o f3770OooOo = Config.OooO00o.OooO00o(o000000O.OooO0O0.class, "camerax.core.useCase.captureConfigUnpacker");

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final OooO0o f3775OooOoO0 = Config.OooO00o.OooO00o(Integer.TYPE, "camerax.core.useCase.surfaceOccupancyPriority");

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final OooO0o f3774OooOoO = Config.OooO00o.OooO00o(CameraSelector.class, "camerax.core.useCase.cameraSelector");

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final OooO0o f3776OooOoOO = Config.OooO00o.OooO00o(Range.class, "camerax.core.useCase.targetFrameRate");

    public interface OooO00o<T extends androidx.camera.core.Oooo0, C extends o0o0Oo<T>, B> extends p028Oooo0oO.o00O000o<T> {
        @NonNull
        C OooO0O0();
    }

    static {
        Class cls = Boolean.TYPE;
        f3778OooOoo0 = Config.OooO00o.OooO00o(cls, "camerax.core.useCase.zslDisabled");
        f3777OooOoo = Config.OooO00o.OooO00o(cls, "camerax.core.useCase.highResolutionDisabled");
        f3779OooOooO = Config.OooO00o.OooO00o(UseCaseConfigFactory.CaptureType.class, "camerax.core.useCase.captureType");
    }

    @Nullable
    Range OooO0Oo();

    boolean OooOOoo();

    @Nullable
    SessionConfig OooOo();

    int OooOoO0();

    @Nullable
    SessionConfig.OooO0o OooOoOO();

    @Nullable
    CameraSelector OooOooO();

    boolean OooOooo();

    @Nullable
    o000000O Oooo000();

    int Oooo00o();

    @NonNull
    UseCaseConfigFactory.CaptureType getCaptureType();
}
