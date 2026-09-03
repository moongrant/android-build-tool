package com.amazonaws.auth;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

/* JADX INFO: loaded from: classes2.dex */
class DecodedStreamBuffer {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Log f9055OooO0o = LogFactory.OooO00o(DecodedStreamBuffer.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f9056OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f9057OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f9058OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f9059OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f9060OooO0o0;

    public DecodedStreamBuffer(int i) {
        this.f9056OooO00o = new byte[i];
        this.f9057OooO0O0 = i;
    }
}
