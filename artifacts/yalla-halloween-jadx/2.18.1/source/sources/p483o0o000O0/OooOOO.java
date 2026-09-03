package p483o0o000O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.support.cloudfilemanager.CloudFileConfig;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import p252o00ooO0.o000000O;
import p487o0o000oO.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO extends o000000O {
    @Override // p252o00ooO0.o000000O
    @NotNull
    public final List<Class<? extends o000000O>> OooO00o() {
        return CollectionsKt.listOf(OooOO0O.class);
    }

    @Override // p252o00ooO0.o000000O
    public final boolean OooO0O0() {
        return true;
    }

    @Override // p252o00ooO0.o000000O
    public final void OooO0OO() {
        CloudFileConfig cloudFileConfig = CloudFileConfig.INSTANCE;
        StringBuilder sb = new StringBuilder();
        o00oO0o o00oo0o2 = o00oO0o.f40931OooO00o;
        sb.append(o00oO0o.f40934OooO0Oo);
        sb.append('/');
        cloudFileConfig.setFileHost(sb.toString());
    }
}
