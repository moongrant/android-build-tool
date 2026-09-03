package androidx.camera.video;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(21)
public abstract class AudioStats {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Set<Integer> f3876OooO00o = Collections.unmodifiableSet(new HashSet(Arrays.asList(2, 3, 4)));

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface AudioState {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract double OooO00o();

    public abstract int OooO0O0();

    @Nullable
    public abstract Throwable OooO0OO();
}
