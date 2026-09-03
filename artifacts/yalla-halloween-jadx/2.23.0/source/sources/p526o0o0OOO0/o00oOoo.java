package p526o0o0OOO0;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00O;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f53613OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(String str) {
        super(0);
        this.f53613OooO0Oo = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((ClipboardManager) o000O0.f10354OooO00o.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(o000O0.f10354OooO00o.getPackageName(), this.f53613OooO0Oo));
        o000O00O.OooO00o(oO00OOo0.network_test_copied);
        return Unit.INSTANCE;
    }
}
