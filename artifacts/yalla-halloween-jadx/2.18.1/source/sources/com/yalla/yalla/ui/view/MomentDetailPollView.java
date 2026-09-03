package com.yalla.yalla.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.model.MomentPoll;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p176o00OoooO.oO000Oo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p437o0OoOOOo.o0O0oo0o;
import p496o0o00OOo.o000oOoO;
import p603o0oo00o0.o00000OO;
import p621o0oo0o0o.o00O0;
import p649o0ooOOoo.r9;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR?\u0010\u000e\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR?\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentDetailPollView;", "Landroid/widget/LinearLayout;", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isExpire", "", "OoooOo0", "Lkotlin/jvm/functions/Function1;", "getToMomentDetailListener", "()Lkotlin/jvm/functions/Function1;", "setToMomentDetailListener", "(Lkotlin/jvm/functions/Function1;)V", "toMomentDetailListener", "Lcom/yalla/yalla/model/MomentPoll;", "poll", "OoooOoO", "getChangeMomentPollListener", "setChangeMomentPollListener", "changeMomentPollListener", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"NotifyDataSetChanged"})
public final class MomentDetailPollView extends LinearLayout {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final /* synthetic */ int f24891Ooooo0o = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f24892Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final r9 f24893Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final int f24894Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f24895Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public MomentPoll f24896OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f24897OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f24898OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public FragmentActivity f24899OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public MomentVM f24900OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public long f24901OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public p188o00o00o0.OooO0OO<MomentPoll.Option> f24902OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> toMomentDetailListener;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super MomentPoll, Unit> changeMomentPollListener;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public final int f24905OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final int f24906Ooooo00;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f24907o000oOoO;

    public static final class OooO00o extends p188o00o00o0.OooO0OO<MomentPoll.Option> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailPollView f24908OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, MomentDetailPollView momentDetailPollView) {
            super(context, R.layout.item_moment_poll);
            this.f24908OooO00o = momentDetailPollView;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
            MomentPoll.Option item = (MomentPoll.Option) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            MomentDetailPollView momentDetailPollView = this.f24908OooO00o;
            MomentPoll momentPoll = momentDetailPollView.f24896OoooO;
            if (momentPoll != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) helper.OooO0Oo(R.id.bg);
                TextView textView = (TextView) helper.OooO0Oo(R.id.content);
                ImageView ivSelect = (ImageView) helper.OooO0Oo(R.id.select);
                TextView pollNum = (TextView) helper.OooO0Oo(R.id.pollNum);
                ProgressBar progressBar = (ProgressBar) helper.OooO0Oo(R.id.progressBar);
                textView.setText(item.getOptionText());
                pollNum.setText(String.valueOf(item.getVoteCount()));
                progressBar.setMax(momentPoll.getVoteCount());
                if (item.getIsVote()) {
                    constraintLayout.setBackgroundResource(momentDetailPollView.f24894Oooo0oO);
                    textView.setTextColor(momentDetailPollView.f24898OoooO00);
                    pollNum.setTextColor(momentDetailPollView.f24898OoooO00);
                    progressBar.setProgress(item.getVoteCount());
                    progressBar.setSecondaryProgress(0);
                } else {
                    if (momentDetailPollView.f24907o000oOoO) {
                        constraintLayout.setBackgroundResource(momentDetailPollView.f24892Oooo);
                    } else {
                        constraintLayout.setBackgroundResource(momentDetailPollView.f24895Oooo0oo);
                    }
                    textView.setTextColor(momentDetailPollView.f24897OoooO0);
                    pollNum.setTextColor(momentDetailPollView.f24897OoooO0);
                    progressBar.setProgress(0);
                    progressBar.setSecondaryProgress(item.getVoteCount());
                }
                if (momentPoll.getVoteOptionId() > 0 || momentPoll.getIsExpire()) {
                    Intrinsics.checkNotNullExpressionValue(ivSelect, "ivSelect");
                    oOO00O.OooO00o(ivSelect);
                    Intrinsics.checkNotNullExpressionValue(pollNum, "pollNum");
                    oOO00O.OooO(pollNum);
                    Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                    oOO00O.OooO(progressBar);
                    return;
                }
                Intrinsics.checkNotNullExpressionValue(ivSelect, "ivSelect");
                oOO00O.OooO(ivSelect);
                Intrinsics.checkNotNullExpressionValue(pollNum, "pollNum");
                oOO00O.OooO00o(pollNum);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                oOO00O.OooO00o(progressBar);
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<Long, Long, Long, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f24909Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Ref.ObjectRef<String> objectRef) {
            super(3);
            this.f24909Oooo0o = objectRef;
        }

        /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.String] */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Long l, Long l2, Long l3) {
            this.f24909Oooo0o.element = OooOo.OooO00o(o000O0O0.OooO0OO(R.string.moment_poll_time), String.valueOf(l.longValue()), String.valueOf(l2.longValue()), String.valueOf(l3.longValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailPollView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO00o(@Nullable FragmentActivity fragmentActivity, long j, @Nullable MomentPoll momentPoll, boolean z) {
        String string;
        this.f24907o000oOoO = z;
        this.f24901OoooOOO = j;
        if (z) {
            this.f24893Oooo0o.f50430OooO00o.setBackgroundResource(this.f24905OoooOoo);
        } else {
            this.f24893Oooo0o.f50430OooO00o.setBackgroundResource(this.f24906Ooooo00);
        }
        this.f24899OoooO0O = fragmentActivity;
        this.f24896OoooO = momentPoll;
        if (this.f24900OoooOO0 == null && fragmentActivity != null) {
            this.f24900OoooOO0 = (MomentVM) new ViewModelProvider(fragmentActivity).get(MomentVM.class);
        }
        MomentPoll momentPoll2 = this.f24896OoooO;
        if (momentPoll2 == null) {
            if (momentPoll2 == null) {
                oOO00O.OooO00o(this);
            }
            return false;
        }
        oOO00O.OooO(this);
        this.f24902OoooOOo.setNewData(momentPoll2.getOptions());
        String strOooO00o = p058o0000OoO.OooO.OooO00o(new StringBuilder(), OooOo.OooO00o(o000O0O0.OooO0OO(R.string.moment_poll_ballots), String.valueOf(momentPoll2.getVoteCount())), " • ");
        if (momentPoll2.getIsExpire()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(strOooO00o);
            sbOooO0o0.append(o000O0O0.OooO0OO(R.string.moment_poll_vote_ended));
            string = sbOooO0o0.toString();
        } else {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            o00O0 o00o1 = o00O0.f48624OooO00o;
            long expireTime = momentPoll2.getExpireTime();
            if (o000oOoO.OooO00o(expireTime, p279o0O00OoO.OooO.OooO00o()) == 3) {
                expireTime *= (long) 1000;
            }
            o00o1.OooO0oo(expireTime, new OooO0O0(objectRef));
            string = strOooO00o + ((String) objectRef.element);
        }
        this.f24893Oooo0o.f50431OooO0O0.setText(string);
        return true;
    }

    @Nullable
    public final Function1<MomentPoll, Unit> getChangeMomentPollListener() {
        return this.changeMomentPollListener;
    }

    @Nullable
    public final Function1<Boolean, Unit> getToMomentDetailListener() {
        return this.toMomentDetailListener;
    }

    public final void setChangeMomentPollListener(@Nullable Function1<? super MomentPoll, Unit> function1) {
        this.changeMomentPollListener = function1;
    }

    public final void setToMomentDetailListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.toMomentDetailListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailPollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailPollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        r9 r9VarInflate = r9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(r9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24893Oooo0o = r9VarInflate;
        this.f24894Oooo0oO = R.drawable.bg_round_bg_white_r6_stroke_00d8c9;
        this.f24895Oooo0oo = R.drawable.bg_round_bg_white_r6;
        this.f24892Oooo = R.drawable.bg_round_bg_white_r6_stroke_e2e2e2;
        this.f24898OoooO00 = o000O0O0.OooO00o(R.color.rec_color_00D8C9);
        this.f24897OoooO0 = o000O0O0.OooO00o(R.color.color_5f5f5f);
        this.f24902OoooOOo = new OooO00o(context, this);
        r9VarInflate.f50432OooO0OO.setLayoutManager(new FixLinearLayoutManager(context));
        r9VarInflate.f50432OooO0OO.addItemDecoration(new o00000OO(context, 0, OooOo00.OooO00o(10.0f), -16777216));
        r9VarInflate.f50432OooO0OO.setAdapter(this.f24902OoooOOo);
        this.f24902OoooOOo.setOnItemClickListener(new oO000Oo(this, 4));
        setOnClickListener(new o0O0oo0o(this, 3));
        this.f24905OoooOoo = R.drawable.bg_round_bg_ffffff_r4;
        this.f24906Ooooo00 = R.drawable.bg_round_bg_fcf5f5f5_r4;
    }
}
