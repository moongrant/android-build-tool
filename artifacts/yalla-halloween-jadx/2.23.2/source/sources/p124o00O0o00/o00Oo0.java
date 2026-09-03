package p124o00O0o00;

import android.graphics.Bitmap;
import android.graphics.Movie;
import android.graphics.Picture;
import android.os.Build;
import coil.transform.PixelOpacity;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.InterruptibleKt;
import o00OO00O.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p123o00O0o0.Oooo0;
import p125o00O0o0O.oo0o0Oo;
import p131o00O0oo0.o000OOo;
import p131o00O0oo0.o0O0O00;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 implements OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000OO f36590OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0O00 f36591OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f36592OooO0OO;

    public static final class OooO00o implements OooOOOO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f36593OooO00o = true;

        @Override // o00O0o00.OooOOOO.OooO00o
        @Nullable
        public final OooOOOO OooO00o(@NotNull oo0o0Oo oo0o0oo, @NotNull o0O0O00 o0o0o00) {
            o0O0o0 o0o0o0OooOOo = oo0o0oo.f36632OooO00o.OooOOo();
            if (o0o0o0OooOOo.Oooo00O(0L, o00O0O.f36583OooO0O0) || o0o0o0OooOOo.Oooo00O(0L, o00O0O.f36582OooO00o)) {
                return new o00Oo0(oo0o0oo.f36632OooO00o, o0o0o00, this.f36593OooO00o);
            }
            return null;
        }

        public final boolean equals(@Nullable Object obj) {
            return obj instanceof OooO00o;
        }

        public final int hashCode() {
            return OooO00o.class.hashCode();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<OooOOO0> {
        public OooO0O0() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00db  */
        @Override // kotlin.jvm.functions.Function0
        public final OooOOO0 invoke() {
            Bitmap.Config config;
            o00Oo0 o00oo1 = o00Oo0.this;
            boolean z = o00oo1.f36592OooO0OO;
            o000OO o000oo2 = o00oo1.f36590OooO00o;
            o0O0o0 o0o0o0OooO0O0 = z ? o0OO.OooO0O0(new o0OoOo0(o000oo2.OooOOo())) : o000oo2.OooOOo();
            try {
                Movie movieDecodeStream = Movie.decodeStream(o0o0o0OooO0O0.o0000OoO());
                CloseableKt.closeFinally(o0o0o0OooO0O0, null);
                if (!(movieDecodeStream != null && movieDecodeStream.width() > 0 && movieDecodeStream.height() > 0)) {
                    throw new IllegalStateException("Failed to decode GIF.".toString());
                }
                boolean zIsOpaque = movieDecodeStream.isOpaque();
                o0O0O00 o0o0o00 = o00oo1.f36591OooO0O0;
                if (zIsOpaque && o0o0o00.f36844OooO0oO) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Build.VERSION.SDK_INT >= 26 && o0o0o00.f36839OooO0O0 == Bitmap.Config.HARDWARE ? Bitmap.Config.ARGB_8888 : o0o0o00.f36839OooO0O0;
                }
                Oooo0 oooo0 = new Oooo0(movieDecodeStream, config, o0o0o00.f36843OooO0o0);
                o000OOo o000ooo2 = o0o0o00.f36848OooOO0o;
                Integer num = (Integer) o000ooo2.OooO00o("coil#repeat_count");
                int iIntValue = num != null ? num.intValue() : -1;
                if (!(iIntValue >= -1)) {
                    throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid repeatCount: ", iIntValue).toString());
                }
                oooo0.f36500OooOo00 = iIntValue;
                Function0 function0 = (Function0) o000ooo2.OooO00o("coil#animation_start_callback");
                Function0 function1 = (Function0) o000ooo2.OooO00o("coil#animation_end_callback");
                if (function0 != null || function1 != null) {
                    oooo0.f36487OooO0oo.add(new OooOOO0(function0, function1));
                }
                o00O.OooO00o oooO00o = (o00O.OooO00o) o000ooo2.OooO00o("coil#animated_transformation");
                oooo0.f36499OooOo0 = oooO00o;
                if (oooO00o != null) {
                    Movie movie = oooo0.f36483OooO0Oo;
                    if (movie.width() <= 0 || movie.height() <= 0) {
                        oooo0.f36501OooOo0O = null;
                        oooo0.f36502OooOo0o = PixelOpacity.UNCHANGED;
                        oooo0.f36498OooOo = false;
                    } else {
                        Picture picture = new Picture();
                        picture.beginRecording(movie.width(), movie.height());
                        oooo0.f36502OooOo0o = oooO00o.OooO00o();
                        picture.endRecording();
                        oooo0.f36501OooOo0O = picture;
                        oooo0.f36498OooOo = true;
                    }
                } else {
                    oooo0.f36501OooOo0O = null;
                    oooo0.f36502OooOo0o = PixelOpacity.UNCHANGED;
                    oooo0.f36498OooOo = false;
                }
                oooo0.invalidateSelf();
                return new OooOOO0(oooo0, false);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(o0o0o0OooO0O0, th);
                    throw th2;
                }
            }
        }
    }

    @JvmOverloads
    public o00Oo0(@NotNull o000OO o000oo2, @NotNull o0O0O00 o0o0o00, boolean z) {
        this.f36590OooO00o = o000oo2;
        this.f36591OooO0O0 = o0o0o00;
        this.f36592OooO0OO = z;
    }

    @Override // p124o00O0o00.OooOOOO
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super OooOOO0> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new OooO0O0(), continuation, 1, null);
    }
}
