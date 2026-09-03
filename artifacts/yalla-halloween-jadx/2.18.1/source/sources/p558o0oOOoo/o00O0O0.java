package p558o0oOOoo;

import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p143o00OOooo.o0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O0OO0 f44702Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O0(o00O0OO0 o00o0oo1) {
        super(0);
        this.f44702Oooo0o = o00o0oo1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MutableLiveData<String> camelUrl = SharedUrlManager.INSTANCE.getCamelUrl();
        o00O0OO0 o00o0oo1 = this.f44702Oooo0o;
        camelUrl.observe(o00o0oo1.f44365OooO00o, new o0o0Oo(o00o0oo1, 4));
        return Unit.INSTANCE;
    }
}
