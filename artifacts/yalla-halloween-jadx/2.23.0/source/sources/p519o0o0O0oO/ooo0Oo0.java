package p519o0o0O0oO;

import android.view.LayoutInflater;
import androidx.fragment.app.FragmentActivity;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p641o0ooOOOO.t7;

/* JADX INFO: loaded from: classes4.dex */
public final class ooo0Oo0 extends Lambda implements Function0<t7> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f53036OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o f53037OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0Oo0(MixedRoomActivity mixedRoomActivity, o oVar) {
        super(0);
        this.f53036OooO0Oo = mixedRoomActivity;
        this.f53037OooO0o0 = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final t7 invoke() {
        t7 t7VarInflate = t7.inflate(LayoutInflater.from(this.f53036OooO0Oo), this.f53037OooO0o0.f52533OooO0o, true);
        Intrinsics.checkNotNullExpressionValue(t7VarInflate, "inflate(LayoutInflater.f…xt), getRootView(), true)");
        return t7VarInflate;
    }
}
