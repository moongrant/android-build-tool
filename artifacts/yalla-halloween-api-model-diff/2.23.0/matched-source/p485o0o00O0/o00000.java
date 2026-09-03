package p485o0o00O0;

import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p022Oooo00O.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 extends Lambda implements Function2<PostDetailHeaderViewTag, Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f47796OooO0Oo;

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
    public o00000(MomentDetailActivity momentDetailActivity) {
        super(2);
        this.f47796OooO0Oo = momentDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(PostDetailHeaderViewTag postDetailHeaderViewTag, Object obj) {
        PostDetailHeaderViewTag tag = postDetailHeaderViewTag;
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (OooO00o.$EnumSwitchMapping$0[tag.ordinal()] == 1) {
            int i = MomentDetailActivity.f26057Oooo0;
            MomentDetailActivity momentDetailActivity = this.f47796OooO0Oo;
            momentDetailActivity.OooOoOO().f59048OooO00o.postDelayed(new o00Ooo(momentDetailActivity, 1), 200L);
        }
        return Unit.INSTANCE;
    }
}
