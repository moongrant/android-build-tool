package o0OOO0O;

import android.text.TextUtils;
import com.ss.ugc.android.alpha_player.model.ScaleType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public String f42754OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public String f42755OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public String f42756OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public ScaleType f42757OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public ScaleType f42758OooO0o0;

    public final boolean OooO00o() {
        String str = this.f42755OooO0O0;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("portPath");
        }
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.f42756OooO0OO;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("landPath");
            }
            if (!TextUtils.isEmpty(str2) && this.f42757OooO0Oo != null && this.f42758OooO0o0 != null) {
                return true;
            }
        }
        return false;
    }
}
