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
import p140o00OOooo.OooOO0;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p382o0OOoo0o.o00Ooo;
import p385o0OOooOO.o00oOoo;
import p403o0Oo0OOo.oO0O0Oo0;
import p464o0Oooo.o000000O;
import p579o0oOoo.oO000Oo0;
import p581o0oOoo00.o000OOo;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentSendRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendRepo.kt\ncom/yalla/yalla/data/repository/MomentSendRepo\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,157:1\n62#2:158\n62#2:159\n*S KotlinDebug\n*F\n+ 1 MomentSendRepo.kt\ncom/yalla/yalla/data/repository/MomentSendRepo\n*L\n48#1:158\n155#1:159\n*E\n"})
public final class MomentSendRepo {

    public static final class OooO00o extends Lambda implements Function1<MomentSendPollModel.Option, Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f23093OooO0Oo = new OooO00o();

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
        String strOooO0Oo = o000OOo0.OooO0Oo("/Webservers/Moment/PublishV1");
        o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 1);
        o0o0oooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getPower()), "power");
        if ((momentSendModel.getAddress().length() > 0) && momentSendModel.getIsToLocationInfo()) {
            o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(momentSendModel.getAddress()), IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        }
        String longitude = momentSendModel.getLongitude();
        if (!(longitude == null || longitude.length() == 0)) {
            String latitude = momentSendModel.getLatitude();
            if (!(latitude == null || latitude.length() == 0)) {
                o0o0oooOooO00o.OooO0O0(momentSendModel.getLongitude(), "longitude");
                o0o0oooOooO00o.OooO0O0(momentSendModel.getLatitude(), "latitude");
            }
        }
        String notifyUserid = momentSendModel.getNotifyUserid();
        if (!(notifyUserid == null || notifyUserid.length() == 0)) {
            o0o0oooOooO00o.OooO0O0(momentSendModel.getNotifyUserid(), "notifyUserid");
        }
        if (momentSendModel.getSourcesid().length() > 0) {
            o0o0oooOooO00o.OooO0O0(momentSendModel.getSourcesid(), "sourcesid");
        }
        o0o0oooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getType()), "type");
        int type = momentSendModel.getType();
        if (type == MomentType.Share.getValue()) {
            if (momentSendModel.getShareType() != 0) {
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getShareType()), "shareType");
            }
        } else if (type == MomentType.Event.getValue()) {
            if (momentSendModel.getShareType() != 0) {
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getShareType()), "shareType");
            }
        } else if (type == MomentType.Poll.getValue() && momentSendModel.getShareType() != 0) {
            o0o0oooOooO00o.OooO0O0(Boxing.boxInt(momentSendModel.getShareType()), "shareType");
        }
        MomentSendPollModel poll = momentSendModel.getPoll();
        if (poll != null) {
            CollectionsKt.removeAll((List) poll.getOption(), (Function1) OooO00o.f23093OooO0Oo);
            o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(poll.toJSONString()), "voteContent");
        }
        MomentSendContentModel content = momentSendModel.getContent();
        if (content != null && content.getCircleId() > 0) {
            TopicRecentTable topicRecentTable = new TopicRecentTable();
            topicRecentTable.topicId = content.getCircleId();
            topicRecentTable.topicName = content.getCircleName();
            topicRecentTable.createTime = System.currentTimeMillis();
            o000OOo.OooO00o().Oooo00O().OooO0OO(topicRecentTable);
            oO0O0Oo0 oo0o0oo0Oooo00O = o000OOo.OooO00o().Oooo00O();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            ArrayList arrayListOooO00o = oo0o0oo0Oooo00O.OooO00o(String.valueOf(o000000O.OooOOo0().getValue()));
            if (arrayListOooO00o.size() > 10) {
                o000OOo.OooO00o().Oooo00O().OooO0O0((TopicRecentTable) arrayListOooO00o.get(arrayListOooO00o.size() - 1));
            }
            o0o0oooOooO00o.OooO0O0(String.valueOf(content.getCircleId()), "circleId");
            o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(content.getCircleName()), "circleName");
        }
        if (!o00Ooo.OooO0o()) {
            o0o0oooOooO00o.OooO0O0(OooOO0.OooO00o(momentSendModel.getContent()), "content");
            OooOOO0.OooO0O0("sendPost params  = " + o0o0oooOooO00o.f44062OooO0OO);
        }
        o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(OooOO0.OooO00o(momentSendModel.getContent())), "content");
        return OooOOO.OooO0Oo(new MomentSendRepo$sendPost$$inlined$call$1(o0o0oooOooO00o, null), continuation);
    }
}
