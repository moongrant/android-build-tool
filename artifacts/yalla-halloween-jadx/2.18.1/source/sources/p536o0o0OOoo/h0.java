package p536o0o0OOoo;

import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p522o0o0O0o.o00O0;
import p606o0oo0O.OooOo;
import p700oO0Oo.o000000;

/* JADX INFO: loaded from: classes2.dex */
public final class h0 extends Lambda implements Function2<Integer, MoreModel, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ChatMessage f43793Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43794Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Integer f43795Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ChatMessage chatMessage, PrivateChatActivity privateChatActivity, Integer num) {
        super(2);
        this.f43793Oooo0o = chatMessage;
        this.f43794Oooo0oO = privateChatActivity;
        this.f43795Oooo0oo = num;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, MoreModel moreModel) {
        MoreModel moreModel2 = moreModel;
        Intrinsics.checkNotNull(moreModel2);
        if (moreModel2.getTag() == MoreTag.copy) {
            String message = this.f43793Oooo0o.getMessage();
            PrivateChatActivity privateChatActivity = this.f43794Oooo0oO;
            String string = privateChatActivity.getString(R.string.Copied);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.Copied)");
            o00O0.OooO00o(message, privateChatActivity, string);
        } else if (moreModel2.getTag() == MoreTag.report) {
            OooOo.OooO0O0("104001");
            PrivateChatActivity privateChatActivity2 = this.f43794Oooo0oO;
            PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
            long targetId = privateChatActivity2.Oooo0O0().getTargetId();
            PrivateChatAdapter privateChatAdapterOooo0 = this.f43794Oooo0oO.Oooo0();
            Integer num2 = this.f43795Oooo0oo;
            UserInfo userInfo = this.f43794Oooo0oO.Oooo0O0().userInfo();
            Intrinsics.checkNotNull(userInfo);
            o000000.OooO00o(targetId, privateChatAdapterOooo0, num2, userInfo);
        }
        return Unit.INSTANCE;
    }
}
