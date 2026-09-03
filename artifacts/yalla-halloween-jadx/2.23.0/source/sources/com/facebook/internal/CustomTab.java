package com.facebook.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.AutoHandleExceptions;
import com.facebook.login.CustomTabPrefetchHelper;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p019OooOooO.o000000;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003R\u001a\u0010\u0007\u001a\u00020\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/facebook/internal/CustomTab;", "", NativeProtocol.WEB_DIALOG_ACTION, "", "parameters", "Landroid/os/Bundle;", "(Ljava/lang/String;Landroid/os/Bundle;)V", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "openCustomTab", "", "activity", "Landroid/app/Activity;", RemoteConfigConstants$RequestFieldKey.PACKAGE_NAME, "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
@AutoHandleExceptions
public class CustomTab {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private Uri uri;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0017¨\u0006\t"}, d2 = {"Lcom/facebook/internal/CustomTab$Companion;", "", "()V", "getURIForAction", "Landroid/net/Uri;", NativeProtocol.WEB_DIALOG_ACTION, "", "parameters", "Landroid/os/Bundle;", "facebook-common_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public Uri getURIForAction(@NotNull String action, @Nullable Bundle parameters) {
            Intrinsics.checkNotNullParameter(action, "action");
            Utility utility = Utility.INSTANCE;
            return Utility.buildUri(ServerProtocol.getDialogAuthority(), FacebookSdk.getGraphApiVersion() + "/dialog/" + action, parameters);
        }
    }

    public CustomTab(@NotNull String action, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.uri = INSTANCE.getURIForAction(action, bundle == null ? new Bundle() : bundle);
    }

    @JvmStatic
    @NotNull
    public static Uri getURIForAction(@NotNull String str, @Nullable Bundle bundle) {
        return INSTANCE.getURIForAction(str, bundle);
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }

    public final boolean openCustomTab(@NotNull Activity activity, @Nullable String packageName) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        o000000 preparedSessionOnce = CustomTabPrefetchHelper.INSTANCE.getPreparedSessionOnce();
        Intent intent = new Intent("android.intent.action.VIEW");
        if (preparedSessionOnce != null) {
            intent.setPackage(preparedSessionOnce.f392OooO0OO.getPackageName());
        }
        Bundle bundle = new Bundle();
        o00000O.OooOOO0.OooO0O0(bundle, "android.support.customtabs.extra.SESSION", preparedSessionOnce == null ? null : preparedSessionOnce.f391OooO0O0.asBinder());
        intent.putExtras(bundle);
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        intent.setPackage(packageName);
        try {
            intent.setData(this.uri);
            Object obj = ContextCompat.f5271OooO00o;
            ContextCompat.OooO00o.OooO0O0(activity, intent, null);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public final void setUri(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "<set-?>");
        this.uri = uri;
    }
}
