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
import com.code.android.util.o000OO00;
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
import p139o00OOooO.OooO0o;
import p362o0OOo0O.OooOO0;
import p552o0oOOoOo.o0OO00o0;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p591o0oo000O.OooO;
import p641o0ooOOOO.jb;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010!\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\b\u0002\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002RG\u0010\r\u001a'\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R2\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/yalla/yalla/ui/view/gift/GiftBlindTipsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/gift/GiftPropModel;", "giftPropModel", "", "setData", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "isBlind", "OooO0o", "Lkotlin/jvm/functions/Function2;", "isGiftBlindListener", "()Lkotlin/jvm/functions/Function2;", "setGiftBlindListener", "(Lkotlin/jvm/functions/Function2;)V", "Lo0oOo0OO/o000O;", "Lcom/yalla/yalla/model/gift/GiftPropSubItemModel;", "OooO0oO", "Lkotlin/Lazy;", "getAdapter", "()Lo0oOo0OO/o000O;", "adapter", "Lkotlin/Function1;", "OooO0oo", "Lkotlin/jvm/functions/Function1;", "getBlindDetailListener", "()Lkotlin/jvm/functions/Function1;", "setBlindDetailListener", "(Lkotlin/jvm/functions/Function1;)V", "blindDetailListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"NotifyDataSetChanged"})
public final class GiftBlindTipsView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final jb f30987OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function2<? super GiftPropModel, ? super Boolean, Unit> isGiftBlindListener;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public GiftPropModel f30989OooO0o0;

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
            GiftPropModel giftPropModel = giftBlindTipsView.f30989OooO0o0;
            o0OO000.OooO0O0("102247", MapsKt.mapOf(new Pair("type", (giftPropModel == null || (giftBlindDetail = giftPropModel.getGiftBlindDetail()) == null) ? null : Integer.valueOf(giftBlindDetail.getLevel()))));
            Function1<GiftPropModel, Unit> blindDetailListener = giftBlindTipsView.getBlindDetailListener();
            if (blindDetailListener != null) {
                blindDetailListener.invoke(giftBlindTipsView.f30989OooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<com.yalla.yalla.ui.view.gift.OooO00o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f30993OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Context context) {
            super(0);
            this.f30993OooO0Oo = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.view.gift.OooO00o invoke() {
            return new com.yalla.yalla.ui.view.gift.OooO00o(this.f30993OooO0Oo, oO00OO0O.item_gift_blind_tips);
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
        jb jbVar = giftBlindTipsView.f30987OooO0Oo;
        RecyclerView recyclerView = jbVar.f58209OooO0oO;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvBlindGiftTipsList");
        o000OO00.OooOOOO(recyclerView);
        HorizontalScrollView horizontalScrollView = jbVar.f58207OooO0o;
        Intrinsics.checkNotNullExpressionValue(horizontalScrollView, "binding.llNew");
        o000OO00.OooO0O0(horizontalScrollView);
        ImageView imageView = jbVar.f58205OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivBlindView");
        o000OO00.OooO0O0(imageView);
        jbVar.f58210OooO0oo.setText(o0000.OooO0OO(oO00OOo0.giftBlind_maySend));
        GiftPropModel giftPropModel = giftBlindTipsView.f30989OooO0o0;
        if (giftPropModel == null || (subPropDetails = giftPropModel.getSubPropDetails()) == null) {
            return;
        }
        if (subPropDetails.getDescUrl().length() > 0) {
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivBlindView");
            o000OO00.OooOOOO(imageView);
        }
        giftBlindTipsView.getAdapter().OooOoO0(subPropDetails.getSubProps());
    }

    private final o000O<GiftPropSubItemModel> getAdapter() {
        return (o000O) this.adapter.getValue();
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
        giftBlindTipsView.f30989OooO0o0 = giftPropModel;
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
        GiftPropModel giftPropModel2 = giftBlindTipsView.f30989OooO0o0;
        if (giftPropModel2 != null && (subPropDetails = giftPropModel2.getSubPropDetails()) != null) {
            OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(getContext());
            int i = oOo00OO0.bg_gift_blind_tips_r10;
            OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o();
            oooO00o2.f43923OooOOOo = i;
            oooO00o2.f43913OooO0o = i;
            String str = oooO00o2.f43916OooO0oo;
            boolean z = oooO00o2.f43912OooO0Oo;
            int i2 = oooO00o2.f43926OooOOoo;
            ImageView imageView = oooO00o2.f43917OooOO0;
            boolean z2 = oooO00o2.f43921OooOOO0;
            boolean z3 = oooO00o2.f43914OooO0o0;
            int i3 = oooO00o2.f43920OooOOO;
            int i4 = oooO00o2.f43922OooOOOO;
            int i5 = oooO00o2.f43936OooOoo0;
            int i6 = oooO00o2.f43935OooOoo;
            int i7 = oooO00o2.f43929OooOo00;
            boolean z4 = oooO00o2.f43928OooOo0;
            int i8 = oooO00o2.f43931OooOo0o;
            int i9 = oooO00o2.f43927OooOo;
            int i10 = oooO00o2.f43933OooOoO0;
            int i11 = oooO00o2.f43932OooOoO;
            int i12 = oooO00o2.f43934OooOoOO;
            int i13 = oooO00o2.f43937OooOooO;
            int i14 = oooO00o2.f43938OooOooo;
            boolean z5 = oooO00o2.f43930OooOo0O;
            boolean z6 = oooO00o2.f43940Oooo00O;
            oooO00o.f43916OooO0oo = str;
            oooO00o.f43912OooO0Oo = z;
            oooO00o.f43923OooOOOo = i;
            oooO00o.f43926OooOOoo = i2;
            oooO00o.f43913OooO0o = i;
            oooO00o.f43917OooOO0 = imageView;
            oooO00o.f43920OooOOO = i3;
            oooO00o.f43922OooOOOO = i4;
            oooO00o.f43936OooOoo0 = i5;
            oooO00o.f43935OooOoo = i6;
            oooO00o.f43929OooOo00 = i7;
            oooO00o.f43928OooOo0 = z4;
            oooO00o.f43930OooOo0O = z5;
            oooO00o.f43931OooOo0o = i8;
            oooO00o.f43927OooOo = i9;
            oooO00o.f43933OooOoO0 = i10;
            oooO00o.f43932OooOoO = i11;
            oooO00o.f43934OooOoOO = i12;
            oooO00o.f43937OooOooO = i13;
            oooO00o.f43938OooOooo = i14;
            oooO00o.f43940Oooo00O = z6;
            oooO00o.f43921OooOOO0 = z2;
            oooO00o.f43914OooO0o0 = z3;
            oooO00o.f43911OooO0OO = OooO0o.OooO0Oo(subPropDetails.getDescImage());
            oooO00o.f43909OooO00o = 0;
            giftBlindTipsView = this;
            jb jbVar = giftBlindTipsView.f30987OooO0Oo;
            oooO00o.OooO0Oo(jbVar.f58204OooO0O0);
            boolean zOooO0o0 = OooO.OooO0o0();
            NetImageView netImageView = jbVar.f58204OooO0O0;
            if (zOooO0o0 && netImageView != null) {
                netImageView.setScaleX(-1.0f);
            }
            netImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if (giftPropModel != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0OO00o0(giftPropModel, giftBlindTipsView, null), 2, null);
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
        jb jbVarInflate = jb.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(jbVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f30987OooO0Oo = jbVarInflate;
        this.adapter = LazyKt.lazy(new OooO0O0(context));
        ImageView imageView = jbVarInflate.f58205OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivBlindView");
        o000OO00.OooO(imageView, new OooO00o());
        jbVarInflate.f58209OooO0oO.setLayoutManager(new LinearLayoutManager(context, 0, false));
        jbVarInflate.f58209OooO0oO.setAdapter(getAdapter());
    }
}
