package p396o0Oo00o0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00Oo0 extends p191o00o0O0.o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43634OooO0Oo;

    public o00Oo0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43634OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        try {
            ProviderInstaller.installIfNeeded(this.f43634OooO0Oo);
        } catch (GooglePlayServicesNotAvailableException e) {
            e.printStackTrace();
        } catch (GooglePlayServicesRepairableException e2) {
            e2.printStackTrace();
        }
    }
}
