package OooO00o.OooO00o.OooO00o.OooO00o.OooOOO0.o00Ooo;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p604o0oo0OO.o00000;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO extends Lambda implements Function0<CharSequence> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f55OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0OO(Context context) {
        super(0);
        this.f55OooO0Oo = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CharSequence invoke() {
        String string = this.f55OooO0Oo.getString(o00000.base_platform_link_no_app_open);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.base_platform_link_no_app_open)");
        return string;
    }
}
