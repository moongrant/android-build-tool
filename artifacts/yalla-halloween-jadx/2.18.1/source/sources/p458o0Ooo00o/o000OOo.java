package p458o0Ooo00o;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Vector;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206o00o0o0o.o000O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo extends AsyncTask<Uri, Integer, o000O0o.OooO00o[]> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f40408OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final Function1<o000O0o.OooO00o[], Unit> f40409OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public o000OOo(@NotNull Context context, @Nullable Function1<? super o000O0o.OooO00o[], Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40408OooO00o = context;
        this.f40409OooO0O0 = function1;
    }

    @Override // android.os.AsyncTask
    public final o000O0o.OooO00o[] doInBackground(Uri[] uriArr) {
        Vector<o000O0o.OooO00o> vector;
        Uri[] params = uriArr;
        Intrinsics.checkNotNullParameter(params, "params");
        if (params.length == 0) {
            return null;
        }
        Context context = this.f40408OooO00o;
        Uri uri = params[0];
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            o000O0o o000o0o2 = new o000O0o();
            if (o000o0o2.OooO0OO(inputStreamOpenInputStream) != 0 || (vector = o000o0o2.f33290Oooo00o) == null) {
                return null;
            }
            Intrinsics.checkNotNull(vector);
            Object[] array = vector.toArray(new o000O0o.OooO00o[0]);
            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (o000O0o.OooO00o[]) array;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(o000O0o.OooO00o[] oooO00oArr) {
        o000O0o.OooO00o[] oooO00oArr2 = oooO00oArr;
        super.onPostExecute(oooO00oArr2);
        Function1<o000O0o.OooO00o[], Unit> function1 = this.f40409OooO0O0;
        if (function1 != null) {
            function1.invoke(oooO00oArr2);
        }
    }
}
