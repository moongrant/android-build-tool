package p497o0o00OoO;

import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import kotlin.jvm.internal.Intrinsics;
import o0ooo.oOOO0OO0.OooO0O0;
import p205o00o0o0o.o000O;
import p371o0OOo0oO.o0OoOo0;
import p371o0OOo0oO.oo000o;
import p562o0oOo000.o000000;
import p650o0ooo.oOOO0OO0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000Oo0 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49819OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49820OooO0o0;

    public /* synthetic */ o000Oo0(Object obj, int i) {
        this.f49819OooO0Oo = i;
        this.f49820OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f49819OooO0Oo;
        Object obj2 = this.f49820OooO0o0;
        switch (i) {
            case 0:
                o0000 messageInputState = (o0000) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(messageInputState, "$messageInputState");
                if (zBooleanValue) {
                    oo000o oo000oVarOooO0O0 = messageInputState.OooO0O0();
                    o0OoOo0 o0oooo1 = oo000oVarOooO0O0 != null ? oo000oVarOooO0O0.f43186OooO0o0 : null;
                    if (o0oooo1 != null) {
                        o0oooo1.f43174OooO0OO = !zBooleanValue;
                        break;
                    }
                }
                break;
            default:
                oOOO0OO0 this$0 = (oOOO0OO0) obj2;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!zBooleanValue2) {
                    o000O o000o = new o000O(this$0.f58507OooO0Oo);
                    o000o.OooOo00(o0000.OooO0OO(o000000.room_dialog_guess_start_failed_content));
                    o000o.OooOo0(this$0.new OooO0O0());
                    o000o.OooOO0o();
                } else {
                    this$0.f59008OooOoo0 = 0L;
                    this$0.OooO0O0();
                }
                break;
        }
    }
}
