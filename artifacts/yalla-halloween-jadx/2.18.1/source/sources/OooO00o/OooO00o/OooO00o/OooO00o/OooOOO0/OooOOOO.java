package OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p627o0oo0ooO.oO0O0Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends Lambda implements Function0<CharSequence> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f25Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(FragmentActivity fragmentActivity) {
        super(0);
        this.f25Oooo0o = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CharSequence invoke() {
        String string = this.f25Oooo0o.getString(oO0O0Oo0.base_platform_link_no_app_open);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.base_platform_link_no_app_open)");
        return string;
    }
}
