package p542o0o0OoO;

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
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p173o00OooO0.o0o0Oo;
import p254o00ooO0O.o000O0O0;
import p522o0o0O0o.oo0o0O0;
import p538o0o0Oo0.o00O0O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OOO0O extends Lambda implements Function2<Integer, MoreModel, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PostCommentDetailModel f44181Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o00Oo00 f44182Oooo0oO;

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
    public o00OOO0O(PostCommentDetailModel postCommentDetailModel, o00Oo00 o00oo00) {
        super(2);
        this.f44181Oooo0o = postCommentDetailModel;
        this.f44182Oooo0oO = o00oo00;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, MoreModel moreModel) {
        num.intValue();
        MoreModel moreModel2 = moreModel;
        if (moreModel2 == null) {
            return null;
        }
        PostCommentDetailModel postCommentDetailModel = this.f44181Oooo0o;
        o00Oo00 o00oo00 = this.f44182Oooo0oO;
        int i = OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()];
        if (i != 1) {
            if (i == 2) {
                PostDetailCommentSonListActivity postDetailCommentSonListActivity = o00oo00.f44186OooO00o;
                String str = postCommentDetailModel.getId() + "";
                Objects.requireNonNull(postDetailCommentSonListActivity);
                o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
                o00000OO.f32213OooO0oO.OooO00o(postDetailCommentSonListActivity.f22480Oooooo, str, new o00O0O0O(true, postDetailCommentSonListActivity));
            } else if (i == 3) {
                o00oo00.f44186OooO00o.Oooo(postCommentDetailModel.getId() + "");
            } else if (i == 4) {
                o00oo00.f44186OooO00o.Oooo0oo(true);
            }
        } else if (postCommentDetailModel.getContent() != null) {
            TextView textView = new TextView(o00oo00.f44186OooO00o);
            o0o0Oo.OooO0O0(o00oo00.f44186OooO00o, postCommentDetailModel.getContent(), textView, new OooO0O0(postCommentDetailModel, 2));
            oo0o0O0.OooO0o(textView, o00oo00.f44186OooO00o, o000O0O0.OooO0OO(R.string.Copied));
        }
        return Unit.INSTANCE;
    }
}
