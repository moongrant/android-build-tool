package p435o0OoOOOo;

import android.app.Activity;
import com.yalla.yalla.ui.activity.main.StartActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f47014OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f47015OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000O(Activity activity, boolean z) {
        super(0);
        this.f47014OooO0Oo = z;
        this.f47015OooO0o0 = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0O000.f47006OooO0O0 = false;
        if (this.f47014OooO0Oo) {
            int i = StartActivity.f25081OooO0o0;
            StartActivity.OooO00o.OooO0O0(this.f47015OooO0o0);
        }
        return Unit.INSTANCE;
    }
}
