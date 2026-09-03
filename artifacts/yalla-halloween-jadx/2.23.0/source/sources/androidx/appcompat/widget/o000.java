package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o000 extends ContextWrapper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f3193OooO00o = new Object();

    public static void OooO00o(@NonNull Context context) {
        if ((context instanceof o000) || (context.getResources() instanceof o000O0o)) {
            return;
        }
        context.getResources();
        int i = o00O0000.f3334OooO00o;
    }
}
