package com.squareup.picasso;

import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO extends o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Downloader f21305OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOO0o f21306OooO0O0;

    public static class OooO00o extends IOException {
        public OooO00o() {
            super("Received response with 0 content-length header.");
        }
    }

    public o000oOoO(Downloader downloader, o0OOO0o o0ooo0o2) {
        this.f21305OooO00o = downloader;
        this.f21306OooO0O0 = o0ooo0o2;
    }

    @Override // com.squareup.picasso.o00oO0o
    public final boolean OooO0O0(o00Ooo o00ooo2) {
        String scheme = o00ooo2.f21321OooO0Oo.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.o00oO0o
    public final int OooO0Oo() {
        return 2;
    }

    @Override // com.squareup.picasso.o00oO0o
    public final boolean OooO0o(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // com.squareup.picasso.o00oO0o
    public final o00oO0o.OooO00o OooO0o0(o00Ooo o00ooo2) throws IOException {
        Downloader.OooO00o OooO00o2 = this.f21305OooO00o.OooO00o(o00ooo2.f21321OooO0Oo, o00ooo2.f21320OooO0OO);
        if (OooO00o2 == null) {
            return null;
        }
        Picasso.LoadedFrom loadedFrom = OooO00o2.f21199OooO0O0 ? Picasso.LoadedFrom.DISK : Picasso.LoadedFrom.NETWORK;
        InputStream inputStream = OooO00o2.f21198OooO00o;
        if (inputStream == null) {
            return null;
        }
        Picasso.LoadedFrom loadedFrom2 = Picasso.LoadedFrom.DISK;
        long j = OooO00o2.f21200OooO0OO;
        if (loadedFrom == loadedFrom2 && j == 0) {
            StringBuilder sb = o000000O.f21300OooO00o;
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
            throw new OooO00o();
        }
        if (loadedFrom == Picasso.LoadedFrom.NETWORK && j > 0) {
            o0OOO0o.OooO00o oooO00o = this.f21306OooO0O0.f21347OooO0O0;
            oooO00o.sendMessage(oooO00o.obtainMessage(4, Long.valueOf(j)));
        }
        return new o00oO0o.OooO00o(inputStream, loadedFrom);
    }
}
