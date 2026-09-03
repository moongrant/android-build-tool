package com.squareup.picasso;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public interface Downloader {

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InputStream f19684OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f19685OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f19686OooO0OO;

        public OooO00o(InputStream inputStream, boolean z, long j) {
            if (inputStream == null) {
                throw new IllegalArgumentException("Stream may not be null.");
            }
            this.f19684OooO00o = inputStream;
            this.f19685OooO0O0 = z;
            this.f19686OooO0OO = j;
        }
    }

    public static class ResponseException extends IOException {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final boolean f19687Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final int f19688Oooo0oO;

        public ResponseException(String str, int i, int i2) {
            super(str);
            this.f19687Oooo0o = NetworkPolicy.OooO00o(i);
            this.f19688Oooo0oO = i2;
        }
    }

    OooO00o OooO00o(Uri uri, int i) throws IOException;
}
