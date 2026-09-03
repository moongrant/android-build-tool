package com.amazonaws.internal;

import com.amazonaws.AbortedException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class SdkInputStream extends InputStream {
    public final void OooO00o() {
        if (Thread.interrupted()) {
            throw new AbortedException();
        }
    }
}
