package p702oO0Oo;

import android.app.Activity;
import android.os.Looper;
import android.support.v4.media.session.OooOOO0;
import android.view.View;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.model.MomentLogActionType;
import com.yalla.yalla.common.model.MomentLogActionTypeCommentReply;
import com.yalla.yalla.model.MomentSendCommentModel;
import com.yalla.yalla.model.MomentSendContentAtModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.view.MomentsMessagesEditView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import p074o000O0oo.OooOOO;
import p169o00Ooo0.o0OoOo0;
import p174o00OooO0.o00OOOO0;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000;
import p255o00ooO0O.o0O0ooO;
import p393o0OOooOo.o0O00000;
import p500o0o00Oo0.oo0oOO0;
import p581o0oOoOOo.b1;
import p581o0oOoOOo.oOo0o0oO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo000o implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f52934Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f52935OoooO00;

    public /* synthetic */ oo000o(Object obj, int i) {
        this.f52934Oooo = i;
        this.f52935OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String jSONString;
        switch (this.f52934Oooo) {
            case 0:
                oo0o0Oo this$0 = (oo0o0Oo) this.f52935OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f52936OooO00o.onBackPressed();
                break;
            case 1:
                TaskActivity this$1 = (TaskActivity) this.f52935OoooO00;
                TaskActivity.OooO00o oooO00o = TaskActivity.f22080o00ooo;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                new oOo0o0oO(this$1).OooOO0();
                o0O00000.OooO0OO("Me_tasks_sign_window");
                break;
            case 2:
                b1 this$2 = (b1) this.f52935OoooO00;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.OooO0O0();
                break;
            default:
                MomentsMessagesEditView this$3 = (MomentsMessagesEditView) this.f52935OoooO00;
                int i = MomentsMessagesEditView.f25017o000oOoO;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                if (StringsKt.isBlank(this$3.f25018Oooo.f49185OooO0O0.getText().toString())) {
                    String strOooO0OO = o000O0O0.OooO0OO(R.string.please_input_dynamic);
                    ToastUtil toastUtil = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                        o0O0ooO o0o0oooOooO0O0 = OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o001 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O0);
                        } else {
                            o0o0oooOooO0O0.run();
                        }
                        break;
                    }
                } else if (o0OoOo0.OooO0o0(this$3.f25018Oooo.f49185OooO0O0) > 500) {
                    String strOooO00o = OooOo.OooO00o(o000O0O0.OooO0OO(R.string.char_room_text_lenght), "500");
                    ToastUtil toastUtil2 = ToastUtil.f12583OooO0O0;
                    if (!StringsKt.isBlank(strOooO00o)) {
                        o0O0ooO o0o0oooOooO0O1 = OooOOO.OooO0O0(toastUtil2, strOooO00o, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o002 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O1);
                        } else {
                            o0o0oooOooO0O1.run();
                        }
                        break;
                    }
                } else if (o0OoOo0.OooO0Oo(this$3.f25018Oooo.f49185OooO0O0) <= 50) {
                    String strOooO00o2 = o00OOOO0.OooO00o((Activity) this$3.getContext(), this$3.f25018Oooo.f49185OooO0O0);
                    Intrinsics.checkNotNullExpressionValue(strOooO00o2, "getAtUserToAtNum(context…ty?, binding.editContent)");
                    MomentSendContentModel momentSendContentModel = new MomentSendContentModel(strOooO00o2);
                    ArrayList<? extends p151o00Oo0Oo.OooOo> arrayListOooO0OO = this$3.f25018Oooo.f49185OooO0O0.getSpanManager().OooO0OO("@");
                    Intrinsics.checkNotNull(arrayListOooO0OO, "null cannot be cast to non-null type java.util.ArrayList<com.app.base.framework.view.editTextSpan.EditTextSpanItem>{ kotlin.collections.TypeAliasesKt.ArrayList<com.app.base.framework.view.editTextSpan.EditTextSpanItem> }");
                    int size = arrayListOooO0OO.size();
                    int i2 = 0;
                    while (true) {
                        String str = "";
                        if (i2 >= size) {
                            MomentSendCommentModel momentSendCommentModel = this$3.mSendPostCommentModel;
                            if (momentSendCommentModel != null) {
                                momentSendCommentModel.setContent(momentSendContentModel);
                                this$3.setClickableOnSend(false);
                                String parentUserId = momentSendCommentModel.getParentUserId();
                                if (!(parentUserId == null || parentUserId.length() == 0)) {
                                    MomentLogActionTypeCommentReply momentLogActionTypeCommentReply = new MomentLogActionTypeCommentReply(null, null, null, null, 15, null);
                                    String parentUserId2 = momentSendCommentModel.getParentUserId();
                                    if (parentUserId2 == null) {
                                        parentUserId2 = "";
                                    }
                                    momentLogActionTypeCommentReply.setObject_userid(parentUserId2);
                                    momentLogActionTypeCommentReply.setDiscoveryid(momentSendCommentModel.getDyid());
                                    String cid = momentSendCommentModel.getCid();
                                    if (cid == null) {
                                        cid = "";
                                    }
                                    momentLogActionTypeCommentReply.setCommentid(cid);
                                    MomentSendContentModel content = momentSendCommentModel.getContent();
                                    if (content != null && (jSONString = content.toJSONString()) != null) {
                                        str = jSONString;
                                    }
                                    momentLogActionTypeCommentReply.setReply_content(str);
                                    MomentLogActionType actionType = MomentLogActionType.comment_reply;
                                    String actionInfo = momentLogActionTypeCommentReply.toJson();
                                    Intrinsics.checkNotNullParameter(actionType, "actionType");
                                    Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
                                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new oo0oOO0(actionType, actionInfo, null, null), 3, null);
                                }
                            }
                            Function1<? super MomentSendCommentModel, Unit> function1 = this$3.f25021OoooO00;
                            if (function1 != null) {
                                function1.invoke(this$3.mSendPostCommentModel);
                            }
                        } else {
                            p151o00Oo0Oo.OooOo oooOo = arrayListOooO0OO.get(i2);
                            Intrinsics.checkNotNullExpressionValue(oooOo, "mListFriendListModel[i]");
                            p151o00Oo0Oo.OooOo oooOo2 = oooOo;
                            List<MomentSendContentAtModel> at = momentSendContentModel.getAt();
                            String strOooO00o3 = OooOOO0.OooO00o(new StringBuilder(), oooOo2.f32195OoooO00, "");
                            String str2 = oooOo2.f32192Oooo;
                            Intrinsics.checkNotNullExpressionValue(str2, "friendListModel.text");
                            at.add(new MomentSendContentAtModel(strOooO00o3, str2));
                            i2++;
                        }
                        break;
                    }
                } else {
                    String strOooO0OO2 = o000O0O0.OooO0OO(R.string.char_room_edit1);
                    ToastUtil toastUtil3 = ToastUtil.f12583OooO0O0;
                    if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                        o0O0ooO o0o0oooOooO0O2 = OooOOO.OooO0O0(toastUtil3, strOooO0OO2, "runnable");
                        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o00O000 o00o003 = o00O000.f34368OooO00o;
                            o00O000.f34370OooO0OO.post(o0o0oooOooO0O2);
                        } else {
                            o0o0oooOooO0O2.run();
                        }
                        break;
                    }
                }
                break;
        }
    }
}
