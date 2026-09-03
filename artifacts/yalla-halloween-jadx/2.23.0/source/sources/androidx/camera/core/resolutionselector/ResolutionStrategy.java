package androidx.camera.core.resolutionselector;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ResolutionStrategy {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public static final ResolutionStrategy f3846OooO0OO = new ResolutionStrategy();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Size f3847OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f3848OooO0O0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ResolutionFallbackRule {
    }

    public ResolutionStrategy() {
        this.f3847OooO00o = null;
        this.f3848OooO0O0 = 0;
    }

    public ResolutionStrategy(@NonNull Size size) {
        this.f3847OooO00o = null;
        this.f3848OooO0O0 = 0;
        this.f3847OooO00o = size;
        this.f3848OooO0O0 = 1;
    }
}
