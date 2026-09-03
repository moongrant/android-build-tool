package p102o000oo0;

import android.os.StatFs;
import coil.annotation.ExperimentalCoilApi;
import java.io.Closeable;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p659o0oooO00.o0000O0O;
import p659o0oooO00.o000O00O;
import p659o0oooO00.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
public interface OooOO0 {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public o000OO00 f35603OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final o000O00O f35604OooO0O0 = o0000O0O.f60198OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final double f35605OooO0OO = 0.02d;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final long f35606OooO0Oo = 10485760;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f35608OooO0o0 = 262144000;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final CoroutineDispatcher f35607OooO0o = Dispatchers.getIO();

        @NotNull
        public final OooOo00 OooO00o() {
            long jCoerceIn;
            o000OO00 o000oo01 = this.f35603OooO00o;
            if (o000oo01 == null) {
                throw new IllegalStateException("directory == null".toString());
            }
            double d = this.f35605OooO0OO;
            if (d > 0.0d) {
                try {
                    StatFs statFs = new StatFs(o000oo01.OooO0Oo().getAbsolutePath());
                    jCoerceIn = RangesKt.coerceIn((long) (d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f35606OooO0Oo, this.f35608OooO0o0);
                } catch (Exception unused) {
                    jCoerceIn = this.f35606OooO0Oo;
                }
            } else {
                jCoerceIn = 0;
            }
            return new OooOo00(jCoerceIn, o000oo01, this.f35604OooO0O0, this.f35607OooO0o);
        }
    }

    @ExperimentalCoilApi
    public interface OooO0O0 extends Closeable {
        @NotNull
        o000OO00 getData();

        @NotNull
        o000OO00 getMetadata();

        @Nullable
        OooOo00.OooO00o o000000O();
    }

    @NotNull
    o0000O0O OooO00o();

    @ExperimentalCoilApi
    @Nullable
    OooOo00.OooO00o OooO0O0(@NotNull String str);

    @ExperimentalCoilApi
    @Nullable
    OooOo00.OooO0O0 get(@NotNull String str);
}
