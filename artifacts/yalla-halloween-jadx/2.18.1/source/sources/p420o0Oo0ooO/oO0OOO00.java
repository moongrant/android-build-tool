package p420o0Oo0ooO;

import OooO00o.OooO00o;
import Oooo000.o000O0;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0OOO00 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f39794OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f39795OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f39796OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39797OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f39798OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f39799OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f39800OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f39801OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f39802OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f39803OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f39804OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f39805OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final long f39806OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f39807OooOOO0;

    public oO0OOO00(int i, int i2, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, int i3, int i4, int i5, long j9) {
        this.f39795OooO00o = i;
        this.f39796OooO0O0 = i2;
        this.f39797OooO0OO = j;
        this.f39798OooO0Oo = j2;
        this.f39800OooO0o0 = j3;
        this.f39799OooO0o = j4;
        this.f39801OooO0oO = j5;
        this.f39802OooO0oo = j6;
        this.f39794OooO = j7;
        this.f39803OooOO0 = j8;
        this.f39804OooOO0O = i3;
        this.f39805OooOO0o = i4;
        this.f39807OooOOO0 = i5;
        this.f39806OooOOO = j9;
    }

    public final void OooO00o(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f39795OooO00o);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f39796OooO0O0);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((this.f39796OooO0O0 / this.f39795OooO00o) * 100.0f));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f39797OooO0OO);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f39798OooO0Oo);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f39804OooOO0O);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f39800OooO0o0);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f39802OooO0oo);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f39805OooOO0o);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f39799OooO0o);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f39807OooOOO0);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f39801OooO0oO);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f39794OooO);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f39803OooOO0);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("StatsSnapshot{maxSize=");
        sbOooO0o0.append(this.f39795OooO00o);
        sbOooO0o0.append(", size=");
        sbOooO0o0.append(this.f39796OooO0O0);
        sbOooO0o0.append(", cacheHits=");
        sbOooO0o0.append(this.f39797OooO0OO);
        sbOooO0o0.append(", cacheMisses=");
        sbOooO0o0.append(this.f39798OooO0Oo);
        sbOooO0o0.append(", downloadCount=");
        sbOooO0o0.append(this.f39804OooOO0O);
        sbOooO0o0.append(", totalDownloadSize=");
        sbOooO0o0.append(this.f39800OooO0o0);
        sbOooO0o0.append(", averageDownloadSize=");
        sbOooO0o0.append(this.f39802OooO0oo);
        sbOooO0o0.append(", totalOriginalBitmapSize=");
        sbOooO0o0.append(this.f39799OooO0o);
        sbOooO0o0.append(", totalTransformedBitmapSize=");
        sbOooO0o0.append(this.f39801OooO0oO);
        sbOooO0o0.append(", averageOriginalBitmapSize=");
        sbOooO0o0.append(this.f39794OooO);
        sbOooO0o0.append(", averageTransformedBitmapSize=");
        sbOooO0o0.append(this.f39803OooOO0);
        sbOooO0o0.append(", originalBitmapCount=");
        sbOooO0o0.append(this.f39805OooOO0o);
        sbOooO0o0.append(", transformedBitmapCount=");
        sbOooO0o0.append(this.f39807OooOOO0);
        sbOooO0o0.append(", timeStamp=");
        return o000O0.OooO0O0(sbOooO0o0, this.f39806OooOOO, '}');
    }
}
