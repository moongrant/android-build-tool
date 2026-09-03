package p011OooOOoo;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;
import o000O000.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends OooO<String, Boolean> {
    @Override // p011OooOOoo.OooO
    public final Intent createIntent(Context context, String str) {
        String input = str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        String[] input2 = {input};
        Intrinsics.checkNotNullParameter(input2, "input");
        Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input2);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return intentPutExtra;
    }

    @Override // p011OooOOoo.OooO
    public final OooO.OooO00o<Boolean> getSynchronousResult(Context context, String str) {
        String input = str;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        if (OooO00o.OooO00o(context, input) == 0) {
            return new OooO.OooO00o<>(Boolean.TRUE);
        }
        return null;
    }

    @Override // p011OooOOoo.OooO
    public final Boolean parseResult(int i, Intent intent) {
        boolean z;
        if (intent == null || i != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z2 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                if (intArrayExtra[i2] == 0) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
