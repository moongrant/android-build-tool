package p485o0o00O0;

import android.app.Activity;
import android.os.Looper;
import android.support.v4.media.session.OooO0o;
import com.android.billingclient.api.o0000OO0;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
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
import p417o0OoO0.o00oO0o;
import p488o0o00O0o.o000OO;
import p488o0o00O0o.o0ooOOo;
import p501o0o00oO0.OooOOO;
import p579o0oOoo.oO00O0o0;
import p584o0oOooO0.oO00OOo0;
import p585o0oOooOO.h;
import p590o0oo0.OooOOOO;
import p592o0oo00O.OooOOO0;
import p595o0oo00Oo.o0000Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0oOOo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentSendActivity f48020OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOOo(MomentSendActivity momentSendActivity) {
        super(0);
        this.f48020OooO0Oo = momentSendActivity;
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
        int i = MomentSendActivity.f26175Oooo0OO;
        MomentSendActivity momentSendActivity = this.f48020OooO0Oo;
        momentSendActivity.OooOo().f58558OooO0o.OooO0o0();
        EditTextSpan editTextSpan = momentSendActivity.OooOo().f58559OooO0o0;
        HashMap map = oO00O0o0.f56540OooO0Oo;
        if ((editTextSpan != null ? editTextSpan.getText().length() : 0) > 1000) {
            String strOooO0OO = o00oO0o.OooO0OO(momentSendActivity, oO00OOo0.Input_a_maximum_of_1000_characters);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o2.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                }
            }
        } else if (oO00O0o0.OooO0Oo(momentSendActivity.OooOo().f58559OooO0o0) > 50) {
            String strOooO0OO2 = o00oO0o.OooO0OO(momentSendActivity, oO00OOo0.char_room_edit1);
            if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                o000Oo0 o000oo0OooO00o3 = o000O00.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o3.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o3);
                }
            }
        } else if (momentSendActivity.OooOoO0().getType() == MomentType.Share.getValue() || momentSendActivity.OooOoO0().getType() == MomentType.Forward.getValue() || !Intrinsics.areEqual("", StringsKt.trim((CharSequence) momentSendActivity.OooOo().f58559OooO0o0.getText().toString()).toString()) || momentSendActivity.OooOoO().OooO0O0()) {
            Collection collection = momentSendActivity.OooOoO().f48450OooO0OO.f10111OooOOoo;
            Intrinsics.checkNotNull(collection, "null cannot be cast to non-null type java.util.ArrayList<com.yalla.yalla.model.MomentSelectMedia>{ kotlin.collections.TypeAliasesKt.ArrayList<com.yalla.yalla.model.MomentSelectMedia> }");
            ArrayList<MomentSelectMedia> arrayList = (ArrayList) collection;
            MomentLogSourcePage momentLogSourcePageOooO00o = OooOOO.OooO00o(momentSendActivity.OooOoO0().getMomentAdapterTag());
            if (momentLogSourcePageOooO00o != null && momentSendActivity.OooOoO0().getForwardMomentDetailModel() != null) {
                MomentDetailModel forwardMomentDetailModel = momentSendActivity.OooOoO0().getForwardMomentDetailModel();
                if (!OooOOOO.OooO0oo(String.valueOf(forwardMomentDetailModel != null ? Long.valueOf(forwardMomentDetailModel.getUserId()) : null))) {
                    MomentLogActionTypeForward momentLogActionTypeForward = new MomentLogActionTypeForward(null, null, 3, null);
                    MomentDetailModel forwardMomentDetailModel2 = momentSendActivity.OooOoO0().getForwardMomentDetailModel();
                    momentLogActionTypeForward.setObject_userid(String.valueOf(forwardMomentDetailModel2 != null ? Long.valueOf(forwardMomentDetailModel2.getUserId()) : null));
                    MomentDetailModel forwardMomentDetailModel3 = momentSendActivity.OooOoO0().getForwardMomentDetailModel();
                    if (forwardMomentDetailModel3 == null || (strOooOOO0 = o0OoOo0.OooOOO0("", Long.valueOf(forwardMomentDetailModel3.getId()))) == null) {
                        strOooOOO0 = "";
                    }
                    momentLogActionTypeForward.setDiscoveryid(strOooOOO0);
                    WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                    MomentLogActionType momentLogActionType = MomentLogActionType.forward;
                    String json = momentLogActionTypeForward.toJson();
                    MomentDetailModel forwardMomentDetailModel4 = momentSendActivity.OooOoO0().getForwardMomentDetailModel();
                    String sessionId = forwardMomentDetailModel4 != null ? forwardMomentDetailModel4.getSessionId() : null;
                    webEventRepository.getClass();
                    WebEventRepository.OooO0o(momentLogSourcePageOooO00o, momentLogActionType, json, sessionId);
                }
            }
            o000OO o000oo2 = momentSendActivity.f26184OooOoOO;
            if (o000oo2 != null) {
                final MomentSendModel momentSendModelOooOoOO = momentSendActivity.OooOoOO();
                TopicInfoModel topicInfoModel = momentSendActivity.f26177OooOo;
                o0O00OOO o0o00ooo2 = new o0O00OOO(momentSendActivity);
                o000oo2.f48443OooO0o = topicInfoModel;
                OooOOO0.OooO0O0("PostContentUtils sendPost");
                EditTextSpan editTextSpan2 = o000oo2.f48440OooO0O0;
                int iOooO0OO = editTextSpan2.getSpanManager().OooO0OO("@");
                int i2 = o000oo2.f48442OooO0Oo;
                Activity activity = o000oo2.f48439OooO00o;
                if (iOooO0OO > i2) {
                    String strOooO00o = o0000O.OooO00o(activity.getString(oO00OOo0.Mention_a_maximum_of_XXX_people), "" + o000oo2.f48442OooO0Oo);
                    if (!StringsKt.isBlank(strOooO00o)) {
                        o000Oo0 o000oo0OooO00o4 = o000O00.OooO00o(strOooO00o, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o4.run();
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o4);
                        }
                    }
                } else {
                    if (editTextSpan2.getSpanManager().OooO0OO("#") > o000oo2.f48444OooO0o0) {
                        String string2 = activity.getString(oO00OOo0.You_can_add_3_topics_at_most);
                        if (!(string2 == null || StringsKt.isBlank(string2))) {
                            o000Oo0 o000oo0OooO00o5 = o000O00.OooO00o(string2, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o5.run();
                            } else {
                                o000O0.f10355OooO0O0.post(o000oo0OooO00o5);
                            }
                        }
                    } else {
                        MomentSendContentModel momentSendContentModel = new MomentSendContentModel(o0000Ooo.OooO00o(activity, editTextSpan2));
                        int i3 = 0;
                        for (ArrayList<? extends h> arrayListOooO0O0 = editTextSpan2.getSpanManager().OooO0O0("@"); i3 < arrayListOooO0O0.size(); arrayListOooO0O0 = arrayListOooO0O0) {
                            h hVar = arrayListOooO0O0.get(i3);
                            if (hVar != null) {
                                momentSendContentModel.getAt().add(new MomentSendContentAtModel(OooO0o.OooO0O0(new StringBuilder(), hVar.f56771OooO0o0, ""), hVar.f56769OooO0Oo));
                            }
                            i3++;
                        }
                        TopicInfoModel topicInfoModel2 = o000oo2.f48443OooO0o;
                        if (topicInfoModel2 != null && topicInfoModel2.getId() > 0) {
                            momentSendContentModel.setCircle(o000oo2.f48443OooO0o.getId(), o000oo2.f48443OooO0o.getName());
                        }
                        if (momentSendContentModel.getContent().isEmpty() && o000oo2.f48445OooO0oO.getType() == MomentType.Share.getValue()) {
                            if (o000oo2.f48445OooO0oO.getRoomShareModel() != null) {
                                momentSendContentModel.setContent(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Room_ID_XXX), o000oo2.f48445OooO0oO.getRoomShareModel().getRoomIdx()));
                            }
                            if (o000oo2.f48445OooO0oO.getEventModel() != null) {
                                momentSendContentModel.setContent(o0000.OooO0OO(oO00OOo0.event_share_moment));
                            }
                        }
                        momentSendModelOooOoOO.setContent(momentSendContentModel);
                        if (momentSendModelOooOoOO.getType() == MomentType.Text.getValue() || momentSendModelOooOoOO.getType() == MomentType.Image.getValue() || momentSendModelOooOoOO.getType() == MomentType.Video.getValue()) {
                            o0ooOOo.OooO00o(arrayList, new Function1() { // from class: o0o00O0o.o0000O0O
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    momentSendModelOooOoOO.setType(((MomentType) obj).getValue());
                                    return null;
                                }
                            });
                        }
                        OooOOO0.OooO0oO("sendPost sendPostModel.Text = " + momentSendContentModel.getContent() + ", sendPostModel.Text.Length = " + momentSendContentModel.getContent().length() + "\n sendPostModel = " + momentSendModelOooOoOO.toJSONString());
                    }
                    if (momentSendModelOooOoOO != null) {
                        if (momentSendModelOooOoOO.getContent().getCircleId() > 0) {
                            z = true;
                            if (o0000OO0.OooO0O0().OooO0O0("FIRST_SEND_POST_FOR_TOPIC", true)) {
                                o0000OO0.OooO0O0().OooO0o("FIRST_SEND_POST_FOR_TOPIC", false);
                                string = activity.getString(oO00OOo0.first_send_post_for_topic);
                                if (string != null && !StringsKt.isBlank(string)) {
                                    z = false;
                                }
                                if (!z) {
                                    o000oo0OooO00o = o000O00.OooO00o(string, "runnable");
                                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                        o000oo0OooO00o.run();
                                    } else {
                                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                                    }
                                }
                            }
                        }
                        momentSendModelOooOoOO.setPoll(o000oo2.f48441OooO0OO.getSendMomentPoll());
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
                        o0o00ooo2.invoke(momentSendModelOooOoOO);
                    }
                }
                momentSendModelOooOoOO = null;
                if (momentSendModelOooOoOO != null) {
                    if (momentSendModelOooOoOO.getContent().getCircleId() > 0) {
                        z = true;
                        if (o0000OO0.OooO0O0().OooO0O0("FIRST_SEND_POST_FOR_TOPIC", true)) {
                            o0000OO0.OooO0O0().OooO0o("FIRST_SEND_POST_FOR_TOPIC", false);
                            string = activity.getString(oO00OOo0.first_send_post_for_topic);
                            if (string != null) {
                                z = false;
                            }
                            if (!z) {
                                o000oo0OooO00o = o000O00.OooO00o(string, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    o000oo0OooO00o.run();
                                } else {
                                    o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                                }
                            }
                        }
                    }
                    momentSendModelOooOoOO.setPoll(o000oo2.f48441OooO0OO.getSendMomentPoll());
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
                    o0o00ooo2.invoke(momentSendModelOooOoOO);
                }
            }
        } else {
            String strOooO0OO3 = o00oO0o.OooO0OO(momentSendActivity, oO00OOo0.please_input_dynamic);
            if (!(strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3))) {
                o000Oo0 o000oo0OooO00o6 = o000O00.OooO00o(strOooO0OO3, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o6.run();
                } else {
                    o000O0.f10355OooO0O0.post(o000oo0OooO00o6);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
