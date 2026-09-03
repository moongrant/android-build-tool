package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavBackStackEntryState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import o000O00.o00000O;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nNavHostController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostController.kt\nandroidx/navigation/compose/NavHostControllerKt$NavControllerSaver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
public final class o000oOoO extends Lambda implements Function1<Bundle, o00000O> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f7045OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000oOoO(Context context) {
        super(1);
        this.f7045OooO0Oo = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final o00000O invoke(Bundle bundle) {
        Bundle bundle2 = bundle;
        o00000O o00000oOooO00o = o00O0O.OooO00o(this.f7045OooO0Oo);
        if (bundle2 != null) {
            bundle2.setClassLoader(o00000oOooO00o.f6845OooO00o.getClassLoader());
            o00000oOooO00o.f6848OooO0Oo = bundle2.getBundle("android-support-nav:controller:navigatorState");
            o00000oOooO00o.f6850OooO0o0 = bundle2.getParcelableArray("android-support-nav:controller:backStack");
            LinkedHashMap linkedHashMap = o00000oOooO00o.f6858OooOOOO;
            linkedHashMap.clear();
            int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
            if (intArray != null && stringArrayList != null) {
                int length = intArray.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    o00000oOooO00o.f6856OooOOO.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                    i++;
                    i2++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String id : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle2.getParcelableArray("android-support-nav:controller:backStackStates:" + id);
                    if (parcelableArray != null) {
                        Intrinsics.checkNotNullExpressionValue(id, "id");
                        ArrayDeque arrayDeque = new ArrayDeque(parcelableArray.length);
                        Iterator it = ArrayIteratorKt.iterator(parcelableArray);
                        while (it.hasNext()) {
                            Parcelable parcelable = (Parcelable) it.next();
                            Intrinsics.checkNotNull(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            arrayDeque.add((NavBackStackEntryState) parcelable);
                        }
                        linkedHashMap.put(id, arrayDeque);
                    }
                }
            }
            o00000oOooO00o.f6849OooO0o = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        return o00000oOooO00o;
    }
}
