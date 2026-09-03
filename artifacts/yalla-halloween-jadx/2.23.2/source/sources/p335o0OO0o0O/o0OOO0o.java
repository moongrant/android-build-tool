package p335o0OO0o0O;

import androidx.activity.result.OooO00o;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o0OO0oO0.OooOOO0;
import p338o0OO0oOo.Oooo000;
import p650o0ooo.j;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OOO0o implements OooO00o, Oooo000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Fragment f42483OooO0Oo;

    public /* synthetic */ o0OOO0o(Fragment fragment) {
        this.f42483OooO0Oo = fragment;
    }

    @Override // p338o0OO0oOo.Oooo000
    public final void OooO00o(OooOOO0 it) {
        j this$0 = (j) this.f42483OooO0Oo;
        int i = j.f58287OooOo0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.OooOO0O(false);
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        o0OO00O this$0 = (o0OO00O) this.f42483OooO0Oo;
        Map grantResults = (Map) obj;
        int i = o0OO00O.f42474OooOO0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(grantResults, "grantResults");
        if (this$0.OooO0O0()) {
            oo0o0Oo oo0o0oo = this$0.f42476OooO0Oo;
            oo0o0Oo oo0o0oo2 = null;
            o0ooOOo o0ooooo = null;
            if (oo0o0oo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo = null;
            }
            oo0o0oo.f42492OooO0oO.clear();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : grantResults.entrySet()) {
                String str = (String) entry.getKey();
                if (((Boolean) entry.getValue()).booleanValue()) {
                    oo0o0Oo oo0o0oo3 = this$0.f42476OooO0Oo;
                    if (oo0o0oo3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo0o0oo3 = null;
                    }
                    oo0o0oo3.f42492OooO0oO.add(str);
                    oo0o0Oo oo0o0oo4 = this$0.f42476OooO0Oo;
                    if (oo0o0oo4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo0o0oo4 = null;
                    }
                    oo0o0oo4.f42493OooO0oo.remove(str);
                    oo0o0Oo oo0o0oo5 = this$0.f42476OooO0Oo;
                    if (oo0o0oo5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo0o0oo5 = null;
                    }
                    oo0o0oo5.f42485OooO.remove(str);
                } else if (this$0.shouldShowRequestPermissionRationale(str)) {
                    arrayList.add(str);
                    oo0o0Oo oo0o0oo6 = this$0.f42476OooO0Oo;
                    if (oo0o0oo6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo0o0oo6 = null;
                    }
                    oo0o0oo6.f42493OooO0oo.add(str);
                } else {
                    arrayList2.add(str);
                    oo0o0Oo oo0o0oo7 = this$0.f42476OooO0Oo;
                    if (oo0o0oo7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo0o0oo7 = null;
                    }
                    oo0o0oo7.f42485OooO.add(str);
                    oo0o0Oo oo0o0oo8 = this$0.f42476OooO0Oo;
                    if (oo0o0oo8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo0o0oo8 = null;
                    }
                    oo0o0oo8.f42493OooO0oo.remove(str);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            oo0o0Oo oo0o0oo9 = this$0.f42476OooO0Oo;
            if (oo0o0oo9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo9 = null;
            }
            arrayList3.addAll(oo0o0oo9.f42493OooO0oo);
            oo0o0Oo oo0o0oo10 = this$0.f42476OooO0Oo;
            if (oo0o0oo10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo10 = null;
            }
            arrayList3.addAll(oo0o0oo10.f42485OooO);
            Iterator it = arrayList3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (ContextCompat.OooO00o(this$0.getContext(), str2) == 0) {
                    oo0o0Oo oo0o0oo11 = this$0.f42476OooO0Oo;
                    if (oo0o0oo11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo0o0oo11 = null;
                    }
                    oo0o0oo11.f42493OooO0oo.remove(str2);
                    oo0o0Oo oo0o0oo12 = this$0.f42476OooO0Oo;
                    if (oo0o0oo12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        oo0o0oo12 = null;
                    }
                    oo0o0oo12.f42492OooO0oO.add(str2);
                }
            }
            oo0o0Oo oo0o0oo13 = this$0.f42476OooO0Oo;
            if (oo0o0oo13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo13 = null;
            }
            int size = oo0o0oo13.f42492OooO0oO.size();
            oo0o0Oo oo0o0oo14 = this$0.f42476OooO0Oo;
            if (oo0o0oo14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo14 = null;
            }
            if (size == oo0o0oo14.f42489OooO0Oo.size()) {
                o0ooOOo o0ooooo2 = this$0.f42478OooO0o0;
                if (o0ooooo2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0ooooo = o0ooooo2;
                }
                o0ooooo.finish();
                return;
            }
            oo0o0Oo oo0o0oo15 = this$0.f42476OooO0Oo;
            if (oo0o0oo15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo15 = null;
            }
            oo0o0oo15.getClass();
            oo0o0Oo oo0o0oo16 = this$0.f42476OooO0Oo;
            if (oo0o0oo16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo16 = null;
            }
            oo0o0oo16.getClass();
            oo0o0Oo oo0o0oo17 = this$0.f42476OooO0Oo;
            if (oo0o0oo17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                oo0o0oo17 = null;
            }
            oo0o0oo17.getClass();
            o0ooOOo o0ooooo3 = this$0.f42478OooO0o0;
            if (o0ooooo3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("task");
                o0ooooo3 = null;
            }
            o0ooooo3.finish();
            oo0o0Oo oo0o0oo18 = this$0.f42476OooO0Oo;
            if (oo0o0oo18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                oo0o0oo2 = oo0o0oo18;
            }
            oo0o0oo2.getClass();
        }
    }
}
