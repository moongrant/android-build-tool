package androidx.navigation.compose;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.Navigator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import o000O00.o00000O;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes.dex */
public final class Oooo0 extends Lambda implements Function2<SaverScope, o00000O, Bundle> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Oooo0 f7041OooO0Oo = new Oooo0();

    public Oooo0() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Bundle invoke(SaverScope saverScope, o00000O o00000o) {
        Bundle bundle;
        o00000O o00000o2 = o00000o;
        o00000o2.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : MapsKt.toMap(o00000o2.f6867OooOo0o.f6916OooO00o).entrySet()) {
            ((Navigator) entry.getValue()).getClass();
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        ArrayDeque<NavBackStackEntry> arrayDeque = o00000o2.f6851OooO0oO;
        if (!arrayDeque.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[arrayDeque.size()];
            Iterator<NavBackStackEntry> it = arrayDeque.iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new NavBackStackEntryState(it.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = o00000o2.f6856OooOOO;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i2 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int iIntValue = ((Number) entry2.getKey()).intValue();
                String str = (String) entry2.getValue();
                iArr[i2] = iIntValue;
                arrayList2.add(str);
                i2++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = o00000o2.f6858OooOOOO;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                ArrayDeque arrayDeque2 = (ArrayDeque) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[arrayDeque2.size()];
                int i3 = 0;
                for (Object obj : arrayDeque2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    parcelableArr2[i3] = (NavBackStackEntryState) obj;
                    i3 = i4;
                }
                bundle.putParcelableArray(o00O00OO.OooO00o("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (o00000o2.f6849OooO0o) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", o00000o2.f6849OooO0o);
        }
        return bundle;
    }
}
