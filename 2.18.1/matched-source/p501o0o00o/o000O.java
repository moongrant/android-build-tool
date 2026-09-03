package p501o0o00o;

import android.view.View;
import android.widget.ImageView;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.RoomUserInfoModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.oOO00O;
import p530o0o0OOO.o00O;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O extends Lambda implements Function2<GiftPropModel, Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41462Oooo0o;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GiftPropTypeShow.values().length];
            iArr[GiftPropTypeShow.InRoom.ordinal()] = 1;
            iArr[GiftPropTypeShow.InMomentDetail.ordinal()] = 2;
            iArr[GiftPropTypeShow.InMomentList.ordinal()] = 3;
            iArr[GiftPropTypeShow.InChat.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(o000 o000Var) {
        super(2);
        this.f41462Oooo0o = o000Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(GiftPropModel giftPropModel, Boolean bool) {
        GiftPropModel giftPropModel2 = giftPropModel;
        boolean zBooleanValue = bool.booleanValue();
        int i = this.f41462Oooo0o.f41409OooOo00;
        boolean z = false;
        if (giftPropModel2 != null) {
            OooOo.OooO0OO("102246", MapsKt.hashMapOf(new Pair("gifted", Integer.valueOf(giftPropModel2.getGiftId()))));
        }
        this.f41462Oooo0o.OooOoo();
        if (zBooleanValue) {
            View view = this.f41462Oooo0o.OooOo00().f50860OooOoo0;
            Intrinsics.checkNotNullExpressionValue(view, "mBinding.vLine");
            oOO00O.OooO00o(view);
            ImageView imageView = this.f41462Oooo0o.OooOo00().f50846OooOOOO;
            Intrinsics.checkNotNullExpressionValue(imageView, "mBinding.ivAllRoom");
            oOO00O.OooO00o(imageView);
            int i2 = OooO00o.$EnumSwitchMapping$0[this.f41462Oooo0o.f41394OooO.ordinal()];
            if (i2 == 1) {
                RoomUserInfoModel roomUserInfoModel = this.f41462Oooo0o.f41406OooOOoo;
                o00000.OooO00o oooO00o = o00000.f41437OooO0o0;
                if (Intrinsics.areEqual(roomUserInfoModel, o00000.f41438OooO0oO)) {
                    this.f41462Oooo0o.OooOooO(o00000.f41439OooO0oo);
                } else if (Intrinsics.areEqual(roomUserInfoModel, o00000.f41439OooO0oo)) {
                    o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
                    if (o00O.OooOO0.f43246OooO0Oo.size() < 2) {
                        this.f41462Oooo0o.OooOooO(o00000.f41436OooO0o);
                    }
                } else {
                    o00O.OooOO0 oooOO2 = o00O.OooOO0.f43243OooO00o;
                    if (o00O.OooOO0.f43246OooO0Oo.size() < 2) {
                        this.f41462Oooo0o.OooOooO(o00000.f41436OooO0o);
                    }
                    if (this.f41462Oooo0o.f41409OooOo00 > 7) {
                    }
                }
                i = 1;
            } else if (i2 == 2 || i2 == 3 || (i2 == 4 && this.f41462Oooo0o.f41409OooOo00 > 7)) {
                i = 1;
            }
        } else {
            if (giftPropModel2 != null && giftPropModel2.isCustomMade()) {
                z = true;
            }
            if (z) {
                this.f41462Oooo0o.OooOo00().f50840OooO0oo.setData(giftPropModel2);
            }
            int i3 = OooO00o.$EnumSwitchMapping$0[this.f41462Oooo0o.f41394OooO.ordinal()];
            if (i3 == 1) {
                o00O.OooOO0 oooOO3 = o00O.OooOO0.f43243OooO00o;
                if (o00O.OooOO0.f43246OooO0Oo.size() < 2) {
                    o000 o000Var = this.f41462Oooo0o;
                    o00000.OooO00o oooO00o2 = o00000.f41437OooO0o0;
                    o000Var.OooOooO(o00000.f41436OooO0o);
                }
                View view2 = this.f41462Oooo0o.OooOo00().f50860OooOoo0;
                Intrinsics.checkNotNullExpressionValue(view2, "mBinding.vLine");
                oOO00O.OooO(view2);
                ImageView imageView2 = this.f41462Oooo0o.OooOo00().f50846OooOOOO;
                Intrinsics.checkNotNullExpressionValue(imageView2, "mBinding.ivAllRoom");
                oOO00O.OooO(imageView2);
            } else if (i3 == 2 || i3 == 3) {
                View view3 = this.f41462Oooo0o.OooOo00().f50860OooOoo0;
                Intrinsics.checkNotNullExpressionValue(view3, "mBinding.vLine");
                oOO00O.OooO00o(view3);
                ImageView imageView3 = this.f41462Oooo0o.OooOo00().f50846OooOOOO;
                Intrinsics.checkNotNullExpressionValue(imageView3, "mBinding.ivAllRoom");
                oOO00O.OooO00o(imageView3);
            } else if (i3 == 4) {
                View view4 = this.f41462Oooo0o.OooOo00().f50860OooOoo0;
                Intrinsics.checkNotNullExpressionValue(view4, "mBinding.vLine");
                oOO00O.OooO00o(view4);
                ImageView imageView4 = this.f41462Oooo0o.OooOo00().f50846OooOOOO;
                Intrinsics.checkNotNullExpressionValue(imageView4, "mBinding.ivAllRoom");
                oOO00O.OooO00o(imageView4);
            }
        }
        this.f41462Oooo0o.OooOoo0(i);
        return Unit.INSTANCE;
    }
}
