package p519o0o0O0oO;

import android.view.View;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.service.room.OooO0O0;
import com.yalla.yalla.service.room.RoomLiveService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p041Ooooo0o.o00000;
import p587o0oOooo.o0OO000;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ t1 f52416OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(t1 t1Var) {
        super(1);
        this.f52416OooO0Oo = t1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View setNoDoubleClickListener = view;
        Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
        o0OO000.OooO00o("102240");
        t1 t1Var = this.f52416OooO0Oo;
        int i = t1Var.OooOOOO().f58839OooO0oO.currCost;
        int i2 = t1Var.OooOOOO().f58839OooO0oO.currRange;
        boolean zIsChecked = t1Var.OooOOOO().f58832OooO.isChecked();
        String strValueOf = String.valueOf(t1Var.OooOOOO().f58834OooO0O0.getText());
        boolean zIsChecked2 = t1Var.OooOOOO().f58842OooOO0O.isChecked();
        if (strValueOf.length() > i2) {
            t1Var.OooOOO(true, false);
        } else {
            long jOooO = o0OoOo0.OooO(-1L, strValueOf);
            int i3 = t1Var.f53151OooOO0O;
            int i4 = t1Var.f53152OooOO0o;
            long j = t1Var.f53153OooOOO;
            boolean z = t1Var.f53154OooOOO0;
            StringBuilder sbOooO00o = o00000.OooO00o("房间幸运数字-房主\ncurrCost:'", i3, "', currRange:'", i4, "', currLuckyNumber:'");
            sbOooO00o.append(j);
            sbOooO00o.append("', currSettableFromManage:'");
            sbOooO00o.append(z);
            sbOooO00o.append("'\nnewCost:'");
            sbOooO00o.append(i);
            sbOooO00o.append("', newRange:'");
            sbOooO00o.append(i2);
            sbOooO00o.append("', newLuckyNumberStr:'");
            sbOooO00o.append(strValueOf);
            sbOooO00o.append("', newLuckyNumberSettableFromManage:'");
            sbOooO00o.append(zIsChecked2);
            sbOooO00o.append("', newLuckyNumberSettable:'");
            sbOooO00o.append(zIsChecked);
            sbOooO00o.append("'");
            OooOOO0.OooO0O0(sbOooO00o.toString());
            Integer value = OooO0O0.f24995OoooOOO.OooO00o().f25008OooOO0o.getValue();
            if (value != null && value.intValue() == 1) {
                if (zIsChecked) {
                    if (strValueOf.length() == 0) {
                        t1Var.OooOOO(true, false);
                    }
                } else {
                    jOooO = -1;
                }
                Room.ChangeLuckNumSetRequest.Builder builderNewBuilder = Room.ChangeLuckNumSetRequest.newBuilder();
                builderNewBuilder.setLucknumcost(i);
                builderNewBuilder.setLucknummode(i2);
                builderNewBuilder.setLuckNum(jOooO);
                builderNewBuilder.setIsAdminManage(zIsChecked2);
                RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
                if (roomLiveService != null) {
                    roomLiveService.OooO0oo(10071, builderNewBuilder.build().toByteArray());
                }
                t1Var.OooO0OO();
            } else if (value != null && value.intValue() == 2) {
                if (strValueOf.length() == 0) {
                    t1Var.OooOOO(true, false);
                } else {
                    int i5 = t1Var.f53151OooOO0O;
                    int i6 = t1Var.f53152OooOO0o;
                    boolean z2 = t1Var.f53154OooOOO0;
                    Room.ChangeLuckNumSetRequest.Builder builderNewBuilder2 = Room.ChangeLuckNumSetRequest.newBuilder();
                    builderNewBuilder2.setLucknumcost(i5);
                    builderNewBuilder2.setLucknummode(i6);
                    builderNewBuilder2.setLuckNum(jOooO);
                    builderNewBuilder2.setIsAdminManage(z2);
                    RoomLiveService roomLiveService2 = RoomLiveService.f25058OooOo00;
                    if (roomLiveService2 != null) {
                        roomLiveService2.OooO0oo(10071, builderNewBuilder2.build().toByteArray());
                    }
                    t1Var.OooO0OO();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
