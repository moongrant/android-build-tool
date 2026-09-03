package p468o0OoooO0;

import android.os.Environment;
import android.os.StatFs;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p450o0Ooo00.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0o0000 {
    public static void OooO00o(@NotNull Function0 memoryEnable) {
        Intrinsics.checkNotNullParameter(memoryEnable, "memoryEnable");
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        o0OO0O0.OooO00o("MemoryUtil", "availableMemory  " + new BigDecimal(availableBlocksLong / ((double) ZegoConstants.ErrorMask.RoomServerErrorMask)).setScale(2, RoundingMode.HALF_UP).doubleValue());
        if (availableBlocksLong > 524288000) {
            memoryEnable.invoke();
        } else {
            o000O00O.OooO0O0(o0000.OooO0OO(OooO.media_memory_not_available));
        }
    }
}
