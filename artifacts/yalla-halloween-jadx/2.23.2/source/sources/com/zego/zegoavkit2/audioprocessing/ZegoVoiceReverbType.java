package com.zego.zegoavkit2.audioprocessing;

/* JADX INFO: loaded from: classes4.dex */
public enum ZegoVoiceReverbType {
    OFF(0),
    SOFT_ROOM(1),
    WARM_CLUB(2),
    CONCERT_HALL(3),
    LARGE_AUDITORIUM(4),
    RECORDING_STUDIO(5),
    BASEMENT(6),
    KTV(7),
    POPULAR(8),
    ROCK(9),
    VOCAL_CONCERT(10),
    HIPHOP(11),
    MISTY(12),
    THREE_DIMENSIONAL_VOICE(13),
    GRAMOPHONE(14);

    private int mCode;

    ZegoVoiceReverbType(int i) {
        this.mCode = i;
    }

    public int getCode() {
        return this.mCode;
    }
}
