package p498o0o00Oo0;

import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import kotlin.jvm.internal.Intrinsics;
import p205o00o0o0o.o000O;
import p373o0OOo0oO.o00oO0o;
import p565o0oOo000.o000OOo;
import p675oO0Oo.l0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000Ooo implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49727OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49728OooO0o0;

    public /* synthetic */ o0000Ooo(Object obj, int i) {
        this.f49727OooO0Oo = i;
        this.f49728OooO0o0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        o00oO0o o00oo0oOooO0O0;
        int i = this.f49727OooO0Oo;
        Object obj2 = this.f49728OooO0o0;
        switch (i) {
            case 0:
                o0OO00O messageInputState = (o0OO00O) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(messageInputState, "$messageInputState");
                if (zBooleanValue && (o00oo0oOooO0O0 = messageInputState.OooO0O0()) != null) {
                    o00oo0oOooO0O0.OooO00o();
                    break;
                }
                break;
            default:
                l0 this$0 = (l0) obj2;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (!zBooleanValue2) {
                    o000O o000o = new o000O(this$0.f59572OooO0Oo);
                    o000o.OooOo00(o0000.OooO0OO(o000OOo.room_dialog_guess_start_failed_content));
                    o000o.OooOo0(new l0.OooO0O0(this$0));
                    o000o.OooOO0o();
                } else {
                    this$0.f59327OooOoo0 = 0L;
                    this$0.OooO0O0();
                }
                break;
        }
    }
}
