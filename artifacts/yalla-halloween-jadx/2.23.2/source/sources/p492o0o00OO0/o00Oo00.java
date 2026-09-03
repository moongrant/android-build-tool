package p492o0o00OO0;

import android.app.Activity;
import android.os.Looper;
import android.support.v4.media.session.OooO0OO;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.MomentLogActionType;
import com.yalla.yalla.model.MomentLogActionTypeForward;
import com.yalla.yalla.model.MomentLogSourcePage;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendContentAtModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.ui.view.editTextSpan.EditTextSpan;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p269o00oooo0.o0O0oo0o;
import p423o0OoO0OO.o000;
import p494o0o00OOo.Oooo0;
import p494o0o00OOo.o00000;
import p508o0o00oo0.a0;
import p557o0oOOooO.oOo00ooO;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOO;
import p598o0oo00Oo.o0000O00;
import p599o0oo00o.o00O0O;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f49196OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo00(MomentSendActivity momentSendActivity) {
        super(0);
        this.f49196OooO0Oo = momentSendActivity;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x0374  */
    /* JADX WARN: Code duplicated, block: B:144:0x0382  */
    /* JADX WARN: Code duplicated, block: B:146:0x038f  */
    /* JADX WARN: Code duplicated, block: B:154:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:156:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:157:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:161:0x03de  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ed  */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        boolean z;
        String string;
        o000Oo0 o000oo0OooO00o;
        String strOooOOO0;
        int i = MomentSendActivity.f25726Oooo0OO;
        MomentSendActivity momentSendActivity = this.f49196OooO0Oo;
        momentSendActivity.OooOo().f44320OooO0o.OooO0o0();
        EditTextSpan editTextSpan = momentSendActivity.OooOo().f44321OooO0o0;
        HashMap map = oOO.f57157OooO0Oo;
        if ((editTextSpan != null ? editTextSpan.getText().length() : 0) > 1000) {
            String strOooO0OO = o000.OooO0OO(momentSendActivity, o000000.Input_a_maximum_of_1000_characters);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                }
            }
        } else if (oOO.OooO0Oo(momentSendActivity.OooOo().f44321OooO0o0) > 50) {
            String strOooO0OO2 = o000.OooO0OO(momentSendActivity, o000000.char_room_edit1);
            if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                o000Oo0 o000oo0OooO00o3 = OooOo00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o3.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o3);
                }
            }
        } else if (momentSendActivity.OooOoO0().getType() == MomentType.Share.getValue() || momentSendActivity.OooOoO0().getType() == MomentType.Forward.getValue() || !Intrinsics.areEqual("", StringsKt.trim((CharSequence) momentSendActivity.OooOo().f44321OooO0o0.getText().toString()).toString()) || momentSendActivity.OooOoO().OooO0O0()) {
            Collection collection = momentSendActivity.OooOoO().f49592OooO0OO.f13189OooOOoo;
            Intrinsics.checkNotNull(collection, "null cannot be cast to non-null type java.util.ArrayList<com.yalla.yalla.model.MomentSelectMedia>{ kotlin.collections.TypeAliasesKt.ArrayList<com.yalla.yalla.model.MomentSelectMedia> }");
            ArrayList<MomentSelectMedia> arrayList = (ArrayList) collection;
            MomentLogSourcePage momentLogSourcePageOooO00o = a0.OooO00o(momentSendActivity.OooOoO0().getMomentAdapterTag());
            if (momentLogSourcePageOooO00o != null && momentSendActivity.OooOoO0().getForwardMomentDetailModel() != null) {
                MomentDetailModel forwardMomentDetailModel = momentSendActivity.OooOoO0().getForwardMomentDetailModel();
                if (!o0O0O0Oo.OooO0oo(String.valueOf(forwardMomentDetailModel != null ? Long.valueOf(forwardMomentDetailModel.getUserId()) : null))) {
                    MomentLogActionTypeForward momentLogActionTypeForward = new MomentLogActionTypeForward(null, null, 3, null);
                    MomentDetailModel forwardMomentDetailModel2 = momentSendActivity.OooOoO0().getForwardMomentDetailModel();
                    momentLogActionTypeForward.setObject_userid(String.valueOf(forwardMomentDetailModel2 != null ? Long.valueOf(forwardMomentDetailModel2.getUserId()) : null));
                    MomentDetailModel forwardMomentDetailModel3 = momentSendActivity.OooOoO0().getForwardMomentDetailModel();
                    if (forwardMomentDetailModel3 == null || (strOooOOO0 = o0OoOo0.OooOOO0("", Long.valueOf(forwardMomentDetailModel3.getId()))) == null) {
                        strOooOOO0 = "";
                    }
                    momentLogActionTypeForward.setDiscoveryid(strOooOOO0);
                    WebEventRepository webEventRepository = WebEventRepository.f24430OooO00o;
                    MomentLogActionType momentLogActionType = MomentLogActionType.forward;
                    String json = momentLogActionTypeForward.toJson();
                    MomentDetailModel forwardMomentDetailModel4 = momentSendActivity.OooOoO0().getForwardMomentDetailModel();
                    String sessionId = forwardMomentDetailModel4 != null ? forwardMomentDetailModel4.getSessionId() : null;
                    webEventRepository.getClass();
                    WebEventRepository.OooO0o(momentLogSourcePageOooO00o, momentLogActionType, json, sessionId);
                }
            }
            o00000 o00000Var = momentSendActivity.f25735OooOoOO;
            if (o00000Var != null) {
                final MomentSendModel momentSendModelOooOoOO = momentSendActivity.OooOoOO();
                TopicInfoModel topicInfoModel = momentSendActivity.f25728OooOo;
                o0OoO00O o0ooo00o2 = new o0OoO00O(momentSendActivity);
                o00000Var.f49566OooO0o = topicInfoModel;
                o0000O00.OooO0O0("PostContentUtils sendPost");
                EditTextSpan editTextSpan2 = o00000Var.f49563OooO0O0;
                int iOooO0OO = editTextSpan2.getSpanManager().OooO0OO("@");
                int i2 = o00000Var.f49565OooO0Oo;
                Activity activity = o00000Var.f49562OooO00o;
                if (iOooO0OO > i2) {
                    String strOooO00o = o0000O.OooO00o(activity.getString(o000000.Mention_a_maximum_of_XXX_people), "" + o00000Var.f49565OooO0Oo);
                    if (!StringsKt.isBlank(strOooO00o)) {
                        o000Oo0 o000oo0OooO00o4 = OooOo00.OooO00o(strOooO00o, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o4.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o4);
                        }
                    }
                } else {
                    if (editTextSpan2.getSpanManager().OooO0OO("#") > o00000Var.f49567OooO0o0) {
                        String string2 = activity.getString(o000000.You_can_add_3_topics_at_most);
                        if (!(string2 == null || StringsKt.isBlank(string2))) {
                            o000Oo0 o000oo0OooO00o5 = OooOo00.OooO00o(string2, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o5.run();
                            } else {
                                o000O00O.f13422OooO0O0.post(o000oo0OooO00o5);
                            }
                        }
                    } else {
                        MomentSendContentModel momentSendContentModel = new MomentSendContentModel(o00O0O.OooO00o(activity, editTextSpan2));
                        int i3 = 0;
                        for (ArrayList<? extends oOo00ooO> arrayListOooO0O0 = editTextSpan2.getSpanManager().OooO0O0("@"); i3 < arrayListOooO0O0.size(); arrayListOooO0O0 = arrayListOooO0O0) {
                            oOo00ooO ooo00ooo = arrayListOooO0O0.get(i3);
                            if (ooo00ooo != null) {
                                momentSendContentModel.getAt().add(new MomentSendContentAtModel(OooO0OO.OooO0O0(new StringBuilder(), ooo00ooo.f56182OooO0o0, ""), ooo00ooo.f56180OooO0Oo));
                            }
                            i3++;
                        }
                        TopicInfoModel topicInfoModel2 = o00000Var.f49566OooO0o;
                        if (topicInfoModel2 != null && topicInfoModel2.getId() > 0) {
                            momentSendContentModel.setCircle(o00000Var.f49566OooO0o.getId(), o00000Var.f49566OooO0o.getName());
                        }
                        if (momentSendContentModel.getContent().isEmpty() && o00000Var.f49568OooO0oO.getType() == MomentType.Share.getValue()) {
                            if (o00000Var.f49568OooO0oO.getRoomShareModel() != null) {
                                momentSendContentModel.setContent(o0000O.OooO00o(o0000.OooO0OO(o000000.Room_ID_XXX), o00000Var.f49568OooO0oO.getRoomShareModel().getRoomIdx()));
                            }
                            if (o00000Var.f49568OooO0oO.getEventModel() != null) {
                                momentSendContentModel.setContent(o0000.OooO0OO(o000000.event_share_moment));
                            }
                        }
                        momentSendModelOooOoOO.setContent(momentSendContentModel);
                        if (momentSendModelOooOoOO.getType() == MomentType.Text.getValue() || momentSendModelOooOoOO.getType() == MomentType.Image.getValue() || momentSendModelOooOoOO.getType() == MomentType.Video.getValue()) {
                            Oooo0.OooO00o(arrayList, new Function1() { // from class: o0o00OOo.o000000O
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    momentSendModelOooOoOO.setType(((MomentType) obj).getValue());
                                    return null;
                                }
                            });
                        }
                        o0000O00.OooO0oO("sendPost sendPostModel.Text = " + momentSendContentModel.getContent() + ", sendPostModel.Text.Length = " + momentSendContentModel.getContent().length() + "\n sendPostModel = " + momentSendModelOooOoOO.toJSONString());
                    }
                    if (momentSendModelOooOoOO != null) {
                        if (momentSendModelOooOoOO.getContent().getCircleId() > 0) {
                            z = true;
                            if (o0O0oo0o.OooO00o().OooO0O0("FIRST_SEND_POST_FOR_TOPIC", true)) {
                                o0O0oo0o.OooO00o().OooO0o("FIRST_SEND_POST_FOR_TOPIC", false);
                                string = activity.getString(o000000.first_send_post_for_topic);
                                if (string != null && !StringsKt.isBlank(string)) {
                                    z = false;
                                }
                                if (!z) {
                                    o000oo0OooO00o = OooOo00.OooO00o(string, "runnable");
                                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                        o000oo0OooO00o.run();
                                    } else {
                                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                                    }
                                }
                            }
                        }
                        momentSendModelOooOoOO.setPoll(o00000Var.f49564OooO0OO.getSendMomentPoll());
                        if (momentSendModelOooOoOO.getPoll() != null) {
                            momentSendModelOooOoOO.setType(MomentType.Poll.getValue());
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (MomentSelectMedia momentSelectMedia : arrayList) {
                                if (momentSelectMedia == null && !momentSelectMedia.getPath().isEmpty()) {
                                    arrayList2.add(momentSelectMedia);
                                }
                            }
                            momentSendModelOooOoOO.setListSendPostMedia(arrayList2);
                        }
                        o0ooo00o2.invoke(momentSendModelOooOoOO);
                    }
                }
                momentSendModelOooOoOO = null;
                if (momentSendModelOooOoOO != null) {
                    if (momentSendModelOooOoOO.getContent().getCircleId() > 0) {
                        z = true;
                        if (o0O0oo0o.OooO00o().OooO0O0("FIRST_SEND_POST_FOR_TOPIC", true)) {
                            o0O0oo0o.OooO00o().OooO0o("FIRST_SEND_POST_FOR_TOPIC", false);
                            string = activity.getString(o000000.first_send_post_for_topic);
                            if (string != null) {
                                z = false;
                            }
                            if (!z) {
                                o000oo0OooO00o = OooOo00.OooO00o(string, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    o000oo0OooO00o.run();
                                } else {
                                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                                }
                            }
                        }
                    }
                    momentSendModelOooOoOO.setPoll(o00000Var.f49564OooO0OO.getSendMomentPoll());
                    if (momentSendModelOooOoOO.getPoll() != null) {
                        momentSendModelOooOoOO.setType(MomentType.Poll.getValue());
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        while (r1.hasNext()) {
                            if (momentSelectMedia == null) {
                            }
                        }
                        momentSendModelOooOoOO.setListSendPostMedia(arrayList3);
                    }
                    o0ooo00o2.invoke(momentSendModelOooOoOO);
                }
            }
        } else {
            String strOooO0OO3 = o000.OooO0OO(momentSendActivity, o000000.please_input_dynamic);
            if (!(strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3))) {
                o000Oo0 o000oo0OooO00o6 = OooOo00.OooO00o(strOooO0OO3, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o6.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o6);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
