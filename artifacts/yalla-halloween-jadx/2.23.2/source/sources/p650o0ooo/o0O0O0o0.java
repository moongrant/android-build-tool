package p650o0ooo;

import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p405o0Oo0OOO.g;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0o0 extends Lambda implements Function0<g> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f58646OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0OO0 f58647OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(MixedRoomActivity mixedRoomActivity, o0O0OO0 o0o0oo0) {
        super(0);
        this.f58646OooO0Oo = mixedRoomActivity;
        this.f58647OooO0o0 = o0o0oo0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final g invoke() {
        g gVarInflate = g.inflate(LayoutInflater.from(this.f58646OooO0Oo), this.f58647OooO0o0.f58508OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(gVarInflate, "inflate(...)");
        return gVarInflate;
    }
}
