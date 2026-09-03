package OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003OooO0o0.o00Oo0;
import p003OooO0o0.o0O0O00;
import p609o0oo0OOO.j5;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f53OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(o0O0O00 o0o0o00) {
        super(1);
        this.f53OooO0Oo = o0o0o00;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String setJumpOutsideHandler = str;
        Intrinsics.checkNotNullParameter(setJumpOutsideHandler, "$this$setJumpOutsideHandler");
        o0O0O00 o0o0o00 = this.f53OooO0Oo;
        o0o0o00.getClass();
        o00Oo0 o00oo1 = o0o0o00.f137OooO0O0;
        try {
            Intent uri = Intent.parseUri(setJumpOutsideHandler, 1);
            uri.addCategory("android.intent.category.BROWSABLE");
            uri.setComponent(null);
            uri.setSelector(null);
            o00oo1.OooO0o0().startActivityIfNeeded(uri, -1);
        } catch (Exception e) {
            e.printStackTrace();
            FragmentActivity fragmentActivityOooO0o0 = o00oo1.OooO0o0();
            j5.OooO00o(fragmentActivityOooO0o0, new OooOOOO(fragmentActivityOooO0o0));
        }
        return Unit.INSTANCE;
    }
}
