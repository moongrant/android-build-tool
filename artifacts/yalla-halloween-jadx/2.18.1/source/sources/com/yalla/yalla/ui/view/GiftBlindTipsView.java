package com.yalla.yalla.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.GiftPropSubDetailsModel;
import com.yalla.yalla.model.GiftPropSubItemModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000OO00;
import p254o00ooO0O.oOO00O;
import p606o0oo0O.OooOo;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.ri;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002RG\u0010\r\u001a'\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R2\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/yalla/yalla/ui/view/GiftBlindTipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/GiftPropModel;", "giftPropModel", "", "setData", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isBlind", "Oooo0oo", "Lkotlin/jvm/functions/Function2;", "isGiftBlindListener", "()Lkotlin/jvm/functions/Function2;", "setGiftBlindListener", "(Lkotlin/jvm/functions/Function2;)V", "Lo00o00o0/OooO0OO;", "Lcom/yalla/yalla/model/GiftPropSubItemModel;", "Oooo", "Lkotlin/Lazy;", "getAdapter", "()Lo00o00o0/OooO0OO;", "adapter", "Lkotlin/Function1;", "OoooO00", "Lkotlin/jvm/functions/Function1;", "getBlindDetailListener", "()Lkotlin/jvm/functions/Function1;", "setBlindDetailListener", "(Lkotlin/jvm/functions/Function1;)V", "blindDetailListener", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"NotifyDataSetChanged"})
public final class GiftBlindTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final ri f24792Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public GiftPropModel f24793Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function2<? super GiftPropModel, ? super Boolean, Unit> isGiftBlindListener;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super GiftPropModel, Unit> blindDetailListener;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            OooOo.OooO0O0("102247");
            Function1<GiftPropModel, Unit> blindDetailListener = GiftBlindTipsView.this.getBlindDetailListener();
            if (blindDetailListener != null) {
                blindDetailListener.invoke(GiftBlindTipsView.this.f24793Oooo0oO);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<com.yalla.yalla.ui.view.OooO0O0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f24797Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context) {
            super(0);
            this.f24797Oooo0o = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.view.OooO0O0 invoke() {
            return new com.yalla.yalla.ui.view.OooO0O0(this.f24797Oooo0o);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftBlindTipsView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final p188o00o00o0.OooO0OO<GiftPropSubItemModel> getAdapter() {
        return (p188o00o00o0.OooO0OO) this.adapter.getValue();
    }

    @Nullable
    public final Function1<GiftPropModel, Unit> getBlindDetailListener() {
        return this.blindDetailListener;
    }

    public final void setBlindDetailListener(@Nullable Function1<? super GiftPropModel, Unit> function1) {
        this.blindDetailListener = function1;
    }

    public final void setData(@Nullable GiftPropModel giftPropModel) {
        this.f24793Oooo0oO = giftPropModel;
        GiftPropSubDetailsModel subPropDetails = giftPropModel != null ? giftPropModel.getSubPropDetails() : null;
        if (subPropDetails == null || subPropDetails.getSubProps().isEmpty()) {
            Function2<? super GiftPropModel, ? super Boolean, Unit> function2 = this.isGiftBlindListener;
            if (function2 != null) {
                function2.invoke(giftPropModel, Boolean.FALSE);
                return;
            }
            return;
        }
        Function2<? super GiftPropModel, ? super Boolean, Unit> function3 = this.isGiftBlindListener;
        if (function3 != null) {
            function3.invoke(giftPropModel, Boolean.TRUE);
        }
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
        oooO00o.f48434OooO0oo = null;
        oooO00o.f48430OooO0Oo = false;
        oooO00o.f48441OooOOOo = R.mipmap.ic_gift_blind_tips_bg;
        oooO00o.f48444OooOOoo = 0;
        oooO00o.f48431OooO0o = R.mipmap.ic_gift_blind_tips_bg;
        oooO00o.f48435OooOO0 = null;
        oooO00o.f48438OooOOO = -1;
        oooO00o.f48440OooOOOO = -1;
        oooO00o.f48454OooOoo0 = 0;
        oooO00o.f48453OooOoo = 0;
        oooO00o.f48447OooOo00 = 0;
        oooO00o.f48446OooOo0 = false;
        oooO00o.f48448OooOo0O = false;
        oooO00o.f48449OooOo0o = 0;
        oooO00o.f48445OooOo = 0;
        oooO00o.f48451OooOoO0 = 0;
        oooO00o.f48450OooOoO = 0;
        oooO00o.f48452OooOoOO = 0;
        oooO00o.f48455OooOooO = 0;
        oooO00o.f48456OooOooo = 0;
        oooO00o.f48458Oooo00O = false;
        oooO00o.f48439OooOOO0 = false;
        float f = 22;
        oooO00o.OooO0oO(o000OO00.OooO00o(f));
        oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(subPropDetails.getDescImage());
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(this.f24792Oooo0o.f50508OooO0O0);
        this.f24792Oooo0o.f50508OooO0O0.setScaleType(ImageView.ScaleType.FIT_XY);
        LinearLayout linearLayout = this.f24792Oooo0o.f50510OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llBlindViewBg");
        oOO00O.OooO00o(linearLayout);
        ViewGroup.LayoutParams layoutParams = this.f24792Oooo0o.f50511OooO0o0.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginEnd(o000OO00.OooO00o(f));
        if (subPropDetails.getDescUrl().length() > 0) {
            LinearLayout linearLayout2 = this.f24792Oooo0o.f50510OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llBlindViewBg");
            oOO00O.OooO(linearLayout2);
            layoutParams2.setMarginEnd(o000OO00.OooO00o((float) (-53.5d)));
        }
        this.f24792Oooo0o.f50511OooO0o0.setLayoutParams(layoutParams2);
        getAdapter().setNewData(subPropDetails.getSubProps());
    }

    public final void setGiftBlindListener(@Nullable Function2<? super GiftPropModel, ? super Boolean, Unit> function2) {
        this.isGiftBlindListener = function2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftBlindTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftBlindTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        ri riVarInflate = ri.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(riVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24792Oooo0o = riVarInflate;
        this.adapter = LazyKt.lazy(new OooO0O0(context));
        ImageView imageView = riVarInflate.f50509OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivBlindView");
        oOO00O.OooO0oO(imageView, new OooO00o());
        riVarInflate.f50511OooO0o0.setLayoutManager(new LinearLayoutManager(context, 0, false));
        riVarInflate.f50511OooO0o0.setAdapter(getAdapter());
    }
}
