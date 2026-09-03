package p538o0o0Oo0;

import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.yalla.model.MomentSendCommentModel;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;
import p542o0o0OoO.o00OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO000 extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostDetailCommentSonListActivity f43963Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(PostDetailCommentSonListActivity postDetailCommentSonListActivity) {
        super(2);
        this.f43963Oooo0o = postDetailCommentSonListActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        if (zBooleanValue) {
            PostDetailCommentSonListActivity postDetailCommentSonListActivity = this.f43963Oooo0o;
            PostDetailCommentSonListActivity.OooO00o oooO00o = PostDetailCommentSonListActivity.f22473o0ooOOo;
            postDetailCommentSonListActivity.Oooo000().f49462OooOO0O.OooO();
            this.f43963Oooo0o.Oooo000().f49461OooOO0.setVisibility(0);
        } else {
            PostDetailCommentSonListActivity postDetailCommentSonListActivity2 = this.f43963Oooo0o;
            PostDetailCommentSonListActivity.OooO00o oooO00o2 = PostDetailCommentSonListActivity.f22473o0ooOOo;
            postDetailCommentSonListActivity2.Oooo000().f49461OooOO0.setVisibility(8);
            this.f43963Oooo0o.Oooo000().f49457OooO0o.setImageResource(R.drawable.icon_emoji);
        }
        PostDetailCommentSonListActivity postDetailCommentSonListActivity3 = this.f43963Oooo0o;
        if (!postDetailCommentSonListActivity3.f22489o00oO0o) {
            if (!zBooleanValue) {
                postDetailCommentSonListActivity3.f22492o0ooOO0 = true;
                String string = postDetailCommentSonListActivity3.Oooo000().f49456OooO0Oo.getText().toString();
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
                if (OooO0OO.OooO00o(string.subSequence(i, length + 1).toString())) {
                    postDetailCommentSonListActivity3.Oooo000().f49456OooO0Oo.setHint(o000O0O0.OooO0OO(R.string.Write_a_comment));
                } else {
                    postDetailCommentSonListActivity3.Oooo0O0().setContent(postDetailCommentSonListActivity3.Oooo0OO());
                    o00OOO0 o00ooo1 = postDetailCommentSonListActivity3.f22478OooooOO;
                    MomentSendCommentModel momentSendCommentModelOooo0O0 = postDetailCommentSonListActivity3.Oooo0O0();
                    Objects.requireNonNull(o00ooo1);
                    MomentSendCommentModel momentSendCommentModel = new MomentSendCommentModel(momentSendCommentModelOooo0O0.getDyid());
                    momentSendCommentModel.setSendPostCommentModel(momentSendCommentModelOooo0O0);
                    o00ooo1.OooO00o(momentSendCommentModel);
                    postDetailCommentSonListActivity3.OooOooO();
                }
            } else if (OooO0OO.OooO00o(postDetailCommentSonListActivity3.Oooo000().f49456OooO0Oo.getText().toString()) && postDetailCommentSonListActivity3.f22492o0ooOO0) {
                postDetailCommentSonListActivity3.Oooo0oo(true);
            }
        }
        return Unit.INSTANCE;
    }
}
