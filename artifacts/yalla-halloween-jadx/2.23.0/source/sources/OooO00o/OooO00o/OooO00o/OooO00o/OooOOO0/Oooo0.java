package OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003OooO0o0.o000OOo;
import p003OooO0o0.o00Oo0;
import p605o0oo0OO0.o000OOo0;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OOo f53OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(o000OOo o000ooo2) {
        super(1);
        this.f53OooO0Oo = o000ooo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String setJumpOutsideHandler = str;
        Intrinsics.checkNotNullParameter(setJumpOutsideHandler, "$this$setJumpOutsideHandler");
        o000OOo o000ooo2 = this.f53OooO0Oo;
        o000ooo2.getClass();
        o00Oo0 o00oo1 = o000ooo2.f126OooO0O0;
        try {
            Intent uri = Intent.parseUri(setJumpOutsideHandler, 1);
            uri.addCategory("android.intent.category.BROWSABLE");
            uri.setComponent(null);
            uri.setSelector(null);
            o00oo1.OooO0o0().startActivityIfNeeded(uri, -1);
        } catch (Exception e) {
            e.printStackTrace();
            FragmentActivity fragmentActivityOooO0o0 = o00oo1.OooO0o0();
            o000OOo0.OooO00o(fragmentActivityOooO0o0, new OooOOOO(fragmentActivityOooO0o0));
        }
        return Unit.INSTANCE;
    }
}
