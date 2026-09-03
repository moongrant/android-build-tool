package p493o0o00O0o;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.adapter.postList.PostDetailHeaderViewTag;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class ooOOOOoo extends Lambda implements Function2<PostDetailHeaderViewTag, Object, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentDetailActivity f49384OooO0Oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MomentAdapterTag.values().length];
            try {
                iArr[MomentAdapterTag.PrivateChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PostDetailHeaderViewTag.values().length];
            try {
                iArr2[PostDetailHeaderViewTag.PostDetailContentCompose.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooOOOOoo(MomentDetailActivity momentDetailActivity) {
        super(2);
        this.f49384OooO0Oo = momentDetailActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(PostDetailHeaderViewTag postDetailHeaderViewTag, final Object obj) {
        PostDetailHeaderViewTag tag = postDetailHeaderViewTag;
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (OooO00o.$EnumSwitchMapping$1[tag.ordinal()] == 1) {
            int i = MomentDetailActivity.f25610Oooo0;
            final MomentDetailActivity momentDetailActivity = this.f49384OooO0Oo;
            MomentAdapterTag value = momentDetailActivity.OooOooO().getMomentAdapterTag().getValue();
            if ((value == null ? -1 : OooO00o.$EnumSwitchMapping$0[value.ordinal()]) == 1) {
                momentDetailActivity.OooOoO().f45008OooO00o.postDelayed(new Runnable() { // from class: o0o00O0o.oO000OOo
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() {
                        MomentDetailActivity this$0 = momentDetailActivity;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        PrivateChatVM privateChatVM = (PrivateChatVM) this$0.f25615OooOo0O.getValue();
                        String fromDbMid = this$0.OooOooO().getFromDbMid();
                        MomentDetailModel value2 = this$0.OooOooO().getMPostDetailModel().getValue();
                        Intrinsics.checkNotNull(value2);
                        Object obj2 = obj;
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                        privateChatVM.updateMsgMoment(fromDbMid, value2, (String) obj2);
                        LiveEventBus.get("MOMENT_DETAIL_DATA_REFRESH_FOR_PRIVATE_CHAT").post(this$0.OooOooO().getFromDbMid());
                    }
                }, 500L);
            }
        }
        return Unit.INSTANCE;
    }
}
