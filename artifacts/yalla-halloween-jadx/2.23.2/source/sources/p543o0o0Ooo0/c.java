package p543o0o0Ooo0;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.runtime.State;
import com.code.android.util.o0000;
import com.code.android.util.o000O00;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f55371OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ State<String> f55372OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, State<String> state) {
        super(0);
        this.f55371OooO0Oo = context;
        this.f55372OooO0o0 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("105101");
        Object systemService = this.f55371OooO0Oo.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Yalla", this.f55372OooO0o0.getValue()));
        o000O00.OooO0O0(o0000.OooO0OO(o000000.UserInfo_Clip_cpoied));
        return Unit.INSTANCE;
    }
}
