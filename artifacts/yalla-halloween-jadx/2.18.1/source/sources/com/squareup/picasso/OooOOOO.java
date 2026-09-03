package com.squareup.picasso;

import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import p420o0Oo0ooO.oO00o00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Downloader f19753OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oO00o00 f19754OooO0O0;

    public static class OooO00o extends IOException {
        public OooO00o() {
            super("Received response with 0 content-length header.");
        }
    }

    public OooOOOO(Downloader downloader, oO00o00 oo00o00) {
        this.f19753OooO00o = downloader;
        this.f19754OooO0O0 = oo00o00;
    }

    @Override // com.squareup.picasso.o0OoOo0
    public final boolean OooO0OO(Oooo0 oooo0) {
        String scheme = oooo0.f19769OooO0Oo.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // com.squareup.picasso.o0OoOo0
    public final o0OoOo0.OooO00o OooO0o(Oooo0 oooo0) throws IOException {
        Downloader.OooO00o OooO00o2 = this.f19753OooO00o.OooO00o(oooo0.f19769OooO0Oo, oooo0.f19768OooO0OO);
        if (OooO00o2 == null) {
            return null;
        }
        Picasso.LoadedFrom loadedFrom = OooO00o2.f19685OooO0O0 ? Picasso.LoadedFrom.DISK : Picasso.LoadedFrom.NETWORK;
        InputStream inputStream = OooO00o2.f19684OooO00o;
        if (inputStream == null) {
            return null;
        }
        if (loadedFrom == Picasso.LoadedFrom.DISK && OooO00o2.f19686OooO0OO == 0) {
            o00oO0o.OooO0OO(inputStream);
            throw new OooO00o();
        }
        if (loadedFrom == Picasso.LoadedFrom.NETWORK) {
            long j = OooO00o2.f19686OooO0OO;
            if (j > 0) {
                oO00o00.OooO00o oooO00o = this.f19754OooO0O0.f39776OooO0O0;
                oooO00o.sendMessage(oooO00o.obtainMessage(4, Long.valueOf(j)));
            }
        }
        return new o0OoOo0.OooO00o(inputStream, loadedFrom);
    }

    @Override // com.squareup.picasso.o0OoOo0
    public final int OooO0o0() {
        return 2;
    }

    @Override // com.squareup.picasso.o0OoOo0
    public final boolean OooO0oO(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
