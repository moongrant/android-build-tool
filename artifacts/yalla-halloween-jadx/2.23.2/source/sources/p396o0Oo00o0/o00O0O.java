package p396o0Oo00o0;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p191o00o0O0.o00Oo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O0O extends o00Oo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Context f43633OooO0Oo;

    public o00O0O(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f43633OooO0Oo = context;
    }

    @Override // p191o00o0O0.o00O0O
    public final void run() {
        Context context = this.f43633OooO0Oo;
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("SP_NAME_GEET_CODE", 0);
        if (TextUtils.isEmpty(sharedPreferences.getString("GEET_CODE_KEY", ""))) {
            sharedPreferences.edit().putString("GEET_CODE_KEY", "c51624a844d1aae54d3099a2f726e9c3").commit();
        }
    }
}
