package p532o0o0OOo0;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.code.android.util.o000O00;
import com.code.android.util.o000O00O;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
public final class o000O0o extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f53488OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(String str) {
        super(0);
        this.f53488OooO0Oo = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((ClipboardManager) o000O00O.f13421OooO00o.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(o000O00O.f13421OooO00o.getPackageName(), this.f53488OooO0Oo));
        o000O00.OooO00o(o000000.network_test_copied);
        return Unit.INSTANCE;
    }
}
