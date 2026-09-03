package io.agora.rtc.audio;

import com.uc.crashsdk.export.LogType;

/* JADX INFO: loaded from: classes3.dex */
public class AudioRecordingConfiguration {
    public String filePath;
    public int recordingChannel;
    public int recordingPosition;
    public int recordingQuality;
    public int recordingSampleRate;

    public AudioRecordingConfiguration() {
        this.recordingQuality = 1;
        this.recordingPosition = 0;
        this.recordingSampleRate = LogType.UNEXP_KNOWN_REASON;
        this.recordingChannel = 1;
    }

    public AudioRecordingConfiguration(String str, int i, int i2, int i3, int i4) {
        this.filePath = str;
        this.recordingQuality = i;
        this.recordingPosition = i2;
        this.recordingSampleRate = i3;
        this.recordingChannel = i4;
    }
}
