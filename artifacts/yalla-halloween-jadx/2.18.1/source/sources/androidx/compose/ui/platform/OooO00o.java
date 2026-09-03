package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public abstract class OooO00o implements OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f6283OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final int[] f6284OooO0O0 = new int[2];

    @Nullable
    public final int[] OooO0OO(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.f6284OooO0O0;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    @NotNull
    public final String OooO0Oo() {
        String str = this.f6283OooO00o;
        if (str != null) {
            return str;
        }
        Intrinsics.throwUninitializedPropertyAccessException(ViewHierarchyConstants.TEXT_KEY);
        return null;
    }

    public void OooO0o0(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(text, "<set-?>");
        this.f6283OooO00o = text;
    }
}
