package p011OooOo0;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends OooOO0<Intent, ActivityResult> {
    @Override // p011OooOo0.OooOO0
    public final Intent createIntent(Context context, Intent intent) {
        Intent input = intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return input;
    }

    @Override // p011OooOo0.OooOO0
    public final ActivityResult parseResult(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
