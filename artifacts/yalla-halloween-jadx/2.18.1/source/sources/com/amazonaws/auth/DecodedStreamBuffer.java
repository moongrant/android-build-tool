package com.amazonaws.auth;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

/* JADX INFO: loaded from: classes.dex */
class DecodedStreamBuffer {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Log f10360OooO0o = LogFactory.OooO00o(DecodedStreamBuffer.class);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public byte[] f10361OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f10362OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f10363OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f10364OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f10365OooO0o0;

    public DecodedStreamBuffer(int i) {
        this.f10361OooO00o = new byte[i];
        this.f10362OooO0O0 = i;
    }
}
