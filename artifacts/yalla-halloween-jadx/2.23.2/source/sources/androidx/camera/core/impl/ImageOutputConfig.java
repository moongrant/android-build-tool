package androidx.camera.core.impl;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.AspectRatio;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface ImageOutputConfig extends o00O0OOO {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO0o f3539OooOO0O = Config.OooO00o.OooO00o(AspectRatio.class, "camerax.core.imageOutput.targetAspectRatio");

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final OooO0o f3540OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO0o f3541OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final OooO0o f3542OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final OooO0o f3543OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final OooO0o f3544OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final OooO0o f3545OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final OooO0o f3546OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final OooO0o f3547OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final OooO0o f3548OooOo00;

    @Retention(RetentionPolicy.SOURCE)
    public @interface OptionalRotationValue {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RotationDegreesValue {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface RotationValue {
    }

    static {
        Class cls = Integer.TYPE;
        f3540OooOO0o = Config.OooO00o.OooO00o(cls, "camerax.core.imageOutput.targetRotation");
        f3542OooOOO0 = Config.OooO00o.OooO00o(cls, "camerax.core.imageOutput.appTargetRotation");
        f3541OooOOO = Config.OooO00o.OooO00o(cls, "camerax.core.imageOutput.mirrorMode");
        f3543OooOOOO = Config.OooO00o.OooO00o(Size.class, "camerax.core.imageOutput.targetResolution");
        f3544OooOOOo = Config.OooO00o.OooO00o(Size.class, "camerax.core.imageOutput.defaultResolution");
        f3546OooOOo0 = Config.OooO00o.OooO00o(Size.class, "camerax.core.imageOutput.maxResolution");
        f3545OooOOo = Config.OooO00o.OooO00o(List.class, "camerax.core.imageOutput.supportedResolutions");
        f3547OooOOoo = Config.OooO00o.OooO00o(ResolutionSelector.class, "camerax.core.imageOutput.resolutionSelector");
        f3548OooOo00 = Config.OooO00o.OooO00o(List.class, "camerax.core.imageOutput.customOrderedResolutions");
    }

    @Nullable
    ResolutionSelector OooO();

    @Nullable
    List OooO00o();

    @NonNull
    ResolutionSelector OooO0OO();

    @Nullable
    Size OooOO0O();

    int OooOOO();

    @Nullable
    Size OooOOOO();

    boolean OooOOOo();

    @Nullable
    Size OooOOo();

    int OooOOo0();

    int OooOo0O();

    @Nullable
    ArrayList OooOoo0();

    int Oooo0();
}
