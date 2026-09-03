package com.squareup.picasso;

import java.io.PrintWriter;

/* JADX INFO: loaded from: classes4.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f21833OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f21834OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f21835OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f21836OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f21837OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f21838OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f21839OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f21840OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f21841OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f21842OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f21843OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f21844OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final long f21845OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f21846OooOOO0;

    public o0Oo0oo(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f21834OooO00o = i;
        this.f21835OooO0O0 = i2;
        this.f21836OooO0OO = j;
        this.f21837OooO0Oo = j2;
        this.f21839OooO0o0 = j3;
        this.f21838OooO0o = j4;
        this.f21840OooO0oO = j5;
        this.f21841OooO0oo = j6;
        this.f21833OooO = j7;
        this.f21842OooOO0 = j8;
        this.f21843OooOO0O = i3;
        this.f21844OooOO0o = i4;
        this.f21846OooOOO0 = i5;
        this.f21845OooOOO = j9;
    }

    public final void OooO00o(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        int i = this.f21834OooO00o;
        printWriter.println(i);
        printWriter.print("  Cache Size: ");
        int i2 = this.f21835OooO0O0;
        printWriter.println(i2);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((i2 / i) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f21836OooO0OO);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f21837OooO0Oo);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f21843OooOO0O);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f21839OooO0o0);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f21841OooO0oo);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f21844OooOO0o);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f21838OooO0o);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f21846OooOOO0);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f21840OooO0oO);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f21833OooO);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f21842OooOO0);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatsSnapshot{maxSize=");
        sb.append(this.f21834OooO00o);
        sb.append(", size=");
        sb.append(this.f21835OooO0O0);
        sb.append(", cacheHits=");
        sb.append(this.f21836OooO0OO);
        sb.append(", cacheMisses=");
        sb.append(this.f21837OooO0Oo);
        sb.append(", downloadCount=");
        sb.append(this.f21843OooOO0O);
        sb.append(", totalDownloadSize=");
        sb.append(this.f21839OooO0o0);
        sb.append(", averageDownloadSize=");
        sb.append(this.f21841OooO0oo);
        sb.append(", totalOriginalBitmapSize=");
        sb.append(this.f21838OooO0o);
        sb.append(", totalTransformedBitmapSize=");
        sb.append(this.f21840OooO0oO);
        sb.append(", averageOriginalBitmapSize=");
        sb.append(this.f21833OooO);
        sb.append(", averageTransformedBitmapSize=");
        sb.append(this.f21842OooOO0);
        sb.append(", originalBitmapCount=");
        sb.append(this.f21844OooOO0o);
        sb.append(", transformedBitmapCount=");
        sb.append(this.f21846OooOOO0);
        sb.append(", timeStamp=");
        return androidx.compose.animation.Oooo000.OooO0OO(sb, this.f21845OooOOO, '}');
    }
}
