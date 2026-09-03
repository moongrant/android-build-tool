package com.yalla.yalla.ui.view.moment;

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
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.model.moment.MomentSendPollModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.NoScrollRecyclerView;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p555o0oOOooO.o0OOo000;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p592o0oo00O.OooOOO0;
import p601o0oo0O0.o0000oo;
import p641o0ooOOOO.z2;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/MomentTaskPollView;", "Landroid/widget/LinearLayout;", "Lcom/yalla/yalla/model/moment/MomentSendPollModel;", "data", "", "setData", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"NotifyDataSetChanged"})
public final class MomentTaskPollView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final z2 f31146OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f31147OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Drawable f31148OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public MomentSendPollModel f31149OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final OooO00o f31150OooO0oo;

    public static final class OooO00o extends o000O<MomentSendPollModel.Option> {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ MomentTaskPollView f31151OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, MomentTaskPollView momentTaskPollView, int i) {
            super(context, i);
            this.f31151OooOoo0 = momentTaskPollView;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder helper = (ViewHolder) baseViewHolder;
            MomentSendPollModel.Option item = (MomentSendPollModel.Option) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            ConstraintLayout constraintLayout = (ConstraintLayout) helper.getView(oO00O0oO.bg);
            TextView textView = (TextView) helper.getView(oO00O0oO.content);
            ImageView ivSelect = (ImageView) helper.getView(oO00O0oO.select);
            TextView pollNum = (TextView) helper.getView(oO00O0oO.pollNum);
            ProgressBar progressBar = (ProgressBar) helper.getView(oO00O0oO.progressBar);
            textView.setText(item.getText());
            pollNum.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            progressBar.setMax(100);
            MomentTaskPollView momentTaskPollView = this.f31151OooOoo0;
            constraintLayout.setBackground(momentTaskPollView.f31148OooO0o0);
            int i = momentTaskPollView.f31147OooO0o;
            textView.setTextColor(i);
            pollNum.setTextColor(i);
            progressBar.setProgress(0);
            progressBar.setSecondaryProgress(0);
            Intrinsics.checkNotNullExpressionValue(ivSelect, "ivSelect");
            o000OO00.OooO0O0(ivSelect);
            Intrinsics.checkNotNullExpressionValue(pollNum, "pollNum");
            o000OO00.OooOOOO(pollNum);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            o000OO00.OooOOOO(progressBar);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<Long, Long, Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f31152OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Ref.ObjectRef<String> objectRef) {
            super(3);
            this.f31152OooO0Oo = objectRef;
        }

        /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.String] */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Long l, Long l2, Long l3) {
            this.f31152OooO0Oo.element = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.moment_poll_time), String.valueOf(l.longValue()), String.valueOf(l2.longValue()), String.valueOf(l3.longValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentTaskPollView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setData(@Nullable MomentSendPollModel data) {
        OooOOO0.OooO0O0("MomentTaskPollView data = " + data);
        this.f31149OooO0oO = data;
        if (data == null) {
            o000OO00.OooO0O0(this);
        }
        MomentSendPollModel momentSendPollModel = this.f31149OooO0oO;
        if (momentSendPollModel != null) {
            o000OO00.OooOOOO(this);
            this.f31150OooO0oo.OooOoO0(momentSendPollModel.getOption());
            String strConcat = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.moment_poll_ballots), AppEventsConstants.EVENT_PARAM_VALUE_NO).concat(" • ");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            long expireTime = (((long) ((int) momentSendPollModel.getExpireTime())) * 60000) + System.currentTimeMillis();
            int length = String.valueOf(System.currentTimeMillis()).length() - String.valueOf(expireTime).length();
            int i = 1;
            if (1 <= length) {
                while (true) {
                    expireTime *= (long) 10;
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            o0000oo.OooO0oO(expireTime, new OooO0O0(objectRef));
            this.f31146OooO0Oo.f59436OooO0O0.setText(strConcat + objectRef.element);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentTaskPollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MomentTaskPollView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentTaskPollView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        z2 z2VarInflate = z2.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(z2VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f31146OooO0Oo = z2VarInflate;
        this.f31148OooO0o0 = o0000.OooO0O0(oOo00OO0.bg_round_bg_white_r6);
        this.f31147OooO0o = o0000.OooO00o(oO00O0o.color_5f5f5f);
        OooO00o oooO00o = new OooO00o(context, this, oO00OO0O.item_moment_poll);
        this.f31150OooO0oo = oooO00o;
        z2VarInflate.f59437OooO0OO.setLayoutManager(new FixLinearLayoutManager(context));
        o0OOo000 o0ooo001 = new o0OOo000(context, o0000O0.OooO00o(10.0f), 0);
        NoScrollRecyclerView noScrollRecyclerView = z2VarInflate.f59437OooO0OO;
        noScrollRecyclerView.addItemDecoration(o0ooo001);
        noScrollRecyclerView.setAdapter(oooO00o);
    }
}
