package com.google.android.exoplayer2.drm;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsupportedDrmException extends Exception {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Reason {
    }

    public UnsupportedDrmException() {
    }

    public UnsupportedDrmException(Exception exc) {
        super(exc);
    }
}
