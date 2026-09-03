package p388o0OOooo0;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.bumptech.glide.OooO0OO;
import com.bumptech.glide.OooO0o;
import kotlin.jvm.internal.Intrinsics;
import o00O.OooOO0O;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0O.o000oOoO;
import p362o0OOo0O.OooO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000OO extends o000oOoO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f44381OooO0Oo;

    public o00000OO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44381OooO0Oo = context;
    }

    @Override // p145o00Oo0O.Oooo0
    public final void run() {
        Context context = this.f44381OooO0Oo;
        OooO.OooO00o().getClass();
        OooO0o oooO0o = new OooO0o();
        oooO0o.f9858OooO = new OooOO0O(262144000, "GlideCache", context);
        GeneratedAppGlideModule generatedAppGlideModuleOooO0OO = OooO0OO.OooO0OO(context);
        synchronized (OooO0OO.class) {
            if (OooO0OO.f9848OooOO0o != null) {
                OooO0OO.OooO0o();
            }
            OooO0OO.OooO0o0(context, oooO0o, generatedAppGlideModuleOooO0OO);
        }
    }
}
