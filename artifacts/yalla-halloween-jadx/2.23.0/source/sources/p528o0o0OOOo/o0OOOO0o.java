package p528o0o0OOOo;

import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p143o00Oo000.OooO0O0;
import p487o0o00O0O.oo000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO0o implements oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53802OooO00o;

    public o0OOOO0o(MomentCommentsVM momentCommentsVM) {
        this.f53802OooO00o = momentCommentsVM;
    }

    @Override // p487o0o00O0O.oo000o
    public final void OooO00o(@NotNull MomentCommentDetailModel data) {
        List<MomentCommentDetailModel> list;
        Intrinsics.checkNotNullParameter(data, "data");
        OooO0O0<MomentCommentDetailModel> commentsPagerState = this.f53802OooO00o.getCommentsPagerState();
        if (commentsPagerState == null || (list = commentsPagerState.f37663OooO0Oo) == null) {
            return;
        }
        list.add(data);
    }

    @Override // p487o0o00O0O.oo000o
    public final void OooO0O0(@NotNull MomentCommentDetailModel data, int i) {
        List<MomentCommentDetailModel> list;
        Intrinsics.checkNotNullParameter(data, "data");
        OooO0O0<MomentCommentDetailModel> commentsPagerState = this.f53802OooO00o.getCommentsPagerState();
        if (commentsPagerState == null || (list = commentsPagerState.f37663OooO0Oo) == null) {
            return;
        }
        list.set(i, data);
    }
}
