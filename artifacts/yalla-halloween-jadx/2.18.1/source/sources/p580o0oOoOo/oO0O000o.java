package p580o0oOoOo;

import android.content.Context;
import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o0O00OO;
import p405o0Oo0OO0.OooOO0;
import p405o0Oo0OO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0O000o extends Lambda implements Function1<Context, SVGAView> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Context f46564Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<OooOO0> f46565Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f46566Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O000o(Context context, o0O00OO<OooOO0> o0o00oo2, o0O00OO<Boolean> o0o00oo3) {
        super(1);
        this.f46564Oooo0o = context;
        this.f46565Oooo0oO = o0o00oo2;
        this.f46566Oooo0oo = o0o00oo3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final SVGAView invoke(Context context) {
        Context it = context;
        Intrinsics.checkNotNullParameter(it, "it");
        SVGAView sVGAView = new SVGAView(this.f46564Oooo0o, null, 0, 6, null);
        Context context2 = this.f46564Oooo0o;
        OooOO0 value = this.f46565Oooo0oO.getValue();
        Intrinsics.checkNotNull(value);
        oO0O000 oo0o000 = new oO0O000(this.f46566Oooo0oo);
        try {
            new OooOo00(context2).OooO0oO("svga/room_member_upgrade_to_ten.svga", new oO0O00O(value, sVGAView, oo0o000));
        } catch (Exception unused) {
        }
        return sVGAView;
    }
}
