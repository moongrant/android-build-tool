package oO0OO;

import android.view.View;
import android.widget.ImageView;
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
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O00O extends Lambda implements Function2<GiftPropModel, Boolean, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f58921OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ GiftTopTipsView f58922OooO0o0;

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
    public o000O00O(o00000OO o00000oo2, GiftTopTipsView giftTopTipsView) {
        super(2);
        this.f58921OooO0Oo = o00000oo2;
        this.f58922OooO0o0 = giftTopTipsView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(GiftPropModel giftPropModel, Boolean bool) {
        GiftPropModel giftPropModel2 = giftPropModel;
        boolean zBooleanValue = bool.booleanValue();
        o00000OO o00000oo2 = this.f58921OooO0Oo;
        int i = o00000oo2.f58878OooOOOo;
        boolean z = false;
        if (giftPropModel2 != null) {
            h0.OooO0OO("102246", MapsKt.hashMapOf(new Pair("gifted", Integer.valueOf(giftPropModel2.getGiftId()))));
        }
        o00000OO.OooOOO(o00000oo2);
        GiftPropTypeShow giftPropTypeShow = o00000oo2.f58869OooO;
        if (zBooleanValue) {
            View vLine = o00000oo2.OooOOo0().f44514OooOoO;
            Intrinsics.checkNotNullExpressionValue(vLine, "vLine");
            com.code.android.util.o000O.OooO0O0(vLine);
            ImageView ivAllRoom = o00000oo2.OooOOo0().f44501OooOO0o;
            Intrinsics.checkNotNullExpressionValue(ivAllRoom, "ivAllRoom");
            com.code.android.util.o000O.OooO0O0(ivAllRoom);
            o00000oo2.OooOOOO();
            int i2 = OooO00o.$EnumSwitchMapping$0[giftPropTypeShow.ordinal()];
            if (i2 == 1) {
                RoomUserInfoModel roomUserInfoModel = o00000oo2.f58877OooOOOO;
                if (Intrinsics.areEqual(roomUserInfoModel, Oooo000.f58848OooO0o)) {
                    o00000oo2.OooOoOO(Oooo000.f58850OooO0oO);
                } else if (!Intrinsics.areEqual(roomUserInfoModel, Oooo000.f58850OooO0oO)) {
                    if (com.yalla.yalla.service.room.OooO00o.f24527OooOO0.f48581OooO0OO.size() < 2) {
                        o00000oo2.OooOoOO(Oooo000.f58849OooO0o0);
                    }
                    if (o00000oo2.f58878OooOOOo > 7) {
                    }
                } else if (com.yalla.yalla.service.room.OooO00o.f24527OooOO0.f48581OooO0OO.size() < 2) {
                    o00000oo2.OooOoOO(Oooo000.f58849OooO0o0);
                }
                i = 1;
            } else if (i2 == 2 || i2 == 3 || (i2 == 4 && o00000oo2.f58878OooOOOo > 7)) {
                i = 1;
            }
        } else {
            if (giftPropModel2 != null && giftPropModel2.isCustomMade()) {
                GiftTopTipsView giftTopTipsView = this.f58922OooO0o0;
                GiftCustomMadeTipsView giftCustomMadeView = giftTopTipsView.getGiftCustomMadeView();
                int i3 = GiftCustomMadeTipsView.f30459OooO0oO;
                giftCustomMadeView.setLeftToRight(p596o0oo000O.OooO0o.OooO0o0());
                giftTopTipsView.getGiftCustomMadeView().setData(giftPropModel2);
            }
            int i4 = OooO00o.$EnumSwitchMapping$0[giftPropTypeShow.ordinal()];
            if (i4 == 1) {
                if (com.yalla.yalla.service.room.OooO00o.f24527OooOO0.f48581OooO0OO.size() < 2) {
                    o00000oo2.OooOoOO(Oooo000.f58849OooO0o0);
                }
                GiftPropModel giftPropModel3 = o00000oo2.f58879OooOOo;
                if (giftPropModel3 != null && giftPropModel3.isBackpack()) {
                    z = true;
                }
                if (z) {
                    if (Intrinsics.areEqual(o00000oo2.f58877OooOOOO, Oooo000.f58848OooO0o)) {
                        o00000oo2.OooOoOO(Oooo000.f58850OooO0oO);
                    }
                    if (i == 777) {
                        i = 1;
                    }
                    View vLine2 = o00000oo2.OooOOo0().f44514OooOoO;
                    Intrinsics.checkNotNullExpressionValue(vLine2, "vLine");
                    com.code.android.util.o000O.OooO0O0(vLine2);
                    ImageView ivAllRoom2 = o00000oo2.OooOOo0().f44501OooOO0o;
                    Intrinsics.checkNotNullExpressionValue(ivAllRoom2, "ivAllRoom");
                    com.code.android.util.o000O.OooO0O0(ivAllRoom2);
                } else {
                    View vLine3 = o00000oo2.OooOOo0().f44514OooOoO;
                    Intrinsics.checkNotNullExpressionValue(vLine3, "vLine");
                    com.code.android.util.o000O.OooOOOO(vLine3);
                    ImageView ivAllRoom3 = o00000oo2.OooOOo0().f44501OooOO0o;
                    Intrinsics.checkNotNullExpressionValue(ivAllRoom3, "ivAllRoom");
                    com.code.android.util.o000O.OooOOOO(ivAllRoom3);
                }
            } else if (i4 == 2 || i4 == 3) {
                GiftPropModel giftPropModel4 = o00000oo2.f58879OooOOo;
                if (giftPropModel4 != null && giftPropModel4.isBackpack()) {
                    z = true;
                }
                if (z && i == 777) {
                    i = 1;
                }
                View vLine4 = o00000oo2.OooOOo0().f44514OooOoO;
                Intrinsics.checkNotNullExpressionValue(vLine4, "vLine");
                com.code.android.util.o000O.OooO0O0(vLine4);
                ImageView ivAllRoom4 = o00000oo2.OooOOo0().f44501OooOO0o;
                Intrinsics.checkNotNullExpressionValue(ivAllRoom4, "ivAllRoom");
                com.code.android.util.o000O.OooO0O0(ivAllRoom4);
            } else if (i4 == 4) {
                GiftPropModel giftPropModel5 = o00000oo2.f58879OooOOo;
                if (giftPropModel5 != null && giftPropModel5.isBackpack()) {
                    z = true;
                }
                if (z && i == 777) {
                    i = 1;
                }
                View vLine5 = o00000oo2.OooOOo0().f44514OooOoO;
                Intrinsics.checkNotNullExpressionValue(vLine5, "vLine");
                com.code.android.util.o000O.OooO0O0(vLine5);
                ImageView ivAllRoom5 = o00000oo2.OooOOo0().f44501OooOO0o;
                Intrinsics.checkNotNullExpressionValue(ivAllRoom5, "ivAllRoom");
                com.code.android.util.o000O.OooO0O0(ivAllRoom5);
            }
        }
        o00000oo2.OooOoO(i);
        return Unit.INSTANCE;
    }
}
