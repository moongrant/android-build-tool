package com.yalla.yalla.ui.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.paging.PagingViewHolder;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.ui.view.ScoreLayout;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nYallaTeamMessageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YallaTeamMessageAdapter.kt\ncom/yalla/yalla/ui/adapter/YallaTeamMessageAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n1855#2,2:230\n*S KotlinDebug\n*F\n+ 1 YallaTeamMessageAdapter.kt\ncom/yalla/yalla/ui/adapter/YallaTeamMessageAdapter\n*L\n169#1:230,2\n*E\n"})
public final class o00O00o0 extends p400o0Oo0OO.OooOO0O<YallaTeamMessage> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f27617OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public Function1<? super YallaTeamMessage, Unit> f27618OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public Function1<? super YallaTeamMessage, Unit> f27619OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public Function2<? super Long, ? super Integer, Unit> f27620OooOo00;

    public static final class OooO00o extends androidx.recyclerview.widget.OooOo.OooO<YallaTeamMessage> {
        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO00o(YallaTeamMessage yallaTeamMessage, YallaTeamMessage yallaTeamMessage2) {
            YallaTeamMessage oldItem = yallaTeamMessage;
            YallaTeamMessage newItem = yallaTeamMessage2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if (Intrinsics.areEqual(oldItem.getMessage(), newItem.getMessage())) {
                YallaTeamMessage.SatisfactionSurvey satisfactionSurvey = oldItem.getSatisfactionSurvey();
                Boolean boolValueOf = satisfactionSurvey != null ? Boolean.valueOf(satisfactionSurvey.getIsSubmit()) : null;
                YallaTeamMessage.SatisfactionSurvey satisfactionSurvey2 = newItem.getSatisfactionSurvey();
                if (Intrinsics.areEqual(boolValueOf, satisfactionSurvey2 != null ? Boolean.valueOf(satisfactionSurvey2.getIsSubmit()) : null)) {
                    YallaTeamMessage.SatisfactionSurvey satisfactionSurvey3 = oldItem.getSatisfactionSurvey();
                    Integer numValueOf = satisfactionSurvey3 != null ? Integer.valueOf(satisfactionSurvey3.getScore()) : null;
                    YallaTeamMessage.SatisfactionSurvey satisfactionSurvey4 = newItem.getSatisfactionSurvey();
                    if (Intrinsics.areEqual(numValueOf, satisfactionSurvey4 != null ? Integer.valueOf(satisfactionSurvey4.getScore()) : null)) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.OooOo.OooO
        public final boolean OooO0O0(YallaTeamMessage yallaTeamMessage, YallaTeamMessage yallaTeamMessage2) {
            YallaTeamMessage oldItem = yallaTeamMessage;
            YallaTeamMessage newItem = yallaTeamMessage2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getUid() == newItem.getUid() && Intrinsics.areEqual(oldItem.getMid(), newItem.getMid());
        }
    }

    public static final class OooO0O0 extends p400o0Oo0OO.OooOOO {
        @Override // p400o0Oo0OO.OooOOO
        public final int OooO00o(int i) {
            if (i == 0) {
                return oO00OO0O.message_item_yalla_team_send;
            }
            if (i != 1) {
                return i != 2 ? oO00OO0O.message_item_yalla_team_send : oO00OO0O.message_item_yalla_team_satisfaction_survey;
            }
            return oO00OO0O.message_item_yalla_team_receive;
        }
    }

    public o00O00o0() {
        super(null, new OooO00o());
        this.f44441OooO0o = new OooO0O0();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0037  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p400o0Oo0OO.OooOO0O
    public final void OooO0o(PagingViewHolder holder, YallaTeamMessage yallaTeamMessage) {
        boolean z;
        YallaTeamMessage.SatisfactionSurvey satisfactionSurvey;
        YallaTeamMessage item = yallaTeamMessage;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        int i = 1;
        int i2 = 0;
        if (bindingAdapterPosition < getItemCount() - 1) {
            long time = item.getTime();
            YallaTeamMessage yallaTeamMessageOooO0O0 = OooO0O0(bindingAdapterPosition + 1);
            Intrinsics.checkNotNull(yallaTeamMessageOooO0O0);
            if (time - yallaTeamMessageOooO0O0.getTime() > 60000) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if (z) {
            int i3 = oO00O0oO.tvTime;
            holder.setGone(i3, false);
            holder.setText(i3, p601o0oo0O0.o0000oo.OooO0Oo(item.getTime(), System.currentTimeMillis()));
        } else {
            holder.setGone(oO00O0oO.tvTime, true);
        }
        int itemViewType = getItemViewType(bindingAdapterPosition);
        if (itemViewType == 0) {
            holder.setText(oO00O0oO.tvContent, item.getMessage());
            NetImageView netImageView = (NetImageView) holder.getView(oO00O0oO.ivHeader);
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(netImageView.getContext());
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            T value = p464o0Oooo.o000000O.OooO().getValue();
            Intrinsics.checkNotNull(value);
            int iOooO00o = com.code.android.util.o0000O0.OooO00o(40);
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(iOooO00o, iOooO00o, (String) value);
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.OooO0Oo(netImageView);
            return;
        }
        if (itemViewType != 1) {
            if (itemViewType == 2 && (satisfactionSurvey = item.getSatisfactionSurvey()) != null) {
                ScoreLayout scoreLayout = (ScoreLayout) holder.getView(oO00O0oO.scoreLayout);
                int i4 = oO00O0oO.tvConfirm;
                holder.setGone(i4, satisfactionSurvey.getIsSubmit());
                holder.setGone(oO00O0oO.tvSubmitSuccess, true ^ satisfactionSurvey.getIsSubmit());
                if (satisfactionSurvey.getIsSubmit()) {
                    scoreLayout.setCurrentScore(satisfactionSurvey.getScore());
                    return;
                }
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = -1;
                scoreLayout.setSelectRequest(new o00O0O0O(intRef));
                com.code.android.util.o000OO00.OooO0oo(holder.getView(i4), new o00O0OO0(intRef, this, satisfactionSurvey));
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) holder.getView(oO00O0oO.llBg);
        TextView textView = (TextView) holder.getView(oO00O0oO.tvMessage);
        NetImageView netImageView2 = (NetImageView) holder.getView(oO00O0oO.ivCover);
        ImageView imageView = (ImageView) holder.getView(oO00O0oO.ivTextMore);
        TextView textView2 = (TextView) holder.getView(oO00O0oO.tvViewMore);
        View view = holder.getView(oO00O0oO.vHolder);
        TextView textView3 = (TextView) holder.getView(oO00O0oO.tvTitle);
        constraintLayout.setBackgroundResource(oOo00OO0.bg_chitchat_receive);
        constraintLayout.setOnClickListener(null);
        com.code.android.util.o000OO00.OooO0O0(netImageView2);
        com.code.android.util.o000OO00.OooO0O0(imageView);
        com.code.android.util.o000OO00.OooO00o(imageView);
        com.code.android.util.o000OO00.OooO0O0(textView2);
        com.code.android.util.o000OO00.OooO0O0(view);
        com.code.android.util.o000OO00.OooO0O0(textView3);
        textView.setMaxLines(Integer.MAX_VALUE);
        float f = 16;
        com.code.android.util.o000OO00.OooOO0O(textView, com.code.android.util.o0000O0.OooO00o(f));
        com.code.android.util.o000OO00.OooOO0O(textView3, com.code.android.util.o0000O0.OooO00o(f));
        int type = item.getType();
        if (type == 2) {
            textView.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.yalla_team_thanks_feedback));
            int iOooO00o2 = com.code.android.util.o0000.OooO00o(oO00O0o.color_00d8c9);
            int i5 = oO00OOo0.yalla_team_my_feedback;
            com.code.android.util.o000.OooO0O0(textView, iOooO00o2, com.code.android.util.o0000.OooO0OO(i5));
            com.code.android.util.o000.OooO00o(textView, com.code.android.util.o0000.OooO0OO(i5), new o00O0(this, item));
        } else if (type == 4) {
            textView.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.yalla_team_feedback_replied));
            int iOooO00o3 = com.code.android.util.o0000.OooO00o(oO00O0o.color_00d8c9);
            int i6 = oO00OOo0.yalla_team_my_feedback;
            com.code.android.util.o000.OooO0O0(textView, iOooO00o3, com.code.android.util.o0000.OooO0OO(i6));
            com.code.android.util.o000.OooO00o(textView, com.code.android.util.o0000.OooO0OO(i6), new o00O0O00(this, item));
        } else if (type != 6) {
            com.code.android.util.o000O000.OooO00o(textView3, item.getTitle());
            textView.setText(item.getMessage());
            if (item.getMessageType() == 2) {
                constraintLayout.setBackgroundResource(oOo00OO0.bg_item_yalla_team_image);
                com.code.android.util.o000OO00.OooOOOO(view);
                o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(textView.getContext());
                oooO00o2.f43911OooO0OO = item.getCoverImage();
                oooO00o2.f43909OooO00o = 0;
                oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO0Oo());
                oooO00o2.OooO0o(8, 8, 0, 0);
                oooO00o2.OooO0Oo(netImageView2);
                com.code.android.util.o000OO00.OooOOOO(netImageView2);
                float f2 = 12;
                com.code.android.util.o000OO00.OooOO0O(textView, com.code.android.util.o0000O0.OooO00o(f2));
                com.code.android.util.o000OO00.OooOO0O(textView3, com.code.android.util.o0000O0.OooO00o(f2));
                textView.setMaxLines(2);
                com.code.android.util.o000OO00.OooOOOO(imageView);
                constraintLayout.setOnClickListener(new p279o0O00o0o.o00Oo0(i, this, item));
            }
            if (item.getJumpType() > 0) {
                com.code.android.util.o000OO00.OooOOOO(textView2);
                textView2.setOnClickListener(new p400o0Oo0OO.OooO(this, item, i));
            }
        } else {
            textView.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.yalla_team_welcome_to_yalla));
            int iOooO00o4 = com.code.android.util.o0000.OooO00o(oO00O0o.color_00d8c9);
            int i7 = oO00OOo0.yalla_team_my_feedback;
            com.code.android.util.o000.OooO0O0(textView, iOooO00o4, com.code.android.util.o0000.OooO0OO(i7));
            com.code.android.util.o000.OooO00o(textView, com.code.android.util.o0000.OooO0OO(i7), new oo00o(this, item));
        }
        String string = textView.getText().toString();
        ArrayList<String> arrayList = new ArrayList();
        while (StringsKt__StringsKt.indexOf((CharSequence) string, "http", i2, true) >= 0) {
            int iIndexOf = StringsKt__StringsKt.indexOf((CharSequence) string, "http", i2, true);
            int iIndexOf2 = StringsKt__StringsKt.indexOf((CharSequence) string, ZegoConstants.ZegoVideoDataAuxPublishingStream, iIndexOf, true);
            if (iIndexOf2 == -1) {
                iIndexOf2 = string.length();
            }
            i2 = iIndexOf2;
            String strSubstring = string.substring(iIndexOf, i2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
        }
        for (String str : arrayList) {
            com.code.android.util.o000.OooO0O0(textView, com.code.android.util.o0000.OooO00o(oO00O0o.color_00d8c9), str);
            com.code.android.util.o000.OooO00o(textView, str, new o00O0O0(this, str));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        YallaTeamMessage yallaTeamMessageOooO0O0 = OooO0O0(i);
        Integer numValueOf = yallaTeamMessageOooO0O0 != null ? Integer.valueOf(yallaTeamMessageOooO0O0.getType()) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return 0;
        }
        return (numValueOf != null && numValueOf.intValue() == 7) ? 2 : 1;
    }
}
