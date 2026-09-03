package io.agora.rtc.audio;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class VolumeBroadcastReceiver extends BroadcastReceiver {
    private WeakReference<AudioDevice> mAudioDevice;

    public VolumeBroadcastReceiver(AudioDevice audioDevice) {
        this.mAudioDevice = new WeakReference<>(audioDevice);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AudioDevice audioDevice = this.mAudioDevice.get();
        if (audioDevice == null) {
            return;
        }
        audioDevice.notifyPlayoutVolumeChange();
    }
}
