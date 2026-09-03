package p043OooooOO;

import android.media.AudioFormat;
import android.media.AudioRecord;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class o0oO0Ooo {
    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    @DoNotInline
    public static AudioRecord OooO00o(@NonNull AudioRecord.Builder builder) {
        return builder.build();
    }

    @NonNull
    @DoNotInline
    public static AudioRecord.Builder OooO0O0() {
        return new AudioRecord.Builder();
    }

    @DoNotInline
    public static void OooO0OO(@NonNull AudioRecord.Builder builder, @NonNull AudioFormat audioFormat) {
        builder.setAudioFormat(audioFormat);
    }

    @DoNotInline
    public static void OooO0Oo(@NonNull AudioRecord.Builder builder, int i) {
        builder.setAudioSource(i);
    }

    @DoNotInline
    public static void OooO0o0(@NonNull AudioRecord.Builder builder, int i) {
        builder.setBufferSizeInBytes(i);
    }
}
