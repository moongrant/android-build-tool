package p563o0oOo0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.OooOo;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.common.util.Oooo0;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import com.yalla.yalla.ui.view.ScoreLayout;
import com.yalla.yalla.util.netimage.NetImageView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00O0000;
import p350o0OOOOOo.OooOO0O;
import p464o0Ooo0oO.o0000O0O;
import p464o0Ooo0oO.o000OO;
import p498o0o00Oo0.OooOOO;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOO00O extends o0000O0O<YallaTeamMessage> {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f45108OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f45109OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public Function1<? super YallaTeamMessage, Unit> f45110OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public Function2<? super Long, ? super Integer, Unit> f45111OooOo00;

    public static final class OooO00o extends OooOo.OooO<YallaTeamMessage> {
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

    public static final class OooO0O0 extends OooOO0O {
        @Override // p350o0OOOOOo.OooOO0O
        public final int OooO0O0(int i) {
            if (i == 0) {
                return R.layout.message_item_yalla_team_send;
            }
            if (i != 1) {
                return i != 2 ? R.layout.message_item_yalla_team_send : R.layout.message_item_yalla_team_satisfaction_survey;
            }
            return R.layout.message_item_yalla_team_receive;
        }
    }

    public oOO00O() {
        super(null, new OooO00o());
        this.f40451OooO0o = new OooO0O0();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003d  */
    @Override // p464o0Ooo0oO.o0000O0O
    public final void OooO0o(o000OO holder, YallaTeamMessage yallaTeamMessage) {
        boolean z;
        YallaTeamMessage.SatisfactionSurvey satisfactionSurvey;
        final YallaTeamMessage item = yallaTeamMessage;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition < getItemCount() - 1) {
            long time = item.getTime();
            YallaTeamMessage item2 = getItem(bindingAdapterPosition + 1);
            Intrinsics.checkNotNull(item2);
            if (time - item2.getTime() > 60000) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        if (z) {
            holder.OooO0OO(R.id.tvTime, false);
            holder.OooO0o0(R.id.tvTime, o00O0.f48624OooO00o.OooO0Oo(item.getTime(), System.currentTimeMillis()));
        } else {
            holder.OooO0OO(R.id.tvTime, true);
        }
        int itemViewType = getItemViewType(bindingAdapterPosition);
        if (itemViewType == 0) {
            holder.OooO0o0(R.id.tvContent, item.getMessage());
            NetImageView netImageView = (NetImageView) holder.OooO00o(R.id.ivHeader);
            oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(netImageView.getContext());
            String value = OooOOO.f41216OooO00o.OooO0oo().getValue();
            Intrinsics.checkNotNull(value);
            oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize$default(value, OooOo00.OooO00o(40), false, 2, null);
            oooO00o.f48427OooO00o = 0;
            oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
            oooO00o.OooO0o(netImageView);
            return;
        }
        if (itemViewType != 1) {
            if (itemViewType == 2 && (satisfactionSurvey = item.getSatisfactionSurvey()) != null) {
                ScoreLayout scoreLayout = (ScoreLayout) holder.OooO00o(R.id.scoreLayout);
                holder.OooO0OO(R.id.tvConfirm, satisfactionSurvey.getIsSubmit());
                holder.OooO0OO(R.id.tvSubmitSuccess, true ^ satisfactionSurvey.getIsSubmit());
                if (satisfactionSurvey.getIsSubmit()) {
                    scoreLayout.setCurrentScore(satisfactionSurvey.getScore());
                    return;
                }
                Ref.IntRef intRef = new Ref.IntRef();
                intRef.element = -1;
                scoreLayout.setSelectRequest(new o00O0O00(intRef));
                o00O0O.OooO0Oo(holder.OooO00o(R.id.tvConfirm), new o00O0O0(intRef, this, satisfactionSurvey));
                return;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) holder.OooO00o(R.id.llBg);
        TextView textView = (TextView) holder.OooO00o(R.id.tvMessage);
        NetImageView netImageView2 = (NetImageView) holder.OooO00o(R.id.ivCover);
        ImageView imageView = (ImageView) holder.OooO00o(R.id.ivTextMore);
        TextView textView2 = (TextView) holder.OooO00o(R.id.tvViewMore);
        View viewOooO00o = holder.OooO00o(R.id.vHolder);
        TextView textView3 = (TextView) holder.OooO00o(R.id.tvTitle);
        constraintLayout.setBackgroundResource(R.drawable.bg_chitchat_receive);
        constraintLayout.setOnClickListener(null);
        o00O0O.OooO00o(netImageView2);
        o00O0O.OooO00o(imageView);
        o00O0O.OooO00o(textView2);
        o00O0O.OooO00o(viewOooO00o);
        o00O0O.OooO00o(textView3);
        textView.setMaxLines(Integer.MAX_VALUE);
        float f = 16;
        o00O0O.OooO0o0(textView, OooOo00.OooO00o(f));
        o00O0O.OooO0o0(textView3, OooOo00.OooO00o(f));
        int type = item.getType();
        if (type == 2) {
            textView.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.yalla_team_thanks_feedback));
            Oooo0.OooO0O0(textView, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_00d8c9), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.yalla_team_my_feedback));
            Oooo0.OooO00o(textView, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.yalla_team_my_feedback), new o00O00o0(this));
        } else if (type == 4) {
            textView.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.yalla_team_feedback_replied));
            Oooo0.OooO0O0(textView, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_00d8c9), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.yalla_team_my_feedback));
            Oooo0.OooO00o(textView, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.yalla_team_my_feedback), new oo00o(this));
        } else if (type != 6) {
            o00O0000.OooO00o(textView3, item.getTitle());
            textView.setText(item.getMessage());
            if (item.getMessageType() == 2) {
                constraintLayout.setBackgroundResource(R.drawable.bg_item_yalla_team_image);
                o00O0O.OooO(viewOooO00o);
                oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(textView.getContext());
                oooO00o2.f48429OooO0OO = item.getCoverImage();
                oooO00o2.f48427OooO00o = 0;
                oooO00o2.OooO00o(o00OOO.OooO00o.OooO0o());
                oooO00o2.OooO0oo(8, 8, 0, 0);
                oooO00o2.OooO0o(netImageView2);
                o00O0O.OooO(netImageView2);
                float f2 = 12;
                o00O0O.OooO0o0(textView, OooOo00.OooO00o(f2));
                o00O0O.OooO0o0(textView3, OooOo00.OooO00o(f2));
                textView.setMaxLines(2);
                o00O0O.OooO(imageView);
                constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: o0oOo0.o00O00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        oOO00O this$0 = this.f45066Oooo0o;
                        YallaTeamMessage item3 = item;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(item3, "$item");
                        Function1<? super YallaTeamMessage, Unit> function1 = this$0.f45110OooOOoo;
                        if (function1 != null) {
                            function1.invoke(item3);
                        }
                    }
                });
            }
            if (item.getJumpType() > 0) {
                o00O0O.OooO(textView2);
                textView2.setOnClickListener(new View.OnClickListener() { // from class: o0oOo0.o00O00O
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        oOO00O this$0 = this.f45077Oooo0o;
                        YallaTeamMessage item3 = item;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(item3, "$item");
                        Function1<? super YallaTeamMessage, Unit> function1 = this$0.f45110OooOOoo;
                        if (function1 != null) {
                            function1.invoke(item3);
                        }
                    }
                });
            }
        } else {
            textView.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.yalla_team_welcome_to_yalla));
            Oooo0.OooO0O0(textView, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_00d8c9), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.yalla_team_my_feedback));
            Oooo0.OooO00o(textView, com.yalla.support.common.util.OooOOO.OooO0OO(R.string.yalla_team_my_feedback), new o00O00OO(this));
        }
        String string = textView.getText().toString();
        ArrayList<String> arrayList = new ArrayList();
        int i = 0;
        while (StringsKt__StringsKt.indexOf(string, "http", i, true) >= 0) {
            int iIndexOf = StringsKt__StringsKt.indexOf(string, "http", i, true);
            int iIndexOf2 = StringsKt__StringsKt.indexOf(string, ZegoConstants.ZegoVideoDataAuxPublishingStream, iIndexOf, true);
            if (iIndexOf2 == -1) {
                iIndexOf2 = string.length();
            }
            String strSubstring = string.substring(iIndexOf, iIndexOf2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            i = iIndexOf2;
        }
        for (String str : arrayList) {
            Oooo0.OooO0O0(textView, com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_00d8c9), str);
            Oooo0.OooO00o(textView, str, new o00O0(this, str));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        YallaTeamMessage item = getItem(i);
        Integer numValueOf = item != null ? Integer.valueOf(item.getType()) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return 0;
        }
        return (numValueOf != null && numValueOf.intValue() == 7) ? 2 : 1;
    }
}
