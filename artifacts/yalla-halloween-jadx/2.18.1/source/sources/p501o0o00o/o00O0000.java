package p501o0o00o;

import android.view.View;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.dialog.giftDialog.GiftCustomMadeWebManager;
import com.yalla.yalla.model.GiftPropModel;
import com.yalla.yalla.model.GiftPropTypeShow;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o00oOoo;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0000 extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000 f41493Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(o000 o000Var) {
        super(1);
        this.f41493Oooo0o = o000Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        GiftPropModel giftPropModel;
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        o000 o000Var = this.f41493Oooo0o;
        if (o000Var.f41409OooOo00 > 0 && (giftPropModel = o000Var.f41410OooOo0O) != null) {
            if (!(giftPropModel.getGiftId() == -1)) {
                RoomUserInfoModel roomUserInfoModel = this.f41493Oooo0o.f41406OooOOoo;
                o00000.OooO00o oooO00o = o00000.f41437OooO0o0;
                if (Intrinsics.areEqual(roomUserInfoModel, o00000.f41436OooO0o)) {
                    o00oOoo.OooO00o(R.string.gift_toast_pp);
                } else {
                    Long value = OooOOO.f41216OooO00o.OooOo().getValue();
                    long userId = this.f41493Oooo0o.f41406OooOOoo.getUserId();
                    if (value != null && value.longValue() == userId) {
                        o00oOoo.OooO00o(R.string.gift_cannot_send_to_yourself);
                    } else {
                        o00 o00Var = new o00(this.f41493Oooo0o);
                        if (o000.OooOOO(this.f41493Oooo0o).f20895OooO0Oo) {
                            GiftCustomMadeWebManager giftCustomMadeWebManagerOooOOO = o000.OooOOO(this.f41493Oooo0o);
                            boolean z = this.f41493Oooo0o.f41394OooO == GiftPropTypeShow.InRoom;
                            o000OO00 sendCallBack = new o000OO00(o00Var);
                            Objects.requireNonNull(giftCustomMadeWebManagerOooOOO);
                            Intrinsics.checkNotNullParameter(sendCallBack, "sendCallBack");
                            if (giftCustomMadeWebManagerOooOOO.f20895OooO0Oo) {
                                giftCustomMadeWebManagerOooOOO.f20898OooO0oO = sendCallBack;
                                giftCustomMadeWebManagerOooOOO.f20899OooO0oo = z;
                                giftCustomMadeWebManagerOooOOO.OooO0O0();
                            }
                        } else {
                            o00Var.invoke();
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
