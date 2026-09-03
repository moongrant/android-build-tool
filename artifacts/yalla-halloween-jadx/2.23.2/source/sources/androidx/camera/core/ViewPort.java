package androidx.camera.core;

import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ViewPort {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f3517OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Rational f3518OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f3519OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f3520OooO0Oo;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface LayoutDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface ScaleType {
    }

    public ViewPort(int i, @NonNull Rational rational, int i2, int i3) {
        this.f3517OooO00o = i;
        this.f3518OooO0O0 = rational;
        this.f3519OooO0OO = i2;
        this.f3520OooO0Oo = i3;
    }
}
