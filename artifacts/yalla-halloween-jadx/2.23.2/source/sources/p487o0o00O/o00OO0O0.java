package p487o0o00O;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.model.TaskModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p269o00oooo0.o0O0oo0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0O0 extends Lambda implements Function1<List<? extends TaskModel.TaskInfo>, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00OO0O0 f48818OooO0Oo = new o00OO0O0();

    public o00OO0O0() {
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
                    o0O0oo0o.OooO00o().OooOO0o(false);
                    sharedMainMessageManager.getHaveRewardTask().postValue(Boolean.FALSE);
                } else if (i2 > 0) {
                    LiveEventBus.get("SHOW_CLOCK_ANIMATION").post(null);
                    o0O0oo0o.OooO00o().OooOO0o(true);
                    sharedMainMessageManager.getHaveRewardTask().postValue(Boolean.TRUE);
                } else {
                    LiveEventBus.get("SHOW_CLOCK_ICON").post(null);
                    o0O0oo0o.OooO00o().OooOO0o(false);
                    sharedMainMessageManager.getHaveRewardTask().postValue(Boolean.FALSE);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
