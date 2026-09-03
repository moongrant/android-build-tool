package p003OooO0o0;

import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import kotlin.jvm.internal.Intrinsics;
import p011OooOo0.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0O extends OooOO0<Intent, Pair<Integer, Intent>> {
    @Override // p011OooOo0.OooOO0
    public final Intent createIntent(Context context, Intent intent) {
        Intent input = intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // p011OooOo0.OooOO0
    public final Pair<Integer, Intent> parseResult(int i, Intent intent) {
        return Pair.create(Integer.valueOf(i), intent);
    }
}
