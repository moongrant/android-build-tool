package p011OooOo0;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooOO0<I, O> {

    public static final class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final T f283OooO00o;

        public OooO00o(T t) {
            this.f283OooO00o = t;
        }
    }

    @NotNull
    public abstract Intent createIntent(@NotNull Context context, I i);

    @Nullable
    public OooO00o<O> getSynchronousResult(@NotNull Context context, I i) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }

    public abstract O parseResult(int i, @Nullable Intent intent);
}
