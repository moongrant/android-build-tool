package p434o0OoOOOO;

import com.code.android.util.o0000;
import com.yalla.yalla.data.db.table.Conversation;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.FriendCheckModel;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.vm.UserBlackVM;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p205o00o0o0o.o000O;
import p562o0oOo000.o000000;
import p582o0oOoo0.o0000O0O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO00O extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f46941OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f46942OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OO f46943OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserBlackVM f46944OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f46945OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(ArrayList<String> arrayList, o00OO o00oo2, PrivateChatVM privateChatVM, UserBlackVM userBlackVM, PrivateChatAdapter privateChatAdapter) {
        super(1);
        this.f46941OooO0Oo = arrayList;
        this.f46943OooO0o0 = o00oo2;
        this.f46942OooO0o = privateChatVM;
        this.f46944OooO0oO = userBlackVM;
        this.f46945OooO0oo = privateChatAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        String str = this.f46941OooO0Oo.get(num.intValue());
        boolean zAreEqual = Intrinsics.areEqual(str, o0000.OooO0OO(o000000.View_Profile));
        o00OO o00oo2 = this.f46943OooO0o0;
        PrivateChatVM privateChatVM = this.f46942OooO0o;
        if (zAreEqual) {
            o00OO.OooO00o(o00oo2, privateChatVM);
        } else {
            if (Intrinsics.areEqual(str, o0000.OooO0OO(o000000.message_list_Unpin)) ? true : Intrinsics.areEqual(str, o0000.OooO0OO(o000000.message_list_Pin))) {
                OooO00o.OooO0O0("104004");
                Conversation conversation = o00oo2.f46937OooO0OO;
                if (conversation != null) {
                    ((o0000O0O) o00oo2.f46936OooO0O0.getValue()).getClass();
                    o0000O0O.OooO0OO(conversation);
                }
            } else {
                if (Intrinsics.areEqual(str, o0000.OooO0OO(o000000.Block)) ? true : Intrinsics.areEqual(str, o0000.OooO0OO(o000000.Unblock))) {
                    if (privateChatVM.userInfo() != null) {
                        UserBlackVM userBlackVM = this.f46944OooO0oO;
                        if (userBlackVM.getMFriendCheckModel() != null) {
                            OooO00o.OooO0O0("104005");
                            UserBlackVM userBlackVM2 = this.f46944OooO0oO;
                            UserInfo userInfo = privateChatVM.userInfo();
                            Intrinsics.checkNotNull(userInfo);
                            long userId = userInfo.getUserId();
                            FriendCheckModel mFriendCheckModel = userBlackVM.getMFriendCheckModel();
                            Intrinsics.checkNotNull(mFriendCheckModel);
                            o00oo2.getClass();
                            String strOooO0OO = o0000.OooO0OO(o000000.Add_Block_This_User_Title);
                            String strOooO0OO2 = o0000.OooO0OO(o000000.Add_Block_This_User_Content);
                            if (mFriendCheckModel.isBlack) {
                                strOooO0OO2 = o0000.OooO0OO(o000000.Unblock_this_user);
                                strOooO0OO = "";
                            }
                            o000O o000o = new o000O(o00oo2.f46935OooO00o);
                            o000o.OooOoO(strOooO0OO);
                            o000o.OooOo00(strOooO0OO2);
                            o000o.OooOOO0().f39392OooO0o0.setMaxLines(12);
                            o000o.OooOo(true);
                            o000o.OooOo0(new o00OOO00(o00oo2, userBlackVM2, userId, mFriendCheckModel));
                            o000o.OooOO0o();
                        }
                    }
                } else if (Intrinsics.areEqual(str, o0000.OooO0OO(o000000.Report))) {
                    OooO00o.OooO0O0("104003");
                    long targetId = privateChatVM.getTargetId();
                    UserInfo userInfo2 = privateChatVM.userInfo();
                    Intrinsics.checkNotNull(userInfo2);
                    o0o0Oo.OooO00o(targetId, this.f46945OooO0oo, null, userInfo2);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
