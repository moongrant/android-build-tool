package p519o0o0O0oO;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.ReportFromData;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p156o00OoOO.OooOo;
import p157o00OoOO0.o0OO00O;
import p417o0OoO0.o0000O0O;
import p526o0o0OOO0.oo0oOO0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 extends Lambda implements Function2<Integer, OooOo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w0 f53143OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Activity f53144OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatModel f53145OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ List<ReportFromData> f53146OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(w0 w0Var, ChatModel chatModel, MixedRoomActivity mixedRoomActivity, ArrayList arrayList) {
        super(2);
        this.f53143OooO0Oo = w0Var;
        this.f53145OooO0o0 = chatModel;
        this.f53144OooO0o = mixedRoomActivity;
        this.f53146OooO0oO = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, OooOo oooOo) {
        num.intValue();
        OooOo item = oooOo;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f38216OooO0Oo;
        boolean zAreEqual = Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.Room_Reply));
        w0 w0Var = this.f53143OooO0Oo;
        if (zAreEqual) {
            int size = w0Var.f53182OooOOO0.size();
            int i = w0Var.f53181OooOOO;
            if (size > i) {
                o0OO000.OooO00o("102095");
                LiveEventBus.get("ROOM_CHAT_REPLY").post(w0Var.f53182OooOOO0.get(i));
            }
            return Unit.INSTANCE;
        }
        int i2 = oO00OOo0.Copy;
        boolean zAreEqual2 = Intrinsics.areEqual(str, o0000.OooO0OO(i2));
        ChatModel chatModel = this.f53145OooO0o0;
        if (zAreEqual2) {
            o0OO000.OooO00o("102290");
            o0000O0O.OooO00o(this.f53144OooO0o, chatModel.getMessage(), o0000.OooO0OO(i2));
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.Report))) {
            o0OO000.OooO00o("102097");
            ReportScreen reportScreen = ReportScreen.INSTANCE;
            RoomUserInfoModel newFrom = chatModel.getNewFrom();
            Intrinsics.checkNotNull(newFrom);
            oo0oOO0.OooO0o0(reportScreen, ReportScreen.bundleOf(7, newFrom.getUserId().getValue().longValue(), (244 & 4) != 0 ? null : this.f53146OooO0oO, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.Chat_Box))) {
            if (Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.Remove))) {
                w0Var.f53186OooOOo0.invoke();
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(str, o0000.OooO0OO(oO00OOo0.Switch_chat_box))) {
                o0OO000.OooO00o("102243");
                oo0oOO0.OooO0o0(StoreChatBubbleMineScreen.INSTANCE, null, false, null, 14);
            }
            return Unit.INSTANCE;
        }
        o0OO000.OooO00o("102242");
        Context context = o000O0.f10354OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 == null) {
            return null;
        }
        o0OO00O o0oo00o2 = new o0OO00O(activityOooO0O0);
        o0oo00o2.OooOOoo(oO00OOo0.go_to_store_get_chat_box);
        o0oo00o2.OooOo0O(r0.f53128OooO0Oo);
        o0oo00o2.OooOo0(s0.f53134OooO0Oo);
        o0oo00o2.OooOO0o();
        return Unit.INSTANCE;
    }
}
