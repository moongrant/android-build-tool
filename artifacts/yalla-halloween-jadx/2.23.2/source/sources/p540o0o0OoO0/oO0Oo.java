package p540o0o0OoO0;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.code.android.uikit.svga.SVGAView;
import com.opensource.svgaplayer.OooO0OO;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OO0O0O.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo extends Lambda implements Function1<Context, SVGAView> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f54983OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f54984OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<OooOO0> f54985OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0Oo(Context context, MutableState<OooOO0> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.f54983OooO0Oo = context;
        this.f54985OooO0o0 = mutableState;
        this.f54984OooO0o = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SVGAView invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        Context context2 = this.f54983OooO0Oo;
        SVGAView sVGAView = new SVGAView(context2, null, 6, 0);
        OooOO0 value = this.f54985OooO0o0.getValue();
        Intrinsics.checkNotNull(value);
        o0o0000 o0o0000Var = new o0o0000(this.f54984OooO0o);
        try {
            new OooO0OO(context2).OooO00o("svga/room_member_upgrade_to_ten.svga", new ooo0Oo0(value, sVGAView, o0o0000Var));
        } catch (Exception unused) {
        }
        return sVGAView;
    }
}
