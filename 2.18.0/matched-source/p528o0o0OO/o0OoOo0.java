package p528o0o0OO;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.application.App;
import com.app.base.protobuf.MessageIM;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0O0;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import com.yalla.yalla.model.YallaTeamMessageModel;
import com.yalla.yalla.ui.activity.message.FriendRequestMessageActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.OooO00o;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p031OoooO.o0000O;
import p169o00Ooo0.o0ooOOo;
import p255o00ooO0O.o000O0O0;
import p493o0o00O00.OooO0OO;
import p500o0o00Oo0.OooOOO;
import p517o0o0O00.o00O00;
import p518o0o0O000.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0OoOo0 extends OooOo {
    public final YallaTeamMessage OooO0O0(String str, long j) {
        YallaTeamMessage yallaTeamMessage = new YallaTeamMessage();
        yallaTeamMessage.setUid(((Number) OooO00o.OooO00o(OooOOO.f41235OooO00o)).longValue());
        yallaTeamMessage.setMid(str);
        yallaTeamMessage.setTime(j);
        return yallaTeamMessage;
    }

    public final void OooO0OO(@NotNull MessageIM.Message msg, boolean z) {
        String message;
        Intrinsics.checkNotNullParameter(msg, "msg");
        o00O00.OooO0OO("YallaTeamMsgProcessor", " parseMessage = " + msg);
        if (msg.getHead() == 2102) {
            MessageIM.Message2102 from = MessageIM.Message2102.parseFrom(msg.getBody());
            String msg2 = from.getMsg();
            Intrinsics.checkNotNullExpressionValue(msg2, "message2102.msg");
            YallaTeamMessageModel yallaTeamMessageModel = (YallaTeamMessageModel) o0Oo0oo.OooO0OO(msg2, YallaTeamMessageModel.class);
            if (yallaTeamMessageModel == null) {
                return;
            }
            StringBuilder sbOooO0O0 = OooO00o.OooO00o.OooO0O0(" type = ");
            sbOooO0O0.append(yallaTeamMessageModel.getType());
            sbOooO0O0.append(" message = ");
            sbOooO0O0.append(yallaTeamMessageModel.getData());
            o00O00.OooO0OO("YallaTeamMsgProcessor", sbOooO0O0.toString());
            int type = yallaTeamMessageModel.getType();
            if (type == 41) {
                int area = from.getArea();
                Integer value = OooOOO.f41235OooO00o.OooOOO().getValue();
                if (value != null && area == value.intValue()) {
                    String mid = msg.getMid();
                    Intrinsics.checkNotNullExpressionValue(mid, "msg.mid");
                    YallaTeamMessage message2 = OooO0O0(mid, msg.getTime());
                    message2.setMessage(yallaTeamMessageModel.getMessage());
                    message2.setTitle(yallaTeamMessageModel.getTitle());
                    message2.setType(5);
                    Intrinsics.checkNotNullParameter(message2, "message");
                    OooO0OO.OooO00o().Oooo0OO().OooO0o(message2);
                    if (TextUtils.isEmpty(message2.getTitle())) {
                        message = yallaTeamMessageModel.getMessage();
                    } else {
                        message = message2.getTitle();
                        if (message == null) {
                            message = "";
                        }
                    }
                    OooO0Oo(message);
                    return;
                }
                return;
            }
            if (type == 43) {
                int area2 = from.getArea();
                Integer value2 = OooOOO.f41235OooO00o.OooOOO().getValue();
                if (value2 != null && area2 == value2.intValue()) {
                    String mid2 = msg.getMid();
                    Intrinsics.checkNotNullExpressionValue(mid2, "msg.mid");
                    YallaTeamMessage message3 = OooO0O0(mid2, msg.getTime());
                    message3.setType(4);
                    Intrinsics.checkNotNullParameter(message3, "message");
                    OooO0OO.OooO00o().Oooo0OO().OooO0o(message3);
                    OooO0Oo(o000O0O0.OooO0OO(R.string.yalla_team_feedback_replied));
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
                YallaTeamMessage message4 = OooO0O0(mid3, msg.getTime());
                YallaTeamMessageModel.Data data = yallaTeamMessageModel.getData();
                if (data == null) {
                    return;
                }
                message4.setType(7);
                YallaTeamMessage.SatisfactionSurvey satisfactionSurvey = new YallaTeamMessage.SatisfactionSurvey();
                satisfactionSurvey.setMessageId(data.getMessageId());
                satisfactionSurvey.setScore(0);
                satisfactionSurvey.setSubmit(false);
                message4.setSatisfactionSurvey(satisfactionSurvey);
                Intrinsics.checkNotNullParameter(message4, "message");
                OooO0OO.OooO00o().Oooo0OO().OooO0o(message4);
                OooO0Oo(o000O0O0.OooO0OO(R.string.yalla_team_satisfaction_survey_title));
                return;
            }
            int area3 = from.getArea();
            Integer value3 = OooOOO.f41235OooO00o.OooOOO().getValue();
            if (value3 != null && area3 == value3.intValue()) {
                String mid4 = msg.getMid();
                Intrinsics.checkNotNullExpressionValue(mid4, "msg.mid");
                YallaTeamMessage message5 = OooO0O0(mid4, msg.getTime());
                YallaTeamMessageModel.Data data2 = yallaTeamMessageModel.getData();
                if (data2 == null) {
                    return;
                }
                message5.setType(5);
                message5.setMessage(data2.getContent());
                message5.setMessageType(data2.getMessageType());
                message5.setJumpType(data2.getJumptype());
                if (data2.getJumptype() == 2 || data2.getJumptype() == 3) {
                    message5.setJumpId(data2.getJumpname());
                } else if (data2.getJumptype() == 105) {
                    message5.setJumpId(data2.getJumpurl());
                } else {
                    message5.setJumpId(data2.getJumpid());
                }
                message5.setCoverImage(data2.getCoverimage());
                message5.setDetailImage(data2.getDetailimage());
                message5.setDetailTitle(data2.getDetailtitle());
                Intrinsics.checkNotNullParameter(message5, "message");
                OooO0OO.OooO00o().Oooo0OO().OooO0o(message5);
                OooO0Oo(data2.getContent());
            }
        }
    }

    public final void OooO0Oo(String str) {
        if (StringsKt.isBlank(str)) {
            return;
        }
        Activity activityOooO0O0 = OooO0O0.f20522OooO00o.OooO0O0();
        if (OooO00o() || (activityOooO0O0 instanceof FriendRequestMessageActivity) || App.f11471Oooo) {
            return;
        }
        String strOooO0OO = o000O0O0.OooO0OO(R.string.Notice_Title_yalla_team);
        Context context = o0000O.f2671OooO00o;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            context = null;
        }
        o0ooOOo.OooO0OO("Yalla_Notice_YallaTeam", strOooO0OO, str, str, new Intent(context, (Class<?>) YallaTeamMessageActivity.class));
    }
}
