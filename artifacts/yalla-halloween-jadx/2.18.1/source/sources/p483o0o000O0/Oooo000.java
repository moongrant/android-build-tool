package p483o0o000O0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p252o00ooO0.o000000O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class Oooo000 extends o000000O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Context f40876OooO0OO;

    public Oooo000(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40876OooO0OO = context;
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        try {
            ProviderInstaller.installIfNeeded(this.f40876OooO0OO);
        } catch (GooglePlayServicesNotAvailableException e) {
            e.printStackTrace();
        } catch (GooglePlayServicesRepairableException e2) {
            e2.printStackTrace();
        }
    }
}
