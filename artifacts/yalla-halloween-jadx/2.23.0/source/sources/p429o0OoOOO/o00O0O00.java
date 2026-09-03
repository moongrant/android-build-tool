package p429o0OoOOO;

import android.app.Activity;
import com.yalla.yalla.ui.activity.main.StartActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0O00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ boolean f45745OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Activity f45746OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O00(Activity activity, boolean z) {
        super(0);
        this.f45745OooO0Oo = z;
        this.f45746OooO0o0 = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o00O0.f45733OooO0O0 = false;
        if (this.f45745OooO0Oo) {
            int i = StartActivity.f25535OooO0o0;
            StartActivity.OooO00o.OooO0O0(this.f45746OooO0o0);
        }
        return Unit.INSTANCE;
    }
}
