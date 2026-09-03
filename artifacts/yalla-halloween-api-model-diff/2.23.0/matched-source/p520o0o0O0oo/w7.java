package p520o0o0O0oo;

import android.view.View;
import android.widget.ImageView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.gift.GiftCustomMadeTipsView;
import com.yalla.yalla.ui.view.gift.GiftTopTipsView;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class w7 extends Lambda implements Function2<GiftPropModel, Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53370OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ GiftTopTipsView f53371OooO0o0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GiftPropTypeShow.values().length];
            try {
                iArr[GiftPropTypeShow.InRoom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftPropTypeShow.InMomentDetail.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GiftPropTypeShow.InMomentList.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GiftPropTypeShow.InChat.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(x6 x6Var, GiftTopTipsView giftTopTipsView) {
        super(2);
        this.f53370OooO0Oo = x6Var;
        this.f53371OooO0o0 = giftTopTipsView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(GiftPropModel giftPropModel, Boolean bool) {
        GiftPropModel giftPropModel2 = giftPropModel;
        boolean zBooleanValue = bool.booleanValue();
        x6 x6Var = this.f53370OooO0Oo;
        int i = x6Var.f53383OooOOOo;
        boolean z = false;
        if (giftPropModel2 != null) {
            o0OO000.OooO0O0("102246", MapsKt.hashMapOf(new Pair("gifted", Integer.valueOf(giftPropModel2.getGiftId()))));
        }
        x6.OooOOOo(x6Var);
        GiftPropTypeShow giftPropTypeShow = x6Var.f53374OooO;
        if (zBooleanValue) {
            View view = x6Var.OooOOo().f58240OooOoO;
            Intrinsics.checkNotNullExpressionValue(view, "mBinding.vLine");
            o000OO00.OooO0O0(view);
            ImageView imageView = x6Var.OooOOo().f58227OooOO0o;
            Intrinsics.checkNotNullExpressionValue(imageView, "mBinding.ivAllRoom");
            o000OO00.OooO0O0(imageView);
            x6Var.OooOOo0();
            int i2 = OooO00o.$EnumSwitchMapping$0[giftPropTypeShow.ordinal()];
            if (i2 == 1) {
                RoomUserInfoModel roomUserInfoModel = x6Var.f53382OooOOOO;
                if (Intrinsics.areEqual(roomUserInfoModel, d6.f53264OooO0o)) {
                    x6Var.OooOoOO(d6.f53266OooO0oO);
                } else if (!Intrinsics.areEqual(roomUserInfoModel, d6.f53266OooO0oO)) {
                    if (com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47414OooO0OO.size() < 2) {
                        x6Var.OooOoOO(d6.f53265OooO0o0);
                    }
                    if (x6Var.f53383OooOOOo > 7) {
                    }
                } else if (com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47414OooO0OO.size() < 2) {
                    x6Var.OooOoOO(d6.f53265OooO0o0);
                }
                i = 1;
            } else if (i2 == 2 || i2 == 3 || (i2 == 4 && x6Var.f53383OooOOOo > 7)) {
                i = 1;
            }
        } else {
            if (giftPropModel2 != null && giftPropModel2.isCustomMade()) {
                GiftTopTipsView giftTopTipsView = this.f53371OooO0o0;
                GiftCustomMadeTipsView giftCustomMadeView = giftTopTipsView.getGiftCustomMadeView();
                int i3 = GiftCustomMadeTipsView.f30994OooO0oO;
                giftCustomMadeView.setLeftToRight(OooO.OooO0o0());
                giftTopTipsView.getGiftCustomMadeView().setData(giftPropModel2);
            }
            int i4 = OooO00o.$EnumSwitchMapping$0[giftPropTypeShow.ordinal()];
            if (i4 == 1) {
                if (com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47414OooO0OO.size() < 2) {
                    x6Var.OooOoOO(d6.f53265OooO0o0);
                }
                GiftPropModel giftPropModel3 = x6Var.f53384OooOOo;
                if (giftPropModel3 != null && giftPropModel3.isBackpack()) {
                    z = true;
                }
                if (z) {
                    if (Intrinsics.areEqual(x6Var.f53382OooOOOO, d6.f53264OooO0o)) {
                        x6Var.OooOoOO(d6.f53266OooO0oO);
                    }
                    if (i == 777) {
                        i = 1;
                    }
                    View view2 = x6Var.OooOOo().f58240OooOoO;
                    Intrinsics.checkNotNullExpressionValue(view2, "mBinding.vLine");
                    o000OO00.OooO0O0(view2);
                    ImageView imageView2 = x6Var.OooOOo().f58227OooOO0o;
                    Intrinsics.checkNotNullExpressionValue(imageView2, "mBinding.ivAllRoom");
                    o000OO00.OooO0O0(imageView2);
                } else {
                    View view3 = x6Var.OooOOo().f58240OooOoO;
                    Intrinsics.checkNotNullExpressionValue(view3, "mBinding.vLine");
                    o000OO00.OooOOOO(view3);
                    ImageView imageView3 = x6Var.OooOOo().f58227OooOO0o;
                    Intrinsics.checkNotNullExpressionValue(imageView3, "mBinding.ivAllRoom");
                    o000OO00.OooOOOO(imageView3);
                }
            } else if (i4 == 2 || i4 == 3) {
                GiftPropModel giftPropModel4 = x6Var.f53384OooOOo;
                if (giftPropModel4 != null && giftPropModel4.isBackpack()) {
                    z = true;
                }
                if (z && i == 777) {
                    i = 1;
                }
                View view4 = x6Var.OooOOo().f58240OooOoO;
                Intrinsics.checkNotNullExpressionValue(view4, "mBinding.vLine");
                o000OO00.OooO0O0(view4);
                ImageView imageView4 = x6Var.OooOOo().f58227OooOO0o;
                Intrinsics.checkNotNullExpressionValue(imageView4, "mBinding.ivAllRoom");
                o000OO00.OooO0O0(imageView4);
            } else if (i4 == 4) {
                GiftPropModel giftPropModel5 = x6Var.f53384OooOOo;
                if (giftPropModel5 != null && giftPropModel5.isBackpack()) {
                    z = true;
                }
                if (z && i == 777) {
                    i = 1;
                }
                View view5 = x6Var.OooOOo().f58240OooOoO;
                Intrinsics.checkNotNullExpressionValue(view5, "mBinding.vLine");
                o000OO00.OooO0O0(view5);
                ImageView imageView5 = x6Var.OooOOo().f58227OooOO0o;
                Intrinsics.checkNotNullExpressionValue(imageView5, "mBinding.ivAllRoom");
                o000OO00.OooO0O0(imageView5);
            }
        }
        x6Var.OooOoO(i);
        return Unit.INSTANCE;
    }
}
