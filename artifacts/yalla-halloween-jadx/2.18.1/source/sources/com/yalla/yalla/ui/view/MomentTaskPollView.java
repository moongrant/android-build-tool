package com.yalla.yalla.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.appevents.AppEventsConstants;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.model.MomentSendPollModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.oOO00O;
import p496o0o00OOo.o000oOoO;
import p515o0o0O00.o00O00;
import p603o0oo00o0.o00000OO;
import p621o0oo0o0o.o00O0;
import p649o0ooOOoo.s9;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentTaskPollView;", "Landroid/widget/LinearLayout;", "Lcom/yalla/yalla/model/MomentSendPollModel;", "data", "", "setData", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"NotifyDataSetChanged"})
public final class MomentTaskPollView extends LinearLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public MomentSendPollModel f24991Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final s9 f24992Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Drawable f24993Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f24994Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public p188o00o00o0.OooO0OO<MomentSendPollModel.Option> f24995OoooO00;

    public static final class OooO00o extends p188o00o00o0.OooO0OO<MomentSendPollModel.Option> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ MomentTaskPollView f24996OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, MomentTaskPollView momentTaskPollView) {
            super(context, R.layout.item_moment_poll);
            this.f24996OooO00o = momentTaskPollView;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
            MomentSendPollModel.Option item = (MomentSendPollModel.Option) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            ConstraintLayout constraintLayout = (ConstraintLayout) helper.OooO0Oo(R.id.bg);
            TextView textView = (TextView) helper.OooO0Oo(R.id.content);
            ImageView ivSelect = (ImageView) helper.OooO0Oo(R.id.select);
            TextView pollNum = (TextView) helper.OooO0Oo(R.id.pollNum);
            ProgressBar progressBar = (ProgressBar) helper.OooO0Oo(R.id.progressBar);
            textView.setText(item.getText());
            pollNum.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            progressBar.setMax(100);
            constraintLayout.setBackground(this.f24996OooO00o.f24993Oooo0oO);
            textView.setTextColor(this.f24996OooO00o.f24994Oooo0oo);
            pollNum.setTextColor(this.f24996OooO00o.f24994Oooo0oo);
            progressBar.setProgress(0);
            progressBar.setSecondaryProgress(0);
            Intrinsics.checkNotNullExpressionValue(ivSelect, "ivSelect");
            o00O0O.OooO00o(ivSelect);
            Intrinsics.checkNotNullExpressionValue(pollNum, "pollNum");
            oOO00O.OooO(pollNum);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            oOO00O.OooO(progressBar);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<Long, Long, Long, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f24997Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Ref.ObjectRef<String> objectRef) {
            super(3);
            this.f24997Oooo0o = objectRef;
        }

        /* JADX WARN: Type inference failed for: r7v5, types: [T, java.lang.String] */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Long l, Long l2, Long l3) {
            this.f24997Oooo0o.element = OooOo.OooO00o(OooOOO.OooO0OO(R.string.moment_poll_time), String.valueOf(l.longValue()), String.valueOf(l2.longValue()), String.valueOf(l3.longValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentTaskPollView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setData(@Nullable MomentSendPollModel data) {
        o00O00.OooO0O0("MomentTaskPollView data = " + data);
        this.f24991Oooo = data;
        if (data == null) {
            o00O0O.OooO00o(this);
        }
        MomentSendPollModel momentSendPollModel = this.f24991Oooo;
        if (momentSendPollModel != null) {
            oOO00O.OooO(this);
            this.f24995OoooO00.setNewData(momentSendPollModel.getOption());
            String strOooO00o = p058o0000OoO.OooO.OooO00o(new StringBuilder(), OooOo.OooO00o(OooOOO.OooO0OO(R.string.moment_poll_ballots), AppEventsConstants.EVENT_PARAM_VALUE_NO), " • ");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            long expireTime = (((long) ((int) momentSendPollModel.getExpireTime())) * 60000) + System.currentTimeMillis();
            o00O0 o00o1 = o00O0.f48624OooO00o;
            if (o000oOoO.OooO00o(expireTime, p279o0O00OoO.OooO.OooO00o()) == 3) {
                expireTime *= (long) 1000;
            }
            o00o1.OooO0oo(expireTime, new OooO0O0(objectRef));
            this.f24992Oooo0o.f50528OooO0O0.setText(strOooO00o + ((String) objectRef.element));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentTaskPollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentTaskPollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        s9 s9VarInflate = s9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(s9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24992Oooo0o = s9VarInflate;
        this.f24993Oooo0oO = OooOOO.OooO0O0(R.drawable.bg_round_bg_white_r6);
        this.f24994Oooo0oo = OooOOO.OooO00o(R.color.color_5f5f5f);
        this.f24995OoooO00 = new OooO00o(context, this);
        s9VarInflate.f50529OooO0OO.setLayoutManager(new FixLinearLayoutManager(context));
        s9VarInflate.f50529OooO0OO.addItemDecoration(new o00000OO(context, 0, OooOo00.OooO00o(10.0f), -16777216));
        s9VarInflate.f50529OooO0OO.setAdapter(this.f24995OoooO00);
    }
}
