package com.squareup.picasso;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public interface Downloader {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InputStream f21671OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f21672OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f21673OooO0OO;

        public OooO00o(long j, InputStream inputStream, boolean z) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Stream may not be null.");
            }
            this.f21671OooO00o = inputStream;
            this.f21672OooO0O0 = z;
            this.f21673OooO0OO = j;
        }
    }

    public static class ResponseException extends IOException {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f21674OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final int f21675OooO0o0;

        public ResponseException(String str, int i, int i2) {
            super(str);
            this.f21674OooO0Oo = (NetworkPolicy.OFFLINE.index & i) != 0;
            this.f21675OooO0o0 = i2;
        }
    }

    OooO00o OooO00o(Uri uri, int i) throws IOException;
}
