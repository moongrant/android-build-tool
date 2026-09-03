package p494o0o00OO0;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.fs.OooO0O0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import o000O000.OooO00o;
import o000O00O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static OooO0O0 f41153OooO00o;

    @NotNull
    public static final File OooO00o(@NotNull Context context, @NotNull String dirName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        File cacheDir = context.getCacheDir();
        Intrinsics.checkNotNullExpressionValue(cacheDir, "context.cacheDir");
        return OooO0O0(cacheDir, dirName);
    }

    @NotNull
    public static final File OooO0O0(@NotNull File parentDir, @NotNull String dirName) {
        Intrinsics.checkNotNullParameter(parentDir, "parentDir");
        Intrinsics.checkNotNullParameter(dirName, "dirName");
        File file = new File(parentDir, dirName);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Nullable
    public static final File OooO0OO(@NotNull Context context, @NotNull String type) {
        File file;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        Object obj = OooO00o.f28085OooO00o;
        File[] fileArrOooO0O0 = OooO00o.OooO0O0.OooO0O0(context, type);
        Intrinsics.checkNotNullExpressionValue(fileArrOooO0O0, "getExternalFilesDirs(context, type)");
        int i = 0;
        int length = fileArrOooO0O0.length;
        while (true) {
            if (i >= length) {
                file = null;
                break;
            }
            file = fileArrOooO0O0[i];
            String strOooO00o = OooOO0.OooO00o(file);
            Intrinsics.checkNotNullExpressionValue(strOooO00o, "getStorageState(it)");
            if (Intrinsics.areEqual(strOooO00o, "mounted")) {
                break;
            }
            i++;
        }
        if (file == null) {
            Log.e("YDirectory", "Can not found available external private path");
        }
        if (file != null && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
