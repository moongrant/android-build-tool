package p511o0o0O;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.code.android.util.o000O00;
import com.yalla.yalla.model.gift.GiftPropTypeShow;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.service.room.OooO00o;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o0000O0;
import p562o0oOo000.o000000;
import p562o0oOo000.oo0o0Oo;
import p587o0oOooOO.f2;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00O extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000OO f51029OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00O(o00000OO o00000oo2) {
        super(1);
        this.f51029OooO0Oo = o00000oo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o00000OO o00000oo2 = this.f51029OooO0Oo;
        GiftPropTypeShow giftPropTypeShow = o00000oo2.f50958OooO;
        GiftPropTypeShow giftPropTypeShow2 = GiftPropTypeShow.InRoom;
        if (giftPropTypeShow == giftPropTypeShow2) {
            o0000O0 o0000o1 = OooO00o.f24519OooOO0;
            if (o0000o1.f48495OooO0OO.size() < 2) {
                o000O00.OooO00o(o000000.no_user_in_list);
                o00000oo2.OooOoOO(Oooo000.f50937OooO0o0);
            } else {
                o0oo0000.OooO00o.OooO0O0("102070");
                o00000oo2.OooOOo0().f44525OooOoO0.setRotationX(180.0f);
                Oooo000 oooo000 = (Oooo000) o00000oo2.f50970OooOOoo.getValue();
                LinearLayout localView = o00000oo2.OooOOo0().f44516OooOOo;
                Intrinsics.checkNotNullExpressionValue(localView, "layoutUser");
                o00O000o o00o000o2 = new o00O000o(o00000oo2);
                o00O00 o00o01 = new o00O00(o00000oo2);
                oooo000.getClass();
                Intrinsics.checkNotNullParameter(localView, "localView");
                if (oooo000.f50941OooO0OO == giftPropTypeShow2) {
                    ArrayList arrayList = oooo000.f50942OooO0Oo;
                    arrayList.clear();
                    SnapshotStateList<Long> snapshotStateList = o0000o1.f48495OooO0OO;
                    int size = snapshotStateList.size();
                    for (int i = 0; i < size; i++) {
                        long jLongValue = snapshotStateList.get(i).longValue();
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        Long l = (Long) o0O00oO0.OooOOo0().getValue();
                        if (l == null || jLongValue != l.longValue()) {
                            ArrayList arrayList2 = OooO00o.f24511OooO00o;
                            RoomUserInfoModel roomUserInfoModelOooO0o0 = OooO00o.OooO0o0(snapshotStateList.get(i));
                            if (roomUserInfoModelOooO0o0 != null) {
                                arrayList.add(roomUserInfoModelOooO0o0);
                            }
                        }
                    }
                    if (arrayList.size() != 0) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(arrayList);
                        arrayList3.add(0, Oooo000.f50938OooO0oO);
                        int i2 = oooo000.f50940OooO0O0.f51046OooO0o;
                        int i3 = oo0o0Oo.item_spinner_user_select;
                        Context context = oooo000.f50939OooO00o;
                        o00O0O o00o0o2 = new o00O0O(oooo000, context, i3);
                        o00o0o2.OooOoO0(arrayList3);
                        Unit unit = Unit.INSTANCE;
                        f2 f2Var = new f2(context, i2, o00o0o2);
                        f2Var.f56798OooO0oo = new o00Oo0(o00o01);
                        f2Var.f56797OooO0oO = new o00Ooo(o00o000o2);
                        f2Var.OooO00o(localView);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
