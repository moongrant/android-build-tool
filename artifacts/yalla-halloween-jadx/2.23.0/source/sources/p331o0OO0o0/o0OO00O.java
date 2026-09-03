package p331o0OO0o0;

import androidx.activity.result.OooO00o;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0OO00O implements OooO00o, BaseQuickAdapter.OooOO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Fragment f43189OooO0Oo;

    public /* synthetic */ o0OO00O(Fragment fragment) {
        this.f43189OooO0Oo = fragment;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOO0
    public final void OooO00o() {
        MainRoomPopularFragment.initView$lambda$3$lambda$2((MainRoomPopularFragment) this.f43189OooO0Oo);
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        o000OOo this$0 = (o000OOo) this.f43189OooO0Oo;
        Map grantResults = (Map) obj;
        int i = o000OOo.f43179OooOO0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(grantResults, "grantResults");
        if (this$0.OooO0O0()) {
            o000000 o000000Var = this$0.f43181OooO0Oo;
            o000000 o000000Var2 = null;
            o0Oo0oo o0oo0oo2 = null;
            if (o000000Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var = null;
            }
            o000000Var.f43175OooO0oO.clear();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : grantResults.entrySet()) {
                String str = (String) entry.getKey();
                if (((Boolean) entry.getValue()).booleanValue()) {
                    o000000 o000000Var3 = this$0.f43181OooO0Oo;
                    if (o000000Var3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        o000000Var3 = null;
                    }
                    o000000Var3.f43175OooO0oO.add(str);
                    o000000 o000000Var4 = this$0.f43181OooO0Oo;
                    if (o000000Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        o000000Var4 = null;
                    }
                    o000000Var4.f43176OooO0oo.remove(str);
                    o000000 o000000Var5 = this$0.f43181OooO0Oo;
                    if (o000000Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        o000000Var5 = null;
                    }
                    o000000Var5.f43168OooO.remove(str);
                } else if (this$0.shouldShowRequestPermissionRationale(str)) {
                    arrayList.add(str);
                    o000000 o000000Var6 = this$0.f43181OooO0Oo;
                    if (o000000Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        o000000Var6 = null;
                    }
                    o000000Var6.f43176OooO0oo.add(str);
                } else {
                    arrayList2.add(str);
                    o000000 o000000Var7 = this$0.f43181OooO0Oo;
                    if (o000000Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        o000000Var7 = null;
                    }
                    o000000Var7.f43168OooO.add(str);
                    o000000 o000000Var8 = this$0.f43181OooO0Oo;
                    if (o000000Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        o000000Var8 = null;
                    }
                    o000000Var8.f43176OooO0oo.remove(str);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            o000000 o000000Var9 = this$0.f43181OooO0Oo;
            if (o000000Var9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var9 = null;
            }
            arrayList3.addAll(o000000Var9.f43176OooO0oo);
            o000000 o000000Var10 = this$0.f43181OooO0Oo;
            if (o000000Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var10 = null;
            }
            arrayList3.addAll(o000000Var10.f43168OooO);
            Iterator it = arrayList3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (ContextCompat.OooO00o(this$0.getContext(), str2) == 0) {
                    o000000 o000000Var11 = this$0.f43181OooO0Oo;
                    if (o000000Var11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        o000000Var11 = null;
                    }
                    o000000Var11.f43176OooO0oo.remove(str2);
                    o000000 o000000Var12 = this$0.f43181OooO0Oo;
                    if (o000000Var12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("pb");
                        o000000Var12 = null;
                    }
                    o000000Var12.f43175OooO0oO.add(str2);
                }
            }
            o000000 o000000Var13 = this$0.f43181OooO0Oo;
            if (o000000Var13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var13 = null;
            }
            int size = o000000Var13.f43175OooO0oO.size();
            o000000 o000000Var14 = this$0.f43181OooO0Oo;
            if (o000000Var14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var14 = null;
            }
            if (size == o000000Var14.f43172OooO0Oo.size()) {
                o0Oo0oo o0oo0oo3 = this$0.f43183OooO0o0;
                if (o0oo0oo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0oo2 = o0oo0oo3;
                }
                o0oo0oo2.finish();
                return;
            }
            o000000 o000000Var15 = this$0.f43181OooO0Oo;
            if (o000000Var15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var15 = null;
            }
            o000000Var15.getClass();
            o000000 o000000Var16 = this$0.f43181OooO0Oo;
            if (o000000Var16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var16 = null;
            }
            o000000Var16.getClass();
            o000000 o000000Var17 = this$0.f43181OooO0Oo;
            if (o000000Var17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var17 = null;
            }
            o000000Var17.getClass();
            o0Oo0oo o0oo0oo4 = this$0.f43183OooO0o0;
            if (o0oo0oo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("task");
                o0oo0oo4 = null;
            }
            o0oo0oo4.finish();
            o000000 o000000Var18 = this$0.f43181OooO0Oo;
            if (o000000Var18 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
            } else {
                o000000Var2 = o000000Var18;
            }
            o000000Var2.getClass();
        }
    }
}
