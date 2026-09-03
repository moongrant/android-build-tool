package p196o00o0Oo;

import androidx.activity.result.OooO00o;
import com.yalla.yalla.data.db.model.ApiErrorCodeDB;
import com.yalla.yalla.ui.activity.main.PrivacyActivity;
import kotlin.jvm.internal.Intrinsics;
import p157o00OoOO0.o0OO00O;
import p198o00o0OoO.o00;
import p199o00o0Ooo.o00OOOO0;
import p331o0OO0o0.o000000;
import p331o0OO0o0.o000OOo;
import p331o0OO0o0.o0Oo0oo;
import p385o0OOooOO.o00O00O;
import p486o0o00O00.o00O00o0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O00O implements o00OOOO0.OooO00o, OooO00o, o00O00O.OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f38997OooO0Oo;

    public /* synthetic */ o000O00O(Object obj) {
        this.f38997OooO0Oo = obj;
    }

    @Override // o0OOooOO.o00O00O.OooO0O0
    public final void OooO00o(ApiErrorCodeDB apiErrorCodeDB) {
        PrivacyActivity this$0 = (PrivacyActivity) this.f38997OooO0Oo;
        int i = PrivacyActivity.f25458OooOoO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.isDestroyed() || this$0.isFinishing()) {
            return;
        }
        o0OO00O o0oo00o2 = new o0OO00O(this$0);
        String messge = apiErrorCodeDB.getMessge();
        Intrinsics.checkNotNullExpressionValue(messge, "apiErrorCodeDB.messge");
        o0oo00o2.OooOo00(messge);
        o0oo00o2.OooO0o(false);
        o0oo00o2.OooOO0(new o00O00o0(this$0));
        o0oo00o2.OooOO0o();
    }

    @Override // o00o0Ooo.o00OOOO0.OooO00o
    public final Object OooO0OO() {
        return Integer.valueOf(((o00) this.f38997OooO0Oo).OooOO0());
    }

    @Override // androidx.activity.result.OooO00o
    public final void onActivityResult(Object obj) {
        o000OOo this$0 = (o000OOo) this.f38997OooO0Oo;
        Boolean granted = (Boolean) obj;
        int i = o000OOo.f43179OooOO0o;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(granted, "granted");
        boolean zBooleanValue = granted.booleanValue();
        if (this$0.OooO0O0()) {
            o0Oo0oo o0oo0oo2 = null;
            if (zBooleanValue) {
                o000000 o000000Var = this$0.f43181OooO0Oo;
                if (o000000Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pb");
                    o000000Var = null;
                }
                o000000Var.f43175OooO0oO.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                o000000 o000000Var2 = this$0.f43181OooO0Oo;
                if (o000000Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pb");
                    o000000Var2 = null;
                }
                o000000Var2.f43176OooO0oo.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                o000000 o000000Var3 = this$0.f43181OooO0Oo;
                if (o000000Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("pb");
                    o000000Var3 = null;
                }
                o000000Var3.f43168OooO.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                o0Oo0oo o0oo0oo3 = this$0.f43183OooO0o0;
                if (o0oo0oo3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("task");
                } else {
                    o0oo0oo2 = o0oo0oo3;
                }
                o0oo0oo2.finish();
                return;
            }
            this$0.shouldShowRequestPermissionRationale("android.permission.ACCESS_BACKGROUND_LOCATION");
            o000000 o000000Var4 = this$0.f43181OooO0Oo;
            if (o000000Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var4 = null;
            }
            o000000Var4.getClass();
            o000000 o000000Var5 = this$0.f43181OooO0Oo;
            if (o000000Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var5 = null;
            }
            o000000Var5.getClass();
            o000000 o000000Var6 = this$0.f43181OooO0Oo;
            if (o000000Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pb");
                o000000Var6 = null;
            }
            o000000Var6.getClass();
            o0Oo0oo o0oo0oo4 = this$0.f43183OooO0o0;
            if (o0oo0oo4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("task");
            } else {
                o0oo0oo2 = o0oo0oo4;
            }
            o0oo0oo2.finish();
        }
    }
}
