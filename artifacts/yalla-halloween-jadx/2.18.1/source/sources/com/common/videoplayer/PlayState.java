package com.common.videoplayer;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/common/videoplayer/PlayState;", "", "Prepare", "Playing", "Pause", "Stop", "VideoPlayer_release"}, k = 1, mv = {1, 5, 1})
public enum PlayState {
    Prepare,
    Playing,
    Pause,
    Stop;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static PlayState[] valuesCustom() {
        PlayState[] playStateArrValuesCustom = values();
        return (PlayState[]) Arrays.copyOf(playStateArrValuesCustom, playStateArrValuesCustom.length);
    }
}
