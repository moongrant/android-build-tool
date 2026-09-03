package p037OoooOo0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.OooOOO0;
import androidx.camera.core.impl.o00Oo0;
import com.google.auto.value.AutoValue;
import org.conscrypt.PSKKeyManager;
import p031OoooO0.o00O0O;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
@RequiresApi(api = 21)
public abstract class o000O00<T> {
    @NonNull
    public static o00000 OooO(@NonNull OooOOO0 oooOOO0, @Nullable o00O0O o00o0o2, @NonNull Size size, @NonNull Rect rect, int i, @NonNull Matrix matrix, @NonNull o00Oo0 o00oo1) {
        if (oooOOO0.getFormat() == 256) {
            o000OO.OooOOO0.OooO0o0(o00o0o2, "JPEG image must have Exif.");
        }
        return new o00000(oooOOO0, o00o0o2, oooOOO0.getFormat(), size, rect, i, matrix, o00oo1);
    }

    @NonNull
    public static o00000 OooOO0(@NonNull byte[] bArr, @NonNull o00O0O o00o0o2, @NonNull Size size, @NonNull Rect rect, int i, @NonNull Matrix matrix, @NonNull o00Oo0 o00oo1) {
        return new o00000(bArr, o00o0o2, PSKKeyManager.MAX_KEY_LENGTH_BYTES, size, rect, i, matrix, o00oo1);
    }

    @NonNull
    public abstract o00Oo0 OooO00o();

    @NonNull
    public abstract Rect OooO0O0();

    @NonNull
    public abstract T OooO0OO();

    @Nullable
    public abstract o00O0O OooO0Oo();

    public abstract int OooO0o();

    public abstract int OooO0o0();

    @NonNull
    public abstract Matrix OooO0oO();

    @NonNull
    public abstract Size OooO0oo();
}
