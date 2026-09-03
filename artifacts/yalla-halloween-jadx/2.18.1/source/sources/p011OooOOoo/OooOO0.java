package p011OooOOoo;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends OooO<String[], Map<String, Boolean>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f198OooO00o = new OooO00o();

    public static final class OooO00o {
        @NotNull
        public final Intent OooO00o(@NotNull String[] input) {
            Intrinsics.checkNotNullParameter(input, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", input);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }
    }

    @Override // p011OooOOoo.OooO
    public final Intent createIntent(Context context, String[] strArr) {
        String[] input = strArr;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return f198OooO00o.OooO00o(input);
    }

    @Override // p011OooOOoo.OooO
    public final OooO.OooO00o<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
        String[] input = strArr;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        boolean z = true;
        if (input.length == 0) {
            return new OooO.OooO00o<>(MapsKt.emptyMap());
        }
        for (String str : input) {
            if (!(o000O000.OooO00o.OooO00o(context, str) == 0)) {
                z = false;
                break;
            }
        }
        if (!z) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(input.length), 16));
        for (String str2 : input) {
            Pair pair = TuplesKt.to(str2, Boolean.TRUE);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return new OooO.OooO00o<>(linkedHashMap);
    }

    @Override // p011OooOOoo.OooO
    public final Map<String, Boolean> parseResult(int i, Intent intent) {
        if (i != -1) {
            return MapsKt.emptyMap();
        }
        if (intent == null) {
            return MapsKt.emptyMap();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return MapsKt.emptyMap();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            arrayList.add(Boolean.valueOf(i2 == 0));
        }
        return MapsKt.toMap(CollectionsKt.zip(ArraysKt.filterNotNull(stringArrayExtra), arrayList));
    }
}
