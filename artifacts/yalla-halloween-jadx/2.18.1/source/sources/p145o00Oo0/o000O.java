package p145o00Oo0;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.Intrinsics;
import o00O0O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Immutable
public abstract class o000O extends o0Oo0oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Shader f32080OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f32081OooO0OO;

    public o000O() {
        OooOo00.OooO00o oooO00o = OooOo00.f30416OooO0O0;
        this.f32081OooO0OO = OooOo00.f30418OooO0Oo;
    }

    @Override // p145o00Oo0.o0Oo0oo
    public final void OooO00o(long j, @NotNull o000 p, float f) {
        Intrinsics.checkNotNullParameter(p, "p");
        Shader shaderOooO0O0 = this.f32080OooO0O0;
        if (shaderOooO0O0 == null || !OooOo00.OooO00o(this.f32081OooO0OO, j)) {
            shaderOooO0O0 = OooO0O0(j);
            this.f32080OooO0O0 = shaderOooO0O0;
            this.f32081OooO0OO = j;
        }
        long jOooO00o = p.OooO00o();
        o00000O0.OooO00o oooO00o = o00000O0.f32063OooO0O0;
        long j2 = o00000O0.f32064OooO0OO;
        if (!o00000O0.OooO0Oo(jOooO00o, j2)) {
            p.OooOO0(j2);
        }
        if (!Intrinsics.areEqual(p.OooO0oO(), shaderOooO0O0)) {
            p.OooO0o(shaderOooO0O0);
        }
        if (p.OooOOOO() == f) {
            return;
        }
        p.OooO0O0(f);
    }

    @NotNull
    public abstract Shader OooO0O0(long j);
}
