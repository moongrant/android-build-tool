package com.yalla.yalla.ui.adapter;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.base.paging.PagingViewHolder;
import com.yalla.yalla.data.db.table.MomentMessage;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.ui.activity.moment.MomentMessageListActivity;
import com.yalla.yalla.ui.vm.message.MomentMessageVM;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import com.yalla.yalla.ui.vm.moment.YallaChatVM;
import com.yalla.yalla.util.SendPostModelContentFromString$toSendPostModelContent$1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p406o0Oo0Ooo.oOO0O0O;
import p579o0oOoo.oO00Oo0;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00oO0o extends p400o0Oo0OO.OooOO0O<MomentMessage> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final BaseMomentDetailVM f27640OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final AppCompatActivity f27641OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final YallaChatVM f27642OooOOoo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(@NotNull MomentMessageListActivity activity, @NotNull MomentMessageVM vm, @NotNull YallaChatVM yallaChatVM) {
        super(Integer.valueOf(oO00OO0O.moment_item_moment_message), new oo000o());
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(vm, "vm");
        Intrinsics.checkNotNullParameter(yallaChatVM, "yallaChatVM");
        this.f27641OooOOo0 = activity;
        this.f27640OooOOo = vm;
        this.f27642OooOOoo = yallaChatVM;
    }

    @Override // p400o0Oo0OO.OooOO0O
    public final void OooO0o(PagingViewHolder helper, MomentMessage momentMessage) {
        int i;
        MomentSendContentModel momentSendContentModel;
        int i2;
        MomentSendContentModel momentSendContentModel2;
        MomentSendContentModel momentSendContentModel3;
        MomentSendContentModel momentSendContentModel4;
        MomentSendContentModel momentSendContentModel5;
        MomentSendContentModel momentSendContentModel6;
        int i3;
        MomentSendContentModel momentSendContentModel7;
        MomentMessage model = momentMessage;
        Intrinsics.checkNotNullParameter(helper, "helper");
        Intrinsics.checkNotNullParameter(model, "item");
        o0OOO0o o0ooo0o2 = new o0OOO0o(this.f27641OooOOo0, helper);
        o0ooo0o2.f27659OooO0Oo = this.f27640OooOOo;
        o0ooo0o2.f27660OooO0o0 = this.f27642OooOOoo;
        int layoutPosition = helper.getLayoutPosition();
        Intrinsics.checkNotNullParameter(model, "model");
        o0ooo0o2.f27658OooO0OO = model;
        o0ooo0o2.OooO00o().f27684OooOO0O.setVisibility(8);
        o0ooo0o2.OooO00o().f27683OooOO0.setVisibility(8);
        MomentMessage momentMessage2 = null;
        o0ooo0o2.OooO00o().f27676OooO0O0.setImageDrawable(null);
        o0ooo0o2.OooO00o().f27677OooO0OO.setText("");
        o0ooo0o2.OooO00o().f27678OooO0Oo.setVisibility(8);
        o0ooo0o2.OooO00o().f27680OooO0o0.setVisibility(8);
        o0ooo0o2.OooO00o().f27679OooO0o.setText("");
        o0ooo0o2.OooO00o().f27679OooO0o.setVisibility(8);
        o0ooo0o2.OooO00o().f27681OooO0oO.setText("");
        o0ooo0o2.OooO00o().f27674OooO.setVisibility(4);
        o0ooo0o2.OooO00o().f27674OooO.setImageDrawable(null);
        o0ooo0o2.OooO00o().f27685OooOO0o.setText("");
        o0ooo0o2.OooO00o().f27685OooOO0o.setVisibility(8);
        MomentMessage momentMessage3 = o0ooo0o2.f27658OooO0OO;
        if (momentMessage3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage3 = null;
        }
        int type = momentMessage3.getType();
        MomentMessage momentMessage4 = o0ooo0o2.f27658OooO0OO;
        if (momentMessage4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage4 = null;
        }
        String strOooO00o = oO00Oo0.OooO00o(momentMessage4);
        StringBuilder sbOooO00o = p041Ooooo0o.o00000.OooO00o("setData\nposition ", layoutPosition, " \ndata.type ", type, " \ndata ");
        sbOooO00o.append(strOooO00o);
        p592o0oo00O.OooOOO0.OooO0O0(sbOooO00o.toString());
        MomentMessage momentMessage5 = o0ooo0o2.f27658OooO0OO;
        if (momentMessage5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("data");
            momentMessage5 = null;
        }
        int type2 = momentMessage5.getType();
        AppCompatActivity appCompatActivity = o0ooo0o2.f27656OooO00o;
        if (type2 != -12) {
            switch (type2) {
                case 1:
                    MomentMessage momentMessage6 = o0ooo0o2.f27658OooO0OO;
                    if (momentMessage6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage6 = null;
                    }
                    MomentMessage.MomentPraise momentPraise = momentMessage6.getMomentPraise();
                    if (momentPraise != null) {
                        o0ooo0o2.OooO00o().f27682OooO0oo.setVisibility(8);
                        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                        oooO00o.f43911OooO0OO = momentPraise.getUserHeadUrl();
                        oooO00o.f43909OooO00o = 0;
                        oooO00o.OooO0Oo(o0ooo0o2.OooO00o().f27676OooO0O0);
                        o0ooo0o2.OooO00o().f27677OooO0OO.setText(oOO0O0O.OooO0O0(momentPraise.getUserId(), momentPraise.getUserNickName()));
                        TextView textView = o0ooo0o2.OooO00o().f27681OooO0oO;
                        MomentMessage momentMessage7 = o0ooo0o2.f27658OooO0OO;
                        if (momentMessage7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage7 = null;
                        }
                        textView.setText(p601o0oo0O0.o0000oo.OooO0Oo(momentMessage7.getTime(), System.currentTimeMillis()));
                        if (com.code.android.util.OooOo00.OooO0O0(momentPraise.getMomentImageUrl())) {
                            o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                            oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                            oooO00o2.OooO0o0(6);
                            oooO00o2.f43911OooO0OO = momentPraise.getMomentImageUrl();
                            i = 0;
                            oooO00o2.f43909OooO00o = 0;
                            oooO00o2.OooO0Oo(o0ooo0o2.OooO00o().f27674OooO);
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(0);
                        } else {
                            i = 0;
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(4);
                        }
                        o0ooo0o2.OooO00o().f27678OooO0Oo.setVisibility(i);
                        o0ooo0o2.OooO00o().f27678OooO0Oo.setImageResource(oOo00OO0.ic_moment_comment_praise_color);
                        o0ooo0o2.OooO00o().f27685OooOO0o.setVisibility(i);
                        String content = momentPraise.getMomentContent();
                        Intrinsics.checkNotNullParameter(content, "content");
                        if (content.length() == 0) {
                            momentSendContentModel = null;
                        } else {
                            MomentSendContentModel momentSendContentModel8 = new MomentSendContentModel("");
                            try {
                                Object objOooO0O0 = p579o0oOoo.oOo00OO0.OooO0O0(content, new SendPostModelContentFromString$toSendPostModelContent$1().getType());
                                Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(content, object…tSendContentModel?>() {})");
                                momentSendContentModel = (MomentSendContentModel) objOooO0O0;
                            } catch (Exception e) {
                                e.printStackTrace();
                                momentSendContentModel = momentSendContentModel8;
                            }
                        }
                        if (momentSendContentModel != null) {
                            p595o0oo00Oo.o0000Ooo.OooO0OO(appCompatActivity, momentSendContentModel, o0ooo0o2.OooO00o().f27685OooOO0o, null);
                            o0ooo0o2.OooO00o().f27685OooOO0o.getEditableText().insert(0, Html.fromHtml("<font color='#999999'> " + com.code.android.util.o0000.OooO0OO(oO00OOo0.Liked_your_comment) + "</font> "));
                        }
                    }
                    break;
                case 2:
                    MomentMessage momentMessage8 = o0ooo0o2.f27658OooO0OO;
                    if (momentMessage8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage8 = null;
                    }
                    MomentMessage.CommentPraise commentPraise = momentMessage8.getCommentPraise();
                    if (commentPraise != null) {
                        o0ooo0o2.OooO00o().f27682OooO0oo.setVisibility(8);
                        o0OOo0O.OooOO0.OooO00o oooO00o3 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                        oooO00o3.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                        oooO00o3.f43911OooO0OO = commentPraise.getUserHeadUrl();
                        oooO00o3.f43909OooO00o = 0;
                        oooO00o3.OooO0Oo(o0ooo0o2.OooO00o().f27676OooO0O0);
                        o0ooo0o2.OooO00o().f27677OooO0OO.setText(oOO0O0O.OooO0O0(commentPraise.getUserId(), commentPraise.getUserNickName()));
                        TextView textView2 = o0ooo0o2.OooO00o().f27681OooO0oO;
                        MomentMessage momentMessage9 = o0ooo0o2.f27658OooO0OO;
                        if (momentMessage9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage9 = null;
                        }
                        textView2.setText(p601o0oo0O0.o0000oo.OooO0Oo(momentMessage9.getTime(), System.currentTimeMillis()));
                        if (com.code.android.util.OooOo00.OooO0O0(commentPraise.getMomentImageUrl())) {
                            o0OOo0O.OooOO0.OooO00o oooO00o4 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                            oooO00o4.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                            oooO00o4.OooO0o0(6);
                            oooO00o4.f43911OooO0OO = commentPraise.getMomentImageUrl();
                            i2 = 0;
                            oooO00o4.f43909OooO00o = 0;
                            oooO00o4.OooO0Oo(o0ooo0o2.OooO00o().f27674OooO);
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(0);
                        } else {
                            i2 = 0;
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(4);
                        }
                        o0ooo0o2.OooO00o().f27678OooO0Oo.setVisibility(i2);
                        o0ooo0o2.OooO00o().f27678OooO0Oo.setImageResource(oOo00OO0.ic_moment_comment_praise_color);
                        o0ooo0o2.OooO00o().f27685OooOO0o.setVisibility(i2);
                        String content2 = commentPraise.getMomentContent();
                        Intrinsics.checkNotNullParameter(content2, "content");
                        if (content2.length() == 0) {
                            momentSendContentModel2 = null;
                        } else {
                            MomentSendContentModel momentSendContentModel9 = new MomentSendContentModel("");
                            try {
                                Object objOooO0O1 = p579o0oOoo.oOo00OO0.OooO0O0(content2, new SendPostModelContentFromString$toSendPostModelContent$1().getType());
                                Intrinsics.checkNotNullExpressionValue(objOooO0O1, "fromJson(content, object…tSendContentModel?>() {})");
                                momentSendContentModel2 = (MomentSendContentModel) objOooO0O1;
                            } catch (Exception e2) {
                                e2.printStackTrace();
                                momentSendContentModel2 = momentSendContentModel9;
                            }
                        }
                        if (momentSendContentModel2 != null) {
                            p595o0oo00Oo.o0000Ooo.OooO0OO(appCompatActivity, momentSendContentModel2, o0ooo0o2.OooO00o().f27685OooOO0o, null);
                            o0ooo0o2.OooO00o().f27685OooOO0o.getEditableText().insert(0, Html.fromHtml("<font color='#999999'> " + com.code.android.util.o0000.OooO0OO(oO00OOo0.Liked_your_comment) + "</font> "));
                        }
                    }
                    break;
                case 3:
                    MomentMessage momentMessage10 = o0ooo0o2.f27658OooO0OO;
                    if (momentMessage10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage10 = null;
                    }
                    MomentMessage.MomentComment momentComment = momentMessage10.getMomentComment();
                    if (momentComment != null) {
                        o0ooo0o2.OooO00o().f27678OooO0Oo.setVisibility(8);
                        o0ooo0o2.OooO00o().f27682OooO0oo.setVisibility(0);
                        o0OOo0O.OooOO0.OooO00o oooO00o5 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                        oooO00o5.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                        oooO00o5.f43911OooO0OO = momentComment.getUserHeadUrl();
                        oooO00o5.f43909OooO00o = 0;
                        oooO00o5.OooO0Oo(o0ooo0o2.OooO00o().f27676OooO0O0);
                        o0ooo0o2.OooO00o().f27677OooO0OO.setText(oOO0O0O.OooO0O0(momentComment.getUserId(), momentComment.getUserNickName()));
                        TextView textView3 = o0ooo0o2.OooO00o().f27681OooO0oO;
                        MomentMessage momentMessage11 = o0ooo0o2.f27658OooO0OO;
                        if (momentMessage11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage11 = null;
                        }
                        textView3.setText(p601o0oo0O0.o0000oo.OooO0Oo(momentMessage11.getTime(), System.currentTimeMillis()));
                        if (com.code.android.util.OooOo00.OooO0O0(momentComment.getMomentImageUrl())) {
                            o0OOo0O.OooOO0.OooO00o oooO00o6 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                            oooO00o6.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                            oooO00o6.OooO0o0(6);
                            oooO00o6.f43911OooO0OO = momentComment.getMomentImageUrl();
                            oooO00o6.f43909OooO00o = 0;
                            oooO00o6.OooO0Oo(o0ooo0o2.OooO00o().f27674OooO);
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(0);
                        } else {
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(4);
                        }
                        String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.moments_comment_notice_commented);
                        String content3 = momentComment.getCommentContent();
                        Intrinsics.checkNotNullParameter(content3, "content");
                        if (content3.length() == 0) {
                            momentSendContentModel3 = null;
                        } else {
                            MomentSendContentModel momentSendContentModel10 = new MomentSendContentModel("");
                            try {
                                Object objOooO0O2 = p579o0oOoo.oOo00OO0.OooO0O0(content3, new SendPostModelContentFromString$toSendPostModelContent$1().getType());
                                Intrinsics.checkNotNullExpressionValue(objOooO0O2, "fromJson(content, object…tSendContentModel?>() {})");
                                momentSendContentModel3 = (MomentSendContentModel) objOooO0O2;
                            } catch (Exception e3) {
                                e3.printStackTrace();
                                momentSendContentModel3 = momentSendContentModel10;
                            }
                        }
                        if (momentSendContentModel3 != null) {
                            p595o0oo00Oo.o0000Ooo.OooO0OO(appCompatActivity, momentSendContentModel3, o0ooo0o2.OooO00o().f27679OooO0o, null);
                            if (!TextUtils.isEmpty(strOooO0OO)) {
                                Spanned spannedFromHtml = Html.fromHtml("<font color='#999999'> " + strOooO0OO + ": </font> ");
                                o0ooo0o2.OooO00o().f27679OooO0o.setVisibility(0);
                                o0ooo0o2.OooO00o().f27679OooO0o.getEditableText().insert(0, spannedFromHtml);
                            }
                        }
                    }
                    break;
                case 4:
                    MomentMessage momentMessage12 = o0ooo0o2.f27658OooO0OO;
                    if (momentMessage12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage12 = null;
                    }
                    MomentMessage.CommentReply commentReply = momentMessage12.getCommentReply();
                    if (commentReply != null) {
                        o0ooo0o2.OooO00o().f27678OooO0Oo.setVisibility(8);
                        o0ooo0o2.OooO00o().f27682OooO0oo.setVisibility(0);
                        o0OOo0O.OooOO0.OooO00o oooO00o7 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                        oooO00o7.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                        oooO00o7.f43911OooO0OO = commentReply.getUserHeadUrl();
                        oooO00o7.f43909OooO00o = 0;
                        oooO00o7.OooO0Oo(o0ooo0o2.OooO00o().f27676OooO0O0);
                        o0ooo0o2.OooO00o().f27677OooO0OO.setText(oOO0O0O.OooO0O0(commentReply.getUserId(), commentReply.getUserNickName()));
                        TextView textView4 = o0ooo0o2.OooO00o().f27681OooO0oO;
                        MomentMessage momentMessage13 = o0ooo0o2.f27658OooO0OO;
                        if (momentMessage13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage13 = null;
                        }
                        textView4.setText(p601o0oo0O0.o0000oo.OooO0Oo(momentMessage13.getTime(), System.currentTimeMillis()));
                        if (com.code.android.util.OooOo00.OooO0O0(commentReply.getMomentImageUrl())) {
                            o0OOo0O.OooOO0.OooO00o oooO00o8 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                            oooO00o8.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                            oooO00o8.OooO0o0(6);
                            oooO00o8.f43911OooO0OO = commentReply.getMomentImageUrl();
                            oooO00o8.f43909OooO00o = 0;
                            oooO00o8.OooO0Oo(o0ooo0o2.OooO00o().f27674OooO);
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(0);
                        } else {
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(4);
                        }
                        String strOooO0OO2 = com.code.android.util.o0000.OooO0OO(oO00OOo0.moments_comment_notice_replied);
                        String content4 = commentReply.getCommentContent();
                        Intrinsics.checkNotNullParameter(content4, "content");
                        if (content4.length() == 0) {
                            momentSendContentModel4 = null;
                        } else {
                            MomentSendContentModel momentSendContentModel11 = new MomentSendContentModel("");
                            try {
                                Object objOooO0O3 = p579o0oOoo.oOo00OO0.OooO0O0(content4, new SendPostModelContentFromString$toSendPostModelContent$1().getType());
                                Intrinsics.checkNotNullExpressionValue(objOooO0O3, "fromJson(content, object…tSendContentModel?>() {})");
                                momentSendContentModel4 = (MomentSendContentModel) objOooO0O3;
                            } catch (Exception e4) {
                                e4.printStackTrace();
                                momentSendContentModel4 = momentSendContentModel11;
                            }
                        }
                        if (momentSendContentModel4 != null) {
                            p595o0oo00Oo.o0000Ooo.OooO0OO(appCompatActivity, momentSendContentModel4, o0ooo0o2.OooO00o().f27679OooO0o, null);
                            if (!TextUtils.isEmpty(strOooO0OO2)) {
                                Spanned spannedFromHtml2 = Html.fromHtml("<font color='#999999'> " + strOooO0OO2 + ": </font> ");
                                o0ooo0o2.OooO00o().f27679OooO0o.setVisibility(0);
                                o0ooo0o2.OooO00o().f27679OooO0o.getEditableText().insert(0, spannedFromHtml2);
                            }
                        }
                    }
                    break;
                case 5:
                    MomentMessage momentMessage14 = o0ooo0o2.f27658OooO0OO;
                    if (momentMessage14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage14 = null;
                    }
                    MomentMessage.MomentAt momentAt = momentMessage14.getMomentAt();
                    if (momentAt != null) {
                        o0ooo0o2.OooO00o().f27678OooO0Oo.setVisibility(8);
                        o0ooo0o2.OooO00o().f27682OooO0oo.setVisibility(8);
                        o0OOo0O.OooOO0.OooO00o oooO00o9 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                        oooO00o9.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                        oooO00o9.f43911OooO0OO = momentAt.getUserHeadUrl();
                        oooO00o9.f43909OooO00o = 0;
                        oooO00o9.OooO0Oo(o0ooo0o2.OooO00o().f27676OooO0O0);
                        o0ooo0o2.OooO00o().f27677OooO0OO.setText(oOO0O0O.OooO0O0(momentAt.getUserId(), momentAt.getUserNickName()));
                        TextView textView5 = o0ooo0o2.OooO00o().f27681OooO0oO;
                        MomentMessage momentMessage15 = o0ooo0o2.f27658OooO0OO;
                        if (momentMessage15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage15 = null;
                        }
                        textView5.setText(p601o0oo0O0.o0000oo.OooO0Oo(momentMessage15.getTime(), System.currentTimeMillis()));
                        if (com.code.android.util.OooOo00.OooO0O0(momentAt.getMomentImageUrl())) {
                            o0OOo0O.OooOO0.OooO00o oooO00o10 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                            oooO00o10.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                            oooO00o10.OooO0o0(6);
                            oooO00o10.f43911OooO0OO = momentAt.getMomentImageUrl();
                            oooO00o10.f43909OooO00o = 0;
                            oooO00o10.OooO0Oo(o0ooo0o2.OooO00o().f27674OooO);
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(0);
                        } else {
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(4);
                        }
                        String strOooO0OO3 = com.code.android.util.o0000.OooO0OO(oO00OOo0.moments_comment_notice_mentioned);
                        String content5 = momentAt.getMomentContent();
                        Intrinsics.checkNotNullParameter(content5, "content");
                        if (content5.length() == 0) {
                            momentSendContentModel5 = null;
                        } else {
                            MomentSendContentModel momentSendContentModel12 = new MomentSendContentModel("");
                            try {
                                Object objOooO0O4 = p579o0oOoo.oOo00OO0.OooO0O0(content5, new SendPostModelContentFromString$toSendPostModelContent$1().getType());
                                Intrinsics.checkNotNullExpressionValue(objOooO0O4, "fromJson(content, object…tSendContentModel?>() {})");
                                momentSendContentModel5 = (MomentSendContentModel) objOooO0O4;
                            } catch (Exception e5) {
                                e5.printStackTrace();
                                momentSendContentModel5 = momentSendContentModel12;
                            }
                        }
                        if (momentSendContentModel5 != null) {
                            p595o0oo00Oo.o0000Ooo.OooO0OO(appCompatActivity, momentSendContentModel5, o0ooo0o2.OooO00o().f27679OooO0o, null);
                            if (!TextUtils.isEmpty(strOooO0OO3)) {
                                Spanned spannedFromHtml3 = Html.fromHtml("<font color='#999999'> " + strOooO0OO3 + ": </font> ");
                                o0ooo0o2.OooO00o().f27679OooO0o.setVisibility(0);
                                o0ooo0o2.OooO00o().f27679OooO0o.getEditableText().insert(0, spannedFromHtml3);
                            }
                        }
                    }
                    break;
                case 6:
                    MomentMessage momentMessage16 = o0ooo0o2.f27658OooO0OO;
                    if (momentMessage16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage16 = null;
                    }
                    MomentMessage.CommentAt commentAt = momentMessage16.getCommentAt();
                    if (commentAt != null) {
                        o0ooo0o2.OooO00o().f27678OooO0Oo.setVisibility(8);
                        o0ooo0o2.OooO00o().f27682OooO0oo.setVisibility(8);
                        o0OOo0O.OooOO0.OooO00o oooO00o11 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                        oooO00o11.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                        oooO00o11.f43911OooO0OO = commentAt.getUserHeadUrl();
                        oooO00o11.f43909OooO00o = 0;
                        oooO00o11.OooO0Oo(o0ooo0o2.OooO00o().f27676OooO0O0);
                        o0ooo0o2.OooO00o().f27677OooO0OO.setText(oOO0O0O.OooO0O0(commentAt.getUserId(), commentAt.getUserNickName()));
                        TextView textView6 = o0ooo0o2.OooO00o().f27681OooO0oO;
                        MomentMessage momentMessage17 = o0ooo0o2.f27658OooO0OO;
                        if (momentMessage17 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage17 = null;
                        }
                        textView6.setText(p601o0oo0O0.o0000oo.OooO0Oo(momentMessage17.getTime(), System.currentTimeMillis()));
                        if (com.code.android.util.OooOo00.OooO0O0(commentAt.getMomentImageUrl())) {
                            o0OOo0O.OooOO0.OooO00o oooO00o12 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                            oooO00o12.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                            oooO00o12.OooO0o0(6);
                            oooO00o12.f43911OooO0OO = commentAt.getMomentImageUrl();
                            oooO00o12.f43909OooO00o = 0;
                            oooO00o12.OooO0Oo(o0ooo0o2.OooO00o().f27674OooO);
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(0);
                        } else {
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(4);
                        }
                        String strOooO0OO4 = com.code.android.util.o0000.OooO0OO(oO00OOo0.moments_comment_notice_mentioned);
                        String content6 = commentAt.getCommentContent();
                        Intrinsics.checkNotNullParameter(content6, "content");
                        if (content6.length() == 0) {
                            momentSendContentModel6 = null;
                        } else {
                            MomentSendContentModel momentSendContentModel13 = new MomentSendContentModel("");
                            try {
                                Object objOooO0O5 = p579o0oOoo.oOo00OO0.OooO0O0(content6, new SendPostModelContentFromString$toSendPostModelContent$1().getType());
                                Intrinsics.checkNotNullExpressionValue(objOooO0O5, "fromJson(content, object…tSendContentModel?>() {})");
                                momentSendContentModel6 = (MomentSendContentModel) objOooO0O5;
                            } catch (Exception e6) {
                                e6.printStackTrace();
                                momentSendContentModel6 = momentSendContentModel13;
                            }
                        }
                        if (momentSendContentModel6 != null) {
                            p595o0oo00Oo.o0000Ooo.OooO0OO(appCompatActivity, momentSendContentModel6, o0ooo0o2.OooO00o().f27679OooO0o, null);
                            if (!TextUtils.isEmpty(strOooO0OO4)) {
                                Spanned spannedFromHtml4 = Html.fromHtml("<font color='#999999'> " + strOooO0OO4 + ": </font> ");
                                o0ooo0o2.OooO00o().f27679OooO0o.setVisibility(0);
                                o0ooo0o2.OooO00o().f27679OooO0o.getEditableText().insert(0, spannedFromHtml4);
                            }
                        }
                    }
                    break;
                case 7:
                    MomentMessage momentMessage18 = o0ooo0o2.f27658OooO0OO;
                    if (momentMessage18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage18 = null;
                    }
                    MomentMessage.MomentGift momentGift = momentMessage18.getMomentGift();
                    if (momentGift != null) {
                        o0ooo0o2.OooO00o().f27682OooO0oo.setVisibility(8);
                        o0OOo0O.OooOO0.OooO00o oooO00o13 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                        oooO00o13.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                        oooO00o13.f43911OooO0OO = momentGift.getUserHeadUrl();
                        oooO00o13.f43909OooO00o = 0;
                        oooO00o13.OooO0Oo(o0ooo0o2.OooO00o().f27676OooO0O0);
                        o0ooo0o2.OooO00o().f27677OooO0OO.setText(oOO0O0O.OooO0O0(momentGift.getUserId(), momentGift.getUserNickName()));
                        TextView textView7 = o0ooo0o2.OooO00o().f27681OooO0oO;
                        MomentMessage momentMessage19 = o0ooo0o2.f27658OooO0OO;
                        if (momentMessage19 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage19 = null;
                        }
                        textView7.setText(p601o0oo0O0.o0000oo.OooO0Oo(momentMessage19.getTime(), System.currentTimeMillis()));
                        o0ooo0o2.OooO00o().f27684OooOO0O.setVisibility(0);
                        o0ooo0o2.OooO00o().f27683OooOO0.setVisibility(0);
                        o0OOo0O.OooOO0.OooO00o oooO00o14 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                        oooO00o14.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                        oooO00o14.OooO0o0(6);
                        oooO00o14.f43911OooO0OO = momentGift.getGiftImage();
                        oooO00o14.f43909OooO00o = 0;
                        oooO00o14.OooO0Oo(o0ooo0o2.OooO00o().f27684OooOO0O);
                        o0ooo0o2.OooO00o().f27683OooOO0.setText(android.support.v4.media.OooO00o.OooO00o("×", momentGift.getGiftNum()));
                        if (!com.code.android.util.OooOo00.OooO0O0(momentGift.getMomentImageUrl())) {
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(4);
                        } else {
                            o0OOo0O.OooOO0.OooO00o oooO00o15 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                            oooO00o15.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                            oooO00o15.OooO0o0(6);
                            oooO00o15.f43911OooO0OO = momentGift.getMomentImageUrl();
                            oooO00o15.f43909OooO00o = 0;
                            oooO00o15.OooO0Oo(o0ooo0o2.OooO00o().f27674OooO);
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(0);
                        }
                    }
                    break;
                case 8:
                    MomentMessage momentMessage20 = o0ooo0o2.f27658OooO0OO;
                    if (momentMessage20 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                    } else {
                        momentMessage2 = momentMessage20;
                    }
                    MomentMessage.CommentReward commentReward = momentMessage2.getCommentReward();
                    if (commentReward != null) {
                        o0ooo0o2.OooO00o().f27682OooO0oo.setVisibility(8);
                        o0OOo0O.OooOO0.OooO00o oooO00o16 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                        oooO00o16.OooO00o(p543o0oO0O00.OooO.OooO0OO());
                        oooO00o16.f43911OooO0OO = commentReward.getUserHeadUrl();
                        oooO00o16.f43909OooO00o = 0;
                        oooO00o16.OooO0Oo(o0ooo0o2.OooO00o().f27676OooO0O0);
                        o0ooo0o2.OooO00o().f27677OooO0OO.setText(oOO0O0O.OooO0O0(commentReward.getUserId(), commentReward.getUserNickName()));
                        TextView textView8 = o0ooo0o2.OooO00o().f27681OooO0oO;
                        MomentMessage momentMessage21 = o0ooo0o2.f27658OooO0OO;
                        if (momentMessage21 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                            momentMessage21 = null;
                        }
                        textView8.setText(p601o0oo0O0.o0000oo.OooO0Oo(momentMessage21.getTime(), System.currentTimeMillis()));
                        if (com.code.android.util.OooOo00.OooO0O0(commentReward.getMomentImageUrl())) {
                            o0OOo0O.OooOO0.OooO00o oooO00o17 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                            oooO00o17.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                            oooO00o17.OooO0o0(6);
                            oooO00o17.f43911OooO0OO = commentReward.getMomentImageUrl();
                            i3 = 0;
                            oooO00o17.f43909OooO00o = 0;
                            oooO00o17.OooO0Oo(o0ooo0o2.OooO00o().f27674OooO);
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(0);
                        } else {
                            i3 = 0;
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(4);
                        }
                        o0ooo0o2.OooO00o().f27680OooO0o0.setVisibility(i3);
                        o0ooo0o2.OooO00o().f27680OooO0o0.setImageResource(oOo00OO0.ic_moment_comment_reward_color);
                        o0ooo0o2.OooO00o().f27685OooOO0o.setVisibility(i3);
                        String content7 = commentReward.getCommentContent();
                        Intrinsics.checkNotNullParameter(content7, "content");
                        if (content7.length() == 0) {
                            momentSendContentModel7 = null;
                        } else {
                            MomentSendContentModel momentSendContentModel14 = new MomentSendContentModel("");
                            try {
                                Object objOooO0O6 = p579o0oOoo.oOo00OO0.OooO0O0(content7, new SendPostModelContentFromString$toSendPostModelContent$1().getType());
                                Intrinsics.checkNotNullExpressionValue(objOooO0O6, "fromJson(content, object…tSendContentModel?>() {})");
                                momentSendContentModel7 = (MomentSendContentModel) objOooO0O6;
                            } catch (Exception e7) {
                                e7.printStackTrace();
                                momentSendContentModel7 = momentSendContentModel14;
                            }
                        }
                        if (momentSendContentModel7 != null) {
                            p595o0oo00Oo.o0000Ooo.OooO0OO(appCompatActivity, momentSendContentModel7, o0ooo0o2.OooO00o().f27685OooOO0o, null);
                            o0ooo0o2.OooO00o().f27685OooOO0o.getEditableText().insert(0, Html.fromHtml("<font color='#999999'> " + com.code.android.util.o0000.OooO0OO(oO00OOo0.moment_message_reward_comments_title) + "</font> "));
                        }
                    }
                    break;
                case 9:
                    o0ooo0o2.OooOO0o();
                    break;
                case 10:
                    MomentMessage momentMessage22 = o0ooo0o2.f27658OooO0OO;
                    if (momentMessage22 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("data");
                        momentMessage22 = null;
                    }
                    MomentMessage.MomentFeatured momentFeatured = momentMessage22.getMomentFeatured();
                    if (momentFeatured != null) {
                        o0ooo0o2.OooO00o().f27676OooO0O0.setImageResource(oOo00OO0.ic_moment_message_featured_add);
                        o0ooo0o2.OooO00o().f27677OooO0OO.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.Featured));
                        o0ooo0o2.OooO00o().f27679OooO0o.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.moment_featured_add_message_info));
                        o0ooo0o2.OooO00o().f27679OooO0o.setVisibility(0);
                        TextView textView9 = o0ooo0o2.OooO00o().f27681OooO0oO;
                        MomentMessage momentMessage23 = o0ooo0o2.f27658OooO0OO;
                        if (momentMessage23 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("data");
                        } else {
                            momentMessage2 = momentMessage23;
                        }
                        textView9.setText(p601o0oo0O0.o0000oo.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
                        o0ooo0o2.OooO00o().f27682OooO0oo.setVisibility(8);
                        if (!TextUtils.isEmpty(momentFeatured.getMomentImageUrl())) {
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(0);
                            String strOooO0O0 = p139o00OOooO.OooO0o.OooO0O0(com.code.android.util.o0000O0.OooO00o(120), momentFeatured.getMomentImageUrl());
                            o0OOo0O.OooOO0.OooO00o oooO00o18 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                            oooO00o18.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                            oooO00o18.OooO0o0(6);
                            oooO00o18.f43911OooO0OO = strOooO0O0;
                            oooO00o18.f43909OooO00o = 0;
                            oooO00o18.OooO0Oo(o0ooo0o2.OooO00o().f27674OooO);
                        } else {
                            o0ooo0o2.OooO00o().f27674OooO.setVisibility(4);
                        }
                    }
                    break;
                case 11:
                    o0ooo0o2.OooO0OO();
                    break;
                case 12:
                    o0ooo0o2.OooOO0O();
                    break;
                case 13:
                    o0ooo0o2.OooOO0();
                    break;
                case 14:
                    o0ooo0o2.OooO();
                    break;
                case 15:
                    o0ooo0o2.OooO0o();
                    break;
                case 16:
                    o0ooo0o2.OooO0o0();
                    break;
                case 17:
                    o0ooo0o2.OooO0Oo();
                    break;
                case 18:
                    o0ooo0o2.OooO0oO();
                    break;
                case 19:
                    o0ooo0o2.OooO0oo();
                    break;
                case 20:
                    o0ooo0o2.OooO0O0();
                    break;
            }
        } else {
            MomentMessage momentMessage24 = o0ooo0o2.f27658OooO0OO;
            if (momentMessage24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
                momentMessage24 = null;
            }
            MomentMessage.MomentTopicTopRevoke momentTopicTopRevoke = momentMessage24.getMomentTopicTopRevoke();
            if (momentTopicTopRevoke != null) {
                o0ooo0o2.OooO00o().f27676OooO0O0.setImageResource(oOo00OO0.ic_moment_message_unpinned);
                o0ooo0o2.OooO00o().f27677OooO0OO.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.MessageFragment_moment_postUnpinned));
                o0ooo0o2.OooO00o().f27679OooO0o.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.MessageFragment_moment_postUnpinned_itemInfo), momentTopicTopRevoke.getTopicName()));
                o0ooo0o2.OooO00o().f27679OooO0o.setVisibility(0);
                TextView textView10 = o0ooo0o2.OooO00o().f27681OooO0oO;
                MomentMessage momentMessage25 = o0ooo0o2.f27658OooO0OO;
                if (momentMessage25 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("data");
                } else {
                    momentMessage2 = momentMessage25;
                }
                textView10.setText(p601o0oo0O0.o0000oo.OooO0Oo(momentMessage2.getTime(), System.currentTimeMillis()));
                o0ooo0o2.OooO00o().f27682OooO0oo.setVisibility(8);
                o0ooo0o2.OooO00o().f27674OooO.setVisibility(4);
                if (!TextUtils.isEmpty(momentTopicTopRevoke.getMomentImageUrl())) {
                    o0ooo0o2.OooO00o().f27674OooO.setVisibility(0);
                    o0OOo0O.OooOO0.OooO00o oooO00o19 = new o0OOo0O.OooOO0.OooO00o(appCompatActivity);
                    oooO00o19.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                    oooO00o19.OooO0o0(6);
                    oooO00o19.f43911OooO0OO = p396o0Oo0O.OooOOO.OooO00o(momentTopicTopRevoke.getMomentImageUrl());
                    oooO00o19.f43909OooO00o = 0;
                    oooO00o19.OooO0Oo(o0ooo0o2.OooO00o().f27674OooO);
                }
            }
        }
        o0ooo0o2.OooO00o().f27677OooO0OO.requestLayout();
    }
}
