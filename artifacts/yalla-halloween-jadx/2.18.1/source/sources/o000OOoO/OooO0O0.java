package o000OOoO;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.emoji2.text.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends Editable.Factory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f28294OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("INSTANCE_LOCK")
    public static volatile OooO0O0 f28295OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public static Class<?> f28296OooO0OO;

    @SuppressLint({"PrivateApi"})
    public OooO0O0() {
        try {
            f28296OooO0OO = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, OooO0O0.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = f28296OooO0OO;
        return cls != null ? new Oooo000(cls, charSequence) : super.newEditable(charSequence);
    }
}
