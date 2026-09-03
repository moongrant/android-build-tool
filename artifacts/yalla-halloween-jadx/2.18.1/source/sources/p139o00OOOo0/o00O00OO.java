package p139o00OOOo0;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00OO extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O00o0 f31827Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(o00O00o0 o00o00o1) {
        super(0);
        this.f31827Oooo0o = o00o00o1;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        o00O00o0 o00o00o1 = this.f31827Oooo0o;
        Activity activity = o00o00o1.f31828OooO00o;
        Objects.requireNonNull(o00o00o1);
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                Intent intent = new Intent();
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
                activity.startActivity(intent);
            } else {
                activity.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Objects.requireNonNull(this.f31827Oooo0o);
        return null;
    }
}
