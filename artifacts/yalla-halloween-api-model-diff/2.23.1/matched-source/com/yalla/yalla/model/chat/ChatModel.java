package com.yalla.yalla.model.chat;

import OooO0OO.OooO0O0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.room.Room;
import com.app.base.protobuf.room.RoomTreasureBox;
import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import com.yalla.yalla.data.db.model.ChatMessageOld;
import com.yalla.yalla.model.AtUserInfoModel;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.room.NewRoomUserInfoTransformutilsKt;
import com.yalla.yalla.model.room.RoomMessageReplyInfo;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o000O0Oo.OooOO0O;
import o000O0Oo.o00O0O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0014\u008a\u0002\u008b\u0002\u008c\u0002\u008d\u0002\u008e\u0002\u008f\u0002\u0090\u0002\u0091\u0002\u0092\u0002\u0093\u0002B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0087\u0002\u001a\u00020V2\u0007\u0010\u0088\u0002\u001a\u00020\u001eJ\t\u0010\u0089\u0002\u001a\u00020\u0012H\u0016R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001e\u0010)\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001a\"\u0004\b+\u0010\u001cR\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010=\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u001a\"\u0004\b?\u0010\u001cR\u001a\u0010@\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010 \"\u0004\bB\u0010\"R\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001c\u0010I\u001a\u0004\u0018\u00010JX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001c\u0010O\u001a\u0004\u0018\u00010PX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u001a\u0010U\u001a\u00020VX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010[\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u001a\"\u0004\b]\u0010\u001cR\u001a\u0010^\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u001a\"\u0004\b`\u0010\u001cR\u001c\u0010a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u0014\"\u0004\bc\u0010\u0016R\u001a\u0010d\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u001a\"\u0004\bf\u0010\u001cR\u001c\u0010g\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0014\"\u0004\bi\u0010\u0016R\u001a\u0010j\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u001a\"\u0004\bl\u0010\u001cR\u001a\u0010m\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u001a\"\u0004\bo\u0010\u001cR\u001a\u0010p\u001a\u00020\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010\u001a\"\u0004\br\u0010\u001cR\u001c\u0010s\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bt\u0010\u0014\"\u0004\bu\u0010\u0016R\u001c\u0010v\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010\u0014\"\u0004\bx\u0010\u0016R\u0011\u0010y\u001a\u00020V8F¢\u0006\u0006\u001a\u0004\by\u0010XR\u001a\u0010z\u001a\u00020VX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010X\"\u0004\b{\u0010ZR\u001a\u0010|\u001a\u00020VX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010X\"\u0004\b}\u0010ZR\u001b\u0010~\u001a\u00020VX\u0086\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010X\"\u0005\b\u0080\u0001\u0010ZR\u001d\u0010\u0081\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u001a\"\u0005\b\u0083\u0001\u0010\u001cR\u001d\u0010\u0084\u0001\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010 \"\u0005\b\u0086\u0001\u0010\"R\u001d\u0010\u0087\u0001\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010 \"\u0005\b\u0089\u0001\u0010\"R\u001d\u0010\u008a\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u001a\"\u0005\b\u008c\u0001\u0010\u001cR\"\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001d\u0010\u0093\u0001\u001a\u00020VX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010X\"\u0005\b\u0095\u0001\u0010ZR\"\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0097\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001f\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010\u0014\"\u0005\b\u009e\u0001\u0010\u0016R\u001d\u0010\u009f\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b \u0001\u0010\u001a\"\u0005\b¡\u0001\u0010\u001cR\u001d\u0010¢\u0001\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0001\u0010 \"\u0005\b¤\u0001\u0010\"R$\u0010¥\u0001\u001a\u0005\u0018\u00010¦\u00018FX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R$\u0010«\u0001\u001a\u0005\u0018\u00010¦\u00018FX\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¬\u0001\u0010¨\u0001\"\u0006\b\u00ad\u0001\u0010ª\u0001R\u001f\u0010®\u0001\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¯\u0001\u0010\u0014\"\u0005\b°\u0001\u0010\u0016R\u001d\u0010±\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b²\u0001\u0010\u001a\"\u0005\b³\u0001\u0010\u001cR\u001d\u0010´\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bµ\u0001\u0010\u001a\"\u0005\b¶\u0001\u0010\u001cR\u001d\u0010·\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¸\u0001\u0010\u001a\"\u0005\b¹\u0001\u0010\u001cR\"\u0010º\u0001\u001a\u0005\u0018\u00010»\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R\"\u0010À\u0001\u001a\u0005\u0018\u00010Á\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R\u001d\u0010Æ\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÇ\u0001\u0010\u001a\"\u0005\bÈ\u0001\u0010\u001cR\u001d\u0010É\u0001\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÊ\u0001\u0010 \"\u0005\bË\u0001\u0010\"R\u001f\u0010Ì\u0001\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÍ\u0001\u0010\u0014\"\u0005\bÎ\u0001\u0010\u0016R&\u0010Ï\u0001\u001a\u0005\u0018\u00010Ð\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÑ\u0001\u0010Ò\u0001\"\u0006\bÓ\u0001\u0010Ô\u0001R\u001d\u0010Õ\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bÖ\u0001\u0010\u001a\"\u0005\b×\u0001\u0010\u001cR\"\u0010Ø\u0001\u001a\u0005\u0018\u00010Ù\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R\u0011\u0010Þ\u0001\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010ß\u0001\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bà\u0001\u0010\u0014\"\u0005\bá\u0001\u0010\u0016R\u001f\u0010â\u0001\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bã\u0001\u0010\u0014\"\u0005\bä\u0001\u0010\u0016R\u001d\u0010å\u0001\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bæ\u0001\u0010 \"\u0005\bç\u0001\u0010\"R\"\u0010è\u0001\u001a\u0005\u0018\u00010é\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\bì\u0001\u0010í\u0001R\u001d\u0010î\u0001\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bï\u0001\u0010\u001a\"\u0005\bð\u0001\u0010\u001cR\u001d\u0010ñ\u0001\u001a\u00020\u0012X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bò\u0001\u0010\u0014\"\u0005\bó\u0001\u0010\u0016R\u001d\u0010ô\u0001\u001a\u00020\u0012X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bõ\u0001\u0010\u0014\"\u0005\bö\u0001\u0010\u0016R\u001d\u0010÷\u0001\u001a\u00020\u001eX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bø\u0001\u0010 \"\u0005\bù\u0001\u0010\"R\u001d\u0010ú\u0001\u001a\u00020VX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\bû\u0001\u0010X\"\u0005\bü\u0001\u0010ZR)\u0010ý\u0001\u001a\f\u0012\u0005\u0012\u00030ÿ\u0001\u0018\u00010þ\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002\"\u0006\b\u0082\u0002\u0010\u0083\u0002R\u001d\u0010\u0084\u0002\u001a\u00020\u0018X\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0002\u0010\u001a\"\u0005\b\u0086\u0002\u0010\u001c¨\u0006\u0094\u0002"}, d2 = {"Lcom/yalla/yalla/model/chat/ChatModel;", "", "()V", "aites", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/AtUserInfoModel;", "Lkotlin/collections/ArrayList;", "getAites", "()Ljava/util/ArrayList;", "setAites", "(Ljava/util/ArrayList;)V", "applyMicSwitchModel", "Lcom/yalla/yalla/model/chat/ChatModel$ApplyMicSwitchModel;", "getApplyMicSwitchModel", "()Lcom/yalla/yalla/model/chat/ChatModel$ApplyMicSwitchModel;", "setApplyMicSwitchModel", "(Lcom/yalla/yalla/model/chat/ChatModel$ApplyMicSwitchModel;)V", "atHead", "", "getAtHead", "()Ljava/lang/String;", "setAtHead", "(Ljava/lang/String;)V", "atType", "", "getAtType", "()I", "setAtType", "(I)V", "balance", "", "getBalance", "()J", "setBalance", "(J)V", "becomeMemberModel", "Lcom/yalla/yalla/model/chat/ChatModel$BecomeMemberModel;", "getBecomeMemberModel", "()Lcom/yalla/yalla/model/chat/ChatModel$BecomeMemberModel;", "setBecomeMemberModel", "(Lcom/yalla/yalla/model/chat/ChatModel$BecomeMemberModel;)V", "blindBoxLevel", "getBlindBoxLevel", "setBlindBoxLevel", "contributionUpModel", "Lcom/yalla/yalla/model/chat/ChatModel$ContributionUpModel;", "getContributionUpModel", "()Lcom/yalla/yalla/model/chat/ChatModel$ContributionUpModel;", "setContributionUpModel", "(Lcom/yalla/yalla/model/chat/ChatModel$ContributionUpModel;)V", "emjUrl", "getEmjUrl", "setEmjUrl", "eventModel", "Lcom/yalla/yalla/model/event/EventModel;", "getEventModel", "()Lcom/yalla/yalla/model/event/EventModel;", "setEventModel", "(Lcom/yalla/yalla/model/event/EventModel;)V", "from", "Lcom/yalla/yalla/model/room/RoomUserInfoDTO;", "fromboxid", "getFromboxid", "setFromboxid", "fromcoin", "getFromcoin", "setFromcoin", "getBonusMessage", "Lcom/app/base/protobuf/room/Room$GetBonusMessage;", "getGetBonusMessage", "()Lcom/app/base/protobuf/room/Room$GetBonusMessage;", "setGetBonusMessage", "(Lcom/app/base/protobuf/room/Room$GetBonusMessage;)V", "gif", "Lcom/yalla/yalla/data/db/model/ChatMessageOld$Gif;", "getGif", "()Lcom/yalla/yalla/data/db/model/ChatMessageOld$Gif;", "setGif", "(Lcom/yalla/yalla/data/db/model/ChatMessageOld$Gif;)V", "giftBlindBoxNotify", "Lcom/app/base/protobuf/room/Room$MessageBlindBoxNotify;", "getGiftBlindBoxNotify", "()Lcom/app/base/protobuf/room/Room$MessageBlindBoxNotify;", "setGiftBlindBoxNotify", "(Lcom/app/base/protobuf/room/Room$MessageBlindBoxNotify;)V", "giftFromBackpack", "", "getGiftFromBackpack", "()Z", "setGiftFromBackpack", "(Z)V", "giftPrice", "getGiftPrice", "setGiftPrice", "giftType", "getGiftType", "setGiftType", "giftUrl", "getGiftUrl", "setGiftUrl", "giftUserType", "getGiftUserType", "setGiftUserType", "giftVideoUrl", "getGiftVideoUrl", "setGiftVideoUrl", "giftid", "getGiftid", "setGiftid", "giftsubtype", "getGiftsubtype", "setGiftsubtype", "hatsID", "getHatsID", "setHatsID", "hatsUrl", "getHatsUrl", "setHatsUrl", "id", "getId", "setId", "isGetLuckyNumber", "isSkillCard", "setSkillCard", "isTie", "setTie", "luckNumAnim", "getLuckNumAnim", "setLuckNumAnim", "luckSetRole", "getLuckSetRole", "setLuckSetRole", "luckSetRoleUserId", "getLuckSetRoleUserId", "setLuckSetRoleUserId", "lucknum", "getLucknum", "setLucknum", "lucknummode", "getLucknummode", "setLucknummode", "magicVoiceInfo", "Lcom/yalla/yalla/model/chat/ChatModel$MagicVoiceInfo;", "getMagicVoiceInfo", "()Lcom/yalla/yalla/model/chat/ChatModel$MagicVoiceInfo;", "setMagicVoiceInfo", "(Lcom/yalla/yalla/model/chat/ChatModel$MagicVoiceInfo;)V", "memberBadgeActivate", "getMemberBadgeActivate", "setMemberBadgeActivate", "memberUpLevelModel", "Lcom/yalla/yalla/model/chat/ChatModel$MemberUpLevelModel;", "getMemberUpLevelModel", "()Lcom/yalla/yalla/model/chat/ChatModel$MemberUpLevelModel;", "setMemberUpLevelModel", "(Lcom/yalla/yalla/model/chat/ChatModel$MemberUpLevelModel;)V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "getMessage", "setMessage", "micNumber", "getMicNumber", "setMicNumber", "muuid", "getMuuid", "setMuuid", "newFrom", "Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "getNewFrom", "()Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "setNewFrom", "(Lcom/yalla/yalla/model/room/RoomUserInfoModel;)V", "newTo", "getNewTo", "setNewTo", "num", "getNum", "setNum", "number", "getNumber", "setNumber", "picheight", "getPicheight", "setPicheight", "picwidth", "getPicwidth", "setPicwidth", "pkResult", "Lcom/yalla/yalla/model/chat/ChatModel$PkResult;", "getPkResult", "()Lcom/yalla/yalla/model/chat/ChatModel$PkResult;", "setPkResult", "(Lcom/yalla/yalla/model/chat/ChatModel$PkResult;)V", "pkStart", "Lcom/yalla/yalla/model/chat/ChatModel$PkStart;", "getPkStart", "()Lcom/yalla/yalla/model/chat/ChatModel$PkStart;", "setPkStart", "(Lcom/yalla/yalla/model/chat/ChatModel$PkStart;)V", "pkType", "getPkType", "setPkType", "playTime", "getPlayTime", "setPlayTime", "price", "getPrice", "setPrice", "replyInfo", "Lcom/yalla/yalla/model/room/RoomMessageReplyInfo;", "getReplyInfo", "()Lcom/yalla/yalla/model/room/RoomMessageReplyInfo;", "setReplyInfo", "(Lcom/yalla/yalla/model/room/RoomMessageReplyInfo;)V", "roleReceiving", "getRoleReceiving", "setRoleReceiving", "sendBonusMessage", "Lcom/app/base/protobuf/room/Room$SendBonusMessage;", "getSendBonusMessage", "()Lcom/app/base/protobuf/room/Room$SendBonusMessage;", "setSendBonusMessage", "(Lcom/app/base/protobuf/room/Room$SendBonusMessage;)V", "to", "toHeadphoto", "getToHeadphoto", "setToHeadphoto", "toNickname", "getToNickname", "setToNickname", "toUserId", "getToUserId", "setToUserId", "treasureBoxInfo", "Lcom/yalla/yalla/model/chat/ChatModel$TreasureBoxShow;", "getTreasureBoxInfo", "()Lcom/yalla/yalla/model/chat/ChatModel$TreasureBoxShow;", "setTreasureBoxInfo", "(Lcom/yalla/yalla/model/chat/ChatModel$TreasureBoxShow;)V", "type", "getType", "setType", "uuid", "getUuid", "setUuid", "voteGiftImage", "getVoteGiftImage", "setVoteGiftImage", "voteId", "getVoteId", "setVoteId", "voteIsRunning", "getVoteIsRunning", "setVoteIsRunning", "voteResultList", "", "Lcom/yalla/yalla/model/chat/ChatModel$VoteResult;", "getVoteResultList", "()Ljava/util/List;", "setVoteResultList", "(Ljava/util/List;)V", "wincoinnum", "getWincoinnum", "setWincoinnum", "isMySelfMessage", "myUserId", "toString", "ApplyMicSwitchModel", "BecomeMemberModel", "ContributionUpModel", "GifInfo", "MagicVoiceInfo", "MemberUpLevelModel", "PkResult", "PkStart", "TreasureBoxShow", "VoteResult", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ChatModel {
    public static final int $stable = 8;

    @Nullable
    private ApplyMicSwitchModel applyMicSwitchModel;

    @Nullable
    private String atHead;
    private int atType;
    private long balance;

    @Nullable
    private BecomeMemberModel becomeMemberModel;

    @SerializedName("blindboxlevel")
    private int blindBoxLevel;

    @Nullable
    private ContributionUpModel contributionUpModel;

    @Nullable
    private String emjUrl;

    @Nullable
    private EventModel eventModel;

    @Nullable
    private final RoomUserInfoDTO from;
    private int fromboxid;
    private long fromcoin;

    @Nullable
    private Room.GetBonusMessage getBonusMessage;

    @Nullable
    private ChatMessageOld.Gif gif;

    @Nullable
    private Room.MessageBlindBoxNotify giftBlindBoxNotify;
    private boolean giftFromBackpack;
    private int giftPrice;
    private int giftType;

    @Nullable
    private String giftUrl;
    private int giftUserType;

    @Nullable
    private String giftVideoUrl;
    private int giftid;
    private int giftsubtype;
    private int hatsID;

    @Nullable
    private String hatsUrl;

    @Nullable
    private String id;
    private boolean isSkillCard;
    private boolean isTie;
    private boolean luckNumAnim;
    private int luckSetRole;
    private long luckSetRoleUserId;
    private long lucknum;
    private int lucknummode;

    @Nullable
    private MagicVoiceInfo magicVoiceInfo;
    private boolean memberBadgeActivate;

    @Nullable
    private MemberUpLevelModel memberUpLevelModel;

    @Nullable
    private String message;
    private int micNumber;
    private long muuid;

    @Nullable
    private transient RoomUserInfoModel newFrom;

    @Nullable
    private transient RoomUserInfoModel newTo;

    @Nullable
    private String num;
    private int number;
    private int picheight;
    private int picwidth;

    @Nullable
    private PkResult pkResult;

    @Nullable
    private PkStart pkStart;
    private int pkType;
    private long playTime;

    @Nullable
    private String price;

    @SerializedName("replyinfo")
    @Nullable
    private RoomMessageReplyInfo replyInfo;
    private int roleReceiving;

    @Nullable
    private Room.SendBonusMessage sendBonusMessage;

    @Nullable
    private final RoomUserInfoDTO to;

    @Nullable
    private String toHeadphoto;

    @Nullable
    private String toNickname;
    private long toUserId;

    @Nullable
    private TreasureBoxShow treasureBoxInfo;
    private int type;
    private long voteId;
    private boolean voteIsRunning;

    @Nullable
    private List<VoteResult> voteResultList;
    private int wincoinnum;

    @NotNull
    private String uuid = "";

    @NotNull
    private ArrayList<AtUserInfoModel> aites = new ArrayList<>();

    @NotNull
    private String voteGiftImage = "";

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/model/chat/ChatModel$ApplyMicSwitchModel;", "", "switchUser", "Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "isOpen", "", "(Lcom/yalla/yalla/model/room/RoomUserInfoModel;Z)V", "()Z", "setOpen", "(Z)V", "getSwitchUser", "()Lcom/yalla/yalla/model/room/RoomUserInfoModel;", "setSwitchUser", "(Lcom/yalla/yalla/model/room/RoomUserInfoModel;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ApplyMicSwitchModel {
        public static final int $stable = 8;
        private boolean isOpen;

        @NotNull
        private RoomUserInfoModel switchUser;

        public ApplyMicSwitchModel(@NotNull RoomUserInfoModel switchUser, boolean z) {
            Intrinsics.checkNotNullParameter(switchUser, "switchUser");
            this.switchUser = switchUser;
            this.isOpen = z;
        }

        @NotNull
        public final RoomUserInfoModel getSwitchUser() {
            return this.switchUser;
        }

        /* JADX INFO: renamed from: isOpen, reason: from getter */
        public final boolean getIsOpen() {
            return this.isOpen;
        }

        public final void setOpen(boolean z) {
            this.isOpen = z;
        }

        public final void setSwitchUser(@NotNull RoomUserInfoModel roomUserInfoModel) {
            Intrinsics.checkNotNullParameter(roomUserInfoModel, "<set-?>");
            this.switchUser = roomUserInfoModel;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/chat/ChatModel$BecomeMemberModel;", "", "userId", "", "headphoto", "", "userName", "(JLjava/lang/String;Ljava/lang/String;)V", "haveWelcome", "", "getHaveWelcome", "()Z", "setHaveWelcome", "(Z)V", "getHeadphoto", "()Ljava/lang/String;", "setHeadphoto", "(Ljava/lang/String;)V", "getUserId", "()J", "setUserId", "(J)V", "getUserName", "setUserName", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BecomeMemberModel {
        public static final int $stable = 8;
        private boolean haveWelcome;

        @NotNull
        private String headphoto;
        private long userId;

        @NotNull
        private String userName;

        public BecomeMemberModel(long j, @NotNull String headphoto, @NotNull String userName) {
            Intrinsics.checkNotNullParameter(headphoto, "headphoto");
            Intrinsics.checkNotNullParameter(userName, "userName");
            this.userId = j;
            this.headphoto = headphoto;
            this.userName = userName;
        }

        public final boolean getHaveWelcome() {
            return this.haveWelcome;
        }

        @NotNull
        public final String getHeadphoto() {
            return this.headphoto;
        }

        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getUserName() {
            return this.userName;
        }

        public final void setHaveWelcome(boolean z) {
            this.haveWelcome = z;
        }

        public final void setHeadphoto(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.headphoto = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final void setUserName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userName = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/chat/ChatModel$ContributionUpModel;", "", "type", "", "rank", "userId", "", "userName", "", "(IIJLjava/lang/String;)V", "getRank", "()I", "setRank", "(I)V", "getType", "setType", "getUserId", "()J", "setUserId", "(J)V", "getUserName", "()Ljava/lang/String;", "setUserName", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContributionUpModel {
        public static final int $stable = 8;
        private int rank;
        private int type;
        private long userId;

        @NotNull
        private String userName;

        public ContributionUpModel(int i, int i2, long j, @NotNull String userName) {
            Intrinsics.checkNotNullParameter(userName, "userName");
            this.type = i;
            this.rank = i2;
            this.userId = j;
            this.userName = userName;
        }

        public final int getRank() {
            return this.rank;
        }

        public final int getType() {
            return this.type;
        }

        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getUserName() {
            return this.userName;
        }

        public final void setRank(int i) {
            this.rank = i;
        }

        public final void setType(int i) {
            this.type = i;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final void setUserName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userName = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/chat/ChatModel$GifInfo;", "", "gifId", "", "gifUrl", "", "(ILjava/lang/String;)V", "getGifId", "()I", "setGifId", "(I)V", "getGifUrl", "()Ljava/lang/String;", "setGifUrl", "(Ljava/lang/String;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class GifInfo {
        public static final int $stable = 8;
        private int gifId;

        @NotNull
        private String gifUrl;

        public GifInfo(int i, @NotNull String gifUrl) {
            Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
            this.gifId = i;
            this.gifUrl = gifUrl;
        }

        public final int getGifId() {
            return this.gifId;
        }

        @NotNull
        public final String getGifUrl() {
            return this.gifUrl;
        }

        public final void setGifId(int i) {
            this.gifId = i;
        }

        public final void setGifUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.gifUrl = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/model/chat/ChatModel$MagicVoiceInfo;", "", "cardid", "", "cardUrl", "", "(ILjava/lang/String;)V", "getCardUrl", "()Ljava/lang/String;", "setCardUrl", "(Ljava/lang/String;)V", "getCardid", "()I", "setCardid", "(I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MagicVoiceInfo {
        public static final int $stable = 8;

        @NotNull
        private String cardUrl;
        private int cardid;

        public MagicVoiceInfo(int i, @NotNull String cardUrl) {
            Intrinsics.checkNotNullParameter(cardUrl, "cardUrl");
            this.cardid = i;
            this.cardUrl = cardUrl;
        }

        @NotNull
        public final String getCardUrl() {
            return this.cardUrl;
        }

        public final int getCardid() {
            return this.cardid;
        }

        public final void setCardUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.cardUrl = str;
        }

        public final void setCardid(int i) {
            this.cardid = i;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/chat/ChatModel$MemberUpLevelModel;", "", "userId", "", "userName", "", "userHeader", "level", "", "(JLjava/lang/String;Ljava/lang/String;I)V", "getLevel", "()I", "setLevel", "(I)V", "getUserHeader", "()Ljava/lang/String;", "setUserHeader", "(Ljava/lang/String;)V", "getUserId", "()J", "setUserId", "(J)V", "getUserName", "setUserName", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MemberUpLevelModel {
        public static final int $stable = 8;
        private int level;

        @NotNull
        private String userHeader;
        private long userId;

        @NotNull
        private String userName;

        public MemberUpLevelModel(long j, @NotNull String userName, @NotNull String userHeader, int i) {
            Intrinsics.checkNotNullParameter(userName, "userName");
            Intrinsics.checkNotNullParameter(userHeader, "userHeader");
            this.userId = j;
            this.userName = userName;
            this.userHeader = userHeader;
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }

        @NotNull
        public final String getUserHeader() {
            return this.userHeader;
        }

        public final long getUserId() {
            return this.userId;
        }

        @NotNull
        public final String getUserName() {
            return this.userName;
        }

        public final void setLevel(int i) {
            this.level = i;
        }

        public final void setUserHeader(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userHeader = str;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }

        public final void setUserName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.userName = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/model/chat/ChatModel$PkResult;", "", "()V", "giftNumberA", "", "getGiftNumberA", "()I", "setGiftNumberA", "(I)V", "giftNumberB", "getGiftNumberB", "setGiftNumberB", "giftUrl", "", "getGiftUrl", "()Ljava/lang/String;", "setGiftUrl", "(Ljava/lang/String;)V", "roomNameA", "getRoomNameA", "setRoomNameA", "roomNameB", "getRoomNameB", "setRoomNameB", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PkResult {
        public static final int $stable = 8;
        private int giftNumberA;
        private int giftNumberB;

        @NotNull
        private String roomNameA = "";

        @NotNull
        private String roomNameB = "";

        @NotNull
        private String giftUrl = "";

        public final int getGiftNumberA() {
            return this.giftNumberA;
        }

        public final int getGiftNumberB() {
            return this.giftNumberB;
        }

        @NotNull
        public final String getGiftUrl() {
            return this.giftUrl;
        }

        @NotNull
        public final String getRoomNameA() {
            return this.roomNameA;
        }

        @NotNull
        public final String getRoomNameB() {
            return this.roomNameB;
        }

        public final void setGiftNumberA(int i) {
            this.giftNumberA = i;
        }

        public final void setGiftNumberB(int i) {
            this.giftNumberB = i;
        }

        public final void setGiftUrl(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.giftUrl = str;
        }

        public final void setRoomNameA(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.roomNameA = str;
        }

        public final void setRoomNameB(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.roomNameB = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/model/chat/ChatModel$PkStart;", "", "()V", "roomNameA", "", "getRoomNameA", "()Ljava/lang/String;", "setRoomNameA", "(Ljava/lang/String;)V", "roomNameB", "getRoomNameB", "setRoomNameB", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PkStart {
        public static final int $stable = 8;

        @NotNull
        private String roomNameA = "";

        @NotNull
        private String roomNameB = "";

        @NotNull
        public final String getRoomNameA() {
            return this.roomNameA;
        }

        @NotNull
        public final String getRoomNameB() {
            return this.roomNameB;
        }

        public final void setRoomNameA(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.roomNameA = str;
        }

        public final void setRoomNameB(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.roomNameB = str;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/model/chat/ChatModel$TreasureBoxShow;", "", "()V", "level", "", "getLevel", "()I", "setLevel", "(I)V", "open", "", "getOpen", "()Z", "setOpen", "(Z)V", "treasureBox", "", "Lcom/app/base/protobuf/room/RoomTreasureBox$TreasureBoxDrawAwardUserModel;", "getTreasureBox", "()Ljava/util/List;", "setTreasureBox", "(Ljava/util/List;)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class TreasureBoxShow {
        public static final int $stable = 8;
        private int level = 1;
        private boolean open;

        @Nullable
        private List<RoomTreasureBox.TreasureBoxDrawAwardUserModel> treasureBox;

        public final int getLevel() {
            return this.level;
        }

        public final boolean getOpen() {
            return this.open;
        }

        @Nullable
        public final List<RoomTreasureBox.TreasureBoxDrawAwardUserModel> getTreasureBox() {
            return this.treasureBox;
        }

        public final void setLevel(int i) {
            this.level = i;
        }

        public final void setOpen(boolean z) {
            this.open = z;
        }

        public final void setTreasureBox(@Nullable List<RoomTreasureBox.TreasureBoxDrawAwardUserModel> list) {
            this.treasureBox = list;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/model/chat/ChatModel$VoteResult;", "", "()V", "nickName", "", "getNickName", "()Ljava/lang/String;", "setNickName", "(Ljava/lang/String;)V", "totalCount", "", "getTotalCount", "()I", "setTotalCount", "(I)V", "userId", "", "getUserId", "()J", "setUserId", "(J)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VoteResult {
        public static final int $stable = 8;

        @NotNull
        private String nickName = "";
        private int totalCount;
        private long userId;

        @NotNull
        public final String getNickName() {
            return this.nickName;
        }

        public final int getTotalCount() {
            return this.totalCount;
        }

        public final long getUserId() {
            return this.userId;
        }

        public final void setNickName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.nickName = str;
        }

        public final void setTotalCount(int i) {
            this.totalCount = i;
        }

        public final void setUserId(long j) {
            this.userId = j;
        }
    }

    @NotNull
    public final ArrayList<AtUserInfoModel> getAites() {
        return this.aites;
    }

    @Nullable
    public final ApplyMicSwitchModel getApplyMicSwitchModel() {
        return this.applyMicSwitchModel;
    }

    @Nullable
    public final String getAtHead() {
        return this.atHead;
    }

    public final int getAtType() {
        return this.atType;
    }

    public final long getBalance() {
        return this.balance;
    }

    @Nullable
    public final BecomeMemberModel getBecomeMemberModel() {
        return this.becomeMemberModel;
    }

    public final int getBlindBoxLevel() {
        return this.blindBoxLevel;
    }

    @Nullable
    public final ContributionUpModel getContributionUpModel() {
        return this.contributionUpModel;
    }

    @Nullable
    public final String getEmjUrl() {
        return this.emjUrl;
    }

    @Nullable
    public final EventModel getEventModel() {
        return this.eventModel;
    }

    public final int getFromboxid() {
        return this.fromboxid;
    }

    public final long getFromcoin() {
        return this.fromcoin;
    }

    @Nullable
    public final Room.GetBonusMessage getGetBonusMessage() {
        return this.getBonusMessage;
    }

    @Nullable
    public final ChatMessageOld.Gif getGif() {
        return this.gif;
    }

    @Nullable
    public final Room.MessageBlindBoxNotify getGiftBlindBoxNotify() {
        return this.giftBlindBoxNotify;
    }

    public final boolean getGiftFromBackpack() {
        return this.giftFromBackpack;
    }

    public final int getGiftPrice() {
        return this.giftPrice;
    }

    public final int getGiftType() {
        return this.giftType;
    }

    @Nullable
    public final String getGiftUrl() {
        return this.giftUrl;
    }

    public final int getGiftUserType() {
        return this.giftUserType;
    }

    @Nullable
    public final String getGiftVideoUrl() {
        return this.giftVideoUrl;
    }

    public final int getGiftid() {
        return this.giftid;
    }

    public final int getGiftsubtype() {
        return this.giftsubtype;
    }

    public final int getHatsID() {
        return this.hatsID;
    }

    @Nullable
    public final String getHatsUrl() {
        return this.hatsUrl;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    public final boolean getLuckNumAnim() {
        return this.luckNumAnim;
    }

    public final int getLuckSetRole() {
        return this.luckSetRole;
    }

    public final long getLuckSetRoleUserId() {
        return this.luckSetRoleUserId;
    }

    public final long getLucknum() {
        return this.lucknum;
    }

    public final int getLucknummode() {
        return this.lucknummode;
    }

    @Nullable
    public final MagicVoiceInfo getMagicVoiceInfo() {
        return this.magicVoiceInfo;
    }

    public final boolean getMemberBadgeActivate() {
        return this.memberBadgeActivate;
    }

    @Nullable
    public final MemberUpLevelModel getMemberUpLevelModel() {
        return this.memberUpLevelModel;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final int getMicNumber() {
        return this.micNumber;
    }

    public final long getMuuid() {
        return this.muuid;
    }

    @Nullable
    public final RoomUserInfoModel getNewFrom() {
        if (this.newFrom == null) {
            RoomUserInfoDTO roomUserInfoDTO = this.from;
            this.newFrom = roomUserInfoDTO != null ? NewRoomUserInfoTransformutilsKt.transformToModel(roomUserInfoDTO) : null;
        }
        return this.newFrom;
    }

    @Nullable
    public final RoomUserInfoModel getNewTo() {
        if (this.newTo == null) {
            RoomUserInfoDTO roomUserInfoDTO = this.to;
            this.newTo = roomUserInfoDTO != null ? NewRoomUserInfoTransformutilsKt.transformToModel(roomUserInfoDTO) : null;
        }
        return this.newTo;
    }

    @Nullable
    public final String getNum() {
        return this.num;
    }

    public final int getNumber() {
        return this.number;
    }

    public final int getPicheight() {
        return this.picheight;
    }

    public final int getPicwidth() {
        return this.picwidth;
    }

    @Nullable
    public final PkResult getPkResult() {
        return this.pkResult;
    }

    @Nullable
    public final PkStart getPkStart() {
        return this.pkStart;
    }

    public final int getPkType() {
        return this.pkType;
    }

    public final long getPlayTime() {
        return this.playTime;
    }

    @Nullable
    public final String getPrice() {
        return this.price;
    }

    @Nullable
    public final RoomMessageReplyInfo getReplyInfo() {
        return this.replyInfo;
    }

    public final int getRoleReceiving() {
        return this.roleReceiving;
    }

    @Nullable
    public final Room.SendBonusMessage getSendBonusMessage() {
        return this.sendBonusMessage;
    }

    @Nullable
    public final String getToHeadphoto() {
        return this.toHeadphoto;
    }

    @Nullable
    public final String getToNickname() {
        return this.toNickname;
    }

    public final long getToUserId() {
        return this.toUserId;
    }

    @Nullable
    public final TreasureBoxShow getTreasureBoxInfo() {
        return this.treasureBoxInfo;
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getUuid() {
        return this.uuid;
    }

    @NotNull
    public final String getVoteGiftImage() {
        return this.voteGiftImage;
    }

    public final long getVoteId() {
        return this.voteId;
    }

    public final boolean getVoteIsRunning() {
        return this.voteIsRunning;
    }

    @Nullable
    public final List<VoteResult> getVoteResultList() {
        return this.voteResultList;
    }

    public final int getWincoinnum() {
        return this.wincoinnum;
    }

    public final boolean isGetLuckyNumber() {
        return this.lucknum == ((long) this.number);
    }

    public final boolean isMySelfMessage(long myUserId) {
        RoomUserInfoDTO roomUserInfoDTO = this.from;
        return roomUserInfoDTO != null && roomUserInfoDTO.getUserId() == myUserId;
    }

    /* JADX INFO: renamed from: isSkillCard, reason: from getter */
    public final boolean getIsSkillCard() {
        return this.isSkillCard;
    }

    /* JADX INFO: renamed from: isTie, reason: from getter */
    public final boolean getIsTie() {
        return this.isTie;
    }

    public final void setAites(@NotNull ArrayList<AtUserInfoModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.aites = arrayList;
    }

    public final void setApplyMicSwitchModel(@Nullable ApplyMicSwitchModel applyMicSwitchModel) {
        this.applyMicSwitchModel = applyMicSwitchModel;
    }

    public final void setAtHead(@Nullable String str) {
        this.atHead = str;
    }

    public final void setAtType(int i) {
        this.atType = i;
    }

    public final void setBalance(long j) {
        this.balance = j;
    }

    public final void setBecomeMemberModel(@Nullable BecomeMemberModel becomeMemberModel) {
        this.becomeMemberModel = becomeMemberModel;
    }

    public final void setBlindBoxLevel(int i) {
        this.blindBoxLevel = i;
    }

    public final void setContributionUpModel(@Nullable ContributionUpModel contributionUpModel) {
        this.contributionUpModel = contributionUpModel;
    }

    public final void setEmjUrl(@Nullable String str) {
        this.emjUrl = str;
    }

    public final void setEventModel(@Nullable EventModel eventModel) {
        this.eventModel = eventModel;
    }

    public final void setFromboxid(int i) {
        this.fromboxid = i;
    }

    public final void setFromcoin(long j) {
        this.fromcoin = j;
    }

    public final void setGetBonusMessage(@Nullable Room.GetBonusMessage getBonusMessage) {
        this.getBonusMessage = getBonusMessage;
    }

    public final void setGif(@Nullable ChatMessageOld.Gif gif) {
        this.gif = gif;
    }

    public final void setGiftBlindBoxNotify(@Nullable Room.MessageBlindBoxNotify messageBlindBoxNotify) {
        this.giftBlindBoxNotify = messageBlindBoxNotify;
    }

    public final void setGiftFromBackpack(boolean z) {
        this.giftFromBackpack = z;
    }

    public final void setGiftPrice(int i) {
        this.giftPrice = i;
    }

    public final void setGiftType(int i) {
        this.giftType = i;
    }

    public final void setGiftUrl(@Nullable String str) {
        this.giftUrl = str;
    }

    public final void setGiftUserType(int i) {
        this.giftUserType = i;
    }

    public final void setGiftVideoUrl(@Nullable String str) {
        this.giftVideoUrl = str;
    }

    public final void setGiftid(int i) {
        this.giftid = i;
    }

    public final void setGiftsubtype(int i) {
        this.giftsubtype = i;
    }

    public final void setHatsID(int i) {
        this.hatsID = i;
    }

    public final void setHatsUrl(@Nullable String str) {
        this.hatsUrl = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setLuckNumAnim(boolean z) {
        this.luckNumAnim = z;
    }

    public final void setLuckSetRole(int i) {
        this.luckSetRole = i;
    }

    public final void setLuckSetRoleUserId(long j) {
        this.luckSetRoleUserId = j;
    }

    public final void setLucknum(long j) {
        this.lucknum = j;
    }

    public final void setLucknummode(int i) {
        this.lucknummode = i;
    }

    public final void setMagicVoiceInfo(@Nullable MagicVoiceInfo magicVoiceInfo) {
        this.magicVoiceInfo = magicVoiceInfo;
    }

    public final void setMemberBadgeActivate(boolean z) {
        this.memberBadgeActivate = z;
    }

    public final void setMemberUpLevelModel(@Nullable MemberUpLevelModel memberUpLevelModel) {
        this.memberUpLevelModel = memberUpLevelModel;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setMicNumber(int i) {
        this.micNumber = i;
    }

    public final void setMuuid(long j) {
        this.muuid = j;
    }

    public final void setNewFrom(@Nullable RoomUserInfoModel roomUserInfoModel) {
        this.newFrom = roomUserInfoModel;
    }

    public final void setNewTo(@Nullable RoomUserInfoModel roomUserInfoModel) {
        this.newTo = roomUserInfoModel;
    }

    public final void setNum(@Nullable String str) {
        this.num = str;
    }

    public final void setNumber(int i) {
        this.number = i;
    }

    public final void setPicheight(int i) {
        this.picheight = i;
    }

    public final void setPicwidth(int i) {
        this.picwidth = i;
    }

    public final void setPkResult(@Nullable PkResult pkResult) {
        this.pkResult = pkResult;
    }

    public final void setPkStart(@Nullable PkStart pkStart) {
        this.pkStart = pkStart;
    }

    public final void setPkType(int i) {
        this.pkType = i;
    }

    public final void setPlayTime(long j) {
        this.playTime = j;
    }

    public final void setPrice(@Nullable String str) {
        this.price = str;
    }

    public final void setReplyInfo(@Nullable RoomMessageReplyInfo roomMessageReplyInfo) {
        this.replyInfo = roomMessageReplyInfo;
    }

    public final void setRoleReceiving(int i) {
        this.roleReceiving = i;
    }

    public final void setSendBonusMessage(@Nullable Room.SendBonusMessage sendBonusMessage) {
        this.sendBonusMessage = sendBonusMessage;
    }

    public final void setSkillCard(boolean z) {
        this.isSkillCard = z;
    }

    public final void setTie(boolean z) {
        this.isTie = z;
    }

    public final void setToHeadphoto(@Nullable String str) {
        this.toHeadphoto = str;
    }

    public final void setToNickname(@Nullable String str) {
        this.toNickname = str;
    }

    public final void setToUserId(long j) {
        this.toUserId = j;
    }

    public final void setTreasureBoxInfo(@Nullable TreasureBoxShow treasureBoxShow) {
        this.treasureBoxInfo = treasureBoxShow;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUuid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uuid = str;
    }

    public final void setVoteGiftImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.voteGiftImage = str;
    }

    public final void setVoteId(long j) {
        this.voteId = j;
    }

    public final void setVoteIsRunning(boolean z) {
        this.voteIsRunning = z;
    }

    public final void setVoteResultList(@Nullable List<VoteResult> list) {
        this.voteResultList = list;
    }

    public final void setWincoinnum(int i) {
        this.wincoinnum = i;
    }

    @NotNull
    public String toString() {
        RoomUserInfoDTO roomUserInfoDTO = this.from;
        RoomUserInfoDTO roomUserInfoDTO2 = this.to;
        int i = this.giftid;
        int i2 = this.giftUserType;
        int i3 = this.giftType;
        long j = this.toUserId;
        String str = this.toNickname;
        String str2 = this.toHeadphoto;
        String str3 = this.id;
        String str4 = this.uuid;
        int i4 = this.type;
        String str5 = this.num;
        String str6 = this.message;
        ArrayList<AtUserInfoModel> arrayList = this.aites;
        int i5 = this.hatsID;
        String str7 = this.hatsUrl;
        int i6 = this.number;
        int i7 = this.picwidth;
        int i8 = this.picheight;
        long j2 = this.balance;
        long j3 = this.playTime;
        MagicVoiceInfo magicVoiceInfo = this.magicVoiceInfo;
        ChatMessageOld.Gif gif = this.gif;
        int i9 = this.micNumber;
        String str8 = this.emjUrl;
        int i10 = this.wincoinnum;
        int i11 = this.pkType;
        long j4 = this.muuid;
        String str9 = this.price;
        boolean z = this.isTie;
        long j5 = this.fromcoin;
        long j6 = this.voteId;
        boolean z2 = this.voteIsRunning;
        List<VoteResult> list = this.voteResultList;
        String str10 = this.voteGiftImage;
        Room.GetBonusMessage getBonusMessage = this.getBonusMessage;
        Room.SendBonusMessage sendBonusMessage = this.sendBonusMessage;
        PkStart pkStart = this.pkStart;
        PkResult pkResult = this.pkResult;
        TreasureBoxShow treasureBoxShow = this.treasureBoxInfo;
        RoomMessageReplyInfo roomMessageReplyInfo = this.replyInfo;
        StringBuilder sb = new StringBuilder("ChatModel{from=");
        sb.append(roomUserInfoDTO);
        sb.append(", to=");
        sb.append(roomUserInfoDTO2);
        sb.append(", giftid=");
        OooOO0O.OooO00o(sb, i, ", giftUserType=", i2, ", giftType=");
        sb.append(i3);
        sb.append(", toUserId=");
        sb.append(j);
        OooO0O0.OooO00o(sb, ", toNickname='", str, "', toHeadphoto='", str2);
        OooO0O0.OooO00o(sb, "', id='", str3, "', uuid='", str4);
        sb.append("', type=");
        sb.append(i4);
        sb.append(", num='");
        sb.append(str5);
        sb.append("', message='");
        sb.append(str6);
        sb.append("', aites=");
        sb.append(arrayList);
        sb.append(", hatsID=");
        sb.append(i5);
        sb.append(", hatsUrl='");
        sb.append(str7);
        sb.append("', number=");
        sb.append(i6);
        sb.append(", picwidth=");
        sb.append(i7);
        sb.append(", picheight=");
        sb.append(i8);
        sb.append(", balance=");
        sb.append(j2);
        o00O0O.OooO00o(sb, ", playTime=", j3, ", magicVoiceInfo=");
        sb.append(magicVoiceInfo);
        sb.append(", gif=");
        sb.append(gif);
        sb.append(", micNumber=");
        sb.append(i9);
        sb.append(", emjUrl='");
        sb.append(str8);
        sb.append("', wincoinnum=");
        OooOO0O.OooO00o(sb, i10, ", pkType=", i11, ", muuid=");
        sb.append(j4);
        sb.append(", price='");
        sb.append(str9);
        sb.append("', isTie=");
        sb.append(z);
        sb.append(", fromcoin=");
        sb.append(j5);
        o00O0O.OooO00o(sb, ", voteId=", j6, ", voteIsRunning=");
        sb.append(z2);
        sb.append(", voteResultList=");
        sb.append(list);
        sb.append(", voteGiftImage='");
        sb.append(str10);
        sb.append("', getBonusMessage=");
        sb.append(getBonusMessage);
        sb.append(", sendBonusMessage=");
        sb.append(sendBonusMessage);
        sb.append(", pkStart=");
        sb.append(pkStart);
        sb.append(", pkResult=");
        sb.append(pkResult);
        sb.append(", treasureBoxInfo=");
        sb.append(treasureBoxShow);
        sb.append(", replyInfo=");
        sb.append(roomMessageReplyInfo);
        sb.append("}");
        return sb.toString();
    }
}
