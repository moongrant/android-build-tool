package com.google.firebase.heartbeatinfo;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public interface HeartBeatInfo {

    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* JADX INFO: renamed from: code, reason: collision with root package name */
        private final int f19112code;

        HeartBeat(int i) {
            this.f19112code = i;
        }

        public final int OooO00o() {
            return this.f19112code;
        }
    }

    @NonNull
    HeartBeat OooO0O0();
}
