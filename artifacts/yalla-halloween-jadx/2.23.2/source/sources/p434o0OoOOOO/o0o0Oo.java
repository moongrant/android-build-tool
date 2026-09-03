package p434o0OoOOOO;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.ReportFromData;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041Ooooo0o.o00000;
import p475o0Ooooo0.o0O00oO0;
import p532o0o0OOo0.o00O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nPrivateChatReportManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateChatReportManager.kt\ncom/yalla/yalla/manager/message/PrivateChatReportManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,170:1\n1855#2,2:171\n1855#2,2:174\n1#3:173\n*S KotlinDebug\n*F\n+ 1 PrivateChatReportManager.kt\ncom/yalla/yalla/manager/message/PrivateChatReportManager\n*L\n32#1:171,2\n130#1:174,2\n*E\n"})
public final class o0o0Oo {
    public static void OooO00o(long j, @NotNull PrivateChatAdapter chatAdapter, @Nullable Integer num, @NotNull UserInfo userInfo) {
        Object obj;
        Intrinsics.checkNotNullParameter(chatAdapter, "chatAdapter");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        List<Object> list = chatAdapter.f35583OooO0O0.f35492OooO0oO.OooO0o0().f35433OooO0o;
        Intrinsics.checkNotNull(list, "null cannot be cast to non-null type java.util.ArrayList<com.yalla.yalla.data.db.table.ChatMessage>{ kotlin.collections.TypeAliasesKt.ArrayList<com.yalla.yalla.data.db.table.ChatMessage> }");
        Object objClone = ((ArrayList) list).clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.ArrayList<com.yalla.yalla.data.db.table.ChatMessage>{ kotlin.collections.TypeAliasesKt.ArrayList<com.yalla.yalla.data.db.table.ChatMessage> }");
        ArrayList arrayList = (ArrayList) objClone;
        ArrayList<ReportFromData> arrayList2 = new ArrayList();
        if (num != null) {
            Object obj2 = arrayList.get(num.intValue());
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            ChatMessage chatMessage = (ChatMessage) obj2;
            int iIntValue = num.intValue();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            if (iIntValue < 0 || arrayList.size() <= iIntValue) {
                obj = null;
            } else {
                int size = arrayList.size();
                for (int i = iIntValue + 1; i < size && arrayList4.size() < 15; i++) {
                    Object obj3 = arrayList.get(i);
                    Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                    ChatMessage chatMessage2 = (ChatMessage) obj3;
                    int contentType = chatMessage2.getContentType();
                    if (contentType == 1 || contentType == 2) {
                        arrayList4.add(0, chatMessage2);
                    }
                }
                obj = arrayList.get(iIntValue);
                for (int i2 = iIntValue - 1; -1 < i2 && arrayList5.size() < 5; i2--) {
                    Object obj4 = arrayList.get(i2);
                    Intrinsics.checkNotNullExpressionValue(obj4, "get(...)");
                    ChatMessage chatMessage3 = (ChatMessage) obj4;
                    int contentType2 = chatMessage3.getContentType();
                    if (contentType2 == 1 || contentType2 == 2) {
                        arrayList5.add(chatMessage3);
                    }
                }
            }
            arrayList3.addAll(arrayList4);
            if (((ChatMessage) obj) != null) {
                arrayList3.add(obj);
            }
            arrayList3.addAll(arrayList5);
            OooO0O0(arrayList2, arrayList3, userInfo, chatMessage);
        } else {
            ArrayList arrayList6 = new ArrayList();
            int size2 = arrayList.size() - 1;
            for (int i3 = 0; i3 < size2 && arrayList6.size() < 20; i3++) {
                Object obj5 = arrayList.get(i3);
                Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                ChatMessage chatMessage4 = (ChatMessage) obj5;
                int contentType3 = chatMessage4.getContentType();
                if (contentType3 == 1 || contentType3 == 2) {
                    arrayList6.add(0, chatMessage4);
                }
            }
            OooO0O0(arrayList2, arrayList6, userInfo, null);
        }
        for (ReportFromData reportFromData : arrayList2) {
            int type = reportFromData.getType();
            int iIsReportMessage = reportFromData.isReportMessage();
            String content = reportFromData.getContent();
            StringBuilder sbOooO00o = o00000.OooO00o("举报消息    ", type, "    ", iIsReportMessage, "   ");
            sbOooO00o.append(content);
            System.out.println((Object) sbOooO00o.toString());
        }
        o00O00.OooO0o0(ReportScreen.INSTANCE, ReportScreen.bundleOf(8, j, (244 & 4) != 0 ? null : arrayList2, (244 & 8) != 0 ? null : null, (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : Integer.valueOf(num == null ? 0 : 1), (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? null : null), false, null, 12);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x0077  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x0089  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c9 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0089, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static void OooO0O0(ArrayList arrayList, ArrayList arrayList2, UserInfo userInfo, ChatMessage chatMessage) {
        String userIdx;
        long jOooO;
        String str;
        int contentType;
        String voiceUrl;
        ChatMessage.VoiceInfo voiceInfo;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ChatMessage chatMessage2 = (ChatMessage) it.next();
            long jOooO2 = 0;
            Iterator it2 = it;
            ReportFromData reportFromData = new ReportFromData(0L, 0L, null, 0L, 0, 0, 0L, 127, null);
            if (chatMessage2.getIsAcceptMsg()) {
                userIdx = userInfo.getUserIdx();
            } else {
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                userIdx = (String) o0O00oO0.OooOOo().getValue();
                if (userIdx == null) {
                    jOooO = 0;
                }
                reportFromData.setPrettyId(jOooO);
                if (chatMessage2.getIsAcceptMsg()) {
                    jOooO2 = userInfo.getUserId();
                } else {
                    o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                    str = (String) o0O00oO0.OooOOo().getValue();
                    if (str != null) {
                        jOooO2 = o0OoOo0.OooO(0L, str);
                    }
                }
                reportFromData.setUserId(jOooO2);
                reportFromData.getContent();
                contentType = chatMessage2.getContentType();
                if (contentType != 1) {
                    voiceUrl = chatMessage2.getMessage();
                } else if (contentType == 2 || (voiceInfo = chatMessage2.getVoiceInfo()) == null || (voiceUrl = voiceInfo.getVoiceUrl()) == null) {
                    voiceUrl = "";
                }
                reportFromData.setContent(voiceUrl);
                reportFromData.setSendTime(chatMessage2.getTime());
                int contentType2 = chatMessage2.getContentType();
                reportFromData.setType((contentType2 == 1 && contentType2 == 2) ? 2 : 0);
                if (chatMessage == null) {
                    reportFromData.setReportMessage((chatMessage.getIsAcceptMsg() || chatMessage2.getTime() != chatMessage.getTime()) ? 0 : 1);
                }
                arrayList.add(reportFromData);
                it = it2;
            }
            jOooO = o0OoOo0.OooO(0L, userIdx);
            reportFromData.setPrettyId(jOooO);
            if (chatMessage2.getIsAcceptMsg()) {
                jOooO2 = userInfo.getUserId();
            } else {
                o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                str = (String) o0O00oO0.OooOOo().getValue();
                if (str != null) {
                    jOooO2 = o0OoOo0.OooO(0L, str);
                }
            }
            reportFromData.setUserId(jOooO2);
            reportFromData.getContent();
            contentType = chatMessage2.getContentType();
            if (contentType != 1) {
                voiceUrl = chatMessage2.getMessage();
            } else if (contentType == 2) {
                voiceUrl = "";
            } else {
                voiceUrl = "";
            }
            reportFromData.setContent(voiceUrl);
            reportFromData.setSendTime(chatMessage2.getTime());
            int contentType3 = chatMessage2.getContentType();
            reportFromData.setType((contentType3 == 1 && contentType3 == 2) ? 2 : 0);
            if (chatMessage == null) {
                reportFromData.setReportMessage((chatMessage.getIsAcceptMsg() || chatMessage2.getTime() != chatMessage.getTime()) ? 0 : 1);
            }
            arrayList.add(reportFromData);
            it = it2;
        }
    }
}
