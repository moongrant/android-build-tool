package o000O00;

import android.net.Uri;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Uri f34408OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f34409OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f34410OooO0OO;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public o0O0O00(@Nullable String str, @Nullable Uri uri, @Nullable String str2) {
        this.f34408OooO00o = uri;
        this.f34409OooO0O0 = str;
        this.f34410OooO0OO = str2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
        Uri uri = this.f34408OooO00o;
        if (uri != null) {
            sb.append(" uri=");
            sb.append(String.valueOf(uri));
        }
        String str = this.f34409OooO0O0;
        if (str != null) {
            sb.append(" action=");
            sb.append(str);
        }
        String str2 = this.f34410OooO0OO;
        if (str2 != null) {
            sb.append(" mimetype=");
            sb.append(str2);
        }
        sb.append(" }");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }
}
