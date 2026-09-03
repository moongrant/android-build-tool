package p510o0o00ooo;

import androidx.lifecycle.Observer;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentSendCommentModel;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p188o00o00oO.o000;
import p493o0o00OOO.Oooo000;
import p535o0o0Oo0.o0O0O0O;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w4 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f50897OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f50898OooO0o0;

    public /* synthetic */ w4(Object obj, int i) {
        this.f50897OooO0Oo = i;
        this.f50898OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f50897OooO0Oo;
        Object obj2 = this.f50898OooO0o0;
        switch (i) {
            case 0:
                y4 this$0 = (y4) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                CollectionsKt.removeAll((List) this$0.f50901OooO0OO, (Function1) new y4.OooO0O0(obj));
                break;
            default:
                MomentCommentsVM vm = (MomentCommentsVM) obj2;
                MomentSendCommentModel sendComment = (MomentSendCommentModel) obj;
                Intrinsics.checkNotNullParameter(vm, "$vm");
                Intrinsics.checkNotNullParameter(sendComment, "sendComment");
                o000<MomentCommentDetailModel> commentsPagerState = vm.getCommentsPagerState();
                Oooo000.OooO00o(commentsPagerState != null ? commentsPagerState.f38497OooO0Oo : null, sendComment, new o0O0O0O.OooOOO0(vm));
                break;
        }
    }
}
