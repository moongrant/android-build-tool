package p535o0o0OOoO;

import com.android.billingclient.api.o00000O;
import com.app.base.model.TaskModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO0 extends Lambda implements Function1<List<? extends TaskModel.TaskInfo>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oOO0 f43675Oooo0o = new oOO0();

    public oOO0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends TaskModel.TaskInfo> list) {
        List<? extends TaskModel.TaskInfo> list2 = list;
        if (list2 != null) {
            int i = 0;
            int i2 = 0;
            for (TaskModel.TaskInfo taskInfo : list2) {
                SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
                Boolean value = sharedMainMessageManager.isSignIn().getValue();
                if (value == null || !value.booleanValue()) {
                    break;
                }
                int i3 = taskInfo.state;
                if (i3 == 2) {
                    i++;
                } else if (i3 == 1) {
                    i2++;
                }
                if (i == list2.size()) {
                    LiveEventBus.get("DISMISS_CLOCK_ICON").post(null);
                    o00000O.OooO0O0().OooOOo(false);
                    sharedMainMessageManager.getHaveRewardTask().postValue(Boolean.FALSE);
                } else if (i2 > 0) {
                    LiveEventBus.get("SHOW_CLOCK_ANIMATION").post(null);
                    o00000O.OooO0O0().OooOOo(true);
                    sharedMainMessageManager.getHaveRewardTask().postValue(Boolean.TRUE);
                } else {
                    LiveEventBus.get("SHOW_CLOCK_ICON").post(null);
                    o00000O.OooO0O0().OooOOo(false);
                    sharedMainMessageManager.getHaveRewardTask().postValue(Boolean.FALSE);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
