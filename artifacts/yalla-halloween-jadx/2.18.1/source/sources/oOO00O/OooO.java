package oOO00O;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import p660o0ooo0o0.o00;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends Lambda implements Function0<o0O0ooO.OooO00o> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOO0.OooO00o f52966Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(OooOO0.OooO00o oooO00o) {
        super(0);
        this.f52966Oooo0o = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o0O0ooO.OooO00o invoke() {
        long jCoerceIn;
        o00OO.OooO00o oooO00o = new o00OO.OooO00o();
        Context context = this.f52966Oooo0o.f52980OooO00o;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        File cacheDirectory = new File(context.getCacheDir(), "image_cache");
        cacheDirectory.mkdirs();
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        try {
            StatFs statFs = new StatFs(cacheDirectory.getAbsolutePath());
            jCoerceIn = RangesKt.coerceIn((long) (statFs.getBlockCountLong() * 0.02d * statFs.getBlockSizeLong()), 10485760L, 262144000L);
        } catch (Exception unused) {
            jCoerceIn = 10485760;
        }
        oooO00o.f51359OooOO0O = new o00(cacheDirectory, jCoerceIn);
        o00OO o00oo2 = new o00OO(oooO00o);
        Intrinsics.checkNotNullExpressionValue(o00oo2, "Builder()\n              …\n                .build()");
        return o00oo2;
    }
}
