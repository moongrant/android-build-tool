package p700oO0Oo;

import OooO00o.OooO00o;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.ReportFromData;
import com.yalla.yalla.ui.adapter.PrivateChatAdapter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p498o0o00Oo0.OooOOO;
import p584o0oOoo.o000O;
import p595o0oOoooo.u5;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000000 {
    public static final void OooO00o(long j, @NotNull PrivateChatAdapter chatAdapter, @Nullable Integer num, @NotNull UserInfo userInfo) {
        Intrinsics.checkNotNullParameter(chatAdapter, "chatAdapter");
        Intrinsics.checkNotNullParameter(userInfo, "userInfo");
        Collection collection = chatAdapter.f28932OooO0O0.f28654OooO0oO.OooO0oO().f29063Oooo0oo;
        Intrinsics.checkNotNull(collection, "null cannot be cast to non-null type java.util.ArrayList<com.yalla.yalla.common.db.table.ChatMessage>{ kotlin.collections.TypeAliasesKt.ArrayList<com.yalla.yalla.common.db.table.ChatMessage> }");
        Object objClone = ((ArrayList) collection).clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.ArrayList<com.yalla.yalla.common.db.table.ChatMessage>{ kotlin.collections.TypeAliasesKt.ArrayList<com.yalla.yalla.common.db.table.ChatMessage> }");
        ArrayList arrayList = (ArrayList) objClone;
        ArrayList<ReportFromData> arrayList2 = new ArrayList();
        Object obj = null;
        if (num != null) {
            Object obj2 = arrayList.get(num.intValue());
            Intrinsics.checkNotNullExpressionValue(obj2, "cloneData[position]");
            ChatMessage chatMessage = (ChatMessage) obj2;
            int iIntValue = num.intValue();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            if (iIntValue >= 0 && arrayList.size() > iIntValue) {
                int size = arrayList.size();
                for (int i = iIntValue + 1; i < size && arrayList4.size() < 15; i++) {
                    Object obj3 = arrayList.get(i);
                    Intrinsics.checkNotNullExpressionValue(obj3, "allData[i]");
                    ChatMessage chatMessage2 = (ChatMessage) obj3;
                    int contentType = chatMessage2.getContentType();
                    if (contentType == 1 || contentType == 2) {
                        arrayList4.add(0, chatMessage2);
                    }
                }
                obj = arrayList.get(iIntValue);
                for (int i2 = iIntValue - 1; -1 < i2 && arrayList5.size() < 5; i2--) {
                    Object obj4 = arrayList.get(i2);
                    Intrinsics.checkNotNullExpressionValue(obj4, "allData[i]");
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
                Intrinsics.checkNotNullExpressionValue(obj5, "allData[i]");
                ChatMessage chatMessage4 = (ChatMessage) obj5;
                int contentType3 = chatMessage4.getContentType();
                if (contentType3 == 1 || contentType3 == 2) {
                    arrayList6.add(0, chatMessage4);
                }
            }
            OooO0O0(arrayList2, arrayList6, userInfo, null);
        }
        for (ReportFromData reportFromData : arrayList2) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("举报消息    ");
            sbOooO0o0.append(reportFromData.getType());
            sbOooO0o0.append("    ");
            sbOooO0o0.append(reportFromData.isReportMessage());
            sbOooO0o0.append("   ");
            sbOooO0o0.append(reportFromData.getContent());
            System.out.println((Object) sbOooO0o0.toString());
        }
        o000O.OooO00o(u5.f47570OooO00o, u5.OooO0o(8, j, (52 & 4) != 0 ? null : arrayList2, (52 & 8) != 0 ? null : null, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : Integer.valueOf(num == null ? 0 : 1)));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x005c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Code duplicated, block: B:18:0x006f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d7 A[SYNTHETIC] */
    public static final void OooO0O0(List list, List list2, UserInfo userInfo, ChatMessage chatMessage) {
        String value;
        long jOooO0oO;
        String value2;
        int contentType;
        String string;
        ChatMessage.VoiceInfo voiceInfo;
        String voiceUrl;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ChatMessage chatMessage2 = (ChatMessage) it.next();
            long jOooO0oO2 = 0;
            Iterator it2 = it;
            ReportFromData reportFromData = new ReportFromData(0L, 0L, null, 0L, 0, 0, 0L, 127, null);
            if (chatMessage2.getIsAcceptMsg()) {
                value = userInfo.getUserIdx();
            } else {
                value = OooOOO.f41216OooO00o.OooOoO0().getValue();
                if (value != null) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                } else {
                    jOooO0oO = 0;
                }
                reportFromData.setPrettyId(jOooO0oO);
                if (chatMessage2.getIsAcceptMsg()) {
                    jOooO0oO2 = userInfo.getUserId();
                } else {
                    value2 = OooOOO.f41216OooO00o.OooOoO0().getValue();
                    if (value2 != null) {
                        Intrinsics.checkNotNullExpressionValue(value2, "value");
                        jOooO0oO2 = OooO.OooO0oO(value2);
                    }
                }
                reportFromData.setUserId(jOooO0oO2);
                reportFromData.getContent();
                contentType = chatMessage2.getContentType();
                string = "";
                if (contentType != 1) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO0o0("");
                    sbOooO0o0.append(chatMessage2.getMessage());
                    string = sbOooO0o0.toString();
                } else if (contentType == 2 && (voiceInfo = chatMessage2.getVoiceInfo()) != null && (voiceUrl = voiceInfo.getVoiceUrl()) != null) {
                    string = voiceUrl;
                }
                reportFromData.setContent(string);
                reportFromData.setSendTime(chatMessage2.getTime());
                int contentType2 = chatMessage2.getContentType();
                reportFromData.setType((contentType2 == 1 && contentType2 == 2) ? 2 : 0);
                if (chatMessage == null) {
                    reportFromData.setReportMessage((chatMessage.getIsAcceptMsg() || chatMessage2.getTime() != chatMessage.getTime()) ? 0 : 1);
                }
                list.add(reportFromData);
                it = it2;
            }
            jOooO0oO = OooO.OooO0oO(value);
            reportFromData.setPrettyId(jOooO0oO);
            if (chatMessage2.getIsAcceptMsg()) {
                jOooO0oO2 = userInfo.getUserId();
            } else {
                value2 = OooOOO.f41216OooO00o.OooOoO0().getValue();
                if (value2 != null) {
                    Intrinsics.checkNotNullExpressionValue(value2, "value");
                    jOooO0oO2 = OooO.OooO0oO(value2);
                }
            }
            reportFromData.setUserId(jOooO0oO2);
            reportFromData.getContent();
            contentType = chatMessage2.getContentType();
            string = "";
            if (contentType != 1) {
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("");
                sbOooO0o1.append(chatMessage2.getMessage());
                string = sbOooO0o1.toString();
            } else if (contentType == 2) {
                string = voiceUrl;
            }
            reportFromData.setContent(string);
            reportFromData.setSendTime(chatMessage2.getTime());
            int contentType3 = chatMessage2.getContentType();
            reportFromData.setType((contentType3 == 1 && contentType3 == 2) ? 2 : 0);
            if (chatMessage == null) {
                reportFromData.setReportMessage((chatMessage.getIsAcceptMsg() || chatMessage2.getTime() != chatMessage.getTime()) ? 0 : 1);
            }
            list.add(reportFromData);
            it = it2;
        }
    }
}
