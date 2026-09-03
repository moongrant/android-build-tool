package p430o0OoOOO0;

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
import p157o00OoOO0.o0OO00O;
import p574o0oOoOOo.oO0Oo0o0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0Oo extends Lambda implements Function1<Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f45768OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f45769OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f45770OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ UserBlackVM f45771OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f45772OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(ArrayList<String> arrayList, o000OO00 o000oo01, PrivateChatVM privateChatVM, UserBlackVM userBlackVM, PrivateChatAdapter privateChatAdapter) {
        super(1);
        this.f45768OooO0Oo = arrayList;
        this.f45770OooO0o0 = o000oo01;
        this.f45769OooO0o = privateChatVM;
        this.f45771OooO0oO = userBlackVM;
        this.f45772OooO0oo = privateChatAdapter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        String str = this.f45768OooO0Oo.get(num.intValue());
        boolean zAreEqual = Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.View_Profile));
        o000OO00 o000oo01 = this.f45770OooO0o0;
        PrivateChatVM privateChatVM = this.f45769OooO0o;
        if (zAreEqual) {
            o000OO00.OooO00o(o000oo01, privateChatVM);
        } else {
            if (Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.message_list_Unpin)) ? true : Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.message_list_Pin))) {
                o0OO000.OooO00o("104004");
                Conversation conversation = o000oo01.f45781OooO0OO;
                if (conversation != null) {
                    ((oO0Oo0o0) o000oo01.f45780OooO0O0.getValue()).getClass();
                    oO0Oo0o0.OooO0OO(conversation);
                }
            } else {
                if (Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.Block)) ? true : Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.Unblock))) {
                    if (privateChatVM.userInfo() != null) {
                        UserBlackVM userBlackVM = this.f45771OooO0oO;
                        if (userBlackVM.getMFriendCheckModel() != null) {
                            o0OO000.OooO00o("104005");
                            UserBlackVM userBlackVM2 = this.f45771OooO0oO;
                            UserInfo userInfo = privateChatVM.userInfo();
                            Intrinsics.checkNotNull(userInfo);
                            long userId = userInfo.getUserId();
                            FriendCheckModel mFriendCheckModel = userBlackVM.getMFriendCheckModel();
                            Intrinsics.checkNotNull(mFriendCheckModel);
                            o000oo01.getClass();
                            String strOooO0OO = o0000.OooO0OO(oO00OOo0.Add_Block_This_User_Title);
                            String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Add_Block_This_User_Content);
                            if (mFriendCheckModel.isBlack) {
                                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Unblock_this_user);
                                strOooO0OO = "";
                            }
                            o0OO00O o0oo00o2 = new o0OO00O(o000oo01.f45779OooO00o);
                            o0oo00o2.OooOoO(strOooO0OO);
                            o0oo00o2.OooOo00(strOooO0OO2);
                            o0oo00o2.OooOOO0().f38476OooO0o0.setMaxLines(12);
                            o0oo00o2.OooOo(true);
                            o0oo00o2.OooOo0(new o000OOo0(o000oo01, userBlackVM2, userId, mFriendCheckModel));
                            o0oo00o2.OooOO0o();
                        }
                    }
                } else if (Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.Report))) {
                    o0OO000.OooO00o("104003");
                    long targetId = privateChatVM.getTargetId();
                    UserInfo userInfo2 = privateChatVM.userInfo();
                    Intrinsics.checkNotNull(userInfo2);
                    o0O0ooO.OooO00o(targetId, this.f45772OooO0oo, null, userInfo2);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
