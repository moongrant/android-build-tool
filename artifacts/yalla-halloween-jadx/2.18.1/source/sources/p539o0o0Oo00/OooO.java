package p539o0o0Oo00;

import android.content.ClipData;
import android.content.ClipboardManager;
import com.code.android.util.ToastUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p254o00ooO0O.o00O000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ String f44115Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(String str) {
        super(0);
        this.f44115Oooo0o = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((ClipboardManager) o00O000.f34347OooO0O0.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(o00O000.f34347OooO0O0.getPackageName(), this.f44115Oooo0o));
        ToastUtil.f12567OooO00o.OooO0O0("copy success");
        return Unit.INSTANCE;
    }
}
