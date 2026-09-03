package p460o0Ooo0o;

import android.annotation.SuppressLint;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p190o00o0O.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SuppressLint({"SimpleDateFormat"})
@SourceDebugExtension({"SMAP\nCameraFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraFileUtils.kt\ncom/yalla/yalla/module/media/utils/CameraFileUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,240:1\n1#2:241\n*E\n"})
public final class o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f47783OooO00o = LazyKt.lazy(OooO00o.f47784OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<SimpleDateFormat> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47784OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SimpleDateFormat invoke() {
            return new SimpleDateFormat("yyyyMMddHHmmss", Locale.ENGLISH);
        }
    }

    @NotNull
    public static File OooO00o(@NotNull File baseFolder, @NotNull String extension) {
        Intrinsics.checkNotNullParameter(baseFolder, "baseFolder");
        Intrinsics.checkNotNullParameter(extension, "extension");
        return new File(baseFolder, OooOOOO.OooO00o(((SimpleDateFormat) f47783OooO00o.getValue()).format(Long.valueOf(System.currentTimeMillis())), extension));
    }

    public static void OooO0O0(File file, OooO oooO) {
        File[] fileArrListFiles;
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (!Intrinsics.areEqual(file2, file)) {
                if (file2.isDirectory()) {
                    Intrinsics.checkNotNull(file2);
                    OooO0O0(file2, oooO);
                }
                if (oooO == null || !oooO.containsKey(file2.getAbsolutePath())) {
                    file2.delete();
                }
            }
        }
    }

    @NotNull
    public static File OooO0OO() {
        File file = new File(o000O00O.OooO00o().getExternalCacheDir(), "YallaMedia");
        file.mkdirs();
        return file;
    }

    @NotNull
    public static File OooO0Oo() {
        File file = new File(o000O00O.OooO00o().getExternalCacheDir(), "YallaMediaCompress");
        file.mkdirs();
        return file;
    }
}
