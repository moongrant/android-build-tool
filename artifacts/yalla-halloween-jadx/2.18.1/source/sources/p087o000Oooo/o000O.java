package p087o000Oooo;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.Navigator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p016OooOoO0.OooOo00;
import p045OooooOo.o00OO00O;
import p086o000OooO.o000000;

/* JADX INFO: loaded from: classes.dex */
public final class o000O extends Lambda implements Function2<o00OO00O, o000000, Bundle> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final o000O f28558Oooo0o = new o000O();

    public o000O() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, kotlin.collections.ArrayDeque<androidx.navigation.NavBackStackEntryState>>] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Integer, java.lang.String>] */
    @Override // kotlin.jvm.functions.Function2
    public final Bundle invoke(o00OO00O o00oo00o, o000000 o000000Var) {
        Bundle bundle;
        o00OO00O Saver = o00oo00o;
        o000000 it = o000000Var;
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        Intrinsics.checkNotNullParameter(it, "it");
        Objects.requireNonNull(it);
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : MapsKt.toMap(it.f28473OooOo0O.f28407OooO00o).entrySet()) {
            Objects.requireNonNull((Navigator) entry.getValue());
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!it.f28458OooO0oO.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[it.f28458OooO0oO.size()];
            Iterator<NavBackStackEntry> it2 = it.f28458OooO0oO.iterator();
            int i = 0;
            while (it2.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState(it2.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!it.f28462OooOO0o.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[it.f28462OooOO0o.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i2 = 0;
            for (Map.Entry entry2 : it.f28462OooOO0o.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str = (String) entry2.getValue();
                iArr[i2] = iIntValue;
                arrayList2.add(str);
                i2++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!it.f28464OooOOO0.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : it.f28464OooOOO0.entrySet()) {
                String str2 = (String) entry3.getKey();
                ArrayDeque arrayDeque = (ArrayDeque) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[arrayDeque.size()];
                int i3 = 0;
                for (Object obj : arrayDeque) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    parcelableArr2[i3] = (NavBackStackEntryState) obj;
                    i3 = i4;
                }
                bundle.putParcelableArray(OooOo00.OooO0Oo("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (it.f28456OooO0o) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", it.f28456OooO0o);
        }
        return bundle;
    }
}
