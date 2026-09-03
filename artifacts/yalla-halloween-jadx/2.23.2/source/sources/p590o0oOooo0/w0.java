package p590o0oOooo0;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.model.SignTaskModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p269o00oooo0.o0O0oo0o;

/* JADX INFO: loaded from: classes4.dex */
public final class w0 {
    public static final void OooO00o(boolean z, @NotNull ApiResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.isSuccess() || it.getData() == null) {
            return;
        }
        Object data = it.getData();
        Intrinsics.checkNotNull(data);
        int i = 0;
        int i2 = 0;
        for (SignTaskModel signTaskModel : (List) data) {
            if (signTaskModel.getState() == 0) {
                i++;
            } else if (signTaskModel.getState() == 1) {
                i2++;
            }
        }
        if (i == 0 && i2 == 0) {
            SharedMainMessageManager.INSTANCE.getHaveRewardTask().postValue(Boolean.FALSE);
            LiveEventBus.get("DISMISS_CLOCK_ICON").post(Boolean.valueOf(z));
            o0O0oo0o.OooO00o().OooOO0o(false);
        } else if (i2 > 0) {
            SharedMainMessageManager.INSTANCE.getHaveRewardTask().postValue(Boolean.TRUE);
            LiveEventBus.get("SHOW_CLOCK_ANIMATION").post(null);
            o0O0oo0o.OooO00o().OooOO0o(true);
        } else {
            SharedMainMessageManager.INSTANCE.getHaveRewardTask().postValue(Boolean.FALSE);
            LiveEventBus.get("SHOW_CLOCK_ICON").post(null);
            o0O0oo0o.OooO00o().OooOO0o(false);
        }
    }
}
