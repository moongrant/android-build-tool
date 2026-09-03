package p700oO0Oo;

import android.content.Context;
import android.os.Handler;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.app.base.model.FriendCheckModel;
import com.app.base.view.HeaderLayout;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.emojifaceutil.EmojiEditText;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.common.db.table.Conversation;
import com.yalla.yalla.common.vm.UserBlackVM;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o000O0O0;
import p470o0Oooo0.o00O000;
import p554o0oOOOoo.ooOOOOoo;
import p606o0oo0O.OooOo;
import p649o0ooOOoo.cc;

/* JADX INFO: loaded from: classes2.dex */
public final class o0Oo0oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ HeaderLayout f52908Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ cc f52909Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f52910Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ UserBlackVM f52911Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f52912OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f52913OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0Oo0oo(cc ccVar, oo0o0Oo oo0o0oo, UserBlackVM userBlackVM, HeaderLayout headerLayout, PrivateChatVM privateChatVM, PrivateChatAdapter privateChatAdapter) {
        super(0);
        this.f52909Oooo0o = ccVar;
        this.f52910Oooo0oO = oo0o0oo;
        this.f52911Oooo0oo = userBlackVM;
        this.f52908Oooo = headerLayout;
        this.f52913OoooO00 = privateChatVM;
        this.f52912OoooO0 = privateChatAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws Exception {
        EmojiEditText view = this.f52909Oooo0o.f49097OooO0o0.f49547OooO0O0;
        Intrinsics.checkNotNullExpressionValue(view, "mBinding.messageLayoutChatControl.etMessage");
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        InputMethodManager inputMethodManagerOooO00o = o00O000.OooO00o(context);
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "view.context");
        inputMethodManagerOooO00o.hideSoftInputFromWindow(view.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(context2.getApplicationContext(), new Handler()));
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(o000O0O0.OooO0OO(R.string.View_Profile));
        Conversation conversation = this.f52910Oooo0oO.f52922OooO0OO;
        if (conversation != null) {
            arrayListArrayListOf.add(o000O0O0.OooO0OO(conversation.getTopTime() > 0 ? R.string.message_list_Unpin : R.string.message_list_Pin));
        }
        FriendCheckModel mFriendCheckModel = this.f52911Oooo0oo.getMFriendCheckModel();
        if (mFriendCheckModel != null) {
            if (mFriendCheckModel.isBlack) {
                arrayListArrayListOf.add(o000O0O0.OooO0OO(R.string.Unblock));
            } else {
                arrayListArrayListOf.add(o000O0O0.OooO0OO(R.string.Block));
            }
        }
        arrayListArrayListOf.add(o000O0O0.OooO0OO(R.string.report));
        OooOo.OooO0O0("104002");
        oo0o0Oo oo0o0oo = this.f52910Oooo0oO;
        ooOOOOoo oooooooo = new ooOOOOoo(oo0o0oo.f52920OooO00o, arrayListArrayListOf, new o0OOO0o(arrayListArrayListOf, oo0o0oo, this.f52913OoooO00, this.f52911Oooo0oo, this.f52912OoooO0));
        ImageView anchor = this.f52908Oooo.getF12045o000000O();
        int iOooO00o = OooOo00.OooO00o(-10);
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        oooooooo.OooO00o(anchor, true, iOooO00o);
        return Unit.INSTANCE;
    }
}
