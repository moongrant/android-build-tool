package p520o0o0O0oo;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p475o0o000.o000000O;
import p539o0o0OoOO.b3;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class l8 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ x6 f53313OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(x6 x6Var) {
        super(1);
        this.f53313OooO0Oo = x6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        x6 x6Var = this.f53313OooO0Oo;
        GiftPropTypeShow giftPropTypeShow = x6Var.f53374OooO;
        GiftPropTypeShow giftPropTypeShow2 = GiftPropTypeShow.InRoom;
        if (giftPropTypeShow == giftPropTypeShow2) {
            o000000O o000000o2 = OooO00o.f24981OooOO0;
            if (o000000o2.f47414OooO0OO.size() < 2) {
                o000O00O.OooO00o(oO00OOo0.no_user_in_list);
                x6Var.OooOoOO(d6.f53265OooO0o0);
            } else {
                o0OO000.OooO00o("102070");
                x6Var.OooOOo().f58241OooOoO0.setRotationX(180.0f);
                d6 d6Var = (d6) x6Var.f53386OooOOoo.getValue();
                LinearLayout localView = x6Var.OooOOo().f58232OooOOo;
                Intrinsics.checkNotNullExpressionValue(localView, "mBinding.layoutUser");
                j8 j8Var = new j8(x6Var);
                k8 k8Var = new k8(x6Var);
                d6Var.getClass();
                Intrinsics.checkNotNullParameter(localView, "localView");
                if (d6Var.f53269OooO0OO == giftPropTypeShow2) {
                    ArrayList arrayList = d6Var.f53270OooO0Oo;
                    arrayList.clear();
                    SnapshotStateList<Long> snapshotStateList = o000000o2.f47414OooO0OO;
                    int size = snapshotStateList.size();
                    for (int i = 0; i < size; i++) {
                        long jLongValue = snapshotStateList.get(i).longValue();
                        p464o0Oooo.o000000O o000000o3 = p464o0Oooo.o000000O.f46674OooO00o;
                        Long l = (Long) p464o0Oooo.o000000O.OooOOo0().getValue();
                        if (l == null || jLongValue != l.longValue()) {
                            ArrayList arrayList2 = OooO00o.f24973OooO00o;
                            RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0(snapshotStateList.get(i));
                            if (roomUserInfoModelOooO0o0 != null) {
                                arrayList.add(roomUserInfoModelOooO0o0);
                            }
                        }
                    }
                    if (arrayList.size() != 0) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(arrayList);
                        arrayList3.add(0, d6.f53266OooO0oO);
                        int i2 = d6Var.f53268OooO0O0.f53297OooO0o;
                        int i3 = oO00OO0O.item_spinner_user_select;
                        Context context = d6Var.f53267OooO00o;
                        h6 h6Var = new h6(d6Var, context, i3);
                        h6Var.OooOoO0(arrayList3);
                        Unit unit = Unit.INSTANCE;
                        b3 b3Var = new b3(context, i2, h6Var);
                        b3Var.f55470OooO0oo = new i6(k8Var);
                        b3Var.f55469OooO0oO = new j6(j8Var);
                        b3Var.OooO00o(localView);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
