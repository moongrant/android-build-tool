package p103o000oo00;

import coil.decode.ExifOrientationPolicy;
import com.common.support.imagepicker.dataprovider.utils.MediaUtils;
import java.util.Set;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Set<String> f35700OooO00o = SetsKt.setOf((Object[]) new String[]{"image/jpeg", MediaUtils.IMAGE_WEBP, MediaUtils.IMAGE_HEIC, MediaUtils.IMAGE_HEIF});

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExifOrientationPolicy.values().length];
            iArr[ExifOrientationPolicy.RESPECT_PERFORMANCE.ordinal()] = 1;
            iArr[ExifOrientationPolicy.IGNORE.ordinal()] = 2;
            iArr[ExifOrientationPolicy.RESPECT_ALL.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
