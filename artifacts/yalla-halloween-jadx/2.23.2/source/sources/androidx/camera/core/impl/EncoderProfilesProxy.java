package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.auto.value.AutoValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface EncoderProfilesProxy {

    @AutoValue
    public static abstract class AudioProfileProxy {

        @Retention(RetentionPolicy.SOURCE)
        public @interface AudioEncoder {
        }

        public abstract int OooO00o();

        public abstract int OooO0O0();

        public abstract int OooO0OO();

        @NonNull
        public abstract String OooO0Oo();

        public abstract int OooO0o();

        public abstract int OooO0o0();
    }

    @AutoValue
    public static abstract class OooO00o implements EncoderProfilesProxy {
        @NonNull
        public static OooOO0 OooO0o0(int i, int i2, @NonNull List list, @NonNull ArrayList arrayList) {
            return new OooOO0(i, i2, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(arrayList)));
        }
    }

    @AutoValue
    public static abstract class VideoProfileProxy {

        @Retention(RetentionPolicy.SOURCE)
        public @interface VideoEncoder {
        }

        @NonNull
        public static OooOO0O OooO00o(int i, @NonNull String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            return new OooOO0O(i, str, i2, i3, i4, i5, i6, i7, i8, i9);
        }

        @NonNull
        public abstract String OooO();

        public abstract int OooO0O0();

        public abstract int OooO0OO();

        public abstract int OooO0Oo();

        public abstract int OooO0o();

        public abstract int OooO0o0();

        public abstract int OooO0oO();

        public abstract int OooO0oo();

        public abstract int OooOO0();

        public abstract int OooOO0O();
    }

    int OooO00o();

    @NonNull
    List<VideoProfileProxy> OooO0O0();

    int OooO0OO();

    @NonNull
    List<AudioProfileProxy> OooO0Oo();
}
