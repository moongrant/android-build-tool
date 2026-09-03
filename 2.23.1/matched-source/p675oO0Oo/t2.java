package p675oO0Oo;

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
import p202o00o0o.o00O0O;
import p205o00o0o0o.o000O;
import p425o0OoO0OO.oOO00O;
import p532o0o0OOOO.o0O0o000;
import p565o0oOo000.o000OOo;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class t2 extends Lambda implements Function2<Integer, o00O0O, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ w2 f59970OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Activity f59971OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ChatModel f59972OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ List<ReportFromData> f59973OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(w2 w2Var, ChatModel chatModel, MixedRoomActivity mixedRoomActivity, ArrayList arrayList) {
        super(2);
        this.f59970OooO0Oo = w2Var;
        this.f59972OooO0o0 = chatModel;
        this.f59971OooO0o = mixedRoomActivity;
        this.f59973OooO0oO = arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, o00O0O o00o0o2) {
        num.intValue();
        o00O0O item = o00o0o2;
        Intrinsics.checkNotNullParameter(item, "item");
        String str = item.f39336OooO0Oo;
        boolean zAreEqual = Intrinsics.areEqual(str, o0000.OooO0OO(o000OOo.Room_Reply));
        w2 w2Var = this.f59970OooO0Oo;
        if (zAreEqual) {
            int size = w2Var.f60018OooOOO0.size();
            int i = w2Var.f60017OooOOO;
            if (size > i) {
                h0.OooO0O0("102095");
                LiveEventBus.get("ROOM_CHAT_REPLY").post(w2Var.f60018OooOOO0.get(i));
            }
            return Unit.INSTANCE;
        }
        int i2 = o000OOo.Copy;
        boolean zAreEqual2 = Intrinsics.areEqual(str, o0000.OooO0OO(i2));
        ChatModel chatModel = this.f59972OooO0o0;
        if (zAreEqual2) {
            h0.OooO0O0("102290");
            oOO00O.OooO00o(this.f59971OooO0o, chatModel.getMessage(), o0000.OooO0OO(i2));
            return Unit.INSTANCE;
        }
        if (Intrinsics.areEqual(str, o0000.OooO0OO(o000OOo.Report))) {
            h0.OooO0O0("102097");
            ReportScreen reportScreen = ReportScreen.INSTANCE;
            RoomUserInfoModel newFrom = chatModel.getNewFrom();
            Intrinsics.checkNotNull(newFrom);
            o0O0o000.OooO0o0(reportScreen, ReportScreen.bundleOf(7, newFrom.getUserId().getValue().longValue(), (244 & 4) != 0 ? null : this.f59973OooO0oO, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
            return Unit.INSTANCE;
        }
        if (!Intrinsics.areEqual(str, o0000.OooO0OO(o000OOo.Chat_Box))) {
            if (Intrinsics.areEqual(str, o0000.OooO0OO(o000OOo.Remove))) {
                w2Var.f60022OooOOo0.invoke();
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(str, o0000.OooO0OO(o000OOo.Switch_chat_box))) {
                h0.OooO0O0("102243");
                o0O0o000.OooO0o0(StoreChatBubbleMineScreen.INSTANCE, null, false, null, 14);
            }
            return Unit.INSTANCE;
        }
        h0.OooO0O0("102242");
        Context context = o000O00O.f13430OooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 == null) {
            return null;
        }
        o000O o000o = new o000O(activityOooO0O0);
        o000o.OooOOoo(o000OOo.go_to_store_get_chat_box);
        o000o.OooOo0O(r2.f59925OooO0Oo);
        o000o.OooOo0(s2.f59950OooO0Oo);
        o000o.OooOO0o();
        return Unit.INSTANCE;
    }
}
