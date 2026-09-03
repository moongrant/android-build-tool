package p289o0O0Oo0;

import com.code.android.util.OooOo00;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.yalla.yalla.model.TagListModel;
import com.yalla.yalla.ui.activity.user.UserInfoTagActivity;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import kotlin.jvm.internal.Intrinsics;
import o0OO0oO0.OooOOO0;
import p338o0OO0oOo.Oooo000;
import p391o0OOooo0.o0Oo0oo;
import p571o0oOoO0.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0Oo implements Continuation, o0Oo0oo.OooO00o, Oooo000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f41524OooO0Oo;

    public /* synthetic */ o000O0Oo(Object obj) {
        this.f41524OooO0Oo = obj;
    }

    @Override // p338o0OO0oOo.Oooo000
    public final void OooO00o(OooOOO0 oooOOO0) {
        MomentDetailCommentFragment.init$lambda$7((MomentDetailCommentFragment) this.f41524OooO0Oo, oooOOO0);
    }

    public final void OooO0O0(TagListModel tagListModel) {
        UserInfoTagActivity this$0 = (UserInfoTagActivity) this.f41524OooO0Oo;
        int i = UserInfoTagActivity.f26868Oooo0O0;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f26873OooOo0O = tagListModel;
        for (TagListModel.TagInfo tagInfo : tagListModel.data1) {
            this$0.f26880OooOooO.put(tagInfo.tagId, tagInfo);
        }
        int size = tagListModel.data.size();
        int i2 = 0;
        while (i2 < size) {
            int[] iArr = this$0.f26877OooOoOO;
            if (i2 < iArr.length) {
                this$0.f26881OooOooo.put(tagListModel.data.get(i2).tagId, Integer.valueOf(iArr[i2 >= iArr.length ? iArr.length - 1 : i2]));
            }
            if (i2 >= iArr.length) {
                tagListModel.data.remove(i2);
            }
            i2++;
        }
        this$0.Oooo000();
        o0000oo<TagListModel.TagType> o0000ooVarOooOoOO = this$0.OooOoOO();
        TagListModel tagListModel2 = this$0.f26873OooOo0O;
        Intrinsics.checkNotNull(tagListModel2);
        o0000ooVarOooOoOO.OooOoO0(tagListModel2.data);
        this$0.OooOoo0().f45729OooO0Oo.setVisibility(0);
        if (OooOo00.OooO00o(this$0.f26879OooOoo0)) {
            this$0.OooOooO(0);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f41524OooO0Oo;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        if (task.getException() == null) {
            return null;
        }
        taskCompletionSource.trySetException(task.getException());
        return null;
    }
}
