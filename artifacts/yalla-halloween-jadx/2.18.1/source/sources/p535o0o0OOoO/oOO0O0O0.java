package p535o0o0OOoO;

import androidx.lifecycle.LiveData;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.vm.main.TaskViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p142o00OOooO.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class oOO0O0O0 extends Lambda implements Function3<String, OpenAuthManager.AuthType, String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ TaskActivity f43700Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0O0O0(TaskActivity taskActivity) {
        super(3);
        this.f43700Oooo0o = taskActivity;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(String str, OpenAuthManager.AuthType authType, String str2) {
        String str3 = str;
        TaskActivity.OooOoo(this.f43700Oooo0o).show();
        TaskViewModel taskViewModelOooo00O = this.f43700Oooo0o.Oooo00O();
        Intrinsics.checkNotNull(str3);
        LiveData<ApiResult<String>> liveDataYallaChatBindTask = taskViewModelOooo00O.yallaChatBindTask(str3);
        TaskActivity taskActivity = this.f43700Oooo0o;
        liveDataYallaChatBindTask.observe(taskActivity, new o0OOO0o(taskActivity, 3));
        return Unit.INSTANCE;
    }
}
