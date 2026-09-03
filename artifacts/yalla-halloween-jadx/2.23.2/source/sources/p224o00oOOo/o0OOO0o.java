package p224o00oOOo;

import android.os.StatFs;
import coil.annotation.ExperimentalCoilApi;
import java.io.Closeable;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p662o0oooO0O.o0OO000;
import p662o0oooO0O.o0OO0o00;
import p662o0oooO0O.o0OOOO00;

/* JADX INFO: loaded from: classes2.dex */
public interface o0OOO0o {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public o0OOOO00 f39670OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final o0OO0o00 f39671OooO0O0 = o0OO000.f59771OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final double f39672OooO0OO = 0.02d;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f39673OooO0Oo = 10485760;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f39675OooO0o0 = 262144000;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final CoroutineDispatcher f39674OooO0o = Dispatchers.getIO();

        @NotNull
        public final o000OOo OooO00o() {
            long jCoerceIn;
            o0OOOO00 o0oooo01 = this.f39670OooO00o;
            if (o0oooo01 == null) {
                throw new IllegalStateException("directory == null".toString());
            }
            double d = this.f39672OooO0OO;
            if (d > 0.0d) {
                try {
                    StatFs statFs = new StatFs(o0oooo01.OooO0Oo().getAbsolutePath());
                    jCoerceIn = RangesKt.coerceIn((long) (d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f39673OooO0Oo, this.f39675OooO0o0);
                } catch (Exception unused) {
                    jCoerceIn = this.f39673OooO0Oo;
                }
            } else {
                jCoerceIn = 0;
            }
            return new o000OOo(jCoerceIn, o0oooo01, this.f39671OooO0O0, this.f39674OooO0o);
        }
    }

    @ExperimentalCoilApi
    public interface OooO0O0 extends Closeable {
        @NotNull
        o0OOOO00 getData();

        @NotNull
        o0OOOO00 getMetadata();

        @Nullable
        o000OOo.OooO00o o00000();
    }

    @NotNull
    o0OO000 OooO00o();

    @ExperimentalCoilApi
    @Nullable
    o000OOo.OooO00o OooO0O0(@NotNull String str);

    @ExperimentalCoilApi
    @Nullable
    o000OOo.OooO0O0 get(@NotNull String str);
}
