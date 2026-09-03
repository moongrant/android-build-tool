package p650o0ooo;

import android.app.Activity;
import android.content.Context;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
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
import o0oo0000.OooO00o;
import p202o00o0o.o00O0O;
import p205o00o0o0o.o000O;
import p423o0OoO0OO.o00O00OO;
import p532o0o0OOo0.o00O00;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class x0 extends Lambda implements Function2<Integer, o00O0O, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ a1 f59213OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Activity f59214OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatModel f59215OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ List<ReportFromData> f59216OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(a1 a1Var, ChatModel chatModel, MixedRoomActivity mixedRoomActivity, ArrayList arrayList) {
        super(2);
        this.f59213OooO0Oo = a1Var;
        this.f59215OooO0o0 = chatModel;
        this.f59214OooO0o = mixedRoomActivity;
        this.f59216OooO0oO = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, o00O0O o00o0o2) {
        num.intValue();
        o00O0O item = o00o0o2;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f39340OooO0Oo;
        boolean zAreEqual = Intrinsics.areEqual(str, o0000.OooO0OO(o000000.Room_Reply));
        a1 a1Var = this.f59213OooO0Oo;
        if (zAreEqual) {
            int size = a1Var.f58143OooOOO0.size();
            int i = a1Var.f58142OooOOO;
            if (size > i) {
                OooO00o.OooO0O0("102095");
                LiveEventBus.get("ROOM_CHAT_REPLY").post(a1Var.f58143OooOOO0.get(i));
            }
            return Unit.INSTANCE;
        }
        int i2 = o000000.Copy;
        boolean zAreEqual2 = Intrinsics.areEqual(str, o0000.OooO0OO(i2));
        ChatModel chatModel = this.f59215OooO0o0;
        if (zAreEqual2) {
            OooO00o.OooO0O0("102290");
            o00O00OO.OooO00o(this.f59214OooO0o, chatModel.getMessage(), o0000.OooO0OO(i2));
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(str, o0000.OooO0OO(o000000.Report))) {
            OooO00o.OooO0O0("102097");
            ReportScreen reportScreen = ReportScreen.INSTANCE;
            RoomUserInfoModel newFrom = chatModel.getNewFrom();
            Intrinsics.checkNotNull(newFrom);
            o00O00.OooO0o0(reportScreen, ReportScreen.bundleOf(7, newFrom.getUserId().getValue().longValue(), (244 & 4) != 0 ? null : this.f59216OooO0oO, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(str, o0000.OooO0OO(o000000.Chat_Box))) {
            if (Intrinsics.areEqual(str, o0000.OooO0OO(o000000.Remove))) {
                a1Var.f58147OooOOo0.invoke();
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(str, o0000.OooO0OO(o000000.Switch_chat_box))) {
                OooO00o.OooO0O0("102243");
                o00O00.OooO0o0(StoreChatBubbleMineScreen.INSTANCE, null, false, null, 14);
            }
            return Unit.INSTANCE;
        }
        OooO00o.OooO0O0("102242");
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 == null) {
            return null;
        }
        o000O o000o = new o000O(activityOooO0O0);
        o000o.OooOOoo(o000000.go_to_store_get_chat_box);
        o000o.OooOo0O(v0.f59179OooO0Oo);
        o000o.OooOo0(w0.f59192OooO0Oo);
        o000o.OooOO0o();
        return Unit.INSTANCE;
    }
}
