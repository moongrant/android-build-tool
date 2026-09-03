package p528o0o0OOOo;

import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p143o00Oo000.OooO0O0;
import p487o0o00O0O.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentCommentDialogComments.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentCommentDialogComments.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentDialogComments$InitObservers$2$onChanged$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
public final class o0OOo000 implements oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ MomentCommentsVM f53803OooO00o;

    public o0OOo000(MomentCommentsVM momentCommentsVM) {
        this.f53803OooO00o = momentCommentsVM;
    }

    @Override // p487o0o00O0O.oo000o
    public final void OooO00o(@NotNull MomentCommentDetailModel data) {
        List<MomentCommentDetailModel> list;
        Object next;
        OooO0O0<MomentCommentDetailModel> commentsPagerState;
        List<MomentCommentDetailModel> list2;
        Intrinsics.checkNotNullParameter(data, "data");
        MomentCommentsVM momentCommentsVM = this.f53803OooO00o;
        OooO0O0<MomentCommentDetailModel> commentsPagerState2 = momentCommentsVM.getCommentsPagerState();
        if (commentsPagerState2 == null || (list = commentsPagerState2.f37663OooO0Oo) == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((MomentCommentDetailModel) next).getLocalId() == data.getLocalId()));
        MomentCommentDetailModel momentCommentDetailModel = (MomentCommentDetailModel) next;
        if (momentCommentDetailModel == null || (commentsPagerState = momentCommentsVM.getCommentsPagerState()) == null || (list2 = commentsPagerState.f37663OooO0Oo) == null) {
            return;
        }
        list2.remove(momentCommentDetailModel);
    }

    @Override // p487o0o00O0O.oo000o
    public final void OooO0O0(@NotNull MomentCommentDetailModel data, int i) {
        Intrinsics.checkNotNullParameter(data, "data");
    }
}
