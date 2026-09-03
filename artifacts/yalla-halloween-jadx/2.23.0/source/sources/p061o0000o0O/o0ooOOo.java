package p061o0000o0O;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo extends Editable.Factory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f34282OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("INSTANCE_LOCK")
    public static volatile o0ooOOo f34283OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static Class<?> f34284OooO0OO;

    @SuppressLint({"PrivateApi"})
    public o0ooOOo() {
        try {
            f34284OooO0OO = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, o0ooOOo.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = f34284OooO0OO;
        return cls != null ? new o00O0O(charSequence, cls) : super.newEditable(charSequence);
    }
}
