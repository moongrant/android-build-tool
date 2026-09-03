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
import p475o0Ooooo0.o0O00oO0;
import p606o0oo0O0o.o0O0O0o0;
import p642o0ooOOO0.d1;
import p643o0ooOOOO.h3;
import p643o0ooOOOO.j3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nYallaTeamMessageAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YallaTeamMessageAdapter.kt\ncom/yalla/yalla/ui/adapter/YallaTeamMessageAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,229:1\n1855#2,2:230\n*S KotlinDebug\n*F\n+ 1 YallaTeamMessageAdapter.kt\ncom/yalla/yalla/ui/adapter/YallaTeamMessageAdapter\n*L\n169#1:230,2\n*E\n"})
public final class o00O0O00 extends h3<YallaTeamMessage> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f27139OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public Function1<? super YallaTeamMessage, Unit> f27140OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public Function1<? super YallaTeamMessage, Unit> f27141OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public Function2<? super Long, ? super Integer, Unit> f27142OooOo00;

    public static final class OooO00o extends androidx.recyclerview.widget.Oooo000.OooO<YallaTeamMessage> {
        @Override // androidx.recyclerview.widget.Oooo000.OooO
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

        @Override // androidx.recyclerview.widget.Oooo000.OooO
        public final boolean OooO0O0(YallaTeamMessage yallaTeamMessage, YallaTeamMessage yallaTeamMessage2) {
            YallaTeamMessage oldItem = yallaTeamMessage;
            YallaTeamMessage newItem = yallaTeamMessage2;
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getUid() == newItem.getUid() && Intrinsics.areEqual(oldItem.getMid(), newItem.getMid());
        }
    }

    public static final class OooO0O0 extends j3 {
        @Override // p643o0ooOOOO.j3
        public final int OooO00o(int i) {
            if (i == 0) {
                return p562o0oOo000.oo0o0Oo.message_item_yalla_team_send;
            }
            if (i != 1) {
                return i != 2 ? p562o0oOo000.oo0o0Oo.message_item_yalla_team_send : p562o0oOo000.oo0o0Oo.message_item_yalla_team_satisfaction_survey;
            }
            return p562o0oOo000.oo0o0Oo.message_item_yalla_team_receive;
        }
    }

    public o00O0O00() {
        super(null, new OooO00o());
        this.f58000OooO0o = new OooO0O0();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0037  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p643o0ooOOOO.h3
    public final void OooO0o(PagingViewHolder holder, YallaTeamMessage yallaTeamMessage) {
        boolean z;
        YallaTeamMessage.SatisfactionSurvey satisfactionSurvey;
        final YallaTeamMessage item = yallaTeamMessage;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        int iIndexOf = 0;
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
            int i = p562o0oOo000.o0OO00O.tvTime;
            holder.setGone(i, false);
            holder.setText(i, o0O0O0o0.OooO0Oo(item.getTime(), System.currentTimeMillis()));
        } else {
            holder.setGone(p562o0oOo000.o0OO00O.tvTime, true);
        }
        int itemViewType = getItemViewType(bindingAdapterPosition);
        if (itemViewType == 0) {
            holder.setText(p562o0oOo000.o0OO00O.tvContent, item.getMessage());
            NetImageView netImageView = (NetImageView) holder.getView(p562o0oOo000.o0OO00O.ivHeader);
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(netImageView.getContext());
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            T value = o0O00oO0.OooO().getValue();
            Intrinsics.checkNotNull(value);
            int iOooO00o = com.code.android.util.o0000O0.OooO00o(40);
            oooO00o.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(iOooO00o, iOooO00o, (String) value);
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.OooO0Oo(netImageView);
            return;
        }
        if (itemViewType != 1) {
            if (itemViewType == 2 && (satisfactionSurvey = item.getSatisfactionSurvey()) != null) {
                ScoreLayout scoreLayout = (ScoreLayout) holder.getView(p562o0oOo000.o0OO00O.scoreLayout);
                int i2 = p562o0oOo000.o0OO00O.tvConfirm;
                holder.setGone(i2, satisfactionSurvey.getIsSubmit());
                holder.setGone(p562o0oOo000.o0OO00O.tvSubmitSuccess, true ^ satisfactionSurvey.getIsSubmit());
                if (satisfactionSurvey.getIsSubmit()) {
                    scoreLayout.setCurrentScore(satisfactionSurvey.getScore());
                    return;
                }
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = -1;
                scoreLayout.setSelectRequest(new o00O0OO(intRef));
                com.code.android.util.o000O.OooO0oo(holder.getView(i2), new o00O0OOO(intRef, this, satisfactionSurvey));
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) holder.getView(p562o0oOo000.o0OO00O.llBg);
        TextView textView = (TextView) holder.getView(p562o0oOo000.o0OO00O.tvMessage);
        NetImageView netImageView2 = (NetImageView) holder.getView(p562o0oOo000.o0OO00O.ivCover);
        ImageView imageView = (ImageView) holder.getView(p562o0oOo000.o0OO00O.ivTextMore);
        TextView textView2 = (TextView) holder.getView(p562o0oOo000.o0OO00O.tvViewMore);
        View view = holder.getView(p562o0oOo000.o0OO00O.vHolder);
        TextView textView3 = (TextView) holder.getView(p562o0oOo000.o0OO00O.tvTitle);
        constraintLayout.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_chitchat_receive);
        constraintLayout.setOnClickListener(null);
        com.code.android.util.o000O.OooO0O0(netImageView2);
        com.code.android.util.o000O.OooO0O0(imageView);
        com.code.android.util.o000O.OooO00o(imageView);
        com.code.android.util.o000O.OooO0O0(textView2);
        com.code.android.util.o000O.OooO0O0(view);
        com.code.android.util.o000O.OooO0O0(textView3);
        textView.setMaxLines(Integer.MAX_VALUE);
        float f = 16;
        com.code.android.util.o000O.OooOO0O(textView, com.code.android.util.o0000O0.OooO00o(f));
        com.code.android.util.o000O.OooOO0O(textView3, com.code.android.util.o0000O0.OooO00o(f));
        int type = item.getType();
        if (type == 2) {
            textView.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.yalla_team_thanks_feedback));
            int iOooO00o2 = com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9);
            int i3 = p562o0oOo000.o000000.yalla_team_my_feedback;
            com.code.android.util.o000.OooO0O0(textView, iOooO00o2, com.code.android.util.o0000.OooO0OO(i3));
            com.code.android.util.o000.OooO00o(textView, com.code.android.util.o0000.OooO0OO(i3), new o00O0O0O(this, item));
        } else if (type == 4) {
            textView.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.yalla_team_feedback_replied));
            int iOooO00o3 = com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9);
            int i4 = p562o0oOo000.o000000.yalla_team_my_feedback;
            com.code.android.util.o000.OooO0O0(textView, iOooO00o3, com.code.android.util.o0000.OooO0OO(i4));
            com.code.android.util.o000.OooO00o(textView, com.code.android.util.o0000.OooO0OO(i4), new o00O0OO0(this, item));
        } else if (type != 6) {
            com.code.android.util.o000O000.OooO00o(textView3, item.getTitle());
            textView.setText(item.getMessage());
            if (item.getMessageType() == 2) {
                constraintLayout.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_item_yalla_team_image);
                com.code.android.util.o000O.OooOOOO(view);
                o0OOo0Oo.Oooo000.OooO00o oooO00o2 = new o0OOo0Oo.Oooo000.OooO00o(textView.getContext());
                oooO00o2.f43126OooO0OO = item.getCoverImage();
                oooO00o2.f43124OooO00o = 0;
                oooO00o2.OooO00o(d1.OooO0Oo());
                oooO00o2.OooO0o(8, 8, 0, 0);
                oooO00o2.OooO0Oo(netImageView2);
                com.code.android.util.o000O.OooOOOO(netImageView2);
                float f2 = 12;
                com.code.android.util.o000O.OooOO0O(textView, com.code.android.util.o0000O0.OooO00o(f2));
                com.code.android.util.o000O.OooOO0O(textView3, com.code.android.util.o0000O0.OooO00o(f2));
                textView.setMaxLines(2);
                com.code.android.util.o000O.OooOOOO(imageView);
                constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.adapter.oo00o
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        o00O0O00 this$0 = this.f27232OooO0Oo;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        YallaTeamMessage item2 = item;
                        Intrinsics.checkNotNullParameter(item2, "$item");
                        Function1<? super YallaTeamMessage, Unit> function1 = this$0.f27141OooOOoo;
                        if (function1 != null) {
                            function1.invoke(item2);
                        }
                    }
                });
            }
            if (item.getJumpType() > 0) {
                com.code.android.util.o000O.OooOOOO(textView2);
                textView2.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.adapter.o00O0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        o00O0O00 this$0 = this.f27105OooO0Oo;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        YallaTeamMessage item2 = item;
                        Intrinsics.checkNotNullParameter(item2, "$item");
                        Function1<? super YallaTeamMessage, Unit> function1 = this$0.f27141OooOOoo;
                        if (function1 != null) {
                            function1.invoke(item2);
                        }
                    }
                });
            }
        } else {
            textView.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.yalla_team_welcome_to_yalla));
            int iOooO00o4 = com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9);
            int i5 = p562o0oOo000.o000000.yalla_team_my_feedback;
            com.code.android.util.o000.OooO0O0(textView, iOooO00o4, com.code.android.util.o0000.OooO0OO(i5));
            com.code.android.util.o000.OooO00o(textView, com.code.android.util.o0000.OooO0OO(i5), new o00O0O0(this, item));
        }
        String string = textView.getText().toString();
        ArrayList<String> arrayList = new ArrayList();
        while (StringsKt__StringsKt.indexOf((CharSequence) string, "http", iIndexOf, true) >= 0) {
            int iIndexOf2 = StringsKt__StringsKt.indexOf((CharSequence) string, "http", iIndexOf, true);
            iIndexOf = StringsKt__StringsKt.indexOf((CharSequence) string, ZegoConstants.ZegoVideoDataAuxPublishingStream, iIndexOf2, true);
            if (iIndexOf == -1) {
                iIndexOf = string.length();
            }
            String strSubstring = string.substring(iIndexOf2, iIndexOf);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
        }
        for (String str : arrayList) {
            com.code.android.util.o000.OooO0O0(textView, com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_00d8c9), str);
            com.code.android.util.o000.OooO00o(textView, str, new oo0o0O0(this, str));
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
