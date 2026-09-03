package p524o0o0O0oO;

import android.content.Intent;
import android.view.View;
import com.yalla.yalla.ui.activity.main.ChangeRegionActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p391o0OOooOo.o0O00000;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0oO0Ooo extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o0O0000O f43095Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0Ooo(o0O0000O o0o0000o2) {
        super(1);
        this.f43095Oooo0o = o0o0000o2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        this.f43095Oooo0o.f43023OooO0o0.f49535OooO0OO.OooO0OO(false);
        o0O00000.OooO0OO("Me_language");
        ChangeRegionActivity.OooO00o oooO00o = ChangeRegionActivity.f21932OooooOo;
        MainActivity context = this.f43095Oooo0o.f43021OooO0Oo;
        Intrinsics.checkNotNullParameter(context, "context");
        context.startActivity(new Intent(context, (Class<?>) ChangeRegionActivity.class));
        OooOo.OooO0O0("105021");
        return Unit.INSTANCE;
    }
}
