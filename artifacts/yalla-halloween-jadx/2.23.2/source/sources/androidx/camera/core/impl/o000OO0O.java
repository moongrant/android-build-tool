package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f3705OooO00o = 0;

    static {
        OooO0o oooO0o = ImageOutputConfig.f3539OooOO0O;
    }

    public static int OooO00o(ImageOutputConfig imageOutputConfig) {
        return ((Integer) imageOutputConfig.OooOoO(ImageOutputConfig.f3542OooOOO0, -1)).intValue();
    }

    @Nullable
    public static ArrayList OooO0O0(ImageOutputConfig imageOutputConfig) {
        List list = (List) imageOutputConfig.OooOoO(ImageOutputConfig.f3548OooOo00, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public static int OooO0OO(ImageOutputConfig imageOutputConfig) {
        return ((Integer) imageOutputConfig.OooOoO(ImageOutputConfig.f3541OooOOO, 0)).intValue();
    }

    public static int OooO0Oo(ImageOutputConfig imageOutputConfig) {
        return ((Integer) imageOutputConfig.OooO0O0(ImageOutputConfig.f3539OooOO0O)).intValue();
    }

    public static void OooO0o(@NonNull ImageOutputConfig imageOutputConfig) {
        boolean zOooOOOo = imageOutputConfig.OooOOOo();
        boolean z = imageOutputConfig.OooOOOO() != null;
        if (zOooOOOo && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (imageOutputConfig.OooO() != null) {
            if (zOooOOOo || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    public static int OooO0o0(ImageOutputConfig imageOutputConfig) {
        return ((Integer) imageOutputConfig.OooOoO(ImageOutputConfig.f3540OooOO0o, 0)).intValue();
    }
}
