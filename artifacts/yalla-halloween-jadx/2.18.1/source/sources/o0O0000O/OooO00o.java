package o0O0000O;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends o0O00000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f35036OooO00o;

    public OooO00o(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35036OooO00o = context;
    }

    @Override // o0O00000.OooO00o
    public final void OooO00o(@NotNull o0O00.OooO00o model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Context context = this.f35036OooO00o;
        boolean z = false;
        try {
            if (Settings.Secure.getInt(context.getApplicationContext().getContentResolver(), "accessibility_enabled") == 1) {
                String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "enabled_accessibility_services");
                if (!(string == null || StringsKt.isBlank(string))) {
                    TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(':');
                    simpleStringSplitter.setString(string);
                    String pkgName = context.getPackageName();
                    while (simpleStringSplitter.hasNext()) {
                        String temp = simpleStringSplitter.next();
                        Intrinsics.checkNotNullExpressionValue(temp, "temp");
                        Intrinsics.checkNotNullExpressionValue(pkgName, "pkgName");
                        if (StringsKt__StringsKt.contains$default(temp, pkgName, false, 2, (Object) null)) {
                            z = true;
                            break;
                        }
                    }
                }
            }
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
        }
        model.f35031OooOOOO = z;
    }
}
