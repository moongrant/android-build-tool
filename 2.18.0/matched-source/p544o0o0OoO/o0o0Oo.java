package p544o0o0OoO;

import android.widget.TextView;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.model.PostCommentDetailModel;
import com.yalla.yalla.ui.activity.moment.PostDetailCommentSonListActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import o00OOO00.OooO0O0;
import p154o00Oo0oO.o00000OO;
import p154o00Oo0oO.o00oO0o;
import p174o00OooO0.o00OOOO0;
import p255o00ooO0O.o000O0O0;
import p524o0o0O0o.oo0o0O0;
import p540o0o0Oo0.o00O0O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o0o0Oo extends Lambda implements Function2<Integer, MoreModel, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ PostCommentDetailModel f44209Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o0oOO f44210OoooO00;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MoreTag.values().length];
            iArr[MoreTag.copy.ordinal()] = 1;
            iArr[MoreTag.delete.ordinal()] = 2;
            iArr[MoreTag.report.ordinal()] = 3;
            iArr[MoreTag.reply.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0o0Oo(PostCommentDetailModel postCommentDetailModel, o0oOO o0ooo2) {
        super(2);
        this.f44209Oooo = postCommentDetailModel;
        this.f44210OoooO00 = o0ooo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, MoreModel moreModel) {
        num.intValue();
        MoreModel moreModel2 = moreModel;
        if (moreModel2 == null) {
            return null;
        }
        PostCommentDetailModel postCommentDetailModel = this.f44209Oooo;
        o0oOO o0ooo2 = this.f44210OoooO00;
        int i = OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()];
        if (i != 1) {
            if (i == 2) {
                PostDetailCommentSonListActivity postDetailCommentSonListActivity = o0ooo2.f44211OooO00o;
                String str = postCommentDetailModel.getId() + "";
                Objects.requireNonNull(postDetailCommentSonListActivity);
                o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
                o00000OO.f32234OooO0oO.OooO00o(postDetailCommentSonListActivity.f22508o0OoOo0, str, new o00O0O0O(true, postDetailCommentSonListActivity));
            } else if (i == 3) {
                o0ooo2.f44211OooO00o.Oooo(postCommentDetailModel.getId() + "");
            } else if (i == 4) {
                o0ooo2.f44211OooO00o.Oooo0oo(true);
            }
        } else if (postCommentDetailModel.getContent() != null) {
            TextView textView = new TextView(o0ooo2.f44211OooO00o);
            o00OOOO0.OooO0O0(o0ooo2.f44211OooO00o, postCommentDetailModel.getContent(), textView, new OooO0O0(postCommentDetailModel, 2));
            oo0o0O0.OooO0o(textView, o0ooo2.f44211OooO00o, o000O0O0.OooO0OO(R.string.Copied));
        }
        return Unit.INSTANCE;
    }
}
