package o00000O;

import androidx.compose.ui.text.ExperimentalTextApi;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalTextApi
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Oooo0 f26883OooO00o;

    public o0OoOo0(@Nullable Oooo0 oooo0) {
        this.f26883OooO00o = oooo0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OoOo0)) {
            return false;
        }
        o0OoOo0 o0oooo1 = (o0OoOo0) obj;
        if (!Intrinsics.areEqual(this.f26883OooO00o, o0oooo1.f26883OooO00o)) {
            return false;
        }
        Objects.requireNonNull(o0oooo1);
        return Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        Oooo0 oooo0 = this.f26883OooO00o;
        return 0 + (oooo0 != null ? oooo0.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + ((Object) null) + ", paragraphSyle=" + this.f26883OooO00o + ')';
    }

    @Deprecated(message = "includeFontPadding was added to Android in order to prevent clipping issues on tall scripts. However that issue has been fixed since Android 28. Compose backports the fix for Android versions prior to Android 28. Therefore the original reason why includeFontPadding was needed is invalid on Compose.This configuration was added for migration of the apps in case some code or design was relying includeFontPadding=true behavior; and will be removed.")
    public o0OoOo0() {
        this.f26883OooO00o = new Oooo0(false);
    }
}
