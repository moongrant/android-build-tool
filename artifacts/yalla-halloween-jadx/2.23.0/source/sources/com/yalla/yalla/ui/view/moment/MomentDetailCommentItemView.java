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
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooO0O0;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.facebook.internal.AnalyticsEvents;
import com.yalla.netimage.NetImageView;
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
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView.OooOo;
import com.yalla.yalla.ui.view.moment.MomentDetailCommentItemView.OooOo00;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p029Oooo0oo.oo0ooO;
import p377o0OOoOo.o0000OO0;
import p464o0Oooo.o000000O;
import p484o0o00O.o0000O0;
import p556o0oOOooo.oO0000o0;
import p556o0oOOooo.oO00O0o0;
import p556o0oOOooo.oO0O0OoO;
import p556o0oOOooo.oO0OOo0o;
import p556o0oOOooo.oO0OoOO0;
import p556o0oOOooo.oOo00OO0;
import p584o0oOooO0.oO00O0o;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.l6;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010*\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f8\u0006@BX\u0086.¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR0\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006-"}, d2 = {"Lcom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "<set-?>", "OooO0o0", "I", "getPosition", "()I", "position", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "OooO0o", "Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "getItem", "()Lcom/yalla/yalla/model/moment/MomentCommentDetailModel;", "item", "Lcom/yalla/yalla/model/moment/MomentReplyModel;", "OooO0oO", "Lcom/yalla/yalla/model/moment/MomentReplyModel;", "getItemSon", "()Lcom/yalla/yalla/model/moment/MomentReplyModel;", "itemSon", "Lcom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment;", "OooO0oo", "Lcom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment;", "getFragment", "()Lcom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment;", "setFragment", "(Lcom/yalla/yalla/ui/fragment/moment/MomentDetailCommentFragment;)V", "fragment", "Lkotlin/Function1;", "", "OooO", "Lkotlin/jvm/functions/Function1;", "getItemListener", "()Lkotlin/jvm/functions/Function1;", "setItemListener", "(Lkotlin/jvm/functions/Function1;)V", "itemListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMomentDetailCommentItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,702:1\n283#2,2:703\n283#2,2:705\n*S KotlinDebug\n*F\n+ 1 MomentDetailCommentItemView.kt\ncom/yalla/yalla/ui/view/moment/MomentDetailCommentItemView\n*L\n384#1:703,2\n579#1:705,2\n*E\n"})
public final class MomentDetailCommentItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f31080OooOOO = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super MomentCommentDetailModel, Unit> itemListener;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final l6 f31082OooO0Oo;

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
    public boolean f31087OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f31088OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f31089OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public boolean f31090OooOOO0;

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
            int i = MomentDetailCommentItemView.f31080OooOOO;
            MomentDetailCommentItemView.this.OooO0oO();
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

    public static final class OooOo extends Lambda implements Function0<Unit> {
        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentDetailModel mPostDetailModel;
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            MomentDetailCommentFragment fragment = momentDetailCommentItemView.getFragment();
            if (fragment != null && (mPostDetailModel = fragment.getMPostDetailModel()) != null) {
                o0000O0.OooO00o(momentDetailCommentItemView.getItem(), mPostDetailModel.getId(), momentDetailCommentItemView.getFragment());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {
        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MomentDetailModel mPostDetailModel;
            MomentDetailCommentItemView momentDetailCommentItemView = MomentDetailCommentItemView.this;
            MomentDetailCommentFragment fragment = momentDetailCommentItemView.getFragment();
            if (fragment != null && (mPostDetailModel = fragment.getMPostDetailModel()) != null) {
                o0000O0.OooO00o(momentDetailCommentItemView.getItem(), mPostDetailModel.getId(), momentDetailCommentItemView.getFragment());
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
                com.yalla.yalla.ui.view.moment.OooO0OO onLogin = new com.yalla.yalla.ui.view.moment.OooO0OO(momentDetailCommentItemView);
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
                MomentDetailCommentItemView.OooO0O0(momentDetailCommentItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function1<View, Unit> {
        public o00O0O() {
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

    public static final class o00Oo0 extends Lambda implements Function1<View, Unit> {
        public o00Oo0() {
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

    public static final class o00Ooo implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f31108OooO0Oo;

        public o00Ooo(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f31108OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f31108OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f31108OooO0Oo;
        }

        public final int hashCode() {
            return this.f31108OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f31108OooO0Oo.invoke(obj);
        }
    }

    public static final class o00oO0o extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f31109OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(MomentCommentDetailModel momentCommentDetailModel) {
            super(1);
            this.f31109OooO0Oo = momentCommentDetailModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f31109OooO0Oo.setSendProp(false);
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
                MomentDetailCommentItemView.OooO0O0(momentDetailCommentItemView);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function1<ApiResult<RewardCommentResultModel>, Unit> {
        public o0ooOOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RewardCommentResultModel> apiResult) {
            ApiResult<RewardCommentResultModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MomentDetailCommentItemView.this.f31088OooOO0O = false;
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function1<RewardCommentResultModel, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SVGAView f31112OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentDetailModel f31113OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentDetailCommentFragment f31114OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TextView f31115OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(SVGAView sVGAView, MomentDetailCommentFragment momentDetailCommentFragment, MomentCommentDetailModel momentCommentDetailModel, TextView textView) {
            super(1);
            this.f31112OooO0Oo = sVGAView;
            this.f31114OooO0o0 = momentDetailCommentFragment;
            this.f31113OooO0o = momentCommentDetailModel;
            this.f31115OooO0oO = textView;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RewardCommentResultModel rewardCommentResultModel) {
            RewardCommentResultModel rewardCommentResultModel2 = rewardCommentResultModel;
            o0OO000.OooO00o("203024");
            MomentDetailCommentFragment momentDetailCommentFragment = this.f31114OooO0o0;
            LifecycleOwner viewLifecycleOwner = momentDetailCommentFragment.getViewLifecycleOwner();
            SVGAView sVGAView = this.f31112OooO0Oo;
            sVGAView.OooOO0O("svga/anim_moment_reward.svga", viewLifecycleOwner);
            sVGAView.OooOO0o();
            MomentCommentDetailModel momentCommentDetailModel = this.f31113OooO0o;
            momentCommentDetailModel.setSendProp(true);
            momentCommentDetailModel.setPropNum(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getTotalPropNum() : 0L);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooO0O0().setValue(Long.valueOf(rewardCommentResultModel2 != null ? rewardCommentResultModel2.getCoinBalance() : 0L));
            String strOooO0o = p590o0oo0.OooOOOO.OooO0o(momentCommentDetailModel.getPropNum(), false);
            TextView textView = this.f31115OooO0oO;
            textView.setText(strOooO0o);
            textView.setTextColor(o0000.OooO00o(momentCommentDetailModel.isSendProp() ? oO00O0o.color_333333 : oO00O0o.color_333333_65));
            int i = p559o0oOo00.OooOOO.f56177OooO0O0;
            o0oOo00.OooOOO.OooO00o.OooO00o(momentDetailCommentFragment.getContext(), textView);
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
        oO0000o0 onLogin = new oO0000o0(momentDetailCommentItemView);
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

    public static final void OooO0OO(MomentDetailCommentItemView momentDetailCommentItemView, MomentReplyModel momentReplyModel) {
        momentDetailCommentItemView.getClass();
        oO0OoOO0 onLogin = new oO0OoOO0(momentDetailCommentItemView, momentReplyModel);
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

    public static final void OooO0Oo(MomentDetailCommentItemView momentDetailCommentItemView) {
        momentDetailCommentItemView.getClass();
        oO0OOo0o onLogin = new oO0OOo0o(momentDetailCommentItemView);
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

    public static final void OooO0o(MomentDetailCommentItemView momentDetailCommentItemView, MomentReplyModel momentReplyModel, SVGAView sVGAView, TextView textView) {
        if (momentDetailCommentItemView.f31090OooOOO0) {
            return;
        }
        momentDetailCommentItemView.f31090OooOOO0 = true;
        momentReplyModel.setSendProp(true);
        MomentDetailCommentFragment momentDetailCommentFragment = momentDetailCommentItemView.fragment;
        if (momentDetailCommentFragment != null) {
            momentDetailCommentFragment.getMomentVm().commentSendProp(oo0ooO.OooO00o(momentReplyModel.getId()), com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(momentReplyModel.getUserid()))).observe(momentDetailCommentFragment.getViewLifecycleOwner(), new o0000OO0(new oO00O0o0(sVGAView, momentDetailCommentFragment, momentReplyModel, textView), new p556o0oOOooo.oO00O0o(momentReplyModel), new oOo00OO0(momentDetailCommentItemView), false));
        }
    }

    public static final void OooO0o0(MomentDetailCommentItemView momentDetailCommentItemView) {
        momentDetailCommentItemView.getClass();
        oO0O0OoO onLogin = new oO0O0OoO(momentDetailCommentItemView);
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

    public final void OooO0oO() {
        int i = MomentReplyActivity.f26149OooOoO;
        MomentDetailCommentFragment momentDetailCommentFragment = this.fragment;
        FragmentActivity activity = momentDetailCommentFragment != null ? momentDetailCommentFragment.getActivity() : null;
        MomentDetailCommentFragment momentDetailCommentFragment2 = this.fragment;
        MomentReplyActivity.OooO00o.OooO00o(activity, true, momentDetailCommentFragment2 != null ? momentDetailCommentFragment2.getMPostDetailModel() : null, getItem(), null);
    }

    public final void OooO0oo(@NotNull MomentCommentDetailModel item, @NotNull SVGAView rewardSvga, @NotNull TextView tvRewardCount) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(rewardSvga, "rewardSvga");
        Intrinsics.checkNotNullParameter(tvRewardCount, "tvRewardCount");
        if (this.f31088OooOO0O) {
            return;
        }
        this.f31088OooOO0O = true;
        item.setSendProp(true);
        MomentDetailCommentFragment momentDetailCommentFragment = this.fragment;
        if (momentDetailCommentFragment != null) {
            momentDetailCommentFragment.getMomentVm().commentSendProp(oo0ooO.OooO00o(item.getId()), com.code.android.util.o0OoOo0.OooOOO(item.getUserid(), "")).observe(momentDetailCommentFragment.getViewLifecycleOwner(), new o0000OO0(new oo000o(rewardSvga, momentDetailCommentFragment, item, tvRewardCount), new o00oO0o(item), new o0ooOOo(), false));
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
        l6 l6VarInflate = l6.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(l6VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f31082OooO0Oo = l6VarInflate;
        this.position = -1;
        ConstraintLayout constraintLayout = l6VarInflate.f58337OooO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layout");
        o000OO00.OooO(constraintLayout, new OooOOOO());
        l6VarInflate.f58337OooO.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0oOOooo.o0o0000
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i2 = MomentDetailCommentItemView.f31080OooOOO;
                MomentDetailCommentItemView this$0 = this.f56079OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.getItem().isHide()) {
                    return true;
                }
                MomentDetailCommentItemView.OooOo00 onLogin = this$0.new OooOo00();
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return true;
                }
                Activity activityOooO0O0 = OooO0O0.OooO0O0();
                if (activityOooO0O0 == null) {
                    return true;
                }
                int i3 = LoginActivity.f25186OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                return true;
            }
        });
        l6VarInflate.f58340OooO0OO.setOnLongClickListener(new View.OnLongClickListener() { // from class: o0oOOooo.oO0Oo
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                int i2 = MomentDetailCommentItemView.f31080OooOOO;
                MomentDetailCommentItemView this$0 = this.f56136OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (this$0.getItem().isHide()) {
                    return true;
                }
                MomentDetailCommentItemView.OooOo onLogin = this$0.new OooOo();
                Intrinsics.checkNotNullParameter(onLogin, "onLogin");
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                    onLogin.invoke();
                    return true;
                }
                Activity activityOooO0O0 = OooO0O0.OooO0O0();
                if (activityOooO0O0 == null) {
                    return true;
                }
                int i3 = LoginActivity.f25186OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                return true;
            }
        });
        NetImageView netImageView = l6VarInflate.f58342OooO0o;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.head");
        o000OO00.OooO(netImageView, new Oooo000());
        SVGAView sVGAView = l6VarInflate.f58351OooOOOO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.praiseSvga");
        o000OO00.OooO(sVGAView, new Oooo0());
        ImageView imageView = l6VarInflate.f58350OooOOO0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.praiseIv");
        o000OO00.OooO(imageView, new o000oOoO());
        TextView textView = l6VarInflate.f58347OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.praiseCount");
        o000OO00.OooO(textView, new o0OoOo0());
        TextView textView2 = l6VarInflate.f58355OooOOoo;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.rewardCount");
        o000OO00.OooO(textView2, new o00O0O());
        SVGAView sVGAView2 = l6VarInflate.f58360OooOo0o;
        Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.rewardSvga");
        o000OO00.OooO(sVGAView2, new o00Oo0());
        ImageView imageView2 = l6VarInflate.f58357OooOo0;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.rewardIv");
        o000OO00.OooO(imageView2, new OooO00o());
        NetImageView netImageView2 = l6VarInflate.f58344OooO0oO;
        Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.headSon");
        o000OO00.OooO(netImageView2, new OooO0O0());
        SVGAView sVGAView3 = l6VarInflate.f58352OooOOOo;
        Intrinsics.checkNotNullExpressionValue(sVGAView3, "binding.praiseSvgaSon");
        o000OO00.OooO(sVGAView3, new OooO0OO());
        ImageView imageView3 = l6VarInflate.f58349OooOOO;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.praiseIvSon");
        o000OO00.OooO(imageView3, new OooO0o());
        TextView textView3 = l6VarInflate.f58348OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding.praiseCountSon");
        o000OO00.OooO(textView3, new OooO());
        ImageView imageView4 = l6VarInflate.f58359OooOo0O;
        Intrinsics.checkNotNullExpressionValue(imageView4, "binding.rewardIvSon");
        o000OO00.OooO(imageView4, new OooOO0());
        SVGAView sVGAView4 = l6VarInflate.f58356OooOo;
        Intrinsics.checkNotNullExpressionValue(sVGAView4, "binding.rewardSvgaSon");
        o000OO00.OooO(sVGAView4, new OooOO0O());
        TextView textView4 = l6VarInflate.f58358OooOo00;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.rewardCountSon");
        o000OO00.OooO(textView4, new OooOOO0());
        ImageView imageView5 = l6VarInflate.f58339OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView5, "binding.bgSon");
        o000OO00.OooO(imageView5, new OooOOO());
        l6VarInflate.f58340OooO0OO.setTextAlignment(5);
        l6VarInflate.f58343OooO0o0.setTextAlignment(5);
    }
}
