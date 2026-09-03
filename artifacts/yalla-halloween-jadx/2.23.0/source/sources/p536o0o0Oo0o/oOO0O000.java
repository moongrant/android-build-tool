package p536o0o0Oo0o;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.jvm.internal.Intrinsics;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0O000 implements Observer<MomentSendModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55194OooO0Oo;

    public oOO0O000(MomentUserListVM momentUserListVM) {
        this.f55194OooO0Oo = momentUserListVM;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MomentSendModel momentSendModel) {
        MomentSendModel it = momentSendModel;
        Intrinsics.checkNotNullParameter(it, "it");
        OooOOO0.OooO0O0("动态任务 发送成功 刷新 taskModel = " + it);
        this.f55194OooO0Oo.postSendSuccess(it);
    }
}
