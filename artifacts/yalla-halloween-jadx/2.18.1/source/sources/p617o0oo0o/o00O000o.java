package p617o0oo0o;

import com.android.billingclient.api.o00000O;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TaskModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O000o {
    public static final void OooO00o(@NotNull Response<List<TaskModel>> it, boolean z) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (!it.getIsSuccess() || it.getData() == null) {
            return;
        }
        List<TaskModel> data = it.getData();
        Intrinsics.checkNotNull(data);
        int i = 0;
        int i2 = 0;
        for (TaskModel taskModel : data) {
            if (taskModel.getState() == 0) {
                i++;
            } else if (taskModel.getState() == 1) {
                i2++;
            }
        }
        if (i == 0 && i2 == 0) {
            SharedMainMessageManager.INSTANCE.getHaveRewardTask().postValue(Boolean.FALSE);
            LiveEventBus.get("DISMISS_CLOCK_ICON").post(Boolean.valueOf(z));
            o00000O.OooO0O0().OooOOo(false);
        } else if (i2 > 0) {
            SharedMainMessageManager.INSTANCE.getHaveRewardTask().postValue(Boolean.TRUE);
            LiveEventBus.get("SHOW_CLOCK_ANIMATION").post(null);
            o00000O.OooO0O0().OooOOo(true);
        } else {
            SharedMainMessageManager.INSTANCE.getHaveRewardTask().postValue(Boolean.FALSE);
            LiveEventBus.get("SHOW_CLOCK_ICON").post(null);
            o00000O.OooO0O0().OooOOo(false);
        }
    }
}
