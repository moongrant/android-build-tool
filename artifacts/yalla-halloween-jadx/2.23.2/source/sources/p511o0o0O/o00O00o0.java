package p511o0o0O;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.code.android.util.o0000;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.textView.ViewLocation;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.oo0o0Oo;
import p573o0oOoOO.o0O0o0;
import p587o0oOooOO.f2;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00o0 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51031OooO0Oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GiftPropTypeShow.values().length];
            try {
                iArr[GiftPropTypeShow.InRoom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GiftPropTypeShow.InMomentList.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GiftPropTypeShow.InMomentDetail.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(o00000OO o00000oo2) {
        super(1);
        this.f51031OooO0Oo = o00000oo2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0202  */
    /* JADX WARN: Code duplicated, block: B:103:0x020b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0219  */
    /* JADX WARN: Code duplicated, block: B:107:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0231  */
    /* JADX WARN: Code duplicated, block: B:112:0x023f  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:35:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:56:0x010b  */
    /* JADX WARN: Code duplicated, block: B:58:0x0114  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:63:0x011f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0128  */
    /* JADX WARN: Code duplicated, block: B:66:0x0138  */
    /* JADX WARN: Code duplicated, block: B:70:0x0141  */
    /* JADX WARN: Code duplicated, block: B:72:0x0147  */
    /* JADX WARN: Code duplicated, block: B:73:0x0150 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0152  */
    /* JADX WARN: Code duplicated, block: B:77:0x0160  */
    /* JADX WARN: Code duplicated, block: B:78:0x0170  */
    /* JADX WARN: Code duplicated, block: B:80:0x0176  */
    /* JADX WARN: Code duplicated, block: B:81:0x017f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x0189  */
    /* JADX WARN: Code duplicated, block: B:87:0x0197  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:95:0x01da  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fa  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x005a, please report this as an issue */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        GiftPropModel giftPropModel;
        RoomUserInfoModel roomUserInfoModel;
        ArrayList arrayList;
        int i;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        boolean z;
        boolean z2;
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o00000OO o00000oo2 = this.f51031OooO0Oo;
        RoomUserInfoModel roomUserInfoModel2 = o00000oo2.f50966OooOOOO;
        RoomUserInfoModel roomUserInfoModel3 = Oooo000.f50936OooO0o;
        if (!Intrinsics.areEqual(roomUserInfoModel2, roomUserInfoModel3)) {
            int[] iArr = OooO00o.$EnumSwitchMapping$0;
            GiftPropTypeShow showIn = o00000oo2.f50958OooO;
            int i2 = iArr[showIn.ordinal()];
            boolean z3 = false;
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    GiftPropModel giftPropModel2 = o00000oo2.f50968OooOOo;
                    if (!(giftPropModel2 != null && giftPropModel2.isBlind())) {
                        o0oo0000.OooO00o.OooO0O0("102071");
                        Oooo000 oooo000 = (Oooo000) o00000oo2.f50970OooOOoo.getValue();
                        TextView localView = o00000oo2.OooOOo0().f44508OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(localView, "giftNum");
                        giftPropModel = o00000oo2.f50968OooOOo;
                        roomUserInfoModel = o00000oo2.f50966OooOOOO;
                        oOO00O ooo00o = new oOO00O(o00000oo2);
                        o00O00OO o00o00oo2 = new o00O00OO(o00000oo2);
                        oooo000.getClass();
                        Intrinsics.checkNotNullParameter(localView, "localView");
                        Intrinsics.checkNotNullParameter(showIn, "showIn");
                        arrayList = new ArrayList();
                        i = Oooo000.OooO00o.$EnumSwitchMapping$0[showIn.ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                arrayList.add(1);
                                if (giftPropModel == null && giftPropModel.isBlind()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    arrayList.add(7);
                                } else {
                                    arrayList.add(7);
                                    arrayList.add(17);
                                    if (giftPropModel != null && giftPropModel.isBackpack()) {
                                        z3 = true;
                                    }
                                    if (z3) {
                                        if (!o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                            arrayList.add(77);
                                            arrayList.add(777);
                                        }
                                    } else if (!giftPropModel.isAllSiteGift()) {
                                        arrayList.add(77);
                                    }
                                }
                            } else if (i != 3 || i == 4) {
                                arrayList.add(1);
                                if (giftPropModel == null && giftPropModel.isBlind()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!z2) {
                                    arrayList.add(7);
                                    arrayList.add(17);
                                    if (giftPropModel != null && giftPropModel.isBackpack()) {
                                        z3 = true;
                                    }
                                    if (!z3) {
                                        if (!o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                            arrayList.add(77);
                                            arrayList.add(777);
                                        }
                                    } else if (!giftPropModel.isAllSiteGift()) {
                                        arrayList.add(77);
                                    }
                                }
                            }
                        } else if (Intrinsics.areEqual(roomUserInfoModel, roomUserInfoModel3)) {
                            arrayList.add(1);
                        } else if (Intrinsics.areEqual(roomUserInfoModel, Oooo000.f50938OooO0oO)) {
                            if (o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isBlind()) : null)) {
                                arrayList.add(1);
                            } else {
                                arrayList.add(1);
                                arrayList.add(7);
                                arrayList.add(17);
                            }
                        } else {
                            if (giftPropModel != null) {
                                boolValueOf = Boolean.valueOf(giftPropModel.isBlind());
                            } else {
                                boolValueOf = null;
                            }
                            if (o0OoOo0.OooO00o(boolValueOf)) {
                                arrayList.add(1);
                                arrayList.add(7);
                            } else {
                                arrayList.add(1);
                                arrayList.add(7);
                                arrayList.add(17);
                                if (giftPropModel != null) {
                                    boolValueOf2 = Boolean.valueOf(giftPropModel.isBackpack());
                                } else {
                                    boolValueOf2 = null;
                                }
                                if (o0OoOo0.OooO00o(boolValueOf2)) {
                                    arrayList.add(77);
                                    if (o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                        arrayList.remove((Object) 77);
                                    }
                                } else {
                                    arrayList.add(77);
                                    arrayList.add(777);
                                    if (o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                        arrayList.remove((Object) 77);
                                        arrayList.remove((Object) 777);
                                    }
                                }
                            }
                        }
                        int i3 = oooo000.f50940OooO0O0.f51046OooO0o;
                        int i4 = oo0o0Oo.item_spinner_gift_num;
                        Context context = oooo000.f50939OooO00o;
                        Oooo0 oooo0 = new Oooo0(oooo000, context, i4);
                        oooo0.OooOoO0(arrayList);
                        Unit unit = Unit.INSTANCE;
                        f2 f2Var = new f2(context, i3, oooo0);
                        f2Var.f56798OooO0oo = new o000oOoO(o00o00oo2);
                        f2Var.f56797OooO0oO = new o0OoOo0(ooo00o);
                        f2Var.OooO00o(localView);
                        o0O0o0.OooO00o(o00000oo2.OooOOo0().f44508OooO0oo, o0000.OooO0O0(o00000oo2.f50960OooO0oo.f51049OooO0oo), ViewLocation.end, OooOo00.OooO0o0());
                    }
                } else {
                    o0oo0000.OooO00o.OooO0O0("102071");
                    Oooo000 oooo001 = (Oooo000) o00000oo2.f50970OooOOoo.getValue();
                    TextView localView2 = o00000oo2.OooOOo0().f44508OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(localView2, "giftNum");
                    giftPropModel = o00000oo2.f50968OooOOo;
                    roomUserInfoModel = o00000oo2.f50966OooOOOO;
                    oOO00O ooo00o2 = new oOO00O(o00000oo2);
                    o00O00OO o00o00oo3 = new o00O00OO(o00000oo2);
                    oooo001.getClass();
                    Intrinsics.checkNotNullParameter(localView2, "localView");
                    Intrinsics.checkNotNullParameter(showIn, "showIn");
                    arrayList = new ArrayList();
                    i = Oooo000.OooO00o.$EnumSwitchMapping$0[showIn.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            arrayList.add(1);
                            if (giftPropModel == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (z) {
                                arrayList.add(7);
                            } else {
                                arrayList.add(7);
                                arrayList.add(17);
                                if (giftPropModel != null) {
                                    z3 = true;
                                }
                                if (z3) {
                                    if (!o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                        arrayList.add(77);
                                        arrayList.add(777);
                                    }
                                } else if (!giftPropModel.isAllSiteGift()) {
                                    arrayList.add(77);
                                }
                            }
                        } else if (i != 3) {
                            arrayList.add(1);
                            if (giftPropModel == null) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                arrayList.add(7);
                                arrayList.add(17);
                                if (giftPropModel != null) {
                                    z3 = true;
                                }
                                if (!z3) {
                                    if (!o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                        arrayList.add(77);
                                        arrayList.add(777);
                                    }
                                } else if (!giftPropModel.isAllSiteGift()) {
                                    arrayList.add(77);
                                }
                            }
                        } else {
                            arrayList.add(1);
                            if (giftPropModel == null) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                arrayList.add(7);
                                arrayList.add(17);
                                if (giftPropModel != null) {
                                    z3 = true;
                                }
                                if (!z3) {
                                    if (!o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                        arrayList.add(77);
                                        arrayList.add(777);
                                    }
                                } else if (!giftPropModel.isAllSiteGift()) {
                                    arrayList.add(77);
                                }
                            }
                        }
                    } else if (Intrinsics.areEqual(roomUserInfoModel, roomUserInfoModel3)) {
                        arrayList.add(1);
                    } else if (Intrinsics.areEqual(roomUserInfoModel, Oooo000.f50938OooO0oO)) {
                        if (o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isBlind()) : null)) {
                            arrayList.add(1);
                        } else {
                            arrayList.add(1);
                            arrayList.add(7);
                            arrayList.add(17);
                        }
                    } else {
                        if (giftPropModel != null) {
                            boolValueOf = Boolean.valueOf(giftPropModel.isBlind());
                        } else {
                            boolValueOf = null;
                        }
                        if (o0OoOo0.OooO00o(boolValueOf)) {
                            arrayList.add(1);
                            arrayList.add(7);
                        } else {
                            arrayList.add(1);
                            arrayList.add(7);
                            arrayList.add(17);
                            if (giftPropModel != null) {
                                boolValueOf2 = Boolean.valueOf(giftPropModel.isBackpack());
                            } else {
                                boolValueOf2 = null;
                            }
                            if (o0OoOo0.OooO00o(boolValueOf2)) {
                                arrayList.add(77);
                                if (o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                    arrayList.remove((Object) 77);
                                }
                            } else {
                                arrayList.add(77);
                                arrayList.add(777);
                                if (o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                    arrayList.remove((Object) 77);
                                    arrayList.remove((Object) 777);
                                }
                            }
                        }
                    }
                    int i5 = oooo001.f50940OooO0O0.f51046OooO0o;
                    int i6 = oo0o0Oo.item_spinner_gift_num;
                    Context context2 = oooo001.f50939OooO00o;
                    Oooo0 oooo1 = new Oooo0(oooo001, context2, i6);
                    oooo1.OooOoO0(arrayList);
                    Unit unit2 = Unit.INSTANCE;
                    f2 f2Var2 = new f2(context2, i5, oooo1);
                    f2Var2.f56798OooO0oo = new o000oOoO(o00o00oo3);
                    f2Var2.f56797OooO0oO = new o0OoOo0(ooo00o2);
                    f2Var2.OooO00o(localView2);
                    o0O0o0.OooO00o(o00000oo2.OooOOo0().f44508OooO0oo, o0000.OooO0O0(o00000oo2.f50960OooO0oo.f51049OooO0oo), ViewLocation.end, OooOo00.OooO0o0());
                }
            } else if (Intrinsics.areEqual(o00000oo2.f50966OooOOOO, Oooo000.f50938OooO0oO)) {
                GiftPropModel giftPropModel3 = o00000oo2.f50968OooOOo;
                if (!(giftPropModel3 != null && giftPropModel3.isBlind())) {
                    o0oo0000.OooO00o.OooO0O0("102071");
                    Oooo000 oooo002 = (Oooo000) o00000oo2.f50970OooOOoo.getValue();
                    TextView localView3 = o00000oo2.OooOOo0().f44508OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(localView3, "giftNum");
                    giftPropModel = o00000oo2.f50968OooOOo;
                    roomUserInfoModel = o00000oo2.f50966OooOOOO;
                    oOO00O ooo00o3 = new oOO00O(o00000oo2);
                    o00O00OO o00o00oo4 = new o00O00OO(o00000oo2);
                    oooo002.getClass();
                    Intrinsics.checkNotNullParameter(localView3, "localView");
                    Intrinsics.checkNotNullParameter(showIn, "showIn");
                    arrayList = new ArrayList();
                    i = Oooo000.OooO00o.$EnumSwitchMapping$0[showIn.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            arrayList.add(1);
                            if (giftPropModel == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (z) {
                                arrayList.add(7);
                            } else {
                                arrayList.add(7);
                                arrayList.add(17);
                                if (giftPropModel != null) {
                                    z3 = true;
                                }
                                if (z3) {
                                    if (!o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                        arrayList.add(77);
                                        arrayList.add(777);
                                    }
                                } else if (!giftPropModel.isAllSiteGift()) {
                                    arrayList.add(77);
                                }
                            }
                        } else if (i != 3) {
                            arrayList.add(1);
                            if (giftPropModel == null) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                arrayList.add(7);
                                arrayList.add(17);
                                if (giftPropModel != null) {
                                    z3 = true;
                                }
                                if (!z3) {
                                    if (!o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                        arrayList.add(77);
                                        arrayList.add(777);
                                    }
                                } else if (!giftPropModel.isAllSiteGift()) {
                                    arrayList.add(77);
                                }
                            }
                        } else {
                            arrayList.add(1);
                            if (giftPropModel == null) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                arrayList.add(7);
                                arrayList.add(17);
                                if (giftPropModel != null) {
                                    z3 = true;
                                }
                                if (!z3) {
                                    if (!o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                        arrayList.add(77);
                                        arrayList.add(777);
                                    }
                                } else if (!giftPropModel.isAllSiteGift()) {
                                    arrayList.add(77);
                                }
                            }
                        }
                    } else if (Intrinsics.areEqual(roomUserInfoModel, roomUserInfoModel3)) {
                        arrayList.add(1);
                    } else if (Intrinsics.areEqual(roomUserInfoModel, Oooo000.f50938OooO0oO)) {
                        if (o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isBlind()) : null)) {
                            arrayList.add(1);
                        } else {
                            arrayList.add(1);
                            arrayList.add(7);
                            arrayList.add(17);
                        }
                    } else {
                        if (giftPropModel != null) {
                            boolValueOf = Boolean.valueOf(giftPropModel.isBlind());
                        } else {
                            boolValueOf = null;
                        }
                        if (o0OoOo0.OooO00o(boolValueOf)) {
                            arrayList.add(1);
                            arrayList.add(7);
                        } else {
                            arrayList.add(1);
                            arrayList.add(7);
                            arrayList.add(17);
                            if (giftPropModel != null) {
                                boolValueOf2 = Boolean.valueOf(giftPropModel.isBackpack());
                            } else {
                                boolValueOf2 = null;
                            }
                            if (o0OoOo0.OooO00o(boolValueOf2)) {
                                arrayList.add(77);
                                if (o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                    arrayList.remove((Object) 77);
                                }
                            } else {
                                arrayList.add(77);
                                arrayList.add(777);
                                if (o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                    arrayList.remove((Object) 77);
                                    arrayList.remove((Object) 777);
                                }
                            }
                        }
                    }
                    int i7 = oooo002.f50940OooO0O0.f51046OooO0o;
                    int i8 = oo0o0Oo.item_spinner_gift_num;
                    Context context3 = oooo002.f50939OooO00o;
                    Oooo0 oooo2 = new Oooo0(oooo002, context3, i8);
                    oooo2.OooOoO0(arrayList);
                    Unit unit3 = Unit.INSTANCE;
                    f2 f2Var3 = new f2(context3, i7, oooo2);
                    f2Var3.f56798OooO0oo = new o000oOoO(o00o00oo4);
                    f2Var3.f56797OooO0oO = new o0OoOo0(ooo00o3);
                    f2Var3.OooO00o(localView3);
                    o0O0o0.OooO00o(o00000oo2.OooOOo0().f44508OooO0oo, o0000.OooO0O0(o00000oo2.f50960OooO0oo.f51049OooO0oo), ViewLocation.end, OooOo00.OooO0o0());
                }
            } else {
                o0oo0000.OooO00o.OooO0O0("102071");
                Oooo000 oooo003 = (Oooo000) o00000oo2.f50970OooOOoo.getValue();
                TextView localView4 = o00000oo2.OooOOo0().f44508OooO0oo;
                Intrinsics.checkNotNullExpressionValue(localView4, "giftNum");
                giftPropModel = o00000oo2.f50968OooOOo;
                roomUserInfoModel = o00000oo2.f50966OooOOOO;
                oOO00O ooo00o4 = new oOO00O(o00000oo2);
                o00O00OO o00o00oo5 = new o00O00OO(o00000oo2);
                oooo003.getClass();
                Intrinsics.checkNotNullParameter(localView4, "localView");
                Intrinsics.checkNotNullParameter(showIn, "showIn");
                arrayList = new ArrayList();
                i = Oooo000.OooO00o.$EnumSwitchMapping$0[showIn.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        arrayList.add(1);
                        if (giftPropModel == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(7);
                        } else {
                            arrayList.add(7);
                            arrayList.add(17);
                            if (giftPropModel != null) {
                                z3 = true;
                            }
                            if (z3) {
                                if (!o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                    arrayList.add(77);
                                    arrayList.add(777);
                                }
                            } else if (!giftPropModel.isAllSiteGift()) {
                                arrayList.add(77);
                            }
                        }
                    } else if (i != 3) {
                        arrayList.add(1);
                        if (giftPropModel == null) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            arrayList.add(7);
                            arrayList.add(17);
                            if (giftPropModel != null) {
                                z3 = true;
                            }
                            if (!z3) {
                                if (!o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                    arrayList.add(77);
                                    arrayList.add(777);
                                }
                            } else if (!giftPropModel.isAllSiteGift()) {
                                arrayList.add(77);
                            }
                        }
                    } else {
                        arrayList.add(1);
                        if (giftPropModel == null) {
                            z2 = false;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            arrayList.add(7);
                            arrayList.add(17);
                            if (giftPropModel != null) {
                                z3 = true;
                            }
                            if (!z3) {
                                if (!o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                    arrayList.add(77);
                                    arrayList.add(777);
                                }
                            } else if (!giftPropModel.isAllSiteGift()) {
                                arrayList.add(77);
                            }
                        }
                    }
                } else if (Intrinsics.areEqual(roomUserInfoModel, roomUserInfoModel3)) {
                    arrayList.add(1);
                } else if (Intrinsics.areEqual(roomUserInfoModel, Oooo000.f50938OooO0oO)) {
                    if (o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isBlind()) : null)) {
                        arrayList.add(1);
                    } else {
                        arrayList.add(1);
                        arrayList.add(7);
                        arrayList.add(17);
                    }
                } else {
                    if (giftPropModel != null) {
                        boolValueOf = Boolean.valueOf(giftPropModel.isBlind());
                    } else {
                        boolValueOf = null;
                    }
                    if (o0OoOo0.OooO00o(boolValueOf)) {
                        arrayList.add(1);
                        arrayList.add(7);
                    } else {
                        arrayList.add(1);
                        arrayList.add(7);
                        arrayList.add(17);
                        if (giftPropModel != null) {
                            boolValueOf2 = Boolean.valueOf(giftPropModel.isBackpack());
                        } else {
                            boolValueOf2 = null;
                        }
                        if (o0OoOo0.OooO00o(boolValueOf2)) {
                            arrayList.add(77);
                            if (o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                arrayList.remove((Object) 77);
                            }
                        } else {
                            arrayList.add(77);
                            arrayList.add(777);
                            if (o0OoOo0.OooO00o(giftPropModel != null ? Boolean.valueOf(giftPropModel.isAllSiteGift()) : null)) {
                                arrayList.remove((Object) 77);
                                arrayList.remove((Object) 777);
                            }
                        }
                    }
                }
                int i9 = oooo003.f50940OooO0O0.f51046OooO0o;
                int i10 = oo0o0Oo.item_spinner_gift_num;
                Context context4 = oooo003.f50939OooO00o;
                Oooo0 oooo3 = new Oooo0(oooo003, context4, i10);
                oooo3.OooOoO0(arrayList);
                Unit unit4 = Unit.INSTANCE;
                f2 f2Var4 = new f2(context4, i9, oooo3);
                f2Var4.f56798OooO0oo = new o000oOoO(o00o00oo5);
                f2Var4.f56797OooO0oO = new o0OoOo0(ooo00o4);
                f2Var4.OooO00o(localView4);
                o0O0o0.OooO00o(o00000oo2.OooOOo0().f44508OooO0oo, o0000.OooO0O0(o00000oo2.f50960OooO0oo.f51049OooO0oo), ViewLocation.end, OooOo00.OooO0o0());
            }
        }
        return Unit.INSTANCE;
    }
}
