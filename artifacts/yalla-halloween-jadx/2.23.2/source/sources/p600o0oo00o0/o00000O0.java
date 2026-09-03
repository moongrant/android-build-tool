package p600o0oo00o0;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final List<String> f57367OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final List<String> f57368OooO00o = CollectionsKt.mutableListOf("android.permission.RECORD_AUDIO");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final List<String> f57369OooO0O0 = CollectionsKt.mutableListOf("android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final List<String> f57370OooO0OO = CollectionsKt.mutableListOf("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final List<String> f57371OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final List<String> f57372OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final List<String> f57373OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final List<String> f57374OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final List<String> f57375OooO0oo;

    static {
        int i = Build.VERSION.SDK_INT;
        f57371OooO0Oo = i < 33 ? CollectionsKt.mutableListOf("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE") : CollectionsKt.mutableListOf("android.permission.READ_MEDIA_AUDIO");
        f57373OooO0o0 = i < 33 ? CollectionsKt.mutableListOf("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE") : CollectionsKt.mutableListOf("android.permission.READ_MEDIA_IMAGES");
        f57372OooO0o = i < 33 ? CollectionsKt.mutableListOf("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE") : CollectionsKt.mutableListOf("android.permission.READ_MEDIA_VIDEO");
        f57374OooO0oO = i < 33 ? CollectionsKt.mutableListOf("android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE") : CollectionsKt.mutableListOf("android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO");
        f57375OooO0oo = i < 33 ? CollectionsKt.mutableListOf("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE") : CollectionsKt.mutableListOf("android.permission.CAMERA", "android.permission.READ_MEDIA_IMAGES");
        f57367OooO = i < 33 ? CollectionsKt.mutableListOf("android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE") : CollectionsKt.mutableListOf("android.permission.CAMERA", "android.permission.RECORD_AUDIO");
    }
}
