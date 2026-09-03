package p388o0OOooo0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000O extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44379OooO0Oo;

    public o00000O(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44379OooO0Oo = context;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        try {
            ProviderInstaller.installIfNeeded(this.f44379OooO0Oo);
        } catch (GooglePlayServicesNotAvailableException e) {
            e.printStackTrace();
        } catch (GooglePlayServicesRepairableException e2) {
            e2.printStackTrace();
        }
    }
}
