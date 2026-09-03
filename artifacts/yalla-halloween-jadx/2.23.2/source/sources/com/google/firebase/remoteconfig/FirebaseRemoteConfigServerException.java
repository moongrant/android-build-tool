package com.google.firebase.remoteconfig;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f20031OooO0Oo;

    public FirebaseRemoteConfigServerException(int i, @NonNull String str) {
        super(str);
        this.f20031OooO0Oo = i;
    }

    public FirebaseRemoteConfigServerException(@Nullable FirebaseRemoteConfigServerException firebaseRemoteConfigServerException, int i, @NonNull String str) {
        super(str, firebaseRemoteConfigServerException);
        this.f20031OooO0Oo = i;
    }

    public FirebaseRemoteConfigServerException(@NonNull String str) {
        super(str, 0);
        this.f20031OooO0Oo = -1;
    }

    public FirebaseRemoteConfigServerException(int i, @NonNull String str, int i2) {
        super(str, 0);
        this.f20031OooO0Oo = i;
    }
}
