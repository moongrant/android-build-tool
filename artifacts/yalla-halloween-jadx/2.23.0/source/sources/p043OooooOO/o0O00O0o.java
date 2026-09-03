package p043OooooOO;

import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class o0O00O0o {
    @Nullable
    @DoNotInline
    public static AudioRecordingConfiguration OooO00o(@NonNull AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    @DoNotInline
    public static boolean OooO0O0(@NonNull AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    @DoNotInline
    public static void OooO0OO(@NonNull AudioRecord audioRecord, @NonNull Executor executor, @NonNull AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback) {
        audioRecord.registerAudioRecordingCallback(executor, audioManager$AudioRecordingCallback);
    }

    @DoNotInline
    public static void OooO0Oo(@NonNull AudioRecord audioRecord, @NonNull AudioManager$AudioRecordingCallback audioManager$AudioRecordingCallback) {
        audioRecord.unregisterAudioRecordingCallback(audioManager$AudioRecordingCallback);
    }
}
