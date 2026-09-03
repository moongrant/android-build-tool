package p536o0o0OOoo;

import OooO00o.OooO00o;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p142o00OOooO.o000OO00;
import p142o00OOooO.o000OOo0;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p499o0o00OoO.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 extends Lambda implements Function1<Boolean, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43747Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(PrivateChatActivity privateChatActivity) {
        super(1);
        this.f43747Oooo0o = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        if (this.f43747Oooo0o.f22168OoooOoO && zBooleanValue) {
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            o0OO00O o0oo00oOooO0o0 = OooOOO0.OooO0o0();
            StringBuilder sbOooO00o = o000OO00.OooO00o(o0oo00oOooO0o0, "hideToYallaChat4CompleteYallaChat");
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            sbOooO00o.append(oooOOO.OooOo().getValue());
            if (o0oo00oOooO0o0.OooO00o(sbOooO00o.toString(), false)) {
                this.f43747Oooo0o.Oooo00o().f49100OooOO0.setVisibility(8);
            } else {
                this.f43747Oooo0o.Oooo00o().f49100OooOO0.setVisibility(0);
                o0OO00O o0oo00oOooO0o1 = OooOOO0.OooO0o0();
                Objects.requireNonNull(o0oo00oOooO0o1);
                o000OOo0.OooO00o(oooOOO, OooO00o.OooO0o0("hideToYallaChat4CompleteYallaChat"), o0oo00oOooO0o1, true);
            }
        }
        return Unit.INSTANCE;
    }
}
