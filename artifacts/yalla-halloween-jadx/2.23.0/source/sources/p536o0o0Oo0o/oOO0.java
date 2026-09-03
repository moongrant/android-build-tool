package p536o0o0Oo0o;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oOO0 implements Observer<MomentSendModel> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55177OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LazyListState f55178OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f55179OooO0o0;

    public oOO0(MomentUserListVM momentUserListVM, CoroutineScope coroutineScope, LazyListState lazyListState) {
        this.f55177OooO0Oo = momentUserListVM;
        this.f55179OooO0o0 = coroutineScope;
        this.f55178OooO0o = lazyListState;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MomentSendModel momentSendModel) {
        MomentSendModel it = momentSendModel;
        Intrinsics.checkNotNullParameter(it, "it");
        OooOOO0.OooO0O0("动态任务 新增 刷新 " + it.getType() + ",data is==>" + it);
        if (it.getType() == MomentType.Video.getValue()) {
            this.f55177OooO0Oo.setRefreshTrigger(Boolean.FALSE);
        }
        BuildersKt__Builders_commonKt.launch$default(this.f55179OooO0o0, null, null, new ooooO000(this.f55178OooO0o, null), 3, null);
    }
}
