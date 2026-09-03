package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseException;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseRemoteConfigException extends FirebaseException {

    public enum Code {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        Code(int i) {
            this.value = i;
        }
    }

    public FirebaseRemoteConfigException(@NonNull String str) {
        super(str);
        Code code = Code.UNKNOWN;
    }

    public FirebaseRemoteConfigException(@NonNull String str, @Nullable Exception exc) {
        super(str, exc);
    }

    public FirebaseRemoteConfigException(@NonNull String str, int i) {
        super(str);
    }

    public FirebaseRemoteConfigException(@Nullable Throwable th) {
        super("Unable to parse config update message.", th);
    }
}
