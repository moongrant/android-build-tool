package androidx.camera.core;

import android.util.Size;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import com.google.auto.value.AutoValue;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p033OoooO0O.o0OOO0o;
import p037OoooOo0.o0000OO0;

/* JADX INFO: loaded from: classes.dex */
public interface SurfaceOutput extends Closeable {

    @AutoValue
    public static abstract class Event {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface EventCode {
        }

        public abstract int OooO00o();

        @NonNull
        public abstract SurfaceOutput OooO0O0();
    }

    void Ooooooo(@NonNull float[] fArr, @NonNull float[] fArr2);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    int getFormat();

    @NonNull
    Size getSize();

    @NonNull
    Surface o0000O0(@NonNull o0OOO0o o0ooo0o2, @NonNull o0000OO0 o0000oo1);
}
