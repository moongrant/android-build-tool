package p434o0OoOOOO;

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
import kotlin.collections.OooO00o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p371o0OOo0oO.o0OOO0o;
import p465o0OooOo.o0O0O0o0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OO0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ PrivateChatAdapter f46946OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Oooo000> f46947OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ UserBlackVM f46948OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OO f46949OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ HeaderLayout f46950OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ PrivateChatVM f46951OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO0O0(MutableState mutableState, o00OO o00oo2, PrivateChatAdapter privateChatAdapter, HeaderLayout headerLayout, UserBlackVM userBlackVM, PrivateChatVM privateChatVM) {
        super(0);
        this.f46947OooO0Oo = mutableState;
        this.f46949OooO0o0 = o00oo2;
        this.f46948OooO0o = userBlackVM;
        this.f46950OooO0oO = headerLayout;
        this.f46951OooO0oo = privateChatVM;
        this.f46946OooO = privateChatAdapter;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EmojiEditText view = this.f46947OooO0Oo.getValue().OooO00o();
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        OooO00o.OooO0O0(view.getContext().getApplicationContext(), new Handler(), o0OOO0o.OooO00o(context), view.getWindowToken(), 0);
        ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(o0000.OooO0OO(o000000.View_Profile));
        o00OO o00oo2 = this.f46949OooO0o0;
        Conversation conversation = o00oo2.f46937OooO0OO;
        if (conversation != null) {
            arrayListArrayListOf.add(o0000.OooO0OO(conversation.getTopTime() > 0 ? o000000.message_list_Unpin : o000000.message_list_Pin));
        }
        FriendCheckModel mFriendCheckModel = this.f46948OooO0o.getMFriendCheckModel();
        if (mFriendCheckModel != null) {
            if (mFriendCheckModel.isBlack) {
                arrayListArrayListOf.add(o0000.OooO0OO(o000000.Unblock));
            } else {
                arrayListArrayListOf.add(o0000.OooO0OO(o000000.Block));
            }
        }
        arrayListArrayListOf.add(o0000.OooO0OO(o000000.Report));
        o0oo0000.OooO00o.OooO0O0("104002");
        o0O0O0o0 o0o0o0o0 = new o0O0O0o0(o00oo2.f46935OooO00o, arrayListArrayListOf, new o00OO00O(arrayListArrayListOf, o00oo2, this.f46951OooO0oo, this.f46948OooO0o, this.f46946OooO));
        ImageView anchor = this.f46950OooO0oO.getF29929OoooOo0();
        int iOooO00o = o0000O0.OooO00o(-10);
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        o0o0o0o0.OooO0O0(anchor, iOooO00o, true);
        return Unit.INSTANCE;
    }
}
