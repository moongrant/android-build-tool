package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.util.netimage.NetImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00O00OO;
import p143o00OOooo.o0O0ooO;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p258o00ooOOo.c;
import p258o00ooOOo.g;
import p258o00ooOOo.h;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.kd;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\u000b¢\u0006\u0004\b$\u0010%R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR?\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lcom/yalla/yalla/ui/view/MomentDetailGiftGiverView;", "Landroid/widget/RelativeLayout;", "Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "Oooo0oo", "Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "getMomentAdapterTag", "()Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;", "setMomentAdapterTag", "(Lcom/yalla/yalla/ui/adapter/postList/MomentAdapterTag;)V", "momentAdapterTag", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "momentGiftListType", "", "Oooo", "Lkotlin/jvm/functions/Function1;", "getToMomentGiftListListener", "()Lkotlin/jvm/functions/Function1;", "setToMomentGiftListListener", "(Lkotlin/jvm/functions/Function1;)V", "toMomentGiftListListener", "Lkotlin/Function0;", "OoooO00", "Lkotlin/jvm/functions/Function0;", "getShowGiftDialogListener", "()Lkotlin/jvm/functions/Function0;", "setShowGiftDialogListener", "(Lkotlin/jvm/functions/Function0;)V", "showGiftDialogListener", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentDetailGiftGiverView extends RelativeLayout {

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public static final /* synthetic */ int f24884OoooO0O = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Integer, Unit> toMomentGiftListListener;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final kd f24886Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public MomentDetailModel f24887Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MomentAdapterTag momentAdapterTag;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f24889OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> showGiftDialogListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailGiftGiverView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooO00o(@Nullable MomentDetailModel momentDetailModel, boolean z) {
        NetImageView netImageView;
        oOO00O.OooO00o(this);
        NetImageView netImageView2 = this.f24886Oooo0o.f49861OooO0OO;
        Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.ivGiftGiver0");
        oOO00O.OooO00o(netImageView2);
        this.f24886Oooo0o.f49861OooO0OO.setImageDrawable(null);
        NetImageView netImageView3 = this.f24886Oooo0o.f49862OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(netImageView3, "binding.ivGiftGiver1");
        oOO00O.OooO00o(netImageView3);
        this.f24886Oooo0o.f49862OooO0Oo.setImageDrawable(null);
        NetImageView netImageView4 = this.f24886Oooo0o.f49864OooO0o0;
        Intrinsics.checkNotNullExpressionValue(netImageView4, "binding.ivGiftGiver2");
        oOO00O.OooO00o(netImageView4);
        this.f24886Oooo0o.f49864OooO0o0.setImageDrawable(null);
        TextView textView = this.f24886Oooo0o.f49866OooO0oo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvGifters");
        oOO00O.OooO00o(textView);
        this.f24886Oooo0o.f49865OooO0oO.setText("");
        ImageView imageView = this.f24886Oooo0o.f49860OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivArrow");
        oOO00O.OooO(imageView);
        this.f24887Oooo0oO = momentDetailModel;
        if (z || momentDetailModel == null) {
            return;
        }
        if (momentDetailModel.getSendPropUsers().isEmpty()) {
            if (momentDetailModel.isMySelf()) {
                oOO00O.OooO00o(this);
                return;
            }
            oOO00O.OooO(this);
            this.f24889OoooO0 = false;
            TextView textView2 = this.f24886Oooo0o.f49858OooO;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvNoGifters");
            oOO00O.OooO(textView2);
            TextView textView3 = this.f24886Oooo0o.f49866OooO0oo;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvGifters");
            oOO00O.OooO00o(textView3);
            this.f24886Oooo0o.f49865OooO0oO.setText(o000O0O0.OooO0OO(R.string.button_send));
            return;
        }
        oOO00O.OooO(this);
        this.f24889OoooO0 = true;
        TextView textView4 = this.f24886Oooo0o.f49858OooO;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvNoGifters");
        oOO00O.OooO00o(textView4);
        TextView textView5 = this.f24886Oooo0o.f49866OooO0oo;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding.tvGifters");
        oOO00O.OooO(textView5);
        int i = 0;
        for (Object obj : momentDetailModel.getSendPropUsers()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            UserInfo userInfo = (UserInfo) obj;
            if (i == 0) {
                netImageView = this.f24886Oooo0o.f49861OooO0OO;
            } else if (i != 1) {
                netImageView = i != 2 ? null : this.f24886Oooo0o.f49864OooO0o0;
            } else {
                netImageView = this.f24886Oooo0o.f49862OooO0Oo;
            }
            if (netImageView != null) {
                oOO00O.OooO(netImageView);
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
                oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
                oooO00o.f48454OooOoo0 = 2;
                oooO00o.f48444OooOOoo = 1;
                oooO00o.OooO0oO(4);
                oooO00o.OooO0Oo(1, o000O0O0.OooO00o(R.color.color_white));
                oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(userInfo.getUserHeader());
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO0o(netImageView);
            }
            i = i2;
        }
        this.f24886Oooo0o.f49865OooO0oO.setText(o0O0O00.OooO0oO(momentDetailModel.getTotalPropValue(), true));
        if (momentDetailModel.isMySelf()) {
            ImageView imageView2 = this.f24886Oooo0o.f49860OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivArrow");
            oOO00O.OooO0O0(imageView2);
        }
    }

    @Nullable
    public final MomentAdapterTag getMomentAdapterTag() {
        return this.momentAdapterTag;
    }

    @Nullable
    public final Function0<Unit> getShowGiftDialogListener() {
        return this.showGiftDialogListener;
    }

    @Nullable
    public final Function1<Integer, Unit> getToMomentGiftListListener() {
        return this.toMomentGiftListListener;
    }

    public final void setMomentAdapterTag(@Nullable MomentAdapterTag momentAdapterTag) {
        this.momentAdapterTag = momentAdapterTag;
    }

    public final void setShowGiftDialogListener(@Nullable Function0<Unit> function0) {
        this.showGiftDialogListener = function0;
    }

    public final void setToMomentGiftListListener(@Nullable Function1<? super Integer, Unit> function1) {
        this.toMomentGiftListListener = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailGiftGiverView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MomentDetailGiftGiverView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        kd kdVarInflate = kd.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(kdVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f24886Oooo0o = kdVarInflate;
        kdVarInflate.f49863OooO0o.setOnClickListener(new c(this, 3));
        kdVarInflate.f49865OooO0oO.setOnClickListener(new o00O00OO(this, 3));
        kdVarInflate.f49858OooO.setOnClickListener(new g(this, 1));
        kdVarInflate.f49866OooO0oo.setOnClickListener(new h(this, 1));
        kdVarInflate.f49861OooO0OO.setOnClickListener(new o00OO0O.OooO0o(this, 5));
        kdVarInflate.f49862OooO0Oo.setOnClickListener(new p143o00OOooo.oOO00O(this, 3));
        kdVarInflate.f49864OooO0o0.setOnClickListener(new o0O0ooO(this, 1));
    }
}
