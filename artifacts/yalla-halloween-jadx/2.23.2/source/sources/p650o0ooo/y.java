package p650o0ooo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class y extends Lambda implements Function0<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ z f59222OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar) {
        super(0);
        this.f59222OooO0Oo = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public final Object invoke() {
        z zVar = this.f59222OooO0Oo;
        Activity activity = zVar.f59243OooO00o;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        try {
            Intent intent = new Intent();
            intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
            activity.startActivity(intent);
        } catch (Exception e) {
            e.printStackTrace();
        }
        zVar.getClass();
        return null;
    }
}
