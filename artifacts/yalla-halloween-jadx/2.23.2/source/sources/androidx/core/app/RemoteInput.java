package androidx.core.app;

import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class RemoteInput {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface EditChoicesBeforeSending {
    }

    @RequiresApi(29)
    public static class OooO00o {
        @DoNotInline
        public static int OooO00o(Object obj) {
            return ((android.app.RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @DoNotInline
        public static android.app.RemoteInput.Builder OooO0O0(android.app.RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Source {
    }

    @RequiresApi(20)
    public static android.app.RemoteInput OooO00o(RemoteInput remoteInput) {
        remoteInput.getClass();
        android.app.RemoteInput.Builder builderAddExtras = new android.app.RemoteInput.Builder(null).setLabel(null).setChoices(null).setAllowFreeFormInput(false).addExtras(null);
        if (Build.VERSION.SDK_INT >= 29) {
            OooO00o.OooO0O0(builderAddExtras, 0);
        }
        return builderAddExtras.build();
    }
}
