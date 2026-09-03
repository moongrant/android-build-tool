package p520o0o0O0oo;

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
import p539o0o0OoOO.b3;
import p576o0oOoOo0.oO000Oo;
import p584o0oOooO0.oO00OO0O;
import p587o0oOooo.o0OO000;
import p591o0oo000O.OooO;

/* JADX INFO: loaded from: classes4.dex */
public final class o8 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53322OooO0Oo;

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
    public o8(x6 x6Var) {
        super(1);
        this.f53322OooO0Oo = x6Var;
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
        x6 x6Var = this.f53322OooO0Oo;
        RoomUserInfoModel roomUserInfoModel2 = x6Var.f53382OooOOOO;
        RoomUserInfoModel roomUserInfoModel3 = d6.f53264OooO0o;
        if (!Intrinsics.areEqual(roomUserInfoModel2, roomUserInfoModel3)) {
            int[] iArr = OooO00o.$EnumSwitchMapping$0;
            GiftPropTypeShow showIn = x6Var.f53374OooO;
            int i2 = iArr[showIn.ordinal()];
            boolean z3 = false;
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    GiftPropModel giftPropModel2 = x6Var.f53384OooOOo;
                    if (!(giftPropModel2 != null && giftPropModel2.isBlind())) {
                        o0OO000.OooO00o("102071");
                        d6 d6Var = (d6) x6Var.f53386OooOOoo.getValue();
                        TextView localView = x6Var.OooOOo().f58224OooO0oo;
                        Intrinsics.checkNotNullExpressionValue(localView, "mBinding.giftNum");
                        giftPropModel = x6Var.f53384OooOOo;
                        roomUserInfoModel = x6Var.f53382OooOOOO;
                        m8 m8Var = new m8(x6Var);
                        n8 n8Var = new n8(x6Var);
                        d6Var.getClass();
                        Intrinsics.checkNotNullParameter(localView, "localView");
                        Intrinsics.checkNotNullParameter(showIn, "showIn");
                        arrayList = new ArrayList();
                        i = d6.OooO00o.$EnumSwitchMapping$0[showIn.ordinal()];
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
                        } else if (Intrinsics.areEqual(roomUserInfoModel, d6.f53266OooO0oO)) {
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
                        int i3 = d6Var.f53268OooO0O0.f53297OooO0o;
                        int i4 = oO00OO0O.item_spinner_gift_num;
                        Context context = d6Var.f53267OooO00o;
                        e6 e6Var = new e6(d6Var, context, i4);
                        e6Var.OooOoO0(arrayList);
                        Unit unit = Unit.INSTANCE;
                        b3 b3Var = new b3(context, i3, e6Var);
                        b3Var.f55470OooO0oo = new f6(n8Var);
                        b3Var.f55469OooO0oO = new g6(m8Var);
                        b3Var.OooO00o(localView);
                        oO000Oo.OooO00o(x6Var.OooOOo().f58224OooO0oo, o0000.OooO0O0(x6Var.f53376OooO0oo.f53300OooO0oo), ViewLocation.end, OooO.OooO0o0());
                    }
                } else {
                    o0OO000.OooO00o("102071");
                    d6 d6Var2 = (d6) x6Var.f53386OooOOoo.getValue();
                    TextView localView2 = x6Var.OooOOo().f58224OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(localView2, "mBinding.giftNum");
                    giftPropModel = x6Var.f53384OooOOo;
                    roomUserInfoModel = x6Var.f53382OooOOOO;
                    m8 m8Var2 = new m8(x6Var);
                    n8 n8Var2 = new n8(x6Var);
                    d6Var2.getClass();
                    Intrinsics.checkNotNullParameter(localView2, "localView");
                    Intrinsics.checkNotNullParameter(showIn, "showIn");
                    arrayList = new ArrayList();
                    i = d6.OooO00o.$EnumSwitchMapping$0[showIn.ordinal()];
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
                    } else if (Intrinsics.areEqual(roomUserInfoModel, d6.f53266OooO0oO)) {
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
                    int i5 = d6Var2.f53268OooO0O0.f53297OooO0o;
                    int i6 = oO00OO0O.item_spinner_gift_num;
                    Context context2 = d6Var2.f53267OooO00o;
                    e6 e6Var2 = new e6(d6Var2, context2, i6);
                    e6Var2.OooOoO0(arrayList);
                    Unit unit2 = Unit.INSTANCE;
                    b3 b3Var2 = new b3(context2, i5, e6Var2);
                    b3Var2.f55470OooO0oo = new f6(n8Var2);
                    b3Var2.f55469OooO0oO = new g6(m8Var2);
                    b3Var2.OooO00o(localView2);
                    oO000Oo.OooO00o(x6Var.OooOOo().f58224OooO0oo, o0000.OooO0O0(x6Var.f53376OooO0oo.f53300OooO0oo), ViewLocation.end, OooO.OooO0o0());
                }
            } else if (Intrinsics.areEqual(x6Var.f53382OooOOOO, d6.f53266OooO0oO)) {
                GiftPropModel giftPropModel3 = x6Var.f53384OooOOo;
                if (!(giftPropModel3 != null && giftPropModel3.isBlind())) {
                    o0OO000.OooO00o("102071");
                    d6 d6Var3 = (d6) x6Var.f53386OooOOoo.getValue();
                    TextView localView3 = x6Var.OooOOo().f58224OooO0oo;
                    Intrinsics.checkNotNullExpressionValue(localView3, "mBinding.giftNum");
                    giftPropModel = x6Var.f53384OooOOo;
                    roomUserInfoModel = x6Var.f53382OooOOOO;
                    m8 m8Var3 = new m8(x6Var);
                    n8 n8Var3 = new n8(x6Var);
                    d6Var3.getClass();
                    Intrinsics.checkNotNullParameter(localView3, "localView");
                    Intrinsics.checkNotNullParameter(showIn, "showIn");
                    arrayList = new ArrayList();
                    i = d6.OooO00o.$EnumSwitchMapping$0[showIn.ordinal()];
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
                    } else if (Intrinsics.areEqual(roomUserInfoModel, d6.f53266OooO0oO)) {
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
                    int i7 = d6Var3.f53268OooO0O0.f53297OooO0o;
                    int i8 = oO00OO0O.item_spinner_gift_num;
                    Context context3 = d6Var3.f53267OooO00o;
                    e6 e6Var3 = new e6(d6Var3, context3, i8);
                    e6Var3.OooOoO0(arrayList);
                    Unit unit3 = Unit.INSTANCE;
                    b3 b3Var3 = new b3(context3, i7, e6Var3);
                    b3Var3.f55470OooO0oo = new f6(n8Var3);
                    b3Var3.f55469OooO0oO = new g6(m8Var3);
                    b3Var3.OooO00o(localView3);
                    oO000Oo.OooO00o(x6Var.OooOOo().f58224OooO0oo, o0000.OooO0O0(x6Var.f53376OooO0oo.f53300OooO0oo), ViewLocation.end, OooO.OooO0o0());
                }
            } else {
                o0OO000.OooO00o("102071");
                d6 d6Var4 = (d6) x6Var.f53386OooOOoo.getValue();
                TextView localView4 = x6Var.OooOOo().f58224OooO0oo;
                Intrinsics.checkNotNullExpressionValue(localView4, "mBinding.giftNum");
                giftPropModel = x6Var.f53384OooOOo;
                roomUserInfoModel = x6Var.f53382OooOOOO;
                m8 m8Var4 = new m8(x6Var);
                n8 n8Var4 = new n8(x6Var);
                d6Var4.getClass();
                Intrinsics.checkNotNullParameter(localView4, "localView");
                Intrinsics.checkNotNullParameter(showIn, "showIn");
                arrayList = new ArrayList();
                i = d6.OooO00o.$EnumSwitchMapping$0[showIn.ordinal()];
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
                } else if (Intrinsics.areEqual(roomUserInfoModel, d6.f53266OooO0oO)) {
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
                int i9 = d6Var4.f53268OooO0O0.f53297OooO0o;
                int i10 = oO00OO0O.item_spinner_gift_num;
                Context context4 = d6Var4.f53267OooO00o;
                e6 e6Var4 = new e6(d6Var4, context4, i10);
                e6Var4.OooOoO0(arrayList);
                Unit unit4 = Unit.INSTANCE;
                b3 b3Var4 = new b3(context4, i9, e6Var4);
                b3Var4.f55470OooO0oo = new f6(n8Var4);
                b3Var4.f55469OooO0oO = new g6(m8Var4);
                b3Var4.OooO00o(localView4);
                oO000Oo.OooO00o(x6Var.OooOOo().f58224OooO0oo, o0000.OooO0O0(x6Var.f53376OooO0oo.f53300OooO0oo), ViewLocation.end, OooO.OooO0o0());
            }
        }
        return Unit.INSTANCE;
    }
}
