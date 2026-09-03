package p538o0o0Oo0;

import android.view.View;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.model.MomentSendCommentModel;
import com.yalla.yalla.model.PostCommentSonModel;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p168o00Ooo0.o0OoOo0;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentSonListActivity f43941Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O(PostDetailCommentSonListActivity postDetailCommentSonListActivity) {
        super(1);
        this.f43941Oooo0o = postDetailCommentSonListActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        PostDetailCommentSonListActivity postDetailCommentSonListActivity = this.f43941Oooo0o;
        PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
        String string = postDetailCommentSonListActivity.Oooo000().f49456OooO0Oo.getText().toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        if (Intrinsics.areEqual("", string.subSequence(i, length + 1).toString())) {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.please_input_dynamic));
        } else if (o0OoOo0.OooO0o0(postDetailCommentSonListActivity.Oooo000().f49456OooO0Oo) > 500) {
            ToastUtil.f12567OooO00o.OooO0O0(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.char_room_text_lenght), "500"));
        } else if (o0OoOo0.OooO0Oo(postDetailCommentSonListActivity.Oooo000().f49456OooO0Oo) > 50) {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.char_room_edit1));
        } else {
            postDetailCommentSonListActivity.Oooo0O0().setContent(postDetailCommentSonListActivity.Oooo0OO());
            postDetailCommentSonListActivity.OooOooo().getData();
            MomentSendCommentModel sendPostCommentModel = postDetailCommentSonListActivity.Oooo0O0();
            o00OOO00 o00ooo01 = new o00OOO00(postDetailCommentSonListActivity);
            Intrinsics.checkNotNullParameter(sendPostCommentModel, "sendPostCommentModel");
            PostCommentSonModel postCommentSonModel = new PostCommentSonModel();
            if (sendPostCommentModel.getLocalId() <= 0) {
                sendPostCommentModel.setLocalId(System.currentTimeMillis());
            }
            postCommentSonModel.setLocalPostCommentReplyModel(sendPostCommentModel);
            o00ooo01.invoke(postCommentSonModel, 0);
        }
        return Unit.INSTANCE;
    }
}
