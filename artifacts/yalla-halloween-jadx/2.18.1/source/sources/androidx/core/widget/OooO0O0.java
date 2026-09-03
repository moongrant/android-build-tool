package androidx.core.widget;

import android.os.Build;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final boolean f8010OooO0OO;

    static {
        f8010OooO0OO = Build.VERSION.SDK_INT >= 27;
    }
}
