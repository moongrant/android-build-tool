package p700oO0Oo;

import com.app.base.model.FriendCheckModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.Conversation;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.vm.UserBlackVM;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p596o0oo0.OooOOO0;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ UserBlackVM f52903Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f52904Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f52905Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f52906Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f52907OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(ArrayList<String> arrayList, oo0o0Oo oo0o0oo, PrivateChatVM privateChatVM, UserBlackVM userBlackVM, PrivateChatAdapter privateChatAdapter) {
        super(1);
        this.f52904Oooo0o = arrayList;
        this.f52905Oooo0oO = oo0o0oo;
        this.f52906Oooo0oo = privateChatVM;
        this.f52903Oooo = userBlackVM;
        this.f52907OoooO00 = privateChatAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        String str = this.f52904Oooo0o.get(num.intValue());
        if (Intrinsics.areEqual(str, o000O0O0.OooO0OO(R.string.View_Profile))) {
            oo0o0Oo.OooO00o(this.f52905Oooo0oO, this.f52906Oooo0oo);
        } else {
            if (Intrinsics.areEqual(str, o000O0O0.OooO0OO(R.string.message_list_Unpin)) ? true : Intrinsics.areEqual(str, o000O0O0.OooO0OO(R.string.message_list_Pin))) {
                OooOo.OooO0O0("104004");
                oo0o0Oo oo0o0oo = this.f52905Oooo0oO;
                Conversation conversation = oo0o0oo.f52922OooO0OO;
                if (conversation != null) {
                    ((OooOOO0) oo0o0oo.f52921OooO0O0.getValue()).OooO0OO(conversation);
                }
            } else {
                if (Intrinsics.areEqual(str, o000O0O0.OooO0OO(R.string.Block)) ? true : Intrinsics.areEqual(str, o000O0O0.OooO0OO(R.string.Unblock))) {
                    if (this.f52906Oooo0oo.userInfo() != null && this.f52903Oooo.getMFriendCheckModel() != null) {
                        OooOo.OooO0O0("104005");
                        oo0o0Oo oo0o0oo2 = this.f52905Oooo0oO;
                        UserBlackVM userBlackVM = this.f52903Oooo;
                        UserInfo userInfo = this.f52906Oooo0oo.userInfo();
                        Intrinsics.checkNotNull(userInfo);
                        long userId = userInfo.getUserId();
                        FriendCheckModel mFriendCheckModel = this.f52903Oooo.getMFriendCheckModel();
                        Intrinsics.checkNotNull(mFriendCheckModel);
                        Objects.requireNonNull(oo0o0oo2);
                        String strOooO0OO = o000O0O0.OooO0OO(R.string.Add_Block_This_User_Title);
                        String strOooO0OO2 = o000O0O0.OooO0OO(R.string.Add_Block_This_User_Content);
                        if (mFriendCheckModel.isBlack) {
                            strOooO0OO2 = o000O0O0.OooO0OO(R.string.Unblock_this_user);
                            strOooO0OO = "";
                        }
                        oo0oOO0 oo0ooo0 = new oo0oOO0(oo0o0oo2.f52920OooO00o);
                        oo0ooo0.OooOooO(strOooO0OO);
                        oo0ooo0.OooOo0O(strOooO0OO2);
                        oo0ooo0.OooOOO().f34400OooO0o0.setMaxLines(12);
                        oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
                        oo0ooo0.OooOo0o(new o0O0O00(oo0o0oo2, userBlackVM, userId, mFriendCheckModel));
                        oo0ooo0.OooOOO0();
                    }
                } else if (Intrinsics.areEqual(str, o000O0O0.OooO0OO(R.string.report))) {
                    OooOo.OooO0O0("104003");
                    long targetId = this.f52906Oooo0oo.getTargetId();
                    PrivateChatAdapter privateChatAdapter = this.f52907OoooO00;
                    UserInfo userInfo2 = this.f52906Oooo0oo.userInfo();
                    Intrinsics.checkNotNull(userInfo2);
                    o000000.OooO00o(targetId, privateChatAdapter, null, userInfo2);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
