package p536o0o0Oo0o;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.runtime.State;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OOo0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f55160OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ State<String> f55161OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OOo0o(Context context, State<String> state) {
        super(0);
        this.f55160OooO0Oo = context;
        this.f55161OooO0o0 = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("105101");
        Object systemService = this.f55160OooO0Oo.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Yalla", this.f55161OooO0o0.getValue()));
        o000O00O.OooO0O0(o0000.OooO0OO(oO00OOo0.UserInfo_Clip_cpoied));
        return Unit.INSTANCE;
    }
}
