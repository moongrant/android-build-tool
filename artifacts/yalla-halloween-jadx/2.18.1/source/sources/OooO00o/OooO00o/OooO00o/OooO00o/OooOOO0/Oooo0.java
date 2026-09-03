package OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003OooO0Oo.oo000o;
import p625o0oo0oo.o000O;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo000o f28Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(oo000o oo000oVar) {
        super(1);
        this.f28Oooo0o = oo000oVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String setJumpOutsideHandler = str;
        Intrinsics.checkNotNullParameter(setJumpOutsideHandler, "$this$setJumpOutsideHandler");
        oo000o oo000oVar = this.f28Oooo0o;
        Objects.requireNonNull(oo000oVar);
        try {
            Intent uri = Intent.parseUri(setJumpOutsideHandler, 1);
            uri.addCategory("android.intent.category.BROWSABLE");
            uri.setComponent(null);
            uri.setSelector(null);
            oo000oVar.f124OooO0O0.OooO0o0().startActivityIfNeeded(uri, -1);
        } catch (Exception e) {
            e.printStackTrace();
            FragmentActivity fragmentActivityOooO0o0 = oo000oVar.f124OooO0O0.OooO0o0();
            o000O.OooO00o(fragmentActivityOooO0o0, new OooOOOO(fragmentActivityOooO0o0));
        }
        return Unit.INSTANCE;
    }
}
