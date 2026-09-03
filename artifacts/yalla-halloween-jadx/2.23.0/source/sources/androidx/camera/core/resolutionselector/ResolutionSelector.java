package androidx.camera.core.resolutionselector;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ResolutionSelector {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final AspectRatioStrategy f3843OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final ResolutionStrategy f3844OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f3845OooO0OO;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface AllowedResolutionMode {
    }

    public ResolutionSelector(@NonNull AspectRatioStrategy aspectRatioStrategy, @Nullable ResolutionStrategy resolutionStrategy, int i) {
        this.f3843OooO00o = aspectRatioStrategy;
        this.f3844OooO0O0 = resolutionStrategy;
        this.f3845OooO0OO = i;
    }
}
