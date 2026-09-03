package p675oO0Oo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.o0000O0O;
import com.yalla.yalla.model.ReportFromData;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import p205o00o0o0o.o000O0o;
import p474o0OoooOO.oo0oO0;
import p565o0oOo000.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomChatLongClickDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatLongClickDialog.kt\ncom/yalla/yalla/ui/dialog/RoomChatLongClickDialog\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,244:1\n1855#2,2:245\n1#3:247\n*S KotlinDebug\n*F\n+ 1 RoomChatLongClickDialog.kt\ncom/yalla/yalla/ui/dialog/RoomChatLongClickDialog\n*L\n54#1:245,2\n*E\n"})
public final class w2 extends o000O0o {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f60017OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final List<ChatModel> f60018OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final long f60019OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f60020OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final Lazy f60021OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f60022OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final Lazy f60023OooOOoo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:32:0x011d  */
    /* JADX WARN: Multi-variable type inference failed */
    public w2(@NotNull MixedRoomActivity context, @NotNull ArrayList chatListClone, int i, long j, boolean z, @NotNull o0000O0O dislike) {
        MutableStateFlow<Long> userId;
        int i2;
        RoomUserInfoModel newFrom;
        MutableStateFlow<Long> userId2;
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(chatListClone, "chatListClone");
        Intrinsics.checkNotNullParameter(dislike, "dislike");
        this.f60018OooOOO0 = chatListClone;
        this.f60017OooOOO = i;
        this.f60019OooOOOO = j;
        this.f60020OooOOOo = z;
        this.f60022OooOOo0 = dislike;
        Lazy lazy = LazyKt.lazy(new v2(this));
        this.f60021OooOOo = lazy;
        this.f60023OooOOoo = LazyKt.lazy(new u2(this));
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) lazy.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ChatModel chatModel = (ChatModel) it.next();
            ReportFromData reportFromData = new ReportFromData(0L, 0L, null, 0L, 0, 0, 0L, 127, null);
            RoomUserInfoModel newFrom2 = chatModel.getNewFrom();
            if (newFrom2 != null && (userId = newFrom2.getUserId()) != null) {
                long jLongValue = userId.getValue().longValue();
                RoomUserInfoModel newFrom3 = chatModel.getNewFrom();
                Intrinsics.checkNotNull(newFrom3);
                reportFromData.setPrettyId(o0OoOo0.OooO(0L, newFrom3.getUserIdx().getValue()));
                reportFromData.setUserId(jLongValue);
                reportFromData.setContent(chatModel.getMessage());
                reportFromData.setSendTime(chatModel.getPlayTime());
                reportFromData.setType(chatModel.getType() == 7 ? 1 : 0);
                ChatModel chatModel2 = (ChatModel) this.f60023OooOOoo.getValue();
                if ((chatModel2 == null || (newFrom = chatModel2.getNewFrom()) == null || (userId2 = newFrom.getUserId()) == null || jLongValue != userId2.getValue().longValue()) ? false : true) {
                    ChatModel chatModel3 = (ChatModel) this.f60023OooOOoo.getValue();
                    i2 = chatModel3 != null && (chatModel.getPlayTime() > chatModel3.getPlayTime() ? 1 : (chatModel.getPlayTime() == chatModel3.getPlayTime() ? 0 : -1)) == 0 ? 1 : 0;
                }
                reportFromData.setReportMessage(i2);
                reportFromData.setRoomId(this.f60019OooOOOO);
                arrayList.add(reportFromData);
            }
        }
        ChatModel chatModel4 = (ChatModel) this.f60023OooOOoo.getValue();
        if (chatModel4 != null) {
            int type = chatModel4.getType();
            if (type == 0 || type == 1 || (type == 3 ? chatModel4.getGiftid() > 0 : type == 7 || type == 16 || ((type == 11 || type == 12) && !chatModel4.getIsSkillCard()))) {
                OooOOO0(o0000.OooO0OO(o000OOo.Room_Reply));
            }
            int type2 = chatModel4.getType();
            if (type2 == 0 || type2 == 7) {
                if (chatModel4.getType() != 7) {
                    OooOOO0(o0000.OooO0OO(o000OOo.Copy));
                }
                RoomUserInfoModel newFrom4 = chatModel4.getNewFrom();
                Intrinsics.checkNotNull(newFrom4);
                long jLongValue2 = newFrom4.getUserId().getValue().longValue();
                oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                Long l = (Long) oo0oO0.OooOOo0().getValue();
                if (l == null || jLongValue2 != l.longValue()) {
                    OooOOO0(o0000.OooO0OO(o000OOo.Report));
                    OooOOO0(o0000.OooO0OO(o000OOo.Remove));
                }
            }
            if (this.f60020OooOOOo) {
                RoomUserInfoModel newFrom5 = this.f60018OooOOO0.get(this.f60017OooOOO).getNewFrom();
                Intrinsics.checkNotNull(newFrom5);
                long jLongValue3 = newFrom5.getUserId().getValue().longValue();
                oo0oO0 oo0oo1 = oo0oO0.f47967OooO00o;
                Long l2 = (Long) oo0oO0.OooOOo0().getValue();
                if (l2 != null && jLongValue3 == l2.longValue()) {
                    OooOOO0(o0000.OooO0OO(o000OOo.Switch_chat_box));
                } else {
                    RoomUserInfoDTO.ChatBubbleInfo value = newFrom5.getBubbleInfo().getValue();
                    if ((value == null || value.getIsDefaultBubble()) ? false : true) {
                        OooOOO0(o0000.OooO0OO(o000OOo.Chat_Box));
                    }
                }
            }
            OooOOo0(new t2(this, chatModel4, context, arrayList));
            if (!this.f39371OooO0oo.isEmpty()) {
                OooOO0o();
            }
        }
    }
}
