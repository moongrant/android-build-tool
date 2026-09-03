package p669oO0Oo;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.code.android.uikit.svga.SVGAView;
import com.opensource.svgaplayer.OooO0OO;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OO0O0.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOOo extends Lambda implements Function1<Context, SVGAView> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f60572OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f60573OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<OooOO0> f60574OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOOo(Context context, MutableState<OooOO0> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.f60572OooO0Oo = context;
        this.f60574OooO0o0 = mutableState;
        this.f60573OooO0o = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SVGAView invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        Context context2 = this.f60572OooO0Oo;
        SVGAView sVGAView = new SVGAView(context2, null, 6, 0);
        OooOO0 value = this.f60574OooO0o0.getValue();
        Intrinsics.checkNotNull(value);
        o00OOOO0 o00oooo1 = new o00OOOO0(this.f60573OooO0o);
        try {
            new OooO0OO(context2).OooO00o("svga/room_member_upgrade_to_ten.svga", new o0oOO(value, sVGAView, o00oooo1));
        } catch (Exception unused) {
        }
        return sVGAView;
    }
}
