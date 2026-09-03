package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.o00000OO;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0o f3993OooO00o = new OooO0o(0, OooO00o.INACTIVE, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Set<Integer> f3994OooO0O0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o00000OO f3995OooO0OO = new o00000OO(new OooO0o(0, OooO00o.ACTIVE, null));

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public enum OooO00o {
        ACTIVE,
        INACTIVE
    }

    public abstract int OooO00o();

    @Nullable
    public abstract SurfaceRequest.OooO0OO OooO0O0();

    @NonNull
    public abstract OooO00o OooO0OO();
}
