package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0000 extends ContextWrapper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f5310OooO00o = new Object();

    public static Context OooO00o(@NonNull Context context) {
        if (!(context instanceof o0000) && !(context.getResources() instanceof o0000oo)) {
            context.getResources();
            int i = o000O00.f5375OooO00o;
        }
        return context;
    }
}
