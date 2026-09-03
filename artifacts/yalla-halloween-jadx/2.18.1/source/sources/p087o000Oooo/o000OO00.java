package p087o000Oooo;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavBackStackEntryState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p086o000OooO.o000000;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO00 extends Lambda implements Function1<Bundle, o000000> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Context f28581Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(Context context) {
        super(1);
        this.f28581Oooo0o = context;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntryState>>] */
    @Override // kotlin.jvm.functions.Function1
    public final o000000 invoke(Bundle bundle) {
        Bundle it = bundle;
        Intrinsics.checkNotNullParameter(it, "it");
        o000000 o000000VarOooO00o = com.android.billingclient.api.o000000.OooO00o(this.f28581Oooo0o);
        if (it != null) {
            it.setClassLoader(o000000VarOooO00o.f28452OooO00o.getClassLoader());
            o000000VarOooO00o.f28455OooO0Oo = it.getBundle("android-support-nav:controller:navigatorState");
            o000000VarOooO00o.f28457OooO0o0 = it.getParcelableArray("android-support-nav:controller:backStack");
            o000000VarOooO00o.f28464OooOOO0.clear();
            int[] intArray = it.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = it.getStringArrayList("android-support-nav:controller:backStackIds");
            if (intArray != null && stringArrayList != null) {
                int length = intArray.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    o000000VarOooO00o.f28462OooOO0o.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                    i++;
                    i2++;
                }
            }
            ArrayList<String> stringArrayList2 = it.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String id : stringArrayList2) {
                    Parcelable[] parcelableArray = it.getParcelableArray("android-support-nav:controller:backStackStates:" + id);
                    if (parcelableArray != null) {
                        Map<String, ArrayDeque<NavBackStackEntryState>> map = o000000VarOooO00o.f28464OooOOO0;
                        Intrinsics.checkNotNullExpressionValue(id, "id");
                        ArrayDeque<NavBackStackEntryState> arrayDeque = new ArrayDeque<>(parcelableArray.length);
                        Iterator it2 = ArrayIteratorKt.iterator(parcelableArray);
                        while (it2.hasNext()) {
                            Parcelable parcelable = (Parcelable) it2.next();
                            Objects.requireNonNull(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            arrayDeque.add((NavBackStackEntryState) parcelable);
                        }
                        map.put(id, arrayDeque);
                    }
                }
            }
            o000000VarOooO00o.f28456OooO0o = it.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        return o000000VarOooO00o;
    }
}
