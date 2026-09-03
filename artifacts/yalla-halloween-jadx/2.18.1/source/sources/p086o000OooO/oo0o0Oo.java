package p086o000OooO;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final Uri f28534OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f28535OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f28536OooO0OO;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public oo0o0Oo(@Nullable Uri uri) {
        this.f28534OooO00o = uri;
        this.f28535OooO0O0 = null;
        this.f28536OooO0OO = null;
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO00o = Oooo0.OooO00o("NavDeepLinkRequest", "{");
        if (this.f28534OooO00o != null) {
            sbOooO00o.append(" uri=");
            sbOooO00o.append(String.valueOf(this.f28534OooO00o));
        }
        if (this.f28535OooO0O0 != null) {
            sbOooO00o.append(" action=");
            sbOooO00o.append(this.f28535OooO0O0);
        }
        if (this.f28536OooO0OO != null) {
            sbOooO00o.append(" mimetype=");
            sbOooO00o.append(this.f28536OooO0OO);
        }
        sbOooO00o.append(" }");
        String string = sbOooO00o.toString();
        Intrinsics.checkNotNullExpressionValue(string, "sb.toString()");
        return string;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public oo0o0Oo(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Uri data = intent.getData();
        String action = intent.getAction();
        String type = intent.getType();
        this.f28534OooO00o = data;
        this.f28535OooO0O0 = action;
        this.f28536OooO0OO = type;
    }
}
