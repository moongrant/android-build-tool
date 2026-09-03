package o0o0000;

import android.app.Activity;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.protobuf.MessageIM;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.model.YallaTeamMessageModel;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p464o0Oooo.o000000O;
import p579o0oOoo.oOO0O0;
import p581o0oOoo00.o000OOo;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOOOO extends OooOO0O {
    public static YallaTeamMessage OooO0O0(long j, String str) {
        YallaTeamMessage yallaTeamMessage = new YallaTeamMessage();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        yallaTeamMessage.setUid(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
        yallaTeamMessage.setMid(str);
        yallaTeamMessage.setTime(j);
        return yallaTeamMessage;
    }

    public static void OooO0Oo(String str) {
        if (StringsKt.isBlank(str)) {
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (OooOO0O.OooO00o() || (activityOooO0O0 instanceof FriendRequestMessageActivity) || App.f22703OooO0o0) {
            return;
        }
        oOO0O0.OooO0O0("Yalla_Notice_YallaTeam", o0000.OooO0OO(oO00OOo0.Notice_Title_yalla_team), str, str, new Intent(o000O0.OooO00o(), (Class<?>) YallaTeamMessageActivity.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO0OO(@NotNull MessageIM.Message msg, boolean z) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        p592o0oo00O.OooOOO0.OooO0OO("YallaTeamMsgProcessor", " parseMessage = " + msg);
        if (msg.getHead() == 2102) {
            MessageIM.Message2102 from = MessageIM.Message2102.parseFrom(msg.getBody());
            String msg2 = from.getMsg();
            Intrinsics.checkNotNullExpressionValue(msg2, "message2102.msg");
            YallaTeamMessageModel yallaTeamMessageModel = (YallaTeamMessageModel) p140o00OOooo.OooOO0.OooO0O0(YallaTeamMessageModel.class, msg2);
            if (yallaTeamMessageModel == null) {
                return;
            }
            p592o0oo00O.OooOOO0.OooO0OO("YallaTeamMsgProcessor", " type = " + yallaTeamMessageModel.getType() + " message = " + p140o00OOooo.OooOO0.OooO00o(yallaTeamMessageModel.getData()));
            int type = yallaTeamMessageModel.getType();
            if (type == 41) {
                int area = from.getArea();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                Integer num = (Integer) o000000O.OooOOO0().getValue();
                if (num != null && area == num.intValue()) {
                    String mid = msg.getMid();
                    Intrinsics.checkNotNullExpressionValue(mid, "msg.mid");
                    YallaTeamMessage message = OooO0O0(msg.getTime(), mid);
                    message.setTitle(yallaTeamMessageModel.getTitle());
                    message.setMessage(yallaTeamMessageModel.getMessage());
                    message.setType(5);
                    YallaTeamMessageModel.Data data = yallaTeamMessageModel.getData();
                    message.setBuriedPointMessageId(o0OoOo0.OooOOO(data != null ? data.getBuriedPointMessageId() : null, ""));
                    YallaTeamMessageModel.Data data2 = yallaTeamMessageModel.getData();
                    message.setBuriedPointSource(o0OoOo0.OooOOO(data2 != null ? data2.getBuriedPointSource() : null, ""));
                    Intrinsics.checkNotNullParameter(message, "message");
                    o000OOo.OooO00o().Oooo0().OooO0oO(message);
                    String title = message.getTitle();
                    if (title == null) {
                        title = "";
                    }
                    OooO0Oo(title);
                    return;
                }
                return;
            }
            if (type == 43) {
                int area2 = from.getArea();
                o000000O o000000o3 = o000000O.f46674OooO00o;
                Integer num2 = (Integer) o000000O.OooOOO0().getValue();
                if (num2 != null && area2 == num2.intValue()) {
                    String mid2 = msg.getMid();
                    Intrinsics.checkNotNullExpressionValue(mid2, "msg.mid");
                    YallaTeamMessage message2 = OooO0O0(msg.getTime(), mid2);
                    message2.setType(4);
                    YallaTeamMessageModel.Data data3 = yallaTeamMessageModel.getData();
                    message2.setBuriedPointMessageId(o0OoOo0.OooOOO(data3 != null ? data3.getBuriedPointMessageId() : null, ""));
                    YallaTeamMessageModel.Data data4 = yallaTeamMessageModel.getData();
                    message2.setBuriedPointSource(o0OoOo0.OooOOO(data4 != null ? data4.getBuriedPointSource() : null, ""));
                    Intrinsics.checkNotNullParameter(message2, "message");
                    o000OOo.OooO00o().Oooo0().OooO0oO(message2);
                    OooO0Oo(o0000.OooO0OO(oO00OOo0.yalla_team_feedback_replied));
                    return;
                }
                return;
            }
            if (type != 70) {
                if (type != 79) {
                    return;
                }
                String mid3 = msg.getMid();
                Intrinsics.checkNotNullExpressionValue(mid3, "msg.mid");
                YallaTeamMessage message3 = OooO0O0(msg.getTime(), mid3);
                YallaTeamMessageModel.Data data5 = yallaTeamMessageModel.getData();
                if (data5 == null) {
                    return;
                }
                message3.setType(7);
                YallaTeamMessageModel.Data data6 = yallaTeamMessageModel.getData();
                message3.setBuriedPointMessageId(o0OoOo0.OooOOO(data6 != null ? data6.getBuriedPointMessageId() : null, ""));
                YallaTeamMessageModel.Data data7 = yallaTeamMessageModel.getData();
                message3.setBuriedPointSource(o0OoOo0.OooOOO(data7 != null ? data7.getBuriedPointSource() : null, ""));
                YallaTeamMessage.SatisfactionSurvey satisfactionSurvey = new YallaTeamMessage.SatisfactionSurvey();
                satisfactionSurvey.setMessageId(data5.getMessageId());
                satisfactionSurvey.setScore(0);
                satisfactionSurvey.setSubmit(false);
                message3.setSatisfactionSurvey(satisfactionSurvey);
                Intrinsics.checkNotNullParameter(message3, "message");
                o000OOo.OooO00o().Oooo0().OooO0oO(message3);
                OooO0Oo(o0000.OooO0OO(oO00OOo0.yalla_team_satisfaction_survey_title));
                return;
            }
            int area3 = from.getArea();
            o000000O o000000o4 = o000000O.f46674OooO00o;
            Integer num3 = (Integer) o000000O.OooOOO0().getValue();
            if (num3 != null && area3 == num3.intValue()) {
                String mid4 = msg.getMid();
                Intrinsics.checkNotNullExpressionValue(mid4, "msg.mid");
                YallaTeamMessage message4 = OooO0O0(msg.getTime(), mid4);
                YallaTeamMessageModel.Data data8 = yallaTeamMessageModel.getData();
                if (data8 == null) {
                    return;
                }
                message4.setType(5);
                YallaTeamMessageModel.Data data9 = yallaTeamMessageModel.getData();
                message4.setBuriedPointMessageId(o0OoOo0.OooOOO(data9 != null ? data9.getBuriedPointMessageId() : null, ""));
                YallaTeamMessageModel.Data data10 = yallaTeamMessageModel.getData();
                message4.setBuriedPointSource(o0OoOo0.OooOOO(data10 != null ? data10.getBuriedPointSource() : null, ""));
                message4.setMessage(data8.getContent());
                message4.setMessageType(data8.getMessageType());
                message4.setJumpType(data8.getJumptype());
                int jumptype = data8.getJumptype();
                if (jumptype == 2 || jumptype == 3) {
                    message4.setJumpId(data8.getJumpname());
                } else if (jumptype != 105) {
                    message4.setJumpId(data8.getJumpid());
                } else {
                    message4.setJumpId(data8.getJumpurl());
                }
                message4.setCoverImage(data8.getCoverimage());
                message4.setDetailImage(data8.getDetailimage());
                message4.setDetailTitle(data8.getDetailtitle());
                Intrinsics.checkNotNullParameter(message4, "message");
                o000OOo.OooO00o().Oooo0().OooO0oO(message4);
                OooO0Oo(data8.getContent());
            }
        }
    }
}
