package p452o0Ooo00O;

import android.app.Activity;
import android.content.Context;
import com.yalla.yalla.util.permission.OooO00o;
import com.yalla.yalla.util.permission.PermissionGroupReveal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class OooOOOO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f46454OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ boolean f46455OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ boolean f46456OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f46457OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f46458OooO0oo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ Boolean f46453OooO = null;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ Boolean f46459OooOO0 = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(long j, long j2, Activity activity, boolean z, boolean z2) {
        super(0);
        this.f46454OooO0Oo = activity;
        this.f46456OooO0o0 = z;
        this.f46455OooO0o = z2;
        this.f46457OooO0oO = j;
        this.f46458OooO0oo = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Context context = this.f46454OooO0Oo;
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type android.app.Activity");
        OooO00o.OooO0OO((Activity) context, PermissionGroupReveal.f32885OooO0oO, null, new OooOOO(this.f46457OooO0oO, this.f46458OooO0oo, this.f46454OooO0Oo, this.f46453OooO, this.f46459OooOO0, this.f46456OooO0o0, this.f46455OooO0o));
        return Unit.INSTANCE;
    }
}
