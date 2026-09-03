package p539o0o0Oo00;

import android.util.Log;
import com.code.android.util.ToastUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p028Oooo0o0.o00O0O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f44124Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(String str) {
        super(0);
        this.f44124Oooo0o = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        StringBuilder sbOooO00o = o00O0O0O.OooO00o('\n');
        sbOooO00o.append(this.f44124Oooo0o);
        sbOooO00o.append("\n\n");
        Log.e("CrashReport", sbOooO00o.toString());
        ToastUtil.f12567OooO00o.OooO0O0("log success");
        return Unit.INSTANCE;
    }
}
