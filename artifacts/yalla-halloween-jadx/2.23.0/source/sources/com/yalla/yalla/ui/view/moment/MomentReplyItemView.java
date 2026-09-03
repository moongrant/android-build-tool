package com.yalla.yalla.ui.view.moment;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Observer;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.code.android.util.o0OoOo0;
import com.facebook.internal.AnalyticsEvents;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.MoreModel;
import com.yalla.yalla.model.MoreTag;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.view.FixTextView;
import com.yalla.yalla.ui.view.moment.MomentReplyItemView;
import com.yalla.yalla.ui.vm.moment.MomentDetailActivityVM;
import java.util.ArrayList;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p029Oooo0oo.oo0ooO;
import p157o00OoOO0.o00O0O;
import p377o0OOoOo.o0000OO0;
import p464o0Oooo.o000000O;
import p484o0o00O.o0000O;
import p484o0o00O.o000OO;
import p556o0oOOooo.oO00Oo0;
import p556o0oOOooo.oO00o00;
import p556o0oOOooo.oO0OO00o;
import p556o0oOOooo.oOo000Oo;
import p556o0oOOooo.oOo00o0o;
import p556o0oOOooo.oOo00ooO;
import p641o0ooOOOO.x6;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/MomentReplyItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "<set-?>", "OooO0o0", "I", "getPosition", "()I", "position", "Lcom/yalla/yalla/ui/activity/moment/MomentReplyActivity;", "OooO0oO", "Lcom/yalla/yalla/ui/activity/moment/MomentReplyActivity;", "getActivity", "()Lcom/yalla/yalla/ui/activity/moment/MomentReplyActivity;", "setActivity", "(Lcom/yalla/yalla/ui/activity/moment/MomentReplyActivity;)V", "activity", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMomentReplyItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,417:1\n283#2,2:418\n*S KotlinDebug\n*F\n+ 1 MomentReplyItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentReplyItemView\n*L\n295#1:418,2\n*E\n"})
public final class MomentReplyItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final /* synthetic */ int f31129OooOO0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f31130OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final x6 f31131OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public MomentReplyModel f31132OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MomentReplyActivity activity;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f31135OooO0oo;

    public static final class OooO extends Lambda implements Function1<View, Unit> {
        public OooO() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentReplyItemView momentReplyItemView = MomentReplyItemView.this;
            MomentReplyModel momentReplyModel = momentReplyItemView.f31132OooO0o;
            if (momentReplyModel != null) {
                z = momentReplyModel.isHide();
            }
            if (!z) {
                MomentReplyItemView.OooO0OO(momentReplyItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentReplyItemView momentReplyItemView = MomentReplyItemView.this;
            MomentReplyModel momentReplyModel = momentReplyItemView.f31132OooO0o;
            if (momentReplyModel != null) {
                z = momentReplyModel.isHide();
            }
            if (!z) {
                com.yalla.yalla.ui.view.moment.OooO0o onLogin = new com.yalla.yalla.ui.view.moment.OooO0o(momentReplyItemView);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f25186OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentReplyItemView momentReplyItemView = MomentReplyItemView.this;
            MomentReplyModel momentReplyModel = momentReplyItemView.f31132OooO0o;
            if (momentReplyModel != null) {
                z = momentReplyModel.isHide();
            }
            if (!z) {
                MomentReplyItemView.OooO0O0(momentReplyItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {
        public OooO0OO() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentReplyItemView momentReplyItemView = MomentReplyItemView.this;
            MomentReplyModel momentReplyModel = momentReplyItemView.f31132OooO0o;
            if (momentReplyModel != null) {
                z = momentReplyModel.isHide();
            }
            if (!z) {
                MomentReplyItemView.OooO0O0(momentReplyItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<View, Unit> {
        public OooO0o() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentReplyItemView momentReplyItemView = MomentReplyItemView.this;
            MomentReplyModel momentReplyModel = momentReplyItemView.f31132OooO0o;
            if (momentReplyModel != null) {
                z = momentReplyModel.isHide();
            }
            if (!z) {
                MomentReplyItemView.OooO0O0(momentReplyItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<View, Unit> {
        public OooOO0() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentReplyItemView momentReplyItemView = MomentReplyItemView.this;
            MomentReplyModel momentReplyModel = momentReplyItemView.f31132OooO0o;
            if (momentReplyModel != null) {
                z = momentReplyModel.isHide();
            }
            if (!z) {
                MomentReplyItemView.OooO0OO(momentReplyItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<View, Unit> {
        public OooOO0O() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentReplyItemView momentReplyItemView = MomentReplyItemView.this;
            MomentReplyModel momentReplyModel = momentReplyItemView.f31132OooO0o;
            if (momentReplyModel != null) {
                z = momentReplyModel.isHide();
            }
            if (!z) {
                MomentReplyItemView.OooO0OO(momentReplyItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<View, Unit> {
        public OooOOO() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            MomentReplyModel momentReplyModel;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentReplyItemView momentReplyItemView = MomentReplyItemView.this;
            MomentReplyModel momentReplyModel2 = momentReplyItemView.f31132OooO0o;
            if (momentReplyModel2 != null) {
                z = momentReplyModel2.isHide();
            }
            if (!z && (momentReplyModel = momentReplyItemView.f31132OooO0o) != null) {
                com.yalla.yalla.ui.view.moment.OooOO0 onLogin = new com.yalla.yalla.ui.view.moment.OooOO0(momentReplyItemView, momentReplyModel);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f25186OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<View, Unit> {
        public OooOOO0() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            MomentReplyModel momentReplyModel;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentReplyItemView momentReplyItemView = MomentReplyItemView.this;
            MomentReplyModel momentReplyModel2 = momentReplyItemView.f31132OooO0o;
            if (momentReplyModel2 != null) {
                z = momentReplyModel2.isHide();
            }
            if (!z && (momentReplyModel = momentReplyItemView.f31132OooO0o) != null) {
                com.yalla.yalla.ui.view.moment.OooO onLogin = new com.yalla.yalla.ui.view.moment.OooO(momentReplyItemView, momentReplyModel);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f25186OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f31145OooO0Oo;

        public OooOOOO(oO00Oo0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f31145OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f31145OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f31145OooO0Oo;
        }

        public final int hashCode() {
            return this.f31145OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31145OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentReplyItemView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void OooO0O0(MomentReplyItemView momentReplyItemView) {
        momentReplyItemView.getClass();
        oO00o00 onLogin = new oO00o00(momentReplyItemView);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    public static final void OooO0OO(MomentReplyItemView momentReplyItemView) {
        momentReplyItemView.getClass();
        oOo00o0o onLogin = new oOo00o0o(momentReplyItemView);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    public static final void OooO0Oo(MomentReplyItemView momentReplyItemView, MomentReplyModel momentReplyModel, SVGAView sVGAView, TextView textView) {
        if (momentReplyItemView.f31130OooO) {
            return;
        }
        momentReplyItemView.f31130OooO = true;
        momentReplyModel.setSendProp(true);
        MomentReplyActivity momentReplyActivity = momentReplyItemView.activity;
        if (momentReplyActivity != null) {
            momentReplyActivity.OooOoO().commentSendProp(oo0ooO.OooO00o(momentReplyModel.getId()), o0OoOo0.OooOOO0("", Long.valueOf(momentReplyModel.getUserid()))).observe(momentReplyActivity, new o0000OO0(new oOo00ooO(sVGAView, momentReplyActivity, momentReplyModel, textView), new oO0OO00o(momentReplyModel), new oOo000Oo(momentReplyItemView), false));
        }
    }

    @Nullable
    public final MomentReplyActivity getActivity() {
        return this.activity;
    }

    public final int getPosition() {
        return this.position;
    }

    public final void setActivity(@Nullable MomentReplyActivity momentReplyActivity) {
        this.activity = momentReplyActivity;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentReplyItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MomentReplyItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentReplyItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        x6 x6VarInflate = x6.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(x6VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f31131OooO0Oo = x6VarInflate;
        this.position = -1;
        NetImageView netImageView = x6VarInflate.f59280OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.headSon");
        o000OO00.OooO(netImageView, new OooO00o());
        SVGAView sVGAView = x6VarInflate.f59283OooO0oO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.praiseSvgaSon");
        o000OO00.OooO(sVGAView, new OooO0O0());
        ImageView imageView = x6VarInflate.f59281OooO0o;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.praiseIvSon");
        o000OO00.OooO(imageView, new OooO0OO());
        TextView textView = x6VarInflate.f59282OooO0o0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.praiseCountSon");
        o000OO00.OooO(textView, new OooO0o());
        ImageView imageView2 = x6VarInflate.f59285OooOO0;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.rewardIvSon");
        o000OO00.OooO(imageView2, new OooO());
        SVGAView sVGAView2 = x6VarInflate.f59286OooOO0O;
        Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.rewardSvgaSon");
        o000OO00.OooO(sVGAView2, new OooOO0());
        TextView textView2 = x6VarInflate.f59276OooO;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.rewardCountSon");
        o000OO00.OooO(textView2, new OooOO0O());
        FixTextView fixTextView = x6VarInflate.f59279OooO0OO;
        Intrinsics.checkNotNullExpressionValue(fixTextView, "binding.contentSon");
        o000OO00.OooO(fixTextView, new OooOOO0());
        ImageView imageView3 = x6VarInflate.f59278OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.bgSon");
        o000OO00.OooO(imageView3, new OooOOO());
        x6VarInflate.f59278OooO0O0.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0oOOooo.oO00O0oO
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                MomentReplyModel momentReplyModel;
                MomentDetailActivityVM momentDetailActivityVMOooOoO;
                MomentCommentDetailModel currentComment;
                MomentDetailActivityVM momentDetailActivityVMOooOoO2;
                MomentDetailModel currentMomentDetail;
                int i2 = MomentReplyItemView.f31129OooOO0;
                MomentReplyItemView this$0 = this.f56105OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MomentReplyModel momentReplyModel2 = this$0.f31132OooO0o;
                if (!(momentReplyModel2 != null && momentReplyModel2.isHide()) && (momentReplyModel = this$0.f31132OooO0o) != null) {
                    MomentReplyActivity momentReplyActivity = this$0.activity;
                    long id = 0;
                    long id2 = (momentReplyActivity == null || (momentDetailActivityVMOooOoO2 = momentReplyActivity.OooOoO()) == null || (currentMomentDetail = momentDetailActivityVMOooOoO2.getCurrentMomentDetail()) == null) ? 0L : currentMomentDetail.getId();
                    MomentReplyActivity momentReplyActivity2 = this$0.activity;
                    if (momentReplyActivity2 != null && (momentDetailActivityVMOooOoO = momentReplyActivity2.OooOoO()) != null && (currentComment = momentDetailActivityVMOooOoO.getCurrentComment()) != null) {
                        id = currentComment.getId();
                    }
                    long j = id;
                    MomentReplyActivity momentReplyActivity3 = this$0.activity;
                    if (momentReplyActivity3 != null) {
                        ArrayList arrayList = new ArrayList();
                        MoreTag moreTag = MoreTag.reply;
                        arrayList.add(new MoreModel(o0000.OooO0OO(moreTag.getText()), moreTag));
                        MoreTag moreTag2 = MoreTag.copy;
                        arrayList.add(new MoreModel(o0000.OooO0OO(moreTag2.getText()), moreTag2));
                        if (momentReplyModel.getIsDel()) {
                            MoreTag moreTag3 = MoreTag.delete;
                            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag3.getText()), moreTag3));
                        } else {
                            MoreTag moreTag4 = MoreTag.hide;
                            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag4.getText()), moreTag4));
                            MoreTag moreTag5 = MoreTag.report;
                            arrayList.add(new MoreModel(o0000.OooO0OO(moreTag5.getText()), moreTag5));
                        }
                        o00O0O o00o0o2 = new o00O0O(momentReplyActivity3, null);
                        o00o0o2.OooOOO(arrayList);
                        o00o0o2.OooOOo0(new o000OO(id2, j, momentReplyModel, momentReplyActivity3));
                        o00o0o2.OooO(o0000O.f47724OooO0Oo);
                        o00o0o2.OooOO0o();
                    }
                }
                return true;
            }
        });
        x6VarInflate.f59279OooO0OO.setTextAlignment(5);
    }
}
