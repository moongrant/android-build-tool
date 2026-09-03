package p430o0OoOOO0;

import android.content.Context;
import android.os.Handler;
import android.widget.ImageView;
import androidx.compose.runtime.MutableState;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.yalla.support.emojifaceutil.EmojiEditText;
import com.yalla.yalla.data.db.table.Conversation;
import com.yalla.yalla.model.FriendCheckModel;
import com.yalla.yalla.ui.activity.message.Oooo000;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.UserBlackVM;
import com.yalla.yalla.ui.vm.message.PrivateChatVM;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p367o0OOo0o0.OooOO0O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO0O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f45784OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Oooo000> f45785OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ UserBlackVM f45786OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f45787OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ HeaderLayout f45788OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f45789OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(MutableState mutableState, o000OO00 o000oo01, PrivateChatAdapter privateChatAdapter, HeaderLayout headerLayout, UserBlackVM userBlackVM, PrivateChatVM privateChatVM) {
        super(0);
        this.f45785OooO0Oo = mutableState;
        this.f45787OooO0o0 = o000oo01;
        this.f45786OooO0o = userBlackVM;
        this.f45788OooO0oO = headerLayout;
        this.f45789OooO0oo = privateChatVM;
        this.f45784OooO = privateChatAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EmojiEditText view = this.f45785OooO0Oo.getValue().OooO00o();
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        OooOO0O.OooO00o(view.getContext().getApplicationContext(), new Handler(), p367o0OOo0o0.Oooo000.OooO00o(context), view.getWindowToken(), 0);
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(o0000.OooO0OO(oO00OOo0.View_Profile));
        o000OO00 o000oo01 = this.f45787OooO0o0;
        Conversation conversation = o000oo01.f45781OooO0OO;
        if (conversation != null) {
            arrayListArrayListOf.add(o0000.OooO0OO(conversation.getTopTime() > 0 ? oO00OOo0.message_list_Unpin : oO00OOo0.message_list_Pin));
        }
        FriendCheckModel mFriendCheckModel = this.f45786OooO0o.getMFriendCheckModel();
        if (mFriendCheckModel != null) {
            if (mFriendCheckModel.isBlack) {
                arrayListArrayListOf.add(o0000.OooO0OO(oO00OOo0.Unblock));
            } else {
                arrayListArrayListOf.add(o0000.OooO0OO(oO00OOo0.Block));
            }
        }
        arrayListArrayListOf.add(o0000.OooO0OO(oO00OOo0.Report));
        o0OO000.OooO00o("104002");
        p361o0OOo00o.OooOO0O oooOO0O = new p361o0OOo00o.OooOO0O(o000oo01.f45779OooO00o, arrayListArrayListOf, new o000O0Oo(arrayListArrayListOf, o000oo01, this.f45789OooO0oo, this.f45786OooO0o, this.f45784OooO));
        ImageView anchor = this.f45788OooO0oO.getF30474OoooOo0();
        int iOooO00o = o0000O0.OooO00o(-10);
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        oooOO0O.OooO0O0(anchor, iOooO00o, true);
        return Unit.INSTANCE;
    }
}
