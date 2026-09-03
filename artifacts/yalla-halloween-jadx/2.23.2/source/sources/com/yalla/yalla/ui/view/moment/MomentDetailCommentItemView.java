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
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.media3.session.o0000O00;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.code.android.util.o000O00;
import com.facebook.internal.AnalyticsEvents;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.RewardCommentResultModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentReplyModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.moment.MomentReplyActivity;
import com.yalla.yalla.ui.fragment.moment.MomentDetailCommentFragment;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView;
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
import p405o0Oo0OOO.oOO0O0;
import p475o0Ooooo0.o0O00oO0;
import p496o0o00Oo0.l;
import p562o0oOo000.o000000;
import p564o0oOo0O.o0O00;
import p564o0oOo0O.o0O0000O;
import p564o0oOo0O.o0O00OO;
import p564o0oOo0O.o0O00o00;
import p566o0oOo0OO.o0O000O;
import p605o0oo0O0O.o0O0O0Oo;
import p650o0ooo.d3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010*\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006-"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "<set-?>", "OooO0o0", "I", "getPosition", "()I", "position", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "OooO0o", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "getItem", "()Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "item", "Lcom/yalla/yalla/model/moment/MomentReplyModel;", "OooO0oO", "Lcom/yalla/yalla/model/moment/MomentReplyModel;", "getItemSon", "()Lcom/yalla/yalla/model/moment/MomentReplyModel;", "itemSon", "Lcom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment;", "OooO0oo", "Lcom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment;", "getFragment", "()Lcom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment;", "setFragment", "(Lcom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment;)V", "fragment", "Lkotlin/Function1;", "", "OooO", "Lkotlin/jvm/functions/Function1;", "getItemListener", "()Lkotlin/jvm/functions/Function1;", "setItemListener", "(Lkotlin/jvm/functions/Function1;)V", "itemListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMomentDetailCommentItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,702:1\n283#2,2:703\n283#2,2:705\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView\n*L\n384#1:703,2\n579#1:705,2\n*E\n"})
public final class MomentDetailCommentItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f30535OooOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super MomentCommentDetailModel, Unit> itemListener;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final oOO0O0 f30537OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    public MomentCommentDetailModel item;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    public int position;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    public MomentReplyModel itemSon;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MomentDetailCommentFragment fragment;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f30542OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f30543OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f30544OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f30545OooOOO0;

    public static final class OooO extends Lambda implements Function1<View, Unit> {
        public OooO() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            MomentReplyModel sonFirst = momentDetailCommentItemView.getItem().getSonFirst();
            if (sonFirst != null) {
                z = sonFirst.isHide();
            }
            if (!z) {
                MomentDetailCommentItemView.OooO0OO(momentDetailCommentItemView, momentDetailCommentItemView.getItemSon());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            if (!momentDetailCommentItemView.getItem().isHide()) {
                MomentDetailCommentItemView.OooO0Oo(momentDetailCommentItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            MomentReplyModel sonFirst = momentDetailCommentItemView.getItem().getSonFirst();
            if (sonFirst != null) {
                z = sonFirst.isHide();
            }
            if (!z) {
                com.yalla.yalla.ui.view.moment.OooO0O0 onLogin = new com.yalla.yalla.ui.view.moment.OooO0O0(momentDetailCommentItemView);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f24727OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<View, Unit> {
        public OooO0OO() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            MomentReplyModel sonFirst = momentDetailCommentItemView.getItem().getSonFirst();
            if (sonFirst != null) {
                z = sonFirst.isHide();
            }
            if (!z) {
                MomentDetailCommentItemView.OooO0OO(momentDetailCommentItemView, momentDetailCommentItemView.getItemSon());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<View, Unit> {
        public OooO0o() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            MomentReplyModel sonFirst = momentDetailCommentItemView.getItem().getSonFirst();
            if (sonFirst != null) {
                z = sonFirst.isHide();
            }
            if (!z) {
                MomentDetailCommentItemView.OooO0OO(momentDetailCommentItemView, momentDetailCommentItemView.getItemSon());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<View, Unit> {
        public OooOO0() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            MomentReplyModel sonFirst = momentDetailCommentItemView.getItem().getSonFirst();
            if (sonFirst != null) {
                z = sonFirst.isHide();
            }
            if (!z) {
                MomentDetailCommentItemView.OooO0o0(momentDetailCommentItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<View, Unit> {
        public OooOO0O() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            MomentReplyModel sonFirst = momentDetailCommentItemView.getItem().getSonFirst();
            if (sonFirst != null) {
                z = sonFirst.isHide();
            }
            if (!z) {
                MomentDetailCommentItemView.OooO0o0(momentDetailCommentItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<View, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = MomentDetailCommentItemView.f30535OooOOO;
            MomentDetailCommentItemView.this.OooO0o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<View, Unit> {
        public OooOOO0() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            boolean z;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            MomentReplyModel sonFirst = momentDetailCommentItemView.getItem().getSonFirst();
            if (sonFirst != null) {
                z = sonFirst.isHide();
            }
            if (!z) {
                MomentDetailCommentItemView.OooO0o0(momentDetailCommentItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<View, Unit> {
        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            if (!momentDetailCommentItemView.getItem().isHide()) {
                Function1<MomentCommentDetailModel, Unit> itemListener = momentDetailCommentItemView.getItemListener();
                if (itemListener != null) {
                    itemListener.invoke(momentDetailCommentItemView.getItem());
                }
                com.yalla.yalla.ui.view.moment.OooO00o onLogin = new com.yalla.yalla.ui.view.moment.OooO00o(momentDetailCommentItemView);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f24727OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<View, Unit> {
        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            if (!momentDetailCommentItemView.getItem().isHide()) {
                MomentDetailCommentItemView.OooO0O0(momentDetailCommentItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<View, Unit> {
        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            if (!momentDetailCommentItemView.getItem().isHide()) {
                com.yalla.yalla.ui.view.moment.OooO0OO onLogin = new com.yalla.yalla.ui.view.moment.OooO0OO(momentDetailCommentItemView);
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                } else {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        int i = LoginActivity.f24727OooOo0O;
                        LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<View, Unit> {
        public Oooo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            if (!momentDetailCommentItemView.getItem().isHide()) {
                MomentDetailCommentItemView.OooO0O0(momentDetailCommentItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<View, Unit> {
        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            if (!momentDetailCommentItemView.getItem().isHide()) {
                MomentDetailCommentItemView.OooO0O0(momentDetailCommentItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function1<View, Unit> {
        public o000oOoO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            if (!momentDetailCommentItemView.getItem().isHide()) {
                MomentDetailCommentItemView.OooO0Oo(momentDetailCommentItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f30561OooO0Oo;

        public o00O0O(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f30561OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f30561OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f30561OooO0Oo;
        }

        public final int hashCode() {
            return this.f30561OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f30561OooO0Oo.invoke(obj);
        }
    }

    public static final class o00Oo0 extends Lambda implements Function1<RewardCommentResultModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SVGAView f30562OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f30563OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailCommentFragment f30564OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TextView f30565OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(SVGAView sVGAView, MomentDetailCommentFragment momentDetailCommentFragment, MomentCommentDetailModel momentCommentDetailModel, TextView textView) {
            super(1);
            this.f30562OooO0Oo = sVGAView;
            this.f30564OooO0o0 = momentDetailCommentFragment;
            this.f30563OooO0o = momentCommentDetailModel;
            this.f30565OooO0oO = textView;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RewardCommentResultModel rewardCommentResultModel) {
            RewardCommentResultModel rewardCommentResultModel2 = rewardCommentResultModel;
            o0oo0000.OooO00o.OooO0O0("203024");
            MomentDetailCommentFragment momentDetailCommentFragment = this.f30564OooO0o0;
            LifecycleOwner viewLifecycleOwner = momentDetailCommentFragment.getViewLifecycleOwner();
            SVGAView sVGAView = this.f30562OooO0Oo;
            sVGAView.OooOO0O("svga/anim_moment_reward.svga", viewLifecycleOwner);
            sVGAView.OooOO0o();
            MomentCommentDetailModel momentCommentDetailModel = this.f30563OooO0o;
            momentCommentDetailModel.setSendProp(true);
            momentCommentDetailModel.setPropNum(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getTotalPropNum() : 0L);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0O00oO0.OooO0O0().setValue(Long.valueOf(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getCoinBalance() : 0L));
            String strOooO0o = o0O0O0Oo.OooO0o(momentCommentDetailModel.getPropNum(), false);
            TextView textView = this.f30565OooO0oO;
            textView.setText(strOooO0o);
            textView.setTextColor(o0000.OooO00o(momentCommentDetailModel.isSendProp() ? p562o0oOo000.o0OOO0o.color_333333 : p562o0oOo000.o0OOO0o.color_333333_65));
            int i = o0O000O.f56394OooO0O0;
            o0O000O.OooO00o.OooO00o(momentDetailCommentFragment.getContext(), textView);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f30566OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(MomentCommentDetailModel momentCommentDetailModel) {
            super(1);
            this.f30566OooO0Oo = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f30566OooO0Oo.setSendProp(false);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function1<RewardCommentResultModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SVGAView f30567OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f30568OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailCommentFragment f30569OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TextView f30570OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(SVGAView sVGAView, MomentDetailCommentFragment momentDetailCommentFragment, MomentReplyModel momentReplyModel, TextView textView) {
            super(1);
            this.f30567OooO0Oo = sVGAView;
            this.f30569OooO0o0 = momentDetailCommentFragment;
            this.f30568OooO0o = momentReplyModel;
            this.f30570OooO0oO = textView;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RewardCommentResultModel rewardCommentResultModel) {
            RewardCommentResultModel rewardCommentResultModel2 = rewardCommentResultModel;
            o0oo0000.OooO00o.OooO0O0("203024");
            MomentDetailCommentFragment momentDetailCommentFragment = this.f30569OooO0o0;
            LifecycleOwner viewLifecycleOwner = momentDetailCommentFragment.getViewLifecycleOwner();
            SVGAView sVGAView = this.f30567OooO0Oo;
            sVGAView.OooOO0O("svga/anim_moment_reward.svga", viewLifecycleOwner);
            sVGAView.OooOO0o();
            MomentReplyModel momentReplyModel = this.f30568OooO0o;
            momentReplyModel.setSendProp(true);
            momentReplyModel.setPropNum(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getTotalPropNum() : 0L);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0O00oO0.OooO0O0().setValue(Long.valueOf(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getCoinBalance() : 0L));
            String strOooO0o = o0O0O0Oo.OooO0o(momentReplyModel.getPropNum(), false);
            TextView textView = this.f30570OooO0oO;
            textView.setText(strOooO0o);
            textView.setTextColor(o0000.OooO00o(momentReplyModel.isSendProp() ? p562o0oOo000.o0OOO0o.color_333333 : p562o0oOo000.o0OOO0o.color_333333_65));
            int i = o0O000O.f56394OooO0O0;
            o0O000O.OooO00o.OooO00o(momentDetailCommentFragment.getContext(), textView);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function1<ApiResult<RewardCommentResultModel>, Unit> {
        public o0OOO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RewardCommentResultModel> apiResult) {
            ApiResult<RewardCommentResultModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView.this.f30545OooOOO0 = false;
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function1<View, Unit> {
        public o0OoOo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            if (!momentDetailCommentItemView.getItem().isHide()) {
                MomentDetailCommentItemView.OooO0Oo(momentDetailCommentItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentReplyModel f30573OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(MomentReplyModel momentReplyModel) {
            super(1);
            this.f30573OooO0Oo = momentReplyModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f30573OooO0Oo.setSendProp(false);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function1<ApiResult<RewardCommentResultModel>, Unit> {
        public oo000o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RewardCommentResultModel> apiResult) {
            ApiResult<RewardCommentResultModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView.this.f30543OooOO0O = false;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailCommentItemView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void OooO0O0(MomentDetailCommentItemView momentDetailCommentItemView) {
        momentDetailCommentItemView.getClass();
        o0O0000O onLogin = new o0O0000O(momentDetailCommentItemView);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    public static final void OooO0OO(MomentDetailCommentItemView momentDetailCommentItemView, MomentReplyModel momentReplyModel) {
        momentDetailCommentItemView.getClass();
        o0O00 onLogin = new o0O00(momentDetailCommentItemView, momentReplyModel);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    public static final void OooO0Oo(MomentDetailCommentItemView momentDetailCommentItemView) {
        momentDetailCommentItemView.getClass();
        o0O00OO onLogin = new o0O00OO(momentDetailCommentItemView);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0o0(MomentDetailCommentItemView momentDetailCommentItemView) {
        momentDetailCommentItemView.getClass();
        o0oo0000.OooO00o.OooO0O0("103047");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        long userid = momentDetailCommentItemView.getItemSon().getUserid();
        if (l != null && l.longValue() == userid) {
            o000O00.OooO0O0(o0000.OooO0OO(o000000.send_reward_self));
            return;
        }
        if (!p415o0Oo0oO0.o00Ooo.OooO().OooOO0o() && Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            MomentDetailCommentFragment momentDetailCommentFragment = momentDetailCommentItemView.fragment;
            FragmentActivity activity = momentDetailCommentFragment != null ? momentDetailCommentFragment.getActivity() : null;
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
            d3.OooO00o((BaseFragmentActivity) activity, new o0O00o00(momentDetailCommentItemView));
            return;
        }
        MomentReplyModel itemSon = momentDetailCommentItemView.getItemSon();
        oOO0O0 ooo0o0 = momentDetailCommentItemView.f30537OooO0Oo;
        SVGAView rewardSvgaSon = ooo0o0.f45067OooOo;
        Intrinsics.checkNotNullExpressionValue(rewardSvgaSon, "rewardSvgaSon");
        TextView rewardCountSon = ooo0o0.f45069OooOo00;
        Intrinsics.checkNotNullExpressionValue(rewardCountSon, "rewardCountSon");
        momentDetailCommentItemView.OooO0oo(itemSon, rewardSvgaSon, rewardCountSon);
    }

    public final void OooO0o() {
        int i = MomentReplyActivity.f25700OooOoO;
        MomentDetailCommentFragment momentDetailCommentFragment = this.fragment;
        FragmentActivity activity = momentDetailCommentFragment != null ? momentDetailCommentFragment.getActivity() : null;
        MomentDetailCommentFragment momentDetailCommentFragment2 = this.fragment;
        MomentReplyActivity.OooO00o.OooO00o(activity, true, momentDetailCommentFragment2 != null ? momentDetailCommentFragment2.getMPostDetailModel() : null, getItem(), null);
    }

    public final void OooO0oO(@NotNull MomentCommentDetailModel item, @NotNull SVGAView rewardSvga, @NotNull TextView tvRewardCount) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(rewardSvga, "rewardSvga");
        Intrinsics.checkNotNullParameter(tvRewardCount, "tvRewardCount");
        if (this.f30543OooOO0O) {
            return;
        }
        this.f30543OooOO0O = true;
        item.setSendProp(true);
        MomentDetailCommentFragment momentDetailCommentFragment = this.fragment;
        if (momentDetailCommentFragment != null) {
            momentDetailCommentFragment.getMomentVm().commentSendProp(o0000O00.OooO00o(item.getId()), com.code.android.util.o0OoOo0.OooOOO(item.getUserid(), "")).observe(momentDetailCommentFragment.getViewLifecycleOwner(), new p384o0OOoo0O.o000oOoO(new o00Oo0(rewardSvga, momentDetailCommentFragment, item, tvRewardCount), new o00Ooo(item), new oo000o(), false));
        }
    }

    public final void OooO0oo(MomentReplyModel momentReplyModel, SVGAView sVGAView, TextView textView) {
        if (this.f30545OooOOO0) {
            return;
        }
        this.f30545OooOOO0 = true;
        momentReplyModel.setSendProp(true);
        MomentDetailCommentFragment momentDetailCommentFragment = this.fragment;
        if (momentDetailCommentFragment != null) {
            momentDetailCommentFragment.getMomentVm().commentSendProp(o0000O00.OooO00o(momentReplyModel.getId()), com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(momentReplyModel.getUserid()))).observe(momentDetailCommentFragment.getViewLifecycleOwner(), new p384o0OOoo0O.o000oOoO(new o00oO0o(sVGAView, momentDetailCommentFragment, momentReplyModel, textView), new o0ooOOo(momentReplyModel), new o0OOO0o(), false));
        }
    }

    @Nullable
    public final MomentDetailCommentFragment getFragment() {
        return this.fragment;
    }

    @NotNull
    public final MomentCommentDetailModel getItem() {
        MomentCommentDetailModel momentCommentDetailModel = this.item;
        if (momentCommentDetailModel != null) {
            return momentCommentDetailModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("item");
        return null;
    }

    @Nullable
    public final Function1<MomentCommentDetailModel, Unit> getItemListener() {
        return this.itemListener;
    }

    @NotNull
    public final MomentReplyModel getItemSon() {
        MomentReplyModel momentReplyModel = this.itemSon;
        if (momentReplyModel != null) {
            return momentReplyModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("itemSon");
        return null;
    }

    public final int getPosition() {
        return this.position;
    }

    public final void setFragment(@Nullable MomentDetailCommentFragment momentDetailCommentFragment) {
        this.fragment = momentDetailCommentFragment;
    }

    public final void setItemListener(@Nullable Function1<? super MomentCommentDetailModel, Unit> function1) {
        this.itemListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailCommentItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MomentDetailCommentItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailCommentItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        oOO0O0 ooo0o0Inflate = oOO0O0.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(ooo0o0Inflate, "inflate(...)");
        this.f30537OooO0Oo = ooo0o0Inflate;
        this.position = -1;
        ConstraintLayout layout = ooo0o0Inflate.f45048OooO;
        Intrinsics.checkNotNullExpressionValue(layout, "layout");
        o000O.OooO(layout, new OooOOOO());
        ooo0o0Inflate.f45048OooO.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0oOo0O.o00OOOOo
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                MomentDetailCommentFragment momentDetailCommentFragment;
                MomentDetailModel mPostDetailModel;
                int i2 = MomentDetailCommentItemView.f30535OooOOO;
                MomentDetailCommentItemView this$0 = this.f56315OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.getItem().isHide() || (momentDetailCommentFragment = this$0.fragment) == null || (mPostDetailModel = momentDetailCommentFragment.getMPostDetailModel()) == null) {
                    return true;
                }
                l.OooO00o(this$0.getItem(), mPostDetailModel.getId(), this$0.fragment);
                return true;
            }
        });
        ooo0o0Inflate.f45051OooO0OO.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0oOo0O.o00Oo00
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                MomentDetailCommentFragment momentDetailCommentFragment;
                MomentDetailModel mPostDetailModel;
                int i2 = MomentDetailCommentItemView.f30535OooOOO;
                MomentDetailCommentItemView this$0 = this.f56316OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.getItem().isHide() || (momentDetailCommentFragment = this$0.fragment) == null || (mPostDetailModel = momentDetailCommentFragment.getMPostDetailModel()) == null) {
                    return true;
                }
                l.OooO00o(this$0.getItem(), mPostDetailModel.getId(), this$0.fragment);
                return true;
            }
        });
        NetImageView head = ooo0o0Inflate.f45053OooO0o;
        Intrinsics.checkNotNullExpressionValue(head, "head");
        o000O.OooO(head, new OooOo00());
        SVGAView praiseSvga = ooo0o0Inflate.f45062OooOOOO;
        Intrinsics.checkNotNullExpressionValue(praiseSvga, "praiseSvga");
        o000O.OooO(praiseSvga, new OooOo());
        ImageView praiseIv = ooo0o0Inflate.f45061OooOOO0;
        Intrinsics.checkNotNullExpressionValue(praiseIv, "praiseIv");
        o000O.OooO(praiseIv, new Oooo000());
        TextView praiseCount = ooo0o0Inflate.f45058OooOO0O;
        Intrinsics.checkNotNullExpressionValue(praiseCount, "praiseCount");
        o000O.OooO(praiseCount, new Oooo0());
        TextView rewardCount = ooo0o0Inflate.f45066OooOOoo;
        Intrinsics.checkNotNullExpressionValue(rewardCount, "rewardCount");
        o000O.OooO(rewardCount, new o000oOoO());
        SVGAView rewardSvga = ooo0o0Inflate.f45071OooOo0o;
        Intrinsics.checkNotNullExpressionValue(rewardSvga, "rewardSvga");
        o000O.OooO(rewardSvga, new o0OoOo0());
        ImageView rewardIv = ooo0o0Inflate.f45068OooOo0;
        Intrinsics.checkNotNullExpressionValue(rewardIv, "rewardIv");
        o000O.OooO(rewardIv, new OooO00o());
        NetImageView headSon = ooo0o0Inflate.f45055OooO0oO;
        Intrinsics.checkNotNullExpressionValue(headSon, "headSon");
        o000O.OooO(headSon, new OooO0O0());
        SVGAView praiseSvgaSon = ooo0o0Inflate.f45063OooOOOo;
        Intrinsics.checkNotNullExpressionValue(praiseSvgaSon, "praiseSvgaSon");
        o000O.OooO(praiseSvgaSon, new OooO0OO());
        ImageView praiseIvSon = ooo0o0Inflate.f45060OooOOO;
        Intrinsics.checkNotNullExpressionValue(praiseIvSon, "praiseIvSon");
        o000O.OooO(praiseIvSon, new OooO0o());
        TextView praiseCountSon = ooo0o0Inflate.f45059OooOO0o;
        Intrinsics.checkNotNullExpressionValue(praiseCountSon, "praiseCountSon");
        o000O.OooO(praiseCountSon, new OooO());
        ImageView rewardIvSon = ooo0o0Inflate.f45070OooOo0O;
        Intrinsics.checkNotNullExpressionValue(rewardIvSon, "rewardIvSon");
        o000O.OooO(rewardIvSon, new OooOO0());
        SVGAView rewardSvgaSon = ooo0o0Inflate.f45067OooOo;
        Intrinsics.checkNotNullExpressionValue(rewardSvgaSon, "rewardSvgaSon");
        o000O.OooO(rewardSvgaSon, new OooOO0O());
        TextView rewardCountSon = ooo0o0Inflate.f45069OooOo00;
        Intrinsics.checkNotNullExpressionValue(rewardCountSon, "rewardCountSon");
        o000O.OooO(rewardCountSon, new OooOOO0());
        ImageView bgSon = ooo0o0Inflate.f45050OooO0O0;
        Intrinsics.checkNotNullExpressionValue(bgSon, "bgSon");
        o000O.OooO(bgSon, new OooOOO());
        ooo0o0Inflate.f45051OooO0OO.setTextAlignment(5);
        ooo0o0Inflate.f45054OooO0o0.setTextAlignment(5);
    }
}
