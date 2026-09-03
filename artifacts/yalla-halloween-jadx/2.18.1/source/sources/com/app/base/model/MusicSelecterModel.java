package com.app.base.model;

import com.app.base.util.Player.Audio;

/* JADX INFO: loaded from: classes.dex */
public class MusicSelecterModel {
    public Audio audio;
    public String fileName;
    public String filePath;
    public boolean select = false;

    public MusicSelecterModel(Audio audio, String str, String str2) {
        this.audio = audio;
        this.fileName = str;
        this.filePath = str2;
    }
}
