package com.yalla.yalla.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.facebook.appevents.integrity.IntegrityManager;
import com.yalla.yalla.data.db.model.TopicRecentTable;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentSendPollModel;
import com.yalla.yalla.model.moment.MomentType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p187o00o00o0.OooO;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p386o0OOooO.oo0o0Oo;
import p407o0Oo0Oo.o0OOO0OO;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOO0OOO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentSendRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendRepo.kt\ncom/yalla/yalla/data/repository/MomentSendRepo\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,157:1\n62#2:158\n62#2:159\n*S KotlinDebug\n*F\n+ 1 MomentSendRepo.kt\ncom/yalla/yalla/data/repository/MomentSendRepo\n*L\n48#1:158\n155#1:159\n*E\n"})
public final class MomentSendRepo {

    public static final class OooO00o extends Lambda implements Function1<MomentSendPollModel.Option, Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f22624OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(MomentSendPollModel.Option option) {
            MomentSendPollModel.Option option2 = option;
            Intrinsics.checkNotNullParameter(option2, "option");
            return Boolean.valueOf(option2.getText().length() == 0);
        }
    }

    @Nullable
    public static Object OooO00o(@NotNull MomentSendModel momentSendModel, @NotNull Continuation continuation) {
        String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Moment/PublishV1");
        o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 1);
        o0oooooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getPower()), "power");
        if ((momentSendModel.getAddress().length() > 0) && momentSendModel.getIsToLocationInfo()) {
            o0oooooOooO00o.OooO0O0(oOO0OOO.OooO0O0(momentSendModel.getAddress()), IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        }
        String longitude = momentSendModel.getLongitude();
        if (!(longitude == null || longitude.length() == 0)) {
            String latitude = momentSendModel.getLatitude();
            if (!(latitude == null || latitude.length() == 0)) {
                o0oooooOooO00o.OooO0O0(momentSendModel.getLongitude(), "longitude");
                o0oooooOooO00o.OooO0O0(momentSendModel.getLatitude(), "latitude");
            }
        }
        String notifyUserid = momentSendModel.getNotifyUserid();
        if (!(notifyUserid == null || notifyUserid.length() == 0)) {
            o0oooooOooO00o.OooO0O0(momentSendModel.getNotifyUserid(), "notifyUserid");
        }
        if (momentSendModel.getSourcesid().length() > 0) {
            o0oooooOooO00o.OooO0O0(momentSendModel.getSourcesid(), "sourcesid");
        }
        o0oooooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getType()), "type");
        int type = momentSendModel.getType();
        if (type == MomentType.Share.getValue()) {
            if (momentSendModel.getShareType() != 0) {
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getShareType()), "shareType");
            }
        } else if (type == MomentType.Event.getValue()) {
            if (momentSendModel.getShareType() != 0) {
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getShareType()), "shareType");
            }
        } else if (type == MomentType.Poll.getValue() && momentSendModel.getShareType() != 0) {
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getShareType()), "shareType");
        }
        MomentSendPollModel poll = momentSendModel.getPoll();
        if (poll != null) {
            CollectionsKt.removeAll((List) poll.getOption(), (Function1) OooO00o.f22624OooO0Oo);
            o0oooooOooO00o.OooO0O0(oOO0OOO.OooO0O0(poll.toJSONString()), "voteContent");
        }
        MomentSendContentModel content = momentSendModel.getContent();
        if (content != null && content.getCircleId() > 0) {
            TopicRecentTable topicRecentTable = new TopicRecentTable();
            topicRecentTable.topicId = content.getCircleId();
            topicRecentTable.topicName = content.getCircleName();
            topicRecentTable.createTime = System.currentTimeMillis();
            o00Oo0.OooO00o().Oooo00o().OooO0OO(topicRecentTable);
            o0OOO0OO o0ooo0ooOooo00o = o00Oo0.OooO00o().Oooo00o();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            ArrayList arrayListOooO00o = o0ooo0ooOooo00o.OooO00o(String.valueOf(o0O00oO0.OooOOo0().getValue()));
            if (arrayListOooO00o.size() > 10) {
                o00Oo0.OooO00o().Oooo00o().OooO0O0((TopicRecentTable) arrayListOooO00o.get(arrayListOooO00o.size() - 1));
            }
            o0oooooOooO00o.OooO0O0(String.valueOf(content.getCircleId()), "circleId");
            o0oooooOooO00o.OooO0O0(oOO0OOO.OooO0O0(content.getCircleName()), "circleName");
        }
        if (!oo0o0Oo.OooO0o()) {
            o0oooooOooO00o.OooO0O0(OooO.OooO00o(momentSendModel.getContent()), "content");
            o0000O00.OooO0O0("sendPost params  = " + o0oooooOooO00o.f43257OooO0OO);
        }
        o0oooooOooO00o.OooO0O0(oOO0OOO.OooO0O0(OooO.OooO00o(momentSendModel.getContent())), "content");
        return OooOOO.OooO0Oo(new MomentSendRepo$sendPost$$inlined$call$1(o0oooooOooO00o, null), continuation);
    }
}
