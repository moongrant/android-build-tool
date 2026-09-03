package p503o0o00o;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.app.base.framework.view.textView.ViewLocation;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p153o00Oo0o0.o00Oo00;
import p169o00Ooo0.oo000o;
import p393o0OOooOo.o0O00000;
import p510o0o00oOo.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00OO000 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000O000 f41524Oooo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GiftPropTypeShow.values().length];
            iArr[GiftPropTypeShow.InRoom.ordinal()] = 1;
            iArr[GiftPropTypeShow.InMomentList.ordinal()] = 2;
            iArr[GiftPropTypeShow.InMomentDetail.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO000(o000O000 o000o001) {
        super(1);
        this.f41524Oooo = o000o001;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:53:0x010d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0116  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:61:0x0144  */
    /* JADX WARN: Code duplicated, block: B:63:0x014c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0167  */
    /* JADX WARN: Code duplicated, block: B:74:0x0177  */
    /* JADX WARN: Code duplicated, block: B:79:0x0192  */
    /* JADX WARN: Code duplicated, block: B:81:0x0197  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b8  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        GiftPropModel giftPropModel;
        RoomUserInfoModel roomUserInfoModel;
        ArrayList arrayList;
        int i;
        RoomUserInfoModel roomUserInfoModel2;
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        int i2 = OooO00o.$EnumSwitchMapping$0[this.f41524Oooo.f41453OooO.ordinal()];
        boolean z = false;
        if (i2 == 1) {
            RoomUserInfoModel roomUserInfoModel3 = this.f41524Oooo.f41465OooOOoo;
            o00000O0.OooO00o oooO00o = o00000O0.f41431OooO0o0;
            if (Intrinsics.areEqual(roomUserInfoModel3, o00000O0.f41433OooO0oo) || Intrinsics.areEqual(this.f41524Oooo.f41465OooOOoo, o00000O0.f41432OooO0oO)) {
                GiftPropModel giftPropModel2 = this.f41524Oooo.f41469OooOo0O;
                if (!(giftPropModel2 != null && giftPropModel2.isBlind())) {
                    o0O00000.OooO0OO("InRoom_gift_number");
                    o00000O0 o00000o1 = (o00000O0) this.f41524Oooo.f41462OooOOOo.getValue();
                    TextView localView = this.f41524Oooo.OooOo00().f50778OooOO0;
                    Intrinsics.checkNotNullExpressionValue(localView, "mBinding.giftNum");
                    o000O000 o000o001 = this.f41524Oooo;
                    giftPropModel = o000o001.f41469OooOo0O;
                    roomUserInfoModel = o000o001.f41465OooOOoo;
                    GiftPropTypeShow showIn = o000o001.f41453OooO;
                    oo0oOO0 oo0ooo0 = new oo0oOO0(o000o001);
                    o00O o00o2 = new o00O(this.f41524Oooo);
                    Objects.requireNonNull(o00000o1);
                    Intrinsics.checkNotNullParameter(localView, "localView");
                    Intrinsics.checkNotNullParameter(showIn, "showIn");
                    arrayList = new ArrayList();
                    i = o00000O0.OooO0O0.$EnumSwitchMapping$0[showIn.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            arrayList.add(1);
                            if (giftPropModel != null) {
                                z = true;
                            }
                            if (z) {
                                arrayList.add(7);
                            } else {
                                arrayList.add(7);
                                arrayList.add(17);
                                if (giftPropModel != null) {
                                    arrayList.add(77);
                                    arrayList.add(777);
                                }
                            }
                        } else if (i != 3) {
                            arrayList.add(1);
                            if (giftPropModel != null) {
                                z = true;
                            }
                            if (!z) {
                                arrayList.add(7);
                                arrayList.add(17);
                                if (giftPropModel != null) {
                                    arrayList.add(77);
                                    arrayList.add(777);
                                }
                            }
                        } else {
                            arrayList.add(1);
                            if (giftPropModel != null) {
                                z = true;
                            }
                            if (!z) {
                                arrayList.add(7);
                                arrayList.add(17);
                                if (giftPropModel != null) {
                                    arrayList.add(77);
                                    arrayList.add(777);
                                }
                            }
                        }
                    } else if (Intrinsics.areEqual(roomUserInfoModel, o00000O0.f41432OooO0oO)) {
                        arrayList.add(1);
                    } else {
                        roomUserInfoModel2 = o00000O0.f41433OooO0oo;
                        if (Intrinsics.areEqual(roomUserInfoModel, roomUserInfoModel2)) {
                            arrayList.add(1);
                            if (giftPropModel != null) {
                                z = true;
                            }
                            if (!z) {
                                arrayList.add(7);
                                arrayList.add(17);
                                if (giftPropModel != null) {
                                    arrayList.add(77);
                                    arrayList.add(777);
                                }
                            }
                        } else {
                            arrayList.add(1);
                            if (giftPropModel != null) {
                                z = true;
                            }
                            if (z) {
                                arrayList.add(7);
                            } else {
                                arrayList.add(7);
                                arrayList.add(17);
                                if (giftPropModel != null) {
                                    arrayList.add(77);
                                    arrayList.add(777);
                                }
                            }
                        }
                    }
                    Context context = o00000o1.f41434OooO00o;
                    Objects.requireNonNull(o00000o1.f41435OooO0O0);
                    o00000O o00000o = new o00000O(o00000o1, o00000o1.f41434OooO00o);
                    o00000o.setNewData(arrayList);
                    Unit unit = Unit.INSTANCE;
                    o00O0000 o00o0001 = new o00O0000(context, o00000o);
                    o00o0001.f41904OooO0oo = new o00000OO(o00o2);
                    o00o0001.f41903OooO0oO = new o0000Ooo(oo0ooo0);
                    o00o0001.OooO00o(localView);
                    TextView textView = this.f41524Oooo.OooOo00().f50778OooOO0;
                    Objects.requireNonNull(this.f41524Oooo.f41455OooO0oo);
                    o00Oo00.OooO00o(textView, OooOOO.OooO0O0(R.drawable.icon_room_gift_bottom_white), ViewLocation.end, oo000o.OooO0o0());
                }
            } else {
                o0O00000.OooO0OO("InRoom_gift_number");
                o00000O0 o00000o2 = (o00000O0) this.f41524Oooo.f41462OooOOOo.getValue();
                TextView localView2 = this.f41524Oooo.OooOo00().f50778OooOO0;
                Intrinsics.checkNotNullExpressionValue(localView2, "mBinding.giftNum");
                o000O000 o000o002 = this.f41524Oooo;
                giftPropModel = o000o002.f41469OooOo0O;
                roomUserInfoModel = o000o002.f41465OooOOoo;
                GiftPropTypeShow showIn2 = o000o002.f41453OooO;
                oo0oOO0 oo0ooo1 = new oo0oOO0(o000o002);
                o00O o00o3 = new o00O(this.f41524Oooo);
                Objects.requireNonNull(o00000o2);
                Intrinsics.checkNotNullParameter(localView2, "localView");
                Intrinsics.checkNotNullParameter(showIn2, "showIn");
                arrayList = new ArrayList();
                i = o00000O0.OooO0O0.$EnumSwitchMapping$0[showIn2.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        arrayList.add(1);
                        if (giftPropModel != null) {
                            z = true;
                        }
                        if (z) {
                            arrayList.add(7);
                        } else {
                            arrayList.add(7);
                            arrayList.add(17);
                            if (giftPropModel != null) {
                                arrayList.add(77);
                                arrayList.add(777);
                            }
                        }
                    } else if (i != 3) {
                        arrayList.add(1);
                        if (giftPropModel != null) {
                            z = true;
                        }
                        if (!z) {
                            arrayList.add(7);
                            arrayList.add(17);
                            if (giftPropModel != null) {
                                arrayList.add(77);
                                arrayList.add(777);
                            }
                        }
                    } else {
                        arrayList.add(1);
                        if (giftPropModel != null) {
                            z = true;
                        }
                        if (!z) {
                            arrayList.add(7);
                            arrayList.add(17);
                            if (giftPropModel != null) {
                                arrayList.add(77);
                                arrayList.add(777);
                            }
                        }
                    }
                } else if (Intrinsics.areEqual(roomUserInfoModel, o00000O0.f41432OooO0oO)) {
                    arrayList.add(1);
                } else {
                    roomUserInfoModel2 = o00000O0.f41433OooO0oo;
                    if (Intrinsics.areEqual(roomUserInfoModel, roomUserInfoModel2)) {
                        arrayList.add(1);
                        if (giftPropModel != null) {
                            z = true;
                        }
                        if (!z) {
                            arrayList.add(7);
                            arrayList.add(17);
                            if (giftPropModel != null) {
                                arrayList.add(77);
                                arrayList.add(777);
                            }
                        }
                    } else {
                        arrayList.add(1);
                        if (giftPropModel != null) {
                            z = true;
                        }
                        if (z) {
                            arrayList.add(7);
                        } else {
                            arrayList.add(7);
                            arrayList.add(17);
                            if (giftPropModel != null) {
                                arrayList.add(77);
                                arrayList.add(777);
                            }
                        }
                    }
                }
                Context context2 = o00000o2.f41434OooO00o;
                Objects.requireNonNull(o00000o2.f41435OooO0O0);
                o00000O o00000o3 = new o00000O(o00000o2, o00000o2.f41434OooO00o);
                o00000o3.setNewData(arrayList);
                Unit unit2 = Unit.INSTANCE;
                o00O0000 o00o0002 = new o00O0000(context2, o00000o3);
                o00o0002.f41904OooO0oo = new o00000OO(o00o3);
                o00o0002.f41903OooO0oO = new o0000Ooo(oo0ooo1);
                o00o0002.OooO00o(localView2);
                TextView textView2 = this.f41524Oooo.OooOo00().f50778OooOO0;
                Objects.requireNonNull(this.f41524Oooo.f41455OooO0oo);
                o00Oo00.OooO00o(textView2, OooOOO.OooO0O0(R.drawable.icon_room_gift_bottom_white), ViewLocation.end, oo000o.OooO0o0());
            }
        } else if (i2 == 2 || i2 == 3) {
            GiftPropModel giftPropModel3 = this.f41524Oooo.f41469OooOo0O;
            if (!(giftPropModel3 != null && giftPropModel3.isBlind())) {
                o0O00000.OooO0OO("InRoom_gift_number");
                o00000O0 o00000o4 = (o00000O0) this.f41524Oooo.f41462OooOOOo.getValue();
                TextView localView3 = this.f41524Oooo.OooOo00().f50778OooOO0;
                Intrinsics.checkNotNullExpressionValue(localView3, "mBinding.giftNum");
                o000O000 o000o003 = this.f41524Oooo;
                giftPropModel = o000o003.f41469OooOo0O;
                roomUserInfoModel = o000o003.f41465OooOOoo;
                GiftPropTypeShow showIn3 = o000o003.f41453OooO;
                oo0oOO0 oo0ooo2 = new oo0oOO0(o000o003);
                o00O o00o4 = new o00O(this.f41524Oooo);
                Objects.requireNonNull(o00000o4);
                Intrinsics.checkNotNullParameter(localView3, "localView");
                Intrinsics.checkNotNullParameter(showIn3, "showIn");
                arrayList = new ArrayList();
                i = o00000O0.OooO0O0.$EnumSwitchMapping$0[showIn3.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        arrayList.add(1);
                        if (giftPropModel != null && giftPropModel.isBlind()) {
                            z = true;
                        }
                        if (z) {
                            arrayList.add(7);
                        } else {
                            arrayList.add(7);
                            arrayList.add(17);
                            if (giftPropModel != null && !giftPropModel.isAllSiteGift() && !Intrinsics.areEqual(roomUserInfoModel, o00000O0.f41433OooO0oo)) {
                                arrayList.add(77);
                                arrayList.add(777);
                            }
                        }
                    } else if (i != 3 || i == 4) {
                        arrayList.add(1);
                        if (giftPropModel != null && giftPropModel.isBlind()) {
                            z = true;
                        }
                        if (!z) {
                            arrayList.add(7);
                            arrayList.add(17);
                            if (giftPropModel != null && !giftPropModel.isAllSiteGift() && !Intrinsics.areEqual(roomUserInfoModel, o00000O0.f41433OooO0oo)) {
                                arrayList.add(77);
                                arrayList.add(777);
                            }
                        }
                    }
                } else if (Intrinsics.areEqual(roomUserInfoModel, o00000O0.f41432OooO0oO)) {
                    arrayList.add(1);
                } else {
                    roomUserInfoModel2 = o00000O0.f41433OooO0oo;
                    if (Intrinsics.areEqual(roomUserInfoModel, roomUserInfoModel2)) {
                        arrayList.add(1);
                        if (giftPropModel != null && giftPropModel.isBlind()) {
                            z = true;
                        }
                        if (!z) {
                            arrayList.add(7);
                            arrayList.add(17);
                            if (giftPropModel != null && !giftPropModel.isAllSiteGift() && !Intrinsics.areEqual(roomUserInfoModel, roomUserInfoModel2)) {
                                arrayList.add(77);
                                arrayList.add(777);
                            }
                        }
                    } else {
                        arrayList.add(1);
                        if (giftPropModel != null && giftPropModel.isBlind()) {
                            z = true;
                        }
                        if (z) {
                            arrayList.add(7);
                        } else {
                            arrayList.add(7);
                            arrayList.add(17);
                            if (giftPropModel != null && !giftPropModel.isAllSiteGift() && !Intrinsics.areEqual(roomUserInfoModel, roomUserInfoModel2)) {
                                arrayList.add(77);
                                arrayList.add(777);
                            }
                        }
                    }
                }
                Context context3 = o00000o4.f41434OooO00o;
                Objects.requireNonNull(o00000o4.f41435OooO0O0);
                o00000O o00000o5 = new o00000O(o00000o4, o00000o4.f41434OooO00o);
                o00000o5.setNewData(arrayList);
                Unit unit3 = Unit.INSTANCE;
                o00O0000 o00o0003 = new o00O0000(context3, o00000o5);
                o00o0003.f41904OooO0oo = new o00000OO(o00o4);
                o00o0003.f41903OooO0oO = new o0000Ooo(oo0ooo2);
                o00o0003.OooO00o(localView3);
                TextView textView3 = this.f41524Oooo.OooOo00().f50778OooOO0;
                Objects.requireNonNull(this.f41524Oooo.f41455OooO0oo);
                o00Oo00.OooO00o(textView3, OooOOO.OooO0O0(R.drawable.icon_room_gift_bottom_white), ViewLocation.end, oo000o.OooO0o0());
            }
        } else {
            o0O00000.OooO0OO("InRoom_gift_number");
            o00000O0 o00000o6 = (o00000O0) this.f41524Oooo.f41462OooOOOo.getValue();
            TextView localView4 = this.f41524Oooo.OooOo00().f50778OooOO0;
            Intrinsics.checkNotNullExpressionValue(localView4, "mBinding.giftNum");
            o000O000 o000o004 = this.f41524Oooo;
            giftPropModel = o000o004.f41469OooOo0O;
            roomUserInfoModel = o000o004.f41465OooOOoo;
            GiftPropTypeShow showIn4 = o000o004.f41453OooO;
            oo0oOO0 oo0ooo3 = new oo0oOO0(o000o004);
            o00O o00o5 = new o00O(this.f41524Oooo);
            Objects.requireNonNull(o00000o6);
            Intrinsics.checkNotNullParameter(localView4, "localView");
            Intrinsics.checkNotNullParameter(showIn4, "showIn");
            arrayList = new ArrayList();
            i = o00000O0.OooO0O0.$EnumSwitchMapping$0[showIn4.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    arrayList.add(1);
                    if (giftPropModel != null) {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(7);
                    } else {
                        arrayList.add(7);
                        arrayList.add(17);
                        if (giftPropModel != null) {
                            arrayList.add(77);
                            arrayList.add(777);
                        }
                    }
                } else if (i != 3) {
                    arrayList.add(1);
                    if (giftPropModel != null) {
                        z = true;
                    }
                    if (!z) {
                        arrayList.add(7);
                        arrayList.add(17);
                        if (giftPropModel != null) {
                            arrayList.add(77);
                            arrayList.add(777);
                        }
                    }
                } else {
                    arrayList.add(1);
                    if (giftPropModel != null) {
                        z = true;
                    }
                    if (!z) {
                        arrayList.add(7);
                        arrayList.add(17);
                        if (giftPropModel != null) {
                            arrayList.add(77);
                            arrayList.add(777);
                        }
                    }
                }
            } else if (Intrinsics.areEqual(roomUserInfoModel, o00000O0.f41432OooO0oO)) {
                arrayList.add(1);
            } else {
                roomUserInfoModel2 = o00000O0.f41433OooO0oo;
                if (Intrinsics.areEqual(roomUserInfoModel, roomUserInfoModel2)) {
                    arrayList.add(1);
                    if (giftPropModel != null) {
                        z = true;
                    }
                    if (!z) {
                        arrayList.add(7);
                        arrayList.add(17);
                        if (giftPropModel != null) {
                            arrayList.add(77);
                            arrayList.add(777);
                        }
                    }
                } else {
                    arrayList.add(1);
                    if (giftPropModel != null) {
                        z = true;
                    }
                    if (z) {
                        arrayList.add(7);
                    } else {
                        arrayList.add(7);
                        arrayList.add(17);
                        if (giftPropModel != null) {
                            arrayList.add(77);
                            arrayList.add(777);
                        }
                    }
                }
            }
            Context context4 = o00000o6.f41434OooO00o;
            Objects.requireNonNull(o00000o6.f41435OooO0O0);
            o00000O o00000o7 = new o00000O(o00000o6, o00000o6.f41434OooO00o);
            o00000o7.setNewData(arrayList);
            Unit unit4 = Unit.INSTANCE;
            o00O0000 o00o0004 = new o00O0000(context4, o00000o7);
            o00o0004.f41904OooO0oo = new o00000OO(o00o5);
            o00o0004.f41903OooO0oO = new o0000Ooo(oo0ooo3);
            o00o0004.OooO00o(localView4);
            TextView textView4 = this.f41524Oooo.OooOo00().f50778OooOO0;
            Objects.requireNonNull(this.f41524Oooo.f41455OooO0oo);
            o00Oo00.OooO00o(textView4, OooOOO.OooO0O0(R.drawable.icon_room_gift_bottom_white), ViewLocation.end, oo000o.OooO0o0());
        }
        return Unit.INSTANCE;
    }
}
