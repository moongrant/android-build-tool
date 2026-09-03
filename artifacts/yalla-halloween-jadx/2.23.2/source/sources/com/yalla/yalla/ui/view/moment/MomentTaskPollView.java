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
import com.code.android.util.o000O;
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
import p405o0Oo0OOO.o0OO0o;
import p560o0oOo0.Oooo000;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;
import p598o0oo00Oo.o0000O00;
import p606o0oo0O0o.o0O0O0o0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/MomentTaskPollView;", "Landroid/widget/LinearLayout;", "Lcom/yalla/yalla/model/moment/MomentSendPollModel;", "data", "", "setData", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"NotifyDataSetChanged"})
public final class MomentTaskPollView extends LinearLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0OO0o f30605OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f30606OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Drawable f30607OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public MomentSendPollModel f30608OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final OooO00o f30609OooO0oo;

    public static final class OooO00o extends o0000oo<MomentSendPollModel.Option> {

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public final /* synthetic */ MomentTaskPollView f30610OooOoo0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, MomentTaskPollView momentTaskPollView, int i) {
            super(context, i);
            this.f30610OooOoo0 = momentTaskPollView;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder helper = (ViewHolder) baseViewHolder;
            MomentSendPollModel.Option item = (MomentSendPollModel.Option) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            Intrinsics.checkNotNullParameter(item, "item");
            ConstraintLayout constraintLayout = (ConstraintLayout) helper.getView(o0OO00O.bg);
            TextView textView = (TextView) helper.getView(o0OO00O.content);
            ImageView imageView = (ImageView) helper.getView(o0OO00O.select);
            TextView textView2 = (TextView) helper.getView(o0OO00O.pollNum);
            ProgressBar progressBar = (ProgressBar) helper.getView(o0OO00O.progressBar);
            textView.setText(item.getText());
            textView2.setText(AppEventsConstants.EVENT_PARAM_VALUE_NO);
            progressBar.setMax(100);
            MomentTaskPollView momentTaskPollView = this.f30610OooOoo0;
            constraintLayout.setBackground(momentTaskPollView.f30607OooO0o0);
            int i = momentTaskPollView.f30606OooO0o;
            textView.setTextColor(i);
            textView2.setTextColor(i);
            progressBar.setProgress(0);
            progressBar.setSecondaryProgress(0);
            Intrinsics.checkNotNull(imageView);
            o000O.OooO0O0(imageView);
            Intrinsics.checkNotNull(textView2);
            o000O.OooOOOO(textView2);
            Intrinsics.checkNotNull(progressBar);
            o000O.OooOOOO(progressBar);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<Long, Long, Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f30611OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Ref.ObjectRef<String> objectRef) {
            super(3);
            this.f30611OooO0Oo = objectRef;
        }

        /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.String] */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Long l, Long l2, Long l3) {
            this.f30611OooO0Oo.element = o0000O.OooO00o(o0000.OooO0OO(o000000.moment_poll_time), String.valueOf(l.longValue()), String.valueOf(l2.longValue()), String.valueOf(l3.longValue()));
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
        o0000O00.OooO0O0("MomentTaskPollView data = " + data);
        this.f30608OooO0oO = data;
        if (data == null) {
            o000O.OooO0O0(this);
        }
        MomentSendPollModel momentSendPollModel = this.f30608OooO0oO;
        if (momentSendPollModel != null) {
            o000O.OooOOOO(this);
            this.f30609OooO0oo.OooOoO0(momentSendPollModel.getOption());
            String strConcat = o0000O.OooO00o(o0000.OooO0OO(o000000.moment_poll_ballots), AppEventsConstants.EVENT_PARAM_VALUE_NO).concat(" • ");
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
            o0O0O0o0.OooO0oO(expireTime, new OooO0O0(objectRef));
            this.f30605OooO0Oo.f44599OooO0O0.setText(strConcat + objectRef.element);
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
        o0OO0o o0oo0oInflate = o0OO0o.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(o0oo0oInflate, "inflate(...)");
        this.f30605OooO0Oo = o0oo0oInflate;
        this.f30607OooO0o0 = o0000.OooO0O0(o0Oo0oo.bg_round_bg_white_r6);
        this.f30606OooO0o = o0000.OooO00o(o0OOO0o.color_5f5f5f);
        OooO00o oooO00o = new OooO00o(context, this, oo0o0Oo.item_moment_poll);
        this.f30609OooO0oo = oooO00o;
        o0oo0oInflate.f44600OooO0OO.setLayoutManager(new FixLinearLayoutManager(context));
        Oooo000 oooo000 = new Oooo000(context, o0000O0.OooO00o(10.0f), 0);
        NoScrollRecyclerView noScrollRecyclerView = o0oo0oInflate.f44600OooO0OO;
        noScrollRecyclerView.addItemDecoration(oooo000);
        noScrollRecyclerView.setAdapter(oooO00o);
    }
}
