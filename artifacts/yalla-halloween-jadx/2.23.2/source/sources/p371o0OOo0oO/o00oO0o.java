package p371o0OOo0oO;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00oO0o f43168OooO00o = new o00oO0o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final String f43169OooO0O0 = "keyboard.common";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final String f43170OooO0OO = "sp.key.keyboard.height";

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public static volatile SharedPreferences f43171OooO0Oo;

    public static int OooO00o(int i, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferencesOooO0O0 = OooO0O0(context);
        Intrinsics.checkNotNull(sharedPreferencesOooO0O0);
        return sharedPreferencesOooO0O0.getInt(f43170OooO0OO, i);
    }

    public static SharedPreferences OooO0O0(Context context) {
        if (f43171OooO0Oo == null) {
            synchronized (o00oO0o.class) {
                if (f43171OooO0Oo == null) {
                    f43171OooO0Oo = context.getSharedPreferences(f43169OooO0O0, 0);
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        return f43171OooO0Oo;
    }
}
