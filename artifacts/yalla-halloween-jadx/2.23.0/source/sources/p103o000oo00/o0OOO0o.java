package p103o000oo00;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p104o000oo0O.o00O00O;
import p105o000oo0o.oo0oOO0;
import p109o000ooo.o0OO00O;
import p109o000ooo.o0Oo0oo;
import p321o0O0ooO.o000O0;
import p659o0oooO00.o0000;
import p659o0oooO00.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o implements o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0000OO0 f35703OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f35704OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f35705OooO0OO;

    public static final class OooO00o implements o000oOoO.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final boolean f35706OooO00o = true;

        @Override // o000oo00.o000oOoO.OooO00o
        @Nullable
        public final o000oOoO OooO00o(@NotNull oo0oOO0 oo0ooo0, @NotNull o0Oo0oo o0oo0oo2) {
            o0000 o0000VarOooOOo0 = oo0ooo0.f35800OooO00o.OooOOo0();
            if (o0000VarOooOOo0.Oooo00O(0L, o0ooOOo.f35713OooO0O0) || o0000VarOooOOo0.Oooo00O(0L, o0ooOOo.f35712OooO00o)) {
                return new o0OOO0o(oo0ooo0.f35800OooO00o, o0oo0oo2, this.f35706OooO00o);
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

    public static final class OooO0O0 extends Lambda implements Function0<Oooo000> {
        public OooO0O0() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x00db  */
        @Override // kotlin.jvm.functions.Function0
        public final Oooo000 invoke() {
            Bitmap.Config config;
            o0OOO0o o0ooo0o2 = o0OOO0o.this;
            boolean z = o0ooo0o2.f35705OooO0OO;
            o0000OO0 o0000oo1 = o0ooo0o2.f35703OooO00o;
            o0000 o0000VarOooO0O0 = z ? o000O0Oo.OooO0O0(new o00oO0o(o0000oo1.OooOOo0())) : o0000oo1.OooOOo0();
            try {
                Movie movieDecodeStream = Movie.decodeStream(o0000VarOooO0O0.o0000OoO());
                CloseableKt.closeFinally(o0000VarOooO0O0, null);
                if (!(movieDecodeStream != null && movieDecodeStream.width() > 0 && movieDecodeStream.height() > 0)) {
                    throw new IllegalStateException("Failed to decode GIF.".toString());
                }
                boolean zIsOpaque = movieDecodeStream.isOpaque();
                o0Oo0oo o0oo0oo2 = o0ooo0o2.f35704OooO0O0;
                if (zIsOpaque && o0oo0oo2.f35869OooO0oO) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Build.VERSION.SDK_INT >= 26 && o0oo0oo2.f35864OooO0O0 == Bitmap.Config.HARDWARE ? Bitmap.Config.ARGB_8888 : o0oo0oo2.f35864OooO0O0;
                }
                o00O00O o00o00o2 = new o00O00O(movieDecodeStream, config, o0oo0oo2.f35868OooO0o0);
                o0OO00O o0oo00o2 = o0oo0oo2.f35873OooOO0o;
                Integer num = (Integer) o0oo00o2.OooO00o("coil#repeat_count");
                int iIntValue = num != null ? num.intValue() : -1;
                if (!(iIntValue >= -1)) {
                    throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("Invalid repeatCount: ", iIntValue).toString());
                }
                o00o00o2.f35757OooOo00 = iIntValue;
                Function0 function0 = (Function0) o0oo00o2.OooO00o("coil#animation_start_callback");
                Function0 function1 = (Function0) o0oo00o2.OooO00o("coil#animation_end_callback");
                if (function0 != null || function1 != null) {
                    o00o00o2.f35744OooO0oo.add(new o000O0(function0, function1));
                }
                o00.OooO00o oooO00o = (o00.OooO00o) o0oo00o2.OooO00o("coil#animated_transformation");
                o00o00o2.f35756OooOo0 = oooO00o;
                if (oooO00o != null) {
                    Movie movie = o00o00o2.f35740OooO0Oo;
                    if (movie.width() <= 0 || movie.height() <= 0) {
                        o00o00o2.f35758OooOo0O = null;
                        o00o00o2.f35759OooOo0o = PixelOpacity.UNCHANGED;
                        o00o00o2.f35755OooOo = false;
                    } else {
                        Picture picture = new Picture();
                        picture.beginRecording(movie.width(), movie.height());
                        o00o00o2.f35759OooOo0o = oooO00o.OooO00o();
                        picture.endRecording();
                        o00o00o2.f35758OooOo0O = picture;
                        o00o00o2.f35755OooOo = true;
                    }
                } else {
                    o00o00o2.f35758OooOo0O = null;
                    o00o00o2.f35759OooOo0o = PixelOpacity.UNCHANGED;
                    o00o00o2.f35755OooOo = false;
                }
                o00o00o2.invalidateSelf();
                return new Oooo000(o00o00o2, false);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(o0000VarOooO0O0, th);
                    throw th2;
                }
            }
        }
    }

    @JvmOverloads
    public o0OOO0o(@NotNull o0000OO0 o0000oo1, @NotNull o0Oo0oo o0oo0oo2, boolean z) {
        this.f35703OooO00o = o0000oo1;
        this.f35704OooO0O0 = o0oo0oo2;
        this.f35705OooO0OO = z;
    }

    @Override // p103o000oo00.o000oOoO
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super Oooo000> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new OooO0O0(), continuation, 1, null);
    }
}
