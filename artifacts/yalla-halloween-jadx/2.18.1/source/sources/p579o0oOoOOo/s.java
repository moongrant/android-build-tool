package p579o0oOoOOo;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.model.ChatModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.model.ReportFromData;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p251o00ooO.o000O00;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p255o00ooO0o.o00O0;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p584o0oOoo.o000O;
import p595o0oOoooo.u5;
import p598o0oo00O.oO0Oo0oo;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class s extends o00O0 {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f46267OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final List<ChatModel> f46268OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final long f46269OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f46270OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final Lazy f46271OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f46272OooOOo0;

    public static final class OooO00o extends Lambda implements Function2<Integer, o000O00, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ List<ReportFromData> f46273Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ ChatModel f46275Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Activity f46276Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ChatModel chatModel, Activity activity, List<ReportFromData> list) {
            super(2);
            this.f46275Oooo0oO = chatModel;
            this.f46276Oooo0oo = activity;
            this.f46273Oooo = list;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, o000O00 o000o01) {
            num.intValue();
            o000O00 item = o000o01;
            Intrinsics.checkNotNullParameter(item, "item");
            String str = item.f34212Oooo0o;
            if (Intrinsics.areEqual(str, o000O0O0.OooO0OO(R.string.Room_Reply))) {
                if (s.this.f46268OooOOO0.size() > s.this.f46267OooOOO) {
                    o0O00000.OooO0OO("InRoom_Replymessage");
                    Observable<Object> observable = LiveEventBus.get("ROOM_CHAT_REPLY");
                    s sVar = s.this;
                    observable.post(sVar.f46268OooOOO0.get(sVar.f46267OooOOO));
                }
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(str, o000O0O0.OooO0OO(R.string.Copy))) {
                p522o0o0O0o.o00O0.OooO00o(this.f46275Oooo0oO.message, this.f46276Oooo0oo, o000O0O0.OooO0OO(R.string.Copy));
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(str, o000O0O0.OooO0OO(R.string.report))) {
                o0O00000.OooO0OO("InRoom_reportMessage");
                o000O.OooO00o(u5.f47570OooO00o, u5.OooO0o(7, this.f46275Oooo0oO.from.getUserId(), (52 & 4) != 0 ? null : this.f46273Oooo, (52 & 8) != 0 ? null : null, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null));
                return Unit.INSTANCE;
            }
            if (!Intrinsics.areEqual(str, o000O0O0.OooO0OO(R.string.Chat_Box))) {
                if (Intrinsics.areEqual(str, o000O0O0.OooO0OO(R.string.Switch_chat_box))) {
                    OooOo.OooO0O0("102243");
                    o000O.OooO00o(oO0Oo0oo.f47855OooO00o, null);
                }
                return Unit.INSTANCE;
            }
            OooOo.OooO0O0("102242");
            o00O000 o00o001 = o00O000.f34346OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 == null) {
                return null;
            }
            oo0oOO0 oo0ooo0 = new oo0oOO0(activityOooO0O0);
            oo0ooo0.OooOo0(R.string.go_to_store_get_chat_box);
            oo0ooo0.OooOo(q.f46250Oooo0o);
            oo0ooo0.OooOo0o(r.f46255Oooo0o);
            oo0ooo0.OooOOO0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<ChatModel> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ChatModel invoke() {
            s sVar = s.this;
            List<ChatModel> list = sVar.f46268OooOOO0;
            int i = sVar.f46267OooOOO;
            if (list.size() > i) {
                return list.get(i);
            }
            return null;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<List<ChatModel>> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<ChatModel> invoke() {
            ChatModel chatModel;
            s sVar = s.this;
            List<ChatModel> list = sVar.f46268OooOOO0;
            int i = sVar.f46267OooOOO;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            if (i < 0 || list.size() <= i) {
                chatModel = null;
            } else {
                for (int i2 = i - 1; -1 < i2 && arrayList2.size() < 9; i2--) {
                    ChatModel chatModel2 = list.get(i2);
                    int i3 = chatModel2.type;
                    if (i3 == 0 || i3 == 7) {
                        arrayList2.add(0, chatModel2);
                    }
                }
                chatModel = list.get(i);
                int size = list.size();
                for (int i4 = i + 1; i4 < size && arrayList3.size() < 4; i4++) {
                    ChatModel chatModel3 = list.get(i4);
                    int i5 = chatModel3.type;
                    if (i5 == 0 || i5 == 7) {
                        arrayList3.add(chatModel3);
                    }
                }
            }
            arrayList.addAll(arrayList2);
            if (chatModel != null) {
                arrayList.add(chatModel);
            }
            arrayList.addAll(arrayList3);
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o00ooO.o000Oo0>] */
    public s(@NotNull Activity context, @NotNull List<ChatModel> chatListClone, int i, long j, boolean z) {
        int i2;
        RoomUserInfoModel roomUserInfoModel;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(chatListClone, "chatListClone");
        this.f46268OooOOO0 = chatListClone;
        this.f46267OooOOO = i;
        this.f46269OooOOOO = j;
        this.f46270OooOOOo = z;
        Lazy lazy = LazyKt.lazy(new OooO0OO());
        this.f46272OooOOo0 = lazy;
        this.f46271OooOOo = LazyKt.lazy(new OooO0O0());
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) lazy.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ChatModel chatModel = (ChatModel) it.next();
            ReportFromData reportFromData = new ReportFromData(0L, 0L, null, 0L, 0, 0, 0L, 127, null);
            RoomUserInfoModel roomUserInfoModel2 = chatModel.from;
            if (roomUserInfoModel2 != null) {
                long userId = roomUserInfoModel2.getUserId();
                reportFromData.setPrettyId(OooO.OooO0oO(chatModel.from.getUserIdx()));
                reportFromData.setUserId(userId);
                reportFromData.setContent("" + chatModel.message);
                reportFromData.setSendTime(chatModel.playTime);
                reportFromData.setType(chatModel.type == 7 ? 1 : 0);
                ChatModel chatModelOooOo00 = OooOo00();
                if ((chatModelOooOo00 == null || (roomUserInfoModel = chatModelOooOo00.from) == null || userId != roomUserInfoModel.getUserId()) ? false : true) {
                    ChatModel chatModelOooOo01 = OooOo00();
                    i2 = chatModelOooOo01 != null && (chatModel.playTime > chatModelOooOo01.playTime ? 1 : (chatModel.playTime == chatModelOooOo01.playTime ? 0 : -1)) == 0 ? 1 : 0;
                }
                reportFromData.setReportMessage(i2);
                reportFromData.setRoomId(this.f46269OooOOOO);
                arrayList.add(reportFromData);
            }
        }
        ChatModel chatModelOooOo02 = OooOo00();
        if (chatModelOooOo02 != null) {
            int i3 = chatModelOooOo02.type;
            if (i3 == 0 || i3 == 1 || (i3 == 3 ? chatModelOooOo02.giftid > 0 : i3 == 7 || i3 == 16 || ((i3 == 11 || i3 == 12) && !chatModelOooOo02.isSkillCard))) {
                OooOOO(o000O0O0.OooO0OO(R.string.Room_Reply));
            }
            int i4 = chatModelOooOo02.type;
            if (i4 == 0 || i4 == 7) {
                if (i4 != 7) {
                    OooOOO(o000O0O0.OooO0OO(R.string.Copy));
                }
                long userId2 = chatModelOooOo02.from.getUserId();
                Long value = OooOOO.f41216OooO00o.OooOo().getValue();
                if (value == null || userId2 != value.longValue()) {
                    OooOOO(o000O0O0.OooO0OO(R.string.report));
                }
            }
            if (this.f46270OooOOOo) {
                RoomUserInfoModel roomUserInfoModel3 = this.f46268OooOOO0.get(this.f46267OooOOO).from;
                long userId3 = roomUserInfoModel3.getUserId();
                Long value2 = OooOOO.f41216OooO00o.OooOo().getValue();
                if (value2 != null && userId3 == value2.longValue()) {
                    OooOOO(o000O0O0.OooO0OO(R.string.Switch_chat_box));
                } else {
                    RoomUserInfoModel.ChatBubbleInfo bubbleInfo = roomUserInfoModel3.getBubbleInfo();
                    if ((bubbleInfo == null || bubbleInfo.getIsDefaultBubble()) ? false : true) {
                        OooOOO(o000O0O0.OooO0OO(R.string.Chat_Box));
                    }
                }
            }
            OooOOoo(new OooO00o(chatModelOooOo02, context, arrayList));
            if (!this.f34360OooO0oo.isEmpty()) {
                OooOOO0();
            }
        }
    }

    public final ChatModel OooOo00() {
        return (ChatModel) this.f46271OooOOo.getValue();
    }
}
