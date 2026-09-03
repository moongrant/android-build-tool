package com.yalla.yalla.ui.view.gift;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.gift.GiftBlindDetail;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropSubDetailsModel;
import com.yalla.yalla.model.gift.GiftPropSubItemModel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p184o00o00O0.OooO0OO;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.y2;
import p558o0oOOooo.oO0O00;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p571o0oOoO0.o0000oo;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002RG\u0010\r\u001a'\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R2\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/yalla/yalla/ui/view/gift/GiftBlindTipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/gift/GiftPropModel;", "giftPropModel", "", "setData", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isBlind", "OooO0o", "Lkotlin/jvm/functions/Function2;", "isGiftBlindListener", "()Lkotlin/jvm/functions/Function2;", "setGiftBlindListener", "(Lkotlin/jvm/functions/Function2;)V", "Lo0oOoO0/o0000oo;", "Lcom/yalla/yalla/model/gift/GiftPropSubItemModel;", "OooO0oO", "Lkotlin/Lazy;", "getAdapter", "()Lo0oOoO0/o0000oo;", "adapter", "Lkotlin/Function1;", "OooO0oo", "Lkotlin/jvm/functions/Function1;", "getBlindDetailListener", "()Lkotlin/jvm/functions/Function1;", "setBlindDetailListener", "(Lkotlin/jvm/functions/Function1;)V", "blindDetailListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"NotifyDataSetChanged"})
public final class GiftBlindTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final y2 f30442OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function2<? super GiftPropModel, ? super Boolean, Unit> isGiftBlindListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public GiftPropModel f30444OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy adapter;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super GiftPropModel, Unit> blindDetailListener;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            GiftBlindDetail giftBlindDetail;
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            GiftBlindTipsView giftBlindTipsView = GiftBlindTipsView.this;
            GiftPropModel giftPropModel = giftBlindTipsView.f30444OooO0o0;
            o0oo0000.OooO00o.OooO0OO("102247", MapsKt.mapOf(new Pair("type", (giftPropModel == null || (giftBlindDetail = giftPropModel.getGiftBlindDetail()) == null) ? null : Integer.valueOf(giftBlindDetail.getLevel()))));
            Function1<GiftPropModel, Unit> blindDetailListener = giftBlindTipsView.getBlindDetailListener();
            if (blindDetailListener != null) {
                blindDetailListener.invoke(giftBlindTipsView.f30444OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<com.yalla.yalla.ui.view.gift.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f30448OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context) {
            super(0);
            this.f30448OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.view.gift.OooO00o invoke() {
            return new com.yalla.yalla.ui.view.gift.OooO00o(this.f30448OooO0Oo, oo0o0Oo.item_gift_blind_tips);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftBlindTipsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void OooO0O0(GiftBlindTipsView giftBlindTipsView) {
        GiftPropSubDetailsModel subPropDetails;
        y2 y2Var = giftBlindTipsView.f30442OooO0Oo;
        RecyclerView rvBlindGiftTipsList = y2Var.f45715OooO0oO;
        Intrinsics.checkNotNullExpressionValue(rvBlindGiftTipsList, "rvBlindGiftTipsList");
        o000O.OooOOOO(rvBlindGiftTipsList);
        HorizontalScrollView llNew = y2Var.f45713OooO0o;
        Intrinsics.checkNotNullExpressionValue(llNew, "llNew");
        o000O.OooO0O0(llNew);
        ImageView ivBlindView = y2Var.f45711OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivBlindView, "ivBlindView");
        o000O.OooO0O0(ivBlindView);
        y2Var.f45716OooO0oo.setText(o0000.OooO0OO(o000000.giftBlind_maySend));
        GiftPropModel giftPropModel = giftBlindTipsView.f30444OooO0o0;
        if (giftPropModel == null || (subPropDetails = giftPropModel.getSubPropDetails()) == null) {
            return;
        }
        if (subPropDetails.getDescUrl().length() > 0) {
            Intrinsics.checkNotNullExpressionValue(ivBlindView, "ivBlindView");
            o000O.OooOOOO(ivBlindView);
        }
        giftBlindTipsView.getAdapter().OooOoO0(subPropDetails.getSubProps());
    }

    private final o0000oo<GiftPropSubItemModel> getAdapter() {
        return (o0000oo) this.adapter.getValue();
    }

    @Nullable
    public final Function1<GiftPropModel, Unit> getBlindDetailListener() {
        return this.blindDetailListener;
    }

    public final void setBlindDetailListener(@Nullable Function1<? super GiftPropModel, Unit> function1) {
        this.blindDetailListener = function1;
    }

    public final void setData(@Nullable GiftPropModel giftPropModel) {
        GiftPropSubDetailsModel subPropDetails;
        GiftBlindTipsView giftBlindTipsView = this;
        giftBlindTipsView.f30444OooO0o0 = giftPropModel;
        if ((giftPropModel == null || giftPropModel.isBlind()) ? false : true) {
            Function2<? super GiftPropModel, ? super Boolean, Unit> function2 = giftBlindTipsView.isGiftBlindListener;
            if (function2 != null) {
                function2.invoke(giftPropModel, Boolean.FALSE);
                return;
            }
            return;
        }
        Function2<? super GiftPropModel, ? super Boolean, Unit> function3 = giftBlindTipsView.isGiftBlindListener;
        if (function3 != null) {
            function3.invoke(giftPropModel, Boolean.TRUE);
        }
        GiftPropModel giftPropModel2 = giftBlindTipsView.f30444OooO0o0;
        if (giftPropModel2 != null && (subPropDetails = giftPropModel2.getSubPropDetails()) != null) {
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(getContext());
            int i = o0Oo0oo.bg_gift_blind_tips_r10;
            Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o();
            oooO00o2.f43138OooOOOo = i;
            oooO00o2.f43128OooO0o = i;
            String str = oooO00o2.f43131OooO0oo;
            boolean z = oooO00o2.f43127OooO0Oo;
            int i2 = oooO00o2.f43141OooOOoo;
            ImageView imageView = oooO00o2.f43132OooOO0;
            boolean z2 = oooO00o2.f43136OooOOO0;
            boolean z3 = oooO00o2.f43129OooO0o0;
            int i3 = oooO00o2.f43135OooOOO;
            int i4 = oooO00o2.f43137OooOOOO;
            int i5 = oooO00o2.f43151OooOoo0;
            int i6 = oooO00o2.f43150OooOoo;
            int i7 = oooO00o2.f43144OooOo00;
            boolean z4 = oooO00o2.f43143OooOo0;
            int i8 = oooO00o2.f43146OooOo0o;
            int i9 = oooO00o2.f43142OooOo;
            int i10 = oooO00o2.f43148OooOoO0;
            int i11 = oooO00o2.f43147OooOoO;
            int i12 = oooO00o2.f43149OooOoOO;
            int i13 = oooO00o2.f43152OooOooO;
            int i14 = oooO00o2.f43153OooOooo;
            boolean z5 = oooO00o2.f43145OooOo0O;
            boolean z6 = oooO00o2.f43155Oooo00O;
            oooO00o.f43131OooO0oo = str;
            oooO00o.f43127OooO0Oo = z;
            oooO00o.f43138OooOOOo = i;
            oooO00o.f43141OooOOoo = i2;
            oooO00o.f43128OooO0o = i;
            oooO00o.f43132OooOO0 = imageView;
            oooO00o.f43135OooOOO = i3;
            oooO00o.f43137OooOOOO = i4;
            oooO00o.f43151OooOoo0 = i5;
            oooO00o.f43150OooOoo = i6;
            oooO00o.f43144OooOo00 = i7;
            oooO00o.f43143OooOo0 = z4;
            oooO00o.f43145OooOo0O = z5;
            oooO00o.f43146OooOo0o = i8;
            oooO00o.f43142OooOo = i9;
            oooO00o.f43148OooOoO0 = i10;
            oooO00o.f43147OooOoO = i11;
            oooO00o.f43149OooOoOO = i12;
            oooO00o.f43152OooOooO = i13;
            oooO00o.f43153OooOooo = i14;
            oooO00o.f43155Oooo00O = z6;
            oooO00o.f43136OooOOO0 = z2;
            oooO00o.f43129OooO0o0 = z3;
            oooO00o.f43126OooO0OO = OooO0OO.OooO0Oo(subPropDetails.getDescImage());
            oooO00o.f43124OooO00o = 0;
            giftBlindTipsView = this;
            y2 y2Var = giftBlindTipsView.f30442OooO0Oo;
            oooO00o.OooO0Oo(y2Var.f45710OooO0O0);
            boolean zOooO0o0 = OooOo00.OooO0o0();
            NetImageView netImageView = y2Var.f45710OooO0O0;
            if (zOooO0o0 && netImageView != null) {
                netImageView.setScaleX(-1.0f);
            }
            netImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if (giftPropModel != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new oO0O00(giftPropModel, giftBlindTipsView, null), 2, null);
        }
    }

    public final void setGiftBlindListener(@Nullable Function2<? super GiftPropModel, ? super Boolean, Unit> function2) {
        this.isGiftBlindListener = function2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftBlindTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ GiftBlindTipsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftBlindTipsView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        y2 y2VarInflate = y2.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(y2VarInflate, "inflate(...)");
        this.f30442OooO0Oo = y2VarInflate;
        this.adapter = LazyKt.lazy(new OooO0O0(context));
        ImageView ivBlindView = y2VarInflate.f45711OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivBlindView, "ivBlindView");
        o000O.OooO(ivBlindView, new OooO00o());
        y2VarInflate.f45715OooO0oO.setLayoutManager(new LinearLayoutManager(context, 0, false));
        y2VarInflate.f45715OooO0oO.setAdapter(getAdapter());
    }
}
