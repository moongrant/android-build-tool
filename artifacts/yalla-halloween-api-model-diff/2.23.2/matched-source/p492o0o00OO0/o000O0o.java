package p492o0o00OO0;

import androidx.media3.session.o0000oo;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o extends Lambda implements Function2<PostDetailHeaderViewTag, Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f49142OooO0Oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PostDetailHeaderViewTag.values().length];
            try {
                iArr[PostDetailHeaderViewTag.PostDetailReply.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(MomentDetailActivity momentDetailActivity) {
        super(2);
        this.f49142OooO0Oo = momentDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(PostDetailHeaderViewTag postDetailHeaderViewTag, Object obj) {
        PostDetailHeaderViewTag tag = postDetailHeaderViewTag;
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (OooO00o.$EnumSwitchMapping$0[tag.ordinal()] == 1) {
            int i = MomentDetailActivity.f25608Oooo0;
            MomentDetailActivity momentDetailActivity = this.f49142OooO0Oo;
            momentDetailActivity.OooOoO().f44927OooO00o.postDelayed(new o0000oo(momentDetailActivity, 2), 200L);
        }
        return Unit.INSTANCE;
    }
}
