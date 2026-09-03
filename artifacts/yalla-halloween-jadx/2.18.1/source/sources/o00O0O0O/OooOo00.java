package o00O0O0O;

import coil.size.PixelSize;
import coil.size.Size;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p119o00O0Oo0.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends OooOO0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static volatile int f30497OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOo00 f30495OooO00o = new OooOo00();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final File f30496OooO0O0 = new File("/proc/self/fd");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile boolean f30498OooO0Oo = true;

    @Override // o00O0O0O.OooOO0O
    public final boolean OooO00o(@NotNull Size size, @Nullable o0OO00O o0oo00o2) {
        boolean z;
        Intrinsics.checkNotNullParameter(size, "size");
        if (size instanceof PixelSize) {
            PixelSize pixelSize = (PixelSize) size;
            if (pixelSize.f9946Oooo0o < 75 || pixelSize.f9947Oooo0oO < 75) {
                return false;
            }
        }
        synchronized (this) {
            int i = f30497OooO0OO;
            f30497OooO0OO = i + 1;
            if (i >= 50) {
                f30497OooO0OO = 0;
                String[] list = f30496OooO0O0.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                f30498OooO0Oo = length < 750;
                if (!f30498OooO0Oo && o0oo00o2 != null && o0oo00o2.getLevel() <= 5) {
                    Intrinsics.stringPlus("Unable to allocate more hardware bitmaps. Number of used file descriptors: ", Integer.valueOf(length));
                    o0oo00o2.OooO00o();
                }
            }
            z = f30498OooO0Oo;
        }
        return z;
    }
}
