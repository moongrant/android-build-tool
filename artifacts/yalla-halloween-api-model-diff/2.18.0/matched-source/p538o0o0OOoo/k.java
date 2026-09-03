package p538o0o0OOoo;

import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends Lambda implements Function2<Integer, MoreModel, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ FriendRequestMessageActivity f43821Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ long f43822OoooO00;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MoreTag.values().length];
            iArr[MoreTag.delete.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(FriendRequestMessageActivity friendRequestMessageActivity, long j) {
        super(2);
        this.f43821Oooo = friendRequestMessageActivity;
        this.f43822OoooO00 = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, MoreModel moreModel) {
        num.intValue();
        MoreModel moreModel2 = moreModel;
        if (moreModel2 == null) {
            return null;
        }
        FriendRequestMessageActivity friendRequestMessageActivity = this.f43821Oooo;
        long j = this.f43822OoooO00;
        if (OooO00o.$EnumSwitchMapping$0[moreModel2.getTag().ordinal()] == 1) {
            FriendRequestMessageActivity.OooO00o oooO00o = FriendRequestMessageActivity.f22176Oooooo;
            friendRequestMessageActivity.OooOooo().deleteMessage(j);
        }
        return Unit.INSTANCE;
    }
}
