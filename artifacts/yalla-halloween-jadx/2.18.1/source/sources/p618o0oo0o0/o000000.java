package p618o0oo0o0;

import android.app.Activity;
import com.weieyu.yalla.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p139o00OOOo0.o00O00OO;
import p139o00OOOo0.o00O00o0;
import p139o00OOOo0.oOO00O;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000000 extends Lambda implements Function1<List<? extends String>, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Activity f48586Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo.OooO00o f48587Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Boolean, Unit> f48588Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o000000(Activity activity, oo0o0Oo.OooO00o oooO00o, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.f48586Oooo0o = activity;
        this.f48587Oooo0oO = oooO00o;
        this.f48588Oooo0oo = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends String> list) {
        List<? extends String> onDenied = list;
        Intrinsics.checkNotNullParameter(onDenied, "$this$onDenied");
        o00O00o0 o00o00o1 = new o00O00o0(this.f48586Oooo0o);
        String title = o000O0O0.OooO0OO(this.f48587Oooo0oO.f48614OooO0Oo);
        String message = o000O0O0.OooO0OO(this.f48587Oooo0oO.f48615OooO0o0);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        if (!o00o00o1.f31828OooO00o.isFinishing() && !o00o00o1.f31828OooO00o.isDestroyed()) {
            oo0oOO0 oo0ooo0 = (oo0oOO0) o00o00o1.f31829OooO0O0.getValue();
            if (o00O0.OooO0o0(title)) {
                oo0ooo0.OooOooO(title);
            }
            if (o00O0.OooO0o0(message)) {
                oo0ooo0.OooOo0O(message);
            }
            oo0ooo0.OooOo(new oOO00O(o00o00o1));
            oo0ooo0.OooOOo0(o000O0O0.OooO0OO(R.string.Settings));
            oo0ooo0.OooOo0o(new o00O00OO(o00o00o1));
            ((oo0oOO0) o00o00o1.f31829OooO0O0.getValue()).OooOOO0();
        }
        Function1<Boolean, Unit> function1 = this.f48588Oooo0oo;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
