package p566o0oOo00O;

import android.os.Looper;
import com.app.base.model.UserHeaderFrameModel;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.user.OooO0o;
import com.yalla.yalla.ui.activity.user.UserHeaderFrameActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OOO0O extends o00OO0O0.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameActivity f45279OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f45280OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ UserHeaderFrameModel f45281OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(UserHeaderFrameActivity userHeaderFrameActivity, int i, UserHeaderFrameModel userHeaderFrameModel) {
        super(userHeaderFrameActivity);
        this.f45279OooO00o = userHeaderFrameActivity;
        this.f45280OooO0O0 = i;
        this.f45281OooO0OO = userHeaderFrameModel;
    }

    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onError(@NotNull String code2, @NotNull String message) {
        Intrinsics.checkNotNullParameter(code2, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        super.onError(code2, message);
        this.f45279OooO00o.f23444Ooooo0o = false;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.ArrayList, java.util.List<com.app.base.model.UserHeaderFrameModel>] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.ArrayList, java.util.List<com.app.base.model.UserHeaderFrameModel>] */
    @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
    public final void onFinish(@NotNull String response) {
        Intrinsics.checkNotNullParameter(response, "response");
        super.onFinish(response);
        try {
            try {
                UserHeaderFrameActivity userHeaderFrameActivity = this.f45279OooO00o;
                boolean z = true;
                if (userHeaderFrameActivity.f23446OooooOO >= 0) {
                    int size = userHeaderFrameActivity.f23443Ooooo00.size();
                    UserHeaderFrameActivity userHeaderFrameActivity2 = this.f45279OooO00o;
                    int i = userHeaderFrameActivity2.f23446OooooOO;
                    if (size > i) {
                        UserHeaderFrameModel userHeaderFrameModel = (UserHeaderFrameModel) userHeaderFrameActivity2.f23443Ooooo00.get(i);
                        if (userHeaderFrameModel.getIsweared() == 1) {
                            userHeaderFrameModel.setIsweared(0);
                        }
                    }
                    this.f45279OooO00o.f23446OooooOO = this.f45280OooO0O0;
                    this.f45281OooO0OO.setIsweared(1);
                    ((OooO0o) this.f45279OooO00o.f23448Oooooo.getValue()).notifyItemChanged(this.f45279OooO00o.f23446OooooOO);
                }
                OooOOO.f41216OooO00o.OooO0oO().postValue(this.f45281OooO0OO.getPic());
                this.f45279OooO00o.OooOooO().f49144OooO0Oo.setVisibility(8);
                String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Operation_succeeded);
                ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o0O0ooO runnable = new o0O0ooO(toastUtil, strOooO0OO);
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        runnable.run();
                    } else {
                        o00O000 o00o001 = o00O000.f34346OooO00o;
                        o00O000.f34348OooO0OO.post(runnable);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.f45279OooO00o.f23444Ooooo0o = false;
        }
    }
}
