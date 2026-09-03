package p565o0oOo0;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.Oooo000;
import com.android.billingclient.api.o0Oo0oo;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooO0OO;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.db.table.MomentMessage;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import p174o00OooO0.o00OOOO0;
import p466o0Ooo0oO.o0000O0O;
import p466o0Ooo0oO.o000OO;
import p517o0o0O00.o00O00;
import p522o0o0O0O0.o00Ooo;
import p618o0oo0Ooo.oO0O000o;
import p619o0oo0o.o00oOoo;
import p623o0oo0o0o.oo00o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o0000Ooo extends o0000O0O<MomentMessage> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final MomentVM f45037OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final AppCompatActivity f45038OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final YallaChatVM f45039OooOOoo;

    public static final class OooO00o extends Oooo000.OooO<MomentMessage> {
        @Override // androidx.recyclerview.widget.Oooo000.OooO
        public final boolean OooO00o(MomentMessage momentMessage, MomentMessage momentMessage2) {
            MomentMessage oldItem = momentMessage;
            MomentMessage newItem = momentMessage2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return true;
        }

        @Override // androidx.recyclerview.widget.Oooo000.OooO
        public final boolean OooO0O0(MomentMessage momentMessage, MomentMessage momentMessage2) {
            MomentMessage oldItem = momentMessage;
            MomentMessage newItem = momentMessage2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem.getMid(), newItem.getMid());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000Ooo(@NotNull AppCompatActivity activity, @NotNull MomentVM vm, @NotNull YallaChatVM yallaChatVM) {
        super(Integer.valueOf(R.layout.moment_item_moment_message), new OooO00o());
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(vm, "vm");
        Intrinsics.checkNotNullParameter(yallaChatVM, "yallaChatVM");
        this.f45038OooOOo0 = activity;
        this.f45037OooOOo = vm;
        this.f45039OooOOoo = yallaChatVM;
    }

    @Override // p466o0Ooo0oO.o0000O0O
    public final void OooO0o(o000OO helper, MomentMessage momentMessage) {
        String strOooO0Oo;
        int i;
        MomentSendContentModel momentSendContentModel;
        int i2;
        MomentSendContentModel momentSendContentModel2;
        MomentSendContentModel momentSendContentModel3;
        MomentSendContentModel momentSendContentModel4;
        MomentSendContentModel momentSendContentModel5;
        MomentSendContentModel momentSendContentModel6;
        MomentSendContentModel momentSendContentModel7;
        MomentMessage model = momentMessage;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(model, "item");
        o0000O00 o0000o00 = new o0000O00(this.f45038OooOOo0, helper);
        o0000o00.f45021OooO0Oo = this.f45037OooOOo;
        o0000o00.f45023OooO0o0 = this.f45039OooOOoo;
        int layoutPosition = helper.getLayoutPosition();
        Intrinsics.checkNotNullParameter(model, "model");
        o0000o00.f45020OooO0OO = model;
        o0000o00.OooO00o().f44992OooOOO0.setVisibility(8);
        MomentMessage momentMessage2 = null;
        o0000o00.OooO00o().f44983OooO0Oo.setImageDrawable(null);
        o0000o00.OooO00o().f44985OooO0o0.setText("");
        o0000o00.OooO00o().f44984OooO0o.setVisibility(8);
        o0000o00.OooO00o().f44986OooO0oO.setText("");
        o0000o00.OooO00o().f44986OooO0oO.setVisibility(8);
        o0000o00.OooO00o().f44987OooO0oo.setText("");
        o0000o00.OooO00o().f44988OooOO0.setVisibility(8);
        o0000o00.OooO00o().f44988OooOO0.setImageDrawable(null);
        o0000o00.OooO00o().f44991OooOOO.setText("");
        o0000o00.OooO00o().f44991OooOOO.setVisibility(8);
        StringBuilder sb = new StringBuilder();
        sb.append("setData\nposition ");
        sb.append(layoutPosition);
        sb.append(" \ndata.type ");
        MomentMessage momentMessage3 = o0000o00.f45020OooO0OO;
        if (momentMessage3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage3 = null;
        }
        sb.append(momentMessage3.getType());
        sb.append(" \ndata ");
        MomentMessage momentMessage4 = o0000o00.f45020OooO0OO;
        if (momentMessage4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage4 = null;
        }
        if (momentMessage4 != null) {
            strOooO0Oo = o0Oo0oo.OooO0Oo(momentMessage4);
            Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "{\n                GsonCo…toJson(obj)\n            }");
        } else {
            strOooO0Oo = "";
        }
        sb.append(strOooO0Oo);
        o00O00.OooO0O0(sb.toString());
        MomentMessage momentMessage5 = o0000o00.f45020OooO0OO;
        if (momentMessage5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage5 = null;
        }
        int type = momentMessage5.getType();
        if (type != -12) {
            switch (type) {
                case 1:
                    MomentMessage momentMessage6 = o0000o00.f45020OooO0OO;
                    if (momentMessage6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage6 = null;
                    }
                    MomentMessage.MomentPraise momentPraise = momentMessage6.getMomentPraise();
                    if (momentPraise != null) {
                        o0000o00.OooO00o().f44979OooO.setVisibility(8);
                        oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                        oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
                        oooO00o.f48447OooO0OO = momentPraise.getUserHeadUrl();
                        oooO00o.f48445OooO00o = 0;
                        oooO00o.OooO0o(o0000o00.OooO00o().f44983OooO0Oo);
                        o0000o00.OooO00o().f44985OooO0o0.setText(o00Ooo.f42780OooO00o.OooO0O0(momentPraise.getUserId(), momentPraise.getUserNickName()));
                        TextView textView = o0000o00.OooO00o().f44987OooO0oo;
                        MomentMessage momentMessage7 = o0000o00.f45020OooO0OO;
                        if (momentMessage7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage7 = null;
                        }
                        textView.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage7.getTime(), System.currentTimeMillis()));
                        if (OooO0OO.OooO0O0(momentPraise.getMomentImageUrl())) {
                            oO0O000o.OooO00o oooO00o2 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                            oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o());
                            oooO00o2.OooO0oO(6);
                            oooO00o2.f48447OooO0OO = momentPraise.getMomentImageUrl();
                            i = 0;
                            oooO00o2.f48445OooO00o = 0;
                            oooO00o2.OooO0o(o0000o00.OooO00o().f44988OooOO0);
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(0);
                        } else {
                            i = 0;
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(8);
                        }
                        o0000o00.OooO00o().f44984OooO0o.setVisibility(i);
                        o0000o00.OooO00o().f44984OooO0o.setImageResource(R.drawable.icon_praise_red);
                        o0000o00.OooO00o().f44991OooOOO.setVisibility(i);
                        String content = momentPraise.getMomentContent();
                        Intrinsics.checkNotNullParameter(content, "content");
                        if (!(content.length() == 0)) {
                            momentSendContentModel = new MomentSendContentModel("");
                            try {
                                Object objOooO0OO = o0Oo0oo.OooO0OO(content, new o00oOoo().getType());
                                Intrinsics.checkNotNullExpressionValue(objOooO0OO, "fromJson(content, object…tSendContentModel?>() {})");
                                momentSendContentModel = (MomentSendContentModel) objOooO0OO;
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } else {
                            momentSendContentModel = null;
                        }
                        if (momentSendContentModel != null) {
                            o00OOOO0.OooO0O0(o0000o00.f45018OooO00o, momentSendContentModel, o0000o00.OooO00o().f44991OooOOO, null);
                            o0000o00.OooO00o().f44991OooOOO.getEditableText().insert(0, Html.fromHtml("<font color='#999999'> " + OooOOO.OooO0OO(R.string.Liked_your_comment) + "</font> "));
                        }
                    }
                    break;
                case 2:
                    MomentMessage momentMessage8 = o0000o00.f45020OooO0OO;
                    if (momentMessage8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage8 = null;
                    }
                    MomentMessage.CommentPraise commentPraise = momentMessage8.getCommentPraise();
                    if (commentPraise != null) {
                        o0000o00.OooO00o().f44979OooO.setVisibility(8);
                        oO0O000o.OooO00o oooO00o3 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                        oooO00o3.OooO00o(o00OOO.OooO00o.OooO0o0());
                        oooO00o3.f48447OooO0OO = commentPraise.getUserHeadUrl();
                        oooO00o3.f48445OooO00o = 0;
                        oooO00o3.OooO0o(o0000o00.OooO00o().f44983OooO0Oo);
                        o0000o00.OooO00o().f44985OooO0o0.setText(o00Ooo.f42780OooO00o.OooO0O0(commentPraise.getUserId(), commentPraise.getUserNickName()));
                        TextView textView2 = o0000o00.OooO00o().f44987OooO0oo;
                        MomentMessage momentMessage9 = o0000o00.f45020OooO0OO;
                        if (momentMessage9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage9 = null;
                        }
                        textView2.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage9.getTime(), System.currentTimeMillis()));
                        if (OooO0OO.OooO0O0(commentPraise.getMomentImageUrl())) {
                            oO0O000o.OooO00o oooO00o4 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                            oooO00o4.OooO00o(o00OOO.OooO00o.OooO0o());
                            oooO00o4.OooO0oO(6);
                            oooO00o4.f48447OooO0OO = commentPraise.getMomentImageUrl();
                            i2 = 0;
                            oooO00o4.f48445OooO00o = 0;
                            oooO00o4.OooO0o(o0000o00.OooO00o().f44988OooOO0);
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(0);
                        } else {
                            i2 = 0;
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(8);
                        }
                        o0000o00.OooO00o().f44984OooO0o.setVisibility(i2);
                        o0000o00.OooO00o().f44984OooO0o.setImageResource(R.drawable.icon_praise_red);
                        o0000o00.OooO00o().f44991OooOOO.setVisibility(i2);
                        String content2 = commentPraise.getMomentContent();
                        Intrinsics.checkNotNullParameter(content2, "content");
                        if (content2.length() == 0) {
                            momentSendContentModel2 = null;
                        } else {
                            MomentSendContentModel momentSendContentModel8 = new MomentSendContentModel("");
                            try {
                                Object objOooO0OO2 = o0Oo0oo.OooO0OO(content2, new o00oOoo().getType());
                                Intrinsics.checkNotNullExpressionValue(objOooO0OO2, "fromJson(content, object…tSendContentModel?>() {})");
                                momentSendContentModel2 = (MomentSendContentModel) objOooO0OO2;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                momentSendContentModel2 = momentSendContentModel8;
                            }
                        }
                        if (momentSendContentModel2 != null) {
                            o00OOOO0.OooO0O0(o0000o00.f45018OooO00o, momentSendContentModel2, o0000o00.OooO00o().f44991OooOOO, null);
                            o0000o00.OooO00o().f44991OooOOO.getEditableText().insert(0, Html.fromHtml("<font color='#999999'> " + OooOOO.OooO0OO(R.string.Liked_your_comment) + "</font> "));
                        }
                    }
                    break;
                case 3:
                    MomentMessage momentMessage10 = o0000o00.f45020OooO0OO;
                    if (momentMessage10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage10 = null;
                    }
                    MomentMessage.MomentComment momentComment = momentMessage10.getMomentComment();
                    if (momentComment != null) {
                        o0000o00.OooO00o().f44984OooO0o.setVisibility(8);
                        o0000o00.OooO00o().f44979OooO.setVisibility(0);
                        oO0O000o.OooO00o oooO00o5 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                        oooO00o5.OooO00o(o00OOO.OooO00o.OooO0o0());
                        oooO00o5.f48447OooO0OO = momentComment.getUserHeadUrl();
                        oooO00o5.f48445OooO00o = 0;
                        oooO00o5.OooO0o(o0000o00.OooO00o().f44983OooO0Oo);
                        o0000o00.OooO00o().f44985OooO0o0.setText(o00Ooo.f42780OooO00o.OooO0O0(momentComment.getUserId(), momentComment.getUserNickName()));
                        TextView textView3 = o0000o00.OooO00o().f44987OooO0oo;
                        MomentMessage momentMessage11 = o0000o00.f45020OooO0OO;
                        if (momentMessage11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage11 = null;
                        }
                        textView3.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage11.getTime(), System.currentTimeMillis()));
                        if (OooO0OO.OooO0O0(momentComment.getMomentImageUrl())) {
                            oO0O000o.OooO00o oooO00o6 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                            oooO00o6.OooO00o(o00OOO.OooO00o.OooO0o());
                            oooO00o6.OooO0oO(6);
                            oooO00o6.f48447OooO0OO = momentComment.getMomentImageUrl();
                            oooO00o6.f48445OooO00o = 0;
                            oooO00o6.OooO0o(o0000o00.OooO00o().f44988OooOO0);
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(0);
                        } else {
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(8);
                        }
                        String strOooO0OO = OooOOO.OooO0OO(R.string.moments_comment_notice_commented);
                        String content3 = momentComment.getCommentContent();
                        Intrinsics.checkNotNullParameter(content3, "content");
                        if (content3.length() == 0) {
                            momentSendContentModel3 = null;
                        } else {
                            MomentSendContentModel momentSendContentModel9 = new MomentSendContentModel("");
                            try {
                                Object objOooO0OO3 = o0Oo0oo.OooO0OO(content3, new o00oOoo().getType());
                                Intrinsics.checkNotNullExpressionValue(objOooO0OO3, "fromJson(content, object…tSendContentModel?>() {})");
                                momentSendContentModel3 = (MomentSendContentModel) objOooO0OO3;
                            } catch (Exception e3) {
                                e3.printStackTrace();
                                momentSendContentModel3 = momentSendContentModel9;
                            }
                        }
                        if (momentSendContentModel3 != null) {
                            o00OOOO0.OooO0O0(o0000o00.f45018OooO00o, momentSendContentModel3, o0000o00.OooO00o().f44986OooO0oO, null);
                            if (!TextUtils.isEmpty(strOooO0OO)) {
                                Spanned spannedFromHtml = Html.fromHtml("<font color='#999999'> " + strOooO0OO + ": </font> ");
                                o0000o00.OooO00o().f44986OooO0oO.setVisibility(0);
                                o0000o00.OooO00o().f44986OooO0oO.getEditableText().insert(0, spannedFromHtml);
                            }
                        }
                    }
                    break;
                case 4:
                    MomentMessage momentMessage12 = o0000o00.f45020OooO0OO;
                    if (momentMessage12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage12 = null;
                    }
                    MomentMessage.CommentReply commentReply = momentMessage12.getCommentReply();
                    if (commentReply != null) {
                        o0000o00.OooO00o().f44984OooO0o.setVisibility(8);
                        o0000o00.OooO00o().f44979OooO.setVisibility(0);
                        oO0O000o.OooO00o oooO00o7 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                        oooO00o7.OooO00o(o00OOO.OooO00o.OooO0o0());
                        oooO00o7.f48447OooO0OO = commentReply.getUserHeadUrl();
                        oooO00o7.f48445OooO00o = 0;
                        oooO00o7.OooO0o(o0000o00.OooO00o().f44983OooO0Oo);
                        o0000o00.OooO00o().f44985OooO0o0.setText(o00Ooo.f42780OooO00o.OooO0O0(commentReply.getUserId(), commentReply.getUserNickName()));
                        TextView textView4 = o0000o00.OooO00o().f44987OooO0oo;
                        MomentMessage momentMessage13 = o0000o00.f45020OooO0OO;
                        if (momentMessage13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage13 = null;
                        }
                        textView4.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage13.getTime(), System.currentTimeMillis()));
                        if (OooO0OO.OooO0O0(commentReply.getMomentImageUrl())) {
                            oO0O000o.OooO00o oooO00o8 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                            oooO00o8.OooO00o(o00OOO.OooO00o.OooO0o());
                            oooO00o8.OooO0oO(6);
                            oooO00o8.f48447OooO0OO = commentReply.getMomentImageUrl();
                            oooO00o8.f48445OooO00o = 0;
                            oooO00o8.OooO0o(o0000o00.OooO00o().f44988OooOO0);
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(0);
                        } else {
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(8);
                        }
                        String strOooO0OO2 = OooOOO.OooO0OO(R.string.moments_comment_notice_replied);
                        String content4 = commentReply.getCommentContent();
                        Intrinsics.checkNotNullParameter(content4, "content");
                        if (content4.length() == 0) {
                            momentSendContentModel4 = null;
                        } else {
                            MomentSendContentModel momentSendContentModel10 = new MomentSendContentModel("");
                            try {
                                Object objOooO0OO4 = o0Oo0oo.OooO0OO(content4, new o00oOoo().getType());
                                Intrinsics.checkNotNullExpressionValue(objOooO0OO4, "fromJson(content, object…tSendContentModel?>() {})");
                                momentSendContentModel4 = (MomentSendContentModel) objOooO0OO4;
                            } catch (Exception e4) {
                                e4.printStackTrace();
                                momentSendContentModel4 = momentSendContentModel10;
                            }
                        }
                        if (momentSendContentModel4 != null) {
                            o00OOOO0.OooO0O0(o0000o00.f45018OooO00o, momentSendContentModel4, o0000o00.OooO00o().f44986OooO0oO, null);
                            if (!TextUtils.isEmpty(strOooO0OO2)) {
                                Spanned spannedFromHtml2 = Html.fromHtml("<font color='#999999'> " + strOooO0OO2 + ": </font> ");
                                o0000o00.OooO00o().f44986OooO0oO.setVisibility(0);
                                o0000o00.OooO00o().f44986OooO0oO.getEditableText().insert(0, spannedFromHtml2);
                            }
                        }
                    }
                    break;
                case 5:
                    MomentMessage momentMessage14 = o0000o00.f45020OooO0OO;
                    if (momentMessage14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage14 = null;
                    }
                    MomentMessage.MomentAt momentAt = momentMessage14.getMomentAt();
                    if (momentAt != null) {
                        o0000o00.OooO00o().f44984OooO0o.setVisibility(8);
                        o0000o00.OooO00o().f44979OooO.setVisibility(8);
                        oO0O000o.OooO00o oooO00o9 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                        oooO00o9.OooO00o(o00OOO.OooO00o.OooO0o0());
                        oooO00o9.f48447OooO0OO = momentAt.getUserHeadUrl();
                        oooO00o9.f48445OooO00o = 0;
                        oooO00o9.OooO0o(o0000o00.OooO00o().f44983OooO0Oo);
                        o0000o00.OooO00o().f44985OooO0o0.setText(o00Ooo.f42780OooO00o.OooO0O0(momentAt.getUserId(), momentAt.getUserNickName()));
                        TextView textView5 = o0000o00.OooO00o().f44987OooO0oo;
                        MomentMessage momentMessage15 = o0000o00.f45020OooO0OO;
                        if (momentMessage15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage15 = null;
                        }
                        textView5.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage15.getTime(), System.currentTimeMillis()));
                        if (OooO0OO.OooO0O0(momentAt.getMomentImageUrl())) {
                            oO0O000o.OooO00o oooO00o10 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                            oooO00o10.OooO00o(o00OOO.OooO00o.OooO0o());
                            oooO00o10.OooO0oO(6);
                            oooO00o10.f48447OooO0OO = momentAt.getMomentImageUrl();
                            oooO00o10.f48445OooO00o = 0;
                            oooO00o10.OooO0o(o0000o00.OooO00o().f44988OooOO0);
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(0);
                        } else {
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(8);
                        }
                        String strOooO0OO3 = OooOOO.OooO0OO(R.string.moments_comment_notice_mentioned);
                        String content5 = momentAt.getMomentContent();
                        Intrinsics.checkNotNullParameter(content5, "content");
                        if (content5.length() == 0) {
                            momentSendContentModel5 = null;
                        } else {
                            MomentSendContentModel momentSendContentModel11 = new MomentSendContentModel("");
                            try {
                                Object objOooO0OO5 = o0Oo0oo.OooO0OO(content5, new o00oOoo().getType());
                                Intrinsics.checkNotNullExpressionValue(objOooO0OO5, "fromJson(content, object…tSendContentModel?>() {})");
                                momentSendContentModel5 = (MomentSendContentModel) objOooO0OO5;
                            } catch (Exception e5) {
                                e5.printStackTrace();
                                momentSendContentModel5 = momentSendContentModel11;
                            }
                        }
                        if (momentSendContentModel5 != null) {
                            o00OOOO0.OooO0O0(o0000o00.f45018OooO00o, momentSendContentModel5, o0000o00.OooO00o().f44986OooO0oO, null);
                            if (!TextUtils.isEmpty(strOooO0OO3)) {
                                Spanned spannedFromHtml3 = Html.fromHtml("<font color='#999999'> " + strOooO0OO3 + ": </font> ");
                                o0000o00.OooO00o().f44986OooO0oO.setVisibility(0);
                                o0000o00.OooO00o().f44986OooO0oO.getEditableText().insert(0, spannedFromHtml3);
                            }
                        }
                    }
                    break;
                case 6:
                    MomentMessage momentMessage16 = o0000o00.f45020OooO0OO;
                    if (momentMessage16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage16 = null;
                    }
                    MomentMessage.CommentAt commentAt = momentMessage16.getCommentAt();
                    if (commentAt != null) {
                        o0000o00.OooO00o().f44984OooO0o.setVisibility(8);
                        o0000o00.OooO00o().f44979OooO.setVisibility(8);
                        oO0O000o.OooO00o oooO00o11 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                        oooO00o11.OooO00o(o00OOO.OooO00o.OooO0o0());
                        oooO00o11.f48447OooO0OO = commentAt.getUserHeadUrl();
                        oooO00o11.f48445OooO00o = 0;
                        oooO00o11.OooO0o(o0000o00.OooO00o().f44983OooO0Oo);
                        o0000o00.OooO00o().f44985OooO0o0.setText(o00Ooo.f42780OooO00o.OooO0O0(commentAt.getUserId(), commentAt.getUserNickName()));
                        TextView textView6 = o0000o00.OooO00o().f44987OooO0oo;
                        MomentMessage momentMessage17 = o0000o00.f45020OooO0OO;
                        if (momentMessage17 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage17 = null;
                        }
                        textView6.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage17.getTime(), System.currentTimeMillis()));
                        if (OooO0OO.OooO0O0(commentAt.getMomentImageUrl())) {
                            oO0O000o.OooO00o oooO00o12 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                            oooO00o12.OooO00o(o00OOO.OooO00o.OooO0o());
                            oooO00o12.OooO0oO(6);
                            oooO00o12.f48447OooO0OO = commentAt.getMomentImageUrl();
                            oooO00o12.f48445OooO00o = 0;
                            oooO00o12.OooO0o(o0000o00.OooO00o().f44988OooOO0);
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(0);
                        } else {
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(8);
                        }
                        String strOooO0OO4 = OooOOO.OooO0OO(R.string.moments_comment_notice_mentioned);
                        String content6 = commentAt.getCommentContent();
                        Intrinsics.checkNotNullParameter(content6, "content");
                        if (content6.length() == 0) {
                            momentSendContentModel6 = null;
                        } else {
                            MomentSendContentModel momentSendContentModel12 = new MomentSendContentModel("");
                            try {
                                Object objOooO0OO6 = o0Oo0oo.OooO0OO(content6, new o00oOoo().getType());
                                Intrinsics.checkNotNullExpressionValue(objOooO0OO6, "fromJson(content, object…tSendContentModel?>() {})");
                                momentSendContentModel6 = (MomentSendContentModel) objOooO0OO6;
                            } catch (Exception e6) {
                                e6.printStackTrace();
                                momentSendContentModel6 = momentSendContentModel12;
                            }
                        }
                        if (momentSendContentModel6 != null) {
                            o00OOOO0.OooO0O0(o0000o00.f45018OooO00o, momentSendContentModel6, o0000o00.OooO00o().f44986OooO0oO, null);
                            if (!TextUtils.isEmpty(strOooO0OO4)) {
                                Spanned spannedFromHtml4 = Html.fromHtml("<font color='#999999'> " + strOooO0OO4 + ": </font> ");
                                o0000o00.OooO00o().f44986OooO0oO.setVisibility(0);
                                o0000o00.OooO00o().f44986OooO0oO.getEditableText().insert(0, spannedFromHtml4);
                            }
                        }
                    }
                    break;
                case 7:
                    MomentMessage momentMessage18 = o0000o00.f45020OooO0OO;
                    if (momentMessage18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage18 = null;
                    }
                    MomentMessage.MomentGift momentGift = momentMessage18.getMomentGift();
                    if (momentGift != null) {
                        o0000o00.OooO00o().f44979OooO.setVisibility(8);
                        oO0O000o.OooO00o oooO00o13 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                        oooO00o13.OooO00o(o00OOO.OooO00o.OooO0o0());
                        oooO00o13.f48447OooO0OO = momentGift.getUserHeadUrl();
                        oooO00o13.f48445OooO00o = 0;
                        oooO00o13.OooO0o(o0000o00.OooO00o().f44983OooO0Oo);
                        o0000o00.OooO00o().f44985OooO0o0.setText(o00Ooo.f42780OooO00o.OooO0O0(momentGift.getUserId(), momentGift.getUserNickName()));
                        TextView textView7 = o0000o00.OooO00o().f44987OooO0oo;
                        MomentMessage momentMessage19 = o0000o00.f45020OooO0OO;
                        if (momentMessage19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage19 = null;
                        }
                        textView7.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage19.getTime(), System.currentTimeMillis()));
                        o0000o00.OooO00o().f44992OooOOO0.setVisibility(0);
                        oO0O000o.OooO00o oooO00o14 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                        oooO00o14.OooO00o(o00OOO.OooO00o.OooO0o());
                        oooO00o14.OooO0oO(6);
                        oooO00o14.f48447OooO0OO = momentGift.getGiftImage();
                        oooO00o14.f48445OooO00o = 0;
                        oooO00o14.OooO0o(o0000o00.OooO00o().f44990OooOO0o);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(Typography.times);
                        sb2.append(momentGift.getGiftNum());
                        o0000o00.OooO00o().f44989OooOO0O.setText(sb2.toString());
                        if (!OooO0OO.OooO0O0(momentGift.getMomentImageUrl())) {
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(8);
                        } else {
                            oO0O000o.OooO00o oooO00o15 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                            oooO00o15.OooO00o(o00OOO.OooO00o.OooO0o());
                            oooO00o15.OooO0oO(6);
                            oooO00o15.f48447OooO0OO = momentGift.getMomentImageUrl();
                            oooO00o15.f48445OooO00o = 0;
                            oooO00o15.OooO0o(o0000o00.OooO00o().f44988OooOO0);
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(0);
                        }
                    }
                    break;
                case 8:
                    MomentMessage momentMessage20 = o0000o00.f45020OooO0OO;
                    if (momentMessage20 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage20 = null;
                    }
                    MomentMessage.CommentReward commentReward = momentMessage20.getCommentReward();
                    if (commentReward != null) {
                        o0000o00.OooO00o().f44979OooO.setVisibility(8);
                        oO0O000o.OooO00o oooO00o16 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                        oooO00o16.OooO00o(o00OOO.OooO00o.OooO0o0());
                        oooO00o16.f48447OooO0OO = commentReward.getUserHeadUrl();
                        oooO00o16.f48445OooO00o = 0;
                        oooO00o16.OooO0o(o0000o00.OooO00o().f44983OooO0Oo);
                        o0000o00.OooO00o().f44985OooO0o0.setText(o00Ooo.f42780OooO00o.OooO0O0(commentReward.getUserId(), commentReward.getUserNickName()));
                        TextView textView8 = o0000o00.OooO00o().f44987OooO0oo;
                        MomentMessage momentMessage21 = o0000o00.f45020OooO0OO;
                        if (momentMessage21 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage21 = null;
                        }
                        textView8.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage21.getTime(), System.currentTimeMillis()));
                        if (OooO0OO.OooO0O0(commentReward.getMomentImageUrl())) {
                            oO0O000o.OooO00o oooO00o17 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                            oooO00o17.OooO00o(o00OOO.OooO00o.OooO0o());
                            oooO00o17.OooO0oO(6);
                            oooO00o17.f48447OooO0OO = commentReward.getMomentImageUrl();
                            oooO00o17.f48445OooO00o = 0;
                            oooO00o17.OooO0o(o0000o00.OooO00o().f44988OooOO0);
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(0);
                        } else {
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(8);
                        }
                        o0000o00.OooO00o().f44984OooO0o.setVisibility(0);
                        o0000o00.OooO00o().f44984OooO0o.setImageResource(R.drawable.icon_message_reward_red);
                        o0000o00.OooO00o().f44991OooOOO.setVisibility(0);
                        String content7 = commentReward.getCommentContent();
                        Intrinsics.checkNotNullParameter(content7, "content");
                        if (!(content7.length() == 0)) {
                            MomentSendContentModel momentSendContentModel13 = new MomentSendContentModel("");
                            try {
                                Object objOooO0OO7 = o0Oo0oo.OooO0OO(content7, new o00oOoo().getType());
                                Intrinsics.checkNotNullExpressionValue(objOooO0OO7, "fromJson(content, object…tSendContentModel?>() {})");
                                momentSendContentModel7 = (MomentSendContentModel) objOooO0OO7;
                            } catch (Exception e7) {
                                e7.printStackTrace();
                                momentSendContentModel7 = momentSendContentModel13;
                            }
                        } else {
                            momentSendContentModel7 = null;
                        }
                        if (momentSendContentModel7 != null) {
                            o00OOOO0.OooO0O0(o0000o00.f45018OooO00o, momentSendContentModel7, o0000o00.OooO00o().f44991OooOOO, null);
                            o0000o00.OooO00o().f44991OooOOO.getEditableText().insert(0, Html.fromHtml("<font color='#999999'> " + OooOOO.OooO0OO(R.string.moment_message_reward_comments_title) + "</font> "));
                        }
                    }
                    break;
                case 9:
                    o0000o00.OooOOO0();
                    break;
                case 10:
                    MomentMessage momentMessage22 = o0000o00.f45020OooO0OO;
                    if (momentMessage22 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage22 = null;
                    }
                    MomentMessage.MomentFeatured momentFeatured = momentMessage22.getMomentFeatured();
                    if (momentFeatured != null) {
                        o0000o00.OooO00o().f44983OooO0Oo.setImageResource(R.drawable.icon_moment_featurd_head);
                        o0000o00.OooO00o().f44985OooO0o0.setText(OooOOO.OooO0OO(R.string.Featured));
                        o0000o00.OooO00o().f44986OooO0oO.setText(OooOOO.OooO0OO(R.string.moment_featured_add_message_info));
                        o0000o00.OooO00o().f44986OooO0oO.setVisibility(0);
                        TextView textView9 = o0000o00.OooO00o().f44987OooO0oo;
                        MomentMessage momentMessage23 = o0000o00.f45020OooO0OO;
                        if (momentMessage23 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                        } else {
                            momentMessage2 = momentMessage23;
                        }
                        textView9.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
                        o0000o00.OooO00o().f44979OooO.setVisibility(8);
                        if (!TextUtils.isEmpty(momentFeatured.getMomentImageUrl())) {
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(0);
                            String strImgSize = CloudImageUtilKt.imgSize(momentFeatured.getMomentImageUrl(), OooOo00.OooO00o(120), true);
                            oO0O000o.OooO00o oooO00o18 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                            oooO00o18.OooO00o(o00OOO.OooO00o.OooO0o());
                            oooO00o18.OooO0oO(6);
                            oooO00o18.f48447OooO0OO = strImgSize;
                            oooO00o18.f48445OooO00o = 0;
                            oooO00o18.OooO0o(o0000o00.OooO00o().f44988OooOO0);
                        } else {
                            o0000o00.OooO00o().f44988OooOO0.setVisibility(8);
                        }
                    }
                    break;
                case 11:
                    o0000o00.OooO0Oo();
                    break;
                case 12:
                    o0000o00.OooOO0o();
                    break;
                case 13:
                    o0000o00.OooOO0O();
                    break;
                case 14:
                    o0000o00.OooOO0();
                    break;
                case 15:
                    o0000o00.OooO0oO();
                    break;
                case 16:
                    o0000o00.OooO0o();
                    break;
                case 17:
                    o0000o00.OooO0o0();
                    break;
                case 18:
                    o0000o00.OooO0oo();
                    break;
                case 19:
                    o0000o00.OooO();
                    break;
                case 20:
                    o0000o00.OooO0OO();
                    break;
            }
        } else {
            MomentMessage momentMessage24 = o0000o00.f45020OooO0OO;
            if (momentMessage24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
                momentMessage24 = null;
            }
            MomentMessage.MomentTopicTopRevoke momentTopicTopRevoke = momentMessage24.getMomentTopicTopRevoke();
            if (momentTopicTopRevoke != null) {
                oO0O000o.OooO00o oooO00o19 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                oooO00o19.OooO00o(o00OOO.OooO00o.OooO0o0());
                oooO00o19.f48447OooO0OO = momentTopicTopRevoke.getUserHeadUrl();
                oooO00o19.f48445OooO00o = 0;
                oooO00o19.OooO0o(o0000o00.OooO00o().f44983OooO0Oo);
                o0000o00.OooO00o().f44985OooO0o0.setText(OooOOO.OooO0OO(R.string.MessageFragment_moment_postUnpinned));
                o0000o00.OooO00o().f44986OooO0oO.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.MessageFragment_moment_postUnpinned_itemInfo), momentTopicTopRevoke.getTopicName()));
                o0000o00.OooO00o().f44986OooO0oO.setVisibility(0);
                TextView textView10 = o0000o00.OooO00o().f44987OooO0oo;
                MomentMessage momentMessage25 = o0000o00.f45020OooO0OO;
                if (momentMessage25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("data");
                } else {
                    momentMessage2 = momentMessage25;
                }
                textView10.setText(oo00o.f48643OooO00o.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
                o0000o00.OooO00o().f44979OooO.setVisibility(8);
                o0000o00.OooO00o().f44988OooOO0.setVisibility(8);
                if (!TextUtils.isEmpty(momentTopicTopRevoke.getMomentImageUrl())) {
                    o0000o00.OooO00o().f44988OooOO0.setVisibility(0);
                    oO0O000o.OooO00o oooO00o20 = new oO0O000o.OooO00o(o0000o00.f45018OooO00o);
                    oooO00o20.OooO00o(o00OOO.OooO00o.OooO0o());
                    oooO00o20.OooO0oO(6);
                    oooO00o20.f48447OooO0OO = CloudImageUtilKt.imgSize(momentTopicTopRevoke.getMomentImageUrl(), OooOo00.OooO00o(60), true);
                    oooO00o20.f48445OooO00o = 0;
                    oooO00o20.OooO0o(o0000o00.OooO00o().f44988OooOO0);
                }
            }
        }
        o0000o00.OooO00o().f44985OooO0o0.requestLayout();
    }
}
