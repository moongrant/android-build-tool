package androidx.camera.core;

import android.annotation.SuppressLint;
import android.media.Image;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.nio.ByteBuffer;
import p028Oooo0oO.oo00o;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public interface OooOOO0 extends AutoCloseable {

    public interface OooO00o {
        @NonNull
        ByteBuffer OooO0O0();

        int OooO0OO();

        int OooO0Oo();
    }

    @NonNull
    @SuppressLint({"ArrayReturn"})
    OooO00o[] OooooOo();

    int getFormat();

    int getHeight();

    @Nullable
    @ExperimentalGetImage
    Image getImage();

    int getWidth();

    @NonNull
    oo00o o00000Oo();
}
