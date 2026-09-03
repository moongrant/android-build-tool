package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalFoundationApi
public interface OooO0O0<T> {

    @StabilityInferred(parameters = 1)
    public static final class OooO00o<T> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f5793OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f5794OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final T f5795OooO0OO;

        public OooO00o(int i, int i2, T t) {
            this.f5793OooO00o = i;
            this.f5794OooO0O0 = i2;
            this.f5795OooO0OO = t;
            if (!(i >= 0)) {
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("startIndex should be >= 0, but was ", i).toString());
            }
            if (!(i2 > 0)) {
                throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("size should be >0, but was ", i2).toString());
            }
        }
    }

    @NotNull
    OooO00o<T> get(int i);

    int getSize();
}
