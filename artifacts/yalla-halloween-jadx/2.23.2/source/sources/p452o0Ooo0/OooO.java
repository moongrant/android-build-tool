package p452o0Ooo0;

import android.app.Activity;
import android.content.Context;
import com.yalla.yalla.ui.activity.moment.MomentSendActivity;
import com.yalla.yalla.util.permission.OooO00o;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f47562OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f47563OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f47564OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f47565OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f47566OooO0oo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Boolean f47561OooO = null;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Boolean f47567OooOO0 = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO(long j, long j2, MomentSendActivity momentSendActivity, boolean z, boolean z2) {
        super(0);
        this.f47562OooO0Oo = momentSendActivity;
        this.f47564OooO0o0 = z;
        this.f47563OooO0o = z2;
        this.f47565OooO0oO = j;
        this.f47566OooO0oo = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.f47562OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        OooO00o.OooO0OO((Activity) context, PermissionGroupReveal.f32341OooO0oO, null, new OooO0o(this.f47565OooO0oO, this.f47566OooO0oo, this.f47562OooO0Oo, this.f47561OooO, this.f47567OooOO0, this.f47564OooO0o0, this.f47563OooO0o));
        return Unit.INSTANCE;
    }
}
